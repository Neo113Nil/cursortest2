package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Collection, Set {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f11014f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f11015g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    private static Object[] f11016h;

    /* renamed from: i, reason: collision with root package name */
    private static int f11017i;

    /* renamed from: j, reason: collision with root package name */
    private static Object[] f11018j;

    /* renamed from: k, reason: collision with root package name */
    private static int f11019k;

    /* renamed from: b, reason: collision with root package name */
    private int[] f11020b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f11021c;

    /* renamed from: d, reason: collision with root package name */
    int f11022d;

    /* renamed from: e, reason: collision with root package name */
    private f f11023e;

    class a extends f {
        a() {
        }

        @Override // androidx.collection.f
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.f
        protected Object b(int i4, int i5) {
            return b.this.f11021c[i4];
        }

        @Override // androidx.collection.f
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.f
        protected int d() {
            return b.this.f11022d;
        }

        @Override // androidx.collection.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.f
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // androidx.collection.f
        protected void h(int i4) {
            b.this.i(i4);
        }

        @Override // androidx.collection.f
        protected Object i(int i4, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void b(int i4) {
        if (i4 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f11018j;
                    if (objArr != null) {
                        this.f11021c = objArr;
                        f11018j = (Object[]) objArr[0];
                        this.f11020b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f11019k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i4 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f11016h;
                    if (objArr2 != null) {
                        this.f11021c = objArr2;
                        f11016h = (Object[]) objArr2[0];
                        this.f11020b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f11017i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f11020b = new int[i4];
        this.f11021c = new Object[i4];
    }

    private static void e(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f11019k < 10) {
                        objArr[0] = f11018j;
                        objArr[1] = iArr;
                        for (int i5 = i4 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f11018j = objArr;
                        f11019k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f11017i < 10) {
                        objArr[0] = f11016h;
                        objArr[1] = iArr;
                        for (int i6 = i4 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f11016h = objArr;
                        f11017i++;
                    }
                } finally {
                }
            }
        }
    }

    private f f() {
        if (this.f11023e == null) {
            this.f11023e = new a();
        }
        return this.f11023e;
    }

    private int g(Object obj, int i4) {
        int i5 = this.f11022d;
        if (i5 == 0) {
            return -1;
        }
        int a4 = c.a(this.f11020b, i5, i4);
        if (a4 < 0 || obj.equals(this.f11021c[a4])) {
            return a4;
        }
        int i6 = a4 + 1;
        while (i6 < i5 && this.f11020b[i6] == i4) {
            if (obj.equals(this.f11021c[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a4 - 1; i7 >= 0 && this.f11020b[i7] == i4; i7--) {
            if (obj.equals(this.f11021c[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    private int h() {
        int i4 = this.f11022d;
        if (i4 == 0) {
            return -1;
        }
        int a4 = c.a(this.f11020b, i4, 0);
        if (a4 < 0 || this.f11021c[a4] == null) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f11020b[i5] == 0) {
            if (this.f11021c[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a4 - 1; i6 >= 0 && this.f11020b[i6] == 0; i6--) {
            if (this.f11021c[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i4;
        int g4;
        if (obj == null) {
            g4 = h();
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            g4 = g(obj, hashCode);
        }
        if (g4 >= 0) {
            return false;
        }
        int i5 = ~g4;
        int i6 = this.f11022d;
        int[] iArr = this.f11020b;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f11021c;
            b(i7);
            int[] iArr2 = this.f11020b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f11021c, 0, objArr.length);
            }
            e(iArr, objArr, this.f11022d);
        }
        int i8 = this.f11022d;
        if (i5 < i8) {
            int[] iArr3 = this.f11020b;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f11021c;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f11022d - i5);
        }
        this.f11020b[i5] = i4;
        this.f11021c[i5] = obj;
        this.f11022d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        d(this.f11022d + collection.size());
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i4 = this.f11022d;
        if (i4 != 0) {
            e(this.f11020b, this.f11021c, i4);
            this.f11020b = f11014f;
            this.f11021c = f11015g;
            this.f11022d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i4) {
        int[] iArr = this.f11020b;
        if (iArr.length < i4) {
            Object[] objArr = this.f11021c;
            b(i4);
            int i5 = this.f11022d;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f11020b, 0, i5);
                System.arraycopy(objArr, 0, this.f11021c, 0, this.f11022d);
            }
            e(iArr, objArr, this.f11022d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f11022d; i4++) {
                try {
                    if (!set.contains(j(i4))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f11020b;
        int i4 = this.f11022d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public Object i(int i4) {
        Object[] objArr = this.f11021c;
        Object obj = objArr[i4];
        int i5 = this.f11022d;
        if (i5 <= 1) {
            e(this.f11020b, objArr, i5);
            this.f11020b = f11014f;
            this.f11021c = f11015g;
            this.f11022d = 0;
            return obj;
        }
        int[] iArr = this.f11020b;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            int i6 = i5 - 1;
            this.f11022d = i6;
            if (i4 < i6) {
                int i7 = i4 + 1;
                System.arraycopy(iArr, i7, iArr, i4, i6 - i4);
                Object[] objArr2 = this.f11021c;
                System.arraycopy(objArr2, i7, objArr2, i4, this.f11022d - i4);
            }
            this.f11021c[this.f11022d] = null;
            return obj;
        }
        b(i5 > 8 ? i5 + (i5 >> 1) : 8);
        this.f11022d--;
        if (i4 > 0) {
            System.arraycopy(iArr, 0, this.f11020b, 0, i4);
            System.arraycopy(objArr, 0, this.f11021c, 0, i4);
        }
        int i8 = this.f11022d;
        if (i4 < i8) {
            int i9 = i4 + 1;
            System.arraycopy(iArr, i9, this.f11020b, i4, i8 - i4);
            System.arraycopy(objArr, i9, this.f11021c, i4, this.f11022d - i4);
        }
        return obj;
    }

    public int indexOf(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f11022d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return f().m().iterator();
    }

    public Object j(int i4) {
        return this.f11021c[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        i(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i4 = this.f11022d - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f11021c[i4])) {
                i(i4);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f11022d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i4 = this.f11022d;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f11021c, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11022d * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f11022d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object j4 = j(i4);
            if (j4 != this) {
                sb.append(j4);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i4) {
        if (i4 == 0) {
            this.f11020b = f11014f;
            this.f11021c = f11015g;
        } else {
            b(i4);
        }
        this.f11022d = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f11022d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f11022d);
        }
        System.arraycopy(this.f11021c, 0, objArr, 0, this.f11022d);
        int length = objArr.length;
        int i4 = this.f11022d;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
