package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$createPressTouchListener$1 extends s implements Function2<View, MotionEvent, Boolean> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ List<C0892k0> $pressEndActions;
    final /* synthetic */ List<C0892k0> $pressStartActions;
    final /* synthetic */ View $target;
    final /* synthetic */ DivActionBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$createPressTouchListener$1(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List<C0892k0> list, List<C0892k0> list2) {
        super(2);
        this.this$0 = divActionBinder;
        this.$context = bindingContext;
        this.$target = view;
        this.$pressStartActions = list;
        this.$pressEndActions = list2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        boolean z4 = true;
        if (action == 0) {
            this.this$0.handleBulkActions$div_release(this.$context, this.$target, this.$pressStartActions, "press");
        } else if (action == 1 || action == 3) {
            this.this$0.handleBulkActions$div_release(this.$context, this.$target, this.$pressEndActions, "release");
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
