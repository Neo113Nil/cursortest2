package o0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5578d;

    /* renamed from: e, reason: collision with root package name */
    public b f5579e;

    /* renamed from: f, reason: collision with root package name */
    public int f5580f = 0;

    public e(Object[] objArr) {
        this.f5578d = objArr;
    }

    public final void a(int i, Object obj) {
        int i8 = this.f5580f + 1;
        if (this.f5578d.length < i8) {
            m(i8);
        }
        Object[] objArr = this.f5578d;
        int i9 = this.f5580f;
        if (i != i9) {
            System.arraycopy(objArr, i, objArr, i + 1, i9 - i);
        }
        objArr[i] = obj;
        this.f5580f++;
    }

    public final void b(Object obj) {
        int i = this.f5580f + 1;
        if (this.f5578d.length < i) {
            m(i);
        }
        Object[] objArr = this.f5578d;
        int i8 = this.f5580f;
        objArr[i8] = obj;
        this.f5580f = i8 + 1;
    }

    public final void c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i8 = this.f5580f + size;
        if (this.f5578d.length < i8) {
            m(i8);
        }
        Object[] objArr = this.f5578d;
        int i9 = this.f5580f;
        if (i != i9) {
            System.arraycopy(objArr, i, objArr, i + size, i9 - i);
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr[i + i10] = list.get(i10);
        }
        this.f5580f += size;
    }

    public final void d(int i, e eVar) {
        int i8 = eVar.f5580f;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f5580f + i8;
        if (this.f5578d.length < i9) {
            m(i9);
        }
        Object[] objArr = this.f5578d;
        int i10 = this.f5580f;
        if (i != i10) {
            System.arraycopy(objArr, i, objArr, i + i8, i10 - i);
        }
        System.arraycopy(eVar.f5578d, 0, objArr, i, i8);
        this.f5580f += i8;
    }

    public final boolean e(int i, Collection collection) {
        int i8 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i9 = this.f5580f + size;
        if (this.f5578d.length < i9) {
            m(i9);
        }
        Object[] objArr = this.f5578d;
        int i10 = this.f5580f;
        if (i != i10) {
            System.arraycopy(objArr, i, objArr, i + size, i10 - i);
        }
        for (Object obj : collection) {
            int i11 = i8 + 1;
            if (i8 < 0) {
                s6.a.J();
                throw null;
            }
            objArr[i8 + i] = obj;
            i8 = i11;
        }
        this.f5580f += size;
        return true;
    }

    public final List f() {
        b bVar = this.f5579e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f5579e = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f5578d;
        int i = this.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = null;
        }
        this.f5580f = 0;
    }

    public final boolean h(Object obj) {
        int i = this.f5580f - 1;
        if (i >= 0) {
            for (int i8 = 0; !i.a(this.f5578d[i8], obj); i8++) {
                if (i8 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f5578d;
        int i = this.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            if (i.a(obj, objArr[i8])) {
                return i8;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final Object k(int i) {
        Object[] objArr = this.f5578d;
        Object obj = objArr[i];
        int i8 = this.f5580f;
        if (i != i8 - 1) {
            int i9 = i + 1;
            System.arraycopy(objArr, i9, objArr, i, i8 - i9);
        }
        int i10 = this.f5580f - 1;
        this.f5580f = i10;
        objArr[i10] = null;
        return obj;
    }

    public final void l(int i, int i8) {
        if (i8 > i) {
            int i9 = this.f5580f;
            if (i8 < i9) {
                Object[] objArr = this.f5578d;
                System.arraycopy(objArr, i8, objArr, i, i9 - i8);
            }
            int i10 = this.f5580f;
            int i11 = i10 - (i8 - i);
            int i12 = i10 - 1;
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    this.f5578d[i13] = null;
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f5580f = i11;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.f5578d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f5578d = objArr2;
    }
}
