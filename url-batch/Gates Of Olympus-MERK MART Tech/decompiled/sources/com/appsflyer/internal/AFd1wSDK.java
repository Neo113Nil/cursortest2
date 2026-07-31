package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1uSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFd1wSDK implements AFd1uSDK {
    private final ScheduledExecutorService AFInAppEventParameterName;
    private final AFc1pSDK AFInAppEventType;
    private final Executor AFKeystoreWrapper;
    private final AFh1iSDK valueOf;
    private AFd1vSDK values;

    public AFd1wSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1pSDK aFc1pSDK, AFh1iSDK aFh1iSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFh1iSDK, "");
        this.AFKeystoreWrapper = executor;
        this.AFInAppEventParameterName = scheduledExecutorService;
        this.AFInAppEventType = aFc1pSDK;
        this.valueOf = aFh1iSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void valueOf(Context context, AFd1uSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.values != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.values);
        }
        this.values = null;
        AFd1vSDK aFd1vSDK = new AFd1vSDK(this.AFKeystoreWrapper, this.AFInAppEventParameterName, this.AFInAppEventType, this.valueOf, aFa1tSDK);
        this.values = aFd1vSDK;
        if (context instanceof Activity) {
            aFd1vSDK.onActivityResumed((Activity) context);
        }
        Application values = AFb1rSDK.values(context);
        if (values != null) {
            values.registerActivityLifecycleCallbacks(this.values);
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFKeystoreWrapper() {
        return this.values != null;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        AFd1uSDK.AFa1tSDK aFa1tSDK;
        AFd1vSDK aFd1vSDK = this.values;
        if (aFd1vSDK == null || (aFa1tSDK = aFd1vSDK.values) == null) {
            return;
        }
        aFa1tSDK.AFInAppEventParameterName();
    }
}
