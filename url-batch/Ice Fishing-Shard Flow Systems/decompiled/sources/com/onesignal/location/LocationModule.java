package com.onesignal.location;

import A2.c;
import a3.C0176a;
import b3.InterfaceC0273a;
import c3.C0294a;
import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import com.onesignal.location.internal.controller.impl.h;
import e3.InterfaceC0373a;
import f3.InterfaceC0401a;
import g3.C0449a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import s2.InterfaceC0889a;
import t2.b;
import v2.f;

@Metadata
/* loaded from: classes.dex */
public final class LocationModule implements InterfaceC0889a {

    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC0373a invoke(b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c cVar = (c) it.getService(c.class);
            return (cVar.isAndroidDeviceType() && d3.b.INSTANCE.hasGMSLocationLibrary()) ? new com.onesignal.location.internal.controller.impl.b((f) it.getService(f.class), (g) it.getService(g.class)) : (cVar.isHuaweiDeviceType() && d3.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) it.getService(f.class)) : new h();
        }
    }

    @Override // s2.InterfaceC0889a
    public void register(t2.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        builder.register((Function1) a.INSTANCE).provides(InterfaceC0373a.class);
        builder.register(C0449a.class).provides(InterfaceC0401a.class);
        r4.f.h(builder, C0294a.class, InterfaceC0273a.class, C0176a.class, x2.b.class);
        builder.register(com.onesignal.location.internal.a.class).provides(Z2.a.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
