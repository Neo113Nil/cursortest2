package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class C implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C f5805g = new C(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient C0358z f5806a;

    /* renamed from: b, reason: collision with root package name */
    public transient A f5807b;

    /* renamed from: c, reason: collision with root package name */
    public transient B f5808c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f5809d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5810e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5811f;

    public C(Object obj, Object[] objArr, int i4) {
        this.f5809d = obj;
        this.f5810e = objArr;
        this.f5811f = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01be  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C a(int i4, Object[] objArr, L3.h hVar) {
        int i5;
        boolean z;
        int i6;
        char c4;
        Object obj;
        char c5;
        short[] sArr;
        boolean z4;
        int i7;
        ?? r16;
        boolean z5;
        boolean z6;
        int i8 = i4;
        Object[] objArr2 = objArr;
        if (i8 == 0) {
            return f5805g;
        }
        Object obj2 = null;
        boolean z7 = false;
        int i9 = 1;
        if (i8 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new C(null, objArr2, 1);
        }
        U.i.I(i8, objArr2.length >> 1);
        char c6 = 2;
        int max = Math.max(i8, 2);
        if (max < 751619276) {
            i5 = Integer.highestOneBit(max - 1);
            do {
                i5 += i5;
            } while (i5 * 0.7d < max);
        } else {
            i5 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i8 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z6 = false;
            i8 = 1;
            i6 = 1;
        } else {
            int i10 = i5 - 1;
            if (i5 <= 128) {
                byte[] bArr = new byte[i5];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj3 = objArr2[i14];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i14 ^ i9];
                    Objects.requireNonNull(obj4);
                    int w4 = AbstractC0347t0.w(obj3.hashCode());
                    while (true) {
                        int i15 = w4 & i10;
                        z4 = z7;
                        i7 = i9;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArr2[i13] = obj3;
                                objArr2[i13 ^ 1] = obj4;
                            }
                            i12++;
                        } else {
                            if (obj3.equals(objArr2[i16])) {
                                int i17 = i16 ^ 1;
                                Object obj5 = objArr2[i17];
                                Objects.requireNonNull(obj5);
                                C0348u c0348u = new C0348u(obj3, obj4, obj5);
                                objArr2[i17] = obj4;
                                obj2 = c0348u;
                                break;
                            }
                            w4 = i15 + 1;
                            z7 = z4;
                            i9 = i7;
                        }
                    }
                    i11++;
                    z7 = z4;
                    i9 = i7;
                }
                z = z7;
                i6 = i9;
                if (i12 == i8) {
                    c4 = 2;
                    obj = bArr;
                    r16 = z;
                    z5 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z5) {
                        Object[] objArr3 = (Object[]) obj;
                        C0348u c0348u2 = (C0348u) objArr3[c4];
                        if (hVar == null) {
                            throw c0348u2.a();
                        }
                        hVar.f1681c = c0348u2;
                        Object obj7 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i6]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj6 = obj7;
                        i8 = intValue;
                    }
                    return new C(obj6, objArr2, i8);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i6] = Integer.valueOf(i12);
                sArr[2] = obj2;
                obj2 = sArr;
                z6 = z;
            } else {
                z = false;
                i6 = 1;
                if (i5 > 32768) {
                    int[] iArr = new int[i5];
                    Arrays.fill(iArr, -1);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i8) {
                        int i20 = i19 + i19;
                        int i21 = i18 + i18;
                        Object obj8 = objArr2[i21];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i21 ^ 1];
                        Objects.requireNonNull(obj9);
                        int w5 = AbstractC0347t0.w(obj8.hashCode());
                        while (true) {
                            int i22 = w5 & i10;
                            int i23 = iArr[i22];
                            if (i23 == -1) {
                                iArr[i22] = i20;
                                if (i19 < i18) {
                                    objArr2[i20] = obj8;
                                    objArr2[i20 ^ 1] = obj9;
                                }
                                i19++;
                                c5 = c6;
                            } else {
                                c5 = c6;
                                if (obj8.equals(objArr2[i23])) {
                                    int i24 = i23 ^ 1;
                                    Object obj10 = objArr2[i24];
                                    Objects.requireNonNull(obj10);
                                    C0348u c0348u3 = new C0348u(obj8, obj9, obj10);
                                    objArr2[i24] = obj9;
                                    obj2 = c0348u3;
                                    break;
                                }
                                w5 = i22 + 1;
                                c6 = c5;
                            }
                        }
                        i18++;
                        c6 = c5;
                    }
                    c4 = c6;
                    if (i19 == i8) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i19);
                        objArr4[c4] = obj2;
                        obj = objArr4;
                        r16 = z;
                    }
                    z5 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z5) {
                    }
                    return new C(obj62, objArr2, i8);
                }
                sArr = new short[i5];
                Arrays.fill(sArr, (short) -1);
                int i25 = 0;
                for (int i26 = 0; i26 < i8; i26++) {
                    int i27 = i25 + i25;
                    int i28 = i26 + i26;
                    Object obj11 = objArr2[i28];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i28 ^ 1];
                    Objects.requireNonNull(obj12);
                    int w6 = AbstractC0347t0.w(obj11.hashCode());
                    while (true) {
                        int i29 = w6 & i10;
                        char c7 = (char) sArr[i29];
                        if (c7 == 65535) {
                            sArr[i29] = (short) i27;
                            if (i25 < i26) {
                                objArr2[i27] = obj11;
                                objArr2[i27 ^ 1] = obj12;
                            }
                            i25++;
                        } else {
                            if (obj11.equals(objArr2[c7])) {
                                int i30 = c7 ^ 1;
                                Object obj13 = objArr2[i30];
                                Objects.requireNonNull(obj13);
                                C0348u c0348u4 = new C0348u(obj11, obj12, obj13);
                                objArr2[i30] = obj12;
                                obj2 = c0348u4;
                                break;
                            }
                            w6 = i29 + 1;
                        }
                    }
                }
                if (i25 != i8) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i25), obj2};
                    z6 = z;
                }
                obj2 = sArr;
                z6 = z;
            }
        }
        c4 = 2;
        obj = obj2;
        r16 = z6;
        z5 = obj instanceof Object[];
        Object obj622 = obj;
        if (z5) {
        }
        return new C(obj622, objArr2, i8);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        B b4 = this.f5808c;
        if (b4 == null) {
            b4 = new B(this.f5810e, 1, this.f5811f);
            this.f5808c = b4;
        }
        return b4.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0358z c0358z = this.f5806a;
        if (c0358z != null) {
            return c0358z;
        }
        C0358z c0358z2 = new C0358z(this, this.f5810e, this.f5811f);
        this.f5806a = c0358z2;
        return c0358z2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i4 = this.f5811f;
            Object[] objArr = this.f5810e;
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f5809d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int w4 = AbstractC0347t0.w(obj.hashCode());
                        while (true) {
                            int i5 = w4 & length;
                            int i6 = bArr[i5] & 255;
                            if (i6 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            w4 = i5 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int w5 = AbstractC0347t0.w(obj.hashCode());
                        while (true) {
                            int i7 = w5 & length2;
                            char c4 = (char) sArr[i7];
                            if (c4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c4])) {
                                obj2 = objArr[c4 ^ 1];
                                break;
                            }
                            w5 = i7 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int w6 = AbstractC0347t0.w(obj.hashCode());
                        while (true) {
                            int i8 = w6 & length3;
                            int i9 = iArr[i8];
                            if (i9 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            w6 = i8 + 1;
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
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0358z c0358z = this.f5806a;
        if (c0358z == null) {
            c0358z = new C0358z(this, this.f5810e, this.f5811f);
            this.f5806a = c0358z;
        }
        Iterator it = c0358z.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 += next != null ? next.hashCode() : 0;
        }
        return i4;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        A a3 = this.f5807b;
        if (a3 != null) {
            return a3;
        }
        A a4 = new A(this, new B(this.f5810e, 0, this.f5811f));
        this.f5807b = a4;
        return a4;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5811f;
    }

    public final String toString() {
        int i4 = this.f5811f;
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C0358z) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        B b4 = this.f5808c;
        if (b4 != null) {
            return b4;
        }
        B b5 = new B(this.f5810e, 1, this.f5811f);
        this.f5808c = b5;
        return b5;
    }
}
