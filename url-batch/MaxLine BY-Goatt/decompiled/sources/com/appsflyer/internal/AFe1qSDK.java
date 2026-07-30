package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1qSDK extends AFa1qSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFe1qSDK(Context context) {
        super("Register", r0.toString(), Boolean.FALSE);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFe1sSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb.append(context.getPackageName());
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.REGISTER;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }
}
