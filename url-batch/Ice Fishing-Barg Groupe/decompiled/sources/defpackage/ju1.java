package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ju1 {
    public v81 OPXfSBeufaJ8;
    public Set PxuCJdSBwIXG;
    public final f91 RAsUl2FVSrh6;
    public final f91 TSizfFm2Yiuu;
    public w81 Y1f8riQaR6yg;
    public final f91 a92UlCVFR9N8;
    public w81 dgRBjINgWbAK;
    public f91 e9gEMXR7LXtO;
    public xp lS5Rgt96tfkO;
    public w81 rtx2ld2ELZv4;
    public ArrayList wdg6QnbFHrFF;

    public ju1() {
        f91 f91Var = new f91(new yf0[16]);
        this.TSizfFm2Yiuu = f91Var;
        w81 w81Var = d02.PxuCJdSBwIXG;
        this.Y1f8riQaR6yg = new w81();
        this.e9gEMXR7LXtO = f91Var;
        this.a92UlCVFR9N8 = new f91(new Object[16]);
        this.RAsUl2FVSrh6 = new f91(new ae0[16]);
    }

    public static final boolean a92UlCVFR9N8(yf0 yf0Var, f91 f91Var) {
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        int i = f91Var.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            ku1 ku1Var = ((yf0) objArr[i2]).PxuCJdSBwIXG;
            if (ku1Var instanceof cl1) {
                f91 f91Var2 = ((cl1) ku1Var).OPXfSBeufaJ8;
                if (f91Var2.wdg6QnbFHrFF(yf0Var) || a92UlCVFR9N8(yf0Var, f91Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void PxuCJdSBwIXG() {
        this.PxuCJdSBwIXG = null;
        this.lS5Rgt96tfkO = null;
        f91 f91Var = this.TSizfFm2Yiuu;
        f91Var.RAsUl2FVSrh6();
        this.Y1f8riQaR6yg.lS5Rgt96tfkO();
        this.e9gEMXR7LXtO = f91Var;
        this.a92UlCVFR9N8.RAsUl2FVSrh6();
        this.RAsUl2FVSrh6.RAsUl2FVSrh6();
        this.rtx2ld2ELZv4 = null;
        this.OPXfSBeufaJ8 = null;
        this.wdg6QnbFHrFF = null;
    }

    public final void RAsUl2FVSrh6(Set set, xp xpVar) {
        PxuCJdSBwIXG();
        this.PxuCJdSBwIXG = set;
        this.lS5Rgt96tfkO = xpVar;
    }

    public final void TSizfFm2Yiuu() {
        Set set = this.PxuCJdSBwIXG;
        if (set == null) {
            return;
        }
        this.dgRBjINgWbAK = null;
        f91 f91Var = this.a92UlCVFR9N8;
        int i = 5;
        if (f91Var.wdg6QnbFHrFF != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                w81 w81Var = this.rtx2ld2ELZv4;
                int i2 = f91Var.wdg6QnbFHrFF;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = f91Var.rtx2ld2ELZv4[i2];
                    try {
                        if (obj instanceof yf0) {
                            ku1 ku1Var = ((yf0) obj).PxuCJdSBwIXG;
                            set.remove(ku1Var);
                            ku1Var.Y1f8riQaR6yg();
                        }
                        if (obj instanceof io) {
                            if (w81Var == null || !w81Var.TSizfFm2Yiuu(obj)) {
                                ((io) obj).lS5Rgt96tfkO();
                            } else {
                                ((io) obj).PxuCJdSBwIXG();
                            }
                        }
                    } catch (Throwable th) {
                        xp xpVar = this.lS5Rgt96tfkO;
                        if (xpVar != null) {
                            fx1.twy4zb2fCtqq(th, new e6(i, xpVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        f91 f91Var2 = this.TSizfFm2Yiuu;
        if (f91Var2.wdg6QnbFHrFF != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.PxuCJdSBwIXG;
                if (set2 != null) {
                    Object[] objArr = f91Var2.rtx2ld2ELZv4;
                    int i3 = f91Var2.wdg6QnbFHrFF;
                    for (int i4 = 0; i4 < i3; i4++) {
                        yf0 yf0Var = (yf0) objArr[i4];
                        ku1 ku1Var2 = yf0Var.PxuCJdSBwIXG;
                        set2.remove(ku1Var2);
                        try {
                            ku1Var2.PxuCJdSBwIXG();
                        } catch (Throwable th2) {
                            xp xpVar2 = this.lS5Rgt96tfkO;
                            if (xpVar2 != null) {
                                fx1.twy4zb2fCtqq(th2, new e6(i, xpVar2, yf0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void Y1f8riQaR6yg() {
        f91 f91Var = this.RAsUl2FVSrh6;
        if (f91Var.wdg6QnbFHrFF != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = f91Var.rtx2ld2ELZv4;
                int i = f91Var.wdg6QnbFHrFF;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ae0) objArr[i2]).PxuCJdSBwIXG();
                }
                f91Var.RAsUl2FVSrh6();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e9gEMXR7LXtO(yf0 yf0Var) {
        if (!this.Y1f8riQaR6yg.TSizfFm2Yiuu(yf0Var)) {
            w81 w81Var = this.dgRBjINgWbAK;
            if (w81Var == null || !w81Var.TSizfFm2Yiuu(yf0Var)) {
                this.a92UlCVFR9N8.lS5Rgt96tfkO(yf0Var);
                return;
            }
            return;
        }
        this.Y1f8riQaR6yg.x50lh2ztY7Y5(yf0Var);
        if (!this.e9gEMXR7LXtO.wdg6QnbFHrFF(yf0Var)) {
            f91 f91Var = this.TSizfFm2Yiuu;
            if (!f91Var.wdg6QnbFHrFF(yf0Var)) {
                a92UlCVFR9N8(yf0Var, f91Var);
            }
        }
        Set set = this.PxuCJdSBwIXG;
        if (set == null) {
            return;
        }
        set.add(yf0Var.PxuCJdSBwIXG);
    }

    public final void lS5Rgt96tfkO() {
        Set set = this.PxuCJdSBwIXG;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ku1 ku1Var = (ku1) it.next();
                it.remove();
                ku1Var.TSizfFm2Yiuu();
            }
        } finally {
            Trace.endSection();
        }
    }
}
