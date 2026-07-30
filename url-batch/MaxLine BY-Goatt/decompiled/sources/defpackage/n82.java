package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n82 extends n11 {
    public static final n82 s = new n82(0, null, new Object[0]);
    private static final long serialVersionUID = 0;
    public final transient Object p;
    public final transient Object[] q;
    public final transient int r;

    public n82(int i, Object obj, Object[] objArr) {
        this.p = obj;
        this.q = objArr;
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n82 b(int i, Object[] objArr, yf yfVar) {
        boolean z;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return s;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new n82(1, null, objArr2);
        }
        zm3.n(i4, objArr2.length >> 1);
        int g = p11.g(i4);
        char c3 = 2;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i2 = 1;
        } else {
            int i6 = g - 1;
            if (g <= 128) {
                byte[] bArr = new byte[g];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj3 = objArr2[i9];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i9 ^ i5];
                    Objects.requireNonNull(obj4);
                    int c0 = l41.c0(obj3.hashCode());
                    while (true) {
                        int i11 = c0 & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArr2[i10] = obj3;
                                objArr2[i10 ^ 1] = obj4;
                            }
                            i8++;
                        } else {
                            if (obj3.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj5 = objArr2[i13];
                                Objects.requireNonNull(obj5);
                                obj2 = new l11(obj3, obj4, obj5);
                                objArr2[i13] = obj4;
                                break;
                            }
                            c0 = i11 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    obj2 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (g > 32768) {
                    int[] iArr = new int[g];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i14 * 2;
                        int i17 = i15 * 2;
                        Object obj6 = objArr2[i16];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i16 ^ 1];
                        Objects.requireNonNull(obj7);
                        int c02 = l41.c0(obj6.hashCode());
                        while (true) {
                            int i18 = c02 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i17;
                                if (i15 < i14) {
                                    objArr2[i17] = obj6;
                                    objArr2[i17 ^ 1] = obj7;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj8 = objArr2[i20];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new l11(obj6, obj7, obj8);
                                    objArr2[i20] = obj7;
                                    break;
                                }
                                c02 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z3) {
                        Object[] objArr4 = (Object[]) obj;
                        l11 l11Var = (l11) objArr4[c];
                        if (yfVar == null) {
                            throw l11Var.a();
                        }
                        yfVar.p = l11Var;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i4 = intValue;
                    }
                    return new n82(i4, obj9, objArr2);
                }
                sArr = new short[g];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i22 * 2;
                    int i24 = i21 * 2;
                    Object obj11 = objArr2[i23];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i23 ^ 1];
                    Objects.requireNonNull(obj12);
                    int c03 = l41.c0(obj11.hashCode());
                    while (true) {
                        int i25 = c03 & i6;
                        int i26 = sArr[i25] & 65535;
                        if (i26 == 65535) {
                            sArr[i25] = (short) i24;
                            if (i21 < i22) {
                                objArr2[i24] = obj11;
                                objArr2[i24 ^ 1] = obj12;
                            }
                            i21++;
                        } else {
                            if (obj11.equals(objArr2[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj13 = objArr2[i27];
                                Objects.requireNonNull(obj13);
                                obj2 = new l11(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                break;
                            }
                            c03 = i25 + 1;
                        }
                    }
                }
                if (i21 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj92 = obj;
        if (z3) {
        }
        return new n82(i4, obj92, objArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // defpackage.n11, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.q;
            if (this.r == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.p;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int c0 = l41.c0(obj.hashCode());
                        while (true) {
                            int i = c0 & length;
                            int i2 = bArr[i] & 255;
                            if (i2 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i2])) {
                                obj2 = objArr[i2 ^ 1];
                                break;
                            }
                            c0 = i + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int c02 = l41.c0(obj.hashCode());
                        while (true) {
                            int i3 = c02 & length2;
                            int i4 = sArr[i3] & 65535;
                            if (i4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                                break;
                            }
                            c02 = i3 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int c03 = l41.c0(obj.hashCode());
                        while (true) {
                            int i5 = c03 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            c03 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.r;
    }
}
