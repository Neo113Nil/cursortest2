package k0;

/* loaded from: classes.dex */
public final class A implements H {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f876b;

    public A(boolean z) {
        this.f876b = z;
    }

    @Override // k0.H
    public final boolean b() {
        return this.f876b;
    }

    @Override // k0.H
    public final U c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f876b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
