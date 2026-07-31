package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1809ai<T extends View> implements InterfaceC2183qd<T> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2183qd
    public final void a(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2183qd
    public final void cancel() {
    }
}
