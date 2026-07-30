package a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f218a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f219b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f220c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f221d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f222e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f223f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f224g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f225h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f226i;

    /* renamed from: j, reason: collision with root package name */
    public static final q f227j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f228k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f229l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f230m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f231n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f232o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f233p;

    /* renamed from: q, reason: collision with root package name */
    public static final k f234q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f235r;

    /* renamed from: s, reason: collision with root package name */
    public static final q f236s;

    /* renamed from: t, reason: collision with root package name */
    public static final l f237t;

    /* renamed from: u, reason: collision with root package name */
    public static final c[] f238u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f218a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f219b = fArr2;
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar = j.f250d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f220c = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f221d = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new a0.s(4), new a0.s(5), -0.799f, 2.399f, rVar, 2);
        f222e = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f223f = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f224g = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f225h = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f226i = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f227j = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f247a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f228k = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f229l = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f230m = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f248b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f231n = qVar12;
        s sVar2 = j.f249c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f232o = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f233p = qVar14;
        k kVar = new k(14, 1, b.f211b, "Generic XYZ");
        f234q = kVar;
        long j8 = b.f212c;
        k kVar2 = new k(15, 0, j8, "Generic L*a*b*");
        f235r = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f236s = qVar15;
        l lVar = new l(17, j8, "Oklab");
        f237t = lVar;
        f238u = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, lVar};
    }
}
