package com.onesignal.core.internal.preferences;

import com.onesignal.core.internal.preferences.IPreferencesService;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PreferencesExtensionV4Kt {
    public static final void clearLegacyPlayerId(IPreferencesService iPreferencesService) {
        i.e(iPreferencesService, "<this>");
        iPreferencesService.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null);
    }

    public static final String getLegacyAppId(IPreferencesService iPreferencesService) {
        i.e(iPreferencesService, "<this>");
        return IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_APP_ID, null, 4, null);
    }

    public static final String getLegacyPlayerId(IPreferencesService iPreferencesService) {
        i.e(iPreferencesService, "<this>");
        return IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null, 4, null);
    }

    public static final String getLegacyUserSyncValues(IPreferencesService iPreferencesService) {
        i.e(iPreferencesService, "<this>");
        return IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_USER_SYNCVALUES, null, 4, null);
    }
}
