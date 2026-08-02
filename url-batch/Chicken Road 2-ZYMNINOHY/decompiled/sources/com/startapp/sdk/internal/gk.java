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
    public NotDisplayedReason f7025a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f7026b;

    /* renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.ads.nativead.f f7027c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7028d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f7029e;

    /* renamed from: f, reason: collision with root package name */
    public final Point f7030f;

    /* renamed from: g, reason: collision with root package name */
    public final xf f7031g;

    /* renamed from: h, reason: collision with root package name */
    public final BannerOptions f7032h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7033i;

    public gk(View view, Point point, xf xfVar, BannerOptions bannerOptions) {
        this.f7025a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f7028d = new Handler(Looper.getMainLooper());
        this.f7033i = true;
        this.f7029e = new WeakReference(view);
        this.f7030f = point;
        this.f7031g = xfVar;
        this.f7032h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            xf xfVar = this.f7031g;
            if (xfVar != null && (notDisplayedReason = this.f7025a) != null) {
                xfVar.a(notDisplayedReason.toString(), this.f7026b);
            }
            this.f7028d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = fk.a((View) this.f7029e.get(), this.f7030f, this.f7032h, atomicReference, false).f7166d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f7025a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f7025a = notDisplayedReason2;
            this.f7026b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        xf xfVar = this.f7031g;
        return (xfVar == null || xfVar.f7878j.get() != 0 || this.f7029e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean b4 = b();
            if (b4 && this.f7033i) {
                this.f7033i = false;
                this.f7031g.c();
            } else if (!b4 && !this.f7033i) {
                this.f7033i = true;
                this.f7031g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.f7027c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.f7028d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f7025a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public gk(WeakReference weakReference, xf xfVar, BannerOptions bannerOptions) {
        this.f7025a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f7028d = new Handler(Looper.getMainLooper());
        this.f7033i = true;
        this.f7029e = weakReference;
        this.f7030f = null;
        this.f7031g = xfVar;
        this.f7032h = bannerOptions;
    }
}
