package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ow2 {
    public static final op0 OPXfSBeufaJ8 = new op0(new ov2(2), new jx1(19));
    public final Context PxuCJdSBwIXG;
    public final ih0 RAsUl2FVSrh6;
    public final op0 TSizfFm2Yiuu;
    public final fe2 Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final j9 e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;
    public final fh0 rtx2ld2ELZv4;

    public ow2(Context context, fe2 fe2Var) {
        ah0 ah0Var = ah0.lS5Rgt96tfkO;
        jh0.cpQdD2nAriOS(context, "Null context is not permitted.");
        op0 op0Var = OPXfSBeufaJ8;
        jh0.cpQdD2nAriOS(op0Var, "Api must not be null.");
        jh0.cpQdD2nAriOS(ah0Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        jh0.cpQdD2nAriOS(applicationContext, "The provided context did not have an application context.");
        this.PxuCJdSBwIXG = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.lS5Rgt96tfkO = attributionTag;
        this.TSizfFm2Yiuu = op0Var;
        this.Y1f8riQaR6yg = fe2Var;
        this.e9gEMXR7LXtO = new j9(op0Var, fe2Var, attributionTag);
        fh0 Y1f8riQaR6yg = fh0.Y1f8riQaR6yg(applicationContext);
        this.rtx2ld2ELZv4 = Y1f8riQaR6yg;
        this.a92UlCVFR9N8 = Y1f8riQaR6yg.rtx2ld2ELZv4.getAndIncrement();
        this.RAsUl2FVSrh6 = ah0Var.PxuCJdSBwIXG;
        sw2 sw2Var = Y1f8riQaR6yg.cpQdD2nAriOS;
        sw2Var.sendMessage(sw2Var.obtainMessage(7, this));
    }

    public final m9 PxuCJdSBwIXG() {
        m9 m9Var = new m9(5);
        Set set = Collections.EMPTY_SET;
        if (((ma) m9Var.OPXfSBeufaJ8) == null) {
            m9Var.OPXfSBeufaJ8 = new ma(0);
        }
        ((ma) m9Var.OPXfSBeufaJ8).addAll(set);
        Context context = this.PxuCJdSBwIXG;
        m9Var.dgRBjINgWbAK = context.getClass().getName();
        m9Var.wdg6QnbFHrFF = context.getPackageName();
        return m9Var;
    }

    public final uj lS5Rgt96tfkO(ee2 ee2Var) {
        b42 b42Var = new b42(8);
        t70[] t70VarArr = {f2.e6tOsSdd2EFb};
        b42Var.OPXfSBeufaJ8 = new b42(21, ee2Var);
        bh2 bh2Var = new bh2();
        bh2Var.TSizfFm2Yiuu = b42Var;
        bh2Var.lS5Rgt96tfkO = t70VarArr;
        bh2Var.PxuCJdSBwIXG = false;
        vd2 vd2Var = new vd2();
        fh0 fh0Var = this.rtx2ld2ELZv4;
        fh0Var.getClass();
        dw2 dw2Var = new dw2(new kw2(bh2Var, vd2Var, this.RAsUl2FVSrh6), fh0Var.OPXfSBeufaJ8.get(), this);
        sw2 sw2Var = fh0Var.cpQdD2nAriOS;
        sw2Var.sendMessage(sw2Var.obtainMessage(4, dw2Var));
        return vd2Var.PxuCJdSBwIXG;
    }
}
