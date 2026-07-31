package c0;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5474a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f5475b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0371q f5476c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0371q f5477d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0371q f5478e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0371q f5479f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0371q f5480g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0371q f5481h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0371q f5482i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0371q f5483j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0371q f5484k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0371q f5485l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0371q f5486m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0371q f5487n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0371q f5488o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0371q f5489p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0365k f5490q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0365k f5491r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0371q f5492s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0366l f5493t;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC0357c[] f5494u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f5474a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f5475b = fArr2;
        C0372r c0372r = new C0372r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0372r c0372r2 = new C0372r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0373s c0373s = AbstractC0364j.f5506d;
        C0371q c0371q = new C0371q("sRGB IEC61966-2.1", fArr, c0373s, c0372r, 0);
        f5476c = c0371q;
        C0371q c0371q2 = new C0371q("sRGB IEC61966-2.1 (Linear)", fArr, c0373s, 1.0d, 0.0f, 1.0f, 1);
        f5477d = c0371q2;
        C0371q c0371q3 = new C0371q("scRGB-nl IEC 61966-2-2:2003", fArr, c0373s, null, new B.r(8), new B.r(9), -0.799f, 2.399f, c0372r, 2);
        f5478e = c0371q3;
        C0371q c0371q4 = new C0371q("scRGB IEC 61966-2-2:2003", fArr, c0373s, 1.0d, -0.5f, 7.499f, 3);
        f5479f = c0371q4;
        C0371q c0371q5 = new C0371q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c0373s, new C0372r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f5480g = c0371q5;
        C0371q c0371q6 = new C0371q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c0373s, new C0372r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f5481h = c0371q6;
        C0371q c0371q7 = new C0371q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C0373s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f5482i = c0371q7;
        C0371q c0371q8 = new C0371q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c0373s, c0372r, 7);
        f5483j = c0371q8;
        C0371q c0371q9 = new C0371q("NTSC (1953)", fArr2, AbstractC0364j.f5503a, new C0372r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f5484k = c0371q9;
        C0371q c0371q10 = new C0371q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c0373s, new C0372r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f5485l = c0371q10;
        C0371q c0371q11 = new C0371q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c0373s, 2.2d, 0.0f, 1.0f, 10);
        f5486m = c0371q11;
        C0371q c0371q12 = new C0371q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC0364j.f5504b, new C0372r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f5487n = c0371q12;
        C0373s c0373s2 = AbstractC0364j.f5505c;
        C0371q c0371q13 = new C0371q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c0373s2, 1.0d, -65504.0f, 65504.0f, 12);
        f5488o = c0371q13;
        C0371q c0371q14 = new C0371q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c0373s2, 1.0d, -65504.0f, 65504.0f, 13);
        f5489p = c0371q14;
        C0365k c0365k = new C0365k(14, 1, AbstractC0356b.f5467b, "Generic XYZ");
        f5490q = c0365k;
        long j3 = AbstractC0356b.f5468c;
        C0365k c0365k2 = new C0365k(15, 0, j3, "Generic L*a*b*");
        f5491r = c0365k2;
        C0371q c0371q15 = new C0371q("None", fArr, c0373s, c0372r2, 16);
        f5492s = c0371q15;
        C0366l c0366l = new C0366l("Oklab", j3, 17);
        f5493t = c0366l;
        f5494u = new AbstractC0357c[]{c0371q, c0371q2, c0371q3, c0371q4, c0371q5, c0371q6, c0371q7, c0371q8, c0371q9, c0371q10, c0371q11, c0371q12, c0371q13, c0371q14, c0365k, c0365k2, c0371q15, c0366l};
    }
}
