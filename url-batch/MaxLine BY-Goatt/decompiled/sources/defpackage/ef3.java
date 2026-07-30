package defpackage;

import android.content.Intent;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ef3 extends uf3 {
    public final /* synthetic */ int q;
    public final /* synthetic */ dg3 r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef3(dg3 dg3Var, Boolean bool) {
        super(dg3Var, true);
        this.q = 0;
        this.s = bool;
        Objects.requireNonNull(dg3Var);
        this.r = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        switch (this.q) {
            case 0:
                he3 he3Var = this.r.f;
                ll3.v(he3Var);
                he3Var.setMeasurementEnabled(((Boolean) this.s).booleanValue(), this.m);
                break;
            case 1:
                he3 he3Var2 = this.r.f;
                ll3.v(he3Var2);
                he3Var2.retrieveAndUploadBatches(new if3(this, (pn3) this.s));
                break;
            case 2:
                he3 he3Var3 = this.r.f;
                ll3.v(he3Var3);
                he3Var3.setEventInterceptor((vf3) this.s);
                break;
            default:
                he3 he3Var4 = this.r.f;
                ll3.v(he3Var4);
                he3Var4.setSgtmDebugInfo((Intent) this.s);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef3(dg3 dg3Var, Object obj, int i) {
        super(dg3Var, true);
        this.q = i;
        this.s = obj;
        this.r = dg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef3(dg3 dg3Var, vf3 vf3Var) {
        super(dg3Var, true);
        this.q = 2;
        this.s = vf3Var;
        Objects.requireNonNull(dg3Var);
        this.r = dg3Var;
    }
}
