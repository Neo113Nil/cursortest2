package a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f210a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f211b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f212c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f213d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f214e = 0;

    static {
        long j8 = 3;
        long j9 = j8 << 32;
        f210a = (0 & 4294967295L) | j9;
        f211b = (1 & 4294967295L) | j9;
        f212c = j9 | (2 & 4294967295L);
        f213d = (j8 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static String b(long j8) {
        return a(j8, f210a) ? "Rgb" : a(j8, f211b) ? "Xyz" : a(j8, f212c) ? "Lab" : a(j8, f213d) ? "Cmyk" : "Unknown";
    }
}
