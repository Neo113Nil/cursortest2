package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c8 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference f;
    public final WeakReference g;

    public c8(y50 y50Var, View view) {
        this.f = new WeakReference(y50Var);
        this.g = new WeakReference(view);
    }

    public final void a() {
        WeakReference weakReference = this.g;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.f.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.f;
        if (weakReference.get() == null) {
            a();
            return;
        }
        f8 f8Var = (f8) weakReference.get();
        hl hlVar = f8.v;
        f8Var.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
