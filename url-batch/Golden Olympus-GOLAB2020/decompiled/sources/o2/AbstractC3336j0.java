package o2;

/* renamed from: o2.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3336j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final t2.G f42082a = new t2.G("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final t2.G f42083b = new t2.G("CLOSED_EMPTY");

    public static final long c(long j4) {
        if (j4 <= 0) {
            return 0L;
        }
        if (j4 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j4 * 1000000;
    }
}
