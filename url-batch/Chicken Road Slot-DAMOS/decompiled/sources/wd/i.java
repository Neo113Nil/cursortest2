package wd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f10156a = new Object[0];

    public static final Object[] a(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = f10156a;
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
            int i10 = i3 + 1;
            objArr2[i3] = it.next();
            if (i10 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i11);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i10);
            }
            i3 = i10;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i3 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i10 = i3 + 1;
                    objArr2[i3] = it.next();
                    if (i10 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i11);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i10);
                        }
                        objArr[i10] = null;
                        return objArr;
                    }
                    i3 = i10;
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
