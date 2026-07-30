package com.onesignal.session;

import J3.a;
import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.i;
import com.onesignal.session.internal.outcomes.impl.j;
import com.onesignal.session.internal.outcomes.impl.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC0889a;
import t2.c;

@Metadata
/* loaded from: classes.dex */
public final class SessionModule implements InterfaceC0889a {
    @Override // s2.InterfaceC0889a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(i.class).provides(L3.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(K3.g.class).provides(a.class);
        builder.register(N3.d.class).provides(N3.d.class);
        builder.register(com.onesignal.session.internal.session.impl.b.class).provides(N3.b.class).provides(com.onesignal.core.internal.startup.b.class).provides(x2.b.class).provides(com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.session.internal.session.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.session.internal.a.class).provides(I3.a.class);
    }
}
