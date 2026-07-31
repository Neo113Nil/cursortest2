package com.onesignal.core.internal.config.impl;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.backend.IFeatureFlagsBackendService;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsFetchOutcome;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsResult;
import com.onesignal.core.internal.backend.impl.FeatureFlagsJsonParser;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelChangeTags;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IStartableService;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: FeatureFlagsRefreshService.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001&B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/onesignal/core/internal/config/impl/FeatureFlagsRefreshService;", "Lcom/onesignal/core/internal/startup/IStartableService;", "Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "Lcom/onesignal/common/modeling/ISingletonModelStoreChangeHandler;", "Lcom/onesignal/core/internal/config/ConfigModel;", "applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "featureFlagsBackend", "Lcom/onesignal/core/internal/backend/IFeatureFlagsBackendService;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/core/internal/backend/IFeatureFlagsBackendService;)V", "pollJob", "Lkotlinx/coroutines/Job;", "pollingAppId", "", "refreshIntervalMs", "", "getRefreshIntervalMs$com_onesignal_core", "()J", "setRefreshIntervalMs$com_onesignal_core", "(J)V", "fetchAndApply", "", "appId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFocus", "firedOnSubscribe", "", "onModelReplaced", CommonUrlParts.MODEL, "tag", "onModelUpdated", "args", "Lcom/onesignal/common/modeling/ModelChangedArgs;", "onUnfocused", "restartForegroundPolling", ViewProps.START, "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureFlagsRefreshService implements IStartableService, IApplicationLifecycleHandler, ISingletonModelStoreChangeHandler<ConfigModel> {
    private static final long DEFAULT_REFRESH_INTERVAL_MS = 480000;
    private final IApplicationService applicationService;
    private final ConfigModelStore configModelStore;
    private final IFeatureFlagsBackendService featureFlagsBackend;
    private Job pollJob;
    private String pollingAppId;
    private long refreshIntervalMs;

    public FeatureFlagsRefreshService(IApplicationService applicationService, ConfigModelStore configModelStore, IFeatureFlagsBackendService featureFlagsBackend) {
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        Intrinsics.checkNotNullParameter(featureFlagsBackend, "featureFlagsBackend");
        this.applicationService = applicationService;
        this.configModelStore = configModelStore;
        this.featureFlagsBackend = featureFlagsBackend;
        this.refreshIntervalMs = DEFAULT_REFRESH_INTERVAL_MS;
    }

    /* renamed from: getRefreshIntervalMs$com_onesignal_core, reason: from getter */
    public final long getRefreshIntervalMs() {
        return this.refreshIntervalMs;
    }

    public final void setRefreshIntervalMs$com_onesignal_core(long j) {
        this.refreshIntervalMs = j;
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.applicationService.addApplicationLifecycleHandler(this);
        this.configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean firedOnSubscribe) {
        ThreadUtilsKt.runOnSerialIO(new Function0<Unit>() { // from class: com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService$onFocus$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FeatureFlagsRefreshService.this.restartForegroundPolling();
            }
        });
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        ThreadUtilsKt.runOnSerialIO(new Function0<Unit>() { // from class: com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService$onUnfocused$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Job job;
                FeatureFlagsRefreshService featureFlagsRefreshService = FeatureFlagsRefreshService.this;
                synchronized (featureFlagsRefreshService) {
                    job = featureFlagsRefreshService.pollJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    featureFlagsRefreshService.pollJob = null;
                    featureFlagsRefreshService.pollingAppId = null;
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(args.getProperty(), "appId") && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if ((Intrinsics.areEqual(tag, ModelChangeTags.HYDRATE) || Intrinsics.areEqual(tag, ModelChangeTags.NORMAL)) && model.getAppId().length() > 0 && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartForegroundPolling() {
        synchronized (this) {
            String appId = this.configModelStore.getModel().getAppId();
            if (appId.length() == 0) {
                Job job = this.pollJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.pollJob = null;
                this.pollingAppId = null;
                return;
            }
            if (Intrinsics.areEqual(this.pollingAppId, appId)) {
                return;
            }
            Job job2 = this.pollJob;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.pollingAppId = appId;
            this.pollJob = OneSignalDispatchers.INSTANCE.launchOnIO(new FeatureFlagsRefreshService$restartForegroundPolling$1$1(this, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndApply(String str, Continuation<? super Unit> continuation) {
        FeatureFlagsRefreshService$fetchAndApply$1 featureFlagsRefreshService$fetchAndApply$1;
        int i;
        FeatureFlagsRefreshService featureFlagsRefreshService;
        RemoteFeatureFlagsFetchOutcome remoteFeatureFlagsFetchOutcome;
        if (continuation instanceof FeatureFlagsRefreshService$fetchAndApply$1) {
            featureFlagsRefreshService$fetchAndApply$1 = (FeatureFlagsRefreshService$fetchAndApply$1) continuation;
            if ((featureFlagsRefreshService$fetchAndApply$1.label & Integer.MIN_VALUE) != 0) {
                featureFlagsRefreshService$fetchAndApply$1.label -= Integer.MIN_VALUE;
                Object obj = featureFlagsRefreshService$fetchAndApply$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = featureFlagsRefreshService$fetchAndApply$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IFeatureFlagsBackendService iFeatureFlagsBackendService = this.featureFlagsBackend;
                    featureFlagsRefreshService$fetchAndApply$1.L$0 = this;
                    featureFlagsRefreshService$fetchAndApply$1.label = 1;
                    obj = iFeatureFlagsBackendService.fetchRemoteFeatureFlags(str, featureFlagsRefreshService$fetchAndApply$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    featureFlagsRefreshService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    featureFlagsRefreshService = (FeatureFlagsRefreshService) featureFlagsRefreshService$fetchAndApply$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                remoteFeatureFlagsFetchOutcome = (RemoteFeatureFlagsFetchOutcome) obj;
                if (!Intrinsics.areEqual(remoteFeatureFlagsFetchOutcome, RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE)) {
                    return Unit.INSTANCE;
                }
                if (!(remoteFeatureFlagsFetchOutcome instanceof RemoteFeatureFlagsFetchOutcome.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                RemoteFeatureFlagsResult result = ((RemoteFeatureFlagsFetchOutcome.Success) remoteFeatureFlagsFetchOutcome).getResult();
                ConfigModel model = featureFlagsRefreshService.configModelStore.getModel();
                String encodeMetadata = FeatureFlagsJsonParser.INSTANCE.encodeMetadata(result.getMetadata());
                if (Intrinsics.areEqual(CollectionsKt.toSet(result.getEnabledKeys()), CollectionsKt.toSet(model.getSdkRemoteFeatureFlags())) && Intrinsics.areEqual(encodeMetadata, model.getSdkRemoteFeatureFlagMetadata())) {
                    return Unit.INSTANCE;
                }
                ConfigModel configModel = model;
                Model.setListProperty$default(configModel, "sdkRemoteFeatureFlags", result.getEnabledKeys(), ConfigModelChangeTags.REMOTE_FEATURE_FLAGS, false, 8, null);
                Model.setOptStringProperty$default(configModel, "sdkRemoteFeatureFlagMetadata", encodeMetadata, ConfigModelChangeTags.REMOTE_FEATURE_FLAGS, false, 8, null);
                return Unit.INSTANCE;
            }
        }
        featureFlagsRefreshService$fetchAndApply$1 = new FeatureFlagsRefreshService$fetchAndApply$1(this, continuation);
        Object obj2 = featureFlagsRefreshService$fetchAndApply$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = featureFlagsRefreshService$fetchAndApply$1.label;
        if (i != 0) {
        }
        remoteFeatureFlagsFetchOutcome = (RemoteFeatureFlagsFetchOutcome) obj2;
        if (!Intrinsics.areEqual(remoteFeatureFlagsFetchOutcome, RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE)) {
        }
    }
}
