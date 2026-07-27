package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes.dex */
public final class AFg1iSDK extends AFa1qSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFg1iSDK(Context context) {
        super("Register", r0.toString(), Boolean.FALSE);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFg1nSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        sb.append(context.getPackageName());
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean d() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        return AFf1zSDK.REGISTER;
    }
}
