package com.onesignal.core.internal.startup;

import A.k;
import B2.e;
import X5.j;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t2.d;

/* loaded from: classes.dex */
public final class c {
    private final d services;

    public static final class a extends j implements Function1 {
        int label;

        public a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return c.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            for (b bVar : c.this.services.getAllServices(b.class)) {
                try {
                    bVar.start();
                } catch (Throwable th) {
                    com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
                }
            }
            return Unit.f6114a;
        }
    }

    public c(d services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.services = services;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStart$lambda$2(c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (b bVar : this$0.services.getAllServices(b.class)) {
            try {
                bVar.start();
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Startable service failed: ".concat(bVar.getClass().getSimpleName()), th);
            }
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(com.onesignal.core.internal.startup.a.class).iterator();
        while (it.hasNext()) {
            ((com.onesignal.core.internal.startup.a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        boolean z7;
        try {
            z7 = ((e) this.services.getService(e.class)).isEnabled(B2.b.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to resolve BACKGROUND_THREADING in StartupService. Falling back to legacy thread.", th);
            z7 = false;
        }
        if (z7) {
            com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new a(null));
        } else {
            new Thread(new k(11, this)).start();
        }
    }
}
