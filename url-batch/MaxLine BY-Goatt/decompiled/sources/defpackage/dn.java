package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dn extends yj1 {
    public zl1 q;

    @Override // defpackage.yj1
    public final boolean r(u52 u52Var) {
        return u52Var == this.q.getKey();
    }

    @Override // defpackage.yj1
    public final Object v(u52 u52Var) {
        if (u52Var != this.q.getKey()) {
            h21.b("Check failed.");
        }
        return this.q.getValue();
    }
}
