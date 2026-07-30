package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h11 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] m;

    public h11(Object[] objArr) {
        this.m = objArr;
    }

    public Object readResolve() {
        g11 g11Var = k11.n;
        Object[] objArr = this.m;
        if (objArr.length == 0) {
            return i82.q;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        yk3.t(objArr2.length, objArr2);
        return k11.f(objArr2.length, objArr2);
    }
}
