package t2;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import o2.AbstractC3311E;
import o2.AbstractC3312F;
import o2.AbstractC3328f0;
import o2.InterfaceC3359v0;
import o2.T0;
import o2.Y0;

/* renamed from: t2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3441l {

    /* renamed from: a, reason: collision with root package name */
    private static final G f46236a = new G("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final G f46237b = new G("REUSABLE_CLAIMED");

    public static final void b(kotlin.coroutines.d dVar, Object obj, Function1 function1) {
        if (!(dVar instanceof C3440k)) {
            dVar.resumeWith(obj);
            return;
        }
        C3440k c3440k = (C3440k) dVar;
        Object b4 = AbstractC3311E.b(obj, function1);
        if (c3440k.f46232e.i(c3440k.getContext())) {
            c3440k.f46234g = b4;
            c3440k.f42029d = 1;
            c3440k.f46232e.g(c3440k.getContext(), c3440k);
            return;
        }
        AbstractC3328f0 b5 = T0.f42024a.b();
        if (b5.Z()) {
            c3440k.f46234g = b4;
            c3440k.f42029d = 1;
            b5.V(c3440k);
            return;
        }
        b5.X(true);
        try {
            InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) c3440k.getContext().get(InterfaceC3359v0.f42105N2);
            if (interfaceC3359v0 == null || interfaceC3359v0.isActive()) {
                kotlin.coroutines.d dVar2 = c3440k.f46233f;
                Object obj2 = c3440k.f46235h;
                CoroutineContext context = dVar2.getContext();
                Object c4 = K.c(context, obj2);
                Y0 g4 = c4 != K.f46209a ? AbstractC3312F.g(dVar2, context, c4) : null;
                try {
                    c3440k.f46233f.resumeWith(obj);
                    Unit unit = Unit.f41027a;
                } finally {
                    if (g4 == null || g4.S0()) {
                        K.a(context, c4);
                    }
                }
            } else {
                CancellationException cancellationException = interfaceC3359v0.getCancellationException();
                c3440k.a(b4, cancellationException);
                Result.Companion companion = Result.Companion;
                c3440k.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(cancellationException)));
            }
            while (b5.c0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(kotlin.coroutines.d dVar, Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            function1 = null;
        }
        b(dVar, obj, function1);
    }

    public static final boolean d(C3440k c3440k) {
        Unit unit = Unit.f41027a;
        AbstractC3328f0 b4 = T0.f42024a.b();
        if (b4.a0()) {
            return false;
        }
        if (b4.Z()) {
            c3440k.f46234g = unit;
            c3440k.f42029d = 1;
            b4.V(c3440k);
            return true;
        }
        b4.X(true);
        try {
            c3440k.run();
            do {
            } while (b4.c0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
