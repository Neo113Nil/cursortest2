package com.yandex.div.core.tooltip;

import O1.Z;
import androidx.activity.v;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.BindingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class TooltipData {

    @NotNull
    private final BindingContext bindingContext;
    private boolean dismissed;

    @NotNull
    private final Z div;

    @NotNull
    private final String id;

    @Nullable
    private final v onBackPressedCallback;

    @NotNull
    private final SafePopupWindow popupWindow;

    @Nullable
    private DivPreloader.Ticket ticket;

    public TooltipData(@NotNull String id, @NotNull BindingContext bindingContext, @NotNull Z div, @NotNull SafePopupWindow popupWindow, @Nullable DivPreloader.Ticket ticket, @Nullable v vVar, boolean z4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(popupWindow, "popupWindow");
        this.id = id;
        this.bindingContext = bindingContext;
        this.div = div;
        this.popupWindow = popupWindow;
        this.ticket = ticket;
        this.onBackPressedCallback = vVar;
        this.dismissed = z4;
    }

    @NotNull
    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    @NotNull
    public final Z getDiv() {
        return this.div;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final v getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @NotNull
    public final SafePopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    @Nullable
    public final DivPreloader.Ticket getTicket() {
        return this.ticket;
    }

    public final void setDismissed(boolean z4) {
        this.dismissed = z4;
    }

    public final void setTicket(@Nullable DivPreloader.Ticket ticket) {
        this.ticket = ticket;
    }

    public /* synthetic */ TooltipData(String str, BindingContext bindingContext, Z z4, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, v vVar, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bindingContext, z4, safePopupWindow, (i4 & 16) != 0 ? null : ticket, vVar, (i4 & 64) != 0 ? false : z5);
    }
}
