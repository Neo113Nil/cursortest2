package com.ironsource.b;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.b.d.c;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OfferwallManager.java */
/* loaded from: classes2.dex */
class p implements com.ironsource.b.f.h {

    /* renamed from: b, reason: collision with root package name */
    private com.ironsource.b.f.n f6988b;

    /* renamed from: c, reason: collision with root package name */
    private com.ironsource.b.f.h f6989c;
    private com.ironsource.b.h.h g;
    private com.ironsource.b.e.o h;
    private String i;
    private Activity j;

    /* renamed from: a, reason: collision with root package name */
    private final String f6987a = getClass().getName();
    private AtomicBoolean e = new AtomicBoolean(true);
    private AtomicBoolean f = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private com.ironsource.b.d.d f6990d = com.ironsource.b.d.d.c();

    p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void a(Activity activity, String str, String str2) {
        this.f6990d.a(c.a.NATIVE, this.f6987a + ":initOfferwall(appKey: " + str + ", userId: " + str2 + ")", 1);
        this.j = activity;
        this.g = m.a().l();
        if (this.g == null) {
            c(com.ironsource.b.h.d.b("Please check configurations for Offerwall adapters", "Offerwall"));
            return;
        }
        this.h = this.g.e().a("SupersonicAds");
        if (this.h == null) {
            c(com.ironsource.b.h.d.b("Please check configurations for Offerwall adapters", "Offerwall"));
            return;
        }
        b c2 = c();
        if (c2 == 0) {
            c(com.ironsource.b.h.d.b("Please check configurations for Offerwall adapters", "Offerwall"));
            return;
        }
        a(c2);
        c2.setLogListener(this.f6990d);
        this.f6988b = (com.ironsource.b.f.n) c2;
        this.f6988b.setInternalOfferwallListener(this);
        this.f6988b.initOfferwall(activity, str, str2, this.h.b());
    }

    public void a(com.ironsource.b.f.h hVar) {
        this.f6989c = hVar;
    }

    @Override // com.ironsource.b.f.o
    public void a(boolean z) {
        a(z, null);
    }

    @Override // com.ironsource.b.f.h
    public void a(boolean z, com.ironsource.b.d.b bVar) {
        this.f6990d.a(c.a.ADAPTER_CALLBACK, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (z) {
            this.f.set(true);
            if (this.f6989c != null) {
                this.f6989c.a(true);
                return;
            }
            return;
        }
        c(bVar);
    }

    @Override // com.ironsource.b.f.o
    public void a() {
        this.f6990d.a(c.a.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(false);
        try {
            if (!TextUtils.isEmpty(this.i)) {
                a2.put("placement", this.i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(305, a2));
        if (this.f6989c != null) {
            this.f6989c.a();
        }
    }

    @Override // com.ironsource.b.f.o
    public void a(com.ironsource.b.d.b bVar) {
        this.f6990d.a(c.a.ADAPTER_CALLBACK, "onOfferwallShowFailed(" + bVar + ")", 1);
        if (this.f6989c != null) {
            this.f6989c.a(bVar);
        }
    }

    @Override // com.ironsource.b.f.o
    public boolean a(int i, int i2, boolean z) {
        this.f6990d.a(c.a.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        if (this.f6989c != null) {
            return this.f6989c.a(i, i2, z);
        }
        return false;
    }

    @Override // com.ironsource.b.f.o
    public void b(com.ironsource.b.d.b bVar) {
        this.f6990d.a(c.a.ADAPTER_CALLBACK, "onGetOfferwallCreditsFailed(" + bVar + ")", 1);
        if (this.f6989c != null) {
            this.f6989c.b(bVar);
        }
    }

    @Override // com.ironsource.b.f.o
    public void b() {
        this.f6990d.a(c.a.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        if (this.f6989c != null) {
            this.f6989c.b();
        }
    }

    private synchronized void c(com.ironsource.b.d.b bVar) {
        if (this.f != null) {
            this.f.set(false);
        }
        if (this.e != null) {
            this.e.set(true);
        }
        if (this.f6989c != null) {
            this.f6989c.a(false, bVar);
        }
    }

    private b c() {
        try {
            m a2 = m.a();
            b b2 = a2.b("SupersonicAds");
            if (b2 == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + "SupersonicAds".toLowerCase() + ".SupersonicAdsAdapter");
                b2 = (b) cls.getMethod("startAdapter", String.class).invoke(cls, "SupersonicAds");
                if (b2 == null) {
                    return null;
                }
            }
            a2.d(b2);
            return b2;
        } catch (Throwable th) {
            this.f6990d.a(c.a.API, "SupersonicAds initialization failed - please verify that required dependencies are in you build path.", 2);
            this.f6990d.a(c.a.API, this.f6987a + ":startOfferwallAdapter", th);
            return null;
        }
    }

    private void a(b bVar) {
        try {
            Integer b2 = m.a().b();
            if (b2 != null) {
                bVar.setAge(b2.intValue());
            }
            String c2 = m.a().c();
            if (c2 != null) {
                bVar.setGender(c2);
            }
            String d2 = m.a().d();
            if (d2 != null) {
                bVar.setMediationSegment(d2);
            }
            Boolean m = m.a().m();
            if (m != null) {
                this.f6990d.a(c.a.ADAPTER_API, "Offerwall | setConsent(consent:" + m + ")", 1);
                bVar.setConsent(m.booleanValue());
            }
        } catch (Exception e) {
            this.f6990d.a(c.a.INTERNAL, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
