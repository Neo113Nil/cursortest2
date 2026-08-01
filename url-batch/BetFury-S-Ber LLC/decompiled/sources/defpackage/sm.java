package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sm implements wu {
    public final boolean f;

    public sm(boolean z) {
        this.f = z;
    }

    @Override // defpackage.wu
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.wu
    public final u30 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
