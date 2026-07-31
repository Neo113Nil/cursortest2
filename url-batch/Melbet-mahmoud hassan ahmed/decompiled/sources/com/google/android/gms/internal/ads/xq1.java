package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class xq1 implements a40 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yq1 f14312a;

    xq1(yq1 yq1Var) {
        this.f14312a = yq1Var;
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final JSONObject a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final void b(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final void c() {
        mm1 mm1Var;
        mm1 mm1Var2;
        mm1Var = this.f14312a.f14790i;
        if (mm1Var != null) {
            mm1Var2 = this.f14312a.f14790i;
            mm1Var2.R("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final JSONObject zza() {
        return null;
    }
}
