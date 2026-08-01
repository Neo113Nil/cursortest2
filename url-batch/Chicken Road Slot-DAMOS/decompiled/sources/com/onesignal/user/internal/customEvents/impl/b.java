package com.onesignal.user.internal.customEvents.impl;

import java.util.Map;
import na.e;
import na.f;
import zc.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements xc.b {
    private final com.onesignal.core.internal.config.b configModelStore;
    private final yc.b identityModelStore;
    private final f opRepo;
    private final sa.a time;

    public b(yc.b bVar, com.onesignal.core.internal.config.b bVar2, sa.a aVar, f fVar) {
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        fVar.getClass();
        this.identityModelStore = bVar;
        this.configModelStore = bVar2;
        this.time = aVar;
        this.opRepo = fVar;
    }

    @Override // xc.b
    public void sendCustomEvent(String str, Map<String, ? extends Object> map) {
        str.getClass();
        e.enqueue$default(this.opRepo, new l(((com.onesignal.core.internal.config.a) this.configModelStore.getModel()).getAppId(), ((yc.a) this.identityModelStore.getModel()).getOnesignalId(), ((yc.a) this.identityModelStore.getModel()).getExternalId(), this.time.getCurrentTimeMillis(), str, map != null ? com.onesignal.common.f.INSTANCE.mapToJson(map).toString() : null), false, 2, null);
    }
}
