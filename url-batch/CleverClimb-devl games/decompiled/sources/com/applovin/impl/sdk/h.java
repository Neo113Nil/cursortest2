package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class h implements t.a {

    /* renamed from: b, reason: collision with root package name */
    private static AlertDialog f3266b;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f3267c = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final i f3268a;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.e.j f3269d;

    /* renamed from: com.applovin.impl.sdk.h$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f3270a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f3271b;

        AnonymousClass1(j jVar, a aVar) {
            this.f3270a = jVar;
            this.f3271b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p u;
            String str;
            String str2;
            if (h.this.f3268a.c()) {
                this.f3270a.u().d("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            Activity a2 = this.f3270a.S().a();
            if (a2 != null && com.applovin.impl.sdk.e.e.a(this.f3270a.w(), this.f3270a)) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = h.f3266b = new AlertDialog.Builder(AnonymousClass1.this.f3270a.S().a()).setTitle((CharSequence) AnonymousClass1.this.f3270a.a(com.applovin.impl.sdk.b.b.aq)).setMessage((CharSequence) AnonymousClass1.this.f3270a.a(com.applovin.impl.sdk.b.b.ar)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.f3270a.a(com.applovin.impl.sdk.b.b.as), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.h.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                AnonymousClass1.this.f3271b.a();
                                dialogInterface.dismiss();
                                h.f3267c.set(false);
                            }
                        }).setNegativeButton((CharSequence) AnonymousClass1.this.f3270a.a(com.applovin.impl.sdk.b.b.at), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.h.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                AnonymousClass1.this.f3271b.b();
                                dialogInterface.dismiss();
                                h.f3267c.set(false);
                                h.this.a(((Long) AnonymousClass1.this.f3270a.a(com.applovin.impl.sdk.b.b.ao)).longValue(), AnonymousClass1.this.f3270a, AnonymousClass1.this.f3271b);
                            }
                        }).create();
                        h.f3266b.show();
                    }
                });
                return;
            }
            if (a2 == null) {
                u = this.f3270a.u();
                str = "ConsentAlertManager";
                str2 = "No parent Activity found - rescheduling consent alert...";
            } else {
                u = this.f3270a.u();
                str = "ConsentAlertManager";
                str2 = "No internet available - rescheduling consent alert...";
            }
            u.d(str, str2);
            h.f3267c.set(false);
            h.this.a(((Long) this.f3270a.a(com.applovin.impl.sdk.b.b.ap)).longValue(), this.f3270a, this.f3271b);
        }
    }

    public interface a {
        void a();

        void b();
    }

    h(i iVar, j jVar) {
        this.f3268a = iVar;
        jVar.Q().a(this);
    }

    public void a(long j, j jVar, a aVar) {
        if (j <= 0) {
            return;
        }
        if (f3266b == null || !f3266b.isShowing()) {
            if (f3267c.getAndSet(true)) {
                if (j >= this.f3269d.a()) {
                    jVar.u().c("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f3269d.a() + " milliseconds");
                    return;
                }
                jVar.u().a("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.f3269d.a() + "ms)");
                this.f3269d.d();
            }
            jVar.u().a("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
            this.f3269d = com.applovin.impl.sdk.e.j.a(j, jVar, new AnonymousClass1(jVar, aVar));
        }
    }

    @Override // com.applovin.impl.sdk.t.a
    public void b() {
        if (this.f3269d != null) {
            this.f3269d.b();
        }
    }

    @Override // com.applovin.impl.sdk.t.a
    public void c() {
        if (this.f3269d != null) {
            this.f3269d.c();
        }
    }
}
