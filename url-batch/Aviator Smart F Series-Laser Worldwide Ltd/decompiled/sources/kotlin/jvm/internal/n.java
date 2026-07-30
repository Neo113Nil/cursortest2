package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class n {
    private static final Object[] EMPTY = new Object[0];
    private static final int MAX_SIZE = 2147483645;

    public static final Object[] toArray(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        s.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i8 = 0;
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
            s.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i9 = i8 + 1;
            objArr2[i8] = it.next();
            if (i9 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i10 = ((i9 * 3) + 1) >>> 1;
                if (i10 <= i9) {
                    i10 = MAX_SIZE;
                    if (i9 >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i10);
                s.checkNotNullExpressionValue(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i9] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i9);
                s.checkNotNullExpressionValue(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i8 = i9;
        }
    }

    private static final Object[] toArrayImpl(Collection<?> collection, f6.a aVar, f6.l lVar, f6.p pVar) {
        int size = collection.size();
        if (size == 0) {
            return (Object[]) aVar.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return (Object[]) aVar.invoke();
        }
        Object[] objArr = (Object[]) lVar.invoke(Integer.valueOf(size));
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            objArr[i8] = it.next();
            if (i9 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i10 = ((i9 * 3) + 1) >>> 1;
                if (i10 <= i9) {
                    i10 = MAX_SIZE;
                    if (i9 >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i10);
                s.checkNotNullExpressionValue(objArr, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                return (Object[]) pVar.invoke(objArr, Integer.valueOf(i9));
            }
            i8 = i9;
        }
    }

    public static final Object[] toArray(Collection<?> collection) {
        s.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    objArr[i8] = it.next();
                    if (i9 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i10 = ((i9 * 3) + 1) >>> 1;
                        if (i10 <= i9) {
                            i10 = MAX_SIZE;
                            if (i9 >= MAX_SIZE) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i10);
                        s.checkNotNullExpressionValue(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i9);
                        s.checkNotNullExpressionValue(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i8 = i9;
                }
            }
        }
        return EMPTY;
    }
}
