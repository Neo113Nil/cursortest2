package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class eo0 implements RandomAccess {
    public Object[] d;
    public bo0 e;
    public int g = 0;

    public eo0(Object[] objArr) {
        this.d = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.g + 1;
        if (this.d.length < i2) {
            m(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.g;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.g++;
    }

    public final void b(Object obj) {
        int i = this.g + 1;
        if (this.d.length < i) {
            m(i);
        }
        Object[] objArr = this.d;
        int i2 = this.g;
        objArr[i2] = obj;
        this.g = i2 + 1;
    }

    public final void c(int i, eo0 eo0Var) {
        int i2 = eo0Var.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.g + i2;
        if (this.d.length < i3) {
            m(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.g;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(eo0Var.d, 0, objArr, i, i2);
        this.g += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.g + size;
        if (this.d.length < i2) {
            m(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.g;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.g += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.g + size;
        if (this.d.length < i3) {
            m(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.g;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                zh.g();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.g += size;
        return true;
    }

    public final List f() {
        bo0 bo0Var = this.e;
        if (bo0Var != null) {
            return bo0Var;
        }
        bo0 bo0Var2 = new bo0(this);
        this.e = bo0Var2;
        return bo0Var2;
    }

    public final void g() {
        Object[] objArr = this.d;
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.g = 0;
    }

    public final boolean h(Object obj) {
        int i = this.g - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.a(this.d[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.d;
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.a(obj, objArr[i2])) {
                return i2;
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
        Object[] objArr = this.d;
        Object obj = objArr[i];
        int i2 = this.g;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.g - 1;
        this.g = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.g;
            if (i2 < i3) {
                Object[] objArr = this.d;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.g;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.d[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.g = i5;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.d = objArr2;
    }
}
