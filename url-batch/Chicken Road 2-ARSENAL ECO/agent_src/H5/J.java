package H5;

/* loaded from: classes.dex */
public final class J implements U {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1033f;

    public J(boolean z5) {
        this.f1033f = z5;
    }

    @Override // H5.U
    public final boolean a() {
        return this.f1033f;
    }

    @Override // H5.U
    public final i0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1033f ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
