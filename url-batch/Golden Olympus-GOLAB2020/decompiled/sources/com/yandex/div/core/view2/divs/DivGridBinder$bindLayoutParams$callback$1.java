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
final class DivGridBinder$bindLayoutParams$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ InterfaceC0752c3 $childDiv;
    final /* synthetic */ View $childView;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivGridBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGridBinder$bindLayoutParams$callback$1(DivGridBinder divGridBinder, View view, ExpressionResolver expressionResolver, InterfaceC0752c3 interfaceC0752c3) {
        super(1);
        this.this$0 = divGridBinder;
        this.$childView = view;
        this.$resolver = expressionResolver;
        this.$childDiv = interfaceC0752c3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m96invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m96invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyGridLayoutParams(this.$childView, this.$resolver, this.$childDiv);
    }
}
