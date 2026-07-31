package u2;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.M;
import o2.C3308B;
import o2.E0;
import o2.U0;
import t2.C3428C;
import t2.K;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3459b {
    public static final void a(Function2 function2, Object obj, d dVar) {
        d a4 = h.a(dVar);
        try {
            CoroutineContext context = dVar.getContext();
            Object c4 = K.c(context, null);
            try {
                Object e4 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC1241b.e(function2, obj, a4) : ((Function2) M.e(function2, 2)).invoke(obj, a4);
                K.a(context, c4);
                if (e4 != AbstractC1241b.f()) {
                    a4.resumeWith(Result.m243constructorimpl(e4));
                }
            } catch (Throwable th) {
                K.a(context, c4);
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion = Result.Companion;
            a4.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    public static final Object b(C3428C c3428c, Object obj, Function2 function2) {
        Object c3308b;
        try {
            c3308b = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC1241b.e(function2, obj, c3428c) : ((Function2) M.e(function2, 2)).invoke(obj, c3428c);
        } catch (Throwable th) {
            c3308b = new C3308B(th, false, 2, null);
        }
        if (c3308b == AbstractC1241b.f()) {
            return AbstractC1241b.f();
        }
        Object o02 = c3428c.o0(c3308b);
        if (o02 == E0.f41992b) {
            return AbstractC1241b.f();
        }
        if (o02 instanceof C3308B) {
            throw ((C3308B) o02).f41962a;
        }
        return E0.h(o02);
    }

    public static final Object c(C3428C c3428c, Object obj, Function2 function2) {
        Object c3308b;
        try {
            c3308b = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC1241b.e(function2, obj, c3428c) : ((Function2) M.e(function2, 2)).invoke(obj, c3428c);
        } catch (Throwable th) {
            c3308b = new C3308B(th, false, 2, null);
        }
        if (c3308b == AbstractC1241b.f()) {
            return AbstractC1241b.f();
        }
        Object o02 = c3428c.o0(c3308b);
        if (o02 == E0.f41992b) {
            return AbstractC1241b.f();
        }
        if (o02 instanceof C3308B) {
            Throwable th2 = ((C3308B) o02).f41962a;
            if (!(th2 instanceof U0)) {
                throw th2;
            }
            if (((U0) th2).f42026b != c3428c) {
                throw th2;
            }
            if (c3308b instanceof C3308B) {
                throw ((C3308B) c3308b).f41962a;
            }
        } else {
            c3308b = E0.h(o02);
        }
        return c3308b;
    }
}
