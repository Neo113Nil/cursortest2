package com.yandex.div.core.view2.divs;

import O1.C0887jd;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSwitchBinder$bindIsEnabled$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C0887jd $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSwitchView $this_bindIsEnabled;
    final /* synthetic */ DivSwitchBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSwitchBinder$bindIsEnabled$callback$1(DivSwitchBinder divSwitchBinder, DivSwitchView divSwitchView, C0887jd c0887jd, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divSwitchBinder;
        this.$this_bindIsEnabled = divSwitchView;
        this.$div = c0887jd;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m130invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m130invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyIsEnabled(this.$this_bindIsEnabled, this.$div, this.$resolver);
    }
}
