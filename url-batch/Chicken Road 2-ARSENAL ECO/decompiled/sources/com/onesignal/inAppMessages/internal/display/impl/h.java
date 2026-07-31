package com.onesignal.inAppMessages.internal.display.impl;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class h extends PopupWindow {
    private final g listener;
    private Boolean wasDismissedManually;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, int i7, int i8, boolean z5, g listener) {
        super(view, i7, i8, z5);
        kotlin.jvm.internal.i.e(listener, "listener");
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
