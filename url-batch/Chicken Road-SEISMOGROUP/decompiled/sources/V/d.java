package V;

import a.AbstractC0016a;

/* loaded from: classes.dex */
public abstract class d extends AbstractC0016a {
    public static final void I(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        e0.h.e(objArr, "<this>");
        e0.h.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }
}
