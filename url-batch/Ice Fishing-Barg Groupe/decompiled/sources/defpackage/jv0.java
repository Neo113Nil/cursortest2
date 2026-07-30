package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jv0 extends tl {
    public static final iv0 Companion = new iv0();

    @Override // defpackage.tl
    public final float PxuCJdSBwIXG(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // defpackage.tl
    public final long Y1f8riQaR6yg(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        float[] fArr = b51.rtx2ld2ELZv4;
        return (Float.floatToRawIntBits(f6 * fArr[0]) << 32) | (4294967295L & Float.floatToRawIntBits(f7 * fArr[1]));
    }

    @Override // defpackage.tl
    public final long a92UlCVFR9N8(float f, float f2, float f3, float f4, tl tlVar) {
        float[] fArr = b51.rtx2ld2ELZv4;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float cbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float cbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float cbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
        float f8 = (116.0f * cbrt2) - 16.0f;
        float f9 = (cbrt - cbrt2) * 500.0f;
        float f10 = (cbrt2 - cbrt3) * 200.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 100.0f) {
            f8 = 100.0f;
        }
        if (f9 < -128.0f) {
            f9 = -128.0f;
        }
        if (f9 > 128.0f) {
            f9 = 128.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        return mm2.lS5Rgt96tfkO(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, tlVar);
    }

    @Override // defpackage.tl
    public final float e9gEMXR7LXtO(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * b51.rtx2ld2ELZv4[2];
    }

    @Override // defpackage.tl
    public final float lS5Rgt96tfkO(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }
}
