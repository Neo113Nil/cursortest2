package t0;

import b1.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.v;
import kotlin.collections.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: i, reason: collision with root package name */
    public static final h f9218i = new h(new Object[0]);

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f9219e;

    public h(Object[] objArr) {
        this.f9219e = objArr;
        int length = objArr.length;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f9219e.length;
    }

    @Override // t0.b
    public final b c(int i3, Object obj) {
        Object[] objArr = this.f9219e;
        i7.a.C(i3, objArr.length);
        if (i3 == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            v.g(0, i3, 6, objArr, objArr2);
            v.d(i3 + 1, i3, objArr.length, objArr, objArr2);
            objArr2[i3] = obj;
            return new h(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        v.d(i3 + 1, i3, objArr.length - 1, objArr, copyOf);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new d(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // t0.b
    public final b e(Object obj) {
        Object[] objArr = this.f9219e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new h(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new d(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // t0.b
    public final b f(Collection collection) {
        Object[] objArr = this.f9219e;
        if (collection.size() + objArr.length > 32) {
            e g = g();
            g.addAll(collection);
            return g.e();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new h(copyOf);
    }

    @Override // t0.b
    public final e g() {
        return new e(this, null, this.f9219e, 0);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        i7.a.w(i3, b());
        return this.f9219e[i3];
    }

    @Override // t0.b
    public final b h(t tVar) {
        Object[] objArr = this.f9219e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z10 = false;
        for (int i3 = 0; i3 < length2; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) tVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z10 = true;
                    length = i3;
                }
            } else if (z10) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f9218i : new h(v.h(objArr2, 0, length));
    }

    @Override // t0.b
    public final b i(int i3) {
        Object[] objArr = this.f9219e;
        i7.a.w(i3, objArr.length);
        if (objArr.length == 1) {
            return f9218i;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        v.d(i3, i3 + 1, objArr.length, objArr, copyOf);
        return new h(copyOf);
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        return w.p(this.f9219e, obj);
    }

    @Override // t0.b
    public final b k(int i3, Object obj) {
        i7.a.w(i3, b());
        Object[] objArr = this.f9219e;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i3] = obj;
        return new h(copyOf);
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f9219e;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i3 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length = i3;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i3) {
        Object[] objArr = this.f9219e;
        i7.a.C(i3, objArr.length);
        return new c(objArr, i3, objArr.length);
    }
}
