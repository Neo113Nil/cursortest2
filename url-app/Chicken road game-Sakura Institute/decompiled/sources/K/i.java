package K;

import a.AbstractC0345a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;
import z2.C1439w;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final i f3442i = new i(new Object[0]);

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f3443e;

    public i(Object[] objArr) {
        this.f3443e = objArr;
        int length = objArr.length;
    }

    @Override // J.c
    public final f a() {
        return new f(this, null, this.f3443e, 0);
    }

    @Override // java.util.List, J.c
    public final J.c add(int i2, Object obj) {
        Object[] objArr = this.f3443e;
        AbstractC0345a.k(i2, objArr.length);
        if (i2 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            C1436t.h(objArr, objArr2, 0, i2, 6);
            C1436t.f(objArr, objArr2, i2 + 1, i2, objArr.length);
            objArr2[i2] = obj;
            return new i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        C1436t.f(objArr, copyOf, i2 + 1, i2, objArr.length - 1);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // K.c, java.util.Collection, java.util.List, J.c
    public final J.c addAll(Collection collection) {
        Object[] objArr = this.f3443e;
        if (collection.size() + objArr.length > 32) {
            f a4 = a();
            a4.addAll(collection);
            return a4.s();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new i(copyOf);
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f3443e.length;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0345a.j(i2, e());
        return this.f3443e[i2];
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final int indexOf(Object obj) {
        return C1439w.v(this.f3443e, obj);
    }

    @Override // J.c
    public final J.c l(int i2) {
        Object[] objArr = this.f3443e;
        AbstractC0345a.j(i2, objArr.length);
        if (objArr.length == 1) {
            return f3442i;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        C1436t.f(objArr, copyOf, i2, i2 + 1, objArr.length);
        return new i(copyOf);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f3443e;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i2 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i2 < 0) {
                    return -1;
                }
                length = i2;
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

    @Override // z2.AbstractC1420d, java.util.List
    public final ListIterator listIterator(int i2) {
        Object[] objArr = this.f3443e;
        AbstractC0345a.k(i2, objArr.length);
        return new d(objArr, i2, objArr.length);
    }

    @Override // J.c
    public final J.c o(b bVar) {
        Object[] objArr = this.f3443e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z4 = false;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z4) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, size)");
                    z4 = true;
                    length = i2;
                }
            } else if (z4) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f3442i : new i(C1436t.j(objArr2, 0, length));
    }

    @Override // z2.AbstractC1420d, java.util.List, J.c
    public final J.c set(int i2, Object obj) {
        AbstractC0345a.j(i2, e());
        Object[] objArr = this.f3443e;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2] = obj;
        return new i(copyOf);
    }

    @Override // java.util.Collection, java.util.List, J.c
    public final J.c add(Object obj) {
        Object[] objArr = this.f3443e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = obj;
            return new i(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }
}
