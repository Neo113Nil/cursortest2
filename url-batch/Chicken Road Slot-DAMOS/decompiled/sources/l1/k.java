package l1;

import k1.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, int i3, int i10, long j) {
        super(i3, j, str);
        this.f5793d = i10;
    }

    @Override // l1.c
    public final float a(int i3) {
        switch (this.f5793d) {
            case 0:
                return i3 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // l1.c
    public final float b(int i3) {
        switch (this.f5793d) {
            case 0:
                return i3 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // l1.c
    public final long d(float f3, float f10, float f11) {
        switch (this.f5793d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f3 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float f16 = f14 * j.f5792e[0];
                return (Float.floatToRawIntBits(f15 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f) & 4294967295L);
        }
    }

    @Override // l1.c
    public final float e(float f3, float f10, float f11) {
        switch (this.f5793d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f3 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * j.f5792e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override // l1.c
    public final long f(float f3, float f10, float f11, float f12, c cVar) {
        switch (this.f5793d) {
            case 0:
                float[] fArr = j.f5792e;
                float f13 = f3 / fArr[0];
                float f14 = f10 / fArr[1];
                float f15 = f11 / fArr[2];
                float cbrt = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float cbrt2 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float f16 = (116.0f * cbrt2) - 16.0f;
                float f17 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                if (f16 > 100.0f) {
                    f16 = 100.0f;
                }
                if (f17 < -128.0f) {
                    f17 = -128.0f;
                }
                if (f17 > 128.0f) {
                    f17 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return v.a(f16, f17, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f12, cVar);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return v.a(f3, f10, f11 <= 2.0f ? f11 : 2.0f, f12, cVar);
        }
    }
}
