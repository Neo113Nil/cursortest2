package o2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* renamed from: o2.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3311E {
    public static final Object a(Object obj, kotlin.coroutines.d dVar) {
        if (!(obj instanceof C3308B)) {
            return Result.m243constructorimpl(obj);
        }
        Result.Companion companion = Result.Companion;
        return Result.m243constructorimpl(ResultKt.createFailure(((C3308B) obj).f41962a));
    }

    public static final Object b(Object obj, Function1 function1) {
        Throwable d4 = Result.d(obj);
        return d4 == null ? function1 != null ? new C3309C(obj, function1) : obj : new C3308B(d4, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC3343n interfaceC3343n) {
        Throwable d4 = Result.d(obj);
        return d4 == null ? obj : new C3308B(d4, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            function1 = null;
        }
        return b(obj, function1);
    }
}
