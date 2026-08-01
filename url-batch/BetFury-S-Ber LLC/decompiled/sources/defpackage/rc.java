package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rc implements AutoCloseable, ah {
    public final qg f;

    public rc(qg qgVar) {
        qgVar.getClass();
        this.f = qgVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        bi.m(this.f, null);
    }

    @Override // defpackage.ah
    public final qg i() {
        return this.f;
    }
}
