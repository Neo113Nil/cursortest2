package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z22 implements l32, Iterable, fu0 {
    public v41 OPXfSBeufaJ8;
    public boolean dgRBjINgWbAK;
    public final v81 rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public z22() {
        long[] jArr = c02.PxuCJdSBwIXG;
        this.rtx2ld2ELZv4 = new v81();
    }

    @Override // defpackage.l32
    public final void PxuCJdSBwIXG(k32 k32Var, Object obj) {
        boolean z = obj instanceof nxJAScVArhE9;
        v81 v81Var = this.rtx2ld2ELZv4;
        if (z && v81Var.TSizfFm2Yiuu(k32Var)) {
            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(k32Var);
            RAsUl2FVSrh6.getClass();
            nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh6;
            nxJAScVArhE9 nxjascvarhe92 = (nxJAScVArhE9) obj;
            String str = nxjascvarhe92.PxuCJdSBwIXG;
            if (str == null) {
                str = nxjascvarhe9.PxuCJdSBwIXG;
            }
            xe0 xe0Var = nxjascvarhe92.lS5Rgt96tfkO;
            if (xe0Var == null) {
                xe0Var = nxjascvarhe9.lS5Rgt96tfkO;
            }
            v81Var.cpQdD2nAriOS(k32Var, new nxJAScVArhE9(str, xe0Var));
        } else {
            v81Var.cpQdD2nAriOS(k32Var, obj);
        }
        k32Var.getClass();
    }

    public final Object TSizfFm2Yiuu(k32 k32Var) {
        Object RAsUl2FVSrh6 = this.rtx2ld2ELZv4.RAsUl2FVSrh6(k32Var);
        if (RAsUl2FVSrh6 != null) {
            return RAsUl2FVSrh6;
        }
        throw new IllegalStateException("Key not present: " + k32Var + " - consider getOrElse or getOrNull");
    }

    public final void Y1f8riQaR6yg(z22 z22Var) {
        v81 v81Var = z22Var.rtx2ld2ELZv4;
        Object[] objArr = v81Var.lS5Rgt96tfkO;
        Object[] objArr2 = v81Var.TSizfFm2Yiuu;
        long[] jArr = v81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        k32 k32Var = (k32) obj;
                        v81 v81Var2 = this.rtx2ld2ELZv4;
                        Object RAsUl2FVSrh6 = v81Var2.RAsUl2FVSrh6(k32Var);
                        k32Var.getClass();
                        Object rtx2ld2ELZv4 = k32Var.lS5Rgt96tfkO.rtx2ld2ELZv4(RAsUl2FVSrh6, obj2);
                        if (rtx2ld2ELZv4 != null) {
                            v81Var2.cpQdD2nAriOS(k32Var, rtx2ld2ELZv4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z22)) {
            return false;
        }
        z22 z22Var = (z22) obj;
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, z22Var.rtx2ld2ELZv4) && this.wdg6QnbFHrFF == z22Var.wdg6QnbFHrFF && this.dgRBjINgWbAK == z22Var.dgRBjINgWbAK;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.dgRBjINgWbAK) + o0.Y1f8riQaR6yg(this.rtx2ld2ELZv4.hashCode() * 31, 31, this.wdg6QnbFHrFF);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        v41 v41Var = this.OPXfSBeufaJ8;
        if (v41Var == null) {
            v81 v81Var = this.rtx2ld2ELZv4;
            v81Var.getClass();
            v41 v41Var2 = new v41(v81Var);
            this.OPXfSBeufaJ8 = v41Var2;
            v41Var = v41Var2;
        }
        return ((h60) v41Var.entrySet()).iterator();
    }

    public final z22 lS5Rgt96tfkO() {
        z22 z22Var = new z22();
        z22Var.wdg6QnbFHrFF = this.wdg6QnbFHrFF;
        z22Var.dgRBjINgWbAK = this.dgRBjINgWbAK;
        v81 v81Var = z22Var.rtx2ld2ELZv4;
        v81Var.getClass();
        v81 v81Var2 = this.rtx2ld2ELZv4;
        v81Var2.getClass();
        Object[] objArr = v81Var2.lS5Rgt96tfkO;
        Object[] objArr2 = v81Var2.TSizfFm2Yiuu;
        long[] jArr = v81Var2.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            v81Var.cpQdD2nAriOS(objArr[i4], objArr2[i4]);
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
        return z22Var;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.wdg6QnbFHrFF) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.dgRBjINgWbAK) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        v81 v81Var = this.rtx2ld2ELZv4;
        Object[] objArr = v81Var.lS5Rgt96tfkO;
        Object[] objArr2 = v81Var.TSizfFm2Yiuu;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((k32) obj).PxuCJdSBwIXG);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return xi0.nxJAScVArhE9(this) + "{ " + ((Object) sb) + " }";
    }
}
