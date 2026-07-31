package u2;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t2.AbstractC3441l;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3458a {
    private static final void a(d dVar, Throwable th) {
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        try {
            d c4 = AbstractC1241b.c(dVar);
            Result.Companion companion = Result.Companion;
            AbstractC3441l.c(c4, Result.m243constructorimpl(Unit.f41027a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(Function2 function2, Object obj, d dVar, Function1 function1) {
        try {
            d c4 = AbstractC1241b.c(AbstractC1241b.a(function2, obj, dVar));
            Result.Companion companion = Result.Companion;
            AbstractC3441l.b(c4, Result.m243constructorimpl(Unit.f41027a), function1);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(Function2 function2, Object obj, d dVar, Function1 function1, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        c(function2, obj, dVar, function1);
    }
}
