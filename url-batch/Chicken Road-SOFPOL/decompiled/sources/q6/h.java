package q6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f6197a = new Object[0];

    public static final Object[] a(Collection collection) {
        i.e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f6197a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i8 = i + 1;
            objArr2[i] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                i.d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                i.d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i = i8;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        i.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i8 = i + 1;
                    objArr2[i] = it.next();
                    if (i8 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            i9 = 2147483645;
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i9);
                        i.d(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i8] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i8);
                        i.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i = i8;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
