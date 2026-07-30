package k0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final i f5316g = new i(new Object[0]);

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f5317f;

    public i(Object[] objArr) {
        this.f5317f = objArr;
    }

    @Override // k0.c
    public final c A(int i7, Object obj) {
        Object[] objArr = this.f5317f;
        a.a.l(i7, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        k.e(copyOf, "copyOf(this, size)");
        copyOf[i7] = obj;
        return new i(copyOf);
    }

    @Override // e6.a
    public final int a() {
        return this.f5317f.length;
    }

    @Override // k0.c
    public final c g(int i7, Object obj) {
        Object[] objArr = this.f5317f;
        a.a.n(i7, objArr.length);
        if (i7 == objArr.length) {
            return m(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            e6.k.Z(objArr, objArr2, 0, i7, 6);
            e6.k.X(objArr, objArr2, i7 + 1, i7, objArr.length);
            objArr2[i7] = obj;
            return new i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        k.e(copyOf, "copyOf(this, size)");
        e6.k.X(objArr, copyOf, i7 + 1, i7, objArr.length - 1);
        copyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.a.l(i7, a());
        return this.f5317f[i7];
    }

    @Override // e6.d, java.util.List
    public final int indexOf(Object obj) {
        return e6.k.g0(this.f5317f, obj);
    }

    @Override // e6.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f5317f;
        k.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
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

    @Override // e6.d, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f5317f;
        a.a.n(i7, objArr.length);
        return new d(objArr, i7, objArr.length);
    }

    @Override // k0.c
    public final c m(Object obj) {
        Object[] objArr = this.f5317f;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        k.e(copyOf, "copyOf(this, newSize)");
        copyOf[objArr.length] = obj;
        return new i(copyOf);
    }

    @Override // k0.c
    public final c w(Collection collection) {
        Object[] objArr = this.f5317f;
        if (collection.size() + objArr.length > 32) {
            f x8 = x();
            x8.addAll(collection);
            return x8.m();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        k.e(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new i(copyOf);
    }

    @Override // k0.c
    public final f x() {
        return new f(this, null, this.f5317f, 0);
    }

    @Override // k0.c
    public final c y(b bVar) {
        Object[] objArr = this.f5317f;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z8 = false;
        for (int i7 = 0; i7 < length2; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) bVar.f(obj)).booleanValue()) {
                if (!z8) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    k.e(objArr2, "copyOf(this, size)");
                    z8 = true;
                    length = i7;
                }
            } else if (z8) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f5316g : new i(e6.k.b0(objArr2, 0, length));
    }

    @Override // k0.c
    public final c z(int i7) {
        Object[] objArr = this.f5317f;
        a.a.l(i7, objArr.length);
        if (objArr.length == 1) {
            return f5316g;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        k.e(copyOf, "copyOf(this, newSize)");
        e6.k.X(objArr, copyOf, i7, i7 + 1, objArr.length);
        return new i(copyOf);
    }
}
