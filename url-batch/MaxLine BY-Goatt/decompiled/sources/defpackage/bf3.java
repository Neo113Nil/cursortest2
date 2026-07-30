package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bf3 extends uf3 {
    public final /* synthetic */ int q;
    public final /* synthetic */ Bundle r;
    public final /* synthetic */ dg3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf3(dg3 dg3Var, Bundle bundle, int i) {
        super(dg3Var, true);
        this.q = i;
        switch (i) {
            case 1:
                this.r = bundle;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                super(dg3Var, true);
                break;
            case 2:
                this.r = bundle;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                super(dg3Var, true);
                break;
            default:
                this.r = bundle;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                break;
        }
    }

    @Override // defpackage.uf3
    public final void a() {
        switch (this.q) {
            case 0:
                he3 he3Var = this.s.f;
                ll3.v(he3Var);
                he3Var.setConditionalUserProperty(this.r, this.m);
                break;
            case 1:
                he3 he3Var2 = this.s.f;
                ll3.v(he3Var2);
                he3Var2.setConsentThirdParty(this.r, this.m);
                break;
            default:
                he3 he3Var3 = this.s.f;
                ll3.v(he3Var3);
                he3Var3.setDefaultEventParameters(this.r);
                break;
        }
    }
}
