package D0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final F f839a = new F();

    /* renamed from: b, reason: collision with root package name */
    public static final long f840b;

    static {
        long j3 = 0;
        f840b = (j3 & 4294967295L) | (j3 << 32);
    }

    public static final TextDirectionHeuristic a(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
