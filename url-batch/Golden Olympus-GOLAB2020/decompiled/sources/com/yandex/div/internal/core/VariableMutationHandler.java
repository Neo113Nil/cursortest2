package com.yandex.div.internal.core;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class VariableMutationHandler {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final VariableMutationException createAndReportError(Throwable th, Div2View div2View, String str) {
            VariableMutationException variableMutationException = new VariableMutationException(str, th);
            DivActionTypedUtilsKt.logError(div2View, variableMutationException);
            return variableMutationException;
        }

        private final Variable findVariable(String str, ExpressionResolver expressionResolver) {
            VariableController variableController = UtilsKt.getVariableController(expressionResolver);
            if (variableController != null) {
                return variableController.getMutableVariable(str);
            }
            return null;
        }

        @Nullable
        public final VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String name, @NotNull String value, @NotNull ExpressionResolver resolver) {
            Object m243constructorimpl;
            Intrinsics.checkNotNullParameter(div2View, "div2View");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Variable findVariable = findVariable(name, resolver);
            if (findVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + name + "' not defined!");
            }
            try {
                Result.Companion companion = Result.Companion;
                findVariable.set(value);
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(d4, div2View, "Variable '" + name + "' mutation failed!");
        }

        private Companion() {
        }

        @Nullable
        public final <T extends Variable> VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String name, @NotNull ExpressionResolver resolver, @NotNull Function1<? super T, ? extends T> valueMutation) {
            Object m243constructorimpl;
            Intrinsics.checkNotNullParameter(div2View, "div2View");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(valueMutation, "valueMutation");
            Variable findVariable = findVariable(name, resolver);
            if (findVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + name + "' not defined!");
            }
            try {
                Result.Companion companion = Result.Companion;
                findVariable.setValue((Variable) valueMutation.invoke(findVariable));
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(d4, div2View, "Variable '" + name + "' mutation failed!");
        }
    }

    @Nullable
    public static final VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String str, @NotNull String str2, @NotNull ExpressionResolver expressionResolver) {
        return Companion.setVariable(div2View, str, str2, expressionResolver);
    }
}
