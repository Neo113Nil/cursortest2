package com.applovin.impl.mediation.a;

import android.view.View;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends a {
    private b(b bVar, com.applovin.impl.mediation.e eVar) {
        super(bVar.s(), bVar.r(), eVar, bVar.f2660b);
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, null, jVar);
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.e eVar) {
        return new b(this, eVar);
    }

    public int h() {
        return a("ad_view_width", ((Integer) this.f2660b.a(com.applovin.impl.sdk.b.a.s)).intValue());
    }

    public int i() {
        return a("ad_view_height", ((Integer) this.f2660b.a(com.applovin.impl.sdk.b.a.t)).intValue());
    }

    public View j() {
        if (!isReady() || this.f2658a == null) {
            return null;
        }
        View a2 = this.f2658a.a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Ad-view based ad is missing an ad view");
    }

    public long k() {
        return b("viewability_imp_delay_ms", ((Long) this.f2660b.a(com.applovin.impl.sdk.b.b.ci)).longValue());
    }

    public int l() {
        return a("viewability_min_width", ((Integer) this.f2660b.a(getFormat() == MaxAdFormat.BANNER ? com.applovin.impl.sdk.b.b.cj : getFormat() == MaxAdFormat.MREC ? com.applovin.impl.sdk.b.b.cl : com.applovin.impl.sdk.b.b.cn)).intValue());
    }

    public int m() {
        return a("viewability_min_height", ((Integer) this.f2660b.a(getFormat() == MaxAdFormat.BANNER ? com.applovin.impl.sdk.b.b.ck : getFormat() == MaxAdFormat.MREC ? com.applovin.impl.sdk.b.b.cm : com.applovin.impl.sdk.b.b.co)).intValue());
    }

    public float n() {
        return a("viewability_min_alpha", ((Float) this.f2660b.a(com.applovin.impl.sdk.b.b.cp)).floatValue() / 100.0f);
    }

    public int o() {
        return a("viewability_min_pixels", -1);
    }

    public boolean p() {
        return o() >= 0;
    }

    public long q() {
        return b("viewability_timer_min_visible_ms", ((Long) this.f2660b.a(com.applovin.impl.sdk.b.b.cq)).longValue());
    }
}
