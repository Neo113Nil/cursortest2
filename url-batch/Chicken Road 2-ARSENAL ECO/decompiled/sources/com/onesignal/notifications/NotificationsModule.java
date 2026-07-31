package com.onesignal.notifications;

import F2.n;
import T1.f;
import a3.InterfaceC0226b;
import a3.InterfaceC0227c;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.d;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.registration.impl.h;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import g2.InterfaceC0391a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class NotificationsModule implements Q1.a {

    public static final class a extends j implements InterfaceC0743l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final G2.a invoke(R1.b it) {
            i.e(it, "it");
            return H2.a.Companion.canTrack() ? new H2.a((f) it.getService(f.class), (c) it.getService(c.class), (InterfaceC0391a) it.getService(InterfaceC0391a.class)) : new H2.b();
        }
    }

    public static final class b extends j implements InterfaceC0743l {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(R1.b it) {
            i.e(it, "it");
            Y1.c cVar = (Y1.c) it.getService(Y1.c.class);
            return cVar.isFireOSDeviceType() ? new d((f) it.getService(f.class)) : cVar.isAndroidDeviceType() ? cVar.getHasFCMLibrary() ? new com.onesignal.notifications.internal.registration.impl.f((c) it.getService(c.class), (f) it.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) it.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new h() : new g(cVar, (f) it.getService(f.class));
        }
    }

    @Override // Q1.a
    public void register(R1.c builder) {
        i.e(builder, "builder");
        builder.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(I2.a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(InterfaceC0227c.class);
        builder.register(com.onesignal.notifications.internal.data.impl.a.class).provides(R2.a.class);
        C1.c.k(builder, com.onesignal.notifications.internal.badges.impl.a.class, J2.a.class, com.onesignal.notifications.internal.data.impl.b.class, R2.d.class);
        C1.c.k(builder, NotificationGenerationWorkManager.class, T2.b.class, N2.a.class, M2.b.class);
        C1.c.k(builder, P2.b.class, O2.a.class, com.onesignal.notifications.internal.limiting.impl.a.class, V2.b.class);
        C1.c.k(builder, com.onesignal.notifications.internal.display.impl.c.class, S2.b.class, com.onesignal.notifications.internal.display.impl.d.class, S2.c.class);
        C1.c.k(builder, com.onesignal.notifications.internal.display.impl.b.class, S2.a.class, com.onesignal.notifications.internal.generation.impl.a.class, T2.a.class);
        C1.c.k(builder, com.onesignal.notifications.internal.restoration.impl.a.class, InterfaceC0226b.class, com.onesignal.notifications.internal.summary.impl.a.class, b3.a.class);
        C1.c.k(builder, com.onesignal.notifications.internal.open.impl.b.class, W2.a.class, com.onesignal.notifications.internal.open.impl.c.class, W2.b.class);
        builder.register(com.onesignal.notifications.internal.permissions.impl.b.class).provides(X2.b.class);
        builder.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(U2.b.class).provides(com.onesignal.notifications.internal.a.class);
        builder.register((InterfaceC0743l) a.INSTANCE).provides(G2.a.class);
        builder.register((InterfaceC0743l) b.INSTANCE).provides(Z2.b.class).provides(com.onesignal.notifications.internal.registration.impl.c.class);
        builder.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        builder.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        C1.c.k(builder, ReceiveReceiptWorkManager.class, Y2.b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, Y2.a.class);
        C1.c.k(builder, DeviceRegistrationListener.class, com.onesignal.core.internal.startup.b.class, com.onesignal.notifications.internal.h.class, n.class);
    }
}
