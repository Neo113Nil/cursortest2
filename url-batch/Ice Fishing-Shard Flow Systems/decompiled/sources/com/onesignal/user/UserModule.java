package com.onesignal.user;

import Y3.e;
import com.onesignal.common.consistency.impl.a;
import com.onesignal.user.internal.k;
import com.onesignal.user.internal.operations.impl.executors.d;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.i;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.operations.impl.executors.n;
import com.onesignal.user.internal.operations.impl.executors.p;
import com.onesignal.user.internal.properties.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r4.f;
import s2.InterfaceC0889a;
import t2.c;

@Metadata
/* loaded from: classes.dex */
public final class UserModule implements InterfaceC0889a {
    @Override // s2.InterfaceC0889a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(a.class).provides(q2.c.class);
        builder.register(b.class).provides(b.class);
        builder.register(V3.b.class).provides(com.onesignal.core.internal.startup.a.class);
        f.h(builder, T3.b.class, T3.b.class, V3.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.a.class).provides(P3.b.class);
        builder.register(d.class).provides(d.class).provides(F2.d.class);
        builder.register(e.class).provides(e.class);
        f.h(builder, V3.c.class, com.onesignal.core.internal.startup.a.class, com.onesignal.user.internal.backend.impl.c.class, P3.c.class);
        builder.register(n.class).provides(n.class).provides(F2.d.class);
        builder.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(Y3.b.class);
        builder.register(R3.a.class).provides(Q3.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.d.class).provides(P3.d.class);
        builder.register(p.class).provides(p.class).provides(F2.d.class);
        builder.register(i.class).provides(F2.d.class);
        f.h(builder, g.class, F2.d.class, l.class, F2.d.class);
        builder.register(k.class).provides(O3.a.class).provides(k.class);
        builder.register(com.onesignal.user.internal.customEvents.impl.b.class).provides(S3.b.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.a.class).provides(F2.d.class);
        f.h(builder, com.onesignal.user.internal.customEvents.impl.a.class, S3.a.class, X3.a.class, com.onesignal.core.internal.startup.b.class);
        f.h(builder, com.onesignal.user.internal.migrations.d.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.migrations.c.class, com.onesignal.core.internal.startup.b.class);
        builder.register(W3.a.class).provides(W3.a.class);
    }
}
