package com.yandex.div.core.view2.divs;

import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.InterfaceC0752c3;
import android.view.View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindAlignment$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindAlignment$callback$1(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_bindAlignment = view;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m76invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m76invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        View view = this.$this_bindAlignment;
        Expression l4 = this.$newDiv.l();
        EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(this.$resolver) : null;
        Expression s4 = this.$newDiv.s();
        BaseDivViewExtensionsKt.applyAlignment(view, enumC1091v2, s4 != null ? (EnumC1109w2) s4.evaluate(this.$resolver) : null);
    }
}
