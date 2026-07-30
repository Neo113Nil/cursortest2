package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3007bt implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f29600a;

    public C3007bt(Context context) {
        this.f29600a = A3.f(context, C5107a.a());
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.td)).booleanValue() ? C3686oN.c(C2952at.f29347a) : C3686oN.c(new Ds(2, this));
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 46;
    }
}
