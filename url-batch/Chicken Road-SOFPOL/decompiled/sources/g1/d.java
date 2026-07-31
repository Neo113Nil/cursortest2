package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f2821a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f2822b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f2823c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f2824d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f2825e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f2826f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f2827g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f2828h;
    public static final q i;

    /* renamed from: j, reason: collision with root package name */
    public static final q f2829j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f2830k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f2831l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f2832m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f2833n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f2834o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f2835p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f2836q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f2837r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f2838s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f2839t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f2840u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f2841v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f2842w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f2843x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f2844y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f2821a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f2822b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f2823c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f2824d = rVar4;
        s sVar = j.f2856d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f2825e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f2826f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new c5.n(5), new c5.n(6), -0.799f, 2.399f, rVar, 2);
        f2827g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f2828h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f2829j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f2830k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f2831l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f2853a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f2832m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f2833n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f2834o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f2854b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f2835p = qVar12;
        s sVar2 = j.f2855c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f2836q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f2837r = qVar14;
        k kVar = new k(14, 1, b.f2814b, "Generic XYZ");
        f2838s = kVar;
        long j7 = b.f2815c;
        k kVar2 = new k(15, 0, j7, "Generic L*a*b*");
        f2839t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f2840u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new c5.n(7), new c5.n(8), 0.0f, 1.0f, rVar3, 17);
        f2841v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new c5.n(9), new c5.n(10), 0.0f, 1.0f, rVar4, 18);
        f2842w = qVar17;
        l lVar = new l("Oklab", j7, 19);
        f2843x = lVar;
        f2844y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d8) {
        double d9 = d8 < 0.0d ? -1.0d : 1.0d;
        double d10 = d8 * d9;
        double d11 = rVar.f2886b;
        double d12 = rVar.f2887c;
        double d13 = rVar.f2888d;
        double d14 = rVar.f2889e;
        double d15 = rVar.f2890f;
        double d16 = d11 * d10;
        return (rVar.f2891g + 1.0d) * d9 * (d16 <= 1.0d ? Math.pow(d16, d12) : Math.exp((d10 - d15) * d13) + d14);
    }

    public static double b(r rVar, double d8) {
        double d9 = d8 < 0.0d ? -1.0d : 1.0d;
        double d10 = 1.0d / rVar.f2886b;
        double d11 = 1.0d / rVar.f2887c;
        double d12 = 1.0d / rVar.f2888d;
        double d13 = rVar.f2889e;
        double d14 = rVar.f2890f;
        double d15 = (d8 * d9) / (rVar.f2891g + 1.0d);
        return d9 * (d15 <= 1.0d ? Math.pow(d15, d11) * d10 : (Math.log(d15 - d13) * d12) + d14);
    }

    public static double c(r rVar, double d8) {
        double d9 = d8 < 0.0d ? -1.0d : 1.0d;
        double d10 = d8 * d9;
        double d11 = rVar.f2886b;
        double d12 = rVar.f2888d;
        double pow = (Math.pow(d10, d12) * rVar.f2887c) + d11;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d10, d12) * rVar.f2890f) + rVar.f2889e), rVar.f2891g) * d9;
    }

    public static double d(r rVar, double d8) {
        double d9 = d8 < 0.0d ? -1.0d : 1.0d;
        double d10 = d8 * d9;
        double d11 = -rVar.f2886b;
        double d12 = rVar.f2889e;
        double d13 = 1.0d / rVar.f2891g;
        return Math.pow(Math.max((Math.pow(d10, d13) * d12) + d11, 0.0d) / ((Math.pow(d10, d13) * (-rVar.f2890f)) + rVar.f2887c), 1.0d / rVar.f2888d) * d9;
    }
}
