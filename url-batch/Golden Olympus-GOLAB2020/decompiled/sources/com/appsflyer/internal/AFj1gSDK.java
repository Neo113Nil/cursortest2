package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    public final String getRevenue() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.checkNotNull(obj2, "");
            obj = Result.m243constructorimpl((String) obj2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m244isFailureimpl(obj) ? "" : obj);
    }
}
