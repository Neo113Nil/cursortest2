package com.withpersona.sdk2.inquiry.shared.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class OneShotPreDrawListenerWithDiscardedFrame implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final P5$$ExternalSyntheticLambda0 runnable;
    public final View view;
    public ViewTreeObserver viewTreeObserver;

    public OneShotPreDrawListenerWithDiscardedFrame(View view, P5$$ExternalSyntheticLambda0 p5$$ExternalSyntheticLambda0) {
        this.view = view;
        this.runnable = p5$$ExternalSyntheticLambda0;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.getClass();
        this.viewTreeObserver = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.viewTreeObserver.isAlive();
        View view = this.view;
        if (isAlive) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.runnable.run();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.getClass();
        this.viewTreeObserver = viewTreeObserver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        boolean isAlive = this.viewTreeObserver.isAlive();
        View view2 = this.view;
        if (isAlive) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
