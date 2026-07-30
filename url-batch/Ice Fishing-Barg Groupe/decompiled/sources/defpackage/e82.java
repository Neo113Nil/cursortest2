package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e82 {
    public final le0 PxuCJdSBwIXG;
    public l81 TSizfFm2Yiuu;
    public int dgRBjINgWbAK;
    public Object lS5Rgt96tfkO;
    public boolean wdg6QnbFHrFF;
    public int Y1f8riQaR6yg = -1;
    public final v81 e9gEMXR7LXtO = th0.cpQdD2nAriOS();
    public final v81 a92UlCVFR9N8 = new v81();
    public final w81 RAsUl2FVSrh6 = new w81();
    public final f91 rtx2ld2ELZv4 = new f91(new ty[16]);
    public final sf0 OPXfSBeufaJ8 = new sf0(1, this);
    public final v81 x50lh2ztY7Y5 = th0.cpQdD2nAriOS();
    public final HashMap cpQdD2nAriOS = new HashMap();

    public e82(le0 le0Var) {
        this.PxuCJdSBwIXG = le0Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean PxuCJdSBwIXG(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e82.PxuCJdSBwIXG(java.util.Set):boolean");
    }

    public final void TSizfFm2Yiuu(Object obj, Object obj2) {
        v81 v81Var = this.e9gEMXR7LXtO;
        th0.rZjpSjn4zoMv(v81Var, obj2, obj);
        if (!(obj2 instanceof ty) || v81Var.TSizfFm2Yiuu(obj2)) {
            return;
        }
        th0.BjEWd04qc7Mw(this.x50lh2ztY7Y5, obj2);
        this.cpQdD2nAriOS.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y1f8riQaR6yg() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        v81 v81Var = this.a92UlCVFR9N8;
        long[] jArr3 = v81Var.PxuCJdSBwIXG;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = v81Var.lS5Rgt96tfkO[i6];
                        j2 = j5;
                        l81 l81Var = (l81) v81Var.TSizfFm2Yiuu[i6];
                        obj.getClass();
                        boolean jyegZNwi31qc = ((fi1) obj).jyegZNwi31qc();
                        if (!jyegZNwi31qc) {
                            Object[] objArr = l81Var.lS5Rgt96tfkO;
                            int[] iArr = l81Var.TSizfFm2Yiuu;
                            long[] jArr4 = l81Var.PxuCJdSBwIXG;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = jyegZNwi31qc;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                TSizfFm2Yiuu(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jyegZNwi31qc = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    v81Var.x50lh2ztY7Y5(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = jyegZNwi31qc;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    public final void lS5Rgt96tfkO(Object obj, int i, Object obj2, l81 l81Var) {
        int i2;
        if (this.dgRBjINgWbAK > 0) {
            return;
        }
        int TSizfFm2Yiuu = l81Var.TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu < 0) {
            TSizfFm2Yiuu = ~TSizfFm2Yiuu;
            i2 = -1;
        } else {
            i2 = l81Var.TSizfFm2Yiuu[TSizfFm2Yiuu];
        }
        l81Var.lS5Rgt96tfkO[TSizfFm2Yiuu] = obj;
        l81Var.TSizfFm2Yiuu[TSizfFm2Yiuu] = i;
        if ((obj instanceof ty) && i2 != i) {
            sy OPXfSBeufaJ8 = ((ty) obj).OPXfSBeufaJ8();
            this.cpQdD2nAriOS.put(obj, OPXfSBeufaJ8.a92UlCVFR9N8);
            l81 l81Var2 = OPXfSBeufaJ8.e9gEMXR7LXtO;
            v81 v81Var = this.x50lh2ztY7Y5;
            th0.BjEWd04qc7Mw(v81Var, obj);
            Object[] objArr = l81Var2.lS5Rgt96tfkO;
            long[] jArr = l81Var2.PxuCJdSBwIXG;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                p92 p92Var = (p92) objArr[(i3 << 3) + i5];
                                if (p92Var instanceof q92) {
                                    ((q92) p92Var).RAsUl2FVSrh6(2);
                                }
                                th0.rtx2ld2ELZv4(v81Var, p92Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof q92) {
                ((q92) obj).RAsUl2FVSrh6(2);
            }
            th0.rtx2ld2ELZv4(this.e9gEMXR7LXtO, obj, obj2);
        }
    }
}
