package M0;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f619e;

    public E(boolean z2) {
        this.f619e = z2;
    }

    @Override // M0.L
    public final boolean b() {
        return this.f619e;
    }

    @Override // M0.L
    public final a0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f619e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
