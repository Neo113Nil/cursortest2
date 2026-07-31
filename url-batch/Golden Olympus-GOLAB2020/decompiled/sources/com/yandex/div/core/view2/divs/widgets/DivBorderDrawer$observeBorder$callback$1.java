package com.yandex.div.core.view2.divs.widgets;

import O1.C0860i3;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBorderDrawer$observeBorder$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C0860i3 $border;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivBorderDrawer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBorderDrawer$observeBorder$callback$1(DivBorderDrawer divBorderDrawer, C0860i3 c0860i3, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divBorderDrawer;
        this.$border = c0860i3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m159invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m159invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyBorder(this.$border, this.$resolver);
        this.this$0.view.invalidate();
    }
}
