package m0;

import f3.d;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2682a;

    /* renamed from: b, reason: collision with root package name */
    public int f2683b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2682a = new Object[i];
    }

    public Object a() {
        int i = this.f2683b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f2682a;
        Object obj = objArr[i4];
        d.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i4] = null;
        this.f2683b--;
        return obj;
    }

    public void b(t.b bVar) {
        int i = this.f2683b;
        Object[] objArr = this.f2682a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f2683b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z3;
        d.e(obj, "instance");
        int i = this.f2683b;
        int i4 = 0;
        while (true) {
            objArr = this.f2682a;
            if (i4 >= i) {
                z3 = false;
                break;
            }
            if (objArr[i4] == obj) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i5 = this.f2683b;
        if (i5 >= objArr.length) {
            return false;
        }
        objArr[i5] = obj;
        this.f2683b = i5 + 1;
        return true;
    }

    public b() {
        this.f2682a = new Object[256];
    }
}
