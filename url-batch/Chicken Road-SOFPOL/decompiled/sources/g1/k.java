package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i8, long j7, String str) {
        super(str, j7, i);
        this.f2858d = i8;
    }

    @Override // g1.c
    public final float a(int i) {
        switch (this.f2858d) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // g1.c
    public final float b(int i) {
        switch (this.f2858d) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // g1.c
    public final long d(float f6, float f8, float f9) {
        switch (this.f2858d) {
            case 0:
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f10 = (f6 + 16.0f) / 116.0f;
                float f11 = (f8 * 0.002f) + f10;
                float f12 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
                float f13 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float f14 = f12 * j.f2857e[0];
                return (Float.floatToRawIntBits(f13 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8 <= 2.0f ? f8 : 2.0f) & 4294967295L);
        }
    }

    @Override // g1.c
    public final float e(float f6, float f8, float f9) {
        switch (this.f2858d) {
            case 0:
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                float f10 = ((f6 + 16.0f) / 116.0f) - (f9 * 0.005f);
                return (f10 > 0.20689656f ? f10 * f10 * f10 : 0.12841855f * (f10 - 0.13793103f)) * j.f2857e[2];
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    return 2.0f;
                }
                return f9;
        }
    }

    @Override // g1.c
    public final long f(float f6, float f8, float f9, float f10, c cVar) {
        switch (this.f2858d) {
            case 0:
                float[] fArr = j.f2857e;
                float f11 = f6 / fArr[0];
                float f12 = f8 / fArr[1];
                float f13 = f9 / fArr[2];
                float cbrt = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
                float cbrt2 = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
                float f14 = (116.0f * cbrt2) - 16.0f;
                float f15 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                if (f14 > 100.0f) {
                    f14 = 100.0f;
                }
                if (f15 < -128.0f) {
                    f15 = -128.0f;
                }
                if (f15 > 128.0f) {
                    f15 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return f1.p.a(f14, f15, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f10, cVar);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                return f1.p.a(f6, f8, f9 <= 2.0f ? f9 : 2.0f, f10, cVar);
        }
    }
}
