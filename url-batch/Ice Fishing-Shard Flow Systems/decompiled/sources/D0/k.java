package D0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.E;
import io.flutter.plugin.platform.F;
import io.flutter.plugin.platform.p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f333d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f334e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f335i;

    public k(View view, p pVar) {
        this.f334e = view;
        this.f335i = pVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f333d) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f335i).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((l) this.f334e).c(iBinder, activity);
                    break;
                }
                break;
            default:
                View view2 = (View) this.f334e;
                view2.getViewTreeObserver().addOnDrawListener(new F(view2, new E(0, this)));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f333d) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
        }
    }

    public k(l sidecarCompat, Activity activity) {
        Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f334e = sidecarCompat;
        this.f335i = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
