package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s82 implements Cloneable {
    public /* synthetic */ int[] OPXfSBeufaJ8;
    public /* synthetic */ int dgRBjINgWbAK;
    public /* synthetic */ boolean rtx2ld2ELZv4;
    public /* synthetic */ Object[] wdg6QnbFHrFF;

    public s82() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.OPXfSBeufaJ8 = new int[i4];
        this.wdg6QnbFHrFF = new Object[i4];
    }

    /* renamed from: PxuCJdSBwIXG, reason: merged with bridge method [inline-methods] */
    public final s82 clone() {
        Object clone = super.clone();
        clone.getClass();
        s82 s82Var = (s82) clone;
        s82Var.OPXfSBeufaJ8 = (int[]) this.OPXfSBeufaJ8.clone();
        s82Var.wdg6QnbFHrFF = (Object[]) this.wdg6QnbFHrFF.clone();
        return s82Var;
    }

    public final int TSizfFm2Yiuu(int i) {
        if (this.rtx2ld2ELZv4) {
            zv.wdg6QnbFHrFF(this);
        }
        return this.OPXfSBeufaJ8[i];
    }

    public final void Y1f8riQaR6yg(int i, Object obj) {
        int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(this.OPXfSBeufaJ8, this.dgRBjINgWbAK, i);
        if (VhhvGxCb8gfr >= 0) {
            this.wdg6QnbFHrFF[VhhvGxCb8gfr] = obj;
            return;
        }
        int i2 = ~VhhvGxCb8gfr;
        int i3 = this.dgRBjINgWbAK;
        if (i2 < i3) {
            Object[] objArr = this.wdg6QnbFHrFF;
            if (objArr[i2] == zv.r3s1LDPKFs1S) {
                this.OPXfSBeufaJ8[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.rtx2ld2ELZv4 && i3 >= this.OPXfSBeufaJ8.length) {
            zv.wdg6QnbFHrFF(this);
            i2 = ~mm2.VhhvGxCb8gfr(this.OPXfSBeufaJ8, this.dgRBjINgWbAK, i);
        }
        int i4 = this.dgRBjINgWbAK;
        if (i4 >= this.OPXfSBeufaJ8.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.OPXfSBeufaJ8 = Arrays.copyOf(this.OPXfSBeufaJ8, i8);
            this.wdg6QnbFHrFF = Arrays.copyOf(this.wdg6QnbFHrFF, i8);
        }
        int i9 = this.dgRBjINgWbAK;
        if (i9 - i2 != 0) {
            int[] iArr = this.OPXfSBeufaJ8;
            int i10 = i2 + 1;
            na.PsecLrZVVK61(iArr, iArr, i10, i2, i9);
            Object[] objArr2 = this.wdg6QnbFHrFF;
            na.VzNxmvWisHL1(objArr2, objArr2, i10, i2, this.dgRBjINgWbAK);
        }
        this.OPXfSBeufaJ8[i2] = i;
        this.wdg6QnbFHrFF[i2] = obj;
        this.dgRBjINgWbAK++;
    }

    public final Object a92UlCVFR9N8(int i) {
        if (this.rtx2ld2ELZv4) {
            zv.wdg6QnbFHrFF(this);
        }
        Object[] objArr = this.wdg6QnbFHrFF;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int e9gEMXR7LXtO() {
        if (this.rtx2ld2ELZv4) {
            zv.wdg6QnbFHrFF(this);
        }
        return this.dgRBjINgWbAK;
    }

    public final Object lS5Rgt96tfkO(int i) {
        Object obj;
        int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(this.OPXfSBeufaJ8, this.dgRBjINgWbAK, i);
        if (VhhvGxCb8gfr < 0 || (obj = this.wdg6QnbFHrFF[VhhvGxCb8gfr]) == zv.r3s1LDPKFs1S) {
            return null;
        }
        return obj;
    }

    public final String toString() {
        if (e9gEMXR7LXtO() <= 0) {
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
            Object a92UlCVFR9N8 = a92UlCVFR9N8(i2);
            if (a92UlCVFR9N8 != this) {
                sb.append(a92UlCVFR9N8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
