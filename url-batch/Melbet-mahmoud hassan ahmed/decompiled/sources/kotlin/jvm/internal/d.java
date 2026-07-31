package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f18307a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        i.d(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    objArr[i7] = it.next();
                    if (i8 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i9 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i9);
                        i.c(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i8);
                        i.c(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i7 = i8;
                }
            }
        }
        return f18307a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        i.d(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
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
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i9 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                i.c(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i8] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                i.c(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i7 = i8;
        }
    }
}
