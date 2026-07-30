package com.onesignal.notifications.internal.data.impl;

import com.onesignal.core.internal.config.c;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC0926a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0926a {
    private final c _configModelStore;
    private final I2.a _time;

    public a(c _configModelStore, I2.a _time) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._configModelStore = _configModelStore;
        this._time = _time;
    }

    @Override // t3.InterfaceC0926a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
