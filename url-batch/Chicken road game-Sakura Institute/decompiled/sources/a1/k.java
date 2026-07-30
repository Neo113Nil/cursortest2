package a1;

import com.android.installreferrer.api.InstallReferrerClient;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i8, long j8, String str) {
        super(i7, j8, str);
        this.f252d = i8;
    }

    @Override // a1.c
    public final float a(int i7) {
        switch (this.f252d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i7 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // a1.c
    public final float b(int i7) {
        switch (this.f252d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i7 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // a1.c
    public final long d(float f9, float f10, float f11) {
        switch (this.f252d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 100.0f) {
                    f9 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f9 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float f16 = f14 * j.f251e[0];
                return (Float.floatToRawIntBits(f15 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    f9 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f) & 4294967295L);
        }
    }

    @Override // a1.c
    public final float e(float f9, float f10, float f11) {
        switch (this.f252d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 100.0f) {
                    f9 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f9 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * j.f251e[2];
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

    @Override // a1.c
    public final long f(float f9, float f10, float f11, float f12, c cVar) {
        switch (this.f252d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float[] fArr = j.f251e;
                float f13 = f9 / fArr[0];
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
                return l0.b(f16, f17, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f12, cVar);
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    f9 = 2.0f;
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
                return l0.b(f9, f10, f11 <= 2.0f ? f11 : 2.0f, f12, cVar);
        }
    }
}
