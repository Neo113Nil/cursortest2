package B0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import f0.C0115v;
import f0.C0117x;
import f0.Q;

/* loaded from: classes.dex */
public final class c extends C0115v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f83q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f84r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Context context, int i) {
        super(context);
        this.f83q = i;
        this.f84r = obj;
    }

    @Override // f0.C0115v
    public int b(View view, int i) {
        switch (this.f83q) {
            case 0:
                ((CarouselLayoutManager) this.f84r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f0.C0115v
    public int c(View view, int i) {
        switch (this.f83q) {
            case 0:
                ((CarouselLayoutManager) this.f84r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f0.C0115v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f83q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f0.C0115v
    public int e(int i) {
        switch (this.f83q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // f0.C0115v
    public PointF f(int i) {
        switch (this.f83q) {
            case 0:
                ((CarouselLayoutManager) this.f84r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // f0.C0115v
    public void h(View view, Q q2) {
        switch (this.f83q) {
            case 1:
                C0117x c0117x = (C0117x) this.f84r;
                int[] a2 = c0117x.a(c0117x.f2364a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2357j;
                    q2.f2169a = i;
                    q2.f2170b = i2;
                    q2.f2171c = ceil;
                    q2.f2172e = decelerateInterpolator;
                    q2.f2173f = true;
                    break;
                }
                break;
            default:
                super.h(view, q2);
                break;
        }
    }
}
