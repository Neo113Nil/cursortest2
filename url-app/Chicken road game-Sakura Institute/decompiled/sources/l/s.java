package l;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: s, reason: collision with root package name */
    public static float[] f5632s;

    /* renamed from: a, reason: collision with root package name */
    public final float f5633a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5634b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5635c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5636d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5637e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5638f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5639g;

    /* renamed from: h, reason: collision with root package name */
    public float f5640h;

    /* renamed from: i, reason: collision with root package name */
    public float f5641i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f5642j;

    /* renamed from: k, reason: collision with root package name */
    public final float f5643k;

    /* renamed from: l, reason: collision with root package name */
    public final float f5644l;

    /* renamed from: m, reason: collision with root package name */
    public final float f5645m;

    /* renamed from: n, reason: collision with root package name */
    public final float f5646n;

    /* renamed from: o, reason: collision with root package name */
    public final float f5647o;

    /* renamed from: p, reason: collision with root package name */
    public final float f5648p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5649q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5650r;

    public s(int i7, float f9, float f10, float f11, float f12, float f13, float f14) {
        boolean z8;
        float f15;
        float f16;
        float f17 = f11;
        this.f5633a = f9;
        this.f5634b = f10;
        this.f5635c = f17;
        this.f5636d = f12;
        this.f5637e = f13;
        this.f5638f = f14;
        float f18 = f13 - f17;
        float f19 = f14 - f12;
        float f20 = 0.0f;
        boolean z9 = true;
        boolean z10 = i7 == 1 || (i7 == 4 ? f19 > 0.0f : !(i7 != 5 || f19 >= 0.0f));
        this.f5649q = z10;
        float f21 = f10 - f9;
        float f22 = 1 / f21;
        this.f5643k = f22;
        boolean z11 = 3 == i7;
        if (z11 || Math.abs(f18) < 0.001f || Math.abs(f19) < 0.001f) {
            float hypot = (float) Math.hypot(f19, f18);
            this.f5639g = hypot;
            this.f5648p = hypot * f22;
            this.f5646n = f18 / f21;
            this.f5647o = f19 / f21;
            this.f5642j = new float[101];
            this.f5644l = Float.NaN;
            this.f5645m = Float.NaN;
            z8 = true;
        } else {
            float[] fArr = new float[101];
            this.f5642j = fArr;
            this.f5644l = (z10 ? -1 : 1) * f18;
            this.f5645m = f19 * (z10 ? 1 : -1);
            this.f5646n = z10 ? f13 : f17;
            this.f5647o = z10 ? f12 : f14;
            float f23 = f12 - f14;
            int length = m4.f.d().length;
            float f24 = 0.0f;
            float f25 = 0.0f;
            float f26 = 0.0f;
            int i8 = 0;
            while (i8 < length) {
                boolean z12 = z9;
                float f27 = f26;
                double radians = (float) Math.toRadians((i8 * 90.0d) / (m4.f.d().length - 1));
                float sin = ((float) Math.sin(radians)) * f18;
                float cos = ((float) Math.cos(radians)) * f23;
                if (i8 > 0) {
                    float f28 = f20;
                    double d8 = sin - f25;
                    float f29 = cos - f27;
                    f15 = f28;
                    f16 = sin;
                    f24 += (float) Math.hypot(d8, f29);
                    m4.f.d()[i8] = f24;
                } else {
                    f15 = f20;
                    f16 = sin;
                }
                i8++;
                f25 = f16;
                f20 = f15;
                f26 = cos;
                z9 = z12;
            }
            float f30 = f20;
            this.f5639g = f24;
            int length2 = m4.f.d().length;
            for (int i9 = 0; i9 < length2; i9++) {
                float[] d9 = m4.f.d();
                d9[i9] = d9[i9] / f24;
            }
            for (int i10 = 0; i10 < 101; i10++) {
                float f31 = i10 / 100;
                float[] d10 = m4.f.d();
                int binarySearch = Arrays.binarySearch(d10, 0, d10.length, f31);
                if (binarySearch >= 0) {
                    fArr[i10] = binarySearch / (m4.f.d().length - 1);
                } else if (binarySearch == -1) {
                    fArr[i10] = f30;
                } else {
                    int i11 = -binarySearch;
                    int i12 = i11 - 2;
                    fArr[i10] = (((f31 - m4.f.d()[i12]) / (m4.f.d()[i11 - 1] - m4.f.d()[i12])) + i12) / (m4.f.d().length - 1);
                }
            }
            this.f5648p = this.f5639g * this.f5643k;
            z8 = z11;
        }
        this.f5650r = z8;
    }

    public final float a() {
        float f9 = this.f5644l * this.f5641i;
        float hypot = this.f5648p / ((float) Math.hypot(f9, (-this.f5645m) * this.f5640h));
        return this.f5649q ? (-f9) * hypot : f9 * hypot;
    }

    public final float b() {
        float f9 = this.f5644l * this.f5641i;
        float f10 = (-this.f5645m) * this.f5640h;
        float hypot = this.f5648p / ((float) Math.hypot(f9, f10));
        return this.f5649q ? (-f10) * hypot : f10 * hypot;
    }

    public final void c(float f9) {
        float f10 = (this.f5649q ? this.f5634b - f9 : f9 - this.f5633a) * this.f5643k;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            f11 = 1.0f;
            if (f10 < 1.0f) {
                float[] fArr = this.f5642j;
                float length = f10 * (fArr.length - 1);
                int i7 = (int) length;
                float f12 = fArr[i7];
                f11 = ((fArr[i7 + 1] - f12) * (length - i7)) + f12;
            }
        }
        double d8 = f11 * 1.5707964f;
        this.f5640h = (float) Math.sin(d8);
        this.f5641i = (float) Math.cos(d8);
    }
}
