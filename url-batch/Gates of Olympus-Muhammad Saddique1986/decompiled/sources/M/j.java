package M;

import a.AbstractC0235a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final j f3446e = new j(new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f3447d;

    public j(Object[] objArr) {
        this.f3447d = objArr;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f3447d.length;
    }

    @Override // M.c
    public final c c(int i3, Object obj) {
        Object[] objArr = this.f3447d;
        AbstractC0235a.m(i3, objArr.length);
        if (i3 == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            S1.k.o0(objArr, objArr2, 0, i3, 6);
            S1.k.m0(objArr, objArr2, i3 + 1, i3, objArr.length);
            objArr2[i3] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        f2.j.e(copyOf, "copyOf(this, size)");
        S1.k.m0(objArr, copyOf, i3 + 1, i3, objArr.length - 1);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // M.c
    public final c d(Object obj) {
        Object[] objArr = this.f3447d;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        copyOf[objArr.length] = obj;
        return new j(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0235a.l(i3, b());
        return this.f3447d[i3];
    }

    @Override // M.c
    public final c i(Collection collection) {
        Object[] objArr = this.f3447d;
        if (collection.size() + objArr.length > 32) {
            g j3 = j();
            j3.addAll(collection);
            return j3.d();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final int indexOf(Object obj) {
        return S1.k.u0(this.f3447d, obj);
    }

    @Override // M.c
    public final g j() {
        return new g(this, null, this.f3447d, 0);
    }

    @Override // M.c
    public final c k(b bVar) {
        Object[] objArr = this.f3447d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i3 = 0; i3 < length2; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) bVar.n(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    f2.j.e(objArr2, "copyOf(this, size)");
                    z3 = true;
                    length = i3;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f3446e : new j(S1.k.q0(objArr2, 0, length));
    }

    @Override // M.c
    public final c l(int i3) {
        Object[] objArr = this.f3447d;
        AbstractC0235a.l(i3, objArr.length);
        if (objArr.length == 1) {
            return f3446e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        S1.k.m0(objArr, copyOf, i3, i3 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f3447d;
        f2.j.f(objArr, "<this>");
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

    @Override // S1.AbstractC0225d, java.util.List
    public final ListIterator listIterator(int i3) {
        Object[] objArr = this.f3447d;
        AbstractC0235a.m(i3, objArr.length);
        return new d(objArr, i3, objArr.length);
    }

    @Override // M.c
    public final c m(int i3, Object obj) {
        Object[] objArr = this.f3447d;
        AbstractC0235a.l(i3, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        f2.j.e(copyOf, "copyOf(this, size)");
        copyOf[i3] = obj;
        return new j(copyOf);
    }
}
