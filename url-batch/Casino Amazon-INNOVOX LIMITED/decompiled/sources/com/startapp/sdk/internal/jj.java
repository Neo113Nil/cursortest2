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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class jj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public NotDisplayedReason f293a;
    public JSONObject b;
    public com.startapp.sdk.ads.nativead.f c;
    public final Handler d;
    public final WeakReference e;
    public final Point f;
    public final ff g;
    public final BannerOptions h;
    public boolean i;

    public jj(View view, Point point, ff ffVar, BannerOptions bannerOptions) {
        this.f293a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.d = new Handler(Looper.getMainLooper());
        this.i = true;
        this.e = new WeakReference(view);
        this.f = point;
        this.g = ffVar;
        this.h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            ff ffVar = this.g;
            if (ffVar != null && (notDisplayedReason = this.f293a) != null) {
                ffVar.a(notDisplayedReason.toString(), this.b);
            }
            this.d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = ij.a((View) this.e.get(), this.f, this.h, atomicReference, false).d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f293a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f293a = notDisplayedReason2;
            this.b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        ff ffVar = this.g;
        return (ffVar == null || ffVar.j.get() != 0 || this.e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean b = b();
            if (b && this.i) {
                this.i = false;
                this.g.c();
            } else if (!b && !this.i) {
                this.i = true;
                this.g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f293a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public jj(WeakReference weakReference, ff ffVar, BannerOptions bannerOptions) {
        this.f293a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.d = new Handler(Looper.getMainLooper());
        this.i = true;
        this.e = weakReference;
        this.f = null;
        this.g = ffVar;
        this.h = bannerOptions;
    }
}
