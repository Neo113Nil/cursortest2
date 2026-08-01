package n2;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7021a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final long f7022b = a(0, 0);

    public static final long a(int i3, int i10) {
        return (i10 & 4294967295L) | (i3 << 32);
    }

    public static final TextDirectionHeuristic b(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
