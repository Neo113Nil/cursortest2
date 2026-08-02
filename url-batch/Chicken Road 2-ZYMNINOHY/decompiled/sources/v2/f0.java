package v2;

import a.AbstractC0124a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class f0 implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f15629g = new f0(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient c0 f15630a;

    /* renamed from: b, reason: collision with root package name */
    public transient d0 f15631b;

    /* renamed from: c, reason: collision with root package name */
    public transient e0 f15632c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f15633d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f15634e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f15635f;

    public f0(Object obj, Object[] objArr, int i4) {
        this.f15633d = obj;
        this.f15634e = objArr;
        this.f15635f = i4;
    }

    public static f0 a(Map map) {
        if ((map instanceof f0) && !(map instanceof SortedMap)) {
            f0 f0Var = (f0) map;
            f0Var.getClass();
            return f0Var;
        }
        Set entrySet = map.entrySet();
        L3.h hVar = new L3.h(entrySet != null ? entrySet.size() : 4);
        hVar.e(entrySet);
        return hVar.a(true);
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
    public static f0 b(int i4, Object[] objArr, L3.h hVar) {
        boolean z;
        int i5;
        char c4;
        Object obj;
        char c5;
        short[] sArr;
        boolean z4;
        int i6;
        ?? r16;
        boolean z5;
        boolean z6;
        int i7 = i4;
        Object[] objArr2 = objArr;
        if (i7 == 0) {
            return f15629g;
        }
        Object obj2 = null;
        boolean z7 = false;
        int i8 = 1;
        if (i7 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new f0(null, objArr2, 1);
        }
        AbstractC0124a.q(i7, objArr2.length >> 1);
        int i9 = M.i(i7);
        char c6 = 2;
        if (i7 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z6 = false;
            i5 = 1;
        } else {
            int i10 = i9 - 1;
            if (i9 <= 128) {
                byte[] bArr = new byte[i9];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i7) {
                    int i13 = i11 * 2;
                    int i14 = i12 * 2;
                    Object obj3 = objArr2[i13];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i13 ^ i8];
                    Objects.requireNonNull(obj4);
                    int q4 = r.q(obj3.hashCode());
                    while (true) {
                        int i15 = q4 & i10;
                        z4 = z7;
                        i6 = i8;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i14;
                            if (i12 < i11) {
                                objArr2[i14] = obj3;
                                objArr2[i14 ^ 1] = obj4;
                            }
                            i12++;
                        } else {
                            if (obj3.equals(objArr2[i16])) {
                                int i17 = i16 ^ 1;
                                Object obj5 = objArr2[i17];
                                Objects.requireNonNull(obj5);
                                obj2 = new K(obj3, obj4, obj5);
                                objArr2[i17] = obj4;
                                break;
                            }
                            q4 = i15 + 1;
                            z7 = z4;
                            i8 = i6;
                        }
                    }
                    i11++;
                    z7 = z4;
                    i8 = i6;
                }
                z = z7;
                i5 = i8;
                if (i12 == i7) {
                    obj2 = bArr;
                    z6 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i5] = Integer.valueOf(i12);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z6 = z;
                }
            } else {
                z = false;
                i5 = 1;
                if (i9 > 32768) {
                    int[] iArr = new int[i9];
                    Arrays.fill(iArr, -1);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i7) {
                        int i20 = i18 * 2;
                        int i21 = i19 * 2;
                        Object obj6 = objArr2[i20];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i20 ^ 1];
                        Objects.requireNonNull(obj7);
                        int q5 = r.q(obj6.hashCode());
                        while (true) {
                            int i22 = q5 & i10;
                            int i23 = iArr[i22];
                            if (i23 == -1) {
                                iArr[i22] = i21;
                                if (i19 < i18) {
                                    objArr2[i21] = obj6;
                                    objArr2[i21 ^ 1] = obj7;
                                }
                                i19++;
                                c5 = c6;
                            } else {
                                c5 = c6;
                                if (obj6.equals(objArr2[i23])) {
                                    int i24 = i23 ^ 1;
                                    Object obj8 = objArr2[i24];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new K(obj6, obj7, obj8);
                                    objArr2[i24] = obj7;
                                    break;
                                }
                                q5 = i22 + 1;
                                c6 = c5;
                            }
                        }
                        i18++;
                        c6 = c5;
                    }
                    c4 = c6;
                    if (i19 == i7) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i19);
                        objArr3[c4] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z5 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z5) {
                        Object[] objArr4 = (Object[]) obj;
                        K k4 = (K) objArr4[c4];
                        if (hVar == null) {
                            throw k4.a();
                        }
                        hVar.f1681c = k4;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i5]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i7 = intValue;
                    }
                    return new f0(obj9, objArr2, i7);
                }
                sArr = new short[i9];
                Arrays.fill(sArr, (short) -1);
                int i25 = 0;
                for (int i26 = 0; i26 < i7; i26++) {
                    int i27 = i26 * 2;
                    int i28 = i25 * 2;
                    Object obj11 = objArr2[i27];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i27 ^ 1];
                    Objects.requireNonNull(obj12);
                    int q6 = r.q(obj11.hashCode());
                    while (true) {
                        int i29 = q6 & i10;
                        int i30 = sArr[i29] & 65535;
                        if (i30 == 65535) {
                            sArr[i29] = (short) i28;
                            if (i25 < i26) {
                                objArr2[i28] = obj11;
                                objArr2[i28 ^ 1] = obj12;
                            }
                            i25++;
                        } else {
                            if (obj11.equals(objArr2[i30])) {
                                int i31 = i30 ^ 1;
                                Object obj13 = objArr2[i31];
                                Objects.requireNonNull(obj13);
                                obj2 = new K(obj11, obj12, obj13);
                                objArr2[i31] = obj12;
                                break;
                            }
                            q6 = i29 + 1;
                        }
                    }
                }
                if (i25 != i7) {
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
        Object obj92 = obj;
        if (z5) {
        }
        return new f0(obj92, objArr2, i7);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final M entrySet() {
        c0 c0Var = this.f15630a;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, this.f15634e, this.f15635f);
        this.f15630a = c0Var2;
        return c0Var2;
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
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final M keySet() {
        d0 d0Var = this.f15631b;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this, new e0(this.f15634e, 0, this.f15635f));
        this.f15631b = d0Var2;
        return d0Var2;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final D values() {
        e0 e0Var = this.f15632c;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this.f15634e, 1, this.f15635f);
        this.f15632c = e0Var2;
        return e0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return r.f(this, obj);
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
            Object[] objArr = this.f15634e;
            if (this.f15635f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f15633d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int q4 = r.q(obj.hashCode());
                        while (true) {
                            int i4 = q4 & length;
                            int i5 = bArr[i4] & 255;
                            if (i5 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i5])) {
                                obj2 = objArr[i5 ^ 1];
                                break;
                            }
                            q4 = i4 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int q5 = r.q(obj.hashCode());
                        while (true) {
                            int i6 = q5 & length2;
                            int i7 = sArr[i6] & 65535;
                            if (i7 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i7])) {
                                obj2 = objArr[i7 ^ 1];
                                break;
                            }
                            q5 = i6 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int q6 = r.q(obj.hashCode());
                        while (true) {
                            int i8 = q6 & length3;
                            int i9 = iArr[i8];
                            if (i9 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            q6 = i8 + 1;
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
        return r.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
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
        return this.f15635f;
    }

    public final String toString() {
        int i4 = this.f15635f;
        r.d(i4, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb.append('{');
        p0 it = ((c0) entrySet()).iterator();
        boolean z = true;
        while (true) {
            G g4 = (G) it;
            if (!g4.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) g4.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }
}
