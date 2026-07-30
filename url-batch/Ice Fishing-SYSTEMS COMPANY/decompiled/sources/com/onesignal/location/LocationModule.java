package com.onesignal.location;

import E7.l;
import b5.InterfaceC0528a;
import c5.InterfaceC0541a;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import d5.C4459a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import q4.InterfaceC4928a;
import r4.b;
import t4.f;
import v4.InterfaceC5127b;
import y4.c;

/* loaded from: classes2.dex */
public final class LocationModule implements InterfaceC4928a {

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // E7.l
        public final InterfaceC0528a invoke(b it) {
            h.e(it, "it");
            c cVar = (c) it.getService(c.class);
            return (cVar.isAndroidDeviceType() && a5.b.INSTANCE.hasGMSLocationLibrary()) ? new com.onesignal.location.internal.controller.impl.b((f) it.getService(f.class), (g) it.getService(g.class)) : (cVar.isHuaweiDeviceType() && a5.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) it.getService(f.class)) : new com.onesignal.location.internal.controller.impl.h();
        }
    }

    @Override // q4.InterfaceC4928a
    public void register(r4.c builder) {
        h.e(builder, "builder");
        builder.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        builder.register((l) a.INSTANCE).provides(InterfaceC0528a.class);
        builder.register(C4459a.class).provides(InterfaceC0541a.class);
        CL.v(builder, Z4.a.class, Y4.a.class, X4.a.class, InterfaceC5127b.class);
        builder.register(com.onesignal.location.internal.a.class).provides(W4.a.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
