package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class t52 {
    public Object[] OPXfSBeufaJ8;
    public int[] rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public t52(int i) {
        this.rtx2ld2ELZv4 = i == 0 ? mm2.TSizfFm2Yiuu : new int[i];
        this.OPXfSBeufaJ8 = i == 0 ? mm2.e9gEMXR7LXtO : new Object[i << 1];
    }

    public final int PxuCJdSBwIXG(Object obj) {
        int i = this.wdg6QnbFHrFF * 2;
        Object[] objArr = this.OPXfSBeufaJ8;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object RAsUl2FVSrh6(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.wdg6QnbFHrFF) {
            z = true;
        }
        if (!z) {
            u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.OPXfSBeufaJ8;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int TSizfFm2Yiuu(Object obj) {
        return obj == null ? Y1f8riQaR6yg() : lS5Rgt96tfkO(obj.hashCode(), obj);
    }

    public final int Y1f8riQaR6yg() {
        int i = this.wdg6QnbFHrFF;
        if (i == 0) {
            return -1;
        }
        int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(this.rtx2ld2ELZv4, i, 0);
        if (VhhvGxCb8gfr < 0 || this.OPXfSBeufaJ8[VhhvGxCb8gfr << 1] == null) {
            return VhhvGxCb8gfr;
        }
        int i2 = VhhvGxCb8gfr + 1;
        while (i2 < i && this.rtx2ld2ELZv4[i2] == 0) {
            if (this.OPXfSBeufaJ8[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = VhhvGxCb8gfr - 1; i3 >= 0 && this.rtx2ld2ELZv4[i3] == 0; i3--) {
            if (this.OPXfSBeufaJ8[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object a92UlCVFR9N8(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.wdg6QnbFHrFF)) {
            u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.OPXfSBeufaJ8;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.rtx2ld2ELZv4;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                na.PsecLrZVVK61(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.OPXfSBeufaJ8;
                na.VzNxmvWisHL1(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.OPXfSBeufaJ8;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.rtx2ld2ELZv4 = Arrays.copyOf(iArr, i7);
            this.OPXfSBeufaJ8 = Arrays.copyOf(this.OPXfSBeufaJ8, i7 << 1);
            if (i2 != this.wdg6QnbFHrFF) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                na.PsecLrZVVK61(iArr, this.rtx2ld2ELZv4, 0, 0, i);
                na.VzNxmvWisHL1(objArr, this.OPXfSBeufaJ8, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                na.PsecLrZVVK61(iArr, this.rtx2ld2ELZv4, i, i8, i2);
                na.VzNxmvWisHL1(objArr, this.OPXfSBeufaJ8, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.wdg6QnbFHrFF) {
            throw new ConcurrentModificationException();
        }
        this.wdg6QnbFHrFF = i4;
        return obj;
    }

    public final void clear() {
        if (this.wdg6QnbFHrFF > 0) {
            this.rtx2ld2ELZv4 = mm2.TSizfFm2Yiuu;
            this.OPXfSBeufaJ8 = mm2.e9gEMXR7LXtO;
            this.wdg6QnbFHrFF = 0;
        }
        if (this.wdg6QnbFHrFF > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return TSizfFm2Yiuu(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return PxuCJdSBwIXG(obj) >= 0;
    }

    public final Object e9gEMXR7LXtO(int i) {
        boolean z = false;
        if (i >= 0 && i < this.wdg6QnbFHrFF) {
            z = true;
        }
        if (z) {
            return this.OPXfSBeufaJ8[i << 1];
        }
        u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof t52) {
                int i = this.wdg6QnbFHrFF;
                if (i != ((t52) obj).wdg6QnbFHrFF) {
                    return false;
                }
                t52 t52Var = (t52) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e9gEMXR7LXtO = e9gEMXR7LXtO(i2);
                    Object rtx2ld2ELZv4 = rtx2ld2ELZv4(i2);
                    Object obj2 = t52Var.get(e9gEMXR7LXtO);
                    if (rtx2ld2ELZv4 == null) {
                        if (obj2 != null || !t52Var.containsKey(e9gEMXR7LXtO)) {
                            return false;
                        }
                    } else if (!rtx2ld2ELZv4.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.wdg6QnbFHrFF != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.wdg6QnbFHrFF;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e9gEMXR7LXtO2 = e9gEMXR7LXtO(i4);
                Object rtx2ld2ELZv42 = rtx2ld2ELZv4(i4);
                Object obj3 = ((Map) obj).get(e9gEMXR7LXtO2);
                if (rtx2ld2ELZv42 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e9gEMXR7LXtO2)) {
                        return false;
                    }
                } else if (!rtx2ld2ELZv42.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu >= 0) {
            return this.OPXfSBeufaJ8[(TSizfFm2Yiuu << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        return TSizfFm2Yiuu >= 0 ? this.OPXfSBeufaJ8[(TSizfFm2Yiuu << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.rtx2ld2ELZv4;
        Object[] objArr = this.OPXfSBeufaJ8;
        int i = this.wdg6QnbFHrFF;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.wdg6QnbFHrFF <= 0;
    }

    public final int lS5Rgt96tfkO(int i, Object obj) {
        int i2 = this.wdg6QnbFHrFF;
        if (i2 == 0) {
            return -1;
        }
        int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(this.rtx2ld2ELZv4, i2, i);
        if (VhhvGxCb8gfr < 0 || cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[VhhvGxCb8gfr << 1])) {
            return VhhvGxCb8gfr;
        }
        int i3 = VhhvGxCb8gfr + 1;
        while (i3 < i2 && this.rtx2ld2ELZv4[i3] == i) {
            if (cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = VhhvGxCb8gfr - 1; i4 >= 0 && this.rtx2ld2ELZv4[i4] == i; i4--) {
            if (cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.wdg6QnbFHrFF;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int lS5Rgt96tfkO = obj != null ? lS5Rgt96tfkO(hashCode, obj) : Y1f8riQaR6yg();
        if (lS5Rgt96tfkO >= 0) {
            int i2 = (lS5Rgt96tfkO << 1) + 1;
            Object[] objArr = this.OPXfSBeufaJ8;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~lS5Rgt96tfkO;
        int[] iArr = this.rtx2ld2ELZv4;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.rtx2ld2ELZv4 = Arrays.copyOf(iArr, i4);
            this.OPXfSBeufaJ8 = Arrays.copyOf(this.OPXfSBeufaJ8, i4 << 1);
            if (i != this.wdg6QnbFHrFF) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.rtx2ld2ELZv4;
            int i5 = i3 + 1;
            na.PsecLrZVVK61(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.OPXfSBeufaJ8;
            na.VzNxmvWisHL1(objArr2, objArr2, i5 << 1, i3 << 1, this.wdg6QnbFHrFF << 1);
        }
        int i6 = this.wdg6QnbFHrFF;
        if (i == i6) {
            int[] iArr3 = this.rtx2ld2ELZv4;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.OPXfSBeufaJ8;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.wdg6QnbFHrFF = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu < 0 || !cs0.wdg6QnbFHrFF(obj2, rtx2ld2ELZv4(TSizfFm2Yiuu))) {
            return false;
        }
        a92UlCVFR9N8(TSizfFm2Yiuu);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu < 0 || !cs0.wdg6QnbFHrFF(obj2, rtx2ld2ELZv4(TSizfFm2Yiuu))) {
            return false;
        }
        RAsUl2FVSrh6(TSizfFm2Yiuu, obj3);
        return true;
    }

    public final Object rtx2ld2ELZv4(int i) {
        boolean z = false;
        if (i >= 0 && i < this.wdg6QnbFHrFF) {
            z = true;
        }
        if (z) {
            return this.OPXfSBeufaJ8[(i << 1) + 1];
        }
        u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int size() {
        return this.wdg6QnbFHrFF;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.wdg6QnbFHrFF * 28);
        sb.append('{');
        int i = this.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e9gEMXR7LXtO = e9gEMXR7LXtO(i2);
            if (e9gEMXR7LXtO != sb) {
                sb.append(e9gEMXR7LXtO);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object rtx2ld2ELZv4 = rtx2ld2ELZv4(i2);
            if (rtx2ld2ELZv4 != sb) {
                sb.append(rtx2ld2ELZv4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu >= 0) {
            return a92UlCVFR9N8(TSizfFm2Yiuu);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu >= 0) {
            return RAsUl2FVSrh6(TSizfFm2Yiuu, obj2);
        }
        return null;
    }
}
