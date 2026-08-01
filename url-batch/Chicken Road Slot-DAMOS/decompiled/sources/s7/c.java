package s7;

import java.util.HashSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends d4 {

    /* renamed from: r, reason: collision with root package name */
    public String f8533r;

    /* renamed from: s, reason: collision with root package name */
    public HashSet f8534s;

    /* renamed from: t, reason: collision with root package name */
    public s.e f8535t;

    /* renamed from: u, reason: collision with root package name */
    public Long f8536u;

    /* renamed from: v, reason: collision with root package name */
    public Long f8537v;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList w(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.c.w(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final s4 x(Integer num) {
        if (this.f8535t.containsKey(num)) {
            return (s4) this.f8535t.get(num);
        }
        s4 s4Var = new s4(this, this.f8533r);
        this.f8535t.put(num, s4Var);
        return s4Var;
    }

    @Override // s7.d4
    public final void v() {
    }
}
