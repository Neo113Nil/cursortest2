package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fg1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewTreeObserver OPXfSBeufaJ8;
    public final View rtx2ld2ELZv4;
    public final Runnable wdg6QnbFHrFF;

    public fg1(View view, Runnable runnable) {
        this.rtx2ld2ELZv4 = view;
        this.OPXfSBeufaJ8 = view.getViewTreeObserver();
        this.wdg6QnbFHrFF = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.OPXfSBeufaJ8.isAlive();
        View view = this.rtx2ld2ELZv4;
        if (isAlive) {
            this.OPXfSBeufaJ8.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.wdg6QnbFHrFF.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.OPXfSBeufaJ8 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.OPXfSBeufaJ8.isAlive();
        View view2 = this.rtx2ld2ELZv4;
        if (isAlive) {
            this.OPXfSBeufaJ8.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
