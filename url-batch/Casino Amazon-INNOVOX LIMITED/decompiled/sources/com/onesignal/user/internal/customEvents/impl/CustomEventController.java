package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.JSONUtils;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import com.onesignal.user.internal.customEvents.ICustomEventController;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.TrackCustomEventOperation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomEventController.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onesignal/user/internal/customEvents/impl/CustomEventController;", "Lcom/onesignal/user/internal/customEvents/ICustomEventController;", "identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", InfluenceConstants.TIME, "Lcom/onesignal/core/internal/time/ITime;", "opRepo", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "(Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/core/internal/operations/IOperationRepo;)V", "sendCustomEvent", "", "name", "", "properties", "", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomEventController implements ICustomEventController {
    private final ConfigModelStore configModelStore;
    private final IdentityModelStore identityModelStore;
    private final IOperationRepo opRepo;
    private final ITime time;

    public CustomEventController(IdentityModelStore identityModelStore, ConfigModelStore configModelStore, ITime time, IOperationRepo opRepo) {
        Intrinsics.checkNotNullParameter(identityModelStore, "identityModelStore");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        this.identityModelStore = identityModelStore;
        this.configModelStore = configModelStore;
        this.time = time;
        this.opRepo = opRepo;
    }

    @Override // com.onesignal.user.internal.customEvents.ICustomEventController
    public void sendCustomEvent(String name, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        IOperationRepo.DefaultImpls.enqueue$default(this.opRepo, new TrackCustomEventOperation(this.configModelStore.getModel().getAppId(), this.identityModelStore.getModel().getOnesignalId(), this.identityModelStore.getModel().getExternalId(), this.time.getCurrentTimeMillis(), name, properties != null ? JSONUtils.INSTANCE.mapToJson(properties).toString() : null), false, 2, null);
    }
}
