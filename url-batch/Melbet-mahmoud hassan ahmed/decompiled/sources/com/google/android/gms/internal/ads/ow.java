package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ow {

    /* renamed from: a, reason: collision with root package name */
    private final jv f9841a;

    /* renamed from: b, reason: collision with root package name */
    private final hv f9842b;

    /* renamed from: c, reason: collision with root package name */
    private final zz f9843c;

    /* renamed from: d, reason: collision with root package name */
    private final j60 f9844d;

    /* renamed from: e, reason: collision with root package name */
    private final sk0 f9845e;

    /* renamed from: f, reason: collision with root package name */
    private final wg0 f9846f;

    /* renamed from: g, reason: collision with root package name */
    private final k60 f9847g;

    /* renamed from: h, reason: collision with root package name */
    private zh0 f9848h;

    public ow(jv jvVar, hv hvVar, zz zzVar, j60 j60Var, sk0 sk0Var, wg0 wg0Var, k60 k60Var) {
        this.f9841a = jvVar;
        this.f9842b = hvVar;
        this.f9843c = zzVar;
        this.f9844d = j60Var;
        this.f9845e = sk0Var;
        this.f9846f = wg0Var;
        this.f9847g = k60Var;
    }

    static /* bridge */ /* synthetic */ void n(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        qw.b().i(context, qw.c().f10301f, "gmob-apps", bundle, true);
    }

    public final jx c(Context context, String str, dd0 dd0Var) {
        return new kw(this, context, str, dd0Var).d(context, false);
    }

    public final nx d(Context context, pv pvVar, String str, dd0 dd0Var) {
        return new gw(this, context, pvVar, str, dd0Var).d(context, false);
    }

    public final nx e(Context context, pv pvVar, String str, dd0 dd0Var) {
        return new iw(this, context, pvVar, str, dd0Var).d(context, false);
    }

    public final ng0 g(Context context, dd0 dd0Var) {
        return new dw(this, context, dd0Var).d(context, false);
    }

    public final zg0 i(Activity activity) {
        zv zvVar = new zv(this, activity);
        Intent intent = activity.getIntent();
        boolean z6 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z6 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            io0.d("useClientJar flag not found in activity intent extras.");
        }
        return zvVar.d(activity, z6);
    }

    public final fk0 k(Context context, String str, dd0 dd0Var) {
        return new nw(this, context, str, dd0Var).d(context, false);
    }

    public final bn0 l(Context context, dd0 dd0Var) {
        return new bw(this, context, dd0Var).d(context, false);
    }
}
