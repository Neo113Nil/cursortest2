package i0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final k f4403a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f4404b;

    public j(k sidecarCompat, Activity activity) {
        kotlin.jvm.internal.i.e(sidecarCompat, "sidecarCompat");
        this.f4403a = sidecarCompat;
        this.f4404b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        kotlin.jvm.internal.i.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f4404b.get();
        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (activity == null || iBinder == null) {
            return;
        }
        this.f4403a.c(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.i.e(view, "view");
    }
}
