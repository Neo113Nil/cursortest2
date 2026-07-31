package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class yg implements xg {
    public volatile String a;
    public volatile String b;
    public volatile Application c;

    @Override // com.chartboost.sdk.impl.xg
    public Application a() {
        Application application = this.c;
        if (application != null) {
            return application;
        }
        xb.b("Missing application. Cannot start Chartboost SDK.", (Throwable) null, 2, (Object) null);
        throw new g4();
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            xb.b("Failed to initialize Chartboost SDK. Application is null.", (Throwable) null, 2, (Object) null);
            return;
        }
        this.c = application;
        try {
            InterruptionController.a(InterruptionController.a, a(), null, 2, null);
            xb.c("InterruptionController initialized.", null, 2, null);
        } catch (Exception e) {
            xb.b("Error initializing InterruptionController.", e);
        }
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        String str;
        String str2 = this.a;
        return (str2 == null || str2.length() == 0 || (str = this.b) == null || str.length() == 0) ? false : true;
    }

    public String b() {
        String str = this.a;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public void a(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.a = appId;
        this.b = appSignature;
    }
}
