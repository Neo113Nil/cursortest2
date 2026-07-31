package c0;

import b0.M;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365k extends AbstractC0357c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0365k(int i3, int i4, long j3, String str) {
        super(str, j3, i3);
        this.f5508d = i4;
    }

    @Override // c0.AbstractC0357c
    public final float a(int i3) {
        switch (this.f5508d) {
            case 0:
                return i3 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // c0.AbstractC0357c
    public final float b(int i3) {
        switch (this.f5508d) {
            case 0:
                return i3 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // c0.AbstractC0357c
    public final long d(float f3, float f4, float f5) {
        switch (this.f5508d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f4 < -128.0f) {
                    f4 = -128.0f;
                }
                if (f4 > 128.0f) {
                    f4 = 128.0f;
                }
                float f6 = (f3 + 16.0f) / 116.0f;
                float f7 = (f4 * 0.002f) + f6;
                float f8 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
                float f9 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
                float f10 = f8 * AbstractC0364j.f5507e[0];
                return (Float.floatToRawIntBits(f9 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f4 < -2.0f) {
                    f4 = -2.0f;
                }
                return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4 <= 2.0f ? f4 : 2.0f) & 4294967295L);
        }
    }

    @Override // c0.AbstractC0357c
    public final float e(float f3, float f4, float f5) {
        switch (this.f5508d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f5 < -128.0f) {
                    f5 = -128.0f;
                }
                if (f5 > 128.0f) {
                    f5 = 128.0f;
                }
                float f6 = ((f3 + 16.0f) / 116.0f) - (f5 * 0.005f);
                return (f6 > 0.20689656f ? f6 * f6 * f6 : 0.12841855f * (f6 - 0.13793103f)) * AbstractC0364j.f5507e[2];
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    return 2.0f;
                }
                return f5;
        }
    }

    @Override // c0.AbstractC0357c
    public final long f(float f3, float f4, float f5, float f6, AbstractC0357c abstractC0357c) {
        switch (this.f5508d) {
            case 0:
                float[] fArr = AbstractC0364j.f5507e;
                float f7 = f3 / fArr[0];
                float f8 = f4 / fArr[1];
                float f9 = f5 / fArr[2];
                float cbrt = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
                float cbrt2 = f8 > 0.008856452f ? (float) Math.cbrt(f8) : (f8 * 7.787037f) + 0.13793103f;
                float f10 = (116.0f * cbrt2) - 16.0f;
                float f11 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f9 > 0.008856452f ? (float) Math.cbrt(f9) : (f9 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 100.0f) {
                    f10 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return M.b(f10, f11, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f6, abstractC0357c);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f4 < -2.0f) {
                    f4 = -2.0f;
                }
                if (f4 > 2.0f) {
                    f4 = 2.0f;
                }
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                return M.b(f3, f4, f5 <= 2.0f ? f5 : 2.0f, f6, abstractC0357c);
        }
    }
}
