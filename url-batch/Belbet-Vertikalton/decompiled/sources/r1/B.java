package r1;

/* loaded from: classes.dex */
public final class B implements J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4036a;

    public B(boolean z2) {
        this.f4036a = z2;
    }

    @Override // r1.J
    public final boolean a() {
        return this.f4036a;
    }

    @Override // r1.J
    public final W b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4036a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
