package com.onesignal.notifications;

import E7.l;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.d;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import e5.n;
import f5.InterfaceC4515a;
import g5.C4529a;
import g5.C4530b;
import h5.InterfaceC4569a;
import i5.InterfaceC4577a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import m5.C4782a;
import n5.InterfaceC4813a;
import o5.C4838a;
import q4.InterfaceC4928a;
import q5.InterfaceC4929a;
import r5.InterfaceC4965a;
import r5.InterfaceC4966b;
import r5.InterfaceC4967c;
import s5.InterfaceC4999a;
import s5.InterfaceC5000b;
import t4.f;
import v5.InterfaceC5128a;
import v5.InterfaceC5129b;
import w5.InterfaceC5173b;
import x5.InterfaceC5213a;
import x5.InterfaceC5214b;
import y5.InterfaceC5254b;
import z5.InterfaceC5280b;
import z5.InterfaceC5281c;

/* loaded from: classes2.dex */
public final class NotificationsModule implements InterfaceC4928a {

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // E7.l
        public final InterfaceC4515a invoke(r4.b it) {
            h.e(it, "it");
            return C4529a.Companion.canTrack() ? new C4529a((f) it.getService(f.class), (c) it.getService(c.class), (G4.a) it.getService(G4.a.class)) : new C4530b();
        }
    }

    public static final class b extends i implements l {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // E7.l
        public final Object invoke(r4.b it) {
            h.e(it, "it");
            y4.c cVar = (y4.c) it.getService(y4.c.class);
            return cVar.isFireOSDeviceType() ? new d((f) it.getService(f.class)) : cVar.isAndroidDeviceType() ? cVar.getHasFCMLibrary() ? new com.onesignal.notifications.internal.registration.impl.f((c) it.getService(c.class), (f) it.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) it.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new com.onesignal.notifications.internal.registration.impl.h() : new g(cVar, (f) it.getService(f.class));
        }
    }

    @Override // q4.InterfaceC4928a
    public void register(r4.c builder) {
        h.e(builder, "builder");
        builder.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(InterfaceC4569a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(InterfaceC5281c.class);
        builder.register(com.onesignal.notifications.internal.data.impl.a.class).provides(InterfaceC4929a.class);
        CL.v(builder, com.onesignal.notifications.internal.badges.impl.a.class, InterfaceC4577a.class, com.onesignal.notifications.internal.data.impl.b.class, q5.d.class);
        CL.v(builder, NotificationGenerationWorkManager.class, InterfaceC5000b.class, C4782a.class, l5.b.class);
        CL.v(builder, C4838a.class, InterfaceC4813a.class, com.onesignal.notifications.internal.limiting.impl.a.class, u5.b.class);
        CL.v(builder, com.onesignal.notifications.internal.display.impl.c.class, InterfaceC4966b.class, com.onesignal.notifications.internal.display.impl.d.class, InterfaceC4967c.class);
        CL.v(builder, com.onesignal.notifications.internal.display.impl.b.class, InterfaceC4965a.class, com.onesignal.notifications.internal.generation.impl.a.class, InterfaceC4999a.class);
        CL.v(builder, com.onesignal.notifications.internal.restoration.impl.a.class, InterfaceC5280b.class, com.onesignal.notifications.internal.summary.impl.a.class, A5.a.class);
        CL.v(builder, com.onesignal.notifications.internal.open.impl.b.class, InterfaceC5128a.class, com.onesignal.notifications.internal.open.impl.c.class, InterfaceC5129b.class);
        builder.register(com.onesignal.notifications.internal.permissions.impl.b.class).provides(InterfaceC5173b.class);
        builder.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(t5.b.class).provides(com.onesignal.notifications.internal.a.class);
        builder.register((l) a.INSTANCE).provides(InterfaceC4515a.class);
        builder.register((l) b.INSTANCE).provides(InterfaceC5254b.class).provides(com.onesignal.notifications.internal.registration.impl.c.class);
        builder.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        builder.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        CL.v(builder, ReceiveReceiptWorkManager.class, InterfaceC5214b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, InterfaceC5213a.class);
        CL.v(builder, DeviceRegistrationListener.class, com.onesignal.core.internal.startup.b.class, com.onesignal.notifications.internal.h.class, n.class);
    }
}
