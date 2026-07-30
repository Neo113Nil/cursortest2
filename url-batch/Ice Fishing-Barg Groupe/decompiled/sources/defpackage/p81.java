package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p81 {
    public Object[] PxuCJdSBwIXG;
    public n81 TSizfFm2Yiuu;
    public int lS5Rgt96tfkO;

    public p81(int i) {
        this.PxuCJdSBwIXG = i == 0 ? pe1.PxuCJdSBwIXG : new Object[i];
    }

    public final boolean OPXfSBeufaJ8() {
        return this.lS5Rgt96tfkO != 0;
    }

    public final void PxuCJdSBwIXG(Object obj) {
        int i = this.lS5Rgt96tfkO + 1;
        Object[] objArr = this.PxuCJdSBwIXG;
        if (objArr.length < i) {
            cpQdD2nAriOS(i, objArr);
        }
        Object[] objArr2 = this.PxuCJdSBwIXG;
        int i2 = this.lS5Rgt96tfkO;
        objArr2[i2] = obj;
        this.lS5Rgt96tfkO = i2 + 1;
    }

    public final void QrzZRwfaDlRX(int i) {
        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "Index ", " must be in 0..");
        BRwzKIf41E4i.append(this.lS5Rgt96tfkO - 1);
        throw new IndexOutOfBoundsException(BRwzKIf41E4i.toString());
    }

    public final int RAsUl2FVSrh6(Object obj) {
        Object[] objArr = this.PxuCJdSBwIXG;
        int i = 0;
        if (obj == null) {
            int i2 = this.lS5Rgt96tfkO;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.lS5Rgt96tfkO;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void TSizfFm2Yiuu(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.lS5Rgt96tfkO;
        int size = list.size() + i;
        Object[] objArr = this.PxuCJdSBwIXG;
        if (objArr.length < size) {
            cpQdD2nAriOS(size, objArr);
        }
        Object[] objArr2 = this.PxuCJdSBwIXG;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.lS5Rgt96tfkO = list.size() + this.lS5Rgt96tfkO;
    }

    public final void Y1f8riQaR6yg() {
        na.v6yxfmkxNKhL(0, this.lS5Rgt96tfkO, null, this.PxuCJdSBwIXG);
        this.lS5Rgt96tfkO = 0;
    }

    public final Object a92UlCVFR9N8(int i) {
        if (i >= 0 && i < this.lS5Rgt96tfkO) {
            return this.PxuCJdSBwIXG[i];
        }
        QrzZRwfaDlRX(i);
        throw null;
    }

    public final void cpQdD2nAriOS(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        na.VzNxmvWisHL1(objArr, objArr2, 0, 0, length);
        this.PxuCJdSBwIXG = objArr2;
    }

    public final Object dgRBjINgWbAK(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.lS5Rgt96tfkO)) {
            QrzZRwfaDlRX(i);
            throw null;
        }
        Object[] objArr = this.PxuCJdSBwIXG;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            na.VzNxmvWisHL1(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.lS5Rgt96tfkO - 1;
        this.lS5Rgt96tfkO = i3;
        objArr[i3] = null;
        return obj;
    }

    public final Object e9gEMXR7LXtO() {
        if (!rtx2ld2ELZv4()) {
            return this.PxuCJdSBwIXG[0];
        }
        rc1.RAsUl2FVSrh6("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p81) {
            p81 p81Var = (p81) obj;
            int i = p81Var.lS5Rgt96tfkO;
            int i2 = this.lS5Rgt96tfkO;
            if (i == i2) {
                Object[] objArr = this.PxuCJdSBwIXG;
                Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, i2);
                int i3 = nLZGh9p8gVSu.rtx2ld2ELZv4;
                int i4 = nLZGh9p8gVSu.OPXfSBeufaJ8;
                if (i3 > i4) {
                    return true;
                }
                while (cs0.wdg6QnbFHrFF(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void gPXPFXrUH4XX(int i) {
        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "Index ", " must be in 0..");
        BRwzKIf41E4i.append(this.lS5Rgt96tfkO);
        throw new IndexOutOfBoundsException(BRwzKIf41E4i.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final void lS5Rgt96tfkO(p81 p81Var) {
        p81Var.getClass();
        if (p81Var.rtx2ld2ELZv4()) {
            return;
        }
        int i = this.lS5Rgt96tfkO + p81Var.lS5Rgt96tfkO;
        Object[] objArr = this.PxuCJdSBwIXG;
        if (objArr.length < i) {
            cpQdD2nAriOS(i, objArr);
        }
        na.VzNxmvWisHL1(p81Var.PxuCJdSBwIXG, this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, 0, p81Var.lS5Rgt96tfkO);
        this.lS5Rgt96tfkO += p81Var.lS5Rgt96tfkO;
    }

    public final Object r3s1LDPKFs1S(int i, Object obj) {
        if (i < 0 || i >= this.lS5Rgt96tfkO) {
            QrzZRwfaDlRX(i);
            throw null;
        }
        Object[] objArr = this.PxuCJdSBwIXG;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final boolean rtx2ld2ELZv4() {
        return this.lS5Rgt96tfkO == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public final boolean wdg6QnbFHrFF(Object obj) {
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 < 0) {
            return false;
        }
        dgRBjINgWbAK(RAsUl2FVSrh6);
        return true;
    }

    public final void x50lh2ztY7Y5(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.lS5Rgt96tfkO) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.lS5Rgt96tfkO);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.PxuCJdSBwIXG;
                na.VzNxmvWisHL1(objArr, objArr, i, i2, i3);
            }
            int i4 = this.lS5Rgt96tfkO;
            int i5 = i4 - (i2 - i);
            na.v6yxfmkxNKhL(i5, i4, null, this.PxuCJdSBwIXG);
            this.lS5Rgt96tfkO = i5;
        }
    }

    public /* synthetic */ p81() {
        this(16);
    }
}
