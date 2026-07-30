package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ds implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24598a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24599b;

    public /* synthetic */ Ds(int i, Object obj) {
        this.f24598a = i;
        this.f24599b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        boolean z8;
        boolean z9;
        switch (this.f24598a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Tt tt = (Tt) this.f24599b;
                if (tt != null) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.sd)).booleanValue()) {
                        return;
                    }
                    synchronized (tt.f27874c) {
                        tt.b();
                        z8 = tt.f27876e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z8);
                    synchronized (tt.f27874c) {
                        tt.b();
                        z9 = tt.f27876e == 3;
                    }
                    bundle.putBoolean("disable_ml", z9);
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f24599b);
                    return;
                } catch (JSONException unused) {
                    t2.C.k("Unable to get cache_state");
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                C3007bt c3007bt = (C3007bt) this.f24599b;
                c3007bt.getClass();
                try {
                    jSONObject.put("gms_sdk_env", c3007bt.f29600a);
                    return;
                } catch (JSONException unused2) {
                    t2.C.k("Failed putting version constants.");
                    return;
                }
        }
    }
}
