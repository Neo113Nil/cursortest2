package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFj1iSDK implements AFj1gSDK {
    @Override // com.appsflyer.internal.AFj1gSDK
    public final String getRevenue() {
        Object n7;
        try {
            R5.l lVar = R5.n.f2421d;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.c(obj, "");
            n7 = (String) obj;
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        return (String) (n7 instanceof R5.m ? "" : n7);
    }
}
