package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.og;

/* loaded from: classes2.dex */
public class mg extends og.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18028b;

        a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18027a = str;
            this.f18028b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            mg.this.a(this.f18027a, "onInterstitialAdReady()");
            this.f18028b.onInterstitialAdReady(this.f18027a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18030a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f18031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18032c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18030a = str;
            this.f18031b = ironSourceError;
            this.f18032c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            mg.this.a(this.f18030a, "onInterstitialAdLoadFailed() error = " + this.f18031b.getErrorMessage());
            this.f18032c.onInterstitialAdLoadFailed(this.f18030a, this.f18031b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18035b;

        c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18034a = str;
            this.f18035b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            mg.this.a(this.f18034a, "onInterstitialAdOpened()");
            this.f18035b.onInterstitialAdOpened(this.f18034a);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f18038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18039c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18037a = str;
            this.f18038b = ironSourceError;
            this.f18039c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            mg.this.a(this.f18037a, "onInterstitialAdShowFailed() error = " + this.f18038b.getErrorMessage());
            this.f18039c.onInterstitialAdShowFailed(this.f18037a, this.f18038b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18042b;

        e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18041a = str;
            this.f18042b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            mg.this.a(this.f18041a, "onInterstitialAdClicked()");
            this.f18042b.onInterstitialAdClicked(this.f18041a);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18044a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18045b;

        f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18044a = str;
            this.f18045b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            mg.this.a(this.f18044a, "onInterstitialAdClosed()");
            this.f18045b.onInterstitialAdClosed(this.f18044a);
        }
    }

    mg() {
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener a4 = a();
        a(new e(str, a4), a4 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener a4 = a();
        a(new f(str, a4), a4 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a4 = a();
        a(new b(str, ironSourceError, a4), a4 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener a4 = a();
        a(new c(str, a4), a4 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener a4 = a();
        a(new a(str, a4), a4 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a4 = a();
        a(new d(str, ironSourceError, a4), a4 != null);
    }

    mg(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }
}
