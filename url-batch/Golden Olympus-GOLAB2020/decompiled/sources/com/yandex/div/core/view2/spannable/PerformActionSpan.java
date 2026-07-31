package com.yandex.div.core.view2.spannable;

import O1.C0892k0;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivActionBinder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PerformActionSpan extends ClickableSpan {

    @NotNull
    private final List<C0892k0> actions;

    @NotNull
    private final BindingContext bindingContext;

    public PerformActionSpan(@NotNull BindingContext bindingContext, @NotNull List<C0892k0> actions) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.bindingContext = bindingContext;
        this.actions = actions;
    }

    private final DivActionBinder getActionBinder() {
        DivActionBinder actionBinder = this.bindingContext.getDivView().getDiv2Component$div_release().getActionBinder();
        Intrinsics.checkNotNullExpressionValue(actionBinder, "bindingContext.divView.div2Component.actionBinder");
        return actionBinder;
    }

    @NotNull
    public final List<C0892k0> getActions() {
        return this.actions;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getActionBinder().handleTapClick$div_release(this.bindingContext, view, this.actions);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
    }
}
