package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gv2 extends tl {
    @Override // defpackage.tl
    public final float PxuCJdSBwIXG(int i) {
        return 2.0f;
    }

    @Override // defpackage.tl
    public final long Y1f8riQaR6yg(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f) & 4294967295L);
    }

    @Override // defpackage.tl
    public final long a92UlCVFR9N8(float f, float f2, float f3, float f4, tl tlVar) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return mm2.lS5Rgt96tfkO(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, tlVar);
    }

    @Override // defpackage.tl
    public final float e9gEMXR7LXtO(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // defpackage.tl
    public final float lS5Rgt96tfkO(int i) {
        return -2.0f;
    }
}
