package s1;

/* loaded from: classes.dex */
public final class A implements I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4008a;

    public A(boolean z2) {
        this.f4008a = z2;
    }

    @Override // s1.I
    public final boolean a() {
        return this.f4008a;
    }

    @Override // s1.I
    public final V b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4008a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
