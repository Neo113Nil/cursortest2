package com.onesignal.user;

import aa.a;
import ba.c;
import com.onesignal.user.internal.f;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.j;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.operations.impl.executors.n;
import com.onesignal.user.internal.properties.b;
import dd.e;
import kotlin.Metadata;
import na.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/user/UserModule;", "Laa/a;", "<init>", "()V", "Lba/c;", "builder", "", "register", "(Lba/c;)V", "com.onesignal.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserModule implements a {
    @Override // aa.a
    public void register(c builder) {
        builder.getClass();
        builder.register(com.onesignal.common.consistency.impl.a.class).provides(y9.c.class);
        builder.register(b.class).provides(b.class);
        v4.a.u(builder, ad.b.class, ra.a.class, yc.b.class, yc.b.class);
        v4.a.u(builder, ad.a.class, ra.a.class, com.onesignal.user.internal.backend.impl.a.class, uc.b.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.c.class).provides(com.onesignal.user.internal.operations.impl.executors.c.class).provides(d.class);
        builder.register(e.class).provides(e.class);
        builder.register(ad.c.class).provides(ra.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.c.class).provides(uc.c.class);
        builder.register(l.class).provides(l.class).provides(d.class);
        builder.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(dd.b.class);
        v4.a.u(builder, wc.a.class, vc.a.class, com.onesignal.user.internal.backend.impl.d.class, uc.d.class);
        builder.register(n.class).provides(n.class).provides(d.class);
        builder.register(g.class).provides(d.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.e.class).provides(d.class);
        v4.a.u(builder, j.class, d.class, f.class, tc.a.class);
        v4.a.u(builder, com.onesignal.user.internal.customEvents.impl.b.class, xc.b.class, com.onesignal.user.internal.operations.impl.executors.a.class, d.class);
        v4.a.u(builder, com.onesignal.user.internal.customEvents.impl.a.class, xc.a.class, cd.a.class, ra.b.class);
        v4.a.u(builder, com.onesignal.user.internal.migrations.d.class, ra.b.class, com.onesignal.user.internal.migrations.c.class, ra.b.class);
        builder.register(bd.a.class).provides(bd.a.class);
    }
}
