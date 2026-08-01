package com.onesignal.session;

import aa.a;
import ba.c;
import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.i;
import com.onesignal.session.internal.outcomes.impl.j;
import com.onesignal.session.internal.outcomes.impl.l;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/session/SessionModule;", "Laa/a;", "<init>", "()V", "Lba/c;", "builder", "", "register", "(Lba/c;)V", "com.onesignal.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionModule implements a {
    @Override // aa.a
    public void register(c builder) {
        builder.getClass();
        builder.register(j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(i.class).provides(qc.b.class).provides(ra.b.class);
        builder.register(pc.g.class).provides(oc.a.class);
        builder.register(sc.d.class).provides(sc.d.class);
        builder.register(com.onesignal.session.internal.session.impl.b.class).provides(sc.b.class).provides(ra.b.class).provides(ga.b.class).provides(ra.a.class);
        v4.a.u(builder, com.onesignal.session.internal.session.impl.a.class, ra.b.class, com.onesignal.session.internal.a.class, nc.a.class);
    }
}
