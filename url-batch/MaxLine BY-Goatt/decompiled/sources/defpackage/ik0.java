package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ik0 extends dd2 {
    public final HashMap q = new HashMap();

    @Override // defpackage.dd2
    public final ad2 a(Object obj) {
        return (ad2) this.q.get(obj);
    }

    @Override // defpackage.dd2
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.q.remove(obj);
        return b;
    }
}
