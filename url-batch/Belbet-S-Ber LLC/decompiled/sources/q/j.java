package q;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public int[] f3114f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3115g;
    public int h;

    public j(int i) {
        this.f3114f = i == 0 ? r.a.f3175a : new int[i];
        this.f3115g = i == 0 ? r.a.f3176b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.h * 2;
        Object[] objArr = this.f3115g;
        if (obj == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i4 = this.h;
        int[] iArr = this.f3114f;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3114f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3115g, i * 2);
            i3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3115g = copyOf2;
        }
        if (this.h != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i4 = this.h;
        if (i4 == 0) {
            return -1;
        }
        int a5 = r.a.a(i4, i, this.f3114f);
        if (a5 < 0 || i3.d.a(obj, this.f3115g[a5 << 1])) {
            return a5;
        }
        int i5 = a5 + 1;
        while (i5 < i4 && this.f3114f[i5] == i) {
            if (i3.d.a(obj, this.f3115g[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a5 - 1; i6 >= 0 && this.f3114f[i6] == i; i6--) {
            if (i3.d.a(obj, this.f3115g[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final void clear() {
        if (this.h > 0) {
            this.f3114f = r.a.f3175a;
            this.f3115g = r.a.f3176b;
            this.h = 0;
        }
        if (this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int a5 = r.a.a(i, 0, this.f3114f);
        if (a5 < 0 || this.f3115g[a5 << 1] == null) {
            return a5;
        }
        int i4 = a5 + 1;
        while (i4 < i && this.f3114f[i4] == 0) {
            if (this.f3115g[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a5 - 1; i5 >= 0 && this.f3114f[i5] == 0; i5--) {
            if (this.f3115g[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i = this.h;
                if (i != ((j) obj).h) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i4 = 0; i4 < i; i4++) {
                    Object f5 = f(i4);
                    Object i5 = i(i4);
                    Object obj2 = jVar.get(f5);
                    if (i5 == null) {
                        if (obj2 != null || !jVar.containsKey(f5)) {
                            return false;
                        }
                    } else if (!i5.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.h != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.h;
            for (int i7 = 0; i7 < i6; i7++) {
                Object f6 = f(i7);
                Object i8 = i(i7);
                Object obj3 = ((Map) obj).get(f6);
                if (i8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f6)) {
                        return false;
                    }
                } else if (!i8.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.h) {
            throw new IllegalArgumentException(a4.b.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.f3115g[i << 1];
    }

    public final Object g(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.h)) {
            throw new IllegalArgumentException(a4.b.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        Object[] objArr = this.f3115g;
        int i5 = i << 1;
        Object obj = objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i6 = i4 - 1;
        int[] iArr = this.f3114f;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i6) {
                int i7 = i + 1;
                x2.g.G(i, i7, i4, iArr, iArr);
                Object[] objArr2 = this.f3115g;
                x2.g.H(objArr2, objArr2, i5, i7 << 1, i4 << 1);
            }
            Object[] objArr3 = this.f3115g;
            int i8 = i6 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            int i9 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i9);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3114f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3115g, i9 << 1);
            i3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3115g = copyOf2;
            if (i4 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                x2.g.G(0, 0, i, iArr, this.f3114f);
                x2.g.H(objArr, this.f3115g, 0, 0, i5);
            }
            if (i < i6) {
                int i10 = i + 1;
                x2.g.G(i, i10, i4, iArr, this.f3114f);
                x2.g.H(objArr, this.f3115g, i5, i10 << 1, i4 << 1);
            }
        }
        if (i4 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i6;
        return obj;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.f3115g[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.f3115g[(d << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.h) {
            throw new IllegalArgumentException(a4.b.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        int i4 = (i << 1) + 1;
        Object[] objArr = this.f3115g;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f3114f;
        Object[] objArr = this.f3115g;
        int i = this.h;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            Object obj = objArr[i4];
            i6 += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i) {
        if (i < 0 || i >= this.h) {
            throw new IllegalArgumentException(a4.b.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.f3115g[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.h;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c5 = obj != null ? c(hashCode, obj) : e();
        if (c5 >= 0) {
            int i4 = (c5 << 1) + 1;
            Object[] objArr = this.f3115g;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c5;
        int[] iArr = this.f3114f;
        if (i >= iArr.length) {
            int i6 = 8;
            if (i >= 8) {
                i6 = (i >> 1) + i;
            } else if (i < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3114f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3115g, i6 << 1);
            i3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3115g = copyOf2;
            if (i != this.h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i) {
            int[] iArr2 = this.f3114f;
            int i7 = i5 + 1;
            x2.g.G(i7, i5, i, iArr2, iArr2);
            Object[] objArr2 = this.f3115g;
            x2.g.H(objArr2, objArr2, i7 << 1, i5 << 1, this.h << 1);
        }
        int i8 = this.h;
        if (i == i8) {
            int[] iArr3 = this.f3114f;
            if (i5 < iArr3.length) {
                iArr3[i5] = hashCode;
                Object[] objArr3 = this.f3115g;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object f5 = f(i4);
            if (f5 != sb) {
                sb.append(f5);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i5 = i(i4);
            if (i5 != sb) {
                sb.append(i5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !i3.d.a(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !i3.d.a(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }
}
