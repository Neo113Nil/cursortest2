package com.onesignal.inAppMessages;

import aa.a;
import ba.c;
import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import hb.d;
import kotlin.Metadata;
import wa.j;
import xa.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/inAppMessages/InAppMessagesModule;", "Laa/a;", "<init>", "()V", "Lba/c;", "builder", "", "register", "(Lba/c;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppMessagesModule implements a {
    @Override // aa.a
    public void register(c builder) {
        builder.getClass();
        builder.register(gb.a.class).provides(gb.a.class);
        builder.register(ab.a.class).provides(ab.a.class);
        v4.a.u(builder, db.a.class, cb.a.class, com.onesignal.inAppMessages.internal.repositories.impl.a.class, fb.a.class);
        v4.a.u(builder, com.onesignal.inAppMessages.internal.backend.impl.a.class, b.class, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, bb.b.class);
        v4.a.u(builder, d.class, d.class, e.class, hb.a.class);
        v4.a.u(builder, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.display.impl.c.class, za.a.class);
        v4.a.u(builder, com.onesignal.inAppMessages.internal.preview.a.class, ra.a.class, com.onesignal.inAppMessages.internal.prompt.impl.c.class, eb.a.class);
        builder.register(k.class).provides(j.class).provides(ra.b.class);
    }
}
