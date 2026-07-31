package a1;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.gates.olympus.miruv.R;
import java.util.WeakHashMap;
import r.RunnableC0789A;

/* renamed from: a1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0179q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3561a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, RunnableC0789A runnableC0789A) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(runnableC0789A != null ? new C0159A(runnableC0789A) : null);
            return;
        }
        PathInterpolator pathInterpolator = z.f3576d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (runnableC0789A == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener yVar = new y(view, runnableC0789A);
        view.setTag(R.id.tag_window_insets_animation_callback, yVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(yVar);
        }
    }
}
