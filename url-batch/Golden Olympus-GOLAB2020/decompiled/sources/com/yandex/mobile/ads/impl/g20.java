package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b10 f25980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f20 f25981b;

    public g20(@NotNull b10 contentCloseListener, @NotNull d20 actionHandler, @NotNull f20 binder) {
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f25980a = contentCloseListener;
        this.f25981b = binder;
    }

    public final void a(@NotNull Context context, @NotNull c20 action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Div2View a4 = this.f25981b.a(context, action);
        Dialog dialog = new Dialog(a4.getContext(), R.style.MonetizationAdsInternal_FullscreenDialog);
        this.f25980a.a(dialog);
        dialog.setContentView(a4);
        dialog.show();
    }
}
