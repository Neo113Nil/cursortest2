package K;

import M1.k;
import M1.m;
import Z1.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2640d;

    /* renamed from: e, reason: collision with root package name */
    public a f2641e;

    /* renamed from: f, reason: collision with root package name */
    public int f2642f = 0;

    public d(Object[] objArr) {
        this.f2640d = objArr;
    }

    public final void a(int i3, Object obj) {
        j(this.f2642f + 1);
        Object[] objArr = this.f2640d;
        int i4 = this.f2642f;
        if (i3 != i4) {
            k.X(objArr, objArr, i3 + 1, i3, i4);
        }
        objArr[i3] = obj;
        this.f2642f++;
    }

    public final void b(Object obj) {
        j(this.f2642f + 1);
        Object[] objArr = this.f2640d;
        int i3 = this.f2642f;
        objArr[i3] = obj;
        this.f2642f = i3 + 1;
    }

    public final void c(int i3, d dVar) {
        if (dVar.l()) {
            return;
        }
        j(this.f2642f + dVar.f2642f);
        Object[] objArr = this.f2640d;
        int i4 = this.f2642f;
        if (i3 != i4) {
            k.X(objArr, objArr, dVar.f2642f + i3, i3, i4);
        }
        k.X(dVar.f2640d, objArr, i3, 0, dVar.f2642f);
        this.f2642f += dVar.f2642f;
    }

    public final void d(int i3, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f2642f);
        Object[] objArr = this.f2640d;
        if (i3 != this.f2642f) {
            k.X(objArr, objArr, list.size() + i3, i3, this.f2642f);
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = list.get(i4);
        }
        this.f2642f = list.size() + this.f2642f;
    }

    public final boolean e(int i3, Collection collection) {
        int i4 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f2642f);
        Object[] objArr = this.f2640d;
        if (i3 != this.f2642f) {
            k.X(objArr, objArr, collection.size() + i3, i3, this.f2642f);
        }
        for (Object obj : collection) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                m.f0();
                throw null;
            }
            objArr[i4 + i3] = obj;
            i4 = i5;
        }
        this.f2642f = collection.size() + this.f2642f;
        return true;
    }

    public final List g() {
        a aVar = this.f2641e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f2641e = aVar2;
        return aVar2;
    }

    public final void h() {
        Object[] objArr = this.f2640d;
        int i3 = this.f2642f;
        while (true) {
            i3--;
            if (-1 >= i3) {
                this.f2642f = 0;
                return;
            }
            objArr[i3] = null;
        }
    }

    public final boolean i(Object obj) {
        int i3 = this.f2642f - 1;
        if (i3 >= 0) {
            for (int i4 = 0; !i.a(this.f2640d[i4], obj); i4++) {
                if (i4 != i3) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i3) {
        Object[] objArr = this.f2640d;
        if (objArr.length < i3) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
            i.e(copyOf, "copyOf(this, newSize)");
            this.f2640d = copyOf;
        }
    }

    public final int k(Object obj) {
        int i3 = this.f2642f;
        if (i3 <= 0) {
            return -1;
        }
        Object[] objArr = this.f2640d;
        int i4 = 0;
        while (!i.a(obj, objArr[i4])) {
            i4++;
            if (i4 >= i3) {
                return -1;
            }
        }
        return i4;
    }

    public final boolean l() {
        return this.f2642f == 0;
    }

    public final boolean m() {
        return this.f2642f != 0;
    }

    public final boolean n(Object obj) {
        int k3 = k(obj);
        if (k3 < 0) {
            return false;
        }
        o(k3);
        return true;
    }

    public final Object o(int i3) {
        Object[] objArr = this.f2640d;
        Object obj = objArr[i3];
        int i4 = this.f2642f;
        if (i3 != i4 - 1) {
            k.X(objArr, objArr, i3, i3 + 1, i4);
        }
        int i5 = this.f2642f - 1;
        this.f2642f = i5;
        objArr[i5] = null;
        return obj;
    }

    public final void p(int i3, int i4) {
        if (i4 > i3) {
            int i5 = this.f2642f;
            if (i4 < i5) {
                Object[] objArr = this.f2640d;
                k.X(objArr, objArr, i3, i4, i5);
            }
            int i6 = this.f2642f;
            int i7 = i6 - (i4 - i3);
            int i8 = i6 - 1;
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    this.f2640d[i9] = null;
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f2642f = i7;
        }
    }

    public final void q(Comparator comparator) {
        Arrays.sort(this.f2640d, 0, this.f2642f, comparator);
    }
}
