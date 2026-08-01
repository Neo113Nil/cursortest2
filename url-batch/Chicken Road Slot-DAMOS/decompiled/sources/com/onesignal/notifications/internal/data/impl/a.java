package com.onesignal.notifications.internal.data.impl;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements cc.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final sa.a _time;

    public a(com.onesignal.core.internal.config.b bVar, sa.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this._configModelStore = bVar;
        this._time = aVar;
    }

    @Override // cc.a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb2 = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb2.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb2;
    }
}
