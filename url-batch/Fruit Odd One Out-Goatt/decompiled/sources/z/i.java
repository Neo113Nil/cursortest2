package z;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f1258a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1259b;

    public i(j jVar, Activity activity) {
        jVar.getClass();
        this.f1258a = jVar;
        this.f1259b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f1259b.get();
        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (activity == null || iBinder == null) {
            return;
        }
        this.f1258a.c(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
