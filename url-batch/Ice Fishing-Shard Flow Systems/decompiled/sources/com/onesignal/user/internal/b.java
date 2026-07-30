package com.onesignal.user.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {
    public static final a resolveAppId(String str, com.onesignal.core.internal.config.b configModel, H2.b preferencesService) {
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        boolean z7 = true;
        if (str != null) {
            if (configModel.hasProperty("appId") && Intrinsics.a(configModel.getAppId(), str)) {
                z7 = false;
            }
            return new a(str, z7, false);
        }
        if (configModel.hasProperty("appId")) {
            return new a(configModel.getAppId(), false, false);
        }
        String string$default = H2.a.getString$default(preferencesService, com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_APP_ID", null, 4, null);
        return string$default != null ? new a(string$default, true, false) : new a(null, false, true);
    }
}
