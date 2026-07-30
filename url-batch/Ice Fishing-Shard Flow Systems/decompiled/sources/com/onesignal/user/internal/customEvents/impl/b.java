package com.onesignal.user.internal.customEvents.impl;

import F2.e;
import F2.f;
import U3.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements S3.b {
    private final com.onesignal.core.internal.config.c configModelStore;
    private final T3.b identityModelStore;
    private final f opRepo;
    private final I2.a time;

    public b(T3.b identityModelStore, com.onesignal.core.internal.config.c configModelStore, I2.a time, f opRepo) {
        Intrinsics.checkNotNullParameter(identityModelStore, "identityModelStore");
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        this.identityModelStore = identityModelStore;
        this.configModelStore = configModelStore;
        this.time = time;
        this.opRepo = opRepo;
    }

    @Override // S3.b
    public void sendCustomEvent(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        e.enqueue$default(this.opRepo, new l(((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId(), ((T3.a) this.identityModelStore.getModel()).getOnesignalId(), ((T3.a) this.identityModelStore.getModel()).getExternalId(), this.time.getCurrentTimeMillis(), name, map != null ? com.onesignal.common.f.INSTANCE.mapToJson(map).toString() : null), false, 2, null);
    }
}
