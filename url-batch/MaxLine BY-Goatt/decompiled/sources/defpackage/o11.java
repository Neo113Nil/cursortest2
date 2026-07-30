package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o11 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] m;

    public o11(Object[] objArr) {
        this.m = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.m;
        int length = objArr.length;
        return length != 0 ? length != 1 ? p11.j(objArr.length, (Object[]) objArr.clone()) : new nl2(objArr[0]) : o82.v;
    }
}
