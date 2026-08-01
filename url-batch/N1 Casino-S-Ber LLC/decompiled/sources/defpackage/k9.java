package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class k9 extends jq {
    public final /* synthetic */ int q = 1;

    public /* synthetic */ k9(Context context) {
        super(context);
    }

    @Override // defpackage.jq
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.jq
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.jq
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.jq
    public PointF f(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.f(i);
        }
    }

    public k9(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
