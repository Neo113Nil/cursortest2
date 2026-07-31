package f2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f5824a = new Object[0];

    public static final Object[] a(Collection collection) {
        j.f(collection, "collection");
        int size = collection.size();
        Object[] objArr = f5824a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            objArr2[i3] = it.next();
            if (i4 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i5 = ((i4 * 3) + 1) >>> 1;
                if (i5 <= i4) {
                    i5 = 2147483645;
                    if (i4 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i5);
                j.e(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i4);
                j.e(copyOf, "copyOf(...)");
                return copyOf;
            }
            i3 = i4;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        j.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i3 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i4 = i3 + 1;
            objArr2[i3] = it.next();
            if (i4 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i5 = ((i4 * 3) + 1) >>> 1;
                if (i5 <= i4) {
                    i5 = 2147483645;
                    if (i4 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i5);
                j.e(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i4] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i4);
                j.e(copyOf, "copyOf(...)");
                return copyOf;
            }
            i3 = i4;
        }
    }
}
