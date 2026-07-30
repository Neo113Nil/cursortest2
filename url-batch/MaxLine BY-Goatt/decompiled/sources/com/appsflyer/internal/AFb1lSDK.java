package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1iSDK;
import defpackage.ch2;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1lSDK implements AFb1iSDK {
    private final AFb1uSDK AFInAppEventType;
    private final AFf1tSDK AFKeystoreWrapper;
    private final Executor valueOf;
    private AFb1kSDK values;

    public AFb1lSDK(Executor executor, AFb1uSDK aFb1uSDK, AFf1tSDK aFf1tSDK) {
        executor.getClass();
        aFb1uSDK.getClass();
        aFf1tSDK.getClass();
        this.valueOf = executor;
        this.AFInAppEventType = aFb1uSDK;
        this.AFKeystoreWrapper = aFf1tSDK;
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final void AFInAppEventParameterName(Context context, AFb1iSDK.AFa1wSDK aFa1wSDK) {
        context.getClass();
        aFa1wSDK.getClass();
        context.getClass();
        if (this.values != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                ch2.l("null cannot be cast to non-null type android.app.Application");
                return;
            }
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.values);
        }
        this.values = null;
        AFb1kSDK aFb1kSDK = new AFb1kSDK(this.valueOf, this.AFInAppEventType, this.AFKeystoreWrapper, aFa1wSDK);
        this.values = aFb1kSDK;
        if (context instanceof Activity) {
            aFb1kSDK.onActivityResumed((Activity) context);
        }
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 != null) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(this.values);
        } else {
            ch2.l("null cannot be cast to non-null type android.app.Application");
        }
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final boolean AFKeystoreWrapper() {
        return this.values != null;
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final void valueOf(Context context) {
        AFb1iSDK.AFa1wSDK aFa1wSDK;
        context.getClass();
        AFb1kSDK aFb1kSDK = this.values;
        if (aFb1kSDK == null || (aFa1wSDK = aFb1kSDK.values) == null) {
            return;
        }
        aFa1wSDK.AFKeystoreWrapper(context);
    }
}
