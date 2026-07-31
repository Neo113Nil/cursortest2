package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zw0 implements kv3<hj0> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f15275a;

    public zw0(yv3<Context> yv3Var) {
        this.f15275a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hj0 a() {
        Context b7 = ((gw0) this.f15275a).b();
        cc0 b8 = y2.t.g().b(b7, po0.c());
        wb0<JSONObject> wb0Var = zb0.f15062b;
        b8.a("google.afma.request.getAdDictionary", wb0Var, wb0Var);
        return new gj0(b7, y2.t.g().b(b7, po0.c()).a("google.afma.sdkConstants.getSdkConstants", wb0Var, wb0Var));
    }
}
