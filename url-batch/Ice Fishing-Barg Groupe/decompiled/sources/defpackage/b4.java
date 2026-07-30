package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b4 implements w80 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ b4(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.w80
    public final Object cpQdD2nAriOS(Object obj, bt btVar) {
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                op0 op0Var = (op0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    op0Var.gPXPFXrUH4XX().startStylusHandwriting((View) op0Var.OPXfSBeufaJ8);
                }
                return no2Var;
            case 1:
                ((zt1) obj2).rtx2ld2ELZv4 = obj;
                throw new TSizfFm2Yiuu(this);
            default:
                ((v61) obj2).wdg6QnbFHrFF.OPXfSBeufaJ8(((Number) obj).floatValue());
                return no2Var;
        }
    }
}
