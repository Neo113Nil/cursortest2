package com.yandex.div.core.view2.divs;

import O1.C1060t7;
import android.view.KeyEvent;
import android.widget.TextView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeEnterTypeAndActions$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ C1060t7 $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeEnterTypeAndActions;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeEnterTypeAndActions$callback$1(C1060t7 c1060t7, ExpressionResolver expressionResolver, DivInputView divInputView, DivInputBinder divInputBinder, BindingContext bindingContext) {
        super(1);
        this.$div = c1060t7;
        this.$resolver = expressionResolver;
        this.$this_observeEnterTypeAndActions = divInputView;
        this.this$0 = divInputBinder;
        this.$bindingContext = bindingContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(DivInputBinder this$0, BindingContext bindingContext, DivInputView this_observeEnterTypeAndActions, List list, TextView textView, int i4, KeyEvent keyEvent) {
        DivActionBinder divActionBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindingContext, "$bindingContext");
        Intrinsics.checkNotNullParameter(this_observeEnterTypeAndActions, "$this_observeEnterTypeAndActions");
        if ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
            return false;
        }
        divActionBinder = this$0.actionBinder;
        divActionBinder.handleBulkActions$div_release(bindingContext, this_observeEnterTypeAndActions, list, "enter");
        return false;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m103invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m103invoke(@NotNull Object obj) {
        int imeAction;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        C1060t7.d dVar = (C1060t7.d) this.$div.f8044l.evaluate(this.$resolver);
        DivInputView divInputView = this.$this_observeEnterTypeAndActions;
        int imeOptions = divInputView.getImeOptions();
        imeAction = this.this$0.getImeAction(dVar);
        divInputView.setImeOptions(imeOptions + imeAction);
        final List list = this.$div.f8043k;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.$this_observeEnterTypeAndActions.setOnEditorActionListener(null);
            return;
        }
        final DivInputView divInputView2 = this.$this_observeEnterTypeAndActions;
        final DivInputBinder divInputBinder = this.this$0;
        final BindingContext bindingContext = this.$bindingContext;
        divInputView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.divs.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean invoke$lambda$0;
                invoke$lambda$0 = DivInputBinder$observeEnterTypeAndActions$callback$1.invoke$lambda$0(DivInputBinder.this, bindingContext, divInputView2, list, textView, i4, keyEvent);
                return invoke$lambda$0;
            }
        });
    }
}
