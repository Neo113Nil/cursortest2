package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class v8 implements jf {

    /* renamed from: a, reason: collision with root package name */
    private Cif f20009a;

    protected v8(JSONObject jSONObject, Context context) {
        this.f20009a = a(jSONObject, context);
        Logger.i(v8.class.getSimpleName(), "created ConnectivityAdapter with strategy " + this.f20009a.getClass().getSimpleName());
    }

    private Cif a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(b9.i.f15557g0) != 1 && C1442c4.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new kn(this);
        }
        return new BroadcastReceiverStrategy(this);
    }

    public void b() {
        this.f20009a.a();
    }

    public void c(Context context) {
        this.f20009a.a(context);
    }

    public JSONObject a(Context context) {
        return this.f20009a.c(context);
    }

    public void b(Context context) {
        this.f20009a.b(context);
    }

    @Override // com.ironsource.jf
    public void a() {
    }

    @Override // com.ironsource.jf
    public void b(String str, JSONObject jSONObject) {
    }

    @Override // com.ironsource.jf
    public void a(String str, JSONObject jSONObject) {
    }
}
