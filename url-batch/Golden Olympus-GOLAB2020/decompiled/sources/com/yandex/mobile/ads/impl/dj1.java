package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dj1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private PopupWindow f24647a;

    public final void a() {
        PopupWindow popupWindow = this.f24647a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f24647a = null;
    }

    public final void a(@NotNull PopupWindow popup, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        a();
        this.f24647a = popup;
        popup.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.A1
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                dj1.a(dj1.this);
            }
        });
        popup.showAsDropDown(anchorView, 0, 0, 8388613);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dj1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f24647a = null;
    }
}
