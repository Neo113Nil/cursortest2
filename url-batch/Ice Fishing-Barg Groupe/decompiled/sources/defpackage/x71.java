package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x71 {
    public final v81 PxuCJdSBwIXG;

    public /* synthetic */ x71(v81 v81Var) {
        this.PxuCJdSBwIXG = v81Var;
    }

    public static final Object PxuCJdSBwIXG(v81 v81Var) {
        Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(null);
        if (RAsUl2FVSrh6 == null) {
            return null;
        }
        if (!(RAsUl2FVSrh6 instanceof p81)) {
            v81Var.dgRBjINgWbAK(null);
            return RAsUl2FVSrh6;
        }
        p81 p81Var = (p81) RAsUl2FVSrh6;
        if (p81Var.rtx2ld2ELZv4()) {
            rc1.RAsUl2FVSrh6("List is empty.");
            return null;
        }
        int i = p81Var.lS5Rgt96tfkO - 1;
        Object a92UlCVFR9N8 = p81Var.a92UlCVFR9N8(i);
        p81Var.dgRBjINgWbAK(i);
        a92UlCVFR9N8.getClass();
        if (p81Var.rtx2ld2ELZv4()) {
            v81Var.dgRBjINgWbAK(null);
        }
        if (p81Var.lS5Rgt96tfkO == 1) {
            v81Var.cpQdD2nAriOS(null, p81Var.e9gEMXR7LXtO());
        }
        return a92UlCVFR9N8;
    }

    public static final p81 lS5Rgt96tfkO(v81 v81Var) {
        if (v81Var.OPXfSBeufaJ8()) {
            p81 p81Var = pe1.lS5Rgt96tfkO;
            p81Var.getClass();
            return p81Var;
        }
        p81 p81Var2 = new p81();
        Object[] objArr = v81Var.TSizfFm2Yiuu;
        long[] jArr = v81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof p81) {
                                p81Var2.lS5Rgt96tfkO((p81) obj);
                            } else {
                                obj.getClass();
                                p81Var2.PxuCJdSBwIXG(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return p81Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x71) {
            return this.PxuCJdSBwIXG.equals(((x71) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.PxuCJdSBwIXG + ')';
    }
}
