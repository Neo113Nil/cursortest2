package com.onesignal.notifications;

import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.d;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.registration.impl.h;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import ea.f;
import ja.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import qb.n;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/NotificationsModule;", "Laa/a;", "<init>", "()V", "Lba/c;", "builder", "", "register", "(Lba/c;)V", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationsModule implements aa.a {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final rb.a invoke(ba.b bVar) {
            bVar.getClass();
            return sb.a.Companion.canTrack() ? new sb.a((f) bVar.getService(f.class), (com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (sa.a) bVar.getService(sa.a.class)) : new sb.b();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ba.b bVar) {
            bVar.getClass();
            c cVar = (c) bVar.getService(c.class);
            return cVar.isFireOSDeviceType() ? new d((f) bVar.getService(f.class)) : cVar.isAndroidDeviceType() ? cVar.getHasFCMLibrary() ? new com.onesignal.notifications.internal.registration.impl.f((com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (f) bVar.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) bVar.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new h() : new g(cVar, (f) bVar.getService(f.class));
        }
    }

    @Override // aa.a
    public void register(ba.c builder) {
        builder.getClass();
        builder.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(tb.a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(lc.c.class);
        v4.a.u(builder, com.onesignal.notifications.internal.data.impl.a.class, cc.a.class, com.onesignal.notifications.internal.badges.impl.a.class, ub.a.class);
        v4.a.u(builder, com.onesignal.notifications.internal.data.impl.b.class, cc.d.class, NotificationGenerationWorkManager.class, ec.b.class);
        v4.a.u(builder, yb.a.class, xb.b.class, ac.b.class, zb.a.class);
        v4.a.u(builder, com.onesignal.notifications.internal.limiting.impl.a.class, gc.b.class, com.onesignal.notifications.internal.display.impl.c.class, dc.b.class);
        v4.a.u(builder, com.onesignal.notifications.internal.display.impl.d.class, dc.c.class, com.onesignal.notifications.internal.display.impl.b.class, dc.a.class);
        v4.a.u(builder, com.onesignal.notifications.internal.generation.impl.a.class, ec.a.class, com.onesignal.notifications.internal.restoration.impl.a.class, lc.b.class);
        v4.a.u(builder, com.onesignal.notifications.internal.summary.impl.a.class, mc.a.class, com.onesignal.notifications.internal.open.impl.b.class, hc.a.class);
        v4.a.u(builder, com.onesignal.notifications.internal.open.impl.c.class, hc.b.class, com.onesignal.notifications.internal.permissions.impl.b.class, ic.b.class);
        builder.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(fc.b.class).provides(com.onesignal.notifications.internal.a.class);
        builder.register((Function1) a.INSTANCE).provides(rb.a.class);
        builder.register((Function1) b.INSTANCE).provides(kc.b.class).provides(com.onesignal.notifications.internal.registration.impl.c.class);
        builder.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        builder.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        v4.a.u(builder, ReceiveReceiptWorkManager.class, jc.b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, jc.a.class);
        v4.a.u(builder, DeviceRegistrationListener.class, ra.b.class, com.onesignal.notifications.internal.h.class, n.class);
    }
}
