package c0;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0356b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5466a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5467b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f5468c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f5469d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5470e = 0;

    static {
        long j3 = 3;
        long j4 = j3 << 32;
        f5466a = (0 & 4294967295L) | j4;
        f5467b = (1 & 4294967295L) | j4;
        f5468c = j4 | (2 & 4294967295L);
        f5469d = (j3 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return a(j3, f5466a) ? "Rgb" : a(j3, f5467b) ? "Xyz" : a(j3, f5468c) ? "Lab" : a(j3, f5469d) ? "Cmyk" : "Unknown";
    }
}
