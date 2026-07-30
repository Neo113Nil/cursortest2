package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a5 implements ru {
    public final ai2 OPXfSBeufaJ8;
    public final AtomicReference dgRBjINgWbAK = new AtomicReference(null);
    public final View rtx2ld2ELZv4;
    public final ru wdg6QnbFHrFF;

    public a5(View view, ai2 ai2Var, ru ruVar) {
        this.rtx2ld2ELZv4 = view;
        this.OPXfSBeufaJ8 = ai2Var;
        this.wdg6QnbFHrFF = ruVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PxuCJdSBwIXG(zz0 zz0Var, ct ctVar) {
        x4 x4Var;
        int i;
        if (ctVar instanceof x4) {
            x4Var = (x4) ctVar;
            int i2 = x4Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x4Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = x4Var.dgRBjINgWbAK;
                i = x4Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    z4 z4Var = new z4(0, zz0Var, this);
                    bt btVar = null;
                    a92UlCVFR9N8 a92ulcvfr9n8 = new a92UlCVFR9N8(this, btVar, 6);
                    x4Var.cpQdD2nAriOS = 1;
                    if (cs0.XL4ISE6Oc65B(new e4(z4Var, this.dgRBjINgWbAK, a92ulcvfr9n8, btVar, 11), x4Var) == su.rtx2ld2ELZv4) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                u9.Y1f8riQaR6yg();
            }
        }
        x4Var = new x4(this, ctVar);
        Object obj2 = x4Var.dgRBjINgWbAK;
        i = x4Var.cpQdD2nAriOS;
        if (i != 0) {
        }
        u9.Y1f8riQaR6yg();
    }

    @Override // defpackage.ru
    public final hu cpQdD2nAriOS() {
        return this.wdg6QnbFHrFF.cpQdD2nAriOS();
    }
}
