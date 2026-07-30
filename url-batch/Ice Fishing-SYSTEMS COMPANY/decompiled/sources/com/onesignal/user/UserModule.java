package com.onesignal.user;

import V5.e;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.common.consistency.impl.a;
import com.onesignal.user.internal.k;
import com.onesignal.user.internal.operations.impl.executors.d;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.i;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.operations.impl.executors.n;
import com.onesignal.user.internal.operations.impl.executors.p;
import com.onesignal.user.internal.properties.b;
import kotlin.jvm.internal.h;
import q4.InterfaceC4928a;
import r4.c;

/* loaded from: classes2.dex */
public final class UserModule implements InterfaceC4928a {
    @Override // q4.InterfaceC4928a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(a.class).provides(o4.c.class);
        builder.register(b.class).provides(b.class);
        builder.register(S5.b.class).provides(com.onesignal.core.internal.startup.a.class);
        CL.v(builder, Q5.b.class, Q5.b.class, S5.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.a.class).provides(M5.b.class);
        builder.register(d.class).provides(d.class).provides(D4.d.class);
        builder.register(e.class).provides(e.class);
        CL.v(builder, S5.c.class, com.onesignal.core.internal.startup.a.class, com.onesignal.user.internal.backend.impl.c.class, M5.c.class);
        builder.register(n.class).provides(n.class).provides(D4.d.class);
        builder.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(V5.b.class);
        builder.register(O5.a.class).provides(N5.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.d.class).provides(M5.d.class);
        builder.register(p.class).provides(p.class).provides(D4.d.class);
        builder.register(i.class).provides(D4.d.class);
        CL.v(builder, g.class, D4.d.class, l.class, D4.d.class);
        builder.register(k.class).provides(L5.a.class).provides(k.class);
        builder.register(com.onesignal.user.internal.customEvents.impl.b.class).provides(P5.b.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.a.class).provides(D4.d.class);
        CL.v(builder, com.onesignal.user.internal.customEvents.impl.a.class, P5.a.class, U5.a.class, com.onesignal.core.internal.startup.b.class);
        CL.v(builder, com.onesignal.user.internal.migrations.d.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.migrations.c.class, com.onesignal.core.internal.startup.b.class);
        builder.register(T5.a.class).provides(T5.a.class);
    }
}
