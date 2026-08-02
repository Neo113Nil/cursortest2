package E1;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public boolean f310a;

    /* renamed from: b, reason: collision with root package name */
    public int f311b;

    /* renamed from: c, reason: collision with root package name */
    public Object f312c;

    /* renamed from: d, reason: collision with root package name */
    public Object f313d;

    public B a() {
        if (((M0.h) this.f312c) == null) {
            throw new IllegalArgumentException("execute parameter required");
        }
        K0.d[] dVarArr = (K0.d[]) this.f313d;
        boolean z = this.f310a;
        int i3 = this.f311b;
        B b3 = new B();
        b3.f313d = this;
        b3.f312c = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        b3.f310a = z2;
        b3.f311b = i3;
        return b3;
    }
}
