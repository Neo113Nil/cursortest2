package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public final class AFj1wSDK implements AFj1zSDK {
    @Override // com.appsflyer.internal.AFj1zSDK
    public final String AFInAppEventType() {
        Object m6819constructorimpl;
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            AFj1wSDK aFj1wSDK = this;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        if (obj != null) {
            m6819constructorimpl = Result.m6819constructorimpl((String) obj);
            if (Result.m6825isFailureimpl(m6819constructorimpl)) {
                m6819constructorimpl = "";
            }
            return (String) m6819constructorimpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
