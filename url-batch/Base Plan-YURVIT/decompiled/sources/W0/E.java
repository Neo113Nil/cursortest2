package W0;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f908e;

    public E(boolean z2) {
        this.f908e = z2;
    }

    @Override // W0.L
    public final boolean a() {
        return this.f908e;
    }

    @Override // W0.L
    public final a0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f908e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
