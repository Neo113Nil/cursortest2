package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hiz implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public hiz(hic hicVar) {
        hfh hfhVar = (hfh) hicVar;
        int size = hfhVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (hid hidVar : hfhVar.j()) {
            this.a[i] = hidVar.a;
            this.b[i] = hidVar.a();
            i++;
        }
    }

    Object readResolve() {
        Object[] objArr = this.a;
        hfe hfeVar = new hfe(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            hfeVar.d(objArr[i], this.b[i]);
        }
        return hfeVar.a();
    }
}
