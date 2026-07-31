package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class StringFunctionsKt {
    @NotNull
    /* renamed from: buildRepeatableString-zb-MA7A, reason: not valid java name */
    public static final String m180buildRepeatableStringzbMA7A(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, int i4, @NotNull String repeatable) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(repeatable, "repeatable");
        if (repeatable.length() == 0 || i4 <= 0) {
            if (repeatable.length() != 0) {
                return "";
            }
            evaluationContext.getWarningSender().mo33sendBIH1yYw(expressionContext, "String for padding is empty.");
            return "";
        }
        StringBuilder sb = new StringBuilder(i4);
        Iterator it = g.p(0, i4).iterator();
        while (it.hasNext()) {
            sb.append(repeatable.charAt(((E) it).a() % repeatable.length()));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }
}
