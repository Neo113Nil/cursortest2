package com.onesignal.location.internal.preferences.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LocationPreferencesService implements ILocationPreferencesService {
    private final IPreferencesService _prefs;

    public LocationPreferencesService(IPreferencesService _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // com.onesignal.location.internal.preferences.ILocationPreferencesService
    public long getLastLocationTime() {
        Long l2 = this._prefs.getLong("OneSignal", PreferenceOneSignalKeys.PREFS_OS_LAST_LOCATION_TIME, -600000L);
        i.b(l2);
        return l2.longValue();
    }

    @Override // com.onesignal.location.internal.preferences.ILocationPreferencesService
    public void setLastLocationTime(long j2) {
        this._prefs.saveLong("OneSignal", PreferenceOneSignalKeys.PREFS_OS_LAST_LOCATION_TIME, Long.valueOf(j2));
    }
}
