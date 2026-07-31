package com.onesignal.core.internal.config.impl;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.features.FeatureFlag;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.user.internal.jwt.JwtRequirement;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityVerificationService.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J+\u0010\u001e\u001a\u00020\u00162#\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012J\b\u0010 \u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR+\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "Lcom/onesignal/core/internal/startup/IStartableService;", "Lcom/onesignal/common/modeling/ISingletonModelStoreChangeHandler;", "Lcom/onesignal/core/internal/config/ConfigModel;", "featureManager", "Lcom/onesignal/core/internal/features/IFeatureManager;", "configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "(Lcom/onesignal/core/internal/features/IFeatureManager;Lcom/onesignal/core/internal/config/ConfigModelStore;)V", "handlerLock", "", "ivBehaviorActive", "", "getIvBehaviorActive", "()Z", "newCodePathsRun", "getNewCodePathsRun", "onJwtConfigHydrated", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "ivRequired", "", "onModelReplaced", CommonUrlParts.MODEL, "tag", "", "onModelUpdated", "args", "Lcom/onesignal/common/modeling/ModelChangedArgs;", "setOnJwtConfigHydratedHandler", "handler", ViewProps.START, BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentityVerificationService implements IStartableService, ISingletonModelStoreChangeHandler<ConfigModel> {
    private final ConfigModelStore configModelStore;
    private final IFeatureManager featureManager;
    private final Object handlerLock;
    private Function1<? super Boolean, Unit> onJwtConfigHydrated;

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public IdentityVerificationService(IFeatureManager featureManager, ConfigModelStore configModelStore) {
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        this.featureManager = featureManager;
        this.configModelStore = configModelStore;
        this.handlerLock = new Object();
    }

    public final boolean getIvBehaviorActive() {
        return this.configModelStore.getModel().getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED;
    }

    public final boolean getNewCodePathsRun() {
        return this.featureManager.isEnabled(FeatureFlag.SDK_IDENTITY_VERIFICATION) || getIvBehaviorActive();
    }

    public final void setOnJwtConfigHydratedHandler(Function1<? super Boolean, Unit> handler) {
        synchronized (this.handlerLock) {
            this.onJwtConfigHydrated = handler;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(tag, ModelChangeTags.HYDRATE)) {
            synchronized (this.handlerLock) {
                function1 = this.onJwtConfigHydrated;
            }
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(model.getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED));
            }
        }
    }
}
