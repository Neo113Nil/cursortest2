package m6;

/* loaded from: classes.dex */
final class y0 implements j1 {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19366f;

    public y0(boolean z6) {
        this.f19366f = z6;
    }

    @Override // m6.j1
    public boolean b() {
        return this.f19366f;
    }

    @Override // m6.j1
    public z1 h() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
