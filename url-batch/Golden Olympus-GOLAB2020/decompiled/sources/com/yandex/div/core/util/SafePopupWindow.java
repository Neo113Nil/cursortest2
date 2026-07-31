package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SafePopupWindow extends PopupWindow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafePopupWindow(@NotNull View contentView, int i4, int i5, boolean z4) {
        super(contentView, i4, i5, z4);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@Nullable View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
