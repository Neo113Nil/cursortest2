package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Evaluable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Evaluator$evalBinary$1 extends s implements Function0<Object> {
    final /* synthetic */ Evaluable.Binary $binary;
    final /* synthetic */ Evaluator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Evaluator$evalBinary$1(Evaluator evaluator, Evaluable.Binary binary) {
        super(0);
        this.this$0 = evaluator;
        this.$binary = binary;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Object invoke() {
        Object eval = this.this$0.eval(this.$binary.getRight());
        Evaluable.Binary binary = this.$binary;
        binary.updateIsCacheable$div_evaluable(binary.getRight().checkIsCacheable());
        return eval;
    }
}
