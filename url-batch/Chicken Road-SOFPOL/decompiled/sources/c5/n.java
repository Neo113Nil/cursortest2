package c5;

import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements g1.i, r.t, z5.w {

    /* renamed from: b, reason: collision with root package name */
    public static final n f1696b = new n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f1697c = new n(1);

    /* renamed from: d, reason: collision with root package name */
    public static final n f1698d = new n(2);

    /* renamed from: e, reason: collision with root package name */
    public static final n f1699e = new n(3);

    /* renamed from: f, reason: collision with root package name */
    public static final n f1700f = new n(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1701a;

    public /* synthetic */ n(int i) {
        this.f1701a = i;
    }

    @Override // g1.i
    public double b(double d8) {
        switch (this.f1701a) {
            case 5:
                double d9 = d8 < 0.0d ? -d8 : d8;
                return Math.copySign(d9 >= 0.0031308049535603718d ? (Math.pow(d9, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d9 / 0.07739938080495357d, d8);
            case 6:
                double d10 = d8 < 0.0d ? -d8 : d8;
                return Math.copySign(d10 >= 0.04045d ? Math.pow((0.9478672985781991d * d10) + 0.05213270142180095d, 2.4d) : d10 * 0.07739938080495357d, d8);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                float[] fArr = g1.d.f2821a;
                return g1.d.b(g1.d.f2823c, d8);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                float[] fArr2 = g1.d.f2821a;
                return g1.d.a(g1.d.f2823c, d8);
            case v0.f8304b /* 9 */:
                float[] fArr3 = g1.d.f2821a;
                return g1.d.d(g1.d.f2824d, d8);
            case v0.f8306d /* 10 */:
                float[] fArr4 = g1.d.f2821a;
                return g1.d.c(g1.d.f2824d, d8);
            default:
                return d8;
        }
    }

    @Override // r.t
    public float a(float f6) {
        return f6;
    }
}
