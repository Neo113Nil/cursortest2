package k1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a0 implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f662b;

    public a0(boolean z2) {
        this.f662b = z2;
    }

    @Override // k1.g0
    public final r0 e() {
        return null;
    }

    @Override // k1.g0
    public final boolean f() {
        return this.f662b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f662b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
