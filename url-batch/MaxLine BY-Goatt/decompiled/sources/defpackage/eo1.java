package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eo1 implements RandomAccess {
    public Object[] m;
    public bo1 n;
    public int o = 0;

    public eo1(Object[] objArr) {
        this.m = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.o + 1;
        if (this.m.length < i2) {
            n(i2);
        }
        Object[] objArr = this.m;
        int i3 = this.o;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.o++;
    }

    public final void b(Object obj) {
        int i = this.o + 1;
        if (this.m.length < i) {
            n(i);
        }
        Object[] objArr = this.m;
        int i2 = this.o;
        objArr[i2] = obj;
        this.o = i2 + 1;
    }

    public final void c(int i, eo1 eo1Var) {
        int i2 = eo1Var.o;
        if (i2 == 0) {
            return;
        }
        int i3 = this.o + i2;
        if (this.m.length < i3) {
            n(i3);
        }
        Object[] objArr = this.m;
        int i4 = this.o;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(eo1Var.m, 0, objArr, i, i2);
        this.o += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.o + size;
        if (this.m.length < i2) {
            n(i2);
        }
        Object[] objArr = this.m;
        int i3 = this.o;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.o += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.o + size;
        if (this.m.length < i3) {
            n(i3);
        }
        Object[] objArr = this.m;
        int i4 = this.o;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                qv.k();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.o += size;
        return true;
    }

    public final List f() {
        bo1 bo1Var = this.n;
        if (bo1Var != null) {
            return bo1Var;
        }
        bo1 bo1Var2 = new bo1(this);
        this.n = bo1Var2;
        return bo1Var2;
    }

    public final void g() {
        Object[] objArr = this.m;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.o = 0;
    }

    public final boolean i(Object obj) {
        int i = this.o - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.b(this.m[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.m;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.b(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int j = j(obj);
        if (j < 0) {
            return false;
        }
        l(j);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.m;
        Object obj = objArr[i];
        int i2 = this.o;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.o - 1;
        this.o = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.o;
            if (i2 < i3) {
                Object[] objArr = this.m;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.o;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.m[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.o = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.m;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.m = objArr2;
    }
}
