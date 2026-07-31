package com.onesignal.location;

import R1.b;
import T1.f;
import Y1.c;
import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import com.onesignal.location.internal.controller.impl.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import x2.InterfaceC0728a;
import x5.InterfaceC0743l;
import y2.C0761a;
import z2.InterfaceC0772a;

/* loaded from: classes.dex */
public final class LocationModule implements Q1.a {

    public static final class a extends j implements InterfaceC0743l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final C2.a invoke(b it) {
            i.e(it, "it");
            c cVar = (c) it.getService(c.class);
            return (cVar.isAndroidDeviceType() && B2.b.INSTANCE.hasGMSLocationLibrary()) ? new com.onesignal.location.internal.controller.impl.b((f) it.getService(f.class), (g) it.getService(g.class)) : (cVar.isHuaweiDeviceType() && B2.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) it.getService(f.class)) : new h();
        }
    }

    @Override // Q1.a
    public void register(R1.c builder) {
        i.e(builder, "builder");
        builder.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        builder.register((InterfaceC0743l) a.INSTANCE).provides(C2.a.class);
        builder.register(E2.a.class).provides(D2.a.class);
        C1.c.k(builder, A2.a.class, InterfaceC0772a.class, C0761a.class, V1.b.class);
        builder.register(com.onesignal.location.internal.a.class).provides(InterfaceC0728a.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
