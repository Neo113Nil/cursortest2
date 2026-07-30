package com.onesignal.core;

import E7.l;
import K4.j;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.core.internal.http.impl.d;
import com.onesignal.core.internal.permissions.g;
import e5.n;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import q4.InterfaceC4928a;
import r4.b;
import r4.c;
import t4.f;
import v4.InterfaceC5126a;
import z4.e;

/* loaded from: classes2.dex */
public final class CoreModule implements InterfaceC4928a {

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // E7.l
        public final com.onesignal.core.internal.application.impl.a invoke(b it) {
            h.e(it, "it");
            com.onesignal.core.internal.application.impl.a instanceOrNull = com.onesignal.core.internal.application.impl.a.Companion.getInstanceOrNull();
            return instanceOrNull == null ? new com.onesignal.core.internal.application.impl.a() : instanceOrNull;
        }
    }

    @Override // q4.InterfaceC4928a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(com.onesignal.core.internal.preferences.impl.a.class).provides(F4.b.class).provides(com.onesignal.core.internal.startup.b.class);
        CL.v(builder, com.onesignal.core.internal.http.impl.c.class, d.class, com.onesignal.core.internal.http.impl.a.class, A4.c.class);
        builder.register((l) a.INSTANCE).provides(f.class);
        builder.register(com.onesignal.core.internal.device.impl.a.class).provides(y4.c.class);
        CL.v(builder, H4.a.class, G4.a.class, x4.b.class, w4.d.class);
        CL.v(builder, com.onesignal.core.internal.device.impl.b.class, y4.d.class, com.onesignal.core.internal.config.c.class, com.onesignal.core.internal.config.c.class);
        CL.v(builder, z4.c.class, e.class, com.onesignal.core.internal.backend.impl.c.class, u4.c.class);
        CL.v(builder, com.onesignal.core.internal.backend.impl.a.class, u4.b.class, com.onesignal.core.internal.config.impl.a.class, com.onesignal.core.internal.startup.b.class);
        CL.v(builder, com.onesignal.core.internal.config.impl.b.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.jwt.c.class, com.onesignal.user.internal.jwt.c.class);
        builder.register(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.operations.impl.a.class).provides(com.onesignal.core.internal.operations.impl.a.class);
        builder.register(com.onesignal.core.internal.operations.impl.b.class).provides(D4.f.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(g.class);
        builder.register(C4.a.class).provides(B4.a.class);
        builder.register(com.onesignal.core.internal.background.impl.a.class).provides(InterfaceC5126a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.purchases.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.debug.internal.crash.b.class).provides(com.onesignal.core.internal.startup.b.class);
        CL.v(builder, com.onesignal.notifications.internal.b.class, n.class, com.onesignal.inAppMessages.internal.l.class, j.class);
        builder.register(com.onesignal.location.internal.b.class).provides(W4.a.class);
    }
}
