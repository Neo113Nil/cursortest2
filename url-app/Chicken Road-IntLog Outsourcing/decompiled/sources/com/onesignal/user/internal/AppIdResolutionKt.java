package com.onesignal.user.internal;

import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppIdResolutionKt {
    public static final AppIdResolution resolveAppId(String str, ConfigModel configModel, IPreferencesService preferencesService) {
        i.e(configModel, "configModel");
        i.e(preferencesService, "preferencesService");
        boolean z = true;
        if (str != null) {
            if (configModel.hasProperty("appId") && i.a(configModel.getAppId(), str)) {
                z = false;
            }
            return new AppIdResolution(str, z, false);
        }
        if (configModel.hasProperty("appId")) {
            return new AppIdResolution(configModel.getAppId(), false, false);
        }
        String string$default = IPreferencesService.DefaultImpls.getString$default(preferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_APP_ID, null, 4, null);
        return string$default != null ? new AppIdResolution(string$default, true, false) : new AppIdResolution(null, false, true);
    }
}
