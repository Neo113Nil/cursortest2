package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.animation.Animation;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final j f3376a;

    /* renamed from: b, reason: collision with root package name */
    private final p f3377b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdView f3378c;

    public u(MaxAdView maxAdView, j jVar) {
        this.f3376a = jVar;
        this.f3377b = jVar.u();
        this.f3378c = maxAdView;
    }

    public long a(com.applovin.impl.mediation.a.b bVar) {
        long j;
        this.f3377b.a("ViewabilityTracker", "Checking visibility...");
        if (this.f3378c.isShown()) {
            j = 0;
        } else {
            this.f3377b.d("ViewabilityTracker", "View is hidden");
            j = 2;
        }
        if (this.f3378c.getAlpha() < bVar.n()) {
            this.f3377b.d("ViewabilityTracker", "View is transparent");
            j |= 4;
        }
        Animation animation = this.f3378c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            this.f3377b.d("ViewabilityTracker", "View is animating");
            j |= 8;
        }
        if (this.f3378c.getParent() == null) {
            this.f3377b.d("ViewabilityTracker", "No parent view found");
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f3378c.getContext(), this.f3378c.getWidth());
        if (pxToDp < bVar.l()) {
            this.f3377b.d("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f3378c.getContext(), this.f3378c.getHeight());
        if (pxToDp2 < bVar.m()) {
            this.f3377b.d("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            j |= 64;
        }
        Point a2 = com.applovin.impl.sdk.e.d.a(this.f3378c.getContext());
        Rect rect = new Rect(0, 0, a2.x, a2.y);
        int[] iArr = {-1, -1};
        this.f3378c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f3378c.getWidth(), iArr[1] + this.f3378c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            this.f3377b.d("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            j |= 128;
        }
        Activity a3 = this.f3376a.S().a();
        if (a3 != null && !com.applovin.impl.sdk.e.l.a(this.f3378c, a3)) {
            this.f3377b.d("ViewabilityTracker", "View is not in top activity's view hierarchy");
            j |= 256;
        }
        this.f3377b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        return j;
    }
}
