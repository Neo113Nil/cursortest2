package com.onesignal.inAppMessages.internal.display.impl;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends PopupWindow {
    private final g listener;
    private Boolean wasDismissedManually;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, int i2, int i5, boolean z7, g listener) {
        super(view, i2, i5, z7);
        Intrinsics.checkNotNullParameter(listener, "listener");
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
