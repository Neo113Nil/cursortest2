package d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o2.C0924c;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545b extends AbstractC0546c {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f6068d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f6069e;

    /* renamed from: i, reason: collision with root package name */
    public final Comparator f6070i;

    public C0545b(Comparator comparator) {
        this.f6068d = new Object[0];
        this.f6069e = new Object[0];
        this.f6070i = comparator;
    }

    public static C0545b F(List list, Map map, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        for (Object obj : list) {
            objArr[i2] = obj;
            objArr2[i2] = map.get(obj);
            i2++;
        }
        return new C0545b(comparator, objArr, objArr2);
    }

    @Override // d2.AbstractC0546c
    public final Object B(Object obj) {
        int G3 = G(obj);
        if (G3 == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (G3 <= 0) {
            return null;
        }
        return this.f6068d[G3 - 1];
    }

    @Override // d2.AbstractC0546c
    public final void C(u3.d dVar) {
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f6068d;
            if (i2 >= objArr.length) {
                return;
            }
            dVar.V(objArr[i2], this.f6069e[i2]);
            i2++;
        }
    }

    @Override // d2.AbstractC0546c
    public final AbstractC0546c D(Iterable iterable, Object obj) {
        int G3 = G(obj);
        Object[] objArr = this.f6069e;
        Object[] objArr2 = this.f6068d;
        Comparator comparator = this.f6070i;
        if (G3 != -1) {
            if (objArr2[G3] == obj && objArr[G3] == iterable) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[G3] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[G3] = iterable;
            return new C0545b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap hashMap = new HashMap(objArr2.length + 1);
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                hashMap.put(objArr2[i2], objArr[i2]);
            }
            hashMap.put(obj, iterable);
            return Y0.b.h(new ArrayList(hashMap.keySet()), hashMap, comparator);
        }
        int i4 = 0;
        while (i4 < objArr2.length && comparator.compare(objArr2[i4], obj) < 0) {
            i4++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i4);
        objArr5[i4] = obj;
        int i5 = i4 + 1;
        System.arraycopy(objArr2, i4, objArr5, i5, (r4 - i4) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i4);
        objArr6[i4] = iterable;
        System.arraycopy(objArr, i4, objArr6, i5, (r2 - i4) - 1);
        return new C0545b(comparator, objArr5, objArr6);
    }

    @Override // d2.AbstractC0546c
    public final AbstractC0546c E(Object obj) {
        int G3 = G(obj);
        if (G3 == -1) {
            return this;
        }
        Object[] objArr = this.f6068d;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, G3);
        int i2 = G3 + 1;
        System.arraycopy(objArr, i2, objArr2, G3, length - G3);
        Object[] objArr3 = this.f6069e;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, G3);
        System.arraycopy(objArr3, i2, objArr4, G3, length2 - G3);
        return new C0545b(this.f6070i, objArr2, objArr4);
    }

    public final int G(Object obj) {
        int i2 = 0;
        for (Object obj2 : this.f6068d) {
            if (this.f6070i.compare(obj, obj2) == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // d2.AbstractC0546c
    public final boolean e(Object obj) {
        return G(obj) != -1;
    }

    @Override // d2.AbstractC0546c
    public final Object h(C0924c c0924c) {
        int G3 = G(c0924c);
        if (G3 != -1) {
            return this.f6069e[G3];
        }
        return null;
    }

    @Override // d2.AbstractC0546c
    public final boolean isEmpty() {
        return this.f6068d.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0544a(this, 0, false);
    }

    @Override // d2.AbstractC0546c
    public final Comparator j() {
        return this.f6070i;
    }

    @Override // d2.AbstractC0546c
    public final Object s() {
        Object[] objArr = this.f6068d;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // d2.AbstractC0546c
    public final int size() {
        return this.f6068d.length;
    }

    @Override // d2.AbstractC0546c
    public final Object w() {
        Object[] objArr = this.f6068d;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // d2.AbstractC0546c
    public final Iterator x() {
        return new C0544a(this, this.f6068d.length - 1, true);
    }

    public C0545b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f6068d = objArr;
        this.f6069e = objArr2;
        this.f6070i = comparator;
    }
}
