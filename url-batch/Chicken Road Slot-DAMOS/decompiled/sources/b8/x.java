package b8;

import b1.c0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements Map, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final x f1452u = new x(0, null, new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public transient u f1453d;

    /* renamed from: e, reason: collision with root package name */
    public transient v f1454e;

    /* renamed from: i, reason: collision with root package name */
    public transient w f1455i;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f1456r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f1457s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f1458t;

    public x(int i3, Object obj, Object[] objArr) {
        this.f1456r = obj;
        this.f1457s = objArr;
        this.f1458t = i3;
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
    public static x a(int i3, Object[] objArr, c0 c0Var) {
        boolean z10;
        int i10;
        char c10;
        Object obj;
        char c11;
        short[] sArr;
        boolean z11;
        int i11;
        ?? r16;
        boolean z12;
        boolean z13;
        int i12 = i3;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return f1452u;
        }
        Object obj2 = null;
        boolean z14 = false;
        int i13 = 1;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new x(1, null, objArr2);
        }
        i7.a.B(i12, objArr2.length >> 1);
        int k10 = i.k(i12);
        char c12 = 2;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z13 = false;
            i10 = 1;
        } else {
            int i14 = k10 - 1;
            if (k10 <= 128) {
                byte[] bArr = new byte[k10];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i15 * 2;
                    int i18 = i16 * 2;
                    Object obj3 = objArr2[i17];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i17 ^ i13];
                    Objects.requireNonNull(obj4);
                    int K = g8.b.K(obj3.hashCode());
                    while (true) {
                        int i19 = K & i14;
                        z11 = z14;
                        i11 = i13;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i18;
                            if (i16 < i15) {
                                objArr2[i18] = obj3;
                                objArr2[i18 ^ 1] = obj4;
                            }
                            i16++;
                        } else {
                            if (obj3.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj5 = objArr2[i21];
                                Objects.requireNonNull(obj5);
                                obj2 = new h(obj3, obj4, obj5);
                                objArr2[i21] = obj4;
                                break;
                            }
                            K = i19 + 1;
                            z14 = z11;
                            i13 = i11;
                        }
                    }
                    i15++;
                    z14 = z11;
                    i13 = i11;
                }
                z10 = z14;
                i10 = i13;
                if (i16 == i12) {
                    obj2 = bArr;
                    z13 = z10;
                } else {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[i10] = Integer.valueOf(i16);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i10 = 1;
                if (k10 > 32768) {
                    int[] iArr = new int[k10];
                    Arrays.fill(iArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i12) {
                        int i24 = i22 * 2;
                        int i25 = i23 * 2;
                        Object obj6 = objArr2[i24];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i24 ^ 1];
                        Objects.requireNonNull(obj7);
                        int K2 = g8.b.K(obj6.hashCode());
                        while (true) {
                            int i26 = K2 & i14;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i25;
                                if (i23 < i22) {
                                    objArr2[i25] = obj6;
                                    objArr2[i25 ^ 1] = obj7;
                                }
                                i23++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj6.equals(objArr2[i27])) {
                                    int i28 = i27 ^ 1;
                                    Object obj8 = objArr2[i28];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new h(obj6, obj7, obj8);
                                    objArr2[i28] = obj7;
                                    break;
                                }
                                K2 = i26 + 1;
                                c12 = c11;
                            }
                        }
                        i22++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i23 == i12) {
                        obj = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i23);
                        objArr3[c10] = obj2;
                        obj = objArr3;
                        r16 = z10;
                    }
                    z12 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z12) {
                        Object[] objArr4 = (Object[]) obj;
                        h hVar = (h) objArr4[c10];
                        if (c0Var == null) {
                            throw hVar.a();
                        }
                        c0Var.f955c = hVar;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i10]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i12 = intValue;
                    }
                    return new x(i12, obj9, objArr2);
                }
                sArr = new short[k10];
                Arrays.fill(sArr, (short) -1);
                int i29 = 0;
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = i30 * 2;
                    int i32 = i29 * 2;
                    Object obj11 = objArr2[i31];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i31 ^ 1];
                    Objects.requireNonNull(obj12);
                    int K3 = g8.b.K(obj11.hashCode());
                    while (true) {
                        int i33 = K3 & i14;
                        int i34 = sArr[i33] & 65535;
                        if (i34 == 65535) {
                            sArr[i33] = (short) i32;
                            if (i29 < i30) {
                                objArr2[i32] = obj11;
                                objArr2[i32 ^ 1] = obj12;
                            }
                            i29++;
                        } else {
                            if (obj11.equals(objArr2[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj13 = objArr2[i35];
                                Objects.requireNonNull(obj13);
                                obj2 = new h(obj11, obj12, obj13);
                                objArr2[i35] = obj12;
                                break;
                            }
                            K3 = i33 + 1;
                        }
                    }
                }
                if (i29 != i12) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i29), obj2};
                    z13 = z10;
                }
                obj2 = sArr;
                z13 = z10;
            }
        }
        c10 = 2;
        obj = obj2;
        r16 = z13;
        z12 = obj instanceof Object[];
        Object obj92 = obj;
        if (z12) {
        }
        return new x(i12, obj92, objArr2);
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
        w wVar = this.f1455i;
        if (wVar == null) {
            wVar = new w(this.f1457s, 1, this.f1458t);
            this.f1455i = wVar;
        }
        return wVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        u uVar = this.f1453d;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, this.f1457s, this.f1458t);
        this.f1453d = uVar2;
        return uVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((i) entrySet()).equals(((Map) obj).entrySet());
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
            Object[] objArr = this.f1457s;
            if (this.f1458t == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f1456r;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int K = g8.b.K(obj.hashCode());
                        while (true) {
                            int i3 = K & length;
                            int i10 = bArr[i3] & 255;
                            if (i10 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i10])) {
                                obj2 = objArr[i10 ^ 1];
                                break;
                            }
                            K = i3 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int K2 = g8.b.K(obj.hashCode());
                        while (true) {
                            int i11 = K2 & length2;
                            int i12 = sArr[i11] & 65535;
                            if (i12 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            K2 = i11 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int K3 = g8.b.K(obj.hashCode());
                        while (true) {
                            int i13 = K3 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            K3 = i13 + 1;
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
        u uVar = this.f1453d;
        if (uVar == null) {
            uVar = new u(this, this.f1457s, this.f1458t);
            this.f1453d = uVar;
        }
        return a.a.M(uVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        v vVar = this.f1454e;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this, new w(this.f1457s, 0, this.f1458t));
        this.f1454e = vVar2;
        return vVar2;
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
        return this.f1458t;
    }

    public final String toString() {
        int i3 = this.f1458t;
        c6.f.n(i3, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i3 * 8, 1073741824L));
        sb2.append('{');
        b0 it = ((u) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            d dVar = (d) it;
            if (!dVar.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) dVar.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        w wVar = this.f1455i;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f1457s, 1, this.f1458t);
        this.f1455i = wVar2;
        return wVar2;
    }
}
