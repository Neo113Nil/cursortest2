package defpackage;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class li2 {
    public static final ThreadLocal PxuCJdSBwIXG = new ThreadLocal();
    public static final long lS5Rgt96tfkO = PxuCJdSBwIXG(0, 0);

    public static final long PxuCJdSBwIXG(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final TextDirectionHeuristic lS5Rgt96tfkO(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
