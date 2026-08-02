package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public NotDisplayedReason f3902a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f3903b;

    /* renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.ads.nativead.f f3904c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3905d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3906e;
    public final Point f;

    /* renamed from: g, reason: collision with root package name */
    public final xf f3907g;

    /* renamed from: h, reason: collision with root package name */
    public final BannerOptions f3908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3909i;

    public gk(View view, Point point, xf xfVar, BannerOptions bannerOptions) {
        this.f3902a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f3905d = new Handler(Looper.getMainLooper());
        this.f3909i = true;
        this.f3906e = new WeakReference(view);
        this.f = point;
        this.f3907g = xfVar;
        this.f3908h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            xf xfVar = this.f3907g;
            if (xfVar != null && (notDisplayedReason = this.f3902a) != null) {
                xfVar.a(notDisplayedReason.toString(), this.f3903b);
            }
            this.f3905d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = fk.a((View) this.f3906e.get(), this.f, this.f3908h, atomicReference, false).f4038d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f3902a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f3902a = notDisplayedReason2;
            this.f3903b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        xf xfVar = this.f3907g;
        return (xfVar == null || xfVar.f4731j.get() != 0 || this.f3906e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean b3 = b();
            if (b3 && this.f3909i) {
                this.f3909i = false;
                this.f3907g.c();
            } else if (!b3 && !this.f3909i) {
                this.f3909i = true;
                this.f3907g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.f3904c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.f3905d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f3902a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public gk(WeakReference weakReference, xf xfVar, BannerOptions bannerOptions) {
        this.f3902a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f3905d = new Handler(Looper.getMainLooper());
        this.f3909i = true;
        this.f3906e = weakReference;
        this.f = null;
        this.f3907g = xfVar;
        this.f3908h = bannerOptions;
    }
}
