package com.onesignal.core;

import aa.a;
import ba.c;
import com.onesignal.inAppMessages.internal.l;
import ea.f;
import ha.d;
import kotlin.Metadata;
import qa.b;
import qb.n;
import wa.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/core/CoreModule;", "Laa/a;", "<init>", "()V", "Lba/c;", "builder", "", "register", "(Lba/c;)V", "com.onesignal.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreModule implements a {
    @Override // aa.a
    public void register(c builder) {
        builder.getClass();
        builder.register(com.onesignal.core.internal.preferences.impl.a.class).provides(b.class).provides(ra.b.class);
        builder.register(com.onesignal.core.internal.http.impl.b.class).provides(com.onesignal.core.internal.http.impl.c.class);
        builder.register(com.onesignal.core.internal.http.impl.a.class).provides(ka.c.class);
        v4.a.u(builder, com.onesignal.core.internal.application.impl.a.class, f.class, com.onesignal.core.internal.device.impl.a.class, ja.c.class);
        v4.a.u(builder, ta.a.class, sa.a.class, ia.b.class, d.class);
        v4.a.u(builder, com.onesignal.core.internal.device.impl.b.class, ja.d.class, com.onesignal.core.internal.config.b.class, com.onesignal.core.internal.config.b.class);
        v4.a.u(builder, com.onesignal.core.internal.backend.impl.a.class, fa.b.class, com.onesignal.core.internal.config.impl.a.class, ra.b.class);
        builder.register(com.onesignal.core.internal.operations.impl.a.class).provides(com.onesignal.core.internal.operations.impl.a.class);
        builder.register(com.onesignal.core.internal.operations.impl.b.class).provides(na.f.class).provides(ra.b.class);
        builder.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(pa.f.class);
        builder.register(ma.a.class).provides(la.a.class);
        builder.register(com.onesignal.core.internal.background.impl.a.class).provides(ga.a.class).provides(ra.b.class);
        builder.register(com.onesignal.core.internal.purchases.impl.a.class).provides(ra.b.class);
        builder.register(com.onesignal.notifications.internal.b.class).provides(n.class);
        v4.a.u(builder, l.class, j.class, com.onesignal.location.internal.b.class, ib.a.class);
    }
}
