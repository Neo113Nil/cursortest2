package com.onesignal.debug.internal.crash;

import A.k;
import E3.m;
import R5.InterfaceC0168h;
import R5.i;
import X5.j;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class b implements com.onesignal.core.internal.startup.b {
    private final v2.f applicationService;
    private final B2.e featureManager;
    private final InterfaceC0168h uploader$delegate;

    public static final class a extends j implements Function1 {
        int label;

        public a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return b.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    H3.f uploader = b.this.getUploader();
                    this.label = 1;
                    if (uploader.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
            }
            return Unit.f6114a;
        }
    }

    /* renamed from: com.onesignal.debug.internal.crash.b$b, reason: collision with other inner class name */
    public static final class C0026b extends j implements Function2 {
        int label;

        public C0026b(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new C0026b(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                H3.f uploader = b.this.getUploader();
                this.label = 1;
                if (uploader.c(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0026b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class c extends p implements Function0 {

        public static final class a extends p implements Function0 {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final B2.e invoke() {
                return this.this$0.featureManager;
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final H3.f invoke() {
            com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(b.this.applicationService.getAppContext(), new a(b.this));
            com.onesignal.debug.internal.logging.otel.android.a logger = new com.onesignal.debug.internal.logging.otel.android.a();
            Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new H3.f(new m(platformProvider, new B.f(platformProvider), new l2.c((E3.f) platformProvider)), platformProvider, logger);
        }
    }

    public b(v2.f applicationService, B2.e featureManager) {
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        this.applicationService = applicationService;
        this.featureManager = featureManager;
        this.uploader$delegate = i.b(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H3.f getUploader() {
        return (H3.f) this.uploader$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            AbstractC0792z.o(g.f6146d, this$0.new C0026b(null));
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        if (f.INSTANCE.isSupported()) {
            if (this.featureManager.isEnabled(B2.b.SDK_BACKGROUND_THREADING)) {
                com.onesignal.common.threading.a.INSTANCE.launchOnIO(new a(null));
            } else {
                new Thread(new k(12, this)).start();
            }
        }
    }
}
