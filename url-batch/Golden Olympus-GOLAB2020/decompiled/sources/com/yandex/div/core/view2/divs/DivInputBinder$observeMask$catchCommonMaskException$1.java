package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeMask$catchCommonMaskException$1 extends s implements Function2<Exception, Function0<? extends Unit>, Unit> {
    final /* synthetic */ ErrorCollector $errorCollector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeMask$catchCommonMaskException$1(ErrorCollector errorCollector) {
        super(2);
        this.$errorCollector = errorCollector;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Exception) obj, (Function0<Unit>) obj2);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Exception exception, @NotNull Function0<Unit> other) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(exception instanceof PatternSyntaxException)) {
            other.invoke();
            return;
        }
        this.$errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exception).getPattern() + "'."));
    }
}
