package c0;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f4349a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f4350b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0314q f4351c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0314q f4352d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0314q f4353e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0314q f4354f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0314q f4355g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0314q f4356h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0314q f4357i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0314q f4358j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0314q f4359k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0314q f4360l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0314q f4361m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0314q f4362n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0314q f4363o;
    public static final C0314q p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0308k f4364q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0308k f4365r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0314q f4366s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0309l f4367t;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC0300c[] f4368u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f4349a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f4350b = fArr2;
        C0315r c0315r = new C0315r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0315r c0315r2 = new C0315r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0316s c0316s = AbstractC0307j.f4380d;
        C0314q c0314q = new C0314q("sRGB IEC61966-2.1", fArr, c0316s, c0315r, 0);
        f4351c = c0314q;
        C0314q c0314q2 = new C0314q("sRGB IEC61966-2.1 (Linear)", fArr, c0316s, 1.0d, 0.0f, 1.0f, 1);
        f4352d = c0314q2;
        C0314q c0314q3 = new C0314q("scRGB-nl IEC 61966-2-2:2003", fArr, c0316s, null, new B2.a(1), new B2.a(2), -0.799f, 2.399f, c0315r, 2);
        f4353e = c0314q3;
        C0314q c0314q4 = new C0314q("scRGB IEC 61966-2-2:2003", fArr, c0316s, 1.0d, -0.5f, 7.499f, 3);
        f4354f = c0314q4;
        C0314q c0314q5 = new C0314q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c0316s, new C0315r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f4355g = c0314q5;
        C0314q c0314q6 = new C0314q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c0316s, new C0315r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f4356h = c0314q6;
        C0314q c0314q7 = new C0314q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C0316s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f4357i = c0314q7;
        C0314q c0314q8 = new C0314q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c0316s, c0315r, 7);
        f4358j = c0314q8;
        C0314q c0314q9 = new C0314q("NTSC (1953)", fArr2, AbstractC0307j.f4377a, new C0315r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f4359k = c0314q9;
        C0314q c0314q10 = new C0314q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c0316s, new C0315r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f4360l = c0314q10;
        C0314q c0314q11 = new C0314q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c0316s, 2.2d, 0.0f, 1.0f, 10);
        f4361m = c0314q11;
        C0314q c0314q12 = new C0314q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC0307j.f4378b, new C0315r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f4362n = c0314q12;
        C0316s c0316s2 = AbstractC0307j.f4379c;
        C0314q c0314q13 = new C0314q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c0316s2, 1.0d, -65504.0f, 65504.0f, 12);
        f4363o = c0314q13;
        C0314q c0314q14 = new C0314q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c0316s2, 1.0d, -65504.0f, 65504.0f, 13);
        p = c0314q14;
        C0308k c0308k = new C0308k(14, 1, AbstractC0299b.f4342b, "Generic XYZ");
        f4364q = c0308k;
        long j3 = AbstractC0299b.f4343c;
        C0308k c0308k2 = new C0308k(15, 0, j3, "Generic L*a*b*");
        f4365r = c0308k2;
        C0314q c0314q15 = new C0314q("None", fArr, c0316s, c0315r2, 16);
        f4366s = c0314q15;
        C0309l c0309l = new C0309l("Oklab", j3, 17);
        f4367t = c0309l;
        f4368u = new AbstractC0300c[]{c0314q, c0314q2, c0314q3, c0314q4, c0314q5, c0314q6, c0314q7, c0314q8, c0314q9, c0314q10, c0314q11, c0314q12, c0314q13, c0314q14, c0308k, c0308k2, c0314q15, c0309l};
    }
}
