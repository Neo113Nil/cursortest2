package defpackage;

import android.view.View;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n92 extends jc2 implements pe0 {
    public final /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n92(Object obj, Object obj2, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = obj;
        this.QrzZRwfaDlRX = obj2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        int i2 = 2;
        su suVar = su.rtx2ld2ELZv4;
        Object obj2 = this.QrzZRwfaDlRX;
        no2 no2Var = no2.PxuCJdSBwIXG;
        bt btVar = null;
        switch (i) {
            case 0:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    if (g7.TSizfFm2Yiuu((g7) ((uj) this.r3s1LDPKFs1S).TSizfFm2Yiuu, new Float(0.0f), (i8) obj2, null, this, 12) == suVar) {
                        return suVar;
                    }
                } else {
                    if (i3 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return no2Var;
            case 1:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    xs0 xs0Var = (xs0) this.r3s1LDPKFs1S;
                    this.cpQdD2nAriOS = 1;
                    if (xs0Var.nLZGh9p8gVSu(this) == suVar) {
                        return suVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ng0.tmVwIGCQF4zR(obj);
                            return no2Var;
                        }
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                this.cpQdD2nAriOS = 2;
                if (((up1) obj2).e9gEMXR7LXtO(this) == suVar) {
                    return suVar;
                }
                return no2Var;
            case 2:
                ae0 ae0Var = (ae0) obj2;
                int i5 = this.cpQdD2nAriOS;
                try {
                    if (i5 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        gm2 gm2Var = (gm2) this.r3s1LDPKFs1S;
                        this.cpQdD2nAriOS = 1;
                        obj = gm2.lS5Rgt96tfkO(gm2Var, this);
                        if (obj == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i5 != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    ae0Var.PxuCJdSBwIXG();
                    return no2Var;
                } catch (Throwable th) {
                    ae0Var.PxuCJdSBwIXG();
                    throw th;
                }
            case 3:
                int i6 = this.cpQdD2nAriOS;
                if (i6 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    Object obj3 = this.r3s1LDPKFs1S;
                    this.cpQdD2nAriOS = 1;
                    if (((w80) obj2).cpQdD2nAriOS(obj3, this) == suVar) {
                        return suVar;
                    }
                } else {
                    if (i6 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return no2Var;
            default:
                ht1 ht1Var = (ht1) this.r3s1LDPKFs1S;
                View view = (View) obj2;
                int i7 = this.cpQdD2nAriOS;
                try {
                    if (i7 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        this.cpQdD2nAriOS = 1;
                        Object S2OOm9zPNm0h = hq0.S2OOm9zPNm0h(ht1Var.S9EYkSpbGuxq, new et1(i2, btVar, 0), this);
                        if (S2OOm9zPNm0h != suVar) {
                            S2OOm9zPNm0h = no2Var;
                        }
                        if (S2OOm9zPNm0h == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i7 != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    if (qu2.PxuCJdSBwIXG(view) == ht1Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return no2Var;
                } finally {
                }
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.QrzZRwfaDlRX;
        switch (i) {
            case 0:
                return new n92((uj) this.r3s1LDPKFs1S, (i8) obj2, btVar, 0);
            case 1:
                return new n92((xs0) this.r3s1LDPKFs1S, (up1) obj2, btVar, 1);
            case 2:
                return new n92((gm2) this.r3s1LDPKFs1S, (ae0) obj2, btVar, 2);
            case 3:
                n92 n92Var = new n92((w80) obj2, btVar);
                n92Var.r3s1LDPKFs1S = obj;
                return n92Var;
            default:
                return new n92((ht1) this.r3s1LDPKFs1S, (View) obj2, btVar, 4);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((n92) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 1:
                return ((n92) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 2:
                return ((n92) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 3:
                return ((n92) gPXPFXrUH4XX((bt) obj2, obj)).RfyTYNmI9Srp(no2Var);
            default:
                return ((n92) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n92(w80 w80Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 3;
        this.QrzZRwfaDlRX = w80Var;
    }
}
