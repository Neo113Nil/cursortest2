package M;

import M1.B;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final j f2755e = new j(new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2756d;

    public j(Object[] objArr) {
        this.f2756d = objArr;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f2756d.length;
    }

    @Override // M.c
    public final c c(int i3, Object obj) {
        Object[] objArr = this.f2756d;
        B.r(i3, objArr.length);
        if (i3 == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            M1.k.Z(objArr, objArr2, 0, i3, 6);
            M1.k.X(objArr, objArr2, i3 + 1, i3, objArr.length);
            objArr2[i3] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Z1.i.e(copyOf, "copyOf(this, size)");
        M1.k.X(objArr, copyOf, i3 + 1, i3, objArr.length - 1);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // M.c
    public final c d(Object obj) {
        Object[] objArr = this.f2756d;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        copyOf[objArr.length] = obj;
        return new j(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        B.q(i3, b());
        return this.f2756d[i3];
    }

    @Override // M.c
    public final c i(Collection collection) {
        Object[] objArr = this.f2756d;
        if (collection.size() + objArr.length > 32) {
            g j3 = j();
            j3.addAll(collection);
            return j3.d();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final int indexOf(Object obj) {
        return M1.k.g0(this.f2756d, obj);
    }

    @Override // M.c
    public final g j() {
        return new g(this, null, this.f2756d, 0);
    }

    @Override // M.c
    public final c k(b bVar) {
        Object[] objArr = this.f2756d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i3 = 0; i3 < length2; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) bVar.j(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    Z1.i.e(objArr2, "copyOf(this, size)");
                    z3 = true;
                    length = i3;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f2755e : new j(M1.k.b0(objArr2, 0, length));
    }

    @Override // M.c
    public final c l(int i3) {
        Object[] objArr = this.f2756d;
        B.q(i3, objArr.length);
        if (objArr.length == 1) {
            return f2755e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        M1.k.X(objArr, copyOf, i3, i3 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f2756d;
        Z1.i.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i3 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i3 < 0) {
                    return -1;
                }
                length = i3;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i4 = length2 - 1;
                if (obj.equals(objArr[length2])) {
                    return length2;
                }
                if (i4 < 0) {
                    return -1;
                }
                length2 = i4;
            }
        }
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final ListIterator listIterator(int i3) {
        Object[] objArr = this.f2756d;
        B.r(i3, objArr.length);
        return new d(objArr, i3, objArr.length);
    }

    @Override // M.c
    public final c m(int i3, Object obj) {
        Object[] objArr = this.f2756d;
        B.q(i3, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Z1.i.e(copyOf, "copyOf(this, size)");
        copyOf[i3] = obj;
        return new j(copyOf);
    }
}
