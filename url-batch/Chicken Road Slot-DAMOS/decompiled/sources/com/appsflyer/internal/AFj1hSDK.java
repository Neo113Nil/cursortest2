package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    public final String getMediationNetwork() {
        Object mVar;
        try {
            hd.l lVar = hd.n.f4511e;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            mVar = (String) obj;
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        if (mVar instanceof hd.m) {
            mVar = "";
        }
        return (String) mVar;
    }
}
