package com.onesignal.core.internal.preferences;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.preferences.IPreferencesService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreferencesExtensionV4.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¨\u0006\u0007"}, d2 = {"clearLegacyPlayerId", "", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "getLegacyAppId", "", "getLegacyPlayerId", "getLegacyUserSyncValues", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesExtensionV4Kt {
    public static final String getLegacyAppId(IPreferencesService iPreferencesService) {
        Intrinsics.checkNotNullParameter(iPreferencesService, "<this>");
        return IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_APP_ID, null, 4, null);
    }

    public static final String getLegacyPlayerId(IPreferencesService iPreferencesService) {
        Intrinsics.checkNotNullParameter(iPreferencesService, "<this>");
        return IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null, 4, null);
    }

    public static final String getLegacyUserSyncValues(IPreferencesService iPreferencesService) {
        Intrinsics.checkNotNullParameter(iPreferencesService, "<this>");
        return IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_USER_SYNCVALUES, null, 4, null);
    }

    public static final void clearLegacyPlayerId(IPreferencesService iPreferencesService) {
        Intrinsics.checkNotNullParameter(iPreferencesService, "<this>");
        iPreferencesService.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null);
    }
}
