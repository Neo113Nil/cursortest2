package q0;

import d6.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final j f5955e = new j(new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f5956d;

    public j(Object[] objArr) {
        this.f5956d = objArr;
    }

    @Override // d6.a
    public final int a() {
        return this.f5956d.length;
    }

    @Override // q0.c
    public final c b(int i, Object obj) {
        Object[] objArr = this.f5956d;
        r.m(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.J(objArr, objArr2, 0, i, 6);
            l.H(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        q6.i.d(copyOf, "copyOf(...)");
        l.H(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // q0.c
    public final c c(Object obj) {
        Object[] objArr = this.f5956d;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        q6.i.d(copyOf, "copyOf(...)");
        copyOf[objArr.length] = obj;
        return new j(copyOf);
    }

    @Override // q0.c
    public final c e(Collection collection) {
        Object[] objArr = this.f5956d;
        if (collection.size() + objArr.length > 32) {
            g f6 = f();
            f6.addAll(collection);
            return f6.c();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        q6.i.d(copyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // q0.c
    public final g f() {
        return new g(this, null, this.f5956d, 0);
    }

    @Override // q0.c
    public final c g(b bVar) {
        Object[] objArr = this.f5956d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) bVar.i(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    q6.i.d(objArr2, "copyOf(...)");
                    z3 = true;
                    length = i;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f5955e : new j(l.K(objArr2, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        r.l(i, a());
        return this.f5956d[i];
    }

    @Override // q0.c
    public final c h(int i) {
        Object[] objArr = this.f5956d;
        r.l(i, objArr.length);
        if (objArr.length == 1) {
            return f5955e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        q6.i.d(copyOf, "copyOf(...)");
        l.H(objArr, copyOf, i, i + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // q0.c
    public final c i(int i, Object obj) {
        Object[] objArr = this.f5956d;
        r.l(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        q6.i.d(copyOf, "copyOf(...)");
        copyOf[i] = obj;
        return new j(copyOf);
    }

    @Override // d6.e, java.util.List
    public final int indexOf(Object obj) {
        return l.P(this.f5956d, obj);
    }

    @Override // d6.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f5956d;
        q6.i.e(objArr, "<this>");
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
                    int i8 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length2 = i8;
                }
            }
        }
        return -1;
    }

    @Override // d6.e, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f5956d;
        r.m(i, objArr.length);
        return new d(objArr, i, objArr.length);
    }
}
