package com.onesignal.notifications;

import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.d;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.registration.impl.h;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import h3.n;
import i3.InterfaceC0544a;
import j3.C0570a;
import j3.C0571b;
import k3.InterfaceC0599a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import l3.InterfaceC0661a;
import p3.C0827a;
import q3.InterfaceC0834a;
import s2.InterfaceC0889a;
import t3.InterfaceC0926a;
import u3.InterfaceC0945a;
import u3.InterfaceC0946b;
import u3.InterfaceC0947c;
import v2.f;
import v3.InterfaceC0972a;
import v3.InterfaceC0973b;
import y3.InterfaceC1028a;
import y3.InterfaceC1029b;
import z3.InterfaceC1058b;

@Metadata
/* loaded from: classes.dex */
public final class NotificationsModule implements InterfaceC0889a {

    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC0544a invoke(t2.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C0570a.Companion.canTrack() ? new C0570a((f) it.getService(f.class), (c) it.getService(c.class), (I2.a) it.getService(I2.a.class)) : new C0571b();
        }
    }

    public static final class b extends p implements Function1 {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(t2.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            A2.c cVar = (A2.c) it.getService(A2.c.class);
            return cVar.isFireOSDeviceType() ? new d((f) it.getService(f.class)) : cVar.isAndroidDeviceType() ? cVar.getHasFCMLibrary() ? new com.onesignal.notifications.internal.registration.impl.f((c) it.getService(c.class), (f) it.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) it.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new h() : new g(cVar, (f) it.getService(f.class));
        }
    }

    @Override // s2.InterfaceC0889a
    public void register(t2.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(InterfaceC0599a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(C3.c.class);
        builder.register(com.onesignal.notifications.internal.data.impl.a.class).provides(InterfaceC0926a.class);
        r4.f.h(builder, com.onesignal.notifications.internal.badges.impl.a.class, InterfaceC0661a.class, com.onesignal.notifications.internal.data.impl.b.class, t3.d.class);
        r4.f.h(builder, NotificationGenerationWorkManager.class, InterfaceC0973b.class, C0827a.class, o3.b.class);
        r4.f.h(builder, r3.b.class, InterfaceC0834a.class, com.onesignal.notifications.internal.limiting.impl.a.class, x3.b.class);
        r4.f.h(builder, com.onesignal.notifications.internal.display.impl.c.class, InterfaceC0946b.class, com.onesignal.notifications.internal.display.impl.d.class, InterfaceC0947c.class);
        r4.f.h(builder, com.onesignal.notifications.internal.display.impl.b.class, InterfaceC0945a.class, com.onesignal.notifications.internal.generation.impl.a.class, InterfaceC0972a.class);
        r4.f.h(builder, com.onesignal.notifications.internal.restoration.impl.a.class, C3.b.class, com.onesignal.notifications.internal.summary.impl.a.class, D3.a.class);
        r4.f.h(builder, com.onesignal.notifications.internal.open.impl.b.class, InterfaceC1028a.class, com.onesignal.notifications.internal.open.impl.c.class, InterfaceC1029b.class);
        builder.register(com.onesignal.notifications.internal.permissions.impl.b.class).provides(InterfaceC1058b.class);
        builder.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(w3.b.class).provides(com.onesignal.notifications.internal.a.class);
        builder.register((Function1) a.INSTANCE).provides(InterfaceC0544a.class);
        builder.register((Function1) b.INSTANCE).provides(B3.b.class).provides(com.onesignal.notifications.internal.registration.impl.c.class);
        builder.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        builder.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        r4.f.h(builder, ReceiveReceiptWorkManager.class, A3.b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, A3.a.class);
        r4.f.h(builder, DeviceRegistrationListener.class, com.onesignal.core.internal.startup.b.class, com.onesignal.notifications.internal.h.class, n.class);
    }
}
