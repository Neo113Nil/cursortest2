package com.yandex.div.core.expression.variables;

import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class TwoWayVariableBinder$bindVariable$2 extends s implements Function1<Variable, Unit> {
    final /* synthetic */ TwoWayVariableBinder.Callbacks<T> $callbacks;
    final /* synthetic */ G $pendingValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TwoWayVariableBinder$bindVariable$2(G g4, TwoWayVariableBinder.Callbacks<T> callbacks) {
        super(1);
        this.$pendingValue = g4;
        this.$callbacks = callbacks;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Variable changed) {
        Intrinsics.checkNotNullParameter(changed, "changed");
        Object value = changed.getValue();
        if (value == null) {
            value = null;
        }
        if (Intrinsics.areEqual(this.$pendingValue.f41132b, value)) {
            return;
        }
        this.$pendingValue.f41132b = value;
        this.$callbacks.onVariableChanged(value);
    }
}
