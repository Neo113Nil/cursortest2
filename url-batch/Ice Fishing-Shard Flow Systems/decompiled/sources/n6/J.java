package n6;

/* loaded from: classes.dex */
public final class J implements U {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7016d;

    public J(boolean z7) {
        this.f7016d = z7;
    }

    @Override // n6.U
    public final boolean a() {
        return this.f7016d;
    }

    @Override // n6.U
    public final h0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f7016d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
