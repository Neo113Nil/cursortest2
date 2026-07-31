package com.onesignal.debug.internal.crash;

import f3.C0373f;
import k5.InterfaceC0475e;
import k5.v;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class n implements com.onesignal.core.internal.startup.b {
    private final T1.f applicationService;
    private final Z1.e featureManager;
    private final InterfaceC0475e uploader$delegate;

    public static final class a extends q5.g implements InterfaceC0743l {
        int label;

        public a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return n.this.new a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    C0373f uploader = n.this.getUploader();
                    this.label = 1;
                    if (uploader.c(this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends kotlin.jvm.internal.j implements InterfaceC0732a {

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0732a {
            final /* synthetic */ n this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar) {
                super(0);
                this.this$0 = nVar;
            }

            @Override // x5.InterfaceC0732a
            public final Z1.e invoke() {
                return this.this$0.featureManager;
            }
        }

        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final C0373f invoke() {
            com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(n.this.applicationService.getAppContext(), new a(n.this));
            com.onesignal.debug.internal.logging.otel.android.a aVar = new com.onesignal.debug.internal.logging.otel.android.a();
            kotlin.jvm.internal.i.e(platformProvider, "platformProvider");
            return new C0373f(new c3.m(platformProvider, new a6.d(platformProvider), new V5.g(4, platformProvider)), platformProvider, aVar);
        }
    }

    public n(T1.f applicationService, Z1.e featureManager) {
        kotlin.jvm.internal.i.e(applicationService, "applicationService");
        kotlin.jvm.internal.i.e(featureManager, "featureManager");
        this.applicationService = applicationService;
        this.featureManager = featureManager;
        this.uploader$delegate = AbstractC0521b.x(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0373f getUploader() {
        return (C0373f) this.uploader$delegate.getValue();
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        if (r.INSTANCE.isSupported()) {
            com.onesignal.common.threading.a.INSTANCE.launchOnIO(new a(null));
        }
    }
}
