package com.yandex.div.core.tooltip;

import android.view.View;
import com.yandex.div.core.util.SafePopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public /* synthetic */ DivTooltipWindow(View view, int i4, int i5, boolean z4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i6 & 2) != 0 ? 0 : i4, (i6 & 4) != 0 ? 0 : i5, (i6 & 8) != 0 ? false : z4);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTooltipWindow(@NotNull View contentView, int i4, int i5, boolean z4) {
        super(contentView, i4, i5, z4);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
    }
}
