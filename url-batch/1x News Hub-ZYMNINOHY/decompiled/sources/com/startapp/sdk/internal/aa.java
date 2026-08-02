package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class aa extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public final z9 f3558k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Context context, AdPreferences preferences, AdPreferences.Placement placement, ib httpClient, ib networkApiExecutor, ib eventTracer, ib motionProcessor, z9 builder) {
        super(context, null, preferences, null, placement, httpClient, networkApiExecutor, eventTracer, motionProcessor);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(preferences, "preferences");
        kotlin.jvm.internal.j.e(placement, "placement");
        kotlin.jvm.internal.j.e(httpClient, "httpClient");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(motionProcessor, "motionProcessor");
        kotlin.jvm.internal.j.e(builder, "builder");
        this.f3558k = builder;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        return true;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        c9 c9Var = new c9();
        z9 z9Var = this.f3558k;
        c9Var.f3638W0 = z9Var.f4873b;
        c9Var.f3639X0 = z9Var.f4874c;
        AdUnitConfig adUnitConfig = z9Var.f4875d;
        c9Var.f3640Y0 = adUnitConfig != null ? adUnitConfig.getBp() : null;
        z9 z9Var2 = this.f3558k;
        c9Var.Z0 = z9Var2.f4876e;
        c9Var.f3637V0 = z9Var2.f4872a;
        c9Var.f3642b1 = z9Var2.f4877g;
        c9Var.f3641a1 = z9Var2.f4878h.intValue();
        c9Var.f3643c1 = this.f3558k.f4879i;
        com.startapp.sdk.adsbase.model.a a3 = a((com.startapp.sdk.adsbase.model.a) c9Var);
        if (a3 != null) {
            a3.g(this.f3293a);
            Point point = this.f3558k.f;
            a3.L = point != null ? point.x : a3.L;
            a3.f4751M = point != null ? point.y : a3.f4751M;
        }
        return a3;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c3 = c();
        if (c3 == null) {
            return null;
        }
        n8 n8Var = new n8((o8) this.f3298g.a(), c3.a(h0.a(AdsConstants$AdApiType.HTML, this.f3297e)));
        n8Var.f4196e = new Y1.E(20, this);
        return n8Var.a();
    }

    public static final Void a(aa this$0, Throwable th) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        this$0.f = th != null ? th.getMessage() : null;
        return null;
    }
}
