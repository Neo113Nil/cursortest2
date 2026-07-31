package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.og;

/* renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1556s5 extends og.a<ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.s5$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f18956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f18957c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f18955a = str;
            this.f18956b = ironSourceError;
            this.f18957c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1556s5.this.a(this.f18955a, "onBannerAdLoadFailed() error = " + this.f18956b.getErrorMessage());
            this.f18957c.onBannerAdLoadFailed(this.f18955a, this.f18956b);
        }
    }

    /* renamed from: com.ironsource.s5$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f18960b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f18959a = str;
            this.f18960b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1556s5.this.a(this.f18959a, "onBannerAdLoaded()");
            this.f18960b.onBannerAdLoaded(this.f18959a);
        }
    }

    /* renamed from: com.ironsource.s5$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f18963b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f18962a = str;
            this.f18963b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1556s5.this.a(this.f18962a, "onBannerAdShown()");
            this.f18963b.onBannerAdShown(this.f18962a);
        }
    }

    /* renamed from: com.ironsource.s5$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f18966b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f18965a = str;
            this.f18966b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1556s5.this.a(this.f18965a, "onBannerAdClicked()");
            this.f18966b.onBannerAdClicked(this.f18965a);
        }
    }

    /* renamed from: com.ironsource.s5$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f18969b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f18968a = str;
            this.f18969b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1556s5.this.a(this.f18968a, "onBannerAdLeftApplication()");
            this.f18969b.onBannerAdLeftApplication(this.f18968a);
        }
    }

    public void a(String str) {
        ISDemandOnlyBannerListener a4 = a();
        a(new d(str, a4), a4 != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener a4 = a();
        a(new e(str, a4), a4 != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener a4 = a();
        a(new b(str, a4), a4 != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener a4 = a();
        a(new c(str, a4), a4 != null);
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener a4 = a();
        a(new a(str, ironSourceError, a4), a4 != null);
    }
}
