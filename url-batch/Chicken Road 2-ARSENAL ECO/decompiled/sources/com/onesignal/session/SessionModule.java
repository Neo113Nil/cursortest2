package com.onesignal.session;

import Q1.a;
import R1.c;
import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.j;
import com.onesignal.session.internal.outcomes.impl.l;
import g3.InterfaceC0392a;
import h3.InterfaceC0405a;
import kotlin.jvm.internal.i;
import l3.InterfaceC0494b;

/* loaded from: classes.dex */
public final class SessionModule implements a {
    @Override // Q1.a
    public void register(c builder) {
        i.e(builder, "builder");
        builder.register(j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(com.onesignal.session.internal.outcomes.impl.i.class).provides(j3.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(i3.g.class).provides(InterfaceC0405a.class);
        builder.register(l3.d.class).provides(l3.d.class);
        builder.register(com.onesignal.session.internal.session.impl.b.class).provides(InterfaceC0494b.class).provides(com.onesignal.core.internal.startup.b.class).provides(V1.b.class).provides(com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.session.internal.session.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.session.internal.a.class).provides(InterfaceC0392a.class);
    }
}
