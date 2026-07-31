package q2;

/* loaded from: classes.dex */
public final class I implements U {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7855d;

    public I(boolean z3) {
        this.f7855d = z3;
    }

    @Override // q2.U
    public final boolean b() {
        return this.f7855d;
    }

    @Override // q2.U
    public final h0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f7855d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
