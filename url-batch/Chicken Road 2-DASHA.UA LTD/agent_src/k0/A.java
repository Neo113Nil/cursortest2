package k0;

/* loaded from: classes.dex */
public final class A implements H {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f823b;

    public A(boolean z2) {
        this.f823b = z2;
    }

    @Override // k0.H
    public final boolean b() {
        return this.f823b;
    }

    @Override // k0.H
    public final U c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f823b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
