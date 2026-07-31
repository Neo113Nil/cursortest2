package com.yandex.div.core.view2.divs;

import O1.InterfaceC0752c3;
import O1.R3;
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
final class DivContainerBinder$bindChildAlignment$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ ExpressionResolver $childResolver;
    final /* synthetic */ InterfaceC0752c3 $newChildDiv;
    final /* synthetic */ R3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindChildAlignment;
    final /* synthetic */ DivContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivContainerBinder$bindChildAlignment$callback$1(DivContainerBinder divContainerBinder, View view, R3 r32, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        super(1);
        this.this$0 = divContainerBinder;
        this.$this_bindChildAlignment = view;
        this.$newDiv = r32;
        this.$newChildDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
        this.$childResolver = expressionResolver2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m93invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m93invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyChildAlignment(this.$this_bindChildAlignment, this.$newDiv, this.$newChildDiv, this.$resolver, this.$childResolver);
    }
}
