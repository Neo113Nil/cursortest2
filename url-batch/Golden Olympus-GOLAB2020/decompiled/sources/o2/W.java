package o2;

import W1.AbstractC1233c;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import t2.C3440k;
import v2.AbstractRunnableC3473h;
import v2.InterfaceC3474i;

/* loaded from: classes3.dex */
public abstract class W extends AbstractRunnableC3473h {

    /* renamed from: d, reason: collision with root package name */
    public int f42029d;

    public W(int i4) {
        this.f42029d = i4;
    }

    public abstract void a(Object obj, Throwable th);

    public abstract kotlin.coroutines.d b();

    public Throwable c(Object obj) {
        C3308B c3308b = obj instanceof C3308B ? (C3308B) obj : null;
        if (c3308b != null) {
            return c3308b.f41962a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1233c.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        AbstractC3315I.a(b().getContext(), new M("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object m243constructorimpl;
        Object m243constructorimpl2;
        InterfaceC3474i interfaceC3474i = this.f46472c;
        try {
            kotlin.coroutines.d b4 = b();
            Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3440k c3440k = (C3440k) b4;
            kotlin.coroutines.d dVar = c3440k.f46233f;
            Object obj = c3440k.f46235h;
            CoroutineContext context = dVar.getContext();
            Object c4 = t2.K.c(context, obj);
            Y0 g4 = c4 != t2.K.f46209a ? AbstractC3312F.g(dVar, context, c4) : null;
            try {
                CoroutineContext context2 = dVar.getContext();
                Object j4 = j();
                Throwable c5 = c(j4);
                InterfaceC3359v0 interfaceC3359v0 = (c5 == null && X.b(this.f42029d)) ? (InterfaceC3359v0) context2.get(InterfaceC3359v0.f42105N2) : null;
                if (interfaceC3359v0 != null && !interfaceC3359v0.isActive()) {
                    CancellationException cancellationException = interfaceC3359v0.getCancellationException();
                    a(j4, cancellationException);
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(cancellationException)));
                } else if (c5 != null) {
                    Result.Companion companion2 = Result.Companion;
                    dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(c5)));
                } else {
                    Result.Companion companion3 = Result.Companion;
                    dVar.resumeWith(Result.m243constructorimpl(e(j4)));
                }
                Unit unit = Unit.f41027a;
                if (g4 == null || g4.S0()) {
                    t2.K.a(context, c4);
                }
                try {
                    interfaceC3474i.a();
                    m243constructorimpl2 = Result.m243constructorimpl(Unit.f41027a);
                } catch (Throwable th) {
                    Result.Companion companion4 = Result.Companion;
                    m243constructorimpl2 = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                i(null, Result.d(m243constructorimpl2));
            } catch (Throwable th2) {
                if (g4 == null || g4.S0()) {
                    t2.K.a(context, c4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion5 = Result.Companion;
                interfaceC3474i.a();
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th4));
            }
            i(th3, Result.d(m243constructorimpl));
        }
    }

    public Object e(Object obj) {
        return obj;
    }
}
