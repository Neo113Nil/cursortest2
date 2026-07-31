package com.onesignal.core.internal.config.impl;

import Z1.e;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import kotlin.jvm.internal.i;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c implements com.onesignal.core.internal.startup.b, g {
    private final com.onesignal.core.internal.config.c configModelStore;
    private final e featureManager;
    private final Object handlerLock;
    private InterfaceC0743l onJwtConfigHydrated;

    public c(e featureManager, com.onesignal.core.internal.config.c configModelStore) {
        i.e(featureManager, "featureManager");
        i.e(configModelStore, "configModelStore");
        this.featureManager = featureManager;
        this.configModelStore = configModelStore;
        this.handlerLock = new Object();
    }

    public final boolean getIvBehaviorActive() {
        return ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED;
    }

    public final boolean getNewCodePathsRun() {
        return this.featureManager.isEnabled(Z1.b.SDK_IDENTITY_VERIFICATION) || getIvBehaviorActive();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
    }

    public final void setOnJwtConfigHydratedHandler(InterfaceC0743l interfaceC0743l) {
        synchronized (this.handlerLock) {
            this.onJwtConfigHydrated = interfaceC0743l;
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        InterfaceC0743l interfaceC0743l;
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals("HYDRATE")) {
            synchronized (this.handlerLock) {
                interfaceC0743l = this.onJwtConfigHydrated;
            }
            if (interfaceC0743l != null) {
                interfaceC0743l.invoke(Boolean.valueOf(model.getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED));
            }
        }
    }
}
