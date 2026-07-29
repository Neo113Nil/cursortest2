package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements MaxAd {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f2709a;

    /* renamed from: b, reason: collision with root package name */
    private final j f2710b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2711c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f2712d;
    private boolean e;
    private com.applovin.impl.mediation.a.a f;
    private com.applovin.impl.mediation.a.a g;

    public b(JSONObject jSONObject, j jVar) {
        this.f2709a = jSONObject;
        this.f2710b = jVar;
    }

    public com.applovin.impl.mediation.a.a a(Activity activity) {
        boolean z;
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f2711c) {
            if (this.f2712d) {
                throw new IllegalStateException("Ad with backup was destroyed");
            }
            z = true;
            this.f2712d = true;
            if (this.f != null) {
                aVar = this.f;
                z = false;
            } else {
                if (this.g == null) {
                    throw new IllegalStateException("Ad with backup does not have either primary or backup ad to resolve");
                }
                aVar = this.g;
            }
        }
        if (z) {
            this.f2710b.a(activity).a(aVar);
        }
        return aVar;
    }

    public List<com.applovin.impl.mediation.a.a> a() {
        ArrayList arrayList;
        synchronized (this.f2711c) {
            this.e = true;
            arrayList = new ArrayList(2);
            if (this.f != null) {
                arrayList.add(this.f);
                this.f = null;
            }
            if (this.g != null) {
                arrayList.add(this.g);
                this.g = null;
            }
        }
        return arrayList;
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f2711c) {
            if (!this.e) {
                this.f = aVar;
            }
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f2711c) {
            if (!this.e) {
                this.g = aVar;
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.f2711c) {
            z = this.e || this.f2712d;
        }
        return z;
    }

    public boolean b(Activity activity) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f2711c) {
            aVar = null;
            if (this.g != null) {
                this.f = this.g;
                this.g = null;
                aVar = this.f;
            }
        }
        if (aVar != null) {
            this.f2710b.a(activity).maybeScheduleBackupAdPromotedToPrimaryPostback(aVar);
        }
        return aVar != null;
    }

    public long c() {
        return f.a(this.f2709a, "ad_expiration_ms", ((Long) this.f2710b.a(com.applovin.impl.sdk.b.a.K)).longValue(), this.f2710b);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return f.a(this.f2709a, "ad_unit_id", (String) null, this.f2710b);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return l.b(f.a(this.f2709a, "ad_format", (String) null, this.f2710b));
    }

    @Override // com.applovin.mediation.MaxAd
    public boolean isReady() {
        synchronized (this.f2711c) {
            if (this.f == null && this.g == null) {
                return false;
            }
            return true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[MediatedAdWithBackup, adUnitId=");
        sb.append(getAdUnitId());
        sb.append(", hasAd=");
        sb.append(this.f != null);
        sb.append(", hasBackup=");
        sb.append(this.g != null);
        sb.append("]");
        return sb.toString();
    }
}
