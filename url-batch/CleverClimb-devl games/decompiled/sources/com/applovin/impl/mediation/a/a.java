package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a extends e implements MaxAd {

    /* renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.mediation.e f2658a;

    protected a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.e eVar, j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f2658a = eVar;
    }

    private long h() {
        return b("load_started_time_ms", 0L);
    }

    public abstract a a(com.applovin.impl.mediation.e eVar);

    public boolean a() {
        return b("is_backup", (Boolean) false);
    }

    public com.applovin.impl.mediation.e b() {
        return this.f2658a;
    }

    public String c() {
        return b("bid_response", (String) null);
    }

    public String d() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public long e() {
        if (h() > 0) {
            return SystemClock.elapsedRealtime() - h();
        }
        return -1L;
    }

    public void f() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public void g() {
        this.f2658a = null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return a("ad_unit_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return l.b(a("ad_format", (String) null));
    }

    @Override // com.applovin.mediation.MaxAd
    public boolean isReady() {
        return this.f2658a != null && this.f2658a.c() && this.f2658a.d();
    }

    @Override // com.applovin.impl.mediation.a.e
    public String toString() {
        return "[MediatedAd, adUnitId=" + getAdUnitId() + ", specObject=" + s() + "]";
    }
}
