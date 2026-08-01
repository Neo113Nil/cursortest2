package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g0 extends g1.h0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1069q = 0;

    public /* synthetic */ g0(Context context) {
        super(context);
    }

    @Override // g1.h0
    public int b(View view, int i) {
        switch (this.f1069q) {
            case 1:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // g1.h0
    public int c(View view, int i) {
        switch (this.f1069q) {
            case 1:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // g1.h0
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1069q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // g1.h0
    public PointF f(int i) {
        switch (this.f1069q) {
            case 1:
                return null;
            default:
                return super.f(i);
        }
    }

    public g0(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
