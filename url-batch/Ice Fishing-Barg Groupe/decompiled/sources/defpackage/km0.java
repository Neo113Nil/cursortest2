package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class km0 extends jc2 implements pe0 {
    public final /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km0(Object obj, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = obj;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        String str;
        TextClassificationContext build;
        TextClassifier createTextClassificationSession;
        int i = this.x50lh2ztY7Y5;
        int i2 = 1;
        no2 no2Var = no2.PxuCJdSBwIXG;
        bt btVar = null;
        Object obj2 = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                hm0 hm0Var = (hm0) obj2;
                fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(hm0Var), null, new ew(hm0Var, btVar, 5), 3);
                return no2Var;
            case 1:
                ng0.tmVwIGCQF4zR(obj);
                ((ae0) ((d91) obj2).getValue()).PxuCJdSBwIXG();
                return no2Var;
            case 2:
                ng0.tmVwIGCQF4zR(obj);
                u51 u51Var = (u51) obj2;
                fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(u51Var), null, new t51(u51Var, btVar, i2), 3);
                return no2Var;
            case 3:
                ng0.tmVwIGCQF4zR(obj);
                cn1 cn1Var = (cn1) obj2;
                Context context = cn1Var.lS5Rgt96tfkO;
                f22 f22Var = cn1Var.TSizfFm2Yiuu;
                TextClassificationManager wdg6QnbFHrFF = hi.wdg6QnbFHrFF(context.getSystemService(hi.r3s1LDPKFs1S()));
                int ordinal = f22Var.ordinal();
                if (ordinal == 0) {
                    str = "edittext";
                } else {
                    if (ordinal != 1) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    str = "textview";
                }
                s92.RAsUl2FVSrh6();
                build = s92.TSizfFm2Yiuu(context.getPackageName(), str).build();
                createTextClassificationSession = wdg6QnbFHrFF.createTextClassificationSession(build);
                cn1Var.a92UlCVFR9N8 = createTextClassificationSession;
                return createTextClassificationSession;
            default:
                ng0.tmVwIGCQF4zR(obj);
                wr1 wr1Var = (wr1) obj2;
                fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(wr1Var), null, new vr1(wr1Var, btVar, i2), 3);
                return no2Var;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                return new km0((hm0) obj2, btVar, 0);
            case 1:
                return new km0((d91) obj2, btVar, 1);
            case 2:
                return new km0((u51) obj2, btVar, 2);
            case 3:
                return new km0((cn1) obj2, btVar, 3);
            default:
                return new km0((wr1) obj2, btVar, 4);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
            case 0:
                ((km0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                return no2Var;
            case 1:
                ((km0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                return no2Var;
            case 2:
                ((km0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                return no2Var;
            case 3:
                return ((km0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
            default:
                ((km0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                return no2Var;
        }
    }
}
