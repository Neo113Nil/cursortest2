package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes3.dex */
public final class AFg1iSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean d() {
        return false;
    }

    public AFg1iSDK(Context context) {
        super("Register", new StringBuilder().append(String.format(AFg1nSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName())).append(context.getPackageName()).toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        return AFf1zSDK.REGISTER;
    }
}
