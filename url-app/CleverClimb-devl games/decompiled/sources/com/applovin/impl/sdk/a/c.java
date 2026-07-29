package com.applovin.impl.sdk.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.c.g;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final j f2922a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.a.a f2923b;

    /* renamed from: c, reason: collision with root package name */
    private final Activity f2924c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f2925d;
    private final AppLovinAdRewardListener e;
    private final Timer f;

    /* renamed from: com.applovin.impl.sdk.a.c$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinAd f2926a;

        AnonymousClass1(AppLovinAd appLovinAd) {
            this.f2926a = appLovinAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder builder = new AlertDialog.Builder(c.this.f2924c);
            builder.setTitle((CharSequence) c.this.f2922a.a(com.applovin.impl.sdk.b.b.bx));
            builder.setMessage((CharSequence) c.this.f2922a.a(com.applovin.impl.sdk.b.b.by));
            builder.setCancelable(false);
            builder.setPositiveButton((CharSequence) c.this.f2922a.a(com.applovin.impl.sdk.b.b.bz), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.a.c.1.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    c.this.f2922a.D().a(g.k);
                    c.this.f.schedule(new TimerTask() { // from class: com.applovin.impl.sdk.a.c.1.1.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            c.this.f2924c.runOnUiThread(c.this.f2925d);
                        }
                    }, 200L);
                }
            });
            builder.setNegativeButton((CharSequence) c.this.f2922a.a(com.applovin.impl.sdk.b.b.bA), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.a.c.1.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    c.this.f2922a.D().a(g.l);
                    c.this.f2923b.a(AnonymousClass1.this.f2926a, c.this.e);
                }
            });
            builder.show();
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private j f2931a;

        /* renamed from: b, reason: collision with root package name */
        private com.applovin.impl.sdk.a.a f2932b;

        /* renamed from: c, reason: collision with root package name */
        private Activity f2933c;

        /* renamed from: d, reason: collision with root package name */
        private AppLovinAdRewardListener f2934d;
        private Runnable e;

        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        a a(Activity activity) {
            this.f2933c = activity;
            return this;
        }

        a a(com.applovin.impl.sdk.a.a aVar) {
            this.f2932b = aVar;
            return this;
        }

        a a(j jVar) {
            this.f2931a = jVar;
            return this;
        }

        a a(AppLovinAdRewardListener appLovinAdRewardListener) {
            this.f2934d = appLovinAdRewardListener;
            return this;
        }

        a a(Runnable runnable) {
            this.e = runnable;
            return this;
        }

        c a() {
            return new c(this, null);
        }
    }

    private c(a aVar) {
        this.f2922a = aVar.f2931a;
        this.f2923b = aVar.f2932b;
        this.f2924c = aVar.f2933c;
        this.f2925d = aVar.e;
        this.e = aVar.f2934d;
        this.f = new Timer("IncentivizedAdLauncher");
    }

    /* synthetic */ c(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    static a a() {
        return new a(null);
    }

    void a(AppLovinAd appLovinAd) {
        this.f2924c.runOnUiThread(new AnonymousClass1(appLovinAd));
    }
}
