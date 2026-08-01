package m0;

import i3.d;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2722a;

    /* renamed from: b, reason: collision with root package name */
    public int f2723b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2722a = new Object[i];
    }

    public Object a() {
        int i = this.f2723b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f2722a;
        Object obj = objArr[i4];
        d.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i4] = null;
        this.f2723b--;
        return obj;
    }

    public void b(t.b bVar) {
        int i = this.f2723b;
        Object[] objArr = this.f2722a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f2723b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z4;
        d.e(obj, "instance");
        int i = this.f2723b;
        int i4 = 0;
        while (true) {
            objArr = this.f2722a;
            if (i4 >= i) {
                z4 = false;
                break;
            }
            if (objArr[i4] == obj) {
                z4 = true;
                break;
            }
            i4++;
        }
        if (z4) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i5 = this.f2723b;
        if (i5 >= objArr.length) {
            return false;
        }
        objArr[i5] = obj;
        this.f2723b = i5 + 1;
        return true;
    }

    public b() {
        this.f2722a = new Object[256];
    }
}
