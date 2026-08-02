package d0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.y;
import io.flutter.plugin.platform.z;
import java.lang.ref.WeakReference;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0180h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2045a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2046b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2047c;

    public ViewOnAttachStateChangeListenerC0180h(View view, m mVar) {
        this.f2046b = view;
        this.f2047c = mVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f2045a) {
            case 0:
                Q0.h.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f2047c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((C0181i) this.f2046b).g(iBinder, activity);
                    break;
                }
                break;
            default:
                y yVar = new y(0, this);
                View view2 = (View) this.f2046b;
                view2.getViewTreeObserver().addOnDrawListener(new z(view2, yVar));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f2045a) {
            case 0:
                Q0.h.e(view, "view");
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0180h(C0181i c0181i, Activity activity) {
        Q0.h.e(c0181i, "sidecarCompat");
        this.f2046b = c0181i;
        this.f2047c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
