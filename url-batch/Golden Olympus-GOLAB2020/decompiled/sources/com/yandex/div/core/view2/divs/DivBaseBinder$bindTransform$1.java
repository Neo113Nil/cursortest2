package com.yandex.div.core.view2.divs;

import O1.InterfaceC0752c3;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindTransform$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindTransform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindTransform$1(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_bindTransform = view;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m80invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m80invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseDivViewExtensionsKt.applyTransform(this.$this_bindTransform, this.$newDiv.b(), this.$resolver);
    }
}
