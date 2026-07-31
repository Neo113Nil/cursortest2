package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes3.dex */
public final class AFg1uSDK extends AFa1rSDK {
    @Override // com.appsflyer.internal.AFa1rSDK
    public final boolean e() {
        return false;
    }

    public AFg1uSDK(Context context) {
        super("Register", new StringBuilder().append(String.format(AFf1bSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName())).append(context.getPackageName()).toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFe1eSDK valueOf() {
        return AFe1eSDK.REGISTER;
    }
}
