package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.local.RuntimeTree;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivRuntimeVisitor$visitChild$1 extends s implements Function1<RuntimeTree.RuntimeNode, Unit> {
    final /* synthetic */ Div2View $divView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivRuntimeVisitor$visitChild$1(Div2View div2View) {
        super(1);
        this.$divView = div2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RuntimeTree.RuntimeNode) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull RuntimeTree.RuntimeNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.getRuntime().clearBinding(this.$divView);
    }
}
