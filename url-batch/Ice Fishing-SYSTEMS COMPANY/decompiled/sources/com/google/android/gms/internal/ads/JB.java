package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class JB extends AbstractMap implements Serializable {

    /* renamed from: C, reason: collision with root package name */
    public static final Object f25738C = new Object();

    /* renamed from: A, reason: collision with root package name */
    public transient HB f25739A;

    /* renamed from: B, reason: collision with root package name */
    public transient CB f25740B;

    /* renamed from: n, reason: collision with root package name */
    public transient Object f25741n;

    /* renamed from: u, reason: collision with root package name */
    public transient int[] f25742u;

    /* renamed from: v, reason: collision with root package name */
    public transient Object[] f25743v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f25744w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f25745x = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: y, reason: collision with root package name */
    public transient int f25746y;

    /* renamed from: z, reason: collision with root package name */
    public transient HB f25747z;

    public JB() {
    }

    public final int[] a() {
        int[] iArr = this.f25742u;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f25743v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (e()) {
            return;
        }
        this.f25745x += 32;
        Map f6 = f();
        if (f6 != null) {
            this.f25745x = Math.min(Math.max(size(), 3), 1073741823);
            f6.clear();
            this.f25741n = null;
            this.f25746y = 0;
            return;
        }
        Arrays.fill(c(), 0, this.f25746y, (Object) null);
        Arrays.fill(d(), 0, this.f25746y, (Object) null);
        Object obj = this.f25741n;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f25746y, 0);
        this.f25746y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f6 = f();
        return f6 != null ? f6.containsKey(obj) : j(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f6 = f();
        if (f6 != null) {
            return f6.containsValue(obj);
        }
        for (int i = 0; i < this.f25746y; i++) {
            if (Objects.equals(obj, d()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Object[] d() {
        Object[] objArr = this.f25744w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean e() {
        return this.f25741n == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        HB hb = this.f25739A;
        if (hb != null) {
            return hb;
        }
        HB hb2 = new HB(this, 0);
        this.f25739A = hb2;
        return hb2;
    }

    public final Map f() {
        Object obj = this.f25741n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void g(int i, int i4) {
        Object obj = this.f25741n;
        Objects.requireNonNull(obj);
        int[] a9 = a();
        Object[] c4 = c();
        Object[] d2 = d();
        int size = size();
        int i9 = size - 1;
        if (i >= i9) {
            c4[i] = null;
            d2[i] = null;
            a9[i] = 0;
            return;
        }
        int i10 = i + 1;
        Object obj2 = c4[i9];
        c4[i] = obj2;
        d2[i] = d2[i9];
        c4[i9] = null;
        d2[i9] = null;
        a9[i] = a9[i9];
        a9[i9] = 0;
        int p6 = AbstractC3194fG.p(obj2) & i4;
        int s3 = AbstractC3217fl.s(p6, obj);
        if (s3 == size) {
            AbstractC3217fl.G(p6, i10, obj);
            return;
        }
        while (true) {
            int i11 = s3 - 1;
            int i12 = a9[i11];
            int i13 = i12 & i4;
            if (i13 == size) {
                a9[i11] = (i12 & (~i4)) | (i4 & i10);
                return;
            }
            s3 = i13;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f6 = f();
        if (f6 != null) {
            return f6.get(obj);
        }
        int j9 = j(obj);
        if (j9 == -1) {
            return null;
        }
        return d()[j9];
    }

    public final int h() {
        return (1 << (this.f25745x & 31)) - 1;
    }

    public final int i(int i, int i4, int i9, int i10) {
        int i11 = i4 - 1;
        Object h9 = AbstractC3217fl.h(i4);
        if (i10 != 0) {
            AbstractC3217fl.G(i9 & i11, i10 + 1, h9);
        }
        Object obj = this.f25741n;
        Objects.requireNonNull(obj);
        int[] a9 = a();
        for (int i12 = 0; i12 <= i; i12++) {
            int s3 = AbstractC3217fl.s(i12, obj);
            while (s3 != 0) {
                int i13 = s3 - 1;
                int i14 = a9[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int s6 = AbstractC3217fl.s(i16, h9);
                AbstractC3217fl.G(i16, s3, h9);
                a9[i13] = ((~i11) & i15) | (s6 & i11);
                s3 = i14 & i;
            }
        }
        this.f25741n = h9;
        this.f25745x = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.f25745x & (-32));
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        if (e()) {
            return -1;
        }
        int p6 = AbstractC3194fG.p(obj);
        int h9 = h();
        Object obj2 = this.f25741n;
        Objects.requireNonNull(obj2);
        int s3 = AbstractC3217fl.s(p6 & h9, obj2);
        if (s3 != 0) {
            int i = ~h9;
            int i4 = p6 & i;
            do {
                int i9 = s3 - 1;
                int i10 = a()[i9];
                if ((i10 & i) == i4 && Objects.equals(obj, c()[i9])) {
                    return i9;
                }
                s3 = i10 & h9;
            } while (s3 != 0);
        }
        return -1;
    }

    public final Object k(Object obj) {
        if (!e()) {
            int h9 = h();
            Object obj2 = this.f25741n;
            Objects.requireNonNull(obj2);
            int Q3 = AbstractC3217fl.Q(obj, null, h9, obj2, a(), c(), null);
            if (Q3 != -1) {
                Object obj3 = d()[Q3];
                g(Q3, h9);
                this.f25746y--;
                this.f25745x += 32;
                return obj3;
            }
        }
        return f25738C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        HB hb = this.f25747z;
        if (hb != null) {
            return hb;
        }
        HB hb2 = new HB(this, 1);
        this.f25747z = hb2;
        return hb2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i4 = 32;
        if (e()) {
            PA.U("Arrays already allocated", e());
            int i9 = this.f25745x;
            int max = Math.max(i9 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f25741n = AbstractC3217fl.h(max2);
            this.f25745x = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f25745x & (-32));
            this.f25742u = new int[i9];
            this.f25743v = new Object[i9];
            this.f25744w = new Object[i9];
        }
        Map f6 = f();
        if (f6 != null) {
            return f6.put(obj, obj2);
        }
        int[] a9 = a();
        Object[] c4 = c();
        Object[] d2 = d();
        int i10 = this.f25746y;
        int i11 = i10 + 1;
        int p6 = AbstractC3194fG.p(obj);
        int h9 = h();
        int i12 = p6 & h9;
        Object obj3 = this.f25741n;
        Objects.requireNonNull(obj3);
        int s3 = AbstractC3217fl.s(i12, obj3);
        if (s3 == 0) {
            if (i11 > h9) {
                h9 = i(h9, (h9 + 1) * (h9 < 32 ? 4 : 2), p6, i10);
            } else {
                Object obj4 = this.f25741n;
                Objects.requireNonNull(obj4);
                AbstractC3217fl.G(i12, i11, obj4);
            }
            i = 1;
        } else {
            int i13 = ~h9;
            int i14 = p6 & i13;
            int i15 = 0;
            while (true) {
                int i16 = s3 - 1;
                int i17 = a9[i16];
                i = 1;
                int i18 = i17 & i13;
                int i19 = i4;
                if (i18 == i14 && Objects.equals(obj, c4[i16])) {
                    Object obj5 = d2[i16];
                    d2[i16] = obj2;
                    return obj5;
                }
                int i20 = i17 & h9;
                int i21 = i15 + 1;
                if (i20 != 0) {
                    i15 = i21;
                    s3 = i20;
                    i4 = i19;
                } else {
                    if (i21 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h() + 1, 1.0f);
                        int i22 = isEmpty() ? -1 : 0;
                        while (i22 >= 0) {
                            linkedHashMap.put(c()[i22], d()[i22]);
                            int i23 = i22 + 1;
                            i22 = i23 < this.f25746y ? i23 : -1;
                        }
                        this.f25741n = linkedHashMap;
                        this.f25742u = null;
                        this.f25743v = null;
                        this.f25744w = null;
                        this.f25745x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i11 > h9) {
                        h9 = i(h9, (h9 + 1) * (h9 < i19 ? 4 : 2), p6, i10);
                    } else {
                        a9[i16] = i18 | (i11 & h9);
                    }
                }
            }
        }
        int length = a().length;
        if (i11 > length) {
            int i24 = i;
            int min = Math.min(1073741823, (Math.max(i24, length >>> 1) + length) | i24);
            if (min != length) {
                this.f25742u = Arrays.copyOf(a(), min);
                this.f25743v = Arrays.copyOf(c(), min);
                this.f25744w = Arrays.copyOf(d(), min);
            }
        }
        a()[i10] = (~h9) & p6;
        c()[i10] = obj;
        d()[i10] = obj2;
        this.f25746y = i11;
        this.f25745x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f6 = f();
        if (f6 != null) {
            return f6.remove(obj);
        }
        Object k6 = k(obj);
        if (k6 == f25738C) {
            return null;
        }
        return k6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f6 = f();
        return f6 != null ? f6.size() : this.f25746y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        CB cb = this.f25740B;
        if (cb != null) {
            return cb;
        }
        CB cb2 = new CB(1, this);
        this.f25740B = cb2;
        return cb2;
    }

    public JB(int i) {
    }
}
