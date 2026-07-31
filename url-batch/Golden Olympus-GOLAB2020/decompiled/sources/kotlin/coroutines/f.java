package kotlin.coroutines;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final void a(Function2 function2, Object obj, d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        d c4 = AbstractC1241b.c(AbstractC1241b.a(function2, obj, completion));
        Result.Companion companion = Result.Companion;
        c4.resumeWith(Result.m243constructorimpl(Unit.f41027a));
    }
}
