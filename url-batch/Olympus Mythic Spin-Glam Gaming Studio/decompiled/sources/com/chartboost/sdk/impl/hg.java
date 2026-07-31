package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.Mediation;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class hg implements gg {
    public final Context a;
    public final y2 b;
    public final j3 c;
    public final AtomicReference d;
    public final SharedPreferences e;
    public final vh f;
    public final z3 g;
    public final zg h;
    public final bf i;
    public final Mediation j;
    public final m6 k;

    public hg(Context context, y2 identity, j3 reachability, AtomicReference sdkConfig, SharedPreferences sharedPreferences, vh timeSource, z3 carrierBuilder, zg session, bf privacyApi, Mediation mediation, m6 deviceBodyFieldsFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(carrierBuilder, "carrierBuilder");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(deviceBodyFieldsFactory, "deviceBodyFieldsFactory");
        this.a = context;
        this.b = identity;
        this.c = reachability;
        this.d = sdkConfig;
        this.e = sharedPreferences;
        this.f = timeSource;
        this.g = carrierBuilder;
        this.h = session;
        this.i = privacyApi;
        this.j = mediation;
        this.k = deviceBodyFieldsFactory;
    }

    @Override // com.chartboost.sdk.impl.gg
    public ig a() {
        h4 h4Var = h4.b;
        String b = h4Var.b();
        String c = h4Var.c();
        s9 h = this.b.h();
        pf reachabilityBodyFields = q8.toReachabilityBodyFields(this.c);
        y3 a = this.g.a(this.a);
        ah i = this.h.i();
        wh bodyFields = q8.toBodyFields(this.f);
        cf g = this.i.g();
        i5 n = ((sg) this.d.get()).n();
        l6 b2 = this.k.b();
        Mediation mediation = this.j;
        return new ig(b, c, h, reachabilityBodyFields, a, i, bodyFields, g, n, b2, mediation != null ? mediation.toMediationBodyFields() : null);
    }
}
