package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p31 implements Cloneable {
    public /* synthetic */ long[] OPXfSBeufaJ8;
    public /* synthetic */ int dgRBjINgWbAK;
    public /* synthetic */ boolean rtx2ld2ELZv4;
    public /* synthetic */ Object[] wdg6QnbFHrFF;

    public p31(int i) {
        if (i == 0) {
            this.OPXfSBeufaJ8 = mm2.Y1f8riQaR6yg;
            this.wdg6QnbFHrFF = mm2.e9gEMXR7LXtO;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.OPXfSBeufaJ8 = new long[i5];
        this.wdg6QnbFHrFF = new Object[i5];
    }

    public final void PxuCJdSBwIXG() {
        int i = this.dgRBjINgWbAK;
        Object[] objArr = this.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.dgRBjINgWbAK = 0;
        this.rtx2ld2ELZv4 = false;
    }

    public final Object RAsUl2FVSrh6(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.dgRBjINgWbAK)) {
            u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.rtx2ld2ELZv4) {
            long[] jArr = this.OPXfSBeufaJ8;
            Object[] objArr = this.wdg6QnbFHrFF;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != hq0.x50lh2ztY7Y5) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.rtx2ld2ELZv4 = false;
            this.dgRBjINgWbAK = i3;
        }
        return this.wdg6QnbFHrFF[i];
    }

    public final long TSizfFm2Yiuu(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.dgRBjINgWbAK)) {
            u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.rtx2ld2ELZv4) {
            long[] jArr = this.OPXfSBeufaJ8;
            Object[] objArr = this.wdg6QnbFHrFF;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != hq0.x50lh2ztY7Y5) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.rtx2ld2ELZv4 = false;
            this.dgRBjINgWbAK = i3;
        }
        return this.OPXfSBeufaJ8[i];
    }

    public final void Y1f8riQaR6yg(long j, Object obj) {
        Object obj2 = hq0.x50lh2ztY7Y5;
        int S2OOm9zPNm0h = mm2.S2OOm9zPNm0h(this.OPXfSBeufaJ8, this.dgRBjINgWbAK, j);
        if (S2OOm9zPNm0h >= 0) {
            this.wdg6QnbFHrFF[S2OOm9zPNm0h] = obj;
            return;
        }
        int i = ~S2OOm9zPNm0h;
        int i2 = this.dgRBjINgWbAK;
        if (i < i2) {
            Object[] objArr = this.wdg6QnbFHrFF;
            if (objArr[i] == obj2) {
                this.OPXfSBeufaJ8[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.rtx2ld2ELZv4) {
            long[] jArr = this.OPXfSBeufaJ8;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.wdg6QnbFHrFF;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.rtx2ld2ELZv4 = false;
                this.dgRBjINgWbAK = i3;
                i = ~mm2.S2OOm9zPNm0h(this.OPXfSBeufaJ8, i3, j);
            }
        }
        int i5 = this.dgRBjINgWbAK;
        if (i5 >= this.OPXfSBeufaJ8.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.OPXfSBeufaJ8 = Arrays.copyOf(this.OPXfSBeufaJ8, i9);
            this.wdg6QnbFHrFF = Arrays.copyOf(this.wdg6QnbFHrFF, i9);
        }
        int i10 = this.dgRBjINgWbAK;
        if (i10 - i != 0) {
            long[] jArr2 = this.OPXfSBeufaJ8;
            int i11 = i + 1;
            na.JTxCbbCwomzt(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.wdg6QnbFHrFF;
            na.VzNxmvWisHL1(objArr3, objArr3, i11, i, this.dgRBjINgWbAK);
        }
        this.OPXfSBeufaJ8[i] = j;
        this.wdg6QnbFHrFF[i] = obj;
        this.dgRBjINgWbAK++;
    }

    public final int a92UlCVFR9N8() {
        if (this.rtx2ld2ELZv4) {
            int i = this.dgRBjINgWbAK;
            long[] jArr = this.OPXfSBeufaJ8;
            Object[] objArr = this.wdg6QnbFHrFF;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != hq0.x50lh2ztY7Y5) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.rtx2ld2ELZv4 = false;
            this.dgRBjINgWbAK = i2;
        }
        return this.dgRBjINgWbAK;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        p31 p31Var = (p31) clone;
        p31Var.OPXfSBeufaJ8 = (long[]) this.OPXfSBeufaJ8.clone();
        p31Var.wdg6QnbFHrFF = (Object[]) this.wdg6QnbFHrFF.clone();
        return p31Var;
    }

    public final void e9gEMXR7LXtO(long j) {
        int S2OOm9zPNm0h = mm2.S2OOm9zPNm0h(this.OPXfSBeufaJ8, this.dgRBjINgWbAK, j);
        if (S2OOm9zPNm0h >= 0) {
            Object[] objArr = this.wdg6QnbFHrFF;
            Object obj = objArr[S2OOm9zPNm0h];
            Object obj2 = hq0.x50lh2ztY7Y5;
            if (obj != obj2) {
                objArr[S2OOm9zPNm0h] = obj2;
                this.rtx2ld2ELZv4 = true;
            }
        }
    }

    public final Object lS5Rgt96tfkO(long j) {
        Object obj;
        int S2OOm9zPNm0h = mm2.S2OOm9zPNm0h(this.OPXfSBeufaJ8, this.dgRBjINgWbAK, j);
        if (S2OOm9zPNm0h < 0 || (obj = this.wdg6QnbFHrFF[S2OOm9zPNm0h]) == hq0.x50lh2ztY7Y5) {
            return null;
        }
        return obj;
    }

    public final String toString() {
        if (a92UlCVFR9N8() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.dgRBjINgWbAK * 28);
        sb.append('{');
        int i = this.dgRBjINgWbAK;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(TSizfFm2Yiuu(i2));
            sb.append('=');
            Object RAsUl2FVSrh6 = RAsUl2FVSrh6(i2);
            if (RAsUl2FVSrh6 != sb) {
                sb.append(RAsUl2FVSrh6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ p31() {
        this(10);
    }
}
