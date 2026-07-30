package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3438js implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32207b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32208c;

    public /* synthetic */ C3438js(String str, int i, int i4) {
        this.f32206a = i4;
        this.f32207b = str;
        this.f32208c = i;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        int i;
        int i4;
        switch (this.f32206a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f32207b;
                if (!TextUtils.isEmpty(str) && (i = this.f32208c) != -1) {
                    Bundle b9 = AbstractC2720Pd.b("pii", bundle);
                    bundle.putBundle("pii", b9);
                    b9.putString("pvid", str);
                    b9.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ob)).booleanValue()) {
                    String str2 = this.f32207b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i9 = this.f32208c;
                    if (i9 != -1) {
                        bundle2.putInt("atps", i9);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f32207b;
                if (!TextUtils.isEmpty(str3) && (i4 = this.f32208c) != -1) {
                    try {
                        JSONObject v6 = p8.g.v("pii", jSONObject);
                        v6.put("pvid", str3);
                        v6.put("pvid_s", i4);
                        break;
                    } catch (JSONException e6) {
                        t2.C.l("Failed putting gms core app set ID info.", e6);
                    }
                }
                break;
        }
    }
}
