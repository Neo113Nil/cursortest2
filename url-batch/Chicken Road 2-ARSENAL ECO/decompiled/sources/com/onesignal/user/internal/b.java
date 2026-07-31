package com.onesignal.user.internal;

import f2.AbstractC0364a;
import f2.InterfaceC0365b;

/* loaded from: classes.dex */
public abstract class b {
    public static final a resolveAppId(String str, com.onesignal.core.internal.config.b configModel, InterfaceC0365b preferencesService) {
        kotlin.jvm.internal.i.e(configModel, "configModel");
        kotlin.jvm.internal.i.e(preferencesService, "preferencesService");
        boolean z5 = true;
        if (str != null) {
            if (configModel.hasProperty("appId") && kotlin.jvm.internal.i.a(configModel.getAppId(), str)) {
                z5 = false;
            }
            return new a(str, z5, false);
        }
        if (configModel.hasProperty("appId")) {
            return new a(configModel.getAppId(), false, false);
        }
        String string$default = AbstractC0364a.getString$default(preferencesService, com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_APP_ID", null, 4, null);
        return string$default != null ? new a(string$default, true, false) : new a(null, false, true);
    }
}
