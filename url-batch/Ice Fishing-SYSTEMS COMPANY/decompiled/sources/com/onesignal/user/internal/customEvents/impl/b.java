package com.onesignal.user.internal.customEvents.impl;

import D4.e;
import D4.f;
import R5.l;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class b implements P5.b {
    private final com.onesignal.core.internal.config.c configModelStore;
    private final Q5.b identityModelStore;
    private final f opRepo;
    private final G4.a time;

    public b(Q5.b identityModelStore, com.onesignal.core.internal.config.c configModelStore, G4.a time, f opRepo) {
        h.e(identityModelStore, "identityModelStore");
        h.e(configModelStore, "configModelStore");
        h.e(time, "time");
        h.e(opRepo, "opRepo");
        this.identityModelStore = identityModelStore;
        this.configModelStore = configModelStore;
        this.time = time;
        this.opRepo = opRepo;
    }

    @Override // P5.b
    public void sendCustomEvent(String name, Map<String, ? extends Object> map) {
        h.e(name, "name");
        e.enqueue$default(this.opRepo, new l(((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId(), ((Q5.a) this.identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this.identityModelStore.getModel()).getExternalId(), this.time.getCurrentTimeMillis(), name, map != null ? com.onesignal.common.f.INSTANCE.mapToJson(map).toString() : null), false, 2, null);
    }
}
