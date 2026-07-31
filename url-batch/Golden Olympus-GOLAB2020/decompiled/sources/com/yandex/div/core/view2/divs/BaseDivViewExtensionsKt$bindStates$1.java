package com.yandex.div.core.view2.divs;

import O1.Z;
import android.view.View;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class BaseDivViewExtensionsKt$bindStates$1 extends s implements Function1<View, Boolean> {
    final /* synthetic */ DivBinder $binder;
    final /* synthetic */ BindingContext $bindingContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDivViewExtensionsKt$bindStates$1(DivBinder divBinder, BindingContext bindingContext) {
        super(1);
        this.$binder = divBinder;
        this.$bindingContext = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull View currentView) {
        DivStatePath path;
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        if (!(currentView instanceof DivStateLayout)) {
            return Boolean.TRUE;
        }
        DivStateLayout divStateLayout = (DivStateLayout) currentView;
        Z.o div = divStateLayout.getDiv();
        if (div != null && (path = divStateLayout.getPath()) != null) {
            this.$binder.bind(this.$bindingContext, currentView, div, path.parentState());
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
