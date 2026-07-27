package a1;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.chicken.road.kedro.laqer.R;
import java.util.WeakHashMap;
import q.RunnableC1012P;

/* renamed from: a1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0404s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4892a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, RunnableC1012P runnableC1012P) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(runnableC1012P != null ? new C0365A(runnableC1012P) : null);
            return;
        }
        PathInterpolator pathInterpolator = C0411z.f4903d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (runnableC1012P == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0410y = new ViewOnApplyWindowInsetsListenerC0410y(view, runnableC1012P);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0410y);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0410y);
        }
    }
}
