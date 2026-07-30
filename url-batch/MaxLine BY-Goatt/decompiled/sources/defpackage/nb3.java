package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nb3 extends vp3 {
    public String p;
    public HashSet q;
    public hi r;
    public Long s;
    public Long t;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList A(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb3.A(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final zs3 B(Integer num) {
        if (this.r.containsKey(num)) {
            return (zs3) this.r.get(num);
        }
        zs3 zs3Var = new zs3(this, this.p);
        this.r.put(num, zs3Var);
        return zs3Var;
    }

    @Override // defpackage.vp3
    public final void z() {
    }
}
