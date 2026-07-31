package com.onesignal.inAppMessages;

import Q1.a;
import R1.c;
import com.onesignal.core.internal.startup.b;
import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import kotlin.jvm.internal.i;
import l2.j;
import m2.InterfaceC0523b;
import o2.InterfaceC0558a;
import p2.C0578a;
import q2.InterfaceC0598b;
import r2.InterfaceC0616a;
import s2.C0631a;
import t2.InterfaceC0661a;
import u2.InterfaceC0691a;
import v2.C0705a;
import w2.InterfaceC0717a;
import w2.d;

/* loaded from: classes.dex */
public final class InAppMessagesModule implements a {
    @Override // Q1.a
    public void register(c builder) {
        i.e(builder, "builder");
        builder.register(C0705a.class).provides(C0705a.class);
        builder.register(C0578a.class).provides(C0578a.class);
        builder.register(C0631a.class).provides(InterfaceC0616a.class);
        C1.c.k(builder, com.onesignal.inAppMessages.internal.repositories.impl.a.class, InterfaceC0691a.class, com.onesignal.inAppMessages.internal.backend.impl.a.class, InterfaceC0523b.class);
        C1.c.k(builder, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, InterfaceC0598b.class, d.class, d.class);
        C1.c.k(builder, e.class, InterfaceC0717a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class);
        C1.c.k(builder, com.onesignal.inAppMessages.internal.display.impl.c.class, InterfaceC0558a.class, com.onesignal.inAppMessages.internal.preview.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(InterfaceC0661a.class);
        builder.register(k.class).provides(j.class).provides(b.class);
    }
}
