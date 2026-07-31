package com.onesignal.core.internal.config.impl;

import H5.C0162w;
import H5.X;
import H5.r;
import T1.f;
import U1.f;
import com.onesignal.common.modeling.g;
import java.util.concurrent.CancellationException;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.AbstractC0506j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b implements com.onesignal.core.internal.startup.b, T1.e, g {
    public static final a Companion = new a(null);
    private static final long DEFAULT_REFRESH_INTERVAL_MS = 480000;
    private final f applicationService;
    private final com.onesignal.core.internal.config.c configModelStore;
    private final U1.b featureFlagsBackend;
    private X pollJob;
    private String pollingAppId;
    private long refreshIntervalMs;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.core.internal.config.impl.b$b, reason: collision with other inner class name */
    public static final class C0020b extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0020b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.fetchAndApply(null, this);
        }
    }

    public static final class c extends j implements InterfaceC0732a {
        public c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            b.this.restartForegroundPolling();
        }
    }

    public static final class d extends j implements InterfaceC0732a {
        public d() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    X x6 = bVar.pollJob;
                    if (x6 != null) {
                        x6.d(null);
                    }
                    bVar.pollJob = null;
                    bVar.pollingAppId = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends q5.g implements InterfaceC0743l {
        int label;

        public e(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return b.this.new e(interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        
            if (H5.AbstractC0165z.d(r4, r6) != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r1.fetchAndApply(r7, r6) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:12:0x0020). Please report as a decompilation issue!!! */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 == 1) {
                    try {
                        AbstractC0676f.w(obj);
                    } catch (CancellationException e4) {
                        throw e4;
                    } catch (Exception e7) {
                        com.onesignal.debug.internal.logging.b.warn("FeatureFlagsRefreshService: fetch failed", e7);
                    }
                    long refreshIntervalMs$com_onesignal_core = b.this.getRefreshIntervalMs$com_onesignal_core();
                    this.label = 2;
                } else if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC0676f.w(obj);
            X x6 = (X) getContext().m(C0162w.f1110g);
            if (!(x6 != null ? x6.a() : true) || !b.this.applicationService.isInForeground()) {
                return v.f5219a;
            }
            String appId = ((com.onesignal.core.internal.config.b) b.this.configModelStore.getModel()).getAppId();
            if (appId.length() > 0) {
                b bVar = b.this;
                this.label = 1;
            }
            long refreshIntervalMs$com_onesignal_core2 = b.this.getRefreshIntervalMs$com_onesignal_core();
            this.label = 2;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public b(f applicationService, com.onesignal.core.internal.config.c configModelStore, U1.b featureFlagsBackend) {
        i.e(applicationService, "applicationService");
        i.e(configModelStore, "configModelStore");
        i.e(featureFlagsBackend, "featureFlagsBackend");
        this.applicationService = applicationService;
        this.configModelStore = configModelStore;
        this.featureFlagsBackend = featureFlagsBackend;
        this.refreshIntervalMs = DEFAULT_REFRESH_INTERVAL_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndApply(String str, InterfaceC0564d interfaceC0564d) {
        C0020b c0020b;
        int i7;
        b bVar;
        boolean a7;
        if (interfaceC0564d instanceof C0020b) {
            c0020b = (C0020b) interfaceC0564d;
            int i8 = c0020b.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0020b.label = i8 - Integer.MIN_VALUE;
                Object obj = c0020b.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0020b.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    U1.b bVar2 = this.featureFlagsBackend;
                    c0020b.L$0 = this;
                    c0020b.label = 1;
                    obj = bVar2.fetchRemoteFeatureFlags(str, c0020b);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    bVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) c0020b.L$0;
                    AbstractC0676f.w(obj);
                }
                U1.f fVar = (U1.f) obj;
                a7 = i.a(fVar, f.b.INSTANCE);
                v vVar = v.f5219a;
                if (!a7) {
                    if (!(fVar instanceof f.a)) {
                        throw new r();
                    }
                    U1.g result = ((f.a) fVar).getResult();
                    com.onesignal.core.internal.config.b bVar3 = (com.onesignal.core.internal.config.b) bVar.configModelStore.getModel();
                    String encodeMetadata = com.onesignal.core.internal.backend.impl.b.INSTANCE.encodeMetadata(result.getMetadata());
                    if (!AbstractC0506j.T(result.getEnabledKeys()).equals(AbstractC0506j.T(bVar3.getSdkRemoteFeatureFlags())) || !i.a(encodeMetadata, bVar3.getSdkRemoteFeatureFlagMetadata())) {
                        com.onesignal.common.modeling.i.setListProperty$default(bVar3, "sdkRemoteFeatureFlags", result.getEnabledKeys(), "REMOTE_FEATURE_FLAGS", false, 8, null);
                        com.onesignal.common.modeling.i.setOptStringProperty$default(bVar3, "sdkRemoteFeatureFlagMetadata", encodeMetadata, "REMOTE_FEATURE_FLAGS", false, 8, null);
                        return vVar;
                    }
                }
                return vVar;
            }
        }
        c0020b = new C0020b(interfaceC0564d);
        Object obj2 = c0020b.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0020b.label;
        if (i7 != 0) {
        }
        U1.f fVar2 = (U1.f) obj2;
        a7 = i.a(fVar2, f.b.INSTANCE);
        v vVar2 = v.f5219a;
        if (!a7) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartForegroundPolling() {
        synchronized (this) {
            try {
                String appId = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId();
                if (appId.length() == 0) {
                    X x6 = this.pollJob;
                    if (x6 != null) {
                        x6.d(null);
                    }
                    this.pollJob = null;
                    this.pollingAppId = null;
                    return;
                }
                if (i.a(this.pollingAppId, appId)) {
                    return;
                }
                X x7 = this.pollJob;
                if (x7 != null) {
                    x7.d(null);
                }
                this.pollingAppId = appId;
                this.pollJob = com.onesignal.common.threading.a.INSTANCE.launchOnIO(new e(null));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long getRefreshIntervalMs$com_onesignal_core() {
        return this.refreshIntervalMs;
    }

    @Override // T1.e
    public void onFocus(boolean z5) {
        com.onesignal.common.threading.b.runOnSerialIO(new c());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (i.a(args.getProperty(), "appId") && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    @Override // T1.e
    public void onUnfocused() {
        com.onesignal.common.threading.b.runOnSerialIO(new d());
    }

    public final void setRefreshIntervalMs$com_onesignal_core(long j4) {
        this.refreshIntervalMs = j4;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.applicationService.addApplicationLifecycleHandler(this);
        this.configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        if ((tag.equals("HYDRATE") || tag.equals("NORMAL")) && model.getAppId().length() > 0 && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }
}
