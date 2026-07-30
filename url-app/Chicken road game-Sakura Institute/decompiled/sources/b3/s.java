package b3;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.android.installreferrer.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1365a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, q.a0 a0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(a0Var != null ? new c0(a0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = b0.f1311d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (a0Var == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener a0Var2 = new a0(view, a0Var);
        view.setTag(R.id.tag_window_insets_animation_callback, a0Var2);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(a0Var2);
        }
    }
}
