package I0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b0.C0096a;
import com.winpower.neonfit.R;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f596g;

    /* renamed from: h, reason: collision with root package name */
    public final float f597h;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f596g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f597h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f581b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0096a(1));
        return animatorSet;
    }

    public final void b(float f2) {
        float interpolation = this.f580a.getInterpolation(f2);
        View view = this.f581b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f3 = this.f596g / width;
        float f4 = this.f597h / height;
        float a2 = 1.0f - AbstractC0389a.a(0.0f, f3, interpolation);
        float a3 = 1.0f - AbstractC0389a.a(0.0f, f4, interpolation);
        view.setScaleX(a2);
        view.setPivotY(height);
        view.setScaleY(a3);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a3 != 0.0f ? a2 / a3 : 1.0f);
            }
        }
    }
}
