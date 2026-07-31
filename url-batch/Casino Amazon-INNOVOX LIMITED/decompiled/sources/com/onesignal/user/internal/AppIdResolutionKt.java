package com.onesignal.user.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppIdResolution.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"resolveAppId", "Lcom/onesignal/user/internal/AppIdResolution;", "inputAppId", "", "configModel", "Lcom/onesignal/core/internal/config/ConfigModel;", "preferencesService", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppIdResolutionKt {
    public static final AppIdResolution resolveAppId(String str, ConfigModel configModel, IPreferencesService preferencesService) {
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        boolean z = true;
        if (str != null) {
            if (configModel.hasProperty("appId") && Intrinsics.areEqual(configModel.getAppId(), str)) {
                z = false;
            }
            return new AppIdResolution(str, z, false);
        }
        if (configModel.hasProperty("appId")) {
            return new AppIdResolution(configModel.getAppId(), false, false);
        }
        String string$default = IPreferencesService.DefaultImpls.getString$default(preferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_LEGACY_APP_ID, null, 4, null);
        if (string$default != null) {
            return new AppIdResolution(string$default, true, false);
        }
        return new AppIdResolution(null, false, true);
    }
}
