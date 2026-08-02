package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpy implements Map, Serializable {
    public static final kpy a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private kqa l;
    private kpz m;
    private kpe n;

    static {
        kpy kpyVar = new kpy(0);
        kpyVar.h = true;
        a = kpyVar;
    }

    public kpy(int i) {
        Object[] h = ixd.h(i);
        int[] iArr = new int[i];
        int[] iArr2 = new int[ixd.b(i)];
        this.b = h;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = Integer.numberOfLeadingZeros(l()) + 1;
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        ixd.f(this.b, i3, i);
        if (objArr != null) {
            ixd.f(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        int d = d();
        int i2 = this.e;
        int i3 = d - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > d()) {
            int W = ixc.W(d(), i5);
            this.b = ixd.i(this.b, W);
            Object[] objArr = this.c;
            this.c = objArr != null ? ixd.i(objArr, W) : null;
            int[] copyOf = Arrays.copyOf(this.d, W);
            copyOf.getClass();
            this.d = copyOf;
            int b = ixd.b(W);
            if (b > l()) {
                q(b);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002f, code lost:
    
        r3[r0] = r6;
        r5.d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void q(int i) {
        p();
        int i2 = 0;
        if (this.e > this.g) {
            n(false);
        }
        this.i = new int[i];
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.e) {
            int i3 = i2 + 1;
            int m = m(this.b[i2]);
            int i4 = this.j;
            while (true) {
                int[] iArr = this.i;
                if (iArr[m] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                m = m == 0 ? l() - 1 : m - 1;
            }
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.h) {
            return new kqc(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int m = m(obj);
            int i = this.j;
            int i2 = i + i;
            int l = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[m];
                if (i4 == 0) {
                    if (this.e < d()) {
                        int i5 = this.e;
                        int i6 = i5 + 1;
                        this.e = i6;
                        this.b[i5] = obj;
                        this.d[i5] = m;
                        this.i[m] = i6;
                        this.g++;
                        p();
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                    o(1);
                } else {
                    if (ksp.b(this.b[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > ksl.g(i2, l)) {
                        int l2 = l();
                        q(l2 + l2);
                        break;
                    }
                    m = m == 0 ? l() - 1 : m - 1;
                }
            }
        }
    }

    public final int b(Object obj) {
        int m = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[m];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (ksp.b(this.b[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            m = m == 0 ? l() - 1 : m - 1;
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (ksp.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ixd.f(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            ixd.f(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        kpy kpyVar = a;
        kpyVar.getClass();
        return kpyVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        kpz kpzVar = this.m;
        if (kpzVar != null) {
            return kpzVar;
        }
        kpz kpzVar2 = new kpz(this);
        this.m = kpzVar2;
        return kpzVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i) {
        int i2;
        int i3;
        ixd.e(this.b, i);
        Object[] objArr = this.c;
        if (objArr != null) {
            ixd.e(objArr, i);
        }
        int i4 = this.d[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? l() - 1 : i4 - 1;
                int[] iArr = this.i;
                i2 = iArr[i4];
                i6++;
                if (i6 > this.j) {
                    iArr[i5] = 0;
                    break loop0;
                } else {
                    if (i2 == 0) {
                        iArr[i5] = 0;
                        break loop0;
                    }
                    i3 = i2 - 1;
                }
            } while (((m(this.b[i3]) - i4) & (l() - 1)) < i6);
            this.i[i5] = i2;
            this.d[i3] = i5;
        }
        this.d[i] = -1;
        this.g--;
        p();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[b];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        kpu kpuVar = new kpu(this);
        int i = 0;
        while (kpuVar.hasNext()) {
            int i2 = kpuVar.b;
            kpy kpyVar = kpuVar.a;
            if (i2 >= kpyVar.e) {
                throw new NoSuchElementException();
            }
            kpuVar.b = i2 + 1;
            kpuVar.c = i2;
            Object obj = kpyVar.b[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = kpyVar.c;
            objArr.getClass();
            Object obj2 = objArr[kpuVar.c];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            kpuVar.b();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final boolean i(Map.Entry entry) {
        int b = b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return ksp.b(objArr[b], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object obj) {
        f();
        int b = b(obj);
        if (b < 0) {
            return false;
        }
        g(b);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] h = ixd.h(d());
        this.c = h;
        return h;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        kqa kqaVar = this.l;
        if (kqaVar != null) {
            return kqaVar;
        }
        kqa kqaVar2 = new kqa(this);
        this.l = kqaVar2;
        return kqaVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int a2 = a(obj);
        Object[] k = k();
        if (a2 >= 0) {
            k[a2] = obj2;
            return null;
        }
        int i = (-a2) - 1;
        Object obj3 = k[i];
        k[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        o(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] k = k();
            if (a2 >= 0) {
                k[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!ksp.b(entry.getValue(), k[i])) {
                    k[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[b];
        g(b);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        kpu kpuVar = new kpu(this);
        int i = 0;
        while (kpuVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = kpuVar.b;
            kpy kpyVar = kpuVar.a;
            if (i2 >= kpyVar.e) {
                throw new NoSuchElementException();
            }
            kpuVar.b = i2 + 1;
            kpuVar.c = i2;
            Object obj = kpyVar.b[i2];
            if (obj == kpyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = kpyVar.c;
            objArr.getClass();
            Object obj2 = objArr[kpuVar.c];
            if (obj2 == kpyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            kpuVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        kpe kpeVar = this.n;
        if (kpeVar != null) {
            return kpeVar;
        }
        kpe kpeVar2 = new kpe(this);
        this.n = kpeVar2;
        return kpeVar2;
    }

    public kpy() {
        throw null;
    }
}
