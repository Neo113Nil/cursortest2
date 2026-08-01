package o0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f7317d;

    /* renamed from: e, reason: collision with root package name */
    public b f7318e;

    /* renamed from: i, reason: collision with root package name */
    public int f7319i = 0;

    public e(Object[] objArr) {
        this.f7317d = objArr;
    }

    public final void a(int i3, Object obj) {
        int i10 = this.f7319i + 1;
        if (this.f7317d.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f7317d;
        int i11 = this.f7319i;
        if (i3 != i11) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i11 - i3);
        }
        objArr[i3] = obj;
        this.f7319i++;
    }

    public final void b(Object obj) {
        int i3 = this.f7319i + 1;
        if (this.f7317d.length < i3) {
            n(i3);
        }
        Object[] objArr = this.f7317d;
        int i10 = this.f7319i;
        objArr[i10] = obj;
        this.f7319i = i10 + 1;
    }

    public final void c(int i3, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f7319i + size;
        if (this.f7317d.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f7317d;
        int i11 = this.f7319i;
        if (i3 != i11) {
            System.arraycopy(objArr, i3, objArr, i3 + size, i11 - i3);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i3 + i12] = list.get(i12);
        }
        this.f7319i += size;
    }

    public final void d(int i3, e eVar) {
        int i10 = eVar.f7319i;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f7319i + i10;
        if (this.f7317d.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f7317d;
        int i12 = this.f7319i;
        if (i3 != i12) {
            System.arraycopy(objArr, i3, objArr, i3 + i10, i12 - i3);
        }
        System.arraycopy(eVar.f7317d, 0, objArr, i3, i10);
        this.f7319i += i10;
    }

    public final boolean e(int i3, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f7319i + size;
        if (this.f7317d.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f7317d;
        int i12 = this.f7319i;
        if (i3 != i12) {
            System.arraycopy(objArr, i3, objArr, i3 + size, i12 - i3);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                y.i();
                throw null;
            }
            objArr[i10 + i3] = obj;
            i10 = i13;
        }
        this.f7319i += size;
        return true;
    }

    public final List f() {
        b bVar = this.f7318e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f7318e = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f7317d;
        int i3 = this.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = null;
        }
        this.f7319i = 0;
    }

    public final boolean h(Object obj) {
        int i3 = this.f7319i - 1;
        if (i3 >= 0) {
            for (int i10 = 0; !Intrinsics.a(this.f7317d[i10], obj); i10++) {
                if (i10 != i3) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f7317d;
        int i3 = this.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            if (Intrinsics.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int i3 = i(obj);
        if (i3 < 0) {
            return false;
        }
        l(i3);
        return true;
    }

    public final Object l(int i3) {
        Object[] objArr = this.f7317d;
        Object obj = objArr[i3];
        int i10 = this.f7319i;
        if (i3 != i10 - 1) {
            int i11 = i3 + 1;
            System.arraycopy(objArr, i11, objArr, i3, i10 - i11);
        }
        int i12 = this.f7319i - 1;
        this.f7319i = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void m(int i3, int i10) {
        if (i10 > i3) {
            int i11 = this.f7319i;
            if (i10 < i11) {
                Object[] objArr = this.f7317d;
                System.arraycopy(objArr, i10, objArr, i3, i11 - i10);
            }
            int i12 = this.f7319i;
            int i13 = i12 - (i10 - i3);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f7317d[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f7319i = i13;
        }
    }

    public final void n(int i3) {
        Object[] objArr = this.f7317d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i3, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f7317d = objArr2;
    }
}
