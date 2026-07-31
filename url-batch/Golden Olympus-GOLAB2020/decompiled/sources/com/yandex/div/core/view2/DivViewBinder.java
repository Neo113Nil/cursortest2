package com.yandex.div.core.view2;

import O1.InterfaceC0752c3;
import O1.Z;
import android.view.View;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivViewBinder<TData extends Z, TDataValue extends InterfaceC0752c3, TView extends View> {

    @NotNull
    private final DivBaseBinder baseBinder;

    public DivViewBinder(@NotNull DivBaseBinder baseBinder) {
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        this.baseBinder = baseBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindViewInternal(BindingContext bindingContext, TView tview, TData tdata, DivStatePath divStatePath) {
        BindingContext bindingContext2;
        TView tview2;
        Unit unit;
        InterfaceC0752c3 interfaceC0752c3;
        DivViewBinder divViewBinder;
        DivStatePath divStatePath2;
        Intrinsics.checkNotNull(tview, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<TData of com.yandex.div.core.view2.DivViewBinder>");
        Z div = ((DivHolderView) tview).getDiv();
        if (tdata == div) {
            return;
        }
        this.baseBinder.bindView(bindingContext, tview, tdata, div);
        if (divStatePath != null) {
            InterfaceC0752c3 b4 = tdata.b();
            Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder.bindViewInternal$lambda$0");
            if (div != null) {
                interfaceC0752c3 = div.b();
                bindingContext2 = bindingContext;
                tview2 = tview;
                divStatePath2 = divStatePath;
                divViewBinder = this;
            } else {
                interfaceC0752c3 = null;
                divViewBinder = this;
                bindingContext2 = bindingContext;
                tview2 = tview;
                divStatePath2 = divStatePath;
            }
            divViewBinder.bind(tview2, bindingContext2, b4, interfaceC0752c3, divStatePath2);
            unit = Unit.f41027a;
        } else {
            bindingContext2 = bindingContext;
            tview2 = tview;
            unit = null;
        }
        if (unit == null) {
            InterfaceC0752c3 b5 = tdata.b();
            Intrinsics.checkNotNull(b5, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder");
            bind(tview2, bindingContext2, b5, div != null ? div.b() : null);
        }
    }

    protected void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue div, @Nullable TDataValue tdatavalue) {
        Intrinsics.checkNotNullParameter(tview, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
    }

    public void bindView(@NotNull BindingContext context, @NotNull TView view, @NotNull TData div) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        bindViewInternal(context, view, div, null);
    }

    protected void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue div, @Nullable TDataValue tdatavalue, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(tview, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        bind(tview, bindingContext, div, tdatavalue);
    }

    public void bindView(@NotNull BindingContext context, @NotNull TView view, @NotNull TData div, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        bindViewInternal(context, view, div, path);
    }
}
