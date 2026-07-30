package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3060cs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29762a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f29763b;

    public /* synthetic */ C3060cs(int i, Bundle bundle) {
        this.f29762a = i;
        this.f29763b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        switch (this.f29762a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = this.f29763b;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle("installed_adapter_data", bundle2);
                    break;
                }
                break;
            case 1:
                Bundle bundle3 = (Bundle) obj;
                Bundle b9 = AbstractC2720Pd.b("device", bundle3);
                b9.putBundle("android_mem_info", this.f29763b);
                bundle3.putBundle("device", b9);
                break;
            case 2:
                Bundle bundle4 = (Bundle) obj;
                Bundle bundle5 = this.f29763b;
                if (bundle5 != null) {
                    bundle4.putAll(bundle5);
                    break;
                }
                break;
            case 3:
                Bundle bundle6 = (Bundle) obj;
                Bundle bundle7 = this.f29763b;
                if (!bundle7.isEmpty()) {
                    bundle6.putBundle("shared_pref", bundle7);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle8 = this.f29763b;
                if (bundle8 != null) {
                    try {
                        p8.g.v("play_store", p8.g.v("device", jSONObject)).put("parental_controls", C4907p.f40108g.f40109a.m(bundle8));
                        break;
                    } catch (JSONException unused) {
                        t2.C.k("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}
