package r6;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import o6.C0809e;
import p6.EnumC0830a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0654a f7582a = new C0654a("NULL", 1);

    public static /* synthetic */ q6.d a(p pVar, C0809e c0809e, int i2, EnumC0830a enumC0830a, int i5) {
        CoroutineContext coroutineContext = c0809e;
        if ((i5 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f6146d;
        }
        if ((i5 & 2) != 0) {
            i2 = -3;
        }
        if ((i5 & 4) != 0) {
            enumC0830a = EnumC0830a.f7215d;
        }
        return pVar.o(coroutineContext, i2, enumC0830a);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, V5.b frame) {
        Object invoke;
        Object c7 = s6.u.c(coroutineContext, obj2);
        try {
            y yVar = new y(frame, coroutineContext);
            if (function2 == null) {
                invoke = W5.d.c(function2, obj, yVar);
            } else {
                I.b(2, function2);
                invoke = function2.invoke(obj, yVar);
            }
            s6.u.a(coroutineContext, c7);
            if (invoke == W5.a.f2787d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            s6.u.a(coroutineContext, c7);
            throw th;
        }
    }
}
