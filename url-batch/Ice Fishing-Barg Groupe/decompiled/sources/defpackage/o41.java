package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o41 implements Map, Serializable, gu0 {
    public static final k41 Companion = new k41();
    public static final o41 S9EYkSpbGuxq;
    public p41 BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public Object[] OPXfSBeufaJ8;
    public int QrzZRwfaDlRX;
    public p41 RfyTYNmI9Srp;
    public q41 XL4ISE6Oc65B;
    public int cpQdD2nAriOS;
    public int[] dgRBjINgWbAK;
    public int gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public Object[] rtx2ld2ELZv4;
    public int[] wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    static {
        o41 o41Var = new o41(0);
        o41Var.EcgxDIVH5in8 = true;
        S9EYkSpbGuxq = o41Var;
    }

    public o41(int i) {
        if (i < 0) {
            u9.XL4ISE6Oc65B("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        Companion.getClass();
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.rtx2ld2ELZv4 = objArr;
        this.OPXfSBeufaJ8 = null;
        this.wdg6QnbFHrFF = iArr;
        this.dgRBjINgWbAK = new int[highestOneBit];
        this.x50lh2ztY7Y5 = 2;
        this.cpQdD2nAriOS = 0;
        this.r3s1LDPKFs1S = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int OPXfSBeufaJ8(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.r3s1LDPKFs1S;
    }

    public final int PxuCJdSBwIXG(Object obj) {
        TSizfFm2Yiuu();
        while (true) {
            int OPXfSBeufaJ8 = OPXfSBeufaJ8(obj);
            int i = this.x50lh2ztY7Y5 * 2;
            int length = this.dgRBjINgWbAK.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.dgRBjINgWbAK;
                int i3 = iArr[OPXfSBeufaJ8];
                if (i3 == 0) {
                    int i4 = this.cpQdD2nAriOS;
                    Object[] objArr = this.rtx2ld2ELZv4;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.cpQdD2nAriOS = i5;
                        objArr[i4] = obj;
                        this.wdg6QnbFHrFF[i4] = OPXfSBeufaJ8;
                        iArr[OPXfSBeufaJ8] = i5;
                        this.gPXPFXrUH4XX++;
                        this.QrzZRwfaDlRX++;
                        if (i2 > this.x50lh2ztY7Y5) {
                            this.x50lh2ztY7Y5 = i2;
                        }
                        return i4;
                    }
                    a92UlCVFR9N8(1);
                } else {
                    if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        wdg6QnbFHrFF(this.dgRBjINgWbAK.length * 2);
                        break;
                    }
                    OPXfSBeufaJ8 = OPXfSBeufaJ8 == 0 ? this.dgRBjINgWbAK.length - 1 : OPXfSBeufaJ8 - 1;
                }
            }
        }
    }

    public final int RAsUl2FVSrh6(Object obj) {
        int OPXfSBeufaJ8 = OPXfSBeufaJ8(obj);
        int i = this.x50lh2ztY7Y5;
        while (true) {
            int i2 = this.dgRBjINgWbAK[OPXfSBeufaJ8];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            OPXfSBeufaJ8 = OPXfSBeufaJ8 == 0 ? this.dgRBjINgWbAK.length - 1 : OPXfSBeufaJ8 - 1;
        }
    }

    public final void TSizfFm2Yiuu() {
        if (this.EcgxDIVH5in8) {
            throw new UnsupportedOperationException();
        }
    }

    public final void Y1f8riQaR6yg(boolean z) {
        int i;
        Object[] objArr = this.OPXfSBeufaJ8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.cpQdD2nAriOS;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.wdg6QnbFHrFF;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.rtx2ld2ELZv4;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.dgRBjINgWbAK[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        kj0.ryVscX7ZL4Ux(this.rtx2ld2ELZv4, i3, i);
        if (objArr != null) {
            kj0.ryVscX7ZL4Ux(objArr, i3, this.cpQdD2nAriOS);
        }
        this.cpQdD2nAriOS = i3;
    }

    public final void a92UlCVFR9N8(int i) {
        Object[] objArr = this.rtx2ld2ELZv4;
        int length = objArr.length;
        int i2 = this.cpQdD2nAriOS;
        int i3 = length - i2;
        int i4 = i2 - this.gPXPFXrUH4XX;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            Y1f8riQaR6yg(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
            int length2 = objArr.length;
            s2OOm9zPNm0h.getClass();
            int Y1f8riQaR6yg = S2OOm9zPNm0h.Y1f8riQaR6yg(length2, i5);
            Object[] objArr2 = this.rtx2ld2ELZv4;
            objArr2.getClass();
            this.rtx2ld2ELZv4 = Arrays.copyOf(objArr2, Y1f8riQaR6yg);
            Object[] objArr3 = this.OPXfSBeufaJ8;
            this.OPXfSBeufaJ8 = objArr3 != null ? Arrays.copyOf(objArr3, Y1f8riQaR6yg) : null;
            this.wdg6QnbFHrFF = Arrays.copyOf(this.wdg6QnbFHrFF, Y1f8riQaR6yg);
            Companion.getClass();
            int highestOneBit = Integer.highestOneBit((Y1f8riQaR6yg >= 1 ? Y1f8riQaR6yg : 1) * 3);
            if (highestOneBit > this.dgRBjINgWbAK.length) {
                wdg6QnbFHrFF(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        TSizfFm2Yiuu();
        int i = this.cpQdD2nAriOS - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.wdg6QnbFHrFF;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.dgRBjINgWbAK[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        kj0.ryVscX7ZL4Ux(this.rtx2ld2ELZv4, 0, this.cpQdD2nAriOS);
        Object[] objArr = this.OPXfSBeufaJ8;
        if (objArr != null) {
            kj0.ryVscX7ZL4Ux(objArr, 0, this.cpQdD2nAriOS);
        }
        this.gPXPFXrUH4XX = 0;
        this.cpQdD2nAriOS = 0;
        this.QrzZRwfaDlRX++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return RAsUl2FVSrh6(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return rtx2ld2ELZv4(obj) >= 0;
    }

    public final void dgRBjINgWbAK(int i) {
        int i2;
        int i3;
        int OPXfSBeufaJ8;
        int[] iArr;
        Object[] objArr = this.rtx2ld2ELZv4;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.OPXfSBeufaJ8;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.wdg6QnbFHrFF[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.dgRBjINgWbAK.length - 1 : i4 - 1;
                int[] iArr2 = this.dgRBjINgWbAK;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.x50lh2ztY7Y5) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    OPXfSBeufaJ8 = OPXfSBeufaJ8(this.rtx2ld2ELZv4[i3]) - i4;
                    iArr = this.dgRBjINgWbAK;
                }
            } while ((OPXfSBeufaJ8 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.wdg6QnbFHrFF[i3] = i5;
        }
        this.wdg6QnbFHrFF[i] = -1;
        this.gPXPFXrUH4XX--;
        this.QrzZRwfaDlRX++;
    }

    public final boolean e9gEMXR7LXtO(Collection collection) {
        boolean wdg6QnbFHrFF;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int RAsUl2FVSrh6 = RAsUl2FVSrh6(entry.getKey());
                    if (RAsUl2FVSrh6 < 0) {
                        wdg6QnbFHrFF = false;
                    } else {
                        Object[] objArr = this.OPXfSBeufaJ8;
                        objArr.getClass();
                        wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(objArr[RAsUl2FVSrh6], entry.getValue());
                    }
                    if (!wdg6QnbFHrFF) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        p41 p41Var = this.RfyTYNmI9Srp;
        if (p41Var != null) {
            return p41Var;
        }
        p41 p41Var2 = new p41(this, 0);
        this.RfyTYNmI9Srp = p41Var2;
        return p41Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.gPXPFXrUH4XX == map.size() && e9gEMXR7LXtO(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 < 0) {
            return null;
        }
        Object[] objArr = this.OPXfSBeufaJ8;
        objArr.getClass();
        return objArr[RAsUl2FVSrh6];
    }

    @Override // java.util.Map
    public final int hashCode() {
        l41 l41Var = new l41(this, 0);
        int i = 0;
        while (l41Var.hasNext()) {
            int i2 = l41Var.rtx2ld2ELZv4;
            o41 o41Var = (o41) l41Var.dgRBjINgWbAK;
            if (i2 >= o41Var.cpQdD2nAriOS) {
                u9.RfyTYNmI9Srp();
                return 0;
            }
            l41Var.rtx2ld2ELZv4 = i2 + 1;
            l41Var.OPXfSBeufaJ8 = i2;
            Object obj = o41Var.rtx2ld2ELZv4[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = o41Var.OPXfSBeufaJ8;
            objArr.getClass();
            Object obj2 = objArr[l41Var.OPXfSBeufaJ8];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            l41Var.TSizfFm2Yiuu();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.gPXPFXrUH4XX == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        p41 p41Var = this.BRwzKIf41E4i;
        if (p41Var != null) {
            return p41Var;
        }
        p41 p41Var2 = new p41(this, 1);
        this.BRwzKIf41E4i = p41Var2;
        return p41Var2;
    }

    public final o41 lS5Rgt96tfkO() {
        TSizfFm2Yiuu();
        this.EcgxDIVH5in8 = true;
        if (this.gPXPFXrUH4XX > 0) {
            return this;
        }
        o41 o41Var = S9EYkSpbGuxq;
        o41Var.getClass();
        return o41Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        TSizfFm2Yiuu();
        int PxuCJdSBwIXG = PxuCJdSBwIXG(obj);
        Object[] objArr = this.OPXfSBeufaJ8;
        if (objArr == null) {
            int length = this.rtx2ld2ELZv4.length;
            if (length < 0) {
                u9.XL4ISE6Oc65B("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.OPXfSBeufaJ8 = objArr;
        }
        if (PxuCJdSBwIXG >= 0) {
            objArr[PxuCJdSBwIXG] = obj2;
            return null;
        }
        int i = (-PxuCJdSBwIXG) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        TSizfFm2Yiuu();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        a92UlCVFR9N8(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int PxuCJdSBwIXG = PxuCJdSBwIXG(entry.getKey());
            Object[] objArr = this.OPXfSBeufaJ8;
            if (objArr == null) {
                int length = this.rtx2ld2ELZv4.length;
                if (length < 0) {
                    u9.XL4ISE6Oc65B("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.OPXfSBeufaJ8 = objArr;
                }
            }
            if (PxuCJdSBwIXG >= 0) {
                objArr[PxuCJdSBwIXG] = entry.getValue();
            } else {
                int i = (-PxuCJdSBwIXG) - 1;
                if (!cs0.wdg6QnbFHrFF(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        TSizfFm2Yiuu();
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 < 0) {
            return null;
        }
        Object[] objArr = this.OPXfSBeufaJ8;
        objArr.getClass();
        Object obj2 = objArr[RAsUl2FVSrh6];
        dgRBjINgWbAK(RAsUl2FVSrh6);
        return obj2;
    }

    public final int rtx2ld2ELZv4(Object obj) {
        int i = this.cpQdD2nAriOS;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.wdg6QnbFHrFF[i] >= 0) {
                Object[] objArr = this.OPXfSBeufaJ8;
                objArr.getClass();
                if (cs0.wdg6QnbFHrFF(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.gPXPFXrUH4XX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.gPXPFXrUH4XX * 3) + 2);
        sb.append("{");
        int i = 0;
        l41 l41Var = new l41(this, 0);
        while (l41Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = l41Var.rtx2ld2ELZv4;
            o41 o41Var = (o41) l41Var.dgRBjINgWbAK;
            if (i2 >= o41Var.cpQdD2nAriOS) {
                u9.RfyTYNmI9Srp();
                return null;
            }
            l41Var.rtx2ld2ELZv4 = i2 + 1;
            l41Var.OPXfSBeufaJ8 = i2;
            Object obj = o41Var.rtx2ld2ELZv4[i2];
            if (obj == o41Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = o41Var.OPXfSBeufaJ8;
            objArr.getClass();
            Object obj2 = objArr[l41Var.OPXfSBeufaJ8];
            if (obj2 == o41Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            l41Var.TSizfFm2Yiuu();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        q41 q41Var = this.XL4ISE6Oc65B;
        if (q41Var != null) {
            return q41Var;
        }
        q41 q41Var2 = new q41(0, this);
        this.XL4ISE6Oc65B = q41Var2;
        return q41Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.wdg6QnbFHrFF[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void wdg6QnbFHrFF(int i) {
        this.QrzZRwfaDlRX++;
        int i2 = 0;
        if (this.cpQdD2nAriOS > this.gPXPFXrUH4XX) {
            Y1f8riQaR6yg(false);
        }
        this.dgRBjINgWbAK = new int[i];
        Companion.getClass();
        this.r3s1LDPKFs1S = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.cpQdD2nAriOS) {
            int i3 = i2 + 1;
            int OPXfSBeufaJ8 = OPXfSBeufaJ8(this.rtx2ld2ELZv4[i2]);
            int i4 = this.x50lh2ztY7Y5;
            while (true) {
                int[] iArr = this.dgRBjINgWbAK;
                if (iArr[OPXfSBeufaJ8] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    u9.rtx2ld2ELZv4("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                OPXfSBeufaJ8 = OPXfSBeufaJ8 == 0 ? iArr.length - 1 : OPXfSBeufaJ8 - 1;
            }
        }
    }

    public o41() {
        this(8);
    }
}
