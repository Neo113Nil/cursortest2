package r6;

import f6.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.internal.c0;
import v5.k;
import v5.l;
import y5.d;
import y5.g;

/* loaded from: classes.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r7, d<? super T> dVar) {
        Object a7;
        Object c7;
        d a8 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c8 = c0.c(context, null);
            try {
            } finally {
                c0.a(context, c8);
            }
        } catch (Throwable th) {
            k.a aVar = k.f22832f;
            a7 = l.a(th);
        }
        if (pVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        a7 = ((p) n.a(pVar, 2)).invoke(r7, a8);
        c7 = z5.d.c();
        if (a7 != c7) {
            k.a aVar2 = k.f22832f;
            a8.resumeWith(k.a(a7));
        }
    }
}
