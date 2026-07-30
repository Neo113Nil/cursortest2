package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c40 {
    public EdgeEffect OPXfSBeufaJ8;
    public final Context PxuCJdSBwIXG;
    public EdgeEffect RAsUl2FVSrh6;
    public long TSizfFm2Yiuu;
    public EdgeEffect Y1f8riQaR6yg;
    public EdgeEffect a92UlCVFR9N8;
    public EdgeEffect dgRBjINgWbAK;
    public EdgeEffect e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;
    public EdgeEffect rtx2ld2ELZv4;
    public EdgeEffect wdg6QnbFHrFF;

    public c40(Context context, int i) {
        this.PxuCJdSBwIXG = context;
        this.lS5Rgt96tfkO = i;
        ir0.Companion.getClass();
        this.TSizfFm2Yiuu = 0L;
    }

    public static boolean RAsUl2FVSrh6(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? d9.TSizfFm2Yiuu(edgeEffect) : 0.0f) == 0.0f);
    }

    public static boolean a92UlCVFR9N8(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect PxuCJdSBwIXG(th1 th1Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.PxuCJdSBwIXG;
        EdgeEffect PxuCJdSBwIXG = i >= 31 ? d9.PxuCJdSBwIXG(context) : new yg0(context);
        PxuCJdSBwIXG.setColor(this.lS5Rgt96tfkO);
        long j = this.TSizfFm2Yiuu;
        ir0.Companion.getClass();
        if (!ir0.PxuCJdSBwIXG(j, 0L)) {
            long j2 = this.TSizfFm2Yiuu;
            if (th1Var == th1.rtx2ld2ELZv4) {
                PxuCJdSBwIXG.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
                return PxuCJdSBwIXG;
            }
            PxuCJdSBwIXG.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
        return PxuCJdSBwIXG;
    }

    public final EdgeEffect TSizfFm2Yiuu() {
        EdgeEffect edgeEffect = this.a92UlCVFR9N8;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect PxuCJdSBwIXG = PxuCJdSBwIXG(th1.OPXfSBeufaJ8);
        this.a92UlCVFR9N8 = PxuCJdSBwIXG;
        return PxuCJdSBwIXG;
    }

    public final EdgeEffect Y1f8riQaR6yg() {
        EdgeEffect edgeEffect = this.RAsUl2FVSrh6;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect PxuCJdSBwIXG = PxuCJdSBwIXG(th1.OPXfSBeufaJ8);
        this.RAsUl2FVSrh6 = PxuCJdSBwIXG;
        return PxuCJdSBwIXG;
    }

    public final EdgeEffect e9gEMXR7LXtO() {
        EdgeEffect edgeEffect = this.Y1f8riQaR6yg;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect PxuCJdSBwIXG = PxuCJdSBwIXG(th1.rtx2ld2ELZv4);
        this.Y1f8riQaR6yg = PxuCJdSBwIXG;
        return PxuCJdSBwIXG;
    }

    public final EdgeEffect lS5Rgt96tfkO() {
        EdgeEffect edgeEffect = this.e9gEMXR7LXtO;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect PxuCJdSBwIXG = PxuCJdSBwIXG(th1.rtx2ld2ELZv4);
        this.e9gEMXR7LXtO = PxuCJdSBwIXG;
        return PxuCJdSBwIXG;
    }
}
