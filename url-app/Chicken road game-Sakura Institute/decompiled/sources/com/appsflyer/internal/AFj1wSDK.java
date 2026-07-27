package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.io.Serializable;
import java.lang.reflect.Field;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class AFj1wSDK implements AFj1zSDK {
    @Override // com.appsflyer.internal.AFj1zSDK
    public final String AFInAppEventType() {
        Serializable a4;
        Object obj;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        a4 = (String) obj;
        if (AbstractC1341p.b(a4)) {
            a4 = "";
        }
        return (String) a4;
    }
}
