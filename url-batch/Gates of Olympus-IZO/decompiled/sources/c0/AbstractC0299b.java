package c0;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0299b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4341a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4342b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f4343c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f4344d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4345e = 0;

    static {
        long j3 = 3;
        long j4 = j3 << 32;
        f4341a = (0 & 4294967295L) | j4;
        f4342b = (1 & 4294967295L) | j4;
        f4343c = j4 | (2 & 4294967295L);
        f4344d = (j3 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return a(j3, f4341a) ? "Rgb" : a(j3, f4342b) ? "Xyz" : a(j3, f4343c) ? "Lab" : a(j3, f4344d) ? "Cmyk" : "Unknown";
    }
}
