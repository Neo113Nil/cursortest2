package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import defpackage.i31;
import defpackage.j31;
import defpackage.k31;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1iSDK implements AFj1gSDK {
    @Override // com.appsflyer.internal.AFj1gSDK
    public final String getRevenue() {
        Object j31Var;
        try {
            i31 i31Var = k31.d;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            j31Var = (String) obj;
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        if (j31Var instanceof j31) {
            j31Var = "";
        }
        return (String) j31Var;
    }
}
