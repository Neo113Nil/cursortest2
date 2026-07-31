package com.onesignal.user;

import Q1.a;
import R1.c;
import com.onesignal.user.internal.k;
import com.onesignal.user.internal.operations.impl.executors.d;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.operations.impl.executors.n;
import com.onesignal.user.internal.operations.impl.executors.p;
import com.onesignal.user.internal.properties.b;
import kotlin.jvm.internal.i;
import n3.InterfaceC0544b;
import n3.InterfaceC0545c;
import n3.InterfaceC0546d;
import o3.InterfaceC0559a;
import p3.C0579a;
import q3.InterfaceC0599a;
import t3.C0662a;
import t3.C0663b;
import u3.C0692a;
import v3.C0706a;
import w3.InterfaceC0720b;
import w3.e;

/* loaded from: classes.dex */
public final class UserModule implements a {
    @Override // Q1.a
    public void register(c builder) {
        i.e(builder, "builder");
        builder.register(com.onesignal.common.consistency.impl.a.class).provides(O1.c.class);
        builder.register(b.class).provides(b.class);
        builder.register(C0663b.class).provides(com.onesignal.core.internal.startup.a.class);
        C1.c.k(builder, r3.b.class, r3.b.class, C0662a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.a.class).provides(InterfaceC0544b.class);
        builder.register(d.class).provides(d.class).provides(d2.d.class);
        builder.register(e.class).provides(e.class);
        C1.c.k(builder, t3.c.class, com.onesignal.core.internal.startup.a.class, com.onesignal.user.internal.backend.impl.c.class, InterfaceC0545c.class);
        builder.register(n.class).provides(n.class).provides(d2.d.class);
        builder.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(InterfaceC0720b.class);
        builder.register(C0579a.class).provides(InterfaceC0559a.class);
        builder.register(com.onesignal.user.internal.backend.impl.d.class).provides(InterfaceC0546d.class);
        builder.register(p.class).provides(p.class).provides(d2.d.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.i.class).provides(d2.d.class);
        C1.c.k(builder, g.class, d2.d.class, l.class, d2.d.class);
        builder.register(k.class).provides(m3.a.class).provides(k.class);
        builder.register(com.onesignal.user.internal.customEvents.impl.b.class).provides(q3.b.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.a.class).provides(d2.d.class);
        C1.c.k(builder, com.onesignal.user.internal.customEvents.impl.a.class, InterfaceC0599a.class, C0706a.class, com.onesignal.core.internal.startup.b.class);
        C1.c.k(builder, com.onesignal.user.internal.migrations.d.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.migrations.c.class, com.onesignal.core.internal.startup.b.class);
        builder.register(C0692a.class).provides(C0692a.class);
    }
}
