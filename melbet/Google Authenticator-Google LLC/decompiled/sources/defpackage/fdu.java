package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fdu {
    static final Object[] a;
    static final fdu b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new fdu(objArr);
    }

    public fdu(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fdu)) {
            return false;
        }
        fdu fduVar = (fdu) obj;
        return this.d == fduVar.d && Arrays.equals(this.c, fduVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
