package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jf3 extends uf3 {
    public final /* synthetic */ int q;
    public final /* synthetic */ ee3 r;
    public final /* synthetic */ dg3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf3(dg3 dg3Var, ee3 ee3Var, int i) {
        super(dg3Var, true);
        this.q = i;
        switch (i) {
            case 1:
                this.r = ee3Var;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                super(dg3Var, true);
                break;
            case 2:
                this.r = ee3Var;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                super(dg3Var, true);
                break;
            case 3:
                this.r = ee3Var;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                super(dg3Var, true);
                break;
            case 4:
                this.r = ee3Var;
                Objects.requireNonNull(dg3Var);
                this.s = dg3Var;
                super(dg3Var, true);
                break;
            default:
                this.r = ee3Var;
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
                he3Var.getGmpAppId(this.r);
                break;
            case 1:
                he3 he3Var2 = this.s.f;
                ll3.v(he3Var2);
                he3Var2.getCachedAppInstanceId(this.r);
                break;
            case 2:
                he3 he3Var3 = this.s.f;
                ll3.v(he3Var3);
                he3Var3.generateEventId(this.r);
                break;
            case 3:
                he3 he3Var4 = this.s.f;
                ll3.v(he3Var4);
                he3Var4.getCurrentScreenName(this.r);
                break;
            case 4:
                he3 he3Var5 = this.s.f;
                ll3.v(he3Var5);
                he3Var5.getCurrentScreenClass(this.r);
                break;
            case 5:
                he3 he3Var6 = this.s.f;
                ll3.v(he3Var6);
                he3Var6.getAppInstanceId(this.r);
                break;
            default:
                he3 he3Var7 = this.s.f;
                ll3.v(he3Var7);
                he3Var7.getSessionId(this.r);
                break;
        }
    }

    @Override // defpackage.uf3
    public final void b() {
        int i = this.q;
        ee3 ee3Var = this.r;
        switch (i) {
            case 0:
                ee3Var.m(null);
                break;
            case 1:
                ee3Var.m(null);
                break;
            case 2:
                ee3Var.m(null);
                break;
            case 3:
                ee3Var.m(null);
                break;
            case 4:
                ee3Var.m(null);
                break;
            case 5:
                ee3Var.m(null);
                break;
            default:
                ee3Var.m(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf3(dg3 dg3Var, ee3 ee3Var, int i, boolean z) {
        super(dg3Var, true);
        this.q = i;
        this.r = ee3Var;
        this.s = dg3Var;
    }
}
