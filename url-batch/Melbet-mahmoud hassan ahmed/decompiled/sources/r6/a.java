package r6;

import f6.p;
import kotlinx.coroutines.internal.g;
import v5.k;
import v5.l;
import v5.q;
import y5.d;
import z5.c;

/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d<?> dVar, Throwable th) {
        k.a aVar = k.f22832f;
        dVar.resumeWith(k.a(l.a(th)));
        throw th;
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r7, d<? super T> dVar, f6.l<? super Throwable, q> lVar) {
        d a7;
        d b7;
        try {
            a7 = c.a(pVar, r7, dVar);
            b7 = c.b(a7);
            k.a aVar = k.f22832f;
            g.b(b7, k.a(q.f22838a), lVar);
        } catch (Throwable th) {
            b(dVar, th);
        }
    }

    public static final void d(d<? super q> dVar, d<?> dVar2) {
        d b7;
        try {
            b7 = c.b(dVar);
            k.a aVar = k.f22832f;
            g.c(b7, k.a(q.f22838a), null, 2, null);
        } catch (Throwable th) {
            b(dVar2, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, f6.l lVar, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
