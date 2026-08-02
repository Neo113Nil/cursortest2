package G0;

import a.AbstractC0132a;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0132a {
    public static final void S(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        Q0.h.e(objArr, "<this>");
        Q0.h.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static Object T(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
