package l1;

import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5758a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f5759b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f5760c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f5761d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f5762e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f5763f;
    public static final q g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f5764h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f5765i;
    public static final q j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f5766k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f5767l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f5768m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f5769n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f5770o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f5771p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f5772q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f5773r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f5774s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f5775t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f5776u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f5777v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f5778w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f5779x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f5780y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f5758a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f5759b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f5760c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f5761d = rVar4;
        s sVar = j.f5791d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f5762e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f5763f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new i0(2), new i0(3), -0.799f, 2.399f, rVar, 2);
        g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f5764h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f5765i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f5766k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f5767l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f5788a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f5768m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f5769n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f5770o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f5789b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f5771p = qVar12;
        s sVar2 = j.f5790c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f5772q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f5773r = qVar14;
        k kVar = new k("Generic XYZ", 14, 1, b.f5751b);
        f5774s = kVar;
        long j3 = b.f5752c;
        k kVar2 = new k("Generic L*a*b*", 15, 0, j3);
        f5775t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f5776u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new i0(4), new i0(5), 0.0f, 1.0f, rVar3, 17);
        f5777v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new i0(6), new i0(7), 0.0f, 1.0f, rVar4, 18);
        f5778w = qVar17;
        l lVar = new l(19, j3, "Oklab");
        f5779x = lVar;
        f5780y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = rVar.f5819b;
        double d14 = rVar.f5820c;
        double d15 = rVar.f5821d;
        double d16 = rVar.f5822e;
        double d17 = rVar.f5823f;
        double d18 = d13 * d12;
        return (rVar.g + 1.0d) * d11 * (d18 <= 1.0d ? Math.pow(d18, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    public static double b(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / rVar.f5819b;
        double d13 = 1.0d / rVar.f5820c;
        double d14 = 1.0d / rVar.f5821d;
        double d15 = rVar.f5822e;
        double d16 = rVar.f5823f;
        double d17 = (d10 * d11) / (rVar.g + 1.0d);
        return d11 * (d17 <= 1.0d ? Math.pow(d17, d13) * d12 : (Math.log(d17 - d15) * d14) + d16);
    }

    public static double c(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = rVar.f5819b;
        double d14 = rVar.f5821d;
        double pow = (Math.pow(d12, d14) * rVar.f5820c) + d13;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d12, d14) * rVar.f5823f) + rVar.f5822e), rVar.g) * d11;
    }

    public static double d(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -rVar.f5819b;
        double d14 = rVar.f5822e;
        double d15 = 1.0d / rVar.g;
        return Math.pow(Math.max((Math.pow(d12, d15) * d14) + d13, 0.0d) / ((Math.pow(d12, d15) * (-rVar.f5823f)) + rVar.f5820c), 1.0d / rVar.f5821d) * d11;
    }
}
