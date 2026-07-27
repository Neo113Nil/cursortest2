package a0;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0347b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4753a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4754b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f4755c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f4756d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4757e = 0;

    static {
        long j4 = 3;
        long j5 = j4 << 32;
        f4753a = (0 & 4294967295L) | j5;
        f4754b = (1 & 4294967295L) | j5;
        f4755c = j5 | (2 & 4294967295L);
        f4756d = (j4 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static String b(long j4) {
        return a(j4, f4753a) ? "Rgb" : a(j4, f4754b) ? "Xyz" : a(j4, f4755c) ? "Lab" : a(j4, f4756d) ? "Cmyk" : "Unknown";
    }
}
