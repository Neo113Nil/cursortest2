package k2;

/* loaded from: classes.dex */
public final class I implements U {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5316d;

    public I(boolean z3) {
        this.f5316d = z3;
    }

    @Override // k2.U
    public final boolean b() {
        return this.f5316d;
    }

    @Override // k2.U
    public final h0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f5316d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
