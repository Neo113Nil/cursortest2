package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.local.RuntimeTree;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class RuntimeTree$removeRuntimeAndCleanup$1 extends s implements Function1<RuntimeTree.RuntimeNode, Unit> {
    final /* synthetic */ DivViewFacade $divView;
    final /* synthetic */ RuntimeTree this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuntimeTree$removeRuntimeAndCleanup$1(RuntimeTree runtimeTree, DivViewFacade divViewFacade) {
        super(1);
        this.this$0 = runtimeTree;
        this.$divView = divViewFacade;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RuntimeTree.RuntimeNode) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull RuntimeTree.RuntimeNode it) {
        Map map;
        Map map2;
        Intrinsics.checkNotNullParameter(it, "it");
        map = this.this$0.runtimesToNodes;
        map.remove(it.getRuntime());
        map2 = this.this$0.pathToNodes;
        map2.remove(it.getPath());
        if (it.getRuntime().getVariableController() instanceof VariableAndConstantController) {
            return;
        }
        it.getRuntime().cleanup$div_release(this.$divView);
    }
}
