package com.onesignal.location;

import ba.b;
import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import com.onesignal.location.internal.controller.impl.h;
import ea.f;
import ja.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/location/LocationModule;", "Laa/a;", "<init>", "()V", "Lba/c;", "builder", "", "register", "(Lba/c;)V", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocationModule implements aa.a {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final nb.a invoke(b bVar) {
            bVar.getClass();
            c cVar = (c) bVar.getService(c.class);
            return (cVar.isAndroidDeviceType() && mb.b.INSTANCE.hasGMSLocationLibrary()) ? new com.onesignal.location.internal.controller.impl.b((f) bVar.getService(f.class), (g) bVar.getService(g.class)) : (cVar.isHuaweiDeviceType() && mb.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) bVar.getService(f.class)) : new h();
        }
    }

    @Override // aa.a
    public void register(ba.c builder) {
        builder.getClass();
        builder.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(ra.b.class);
        builder.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        builder.register((Function1) a.INSTANCE).provides(nb.a.class);
        builder.register(pb.a.class).provides(ob.a.class);
        v4.a.u(builder, lb.a.class, kb.a.class, jb.a.class, ga.b.class);
        builder.register(com.onesignal.location.internal.a.class).provides(ib.a.class).provides(ra.b.class);
    }
}
