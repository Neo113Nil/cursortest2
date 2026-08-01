package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y extends b1.x {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1341q = 0;

    public /* synthetic */ y(Context context) {
        super(context);
    }

    @Override // b1.x
    public int b(View view, int i4) {
        switch (this.f1341q) {
            case 1:
                return 0;
            default:
                return super.b(view, i4);
        }
    }

    @Override // b1.x
    public int c(View view, int i4) {
        switch (this.f1341q) {
            case 1:
                return 0;
            default:
                return super.c(view, i4);
        }
    }

    @Override // b1.x
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1341q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // b1.x
    public PointF f(int i4) {
        switch (this.f1341q) {
            case 1:
                return null;
            default:
                return super.f(i4);
        }
    }

    public y(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
