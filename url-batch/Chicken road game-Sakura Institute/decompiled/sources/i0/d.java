package i0;

import e6.k;
import e6.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f4840f;

    /* renamed from: g, reason: collision with root package name */
    public a f4841g;

    /* renamed from: h, reason: collision with root package name */
    public int f4842h = 0;

    public d(Object[] objArr) {
        this.f4840f = objArr;
    }

    public final void a(int i7, Object obj) {
        j(this.f4842h + 1);
        Object[] objArr = this.f4840f;
        int i8 = this.f4842h;
        if (i7 != i8) {
            k.X(objArr, objArr, i7 + 1, i7, i8);
        }
        objArr[i7] = obj;
        this.f4842h++;
    }

    public final void b(Object obj) {
        j(this.f4842h + 1);
        Object[] objArr = this.f4840f;
        int i7 = this.f4842h;
        objArr[i7] = obj;
        this.f4842h = i7 + 1;
    }

    public final void c(int i7, d dVar) {
        if (dVar.l()) {
            return;
        }
        j(this.f4842h + dVar.f4842h);
        Object[] objArr = this.f4840f;
        int i8 = this.f4842h;
        if (i7 != i8) {
            k.X(objArr, objArr, dVar.f4842h + i7, i7, i8);
        }
        k.X(dVar.f4840f, objArr, i7, 0, dVar.f4842h);
        this.f4842h += dVar.f4842h;
    }

    public final void d(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f4842h);
        Object[] objArr = this.f4840f;
        if (i7 != this.f4842h) {
            k.X(objArr, objArr, list.size() + i7, i7, this.f4842h);
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = list.get(i8);
        }
        this.f4842h = list.size() + this.f4842h;
    }

    public final boolean f(int i7, Collection collection) {
        int i8 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f4842h);
        Object[] objArr = this.f4840f;
        if (i7 != this.f4842h) {
            k.X(objArr, objArr, collection.size() + i7, i7, this.f4842h);
        }
        for (Object obj : collection) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                m.Z();
                throw null;
            }
            objArr[i8 + i7] = obj;
            i8 = i9;
        }
        this.f4842h = collection.size() + this.f4842h;
        return true;
    }

    public final List g() {
        a aVar = this.f4841g;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f4841g = aVar2;
        return aVar2;
    }

    public final void h() {
        Object[] objArr = this.f4840f;
        int i7 = this.f4842h;
        while (true) {
            i7--;
            if (-1 >= i7) {
                this.f4842h = 0;
                return;
            }
            objArr[i7] = null;
        }
    }

    public final boolean i(Object obj) {
        int i7 = this.f4842h - 1;
        if (i7 >= 0) {
            for (int i8 = 0; !r6.k.a(this.f4840f[i8], obj); i8++) {
                if (i8 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i7) {
        Object[] objArr = this.f4840f;
        if (objArr.length < i7) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i7, objArr.length * 2));
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4840f = copyOf;
        }
    }

    public final int k(Object obj) {
        int i7 = this.f4842h;
        if (i7 <= 0) {
            return -1;
        }
        Object[] objArr = this.f4840f;
        int i8 = 0;
        while (!r6.k.a(obj, objArr[i8])) {
            i8++;
            if (i8 >= i7) {
                return -1;
            }
        }
        return i8;
    }

    public final boolean l() {
        return this.f4842h == 0;
    }

    public final boolean m() {
        return this.f4842h != 0;
    }

    public final boolean n(Object obj) {
        int k8 = k(obj);
        if (k8 < 0) {
            return false;
        }
        o(k8);
        return true;
    }

    public final Object o(int i7) {
        Object[] objArr = this.f4840f;
        Object obj = objArr[i7];
        int i8 = this.f4842h;
        if (i7 != i8 - 1) {
            k.X(objArr, objArr, i7, i7 + 1, i8);
        }
        int i9 = this.f4842h - 1;
        this.f4842h = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void p(int i7, int i8) {
        if (i8 > i7) {
            int i9 = this.f4842h;
            if (i8 < i9) {
                Object[] objArr = this.f4840f;
                k.X(objArr, objArr, i7, i8, i9);
            }
            int i10 = this.f4842h;
            int i11 = i10 - (i8 - i7);
            int i12 = i10 - 1;
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    this.f4840f[i13] = null;
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f4842h = i11;
        }
    }

    public final void q(Comparator comparator) {
        Arrays.sort(this.f4840f, 0, this.f4842h, comparator);
    }
}
