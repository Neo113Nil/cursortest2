package androidx.collection;

import com.ironsource.cc;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    static Object[] f11048e;

    /* renamed from: f, reason: collision with root package name */
    static int f11049f;

    /* renamed from: g, reason: collision with root package name */
    static Object[] f11050g;

    /* renamed from: h, reason: collision with root package name */
    static int f11051h;

    /* renamed from: b, reason: collision with root package name */
    int[] f11052b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f11053c;

    /* renamed from: d, reason: collision with root package name */
    int f11054d;

    public g() {
        this.f11052b = c.f11025a;
        this.f11053c = c.f11027c;
        this.f11054d = 0;
    }

    private void a(int i4) {
        if (i4 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f11050g;
                    if (objArr != null) {
                        this.f11053c = objArr;
                        f11050g = (Object[]) objArr[0];
                        this.f11052b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f11051h--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i4 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f11048e;
                    if (objArr2 != null) {
                        this.f11053c = objArr2;
                        f11048e = (Object[]) objArr2[0];
                        this.f11052b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f11049f--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f11052b = new int[i4];
        this.f11053c = new Object[i4 << 1];
    }

    private static int c(int[] iArr, int i4, int i5) {
        try {
            return c.a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void f(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f11051h < 10) {
                        objArr[0] = f11050g;
                        objArr[1] = iArr;
                        for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f11050g = objArr;
                        f11051h++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f11049f < 10) {
                        objArr[0] = f11048e;
                        objArr[1] = iArr;
                        for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f11048e = objArr;
                        f11049f++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i4 = this.f11054d;
        if (i4 > 0) {
            int[] iArr = this.f11052b;
            Object[] objArr = this.f11053c;
            this.f11052b = c.f11025a;
            this.f11053c = c.f11027c;
            this.f11054d = 0;
            f(iArr, objArr, i4);
        }
        if (this.f11054d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public void e(int i4) {
        int i5 = this.f11054d;
        int[] iArr = this.f11052b;
        if (iArr.length < i4) {
            Object[] objArr = this.f11053c;
            a(i4);
            if (this.f11054d > 0) {
                System.arraycopy(iArr, 0, this.f11052b, 0, i5);
                System.arraycopy(objArr, 0, this.f11053c, 0, i5 << 1);
            }
            f(iArr, objArr, i5);
        }
        if (this.f11054d != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f11054d; i4++) {
                try {
                    Object m4 = m(i4);
                    Object q4 = q(i4);
                    Object obj2 = gVar.get(m4);
                    if (q4 == null) {
                        if (obj2 != null || !gVar.containsKey(m4)) {
                            return false;
                        }
                    } else if (!q4.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f11054d; i5++) {
                try {
                    Object m5 = m(i5);
                    Object q5 = q(i5);
                    Object obj3 = map.get(m5);
                    if (q5 == null) {
                        if (obj3 != null || !map.containsKey(m5)) {
                            return false;
                        }
                    } else if (!q5.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int g(Object obj, int i4) {
        int i5 = this.f11054d;
        if (i5 == 0) {
            return -1;
        }
        int c4 = c(this.f11052b, i5, i4);
        if (c4 < 0 || obj.equals(this.f11053c[c4 << 1])) {
            return c4;
        }
        int i6 = c4 + 1;
        while (i6 < i5 && this.f11052b[i6] == i4) {
            if (obj.equals(this.f11053c[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = c4 - 1; i7 >= 0 && this.f11052b[i7] == i4; i7--) {
            if (obj.equals(this.f11053c[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int h4 = h(obj);
        return h4 >= 0 ? this.f11053c[(h4 << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        return obj == null ? k() : g(obj, obj.hashCode());
    }

    public int hashCode() {
        int[] iArr = this.f11052b;
        Object[] objArr = this.f11053c;
        int i4 = this.f11054d;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            i7 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public boolean isEmpty() {
        return this.f11054d <= 0;
    }

    int k() {
        int i4 = this.f11054d;
        if (i4 == 0) {
            return -1;
        }
        int c4 = c(this.f11052b, i4, 0);
        if (c4 < 0 || this.f11053c[c4 << 1] == null) {
            return c4;
        }
        int i5 = c4 + 1;
        while (i5 < i4 && this.f11052b[i5] == 0) {
            if (this.f11053c[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = c4 - 1; i6 >= 0 && this.f11052b[i6] == 0; i6--) {
            if (this.f11053c[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    int l(Object obj) {
        int i4 = this.f11054d * 2;
        Object[] objArr = this.f11053c;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public Object m(int i4) {
        return this.f11053c[i4 << 1];
    }

    public void n(g gVar) {
        int i4 = gVar.f11054d;
        e(this.f11054d + i4);
        if (this.f11054d != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(gVar.m(i5), gVar.q(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(gVar.f11052b, 0, this.f11052b, 0, i4);
            System.arraycopy(gVar.f11053c, 0, this.f11053c, 0, i4 << 1);
            this.f11054d = i4;
        }
    }

    public Object o(int i4) {
        Object[] objArr = this.f11053c;
        int i5 = i4 << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f11054d;
        int i7 = 0;
        if (i6 <= 1) {
            f(this.f11052b, objArr, i6);
            this.f11052b = c.f11025a;
            this.f11053c = c.f11027c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f11052b;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    int i10 = i8 - i4;
                    System.arraycopy(iArr, i9, iArr, i4, i10);
                    Object[] objArr2 = this.f11053c;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i5, i10 << 1);
                }
                Object[] objArr3 = this.f11053c;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f11054d) {
                    throw new ConcurrentModificationException();
                }
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f11052b, 0, i4);
                    System.arraycopy(objArr, 0, this.f11053c, 0, i5);
                }
                if (i4 < i8) {
                    int i12 = i4 + 1;
                    int i13 = i8 - i4;
                    System.arraycopy(iArr, i12, this.f11052b, i4, i13);
                    System.arraycopy(objArr, i12 << 1, this.f11053c, i5, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.f11054d) {
            throw new ConcurrentModificationException();
        }
        this.f11054d = i7;
        return obj;
    }

    public Object p(int i4, Object obj) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f11053c;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object put(Object obj, Object obj2) {
        int i4;
        int g4;
        int i5 = this.f11054d;
        if (obj == null) {
            g4 = k();
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            g4 = g(obj, hashCode);
        }
        if (g4 >= 0) {
            int i6 = (g4 << 1) + 1;
            Object[] objArr = this.f11053c;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~g4;
        int[] iArr = this.f11052b;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f11053c;
            a(i8);
            if (i5 != this.f11054d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f11052b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f11053c, 0, objArr2.length);
            }
            f(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.f11052b;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f11053c;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f11054d - i7) << 1);
        }
        int i10 = this.f11054d;
        if (i5 == i10) {
            int[] iArr4 = this.f11052b;
            if (i7 < iArr4.length) {
                iArr4[i7] = i4;
                Object[] objArr4 = this.f11053c;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f11054d = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object q(int i4) {
        return this.f11053c[(i4 << 1) + 1];
    }

    public Object remove(Object obj) {
        int h4 = h(obj);
        if (h4 >= 0) {
            return o(h4);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int h4 = h(obj);
        if (h4 >= 0) {
            return p(h4, obj2);
        }
        return null;
    }

    public int size() {
        return this.f11054d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11054d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f11054d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object m4 = m(i4);
            if (m4 != this) {
                sb.append(m4);
            } else {
                sb.append("(this Map)");
            }
            sb.append(cc.f15727T);
            Object q4 = q(i4);
            if (q4 != this) {
                sb.append(q4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int h4 = h(obj);
        if (h4 < 0) {
            return false;
        }
        Object q4 = q(h4);
        if (obj2 != q4 && (obj2 == null || !obj2.equals(q4))) {
            return false;
        }
        o(h4);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int h4 = h(obj);
        if (h4 < 0) {
            return false;
        }
        Object q4 = q(h4);
        if (q4 != obj2 && (obj2 == null || !obj2.equals(q4))) {
            return false;
        }
        p(h4, obj3);
        return true;
    }

    public g(int i4) {
        if (i4 == 0) {
            this.f11052b = c.f11025a;
            this.f11053c = c.f11027c;
        } else {
            a(i4);
        }
        this.f11054d = 0;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            n(gVar);
        }
    }
}
