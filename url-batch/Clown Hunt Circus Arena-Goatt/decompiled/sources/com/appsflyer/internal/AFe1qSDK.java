package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes.dex */
public final class AFe1qSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }

    public AFe1qSDK(Context context) {
        super("Register", new StringBuilder().append(String.format(AFe1sSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append(context.getPackageName()).toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.REGISTER;
    }
}
