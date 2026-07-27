package B0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final E f917a = new E();

    /* renamed from: b, reason: collision with root package name */
    public static final long f918b;

    static {
        long j4 = 0;
        f918b = (j4 & 4294967295L) | (j4 << 32);
    }

    public static final TextDirectionHeuristic a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
