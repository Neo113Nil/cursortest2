package com.onesignal.core;

import B2.e;
import N2.j;
import com.onesignal.core.internal.http.impl.d;
import com.onesignal.core.internal.permissions.g;
import com.onesignal.inAppMessages.internal.l;
import h3.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import r4.f;
import s2.InterfaceC0889a;
import t2.b;
import t2.c;
import x2.InterfaceC1004a;
import y2.InterfaceC1027d;
import z2.C1056b;

@Metadata
/* loaded from: classes.dex */
public final class CoreModule implements InterfaceC0889a {

    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.onesignal.core.internal.application.impl.a invoke(b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            com.onesignal.core.internal.application.impl.a instanceOrNull = com.onesignal.core.internal.application.impl.a.Companion.getInstanceOrNull();
            return instanceOrNull == null ? new com.onesignal.core.internal.application.impl.a() : instanceOrNull;
        }
    }

    @Override // s2.InterfaceC0889a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.onesignal.core.internal.preferences.impl.a.class).provides(H2.b.class).provides(com.onesignal.core.internal.startup.b.class);
        f.h(builder, com.onesignal.core.internal.http.impl.c.class, d.class, com.onesignal.core.internal.http.impl.a.class, C2.c.class);
        builder.register((Function1) a.INSTANCE).provides(v2.f.class);
        builder.register(com.onesignal.core.internal.device.impl.a.class).provides(A2.c.class);
        f.h(builder, J2.a.class, I2.a.class, C1056b.class, InterfaceC1027d.class);
        f.h(builder, com.onesignal.core.internal.device.impl.b.class, A2.d.class, com.onesignal.core.internal.config.c.class, com.onesignal.core.internal.config.c.class);
        f.h(builder, B2.c.class, e.class, com.onesignal.core.internal.backend.impl.c.class, w2.c.class);
        f.h(builder, com.onesignal.core.internal.backend.impl.a.class, w2.b.class, com.onesignal.core.internal.config.impl.a.class, com.onesignal.core.internal.startup.b.class);
        f.h(builder, com.onesignal.core.internal.config.impl.b.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.jwt.c.class, com.onesignal.user.internal.jwt.c.class);
        builder.register(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.operations.impl.a.class).provides(com.onesignal.core.internal.operations.impl.a.class);
        builder.register(com.onesignal.core.internal.operations.impl.b.class).provides(F2.f.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(g.class);
        builder.register(E2.a.class).provides(D2.a.class);
        builder.register(com.onesignal.core.internal.background.impl.a.class).provides(InterfaceC1004a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.purchases.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.debug.internal.crash.b.class).provides(com.onesignal.core.internal.startup.b.class);
        f.h(builder, com.onesignal.notifications.internal.b.class, n.class, l.class, j.class);
        builder.register(com.onesignal.location.internal.b.class).provides(Z2.a.class);
    }
}
