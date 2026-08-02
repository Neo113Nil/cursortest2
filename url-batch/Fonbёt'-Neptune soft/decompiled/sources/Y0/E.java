package Y0;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1162e;

    public E(boolean z2) {
        this.f1162e = z2;
    }

    @Override // Y0.L
    public final boolean b() {
        return this.f1162e;
    }

    @Override // Y0.L
    public final a0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1162e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
