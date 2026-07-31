package com.yandex.div.core.view2.divs;

import O1.EnumC0717a4;
import O1.R3;
import O1.Z3;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2 extends s implements Function1<Object, Unit> {
    final /* synthetic */ R3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivWrapLayout $this_bindProperties$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2(R3 r32, ExpressionResolver expressionResolver, DivWrapLayout divWrapLayout) {
        super(1);
        this.$newDiv = r32;
        this.$resolver = expressionResolver;
        this.$this_bindProperties$inlined = divWrapLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m86invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m86invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        Object evaluate = this.$newDiv.f4552o.evaluate(this.$resolver);
        this.$this_bindProperties$inlined.setGravity(BaseDivViewExtensionsKt.evaluateGravity((Z3) evaluate, (EnumC0717a4) this.$newDiv.f4553p.evaluate(this.$resolver)));
    }
}
