package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class am2 extends w0 {
    public static final am2 o = new am2(new Object[0]);
    public final Object[] n;

    public am2(Object[] objArr) {
        this.n = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.b0
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.w0
    public final w0 b(int i, Object obj) {
        Object[] objArr = this.n;
        yj1.n(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ni.i(0, i, 6, objArr, objArr2);
            ni.e(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new am2(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ni.e(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e12(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.w0
    public final w0 c(Object obj) {
        Object[] objArr = this.n;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new am2(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e12(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.w0
    public final w0 d(Collection collection) {
        Object[] objArr = this.n;
        if (collection.size() + objArr.length > 32) {
            f12 e = e();
            e.addAll(collection);
            return e.c();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new am2(copyOf);
    }

    @Override // defpackage.w0
    public final f12 e() {
        return new f12(this, null, this.n, 0);
    }

    @Override // defpackage.w0
    public final w0 f(v0 v0Var) {
        Object[] objArr = this.n;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) v0Var.invoke(obj)).booleanValue()) {
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
        return length == objArr.length ? this : length == 0 ? o : new am2(ni.j(objArr2, 0, length));
    }

    @Override // defpackage.w0
    public final w0 g(int i) {
        Object[] objArr = this.n;
        yj1.m(i, objArr.length);
        if (objArr.length == 1) {
            return o;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        ni.e(i, i + 1, objArr.length, objArr, copyOf);
        return new am2(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        yj1.m(i, a());
        return this.n[i];
    }

    @Override // defpackage.h0, java.util.List
    public final int indexOf(Object obj) {
        return oi.u(this.n, obj);
    }

    @Override // defpackage.w0
    public final w0 j(int i, Object obj) {
        yj1.m(i, a());
        Object[] objArr = this.n;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new am2(copyOf);
    }

    @Override // defpackage.h0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.n;
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

    @Override // defpackage.h0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.n;
        yj1.n(i, objArr.length);
        return new gq(objArr, i, objArr.length);
    }
}
