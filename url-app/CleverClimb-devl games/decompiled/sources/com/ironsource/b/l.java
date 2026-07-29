package com.ironsource.b;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.ironsource.b.d.c;
import org.json.JSONObject;

/* compiled from: IronSourceBannerLayout.java */
/* loaded from: classes2.dex */
public class l extends FrameLayout implements com.ironsource.b.f.a {

    /* renamed from: a, reason: collision with root package name */
    private e f6957a;

    /* renamed from: b, reason: collision with root package name */
    private View f6958b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f6959c;

    /* renamed from: d, reason: collision with root package name */
    private g f6960d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private com.ironsource.b.f.c i;
    private com.ironsource.b.f.b j;

    public void a(e eVar) {
        this.f6957a = eVar;
        a();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.b.l.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (l.this.isShown()) {
                    if (Build.VERSION.SDK_INT < 16) {
                        l.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else {
                        l.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    if (l.this.g) {
                        l.this.b();
                    }
                }
            }
        });
    }

    @Override // com.ironsource.b.f.a
    public void b(e eVar) {
        if (this.i != null) {
            this.i.c(null, eVar);
        }
    }

    public View getBannerView() {
        return this.f6958b;
    }

    public Activity getActivity() {
        return this.f6959c;
    }

    public g getSize() {
        return this.f6960d;
    }

    public String getPlacementName() {
        return this.e;
    }

    public void setPlacementName(String str) {
        this.e = str;
    }

    public void setBannerListener(com.ironsource.b.f.b bVar) {
        com.ironsource.b.d.d.c().a(c.a.API, "setBannerListener()", 1);
        this.j = bVar;
    }

    public com.ironsource.b.f.b getBannerListener() {
        return this.j;
    }

    @Override // com.ironsource.b.f.a
    public void a(com.ironsource.b.d.b bVar, e eVar) {
        if (this.h) {
            this.i.c(bVar, eVar);
            return;
        }
        if (c(eVar)) {
            return;
        }
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, "onBannerAdLoadFailed() | internal | adapter: " + eVar.n(), 0);
        this.f6957a = null;
        try {
            if (this.f6958b != null) {
                removeView(this.f6958b);
                this.f6958b = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        eVar.b(this);
        JSONObject a2 = com.ironsource.b.h.g.a((c) eVar, false);
        try {
            int a3 = getSize().a();
            a2.put("status", "false");
            a2.put("errorCode", bVar.a());
            a2.put("bannerAdSize", a3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(407, a2));
        if (this.i != null) {
            this.i.b(bVar, eVar);
        }
    }

    private boolean c(e eVar) {
        return this.f6957a == null || eVar == null || !this.f6957a.n().equals(eVar.n());
    }

    private synchronized void a() {
        this.f = false;
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        if (!this.f) {
            this.f = true;
            com.ironsource.b.h.a.a(this.f6959c, this.e);
            if (this.i != null && this.f6957a != null) {
                this.i.a(this, this.f6957a);
            }
        }
    }
}
