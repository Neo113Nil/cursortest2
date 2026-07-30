package i5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f4934f;

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f4935g;

    /* renamed from: h, reason: collision with root package name */
    public final Comparator f4936h;

    public b(Comparator comparator) {
        this.f4934f = new Object[0];
        this.f4935g = new Object[0];
        this.f4936h = comparator;
    }

    public static b C(List list, Map map, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        for (Object obj : list) {
            objArr[i7] = obj;
            objArr2[i7] = map.get(obj);
            i7++;
        }
        return new b(comparator, objArr, objArr2);
    }

    @Override // i5.c
    public final c A(Iterable iterable, Object obj) {
        int D = D(obj);
        Comparator comparator = this.f4936h;
        Object[] objArr = this.f4935g;
        Object[] objArr2 = this.f4934f;
        if (D != -1) {
            if (objArr2[D] == obj && objArr[D] == iterable) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[D] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[D] = iterable;
            return new b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap hashMap = new HashMap(objArr2.length + 1);
            for (int i7 = 0; i7 < objArr2.length; i7++) {
                hashMap.put(objArr2[i7], objArr[i7]);
            }
            hashMap.put(obj, iterable);
            return g3.k.o(new ArrayList(hashMap.keySet()), hashMap, comparator);
        }
        int i8 = 0;
        while (i8 < objArr2.length && comparator.compare(objArr2[i8], obj) < 0) {
            i8++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i8);
        objArr5[i8] = obj;
        int i9 = i8 + 1;
        System.arraycopy(objArr2, i8, objArr5, i9, (r1 - i8) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i8);
        objArr6[i8] = iterable;
        System.arraycopy(objArr, i8, objArr6, i9, (r1 - i8) - 1);
        return new b(comparator, objArr5, objArr6);
    }

    @Override // i5.c
    public final c B(Object obj) {
        int D = D(obj);
        if (D == -1) {
            return this;
        }
        Object[] objArr = this.f4934f;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, D);
        int i7 = D + 1;
        System.arraycopy(objArr, i7, objArr2, D, length - D);
        Object[] objArr3 = this.f4935g;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, D);
        System.arraycopy(objArr3, i7, objArr4, D, length2 - D);
        return new b(this.f4936h, objArr2, objArr4);
    }

    public final int D(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f4934f) {
            if (this.f4936h.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // i5.c
    public final boolean a(Object obj) {
        return D(obj) != -1;
    }

    @Override // i5.c
    public final Object g(t5.c cVar) {
        int D = D(cVar);
        if (D != -1) {
            return this.f4935g[D];
        }
        return null;
    }

    @Override // i5.c
    public final boolean isEmpty() {
        return this.f4934f.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, 0, false);
    }

    @Override // i5.c
    public final Comparator m() {
        return this.f4936h;
    }

    @Override // i5.c
    public final int size() {
        return this.f4934f.length;
    }

    @Override // i5.c
    public final Iterator t() {
        return new a(this, this.f4934f.length - 1, true);
    }

    @Override // i5.c
    public final Object w() {
        Object[] objArr = this.f4934f;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // i5.c
    public final Object x() {
        Object[] objArr = this.f4934f;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // i5.c
    public final Object y(Object obj) {
        int D = D(obj);
        if (D == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (D <= 0) {
            return null;
        }
        return this.f4934f[D - 1];
    }

    @Override // i5.c
    public final void z(a8.d dVar) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f4934f;
            if (i7 >= objArr.length) {
                return;
            }
            dVar.f0(objArr[i7], this.f4935g[i7]);
            i7++;
        }
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f4934f = objArr;
        this.f4935g = objArr2;
        this.f4936h = comparator;
    }
}
