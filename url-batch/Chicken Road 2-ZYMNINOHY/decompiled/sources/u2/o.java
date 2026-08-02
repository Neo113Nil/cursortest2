package u2;

import a0.C0148n;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final C0148n f15524d = new C0148n(2);

    /* renamed from: a, reason: collision with root package name */
    public final Object f15525a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile m f15526b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15527c;

    public o(m mVar) {
        this.f15526b = mVar;
    }

    @Override // u2.m
    public final Object get() {
        m mVar = this.f15526b;
        C0148n c0148n = f15524d;
        if (mVar != c0148n) {
            synchronized (this.f15525a) {
                try {
                    if (this.f15526b != c0148n) {
                        Object obj = this.f15526b.get();
                        this.f15527c = obj;
                        this.f15526b = c0148n;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f15527c;
    }

    public final String toString() {
        Object obj = this.f15526b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f15524d) {
            obj = "<supplier that returned " + this.f15527c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
