package com.applovin.impl.mediation.b;

import android.app.Activity;
import com.applovin.impl.sdk.c.g;
import com.applovin.impl.sdk.c.h;
import com.applovin.impl.sdk.c.i;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxErrorCodes;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2740a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f2741c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONArray f2742d;
    private final com.applovin.impl.mediation.c e;
    private final MaxAdListener f;
    private final Activity g;
    private final AtomicBoolean h;
    private final com.applovin.impl.mediation.b i;
    private final Object j;
    private a k;
    private int l;

    private enum a {
        BACKUP_AD_STATE_NOT_NEEDED,
        BACKUP_AD_STATE_LOADING,
        BACKUP_AD_STATE_WAITING_FOR_RESPONSE,
        BACKUP_AD_STATE_LOADED,
        BACKUP_AD_STATE_FAILED
    }

    private class b extends com.applovin.impl.sdk.d.a {

        /* renamed from: c, reason: collision with root package name */
        private final JSONArray f2749c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2750d;

        b(int i, JSONArray jSONArray) {
            super("TaskProcessNextWaterfallAd", f.this.f3073b);
            if (i >= 0 && i < jSONArray.length()) {
                this.f2749c = jSONArray;
                this.f2750d = i;
            } else {
                throw new IllegalArgumentException("Invalid ad index specified: " + i);
            }
        }

        private String a(int i) {
            if (i < 0 || i >= this.f2749c.length()) {
                return "undefined";
            }
            try {
                return com.applovin.impl.sdk.e.f.a(this.f2749c.getJSONObject(i), "type", "undefined", this.f3073b);
            } catch (JSONException unused) {
                d("Unable to parse next ad from the ad response");
                return "undefined";
            }
        }

        private void f() throws JSONException {
            f.this.l = this.f2750d;
            JSONObject jSONObject = this.f2749c.getJSONObject(this.f2750d);
            if (f.b(jSONObject)) {
                g();
                return;
            }
            String a2 = a(this.f2750d);
            if ("adapter".equalsIgnoreCase(a2)) {
                a("Starting task for adapter ad...");
                this.f3073b.C().a(new e(f.this.f2740a, f.this.e, jSONObject, f.this.f2741c, this.f3073b, f.this.g, new com.applovin.impl.mediation.c.a(f.this.f, this.f3073b) { // from class: com.applovin.impl.mediation.b.f.b.1
                    @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                    public void onAdLoadFailed(String str, int i) {
                        b.this.h();
                    }

                    @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                    public void onAdLoaded(MaxAd maxAd) {
                        f.this.a(maxAd);
                    }
                }));
                return;
            }
            d("Unable to process ad of unknown type: " + a2);
            f.this.a(-800);
        }

        private void g() {
            String str;
            a a2 = f.this.a(a.BACKUP_AD_STATE_WAITING_FOR_RESPONSE);
            if (a2 == a.BACKUP_AD_STATE_LOADING) {
                return;
            }
            if (a2 == a.BACKUP_AD_STATE_LOADED) {
                if (f.this.i.b(f.this.g)) {
                    b("Backup ad was promoted to primary");
                    return;
                }
                str = "Failed to promote backup ad to primary: nothing promoted";
            } else {
                if (a2 == a.BACKUP_AD_STATE_FAILED) {
                    h();
                    return;
                }
                str = "Unknown state of loading the backup ad: " + a2;
            }
            d(str);
            f.this.a(-5201);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            q C;
            q.a aVar;
            if (f.this.i.b()) {
                c("Not loading next waterfall ad because returned ad was already displayed");
                return;
            }
            if (this.f2750d >= this.f2749c.length() - 1) {
                f.this.i();
                return;
            }
            b("Attempting to load next ad (" + this.f2750d + ") after failure...");
            b bVar = f.this.new b(this.f2750d + 1, this.f2749c);
            if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.a.E)).booleanValue()) {
                C = this.f3073b.C();
                aVar = q.a.MEDIATION_MAIN;
            } else {
                C = this.f3073b.C();
                aVar = q.a.MEDIATION_BACKGROUND;
            }
            C.a(bVar, aVar);
        }

        @Override // com.applovin.impl.sdk.d.a
        public i a() {
            return i.F;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f();
            } catch (Throwable th) {
                a("Encountered error while processing ad number " + this.f2750d, th);
                this.f3073b.E().a(a());
                f.this.i();
            }
        }
    }

    f(String str, JSONObject jSONObject, com.applovin.impl.mediation.c cVar, Activity activity, j jVar, MaxAdListener maxAdListener) {
        super("TaskProcessMediationWaterfall " + str, jVar);
        this.f2740a = str;
        this.f2741c = jSONObject;
        this.e = cVar;
        this.f = maxAdListener;
        this.g = activity;
        this.f2742d = this.f2741c.optJSONArray("ads");
        this.i = new com.applovin.impl.mediation.b(jSONObject, jVar);
        this.h = new AtomicBoolean();
        this.j = new Object();
        this.k = a.BACKUP_AD_STATE_NOT_NEEDED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a a(a aVar) {
        a aVar2;
        synchronized (this.j) {
            aVar2 = this.k;
            this.k = aVar;
            b("Backup ad state changed from " + aVar2 + " to " + aVar);
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        h D;
        g gVar;
        if (i == 204) {
            D = this.f3073b.D();
            gVar = g.r;
        } else if (i == -5001) {
            D = this.f3073b.D();
            gVar = g.s;
        } else {
            D = this.f3073b.D();
            gVar = g.t;
        }
        D.a(gVar);
        if (this.h.compareAndSet(false, true)) {
            b("Notifying parent of ad load failure...");
            com.applovin.impl.sdk.e.g.a(this.f, this.f2740a, i, this.f3073b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        if (!(maxAd instanceof com.applovin.impl.mediation.a.a)) {
            a(-5201);
        } else {
            this.i.a((com.applovin.impl.mediation.a.a) maxAd);
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        if (!(maxAd instanceof com.applovin.impl.mediation.a.a)) {
            a(-5201);
            return;
        }
        b("Backup ad loaded");
        com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
        if (a(a.BACKUP_AD_STATE_LOADED) == a.BACKUP_AD_STATE_WAITING_FOR_RESPONSE) {
            this.f3073b.a(this.g).maybeScheduleBackupAdPromotedToPrimaryPostback(aVar);
            this.i.a(aVar);
        } else {
            this.i.b(aVar);
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optBoolean("is_backup");
    }

    private void f() throws JSONException {
        JSONObject jSONObject;
        int i = 0;
        while (true) {
            if (i >= this.f2742d.length()) {
                jSONObject = null;
                break;
            }
            jSONObject = this.f2742d.getJSONObject(i);
            if (b(jSONObject)) {
                break;
            } else {
                i++;
            }
        }
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            b("Loading backup ad...");
            a(a.BACKUP_AD_STATE_LOADING);
            this.f3073b.C().a(new e(this.f2740a, this.e, jSONObject2, this.f2741c, this.f3073b, this.g, new com.applovin.impl.mediation.c.a(this.f, this.f3073b) { // from class: com.applovin.impl.mediation.b.f.1
                @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, int i2) {
                    f.this.g();
                }

                @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    f.this.b(maxAd);
                }
            }), q.a.MEDIATION_BACKUP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        d("Backup ad failed to load...");
        if (a(a.BACKUP_AD_STATE_FAILED) == a.BACKUP_AD_STATE_WAITING_FOR_RESPONSE) {
            new b(this.l, this.f2742d).h();
        }
    }

    private void h() {
        if (this.h.compareAndSet(false, true)) {
            b("Notifying parent of ad load success...");
            com.applovin.impl.sdk.e.g.a(this.f, this.i, this.f3073b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        a(MaxErrorCodes.MEDIATION_ADAPTER_LOAD_FAILED);
    }

    @Override // com.applovin.impl.sdk.d.a
    public i a() {
        return i.E;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a("Processing ad response...");
            int length = this.f2742d != null ? this.f2742d.length() : 0;
            if (length <= 0) {
                c("No ads were returned from the server");
                a(204);
                return;
            }
            f();
            a("Loading the first out of " + length + " ads...");
            this.f3073b.C().a(new b(0, this.f2742d));
        } catch (Throwable th) {
            a("Encountered error while processing ad response", th);
            i();
            this.f3073b.E().a(a());
        }
    }
}
