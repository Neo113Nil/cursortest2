package defpackage;

import j$.util.Objects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hdt extends AbstractMap implements Serializable, hbt {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    public transient int e;
    public transient int[] f;
    private transient int[] g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int k;
    private transient int[] l;
    private transient Set m;
    private transient Set n;
    private transient Set o;

    public hdt() {
        f();
    }

    private final int i(int i) {
        return (this.g.length - 1) & i;
    }

    private final int j(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[i(i)];
        while (i2 != -1) {
            if (Objects.equals(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    private final void k(int i, int i2) {
        hoq.x(i != -1);
        int i3 = i(i2);
        int[] iArr = this.h;
        int i4 = iArr[i3];
        int[] iArr2 = this.j;
        if (i4 == i) {
            iArr[i3] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i5 = iArr2[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
            int[] iArr3 = this.j;
            if (i4 == i) {
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i5 = iArr3[i4];
        }
    }

    private final void l(int i, int i2) {
        hoq.x(i != -1);
        int i3 = i(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[i3];
        iArr2[i3] = i;
    }

    private final void m(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.k = i;
        } else {
            this.l[i2] = i;
        }
    }

    private static int[] n(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] o(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        f();
        for (int i = 0; i < readInt; i++) {
            g(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final int a(Object obj) {
        return b(obj, hnu.ag(obj));
    }

    public final int b(Object obj, int i) {
        return j(obj, i, this.g, this.i, this.a);
    }

    public final int c(Object obj, int i) {
        return j(obj, i, this.h, this.j, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.g, -1);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, 0, this.c, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.k = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj, hnu.ag(obj)) != -1;
    }

    public final void d(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        boolean z = i != -1;
        hoq.x(z);
        hoq.x(z);
        int i6 = i(i2);
        int[] iArr3 = this.g;
        int i7 = iArr3[i6];
        int[] iArr4 = this.i;
        if (i7 == i) {
            iArr3[i6] = iArr4[i];
            iArr4[i] = -1;
        } else {
            int i8 = iArr4[i7];
            while (true) {
                int i9 = i7;
                i7 = i8;
                if (i7 == -1) {
                    throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
                }
                int[] iArr5 = this.i;
                if (i7 == i) {
                    iArr5[i9] = iArr5[i];
                    iArr5[i] = -1;
                    break;
                }
                i8 = iArr5[i7];
            }
        }
        k(i, i3);
        m(this.l[i], this.f[i]);
        int i10 = this.c - 1;
        if (i10 != i) {
            int i11 = this.l[i10];
            int i12 = this.f[i10];
            m(i11, i);
            m(i, i12);
            Object[] objArr = this.a;
            Object obj = objArr[i10];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i10];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int i13 = i(hnu.ag(obj));
            int[] iArr6 = this.g;
            int i14 = iArr6[i13];
            if (i14 == i10) {
                iArr6[i13] = i;
            } else {
                int i15 = this.i[i14];
                while (true) {
                    i4 = i14;
                    i14 = i15;
                    iArr = this.i;
                    if (i14 == i10) {
                        break;
                    } else {
                        i15 = iArr[i14];
                    }
                }
                iArr[i4] = i;
            }
            int[] iArr7 = this.i;
            iArr7[i] = iArr7[i10];
            iArr7[i10] = -1;
            int i16 = i(hnu.ag(obj2));
            int[] iArr8 = this.h;
            int i17 = iArr8[i16];
            if (i17 == i10) {
                iArr8[i16] = i;
            } else {
                int i18 = this.j[i17];
                while (true) {
                    i5 = i17;
                    i17 = i18;
                    iArr2 = this.j;
                    if (i17 == i10) {
                        break;
                    } else {
                        i18 = iArr2[i17];
                    }
                }
                iArr2[i5] = i;
            }
            int[] iArr9 = this.j;
            iArr9[i] = iArr9[i10];
            iArr9[i10] = -1;
        }
        Object[] objArr3 = this.a;
        int i19 = this.c - 1;
        objArr3[i19] = null;
        this.b[i19] = null;
        this.c = i19;
        this.d++;
    }

    public final void e(int i, int i2) {
        d(i, i2, hnu.ag(this.b[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        hdo hdoVar = new hdo(this);
        this.o = hdoVar;
        return hdoVar;
    }

    final void f() {
        int ah = hnu.ah(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.g = n(ah);
        this.h = n(ah);
        this.i = n(16);
        this.j = n(16);
        this.e = -2;
        this.k = -2;
        this.l = n(16);
        this.f = n(16);
    }

    public final Object g(Object obj, Object obj2) {
        int ag = hnu.ag(obj);
        int b = b(obj, ag);
        if (b != -1) {
            Object obj3 = this.b[b];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            h(b, obj2);
            return obj3;
        }
        int ag2 = hnu.ag(obj2);
        hoq.C(c(obj2, ag2) == -1, "Value already present: %s", obj2);
        int i = this.c + 1;
        int length = this.i.length;
        if (length < i) {
            int f = hea.f(length, i);
            this.a = Arrays.copyOf(this.a, f);
            this.b = Arrays.copyOf(this.b, f);
            this.i = o(this.i, f);
            this.j = o(this.j, f);
            this.l = o(this.l, f);
            this.f = o(this.f, f);
        }
        if (this.g.length < i) {
            int ah = hnu.ah(i);
            this.g = n(ah);
            this.h = n(ah);
            for (int i2 = 0; i2 < this.c; i2++) {
                int i3 = i(hnu.ag(this.a[i2]));
                int[] iArr = this.i;
                int[] iArr2 = this.g;
                iArr[i2] = iArr2[i3];
                iArr2[i3] = i2;
                int i4 = i(hnu.ag(this.b[i2]));
                int[] iArr3 = this.j;
                int[] iArr4 = this.h;
                iArr3[i2] = iArr4[i4];
                iArr4[i4] = i2;
            }
        }
        Object[] objArr = this.a;
        int i5 = this.c;
        objArr[i5] = obj;
        this.b[i5] = obj2;
        hoq.x(i5 != -1);
        int i6 = i(ag);
        int[] iArr5 = this.i;
        int[] iArr6 = this.g;
        iArr5[i5] = iArr6[i6];
        iArr6[i6] = i5;
        l(this.c, ag2);
        m(this.k, this.c);
        m(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int a = a(obj);
        if (a == -1) {
            return null;
        }
        return this.b[a];
    }

    public final void h(int i, Object obj) {
        hoq.x(i != -1);
        int ag = hnu.ag(obj);
        if (c(obj, ag) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        k(i, hnu.ag(this.b[i]));
        this.b[i] = obj;
        l(i, ag);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.m;
        if (set != null) {
            return set;
        }
        hdp hdpVar = new hdp(this);
        this.m = hdpVar;
        return hdpVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return g(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int ag = hnu.ag(obj);
        int b = b(obj, ag);
        if (b == -1) {
            return null;
        }
        Object obj2 = this.b[b];
        e(b, ag);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        hdq hdqVar = new hdq(this);
        this.n = hdqVar;
        return hdqVar;
    }
}
