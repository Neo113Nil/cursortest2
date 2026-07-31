package com.yandex.div.evaluable;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class Function {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Function STUB = new Function() { // from class: com.yandex.div.evaluable.Function$Companion$STUB$1

        @NotNull
        private final String name = "stub";

        @NotNull
        private final List<FunctionArgument> declaredArgs = CollectionsKt.emptyList();

        @NotNull
        private final EvaluableType resultType = EvaluableType.BOOLEAN;
        private final boolean isPure = true;

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        /* renamed from: evaluate-ex6DHhM */
        protected Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
            Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
            Intrinsics.checkNotNullParameter(args, "args");
            return Boolean.TRUE;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        public List<FunctionArgument> getDeclaredArgs() {
            return this.declaredArgs;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        public EvaluableType getResultType() {
            return this.resultType;
        }

        @Override // com.yandex.div.evaluable.Function
        public boolean isPure() {
            return this.isPure;
        }
    };

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static abstract class MatchResult {

        @Metadata
        public static final class ArgCountMismatch extends MatchResult {
            private final int expected;

            public ArgCountMismatch(int i4) {
                super(null);
                this.expected = i4;
            }

            public final int getExpected() {
                return this.expected;
            }
        }

        @Metadata
        public static final class ArgTypeMismatch extends MatchResult {

            @NotNull
            private final EvaluableType actual;

            @NotNull
            private final EvaluableType expected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArgTypeMismatch(@NotNull EvaluableType expected, @NotNull EvaluableType actual) {
                super(null);
                Intrinsics.checkNotNullParameter(expected, "expected");
                Intrinsics.checkNotNullParameter(actual, "actual");
                this.expected = expected;
                this.actual = actual;
            }

            @NotNull
            public final EvaluableType getActual() {
                return this.actual;
            }

            @NotNull
            public final EvaluableType getExpected() {
                return this.expected;
            }
        }

        @Metadata
        public static final class Ok extends MatchResult {

            @NotNull
            public static final Ok INSTANCE = new Ok();

            private Ok() {
                super(null);
            }
        }

        public /* synthetic */ MatchResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MatchResult() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canCastTo(EvaluableType evaluableType, EvaluableType evaluableType2) {
        return evaluableType == EvaluableType.INTEGER && WhenMappings.$EnumSwitchMapping$0[evaluableType2.ordinal()] == 1;
    }

    private final MatchResult matchesArguments(List<? extends EvaluableType> list, Function2<? super EvaluableType, ? super EvaluableType, Boolean> function2) {
        int size = getDeclaredArgs().size();
        int size2 = getHasVarArg$div_evaluable() ? Integer.MAX_VALUE : getDeclaredArgs().size();
        if (list.size() < size || list.size() > size2) {
            return new MatchResult.ArgCountMismatch(size);
        }
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            EvaluableType type = getDeclaredArgs().get(g.g(i4, CollectionsKt.getLastIndex(getDeclaredArgs()))).getType();
            if (!((Boolean) function2.invoke(list.get(i4), type)).booleanValue()) {
                return new MatchResult.ArgTypeMismatch(type, list.get(i4));
            }
        }
        return MatchResult.Ok.INSTANCE;
    }

    @NotNull
    /* renamed from: evaluate-ex6DHhM */
    protected abstract Object mo34evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list);

    @NotNull
    public abstract List<FunctionArgument> getDeclaredArgs();

    public final boolean getHasVarArg$div_evaluable() {
        FunctionArgument functionArgument = (FunctionArgument) CollectionsKt.lastOrNull((List) getDeclaredArgs());
        if (functionArgument != null) {
            return functionArgument.isVariadic();
        }
        return false;
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract EvaluableType getResultType();

    @NotNull
    /* renamed from: invoke-ex6DHhM, reason: not valid java name */
    public final Object m171invokeex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object mo34evaluateex6DHhM = mo34evaluateex6DHhM(evaluationContext, expressionContext, args);
        EvaluableType.Companion companion = EvaluableType.Companion;
        boolean z4 = mo34evaluateex6DHhM instanceof Long;
        if (z4) {
            evaluableType = EvaluableType.INTEGER;
        } else if (mo34evaluateex6DHhM instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (mo34evaluateex6DHhM instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (mo34evaluateex6DHhM instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (mo34evaluateex6DHhM instanceof DateTime) {
            evaluableType = EvaluableType.DATETIME;
        } else if (mo34evaluateex6DHhM instanceof Color) {
            evaluableType = EvaluableType.COLOR;
        } else if (mo34evaluateex6DHhM instanceof Url) {
            evaluableType = EvaluableType.URL;
        } else if (mo34evaluateex6DHhM instanceof JSONObject) {
            evaluableType = EvaluableType.DICT;
        } else {
            if (!(mo34evaluateex6DHhM instanceof JSONArray)) {
                if (mo34evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find type for ");
                Intrinsics.checkNotNull(mo34evaluateex6DHhM);
                sb.append(mo34evaluateex6DHhM.getClass().getName());
                throw new EvaluableException(sb.toString(), null, 2, null);
            }
            evaluableType = EvaluableType.ARRAY;
        }
        if (evaluableType == getResultType()) {
            return mo34evaluateex6DHhM;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Function ");
        sb2.append(this);
        sb2.append(" returned ");
        if (z4) {
            evaluableType2 = EvaluableType.INTEGER;
        } else if (mo34evaluateex6DHhM instanceof Double) {
            evaluableType2 = EvaluableType.NUMBER;
        } else if (mo34evaluateex6DHhM instanceof Boolean) {
            evaluableType2 = EvaluableType.BOOLEAN;
        } else if (mo34evaluateex6DHhM instanceof String) {
            evaluableType2 = EvaluableType.STRING;
        } else if (mo34evaluateex6DHhM instanceof DateTime) {
            evaluableType2 = EvaluableType.DATETIME;
        } else if (mo34evaluateex6DHhM instanceof Color) {
            evaluableType2 = EvaluableType.COLOR;
        } else if (mo34evaluateex6DHhM instanceof Url) {
            evaluableType2 = EvaluableType.URL;
        } else if (mo34evaluateex6DHhM instanceof JSONObject) {
            evaluableType2 = EvaluableType.DICT;
        } else {
            if (!(mo34evaluateex6DHhM instanceof JSONArray)) {
                if (mo34evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to find type for ");
                Intrinsics.checkNotNull(mo34evaluateex6DHhM);
                sb3.append(mo34evaluateex6DHhM.getClass().getName());
                throw new EvaluableException(sb3.toString(), null, 2, null);
            }
            evaluableType2 = EvaluableType.ARRAY;
        }
        sb2.append(evaluableType2);
        sb2.append(", but ");
        sb2.append(getResultType());
        sb2.append(" was expected.");
        throw new EvaluableException(sb2.toString(), null, 2, null);
    }

    public abstract boolean isPure();

    @NotNull
    public final MatchResult matchesArguments$div_evaluable(@NotNull List<? extends EvaluableType> argTypes) {
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        return matchesArguments(argTypes, Function$matchesArguments$1.INSTANCE);
    }

    @NotNull
    public final MatchResult matchesArgumentsWithCast$div_evaluable(@NotNull List<? extends EvaluableType> argTypes) {
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        return matchesArguments(argTypes, new Function$matchesArgumentsWithCast$1(this));
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(getDeclaredArgs(), null, getName() + '(', ")", 0, null, Function$toString$1.INSTANCE, 25, null);
    }
}
