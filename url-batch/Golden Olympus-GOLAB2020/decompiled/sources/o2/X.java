package o2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import t2.C3440k;

/* loaded from: classes3.dex */
public abstract class X {
    public static final void a(W w4, int i4) {
        kotlin.coroutines.d b4 = w4.b();
        boolean z4 = i4 == 4;
        if (z4 || !(b4 instanceof C3440k) || b(i4) != b(w4.f42029d)) {
            d(w4, b4, z4);
            return;
        }
        AbstractC3313G abstractC3313G = ((C3440k) b4).f46232e;
        CoroutineContext context = b4.getContext();
        if (abstractC3313G.i(context)) {
            abstractC3313G.g(context, w4);
        } else {
            e(w4);
        }
    }

    public static final boolean b(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean c(int i4) {
        return i4 == 2;
    }

    public static final void d(W w4, kotlin.coroutines.d dVar, boolean z4) {
        Object e4;
        Object j4 = w4.j();
        Throwable c4 = w4.c(j4);
        if (c4 != null) {
            Result.Companion companion = Result.Companion;
            e4 = ResultKt.createFailure(c4);
        } else {
            Result.Companion companion2 = Result.Companion;
            e4 = w4.e(j4);
        }
        Object m243constructorimpl = Result.m243constructorimpl(e4);
        if (!z4) {
            dVar.resumeWith(m243constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C3440k c3440k = (C3440k) dVar;
        kotlin.coroutines.d dVar2 = c3440k.f46233f;
        Object obj = c3440k.f46235h;
        CoroutineContext context = dVar2.getContext();
        Object c5 = t2.K.c(context, obj);
        Y0 g4 = c5 != t2.K.f46209a ? AbstractC3312F.g(dVar2, context, c5) : null;
        try {
            c3440k.f46233f.resumeWith(m243constructorimpl);
            Unit unit = Unit.f41027a;
            if (g4 == null || g4.S0()) {
                t2.K.a(context, c5);
            }
        } catch (Throwable th) {
            if (g4 == null || g4.S0()) {
                t2.K.a(context, c5);
            }
            throw th;
        }
    }

    private static final void e(W w4) {
        AbstractC3328f0 b4 = T0.f42024a.b();
        if (b4.Z()) {
            b4.V(w4);
            return;
        }
        b4.X(true);
        try {
            d(w4, w4.b(), true);
            do {
            } while (b4.c0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
