package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gq2 {
    public final jq2 a;
    public v91 b;
    public final fq2 c = new fq2(this, 2);
    public final fq2 d = new fq2(this, 0);
    public final fq2 e = new fq2(this, 1);

    public gq2(jq2 jq2Var) {
        this.a = jq2Var;
    }

    public final v91 a() {
        v91 v91Var = this.b;
        if (v91Var != null) {
            return v91Var;
        }
        lh.e("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
