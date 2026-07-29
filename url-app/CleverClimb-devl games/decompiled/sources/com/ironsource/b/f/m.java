package com.ironsource.b.f;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.b.d.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ListenersWrapper.java */
/* loaded from: classes2.dex */
public class m implements f, g, h, j, p, s, v {

    /* renamed from: a, reason: collision with root package name */
    private s f6845a;

    /* renamed from: b, reason: collision with root package name */
    private g f6846b;

    /* renamed from: c, reason: collision with root package name */
    private j f6847c;

    /* renamed from: d, reason: collision with root package name */
    private f f6848d;
    private o e;
    private p f;
    private v g;
    private a h = new a();

    public m() {
        this.h.start();
    }

    private boolean a(Object obj) {
        return (obj == null || this.h == null) ? false : true;
    }

    private void a(Runnable runnable) {
        Handler a2;
        if (this.h == null || (a2 = this.h.a()) == null) {
            return;
        }
        a2.post(runnable);
    }

    public void a(s sVar) {
        this.f6845a = sVar;
    }

    public void a(g gVar) {
        this.f6846b = gVar;
    }

    public void a(f fVar) {
        this.f6848d = fVar;
    }

    @Override // com.ironsource.b.f.v
    public void a(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onSegmentReceived(" + str + ")", 1);
        if (a(this.g)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.1
                @Override // java.lang.Runnable
                public void run() {
                    if (str != null) {
                        m.this.g.a(str);
                    } else {
                        m.this.g.a("");
                    }
                }
            });
        }
    }

    @Override // com.ironsource.b.f.s
    public void c() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (a((Object) this.f6845a)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.12
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6845a.c();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.s
    public void d() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (a((Object) this.f6845a)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.23
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6845a.d();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.s
    public void b(final boolean z) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(false);
        try {
            a2.put("status", String.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(7, a2));
        if (a((Object) this.f6845a)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.30
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6845a.b(z);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.s
    public void a(final com.ironsource.b.e.k kVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdRewarded(" + kVar.toString() + ")", 1);
        if (a((Object) this.f6845a)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.31
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6845a.a(kVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.s
    public void b(final com.ironsource.b.e.k kVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdClicked(" + kVar.b() + ")", 1);
        if (a((Object) this.f6845a)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.32
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6845a.b(kVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.s
    public void d(final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdShowFailed(" + bVar.toString() + ")", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(false);
        try {
            a2.put("status", "false");
            if (bVar.a() == 524) {
                a2.put("reason", 1);
            }
            a2.put("errorCode", bVar.a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(17, a2));
        if (a((Object) this.f6845a)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.33
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6845a.d(bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void z() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdReady()", 1);
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.2
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.z();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void a_(final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdLoadFailed(" + bVar + ")", 1);
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.3
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.a_(bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void A() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdOpened()", 1);
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.4
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.A();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void C() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.5
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.C();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void c(final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdShowFailed(" + bVar + ")", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(false);
        try {
            if (bVar.a() == 524) {
                a2.put("reason", 1);
            }
            a2.put("errorCode", bVar.a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(29, a2));
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.6
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.c(bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void D() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdClicked()", 1);
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.7
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.D();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.j
    public void B() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdClosed()", 1);
        if (a(this.f6847c)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.8
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6847c.B();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.p
    public void F() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdRewarded()", 1);
        if (a(this.f)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.9
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f.F();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.o
    public void a() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onOfferwallOpened()", 1);
        if (a(this.e)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.10
                @Override // java.lang.Runnable
                public void run() {
                    m.this.e.a();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.o
    public void a(final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onOfferwallShowFailed(" + bVar + ")", 1);
        if (a(this.e)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.11
                @Override // java.lang.Runnable
                public void run() {
                    m.this.e.a(bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.o
    public boolean a(int i, int i2, boolean z) {
        boolean a2 = this.e != null ? this.e.a(i, i2, z) : false;
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + a2, 1);
        return a2;
    }

    @Override // com.ironsource.b.f.o
    public void b(final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onGetOfferwallCreditsFailed(" + bVar + ")", 1);
        if (a(this.e)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.13
                @Override // java.lang.Runnable
                public void run() {
                    m.this.e.b(bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.o
    public void b() {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onOfferwallClosed()", 1);
        if (a(this.e)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.14
                @Override // java.lang.Runnable
                public void run() {
                    m.this.e.b();
                }
            });
        }
    }

    @Override // com.ironsource.b.f.o
    public void a(boolean z) {
        a(z, null);
    }

    @Override // com.ironsource.b.f.h
    public void a(final boolean z, com.ironsource.b.d.b bVar) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (bVar != null) {
            str = str + ", error: " + bVar.b();
        }
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, str, 1);
        JSONObject a2 = com.ironsource.b.h.g.a(false);
        try {
            a2.put("status", String.valueOf(z));
            if (bVar != null) {
                a2.put("errorCode", bVar.a());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(302, a2));
        if (a(this.e)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.15
                @Override // java.lang.Runnable
                public void run() {
                    m.this.e.a(z);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdOpened(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdOpened(" + str + ")", 1);
        if (a((Object) this.f6846b)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.16
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6846b.onRewardedVideoAdOpened(str);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdClosed(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdClosed(" + str + ")", 1);
        if (a((Object) this.f6846b)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.17
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6846b.onRewardedVideoAdClosed(str);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAvailabilityChanged(final String str, final boolean z) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAvailabilityChanged(" + str + ", " + z + ")", 1);
        if (a((Object) this.f6846b)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.18
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6846b.onRewardedVideoAvailabilityChanged(str, z);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdRewarded(final String str, final com.ironsource.b.e.k kVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdRewarded(" + str + ", " + kVar.toString() + ")", 1);
        if (a((Object) this.f6846b)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.19
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6846b.onRewardedVideoAdRewarded(str, kVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdShowFailed(final String str, final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdShowFailed(" + str + ", " + bVar.toString() + ")", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(true);
        try {
            a2.put("status", "false");
            if (bVar.a() == 524) {
                a2.put("reason", 1);
            }
            a2.put("errorCode", bVar.a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(17, a2));
        if (a((Object) this.f6846b)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.20
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6846b.onRewardedVideoAdShowFailed(str, bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdClicked(final String str, final com.ironsource.b.e.k kVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onRewardedVideoAdClicked(" + str + ", " + kVar.b() + ")", 1);
        if (a((Object) this.f6846b)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.21
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6846b.onRewardedVideoAdClicked(str, kVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdReady(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdReady(" + str + ")", 1);
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.22
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdReady(str);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdLoadFailed(final String str, final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdLoadFailed(" + str + ", " + bVar + ")", 1);
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.24
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdLoadFailed(str, bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdOpened(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdOpened(" + str + ")", 1);
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.25
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdOpened(str);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdClosed(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdClosed(" + str + ")", 1);
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.26
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdClosed(str);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdShowSucceeded(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdShowSucceeded(" + str + ")", 1);
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.27
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdShowSucceeded(str);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdShowFailed(final String str, final com.ironsource.b.d.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdShowFailed(" + str + ", " + bVar + ")", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(true);
        try {
            if (bVar.a() == 524) {
                a2.put("reason", 1);
            }
            a2.put("errorCode", bVar.a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(29, a2));
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.28
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdShowFailed(str, bVar);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdClicked(final String str) {
        com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onInterstitialAdClicked(" + str + ")", 1);
        if (a((Object) this.f6848d)) {
            a(new Runnable() { // from class: com.ironsource.b.f.m.29
                @Override // java.lang.Runnable
                public void run() {
                    m.this.f6848d.onInterstitialAdClicked(str);
                }
            });
        }
    }

    /* compiled from: ListenersWrapper.java */
    private class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        private Handler f6912b;

        private a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f6912b = new Handler();
            Looper.loop();
        }

        public Handler a() {
            return this.f6912b;
        }
    }
}
