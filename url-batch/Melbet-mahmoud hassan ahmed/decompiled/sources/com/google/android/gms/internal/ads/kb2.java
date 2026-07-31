package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kb2 extends ef0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f7450f;

    /* renamed from: g, reason: collision with root package name */
    private final cf0 f7451g;

    /* renamed from: h, reason: collision with root package name */
    private final bp0<JSONObject> f7452h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f7453i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7454j;

    public kb2(String str, cf0 cf0Var, bp0<JSONObject> bp0Var) {
        JSONObject jSONObject = new JSONObject();
        this.f7453i = jSONObject;
        this.f7454j = false;
        this.f7452h = bp0Var;
        this.f7450f = str;
        this.f7451g = cf0Var;
        try {
            jSONObject.put("adapter_version", cf0Var.d().toString());
            jSONObject.put("sdk_version", cf0Var.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final synchronized void Y5(cv cvVar) {
        if (this.f7454j) {
            return;
        }
        try {
            this.f7453i.put("signal_error", cvVar.f3955g);
        } catch (JSONException unused) {
        }
        this.f7452h.e(this.f7453i);
        this.f7454j = true;
    }

    public final synchronized void a() {
        if (this.f7454j) {
            return;
        }
        this.f7452h.e(this.f7453i);
        this.f7454j = true;
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final synchronized void u(String str) {
        if (this.f7454j) {
            return;
        }
        if (str == null) {
            z("Adapter returned null signals");
            return;
        }
        try {
            this.f7453i.put("signals", str);
        } catch (JSONException unused) {
        }
        this.f7452h.e(this.f7453i);
        this.f7454j = true;
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final synchronized void z(String str) {
        if (this.f7454j) {
            return;
        }
        try {
            this.f7453i.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f7452h.e(this.f7453i);
        this.f7454j = true;
    }
}
