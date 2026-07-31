package com.onesignal.core.internal.startup;

import R1.d;
import java.util.Iterator;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c {
    private final d services;

    public static final class a extends g implements InterfaceC0743l {
        int label;

        public a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return c.this.new a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            for (b bVar : c.this.services.getAllServices(b.class)) {
                try {
                    bVar.start();
                } catch (Throwable th) {
                    com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
                }
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public c(d services) {
        i.e(services, "services");
        this.services = services;
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(com.onesignal.core.internal.startup.a.class).iterator();
        while (it.hasNext()) {
            ((com.onesignal.core.internal.startup.a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new a(null));
    }
}
