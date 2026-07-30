package com.onesignal.inAppMessages;

import N2.j;
import O2.b;
import X2.a;
import Y2.d;
import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r4.f;
import s2.InterfaceC0889a;
import t2.c;

@Metadata
/* loaded from: classes.dex */
public final class InAppMessagesModule implements InterfaceC0889a {
    @Override // s2.InterfaceC0889a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(a.class).provides(a.class);
        builder.register(R2.a.class).provides(R2.a.class);
        builder.register(U2.a.class).provides(T2.a.class);
        f.h(builder, com.onesignal.inAppMessages.internal.repositories.impl.a.class, W2.a.class, com.onesignal.inAppMessages.internal.backend.impl.a.class, b.class);
        f.h(builder, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, S2.b.class, d.class, d.class);
        f.h(builder, e.class, Y2.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class);
        f.h(builder, com.onesignal.inAppMessages.internal.display.impl.c.class, Q2.a.class, com.onesignal.inAppMessages.internal.preview.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(V2.a.class);
        builder.register(k.class).provides(j.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
