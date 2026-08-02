package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class aa extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public final z9 f6660k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Context context, AdPreferences preferences, AdPreferences.Placement placement, ib httpClient, ib networkApiExecutor, ib eventTracer, ib motionProcessor, z9 builder) {
        super(context, null, preferences, null, placement, httpClient, networkApiExecutor, eventTracer, motionProcessor);
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(preferences, "preferences");
        kotlin.jvm.internal.i.e(placement, "placement");
        kotlin.jvm.internal.i.e(httpClient, "httpClient");
        kotlin.jvm.internal.i.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.i.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.i.e(motionProcessor, "motionProcessor");
        kotlin.jvm.internal.i.e(builder, "builder");
        this.f6660k = builder;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        return true;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        c9 c9Var = new c9();
        z9 z9Var = this.f6660k;
        c9Var.f6747W0 = z9Var.f8023b;
        c9Var.f6748X0 = z9Var.f8024c;
        AdUnitConfig adUnitConfig = z9Var.f8025d;
        c9Var.f6749Y0 = adUnitConfig != null ? adUnitConfig.getBp() : null;
        z9 z9Var2 = this.f6660k;
        c9Var.f6750Z0 = z9Var2.f8026e;
        c9Var.f6746V0 = z9Var2.f8022a;
        c9Var.f6752b1 = z9Var2.f8028g;
        c9Var.f6751a1 = z9Var2.f8029h.intValue();
        c9Var.f6753c1 = this.f6660k.f8030i;
        com.startapp.sdk.adsbase.model.a a3 = a((com.startapp.sdk.adsbase.model.a) c9Var);
        if (a3 != null) {
            a3.g(this.f6382a);
            Point point = this.f6660k.f8027f;
            a3.L = point != null ? point.x : a3.L;
            a3.f7897M = point != null ? point.y : a3.f7897M;
        }
        return a3;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c4 = c();
        if (c4 == null) {
            return null;
        }
        n8 n8Var = new n8((o8) this.f6388g.a(), c4.a(h0.a(AdsConstants$AdApiType.HTML, this.f6386e)));
        n8Var.f7329e = new D0.a(24, this);
        return n8Var.a();
    }

    public static final Void a(aa this$0, Throwable th) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.f6387f = th != null ? th.getMessage() : null;
        return null;
    }
}
