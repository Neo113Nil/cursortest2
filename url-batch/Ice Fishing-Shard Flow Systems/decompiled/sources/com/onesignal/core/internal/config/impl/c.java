package com.onesignal.core.internal.config.impl;

import B2.e;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements com.onesignal.core.internal.startup.b, g {
    private final com.onesignal.core.internal.config.c configModelStore;
    private final e featureManager;
    private final Object handlerLock;
    private Function1<? super Boolean, Unit> onJwtConfigHydrated;

    public c(e featureManager, com.onesignal.core.internal.config.c configModelStore) {
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        this.featureManager = featureManager;
        this.configModelStore = configModelStore;
        this.handlerLock = new Object();
    }

    public final boolean getIvBehaviorActive() {
        return ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED;
    }

    public final boolean getNewCodePathsRun() {
        return this.featureManager.isEnabled(B2.b.SDK_IDENTITY_VERIFICATION) || getIvBehaviorActive();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public final void setOnJwtConfigHydratedHandler(Function1<? super Boolean, Unit> function1) {
        synchronized (this.handlerLock) {
            this.onJwtConfigHydrated = function1;
            Unit unit = Unit.f6114a;
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "HYDRATE")) {
            synchronized (this.handlerLock) {
                function1 = this.onJwtConfigHydrated;
            }
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(model.getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED));
            }
        }
    }
}
