package com.onesignal.inAppMessages.internal.display.impl;

import android.view.View;
import android.widget.PopupWindow;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.swmansion.rnscreens.gamma.stack.screen.event.StackScreenDismissEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OSPopupWindow.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/OSPopupWindow;", "Landroid/widget/PopupWindow;", "contentView", "Landroid/view/View;", ViewProps.WIDTH, "", ViewProps.HEIGHT, "focusable", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/inAppMessages/internal/display/impl/OSPopupWindow$PopupWindowListener;", "(Landroid/view/View;IIZLcom/onesignal/inAppMessages/internal/display/impl/OSPopupWindow$PopupWindowListener;)V", "wasDismissedManually", "getWasDismissedManually", "()Ljava/lang/Boolean;", "setWasDismissedManually", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "dismiss", "", "PopupWindowListener", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OSPopupWindow extends PopupWindow {
    private final PopupWindowListener listener;
    private Boolean wasDismissedManually;

    /* compiled from: OSPopupWindow.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/OSPopupWindow$PopupWindowListener;", "", StackScreenDismissEvent.EVENT_REGISTRATION_NAME, "", "wasDismissedManually", "", "(Ljava/lang/Boolean;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PopupWindowListener {
        void onDismiss(Boolean wasDismissedManually);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSPopupWindow(View view, int i, int i2, boolean z, PopupWindowListener listener) {
        super(view, i, i2, z);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final Boolean getWasDismissedManually() {
        return this.wasDismissedManually;
    }

    public final void setWasDismissedManually(Boolean bool) {
        this.wasDismissedManually = bool;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.listener.onDismiss(this.wasDismissedManually);
    }
}
