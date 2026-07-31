package com.yandex.div.core.view2.backbutton;

import android.view.KeyEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BackKeyPressedHelper {

    @Nullable
    private OnBackClickListener mOnBackClickListener;

    @NotNull
    private final View mOwnerView;

    @Metadata
    public interface OnBackClickListener {
        boolean onBackClick();
    }

    public BackKeyPressedHelper(@NotNull View mOwnerView) {
        Intrinsics.checkNotNullParameter(mOwnerView, "mOwnerView");
        this.mOwnerView = mOwnerView;
    }

    private final void setupFocus() {
        View rootView;
        if (this.mOnBackClickListener == null || !this.mOwnerView.hasWindowFocus()) {
            return;
        }
        View view = this.mOwnerView;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (view.isShown()) {
            view.requestFocus();
        } else {
            if (!view.hasFocus() || (rootView = view.getRootView()) == null) {
                return;
            }
            rootView.requestFocus(33);
        }
    }

    public final boolean onKeyAction(int i4, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.mOnBackClickListener == null || i4 != 4) {
            return false;
        }
        if (event.getAction() == 0 && event.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = this.mOwnerView.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(event, this);
            }
            return true;
        }
        if (event.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = this.mOwnerView.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(event);
        }
        if (!event.isTracking() || event.isCanceled()) {
            return false;
        }
        OnBackClickListener onBackClickListener = this.mOnBackClickListener;
        Intrinsics.checkNotNull(onBackClickListener);
        return onBackClickListener.onBackClick();
    }

    public final void onVisibilityChanged() {
        setupFocus();
    }

    public final void onWindowFocusChanged(boolean z4) {
        if (z4) {
            setupFocus();
        }
    }

    public final void setOnBackClickListener(@Nullable OnBackClickListener onBackClickListener) {
        this.mOnBackClickListener = onBackClickListener;
        setupFocus();
    }
}
