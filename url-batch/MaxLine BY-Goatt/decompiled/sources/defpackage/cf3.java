package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cf3 extends uf3 {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ dg3 t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf3(dg3 dg3Var, String str, String str2, Bundle bundle) {
        super(dg3Var, true);
        this.r = str;
        this.s = str2;
        this.u = bundle;
        Objects.requireNonNull(dg3Var);
        this.t = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        switch (this.q) {
            case 0:
                he3 he3Var = this.t.f;
                ll3.v(he3Var);
                he3Var.clearConditionalUserProperty(this.r, this.s, (Bundle) this.u);
                break;
            case 1:
                he3 he3Var2 = this.t.f;
                ll3.v(he3Var2);
                he3Var2.getConditionalUserProperties(this.r, this.s, (ee3) this.u);
                break;
            default:
                he3 he3Var3 = this.t.f;
                ll3.v(he3Var3);
                he3Var3.setCurrentScreenByScionActivityInfo((ze3) this.u, this.r, this.s, this.m);
                break;
        }
    }

    @Override // defpackage.uf3
    public void b() {
        switch (this.q) {
            case 1:
                ((ee3) this.u).m(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf3(dg3 dg3Var, String str, String str2, ee3 ee3Var) {
        super(dg3Var, true);
        this.r = str;
        this.s = str2;
        this.u = ee3Var;
        Objects.requireNonNull(dg3Var);
        this.t = dg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf3(dg3 dg3Var, ze3 ze3Var, String str, String str2) {
        super(dg3Var, true);
        this.u = ze3Var;
        this.r = str;
        this.s = str2;
        Objects.requireNonNull(dg3Var);
        this.t = dg3Var;
    }
}
