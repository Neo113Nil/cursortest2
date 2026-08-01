package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x extends f1.w {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f971q = 0;

    public /* synthetic */ x(Context context) {
        super(context);
    }

    @Override // f1.w
    public int b(View view, int i) {
        switch (this.f971q) {
            case 1:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f1.w
    public int c(View view, int i) {
        switch (this.f971q) {
            case 1:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f1.w
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f971q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f1.w
    public PointF f(int i) {
        switch (this.f971q) {
            case 1:
                return null;
            default:
                return super.f(i);
        }
    }

    public x(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
