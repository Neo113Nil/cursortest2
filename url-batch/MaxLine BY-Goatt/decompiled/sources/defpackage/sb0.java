package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class sb0 {
    public static final void a(fs fsVar, o30 o30Var, boolean z) {
        Object h;
        Object t = fsVar.t();
        Throwable f = fsVar.f(t);
        if (f != null) {
            aa2.a aVar = aa2.m;
            h = new ba2(f);
        } else {
            aa2.a aVar2 = aa2.m;
            h = fsVar.h(t);
        }
        if (!z) {
            o30Var.resumeWith(h);
            return;
        }
        o30Var.getClass();
        pb0 pb0Var = (pb0) o30Var;
        r30 r30Var = pb0Var.q;
        Object obj = pb0Var.s;
        CoroutineContext context = r30Var.getContext();
        Object c = zw2.c(context, obj);
        x13 c2 = c != zw2.a ? r40.c(r30Var, context, c) : null;
        try {
            r30Var.resumeWith(h);
            Unit unit = Unit.a;
            if (c2 == null || c2.o0()) {
                zw2.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.o0()) {
                zw2.a(context, c);
            }
            throw th;
        }
    }
}
