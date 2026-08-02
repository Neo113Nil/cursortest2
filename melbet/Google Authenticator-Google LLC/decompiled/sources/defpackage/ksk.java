package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksk {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        while (true) {
            objArr[i] = it.next();
            i++;
            if (i >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i2);
                objArr.getClass();
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i);
                copyOf.getClass();
                return copyOf;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r5.length > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r5.length > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r5[0] = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i = 0;
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
                    objArr2[i] = it.next();
                    i++;
                    if (i >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i2 = ((i * 3) + 1) >>> 1;
                        if (i2 <= i) {
                            i2 = 2147483645;
                            if (i >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i2);
                        objArr2.getClass();
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i);
                        copyOf.getClass();
                        return copyOf;
                    }
                }
            }
        }
        return objArr;
    }
}
