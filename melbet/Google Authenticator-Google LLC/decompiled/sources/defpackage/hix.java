package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hix extends her {
    public static final her b = new hix(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private hix(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static hix a(int i, Object[] objArr, hen henVar) {
        if (i == 0) {
            return (hix) b;
        }
        if (i == 1) {
            objArr[0].getClass();
            objArr[1].getClass();
            return new hix(null, objArr, 1);
        }
        hoq.P(i, objArr.length >> 1);
        Object p = p(objArr, i, hfm.d(i), 0);
        if (p instanceof Object[]) {
            Object[] objArr2 = (Object[]) p;
            iyi iyiVar = (iyi) objArr2[2];
            if (henVar == null) {
                throw iyiVar.c();
            }
            henVar.c = iyiVar;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue + intValue);
            p = obj;
            i = intValue;
        }
        return new hix(p, objArr, i);
    }

    static Object n(Object[] objArr, int i, int i2, int i3) {
        Object p = p(objArr, i, i2, i3);
        if (p instanceof Object[]) {
            throw ((iyi) ((Object[]) p)[2]).c();
        }
        return p;
    }

    static Object o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int af = hnu.af(obj2.hashCode());
            while (true) {
                int i3 = af & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                af = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int af2 = hnu.af(obj2.hashCode());
            while (true) {
                int i5 = af2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                af2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int af3 = hnu.af(obj2.hashCode());
            while (true) {
                int i6 = af3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                af3 = i6 + 1;
            }
        }
    }

    private static Object p(Object[] objArr, int i, int i2, int i3) {
        char c;
        int i4;
        int i5 = 1;
        if (i == 1) {
            objArr[i3].getClass();
            objArr[i3 ^ 1].getClass();
            return null;
        }
        int i6 = i2 - 1;
        char c2 = 2;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            iyi iyiVar = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < i) {
                int i9 = i7 + i7 + i3;
                int i10 = i8 + i8 + i3;
                Object obj = objArr[i9];
                obj.getClass();
                Object obj2 = objArr[i9 ^ i5];
                obj2.getClass();
                int af = hnu.af(obj.hashCode());
                while (true) {
                    int i11 = af & i6;
                    i4 = i5;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i8 < i7) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i8++;
                    } else {
                        if (obj.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj3 = objArr[i13];
                            obj3.getClass();
                            iyiVar = new iyi(obj, obj2, obj3, (byte[]) null);
                            objArr[i13] = obj2;
                            break;
                        }
                        af = i11 + 1;
                        i5 = i4;
                    }
                }
                i7++;
                i5 = i4;
            }
            int i14 = i5;
            if (i8 == i) {
                return bArr;
            }
            Integer valueOf = Integer.valueOf(i8);
            Object[] objArr2 = new Object[3];
            objArr2[0] = bArr;
            objArr2[i14] = valueOf;
            objArr2[2] = iyiVar;
            return objArr2;
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            iyi iyiVar2 = null;
            int i15 = 0;
            for (int i16 = 0; i16 < i; i16++) {
                int i17 = i16 + i16 + i3;
                int i18 = i15 + i15 + i3;
                Object obj4 = objArr[i17];
                obj4.getClass();
                Object obj5 = objArr[i17 ^ 1];
                obj5.getClass();
                int af2 = hnu.af(obj4.hashCode());
                while (true) {
                    int i19 = af2 & i6;
                    char c3 = (char) sArr[i19];
                    if (c3 == 65535) {
                        sArr[i19] = (short) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj4;
                            objArr[i18 ^ 1] = obj5;
                        }
                        i15++;
                    } else {
                        if (obj4.equals(objArr[c3])) {
                            int i20 = c3 ^ 1;
                            Object obj6 = objArr[i20];
                            obj6.getClass();
                            iyi iyiVar3 = new iyi(obj4, obj5, obj6, (byte[]) null);
                            objArr[i20] = obj5;
                            iyiVar2 = iyiVar3;
                            break;
                        }
                        af2 = i19 + 1;
                    }
                }
            }
            return i15 == i ? sArr : new Object[]{sArr, Integer.valueOf(i15), iyiVar2};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        iyi iyiVar4 = null;
        int i21 = 0;
        int i22 = 0;
        while (i21 < i) {
            int i23 = i21 + i21 + i3;
            int i24 = i22 + i22 + i3;
            Object obj7 = objArr[i23];
            obj7.getClass();
            Object obj8 = objArr[i23 ^ 1];
            obj8.getClass();
            int af3 = hnu.af(obj7.hashCode());
            while (true) {
                int i25 = af3 & i6;
                int i26 = iArr[i25];
                if (i26 == -1) {
                    iArr[i25] = i24;
                    if (i22 < i21) {
                        objArr[i24] = obj7;
                        objArr[i24 ^ 1] = obj8;
                    }
                    i22++;
                    c = c2;
                } else {
                    c = c2;
                    if (obj7.equals(objArr[i26])) {
                        int i27 = i26 ^ 1;
                        Object obj9 = objArr[i27];
                        obj9.getClass();
                        iyiVar4 = new iyi(obj7, obj8, obj9, (byte[]) null);
                        objArr[i27] = obj8;
                        break;
                    }
                    af3 = i25 + 1;
                    c2 = c;
                }
            }
            i21++;
            c2 = c;
        }
        char c4 = c2;
        if (i22 == i) {
            return iArr;
        }
        Integer valueOf2 = Integer.valueOf(i22);
        Object[] objArr3 = new Object[3];
        objArr3[0] = iArr;
        objArr3[1] = valueOf2;
        objArr3[c4] = iyiVar4;
        return objArr3;
    }

    @Override // defpackage.her
    public final heb b() {
        return new hiw(this.c, 1, this.d);
    }

    @Override // defpackage.her
    public final boolean e() {
        return false;
    }

    @Override // defpackage.her
    public final hfm f() {
        return new hiu(this, this.c, 0, this.d);
    }

    @Override // defpackage.her
    public final hfm g() {
        return new hiv(this, new hiw(this.c, 0, this.d));
    }

    @Override // defpackage.her, java.util.Map
    public final Object get(Object obj) {
        Object o = o(this.e, this.c, this.d, 0, obj);
        if (o == null) {
            return null;
        }
        return o;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.her
    public Object writeReplace() {
        return super.writeReplace();
    }
}
