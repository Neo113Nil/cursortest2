package com.yandex.div.core.expression.variables;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivVariableController$requestsObserver$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ DivVariableController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVariableController$requestsObserver$1(DivVariableController divVariableController) {
        super(1);
        this.this$0 = divVariableController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String variableName) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        concurrentLinkedQueue = this.this$0.externalVariableRequestObservers;
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(variableName);
        }
    }
}
