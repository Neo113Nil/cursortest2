package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class eb1 extends j0 {
    public static final eb1 g = new eb1(new Object[0]);
    public final Object[] e;

    public eb1(Object[] objArr) {
        this.e = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.m
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.j0
    public final j0 b(int i, Object obj) {
        Object[] objArr = this.e;
        y90.k(i, objArr.length);
        if (i == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            w9.e(objArr, objArr2, 0, i, 6);
            w9.c(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new eb1(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        w9.c(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new tw0(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.j0
    public final j0 d(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new eb1(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new tw0(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.j0
    public final j0 e(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length > 32) {
            uw0 f = f();
            f.addAll(collection);
            return f.d();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new eb1(copyOf);
    }

    @Override // defpackage.j0
    public final uw0 f() {
        return new uw0(this, null, this.e, 0);
    }

    @Override // defpackage.j0
    public final j0 g(i0 i0Var) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) i0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? g : new eb1(w9.f(objArr2, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        y90.c(i, a());
        return this.e[i];
    }

    @Override // defpackage.j0
    public final j0 h(int i) {
        Object[] objArr = this.e;
        y90.c(i, objArr.length);
        if (objArr.length == 1) {
            return g;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        w9.c(objArr, copyOf, i, i + 1, objArr.length);
        return new eb1(copyOf);
    }

    @Override // defpackage.j0
    public final j0 i(int i, Object obj) {
        y90.c(i, a());
        Object[] objArr = this.e;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new eb1(copyOf);
    }

    @Override // defpackage.w, java.util.List
    public final int indexOf(Object obj) {
        return y9.k(this.e, obj);
    }

    @Override // defpackage.w, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.w, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.e;
        y90.k(i, objArr.length);
        return new te(objArr, i, objArr.length);
    }
}
