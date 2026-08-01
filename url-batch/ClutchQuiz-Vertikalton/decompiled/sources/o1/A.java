package o1;

/* loaded from: classes.dex */
public final class A implements I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3305a;

    public A(boolean z2) {
        this.f3305a = z2;
    }

    @Override // o1.I
    public final boolean a() {
        return this.f3305a;
    }

    @Override // o1.I
    public final V b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f3305a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
