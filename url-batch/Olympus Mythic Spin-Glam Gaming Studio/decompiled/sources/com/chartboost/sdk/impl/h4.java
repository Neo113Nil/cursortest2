package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h4 implements xg {
    public static final h4 b = new h4();
    public final /* synthetic */ yg a = new yg();

    @Override // com.chartboost.sdk.impl.xg
    public Application a() {
        return this.a.a();
    }

    public String b() {
        return this.a.b();
    }

    public String c() {
        return this.a.c();
    }

    public boolean d() {
        return this.a.d();
    }

    public boolean e() {
        return this.a.e();
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context);
    }

    public void a(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.a.a(appId, appSignature);
    }
}
