package a0;

import A.C0022s;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f4761a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f4762b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0362q f4763c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0362q f4764d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0362q f4765e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0362q f4766f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0362q f4767g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0362q f4768h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0362q f4769i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0362q f4770j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0362q f4771k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0362q f4772l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0362q f4773m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0362q f4774n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0362q f4775o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0362q f4776p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0356k f4777q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0356k f4778r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0362q f4779s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0357l f4780t;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC0348c[] f4781u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f4761a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f4762b = fArr2;
        C0363r c0363r = new C0363r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0363r c0363r2 = new C0363r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0364s c0364s = AbstractC0355j.f4793d;
        C0362q c0362q = new C0362q("sRGB IEC61966-2.1", fArr, c0364s, c0363r, 0);
        f4763c = c0362q;
        C0362q c0362q2 = new C0362q("sRGB IEC61966-2.1 (Linear)", fArr, c0364s, 1.0d, 0.0f, 1.0f, 1);
        f4764d = c0362q2;
        C0362q c0362q3 = new C0362q("scRGB-nl IEC 61966-2-2:2003", fArr, c0364s, null, new C0022s(12), new C0022s(13), -0.799f, 2.399f, c0363r, 2);
        f4765e = c0362q3;
        C0362q c0362q4 = new C0362q("scRGB IEC 61966-2-2:2003", fArr, c0364s, 1.0d, -0.5f, 7.499f, 3);
        f4766f = c0362q4;
        C0362q c0362q5 = new C0362q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c0364s, new C0363r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f4767g = c0362q5;
        C0362q c0362q6 = new C0362q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c0364s, new C0363r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f4768h = c0362q6;
        C0362q c0362q7 = new C0362q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C0364s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f4769i = c0362q7;
        C0362q c0362q8 = new C0362q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c0364s, c0363r, 7);
        f4770j = c0362q8;
        C0362q c0362q9 = new C0362q("NTSC (1953)", fArr2, AbstractC0355j.f4790a, new C0363r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f4771k = c0362q9;
        C0362q c0362q10 = new C0362q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c0364s, new C0363r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f4772l = c0362q10;
        C0362q c0362q11 = new C0362q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c0364s, 2.2d, 0.0f, 1.0f, 10);
        f4773m = c0362q11;
        C0362q c0362q12 = new C0362q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC0355j.f4791b, new C0363r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f4774n = c0362q12;
        C0364s c0364s2 = AbstractC0355j.f4792c;
        C0362q c0362q13 = new C0362q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c0364s2, 1.0d, -65504.0f, 65504.0f, 12);
        f4775o = c0362q13;
        C0362q c0362q14 = new C0362q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c0364s2, 1.0d, -65504.0f, 65504.0f, 13);
        f4776p = c0362q14;
        C0356k c0356k = new C0356k("Generic XYZ", 14, 1, AbstractC0347b.f4754b);
        f4777q = c0356k;
        long j4 = AbstractC0347b.f4755c;
        C0356k c0356k2 = new C0356k("Generic L*a*b*", 15, 0, j4);
        f4778r = c0356k2;
        C0362q c0362q15 = new C0362q("None", fArr, c0364s, c0363r2, 16);
        f4779s = c0362q15;
        C0357l c0357l = new C0357l(17, j4, "Oklab");
        f4780t = c0357l;
        f4781u = new AbstractC0348c[]{c0362q, c0362q2, c0362q3, c0362q4, c0362q5, c0362q6, c0362q7, c0362q8, c0362q9, c0362q10, c0362q11, c0362q12, c0362q13, c0362q14, c0356k, c0356k2, c0362q15, c0357l};
    }
}
