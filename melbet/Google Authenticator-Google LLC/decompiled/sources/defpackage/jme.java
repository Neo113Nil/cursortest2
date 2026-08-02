package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jme extends AbstractMap {
    private volatile jmd d;
    public boolean c = false;
    public Object[] a = null;
    public int b = 0;
    private volatile boolean e = true;

    private final void e(int i) {
        int length;
        Object[] objArr = this.a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.a = new Object[Math.max(16, i)];
            return;
        }
        if (i > length) {
            if (!this.e) {
                c();
                if (i <= this.a.length) {
                    return;
                }
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.a = Arrays.copyOf(objArr2, i);
        }
    }

    private final int f(jko jkoVar) {
        int i = this.b - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int compareTo = ((jmb) this.a[i3]).c.compareTo(jkoVar);
            if (compareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (compareTo <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final Map.Entry a(int i) {
        c();
        if (i < this.b) {
            return (jmb) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void b() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c() {
        int i;
        if (this.c || this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            int i2 = this.b;
            if (i2 <= 1) {
                return;
            }
            int i3 = 0;
            Arrays.sort(this.a, 0, i2);
            int i4 = 0;
            while (true) {
                i = this.b;
                if (i3 >= i) {
                    break;
                }
                Object[] objArr = this.a;
                jmb jmbVar = (jmb) objArr[i3];
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (((jmb) objArr[i5]).c.equals(jmbVar.c)) {
                        this.a[i5] = jmbVar;
                        i3++;
                    }
                }
                this.a[i4] = jmbVar;
                i4++;
                i3++;
            }
            if (i4 < i) {
                this.b = i4;
                Object[] objArr2 = this.a;
                Arrays.fill(objArr2, i4, objArr2.length, (Object) null);
            }
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        c();
        return f((jko) obj) >= 0;
    }

    public final void d(jko jkoVar, Object obj) {
        b();
        jkoVar.getClass();
        boolean z = this.e;
        int i = this.b;
        if (i > 0) {
            int compareTo = jkoVar.compareTo(((jmb) this.a[i - 1]).c);
            if (compareTo < 0) {
                z = false;
            } else if (compareTo == 0) {
                ((jmb) this.a[this.b - 1]).setValue(obj);
                return;
            }
        }
        e(this.b + 1);
        Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = new jmb(this, jkoVar, obj);
        this.e = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c();
        if (this.d == null) {
            this.d = new jmd(this);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jme)) {
            return super.equals(obj);
        }
        jme jmeVar = (jme) obj;
        int size = size();
        if (size != jmeVar.size()) {
            return false;
        }
        Object[] objArr = this.a;
        Object[] objArr2 = jmeVar.a;
        for (int i = 0; i < size; i++) {
            if (!objArr[i].equals(objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        c();
        int f = f((jko) obj);
        if (f >= 0) {
            return ((jmb) this.a[f]).a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.a[i2].hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        d((jko) obj, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        if (!(map instanceof jme)) {
            e(this.b + map.size());
            for (Map.Entry entry : map.entrySet()) {
                d((jko) entry.getKey(), entry.getValue());
            }
            return;
        }
        jme jmeVar = (jme) map;
        e(this.b + jmeVar.b);
        int i = this.b;
        int i2 = jmeVar.b + i;
        for (int i3 = i; i3 < i2; i3++) {
            jmb jmbVar = (jmb) jmeVar.a[i3 - i];
            d(jmbVar.c, jmbVar.a);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        c();
        int f = f((jko) obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.a;
        Object obj2 = ((jmb) objArr[f]).a;
        System.arraycopy(objArr, f + 1, objArr, f, (this.b - f) - 1);
        Object[] objArr2 = this.a;
        int i = this.b - 1;
        this.b = i;
        objArr2[i] = null;
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        c();
        return this.b;
    }
}
