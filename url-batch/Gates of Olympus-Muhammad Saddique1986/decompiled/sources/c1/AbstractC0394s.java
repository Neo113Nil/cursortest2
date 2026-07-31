package c1;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.gatesof.olympus.martu.marku.R;
import java.util.WeakHashMap;
import r.RunnableC0841C;

/* renamed from: c1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0394s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5610a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, RunnableC0841C runnableC0841C) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(runnableC0841C != null ? new C0376C(runnableC0841C) : null);
            return;
        }
        PathInterpolator pathInterpolator = C0375B.f5547d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (runnableC0841C == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0374A = new ViewOnApplyWindowInsetsListenerC0374A(view, runnableC0841C);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0374A);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0374A);
        }
    }
}
