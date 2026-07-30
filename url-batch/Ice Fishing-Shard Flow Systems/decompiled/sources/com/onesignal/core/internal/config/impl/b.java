package com.onesignal.core.internal.config.impl;

import R5.k;
import X5.j;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.C0787u;
import n6.X;
import v2.f;
import w2.f;

/* loaded from: classes.dex */
public final class b implements com.onesignal.core.internal.startup.b, v2.e, g {
    public static final a Companion = new a(null);
    private static final long DEFAULT_REFRESH_INTERVAL_MS = 480000;
    private final f applicationService;
    private final com.onesignal.core.internal.config.c configModelStore;
    private final w2.b featureFlagsBackend;
    private X pollJob;
    private String pollingAppId;
    private long refreshIntervalMs;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.core.internal.config.impl.b$b, reason: collision with other inner class name */
    public static final class C0019b extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0019b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.fetchAndApply(null, this);
        }
    }

    public static final class c extends p implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
            b.this.restartForegroundPolling();
        }
    }

    public static final class d extends p implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    X x7 = bVar.pollJob;
                    if (x7 != null) {
                        x7.d(null);
                    }
                    bVar.pollJob = null;
                    bVar.pollingAppId = null;
                    Unit unit = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends j implements Function1 {
        int label;

        public e(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return b.this.new e(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        
            if (n6.AbstractC0792z.d(r4, r6) != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r1.fetchAndApply(r7, r6) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:12:0x0020). Please report as a decompilation issue!!! */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    try {
                        V6.b.P(obj);
                    } catch (CancellationException e7) {
                        throw e7;
                    } catch (Exception e8) {
                        com.onesignal.debug.internal.logging.b.warn("FeatureFlagsRefreshService: fetch failed", e8);
                    }
                    long refreshIntervalMs$com_onesignal_core = b.this.getRefreshIntervalMs$com_onesignal_core();
                    this.label = 2;
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            V6.b.P(obj);
            X x7 = (X) getContext().g(C0787u.f7085e);
            if (!(x7 != null ? x7.a() : true) || !b.this.applicationService.isInForeground()) {
                return Unit.f6114a;
            }
            String appId = ((com.onesignal.core.internal.config.b) b.this.configModelStore.getModel()).getAppId();
            if (appId.length() > 0) {
                b bVar = b.this;
                this.label = 1;
            }
            long refreshIntervalMs$com_onesignal_core2 = b.this.getRefreshIntervalMs$com_onesignal_core();
            this.label = 2;
        }
    }

    public b(f applicationService, com.onesignal.core.internal.config.c configModelStore, w2.b featureFlagsBackend) {
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        Intrinsics.checkNotNullParameter(featureFlagsBackend, "featureFlagsBackend");
        this.applicationService = applicationService;
        this.configModelStore = configModelStore;
        this.featureFlagsBackend = featureFlagsBackend;
        this.refreshIntervalMs = DEFAULT_REFRESH_INTERVAL_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndApply(String str, V5.b bVar) {
        C0019b c0019b;
        int i2;
        b bVar2;
        w2.f fVar;
        if (bVar instanceof C0019b) {
            c0019b = (C0019b) bVar;
            int i5 = c0019b.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0019b.label = i5 - Integer.MIN_VALUE;
                Object obj = c0019b.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0019b.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    w2.b bVar3 = this.featureFlagsBackend;
                    c0019b.L$0 = this;
                    c0019b.label = 1;
                    obj = bVar3.fetchRemoteFeatureFlags(str, c0019b);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bVar2 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (b) c0019b.L$0;
                    V6.b.P(obj);
                }
                fVar = (w2.f) obj;
                if (!Intrinsics.a(fVar, f.b.INSTANCE)) {
                    return Unit.f6114a;
                }
                if (!(fVar instanceof f.a)) {
                    throw new k();
                }
                w2.g result = ((f.a) fVar).getResult();
                com.onesignal.core.internal.config.b bVar4 = (com.onesignal.core.internal.config.b) bVar2.configModelStore.getModel();
                String encodeMetadata = com.onesignal.core.internal.backend.impl.b.INSTANCE.encodeMetadata(result.getMetadata());
                if (Intrinsics.a(CollectionsKt.C(result.getEnabledKeys()), CollectionsKt.C(bVar4.getSdkRemoteFeatureFlags())) && Intrinsics.a(encodeMetadata, bVar4.getSdkRemoteFeatureFlagMetadata())) {
                    return Unit.f6114a;
                }
                i.setListProperty$default(bVar4, "sdkRemoteFeatureFlags", result.getEnabledKeys(), "REMOTE_FEATURE_FLAGS", false, 8, null);
                i.setOptStringProperty$default(bVar4, "sdkRemoteFeatureFlagMetadata", encodeMetadata, "REMOTE_FEATURE_FLAGS", false, 8, null);
                return Unit.f6114a;
            }
        }
        c0019b = new C0019b(bVar);
        Object obj2 = c0019b.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0019b.label;
        if (i2 != 0) {
        }
        fVar = (w2.f) obj2;
        if (!Intrinsics.a(fVar, f.b.INSTANCE)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartForegroundPolling() {
        synchronized (this) {
            try {
                String appId = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId();
                if (appId.length() == 0) {
                    X x7 = this.pollJob;
                    if (x7 != null) {
                        x7.d(null);
                    }
                    this.pollJob = null;
                    this.pollingAppId = null;
                    return;
                }
                if (Intrinsics.a(this.pollingAppId, appId)) {
                    return;
                }
                X x8 = this.pollJob;
                if (x8 != null) {
                    x8.d(null);
                }
                this.pollingAppId = appId;
                this.pollJob = com.onesignal.common.threading.a.INSTANCE.launchOnIO(new e(null));
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long getRefreshIntervalMs$com_onesignal_core() {
        return this.refreshIntervalMs;
    }

    @Override // v2.e
    public void onFocus(boolean z7) {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId") && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    @Override // v2.e
    public void onUnfocused() {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new d());
    }

    public final void setRefreshIntervalMs$com_onesignal_core(long j) {
        this.refreshIntervalMs = j;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.applicationService.addApplicationLifecycleHandler(this);
        this.configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if ((Intrinsics.a(tag, "HYDRATE") || Intrinsics.a(tag, "NORMAL")) && model.getAppId().length() > 0 && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }
}
