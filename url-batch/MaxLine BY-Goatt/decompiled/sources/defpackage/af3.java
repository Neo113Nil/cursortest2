package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class af3 extends uf3 {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ dg3 u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af3(dg3 dg3Var, String str, String str2, Object obj, boolean z) {
        super(dg3Var, true);
        this.r = str;
        this.s = str2;
        this.v = obj;
        this.t = z;
        Objects.requireNonNull(dg3Var);
        this.u = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        switch (this.q) {
            case 0:
                he3 he3Var = this.u.f;
                ll3.v(he3Var);
                he3Var.setUserProperty(this.r, this.s, new st1(this.v), this.t, this.m);
                break;
            default:
                he3 he3Var2 = this.u.f;
                ll3.v(he3Var2);
                he3Var2.getUserProperties(this.r, this.s, this.t, (ee3) this.v);
                break;
        }
    }

    @Override // defpackage.uf3
    public void b() {
        switch (this.q) {
            case 1:
                ((ee3) this.v).m(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af3(dg3 dg3Var, String str, String str2, boolean z, ee3 ee3Var) {
        super(dg3Var, true);
        this.r = str;
        this.s = str2;
        this.t = z;
        this.v = ee3Var;
        Objects.requireNonNull(dg3Var);
        this.u = dg3Var;
    }
}
