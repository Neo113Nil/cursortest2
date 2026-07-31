package com.onesignal.user.internal.customEvents.impl;

import d2.e;
import d2.f;
import g2.InterfaceC0391a;
import java.util.Map;
import kotlin.jvm.internal.i;
import r3.C0617a;
import s3.l;

/* loaded from: classes.dex */
public final class b implements q3.b {
    private final com.onesignal.core.internal.config.c configModelStore;
    private final r3.b identityModelStore;
    private final f opRepo;
    private final InterfaceC0391a time;

    public b(r3.b identityModelStore, com.onesignal.core.internal.config.c configModelStore, InterfaceC0391a time, f opRepo) {
        i.e(identityModelStore, "identityModelStore");
        i.e(configModelStore, "configModelStore");
        i.e(time, "time");
        i.e(opRepo, "opRepo");
        this.identityModelStore = identityModelStore;
        this.configModelStore = configModelStore;
        this.time = time;
        this.opRepo = opRepo;
    }

    @Override // q3.b
    public void sendCustomEvent(String name, Map<String, ? extends Object> map) {
        i.e(name, "name");
        e.enqueue$default(this.opRepo, new l(((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId(), ((C0617a) this.identityModelStore.getModel()).getOnesignalId(), ((C0617a) this.identityModelStore.getModel()).getExternalId(), this.time.getCurrentTimeMillis(), name, map != null ? com.onesignal.common.f.INSTANCE.mapToJson(map).toString() : null), false, 2, null);
    }
}
