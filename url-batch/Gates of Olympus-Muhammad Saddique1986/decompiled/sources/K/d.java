package K;

import S1.k;
import S1.m;
import f2.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3214d;

    /* renamed from: e, reason: collision with root package name */
    public a f3215e;

    /* renamed from: f, reason: collision with root package name */
    public int f3216f = 0;

    public d(Object[] objArr) {
        this.f3214d = objArr;
    }

    public final void a(int i3, Object obj) {
        j(this.f3216f + 1);
        Object[] objArr = this.f3214d;
        int i4 = this.f3216f;
        if (i3 != i4) {
            k.m0(objArr, objArr, i3 + 1, i3, i4);
        }
        objArr[i3] = obj;
        this.f3216f++;
    }

    public final void b(Object obj) {
        j(this.f3216f + 1);
        Object[] objArr = this.f3214d;
        int i3 = this.f3216f;
        objArr[i3] = obj;
        this.f3216f = i3 + 1;
    }

    public final void c(int i3, d dVar) {
        if (dVar.l()) {
            return;
        }
        j(this.f3216f + dVar.f3216f);
        Object[] objArr = this.f3214d;
        int i4 = this.f3216f;
        if (i3 != i4) {
            k.m0(objArr, objArr, dVar.f3216f + i3, i3, i4);
        }
        k.m0(dVar.f3214d, objArr, i3, 0, dVar.f3216f);
        this.f3216f += dVar.f3216f;
    }

    public final void d(int i3, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f3216f);
        Object[] objArr = this.f3214d;
        if (i3 != this.f3216f) {
            k.m0(objArr, objArr, list.size() + i3, i3, this.f3216f);
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = list.get(i4);
        }
        this.f3216f = list.size() + this.f3216f;
    }

    public final boolean e(int i3, Collection collection) {
        int i4 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f3216f);
        Object[] objArr = this.f3214d;
        if (i3 != this.f3216f) {
            k.m0(objArr, objArr, collection.size() + i3, i3, this.f3216f);
        }
        for (Object obj : collection) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                m.D0();
                throw null;
            }
            objArr[i4 + i3] = obj;
            i4 = i5;
        }
        this.f3216f = collection.size() + this.f3216f;
        return true;
    }

    public final List g() {
        a aVar = this.f3215e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f3215e = aVar2;
        return aVar2;
    }

    public final void h() {
        Object[] objArr = this.f3214d;
        int i3 = this.f3216f;
        while (true) {
            i3--;
            if (-1 >= i3) {
                this.f3216f = 0;
                return;
            }
            objArr[i3] = null;
        }
    }

    public final boolean i(Object obj) {
        int i3 = this.f3216f - 1;
        if (i3 >= 0) {
            for (int i4 = 0; !j.a(this.f3214d[i4], obj); i4++) {
                if (i4 != i3) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i3) {
        Object[] objArr = this.f3214d;
        if (objArr.length < i3) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
            j.e(copyOf, "copyOf(this, newSize)");
            this.f3214d = copyOf;
        }
    }

    public final int k(Object obj) {
        int i3 = this.f3216f;
        if (i3 <= 0) {
            return -1;
        }
        Object[] objArr = this.f3214d;
        int i4 = 0;
        while (!j.a(obj, objArr[i4])) {
            i4++;
            if (i4 >= i3) {
                return -1;
            }
        }
        return i4;
    }

    public final boolean l() {
        return this.f3216f == 0;
    }

    public final boolean m() {
        return this.f3216f != 0;
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
        Object[] objArr = this.f3214d;
        Object obj = objArr[i3];
        int i4 = this.f3216f;
        if (i3 != i4 - 1) {
            k.m0(objArr, objArr, i3, i3 + 1, i4);
        }
        int i5 = this.f3216f - 1;
        this.f3216f = i5;
        objArr[i5] = null;
        return obj;
    }

    public final void p(int i3, int i4) {
        if (i4 > i3) {
            int i5 = this.f3216f;
            if (i4 < i5) {
                Object[] objArr = this.f3214d;
                k.m0(objArr, objArr, i3, i4, i5);
            }
            int i6 = this.f3216f;
            int i7 = i6 - (i4 - i3);
            int i8 = i6 - 1;
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    this.f3214d[i9] = null;
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f3216f = i7;
        }
    }

    public final void q(Comparator comparator) {
        Arrays.sort(this.f3214d, 0, this.f3216f, comparator);
    }
}
