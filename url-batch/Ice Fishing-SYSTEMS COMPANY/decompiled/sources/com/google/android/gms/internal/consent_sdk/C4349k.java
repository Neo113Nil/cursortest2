package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.internal.ads.C3820qw;
import com.google.android.gms.internal.ads.C4236yh;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4903n;

/* renamed from: com.google.android.gms.internal.consent_sdk.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4349k {

    /* renamed from: a, reason: collision with root package name */
    public final Application f35858a;

    /* renamed from: b, reason: collision with root package name */
    public final r f35859b;

    /* renamed from: c, reason: collision with root package name */
    public final C4333g f35860c;

    /* renamed from: d, reason: collision with root package name */
    public final C4365o f35861d;

    /* renamed from: e, reason: collision with root package name */
    public final C4357m f35862e;

    /* renamed from: f, reason: collision with root package name */
    public final C4400x f35863f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f35864g;

    /* renamed from: h, reason: collision with root package name */
    public C4373q f35865h;
    public final AtomicBoolean i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f35866j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f35867k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f35868l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public boolean f35869m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35870n = false;

    public C4349k(Application application, r rVar, C4333g c4333g, C4365o c4365o, C4357m c4357m, C4400x c4400x) {
        this.f35858a = application;
        this.f35859b = rVar;
        this.f35860c = c4333g;
        this.f35861d = c4365o;
        this.f35862e = c4357m;
        this.f35863f = c4400x;
    }

    public final void a(Activity activity, I3.b bVar) {
        C.a();
        ((Queue) this.f35863f.f35952h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.i.compareAndSet(false, true)) {
            C4354l0 c4354l0 = new C4354l0(3, true != this.f35869m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(c4354l0);
            bVar.onConsentFormDismissed(c4354l0.a());
            return;
        }
        C4373q c4373q = this.f35865h;
        C4236yh c4236yh = c4373q.f35901u;
        Objects.requireNonNull(c4236yh);
        c4373q.f35900n.post(new RunnableC4369p(c4236yh, 0));
        C4341i c4341i = new C4341i(this, activity);
        this.f35858a.registerActivityLifecycleCallbacks(c4341i);
        this.f35868l.set(c4341i);
        this.f35859b.f35905a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f35865h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            C4354l0 c4354l02 = new C4354l0(3, "Activity with null windows is passed in.");
            d(c4354l02);
            bVar.onConsentFormDismissed(c4354l02.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
        com.bumptech.glide.g.R(window, false);
        this.f35867k.set(bVar);
        dialog.show();
        this.f35864g = dialog;
        this.f35865h.a("UMP_messagePresented", "");
        d(null);
    }

    public final void b(I3.h hVar, I3.g gVar) {
        C4357m c4357m = this.f35862e;
        r rVar = (r) ((Z2) c4357m.f35879n).d();
        Handler handler = C.f35655a;
        E.c(handler);
        this.f35865h = new C4373q(rVar, handler, ((C4903n) c4357m.f35880u).d());
        boolean z8 = this.f35869m;
        C4400x c4400x = this.f35863f;
        if (!z8) {
            ((Queue) c4400x.f35953j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        C4373q c4373q = this.f35865h;
        c4373q.setBackgroundColor(0);
        c4373q.getSettings().setJavaScriptEnabled(true);
        c4373q.getSettings().setAllowFileAccess(false);
        c4373q.getSettings().setAllowContentAccess(false);
        c4373q.setWebViewClient(new C3820qw(c4373q));
        if (!this.f35869m) {
            c4400x.a((Queue) c4400x.f35953j.get(), 3, 2, null);
        }
        this.f35866j.set(new C4345j(hVar, gVar));
        C4373q c4373q2 = this.f35865h;
        C4365o c4365o = this.f35861d;
        c4373q2.loadDataWithBaseURL(c4365o.f35891a, c4365o.f35892b, "text/html", "UTF-8", null);
        handler.postDelayed(new RunnableC4337h(0, this), 10000L);
    }

    public final void c(C4354l0 c4354l0) {
        C4345j c4345j = (C4345j) this.f35866j.getAndSet(null);
        if (c4345j == null) {
            return;
        }
        if (!this.f35869m) {
            String message = c4354l0.getMessage();
            boolean z8 = this.f35870n;
            C4400x c4400x = this.f35863f;
            if (z8) {
                c4400x.a((Queue) c4400x.i.get(), 10, 11, message);
            } else {
                c4400x.a((Queue) c4400x.f35951g.get(), 4, 5, message);
            }
        }
        c4345j.b(c4354l0.a());
    }

    public final void d(C4354l0 c4354l0) {
        if (this.f35869m) {
            return;
        }
        String message = c4354l0 == null ? null : c4354l0.getMessage();
        boolean z8 = this.f35870n;
        C4400x c4400x = this.f35863f;
        if (z8) {
            c4400x.a((Queue) c4400x.i.get(), 10, 11, message);
        } else {
            c4400x.a((Queue) c4400x.f35952h.get(), 6, 7, message);
        }
    }
}
