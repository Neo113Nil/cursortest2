package j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2253a;

    /* renamed from: b, reason: collision with root package name */
    public int f2254b;

    public b(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2253a = new Object[i4];
    }

    public Object a() {
        int i4 = this.f2254b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f2253a;
        Object obj = objArr[i5];
        u2.c.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i5] = null;
        this.f2254b--;
        return obj;
    }

    public void b(q.b bVar) {
        int i4 = this.f2254b;
        Object[] objArr = this.f2253a;
        if (i4 < objArr.length) {
            objArr[i4] = bVar;
            this.f2254b = i4 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z3;
        u2.c.e(obj, "instance");
        int i4 = this.f2254b;
        int i5 = 0;
        while (true) {
            objArr = this.f2253a;
            if (i5 >= i4) {
                z3 = false;
                break;
            }
            if (objArr[i5] == obj) {
                z3 = true;
                break;
            }
            i5++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i6 = this.f2254b;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f2254b = i6 + 1;
        return true;
    }

    public b() {
        this.f2253a = new Object[256];
    }
}
