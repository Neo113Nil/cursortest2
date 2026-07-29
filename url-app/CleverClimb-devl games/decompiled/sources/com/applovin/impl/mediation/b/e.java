package com.applovin.impl.mediation.b;

import android.app.Activity;
import com.applovin.impl.sdk.c.i;
import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxErrorCodes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2737a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f2738c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f2739d;
    private final com.applovin.impl.mediation.c e;
    private final MaxAdListener f;
    private final Activity g;

    e(String str, com.applovin.impl.mediation.c cVar, JSONObject jSONObject, JSONObject jSONObject2, j jVar, Activity activity, MaxAdListener maxAdListener) {
        super("TaskLoadAdapterAd " + str, jVar);
        this.f2738c = jSONObject;
        this.f2739d = jSONObject2;
        this.f2737a = str;
        this.e = cVar;
        this.g = activity;
        this.f = maxAdListener;
    }

    private com.applovin.impl.mediation.a.a f() throws JSONException {
        String string = this.f2739d.getString("ad_format");
        MaxAdFormat b2 = l.b(string);
        if (b2 == MaxAdFormat.BANNER || b2 == MaxAdFormat.MREC || b2 == MaxAdFormat.LEADER) {
            return new com.applovin.impl.mediation.a.b(this.f2738c, this.f2739d, this.f3073b);
        }
        if (b2 == MaxAdFormat.NATIVE) {
            return new com.applovin.impl.mediation.a.d(this.f2738c, this.f2739d, this.f3073b);
        }
        if (b2 == MaxAdFormat.INTERSTITIAL || b2 == MaxAdFormat.REWARDED) {
            return new com.applovin.impl.mediation.a.c(this.f2738c, this.f2739d, this.f3073b);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    @Override // com.applovin.impl.sdk.d.a
    public i a() {
        return i.D;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f3073b.a(this.g).loadThirdPartyMediatedAd(this.f2737a, f(), this.g, this.f);
        } catch (Throwable th) {
            a("Unable to process adapter ad", th);
            this.f3073b.E().a(a());
            g.a(this.f, this.f2737a, MaxErrorCodes.MEDIATION_ADAPTER_LOAD_FAILED, this.f3073b);
        }
    }
}
