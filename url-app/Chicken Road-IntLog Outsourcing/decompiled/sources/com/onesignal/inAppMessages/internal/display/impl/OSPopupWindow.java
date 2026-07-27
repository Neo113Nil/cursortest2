package com.onesignal.inAppMessages.internal.display.impl;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OSPopupWindow extends PopupWindow {
    private final PopupWindowListener listener;
    private Boolean wasDismissedManually;

    public interface PopupWindowListener {
        void onDismiss(Boolean bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSPopupWindow(View view, int i2, int i3, boolean z, PopupWindowListener listener) {
        super(view, i2, i3, z);
        i.e(listener, "listener");
        this.listener = listener;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.listener.onDismiss(this.wasDismissedManually);
    }

    public final Boolean getWasDismissedManually() {
        return this.wasDismissedManually;
    }

    public final void setWasDismissedManually(Boolean bool) {
        this.wasDismissedManually = bool;
    }
}
