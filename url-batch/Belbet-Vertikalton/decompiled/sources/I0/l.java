package I0;

import M.P;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.winpower.neonfit.R;
import java.util.WeakHashMap;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f601g;

    /* renamed from: h, reason: collision with root package name */
    public final float f602h;
    public final float i;

    public l(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f601g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f602h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f2, boolean z2, int i) {
        float interpolation = this.f580a.getInterpolation(f2);
        WeakHashMap weakHashMap = P.f711a;
        View view = this.f581b;
        boolean z3 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z4 = z2 == z3;
        int width = view.getWidth();
        int height = view.getHeight();
        float f3 = width;
        if (f3 > 0.0f) {
            float f4 = height;
            if (f4 <= 0.0f) {
                return;
            }
            float f5 = this.f601g / f3;
            float f6 = this.f602h / f3;
            float f7 = this.i / f4;
            if (z3) {
                f3 = 0.0f;
            }
            view.setPivotX(f3);
            if (!z4) {
                f6 = -f5;
            }
            float a2 = AbstractC0389a.a(0.0f, f6, interpolation);
            float f8 = a2 + 1.0f;
            view.setScaleX(f8);
            float a3 = 1.0f - AbstractC0389a.a(0.0f, f7, interpolation);
            view.setScaleY(a3);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z3 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f9 = z4 ? 1.0f - a2 : 1.0f;
                    float f10 = a3 != 0.0f ? (f8 / a3) * f9 : 1.0f;
                    childAt.setScaleX(f9);
                    childAt.setScaleY(f10);
                }
            }
        }
    }
}
