package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ra {
    public static final Object a = new Object();

    public static final Object a(qz qzVar, int i) {
        Object obj;
        int a2 = rb.a(qzVar.b, qzVar.d, i);
        if (a2 < 0 || (obj = qzVar.c[a2]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(qz qzVar) {
        int i = qzVar.d;
        int[] iArr = qzVar.b;
        Object[] objArr = qzVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        qzVar.a = false;
        qzVar.d = i2;
    }
}
