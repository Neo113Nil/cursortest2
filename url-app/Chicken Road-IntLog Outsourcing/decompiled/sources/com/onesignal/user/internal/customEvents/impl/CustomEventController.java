package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.user.internal.customEvents.ICustomEventController;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.TrackCustomEventOperation;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class CustomEventController implements ICustomEventController {
    private final ConfigModelStore configModelStore;
    private final IdentityModelStore identityModelStore;
    private final IOperationRepo opRepo;
    private final ITime time;

    public CustomEventController(IdentityModelStore identityModelStore, ConfigModelStore configModelStore, ITime time, IOperationRepo opRepo) {
        i.e(identityModelStore, "identityModelStore");
        i.e(configModelStore, "configModelStore");
        i.e(time, "time");
        i.e(opRepo, "opRepo");
        this.identityModelStore = identityModelStore;
        this.configModelStore = configModelStore;
        this.time = time;
        this.opRepo = opRepo;
    }

    @Override // com.onesignal.user.internal.customEvents.ICustomEventController
    public void sendCustomEvent(String name, Map<String, ? extends Object> map) {
        i.e(name, "name");
        IOperationRepo.DefaultImpls.enqueue$default(this.opRepo, new TrackCustomEventOperation(this.configModelStore.getModel().getAppId(), this.identityModelStore.getModel().getOnesignalId(), this.identityModelStore.getModel().getExternalId(), this.time.getCurrentTimeMillis(), name, map != null ? JSONUtils.INSTANCE.mapToJson(map).toString() : null), false, 2, null);
    }
}
