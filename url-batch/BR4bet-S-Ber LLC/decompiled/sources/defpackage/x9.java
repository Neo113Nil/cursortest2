package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class x9 extends xs {
    public final /* synthetic */ int q = 1;

    public /* synthetic */ x9(Context context) {
        super(context);
    }

    @Override // defpackage.xs
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.xs
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.xs
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.xs
    public PointF f(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.f(i);
        }
    }

    public x9(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
