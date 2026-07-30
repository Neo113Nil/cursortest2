package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hl {
    public static final long RAsUl2FVSrh6;
    public static final long TSizfFm2Yiuu;
    public static final long Y1f8riQaR6yg;
    public static final long a92UlCVFR9N8;
    public static final long e9gEMXR7LXtO;
    public final long PxuCJdSBwIXG;
    public static final gl Companion = new gl();
    public static final long lS5Rgt96tfkO = mm2.Y1f8riQaR6yg(4278190080L);

    static {
        mm2.Y1f8riQaR6yg(4282664004L);
        mm2.Y1f8riQaR6yg(4287137928L);
        mm2.Y1f8riQaR6yg(4291611852L);
        TSizfFm2Yiuu = mm2.Y1f8riQaR6yg(4294967295L);
        Y1f8riQaR6yg = mm2.Y1f8riQaR6yg(4294901760L);
        mm2.Y1f8riQaR6yg(4278255360L);
        e9gEMXR7LXtO = mm2.Y1f8riQaR6yg(4278190335L);
        mm2.Y1f8riQaR6yg(4294967040L);
        mm2.Y1f8riQaR6yg(4278255615L);
        mm2.Y1f8riQaR6yg(4294902015L);
        a92UlCVFR9N8 = mm2.TSizfFm2Yiuu(0);
        float[] fArr = wl.PxuCJdSBwIXG;
        RAsUl2FVSrh6 = mm2.lS5Rgt96tfkO(0.0f, 0.0f, 0.0f, 0.0f, wl.S9EYkSpbGuxq);
    }

    public /* synthetic */ hl(long j) {
        this.PxuCJdSBwIXG = j;
    }

    public static String OPXfSBeufaJ8(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(rtx2ld2ELZv4(j));
        sb.append(", ");
        sb.append(RAsUl2FVSrh6(j));
        sb.append(", ");
        sb.append(e9gEMXR7LXtO(j));
        sb.append(", ");
        sb.append(Y1f8riQaR6yg(j));
        sb.append(", ");
        return o0.QrzZRwfaDlRX(sb, a92UlCVFR9N8(j).PxuCJdSBwIXG, ')');
    }

    public static final long PxuCJdSBwIXG(long j, tl tlVar) {
        kr krVar;
        tl a92UlCVFR9N82 = a92UlCVFR9N8(j);
        ru1.Companion.getClass();
        int i = a92UlCVFR9N82.TSizfFm2Yiuu;
        int i2 = tlVar.TSizfFm2Yiuu;
        if ((i | i2) < 0) {
            krVar = ov2.pnx5pC0XzaCw(a92UlCVFR9N82, tlVar);
        } else {
            c81 c81Var = lr.PxuCJdSBwIXG;
            int i3 = i | (i2 << 6);
            Object lS5Rgt96tfkO2 = c81Var.lS5Rgt96tfkO(i3);
            if (lS5Rgt96tfkO2 == null) {
                lS5Rgt96tfkO2 = ov2.pnx5pC0XzaCw(a92UlCVFR9N82, tlVar);
                c81Var.rtx2ld2ELZv4(i3, lS5Rgt96tfkO2);
            }
            krVar = (kr) lS5Rgt96tfkO2;
        }
        return krVar.PxuCJdSBwIXG(j);
    }

    public static final float RAsUl2FVSrh6(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) jh0.xfACYKDMU6Dj((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - l80.PxuCJdSBwIXG;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final boolean TSizfFm2Yiuu(long j, long j2) {
        return j == j2;
    }

    public static final float Y1f8riQaR6yg(long j) {
        float xfACYKDMU6Dj;
        float f;
        if ((63 & j) == 0) {
            xfACYKDMU6Dj = (float) jh0.xfACYKDMU6Dj((j >>> 56) & 255);
            f = 255.0f;
        } else {
            xfACYKDMU6Dj = (float) jh0.xfACYKDMU6Dj((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return xfACYKDMU6Dj / f;
    }

    public static final tl a92UlCVFR9N8(long j) {
        float[] fArr = wl.PxuCJdSBwIXG;
        return wl.pnx5pC0XzaCw[(int) (j & 63)];
    }

    public static final float e9gEMXR7LXtO(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) jh0.xfACYKDMU6Dj((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - l80.PxuCJdSBwIXG;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static long lS5Rgt96tfkO(long j, float f) {
        return mm2.lS5Rgt96tfkO(rtx2ld2ELZv4(j), RAsUl2FVSrh6(j), e9gEMXR7LXtO(j), f, a92UlCVFR9N8(j));
    }

    public static final float rtx2ld2ELZv4(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) jh0.xfACYKDMU6Dj((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - l80.PxuCJdSBwIXG;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hl) {
            return this.PxuCJdSBwIXG == ((hl) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return OPXfSBeufaJ8(this.PxuCJdSBwIXG);
    }
}
