package com.onesignal.core;

import R1.b;
import R1.c;
import T1.f;
import Z1.e;
import b2.InterfaceC0265a;
import c2.C0279a;
import com.onesignal.core.internal.http.impl.d;
import com.onesignal.core.internal.permissions.g;
import com.onesignal.debug.internal.crash.n;
import com.onesignal.inAppMessages.internal.l;
import f2.InterfaceC0365b;
import g2.InterfaceC0391a;
import h2.C0404a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import x2.InterfaceC0728a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class CoreModule implements Q1.a {

    public static final class a extends j implements InterfaceC0743l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final com.onesignal.core.internal.application.impl.a invoke(b it) {
            i.e(it, "it");
            com.onesignal.core.internal.application.impl.a instanceOrNull = com.onesignal.core.internal.application.impl.a.Companion.getInstanceOrNull();
            return instanceOrNull == null ? new com.onesignal.core.internal.application.impl.a() : instanceOrNull;
        }
    }

    @Override // Q1.a
    public void register(c builder) {
        i.e(builder, "builder");
        builder.register(com.onesignal.core.internal.preferences.impl.a.class).provides(InterfaceC0365b.class).provides(com.onesignal.core.internal.startup.b.class);
        C1.c.k(builder, com.onesignal.core.internal.http.impl.c.class, d.class, com.onesignal.core.internal.http.impl.a.class, a2.c.class);
        builder.register((InterfaceC0743l) a.INSTANCE).provides(f.class);
        builder.register(com.onesignal.core.internal.device.impl.a.class).provides(Y1.c.class);
        C1.c.k(builder, C0404a.class, InterfaceC0391a.class, X1.b.class, W1.d.class);
        C1.c.k(builder, com.onesignal.core.internal.device.impl.b.class, Y1.d.class, com.onesignal.core.internal.config.c.class, com.onesignal.core.internal.config.c.class);
        C1.c.k(builder, Z1.c.class, e.class, com.onesignal.core.internal.backend.impl.c.class, U1.c.class);
        C1.c.k(builder, com.onesignal.core.internal.backend.impl.a.class, U1.b.class, com.onesignal.core.internal.config.impl.a.class, com.onesignal.core.internal.startup.b.class);
        C1.c.k(builder, com.onesignal.core.internal.config.impl.b.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.jwt.c.class, com.onesignal.user.internal.jwt.c.class);
        builder.register(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.operations.impl.a.class).provides(com.onesignal.core.internal.operations.impl.a.class);
        builder.register(com.onesignal.core.internal.operations.impl.b.class).provides(d2.f.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(g.class);
        builder.register(C0279a.class).provides(InterfaceC0265a.class);
        builder.register(com.onesignal.core.internal.background.impl.a.class).provides(V1.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.purchases.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(n.class).provides(com.onesignal.core.internal.startup.b.class);
        C1.c.k(builder, com.onesignal.notifications.internal.b.class, F2.n.class, l.class, l2.j.class);
        builder.register(com.onesignal.location.internal.b.class).provides(InterfaceC0728a.class);
    }
}
