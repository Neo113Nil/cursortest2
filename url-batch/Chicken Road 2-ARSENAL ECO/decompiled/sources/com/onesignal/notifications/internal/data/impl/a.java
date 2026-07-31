package com.onesignal.notifications.internal.data.impl;

import com.onesignal.core.internal.config.c;
import g2.InterfaceC0391a;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements R2.a {
    private final c _configModelStore;
    private final InterfaceC0391a _time;

    public a(c _configModelStore, InterfaceC0391a _time) {
        i.e(_configModelStore, "_configModelStore");
        i.e(_time, "_time");
        this._configModelStore = _configModelStore;
        this._time = _time;
    }

    @Override // R2.a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
