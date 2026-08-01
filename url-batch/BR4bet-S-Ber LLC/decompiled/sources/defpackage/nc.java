package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class nc implements rn {
    public final /* synthetic */ int f;
    public final /* synthetic */ m3 g;

    public /* synthetic */ nc(m3 m3Var, int i) {
        this.f = i;
        this.g = m3Var;
    }

    @Override // defpackage.rn
    public final Object a() {
        int i = this.f;
        int i2 = 0;
        m3 m3Var = this.g;
        switch (i) {
            case 0:
                m3Var.reportFullyDrawn();
                return ej.q;
            case 1:
                return new qn(m3Var.k, new nc(m3Var, i2));
            case 2:
                xh xhVar = new xh();
                m3Var.h().a().b(xhVar);
                return xhVar;
            default:
                hz hzVar = new hz(new mc(m3Var, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kr.b(Looper.myLooper(), Looper.getMainLooper())) {
                        m3Var.f.a(new oc(hzVar, m3Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new w3(m3Var, hzVar, 1));
                    }
                }
                return hzVar;
        }
    }
}
