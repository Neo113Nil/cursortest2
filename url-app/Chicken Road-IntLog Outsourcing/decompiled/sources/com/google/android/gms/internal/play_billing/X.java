package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class X implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final X f5121g = new X(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient U f5122a;

    /* renamed from: b, reason: collision with root package name */
    public transient V f5123b;

    /* renamed from: c, reason: collision with root package name */
    public transient W f5124c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f5125d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5126e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5127f;

    public X(Object obj, Object[] objArr, int i2) {
        this.f5125d = obj;
        this.f5126e = objArr;
        this.f5127f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static X a(int i2, Object[] objArr, B3.d dVar) {
        short[] sArr;
        char c2;
        char c6;
        Object[] objArr2;
        int i3 = i2;
        Object[] objArr3 = objArr;
        if (i3 == 0) {
            return f5121g;
        }
        int i6 = 1;
        Object obj = null;
        if (i3 == 1) {
            Objects.requireNonNull(objArr3[0]);
            Objects.requireNonNull(objArr3[1]);
            return new X(null, objArr3, 1);
        }
        AbstractC0325d1.u(i3, objArr3.length >> 1);
        int h3 = H.h(i2);
        if (i3 == 1) {
            Objects.requireNonNull(objArr3[0]);
            Objects.requireNonNull(objArr3[1]);
            i3 = 1;
            c2 = 1;
            c6 = 2;
        } else {
            int i7 = h3 - 1;
            char c7 = 65535;
            if (h3 <= 128) {
                byte[] bArr = new byte[h3];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i3) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj2 = objArr3[i11];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr3[i11 ^ i6];
                    Objects.requireNonNull(obj3);
                    int c8 = AbstractC0325d1.c(obj2.hashCode());
                    while (true) {
                        int i12 = c8 & i7;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr3[i10] = obj2;
                                objArr3[i10 ^ 1] = obj3;
                            }
                            i9++;
                        } else {
                            if (obj2.equals(objArr3[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj4 = objArr3[i14];
                                Objects.requireNonNull(obj4);
                                obj = new D(obj2, obj3, obj4);
                                objArr3[i14] = obj3;
                                break;
                            }
                            c8 = i12 + 1;
                        }
                    }
                    i8++;
                    i6 = 1;
                }
                if (i9 == i3) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i9), obj};
                    c6 = 2;
                    c2 = 1;
                }
            } else {
                if (h3 <= 32768) {
                    sArr = new short[h3];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i3; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj5 = objArr3[i18];
                        Objects.requireNonNull(obj5);
                        Object obj6 = objArr3[i18 ^ 1];
                        Objects.requireNonNull(obj6);
                        int c9 = AbstractC0325d1.c(obj5.hashCode());
                        while (true) {
                            int i19 = c9 & i7;
                            char c10 = (char) sArr[i19];
                            if (c10 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArr3[i17] = obj5;
                                    objArr3[i17 ^ 1] = obj6;
                                }
                                i15++;
                            } else {
                                if (obj5.equals(objArr3[c10])) {
                                    int i20 = c10 ^ 1;
                                    Object obj7 = objArr3[i20];
                                    Objects.requireNonNull(obj7);
                                    D d6 = new D(obj5, obj6, obj7);
                                    objArr3[i20] = obj6;
                                    obj = d6;
                                    break;
                                }
                                c9 = i19 + 1;
                            }
                        }
                    }
                    if (i15 != i3) {
                        Integer valueOf = Integer.valueOf(i15);
                        c2 = 1;
                        c6 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i21 = 1;
                    sArr = new int[h3];
                    Arrays.fill((int[]) sArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i3) {
                        int i24 = i23 + i23;
                        int i25 = i22 + i22;
                        Object obj8 = objArr3[i25];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr3[i25 ^ i21];
                        Objects.requireNonNull(obj9);
                        int c11 = AbstractC0325d1.c(obj8.hashCode());
                        while (true) {
                            int i26 = c11 & i7;
                            ?? r15 = sArr[i26];
                            if (r15 == c7) {
                                sArr[i26] = i24;
                                if (i23 < i22) {
                                    objArr3[i24] = obj8;
                                    objArr3[i24 ^ 1] = obj9;
                                }
                                i23++;
                            } else {
                                if (obj8.equals(objArr3[r15])) {
                                    int i27 = r15 ^ 1;
                                    Object obj10 = objArr3[i27];
                                    Objects.requireNonNull(obj10);
                                    D d7 = new D(obj8, obj9, obj10);
                                    objArr3[i27] = obj9;
                                    obj = d7;
                                    break;
                                }
                                c11 = i26 + 1;
                                c7 = 65535;
                            }
                        }
                        i22++;
                        i21 = 1;
                        c7 = 65535;
                    }
                    if (i23 != i3) {
                        c2 = 1;
                        c6 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i23), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c2 = 1;
            }
            c6 = 2;
            c2 = 1;
        }
        boolean z = obj instanceof Object[];
        Object obj11 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            D d8 = (D) objArr4[c6];
            if (dVar == null) {
                throw d8.a();
            }
            dVar.f278d = d8;
            Object obj12 = objArr4[0];
            int intValue = ((Integer) objArr4[c2]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj11 = obj12;
            i3 = intValue;
        }
        return new X(obj11, objArr3, i3);
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
        W w3 = this.f5124c;
        if (w3 == null) {
            w3 = new W(1, this.f5127f, this.f5126e);
            this.f5124c = w3;
        }
        return w3.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        U u5 = this.f5122a;
        if (u5 != null) {
            return u5;
        }
        U u6 = new U(this, this.f5126e, this.f5127f);
        this.f5122a = u6;
        return u6;
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
            int i2 = this.f5127f;
            Object[] objArr = this.f5126e;
            if (i2 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f5125d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int c2 = AbstractC0325d1.c(obj.hashCode());
                        while (true) {
                            int i3 = c2 & length;
                            int i6 = bArr[i3] & 255;
                            if (i6 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            c2 = i3 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int c6 = AbstractC0325d1.c(obj.hashCode());
                        while (true) {
                            int i7 = c6 & length2;
                            char c7 = (char) sArr[i7];
                            if (c7 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c7])) {
                                obj2 = objArr[c7 ^ 1];
                                break;
                            }
                            c6 = i7 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int c8 = AbstractC0325d1.c(obj.hashCode());
                        while (true) {
                            int i8 = c8 & length3;
                            int i9 = iArr[i8];
                            if (i9 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            c8 = i8 + 1;
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
        U u5 = this.f5122a;
        if (u5 == null) {
            u5 = new U(this, this.f5126e, this.f5127f);
            this.f5122a = u5;
        }
        Iterator it = u5.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        V v4 = this.f5123b;
        if (v4 != null) {
            return v4;
        }
        V v5 = new V(this, new W(0, this.f5127f, this.f5126e));
        this.f5123b = v5;
        return v5;
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
        return this.f5127f;
    }

    public final String toString() {
        int i2 = this.f5127f;
        AbstractC0325d1.j(i2, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i2 * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((U) entrySet()).iterator();
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
        W w3 = this.f5124c;
        if (w3 != null) {
            return w3;
        }
        W w5 = new W(1, this.f5127f, this.f5126e);
        this.f5124c = w5;
        return w5;
    }
}
