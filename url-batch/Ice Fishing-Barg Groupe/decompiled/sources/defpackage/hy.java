package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface hy {
    default long IAToe7bXGz4N(long j) {
        if (j != 9205357640488583168L) {
            return hq0.e9gEMXR7LXtO(uy1Qfkdvj4xZ(Float.intBitsToFloat((int) (j >> 32))), uy1Qfkdvj4xZ(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        p10.Companion.getClass();
        return 9205357640488583168L;
    }

    default int POWyO8hTM6YC(float f) {
        float e6tOsSdd2EFb = e6tOsSdd2EFb(f);
        if (Float.isInfinite(e6tOsSdd2EFb)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(e6tOsSdd2EFb);
    }

    default long bEKsvqmvPh2y(long j) {
        if (j == 9205357640488583168L) {
            a62.Companion.getClass();
            return 9205357640488583168L;
        }
        float e6tOsSdd2EFb = e6tOsSdd2EFb(p10.lS5Rgt96tfkO(j));
        float e6tOsSdd2EFb2 = e6tOsSdd2EFb(p10.PxuCJdSBwIXG(j));
        return (Float.floatToRawIntBits(e6tOsSdd2EFb) << 32) | (Float.floatToRawIntBits(e6tOsSdd2EFb2) & 4294967295L);
    }

    default float e4HgwifUDUCA(int i) {
        return i / lS5Rgt96tfkO();
    }

    default float e6tOsSdd2EFb(float f) {
        return lS5Rgt96tfkO() * f;
    }

    float lS5Rgt96tfkO();

    default long pnx5pC0XzaCw(float f) {
        float[] fArr = nc0.PxuCJdSBwIXG;
        if (r3s1LDPKFs1S() < 1.03f) {
            return ki0.wLFCmsViZrNT(4294967296L, f / r3s1LDPKFs1S());
        }
        mc0 PxuCJdSBwIXG = nc0.PxuCJdSBwIXG(r3s1LDPKFs1S());
        return ki0.wLFCmsViZrNT(4294967296L, PxuCJdSBwIXG != null ? PxuCJdSBwIXG.PxuCJdSBwIXG(f) : f / r3s1LDPKFs1S());
    }

    default float qudtW7lwm99e(long j) {
        long lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j);
        jj2.Companion.getClass();
        if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
            gp0.lS5Rgt96tfkO("Only Sp can convert to Px");
        }
        return e6tOsSdd2EFb(xfACYKDMU6Dj(j));
    }

    float r3s1LDPKFs1S();

    default long uVlwi32qvXeJ(float f) {
        return pnx5pC0XzaCw(uy1Qfkdvj4xZ(f));
    }

    default float uy1Qfkdvj4xZ(float f) {
        return f / lS5Rgt96tfkO();
    }

    default float xfACYKDMU6Dj(long j) {
        long lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j);
        jj2.Companion.getClass();
        if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
            gp0.lS5Rgt96tfkO("Only Sp can convert to Px");
        }
        float[] fArr = nc0.PxuCJdSBwIXG;
        if (r3s1LDPKFs1S() < 1.03f) {
            return r3s1LDPKFs1S() * hj2.TSizfFm2Yiuu(j);
        }
        mc0 PxuCJdSBwIXG = nc0.PxuCJdSBwIXG(r3s1LDPKFs1S());
        if (PxuCJdSBwIXG != null) {
            return PxuCJdSBwIXG.lS5Rgt96tfkO(hj2.TSizfFm2Yiuu(j));
        }
        return r3s1LDPKFs1S() * hj2.TSizfFm2Yiuu(j);
    }
}
