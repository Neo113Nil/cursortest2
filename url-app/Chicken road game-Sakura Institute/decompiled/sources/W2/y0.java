package W2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class y0 {
    public static final Object a(w0 w0Var, Function2 function2) {
        Object c0294p;
        Object V3;
        B.j(w0Var, true, new M(0, F.b(w0Var.f5684j.p()).p(w0Var.f4298k, w0Var, w0Var.f4246i)));
        try {
            if (function2 instanceof E2.a) {
                M2.J.d(2, function2);
                c0294p = function2.h(w0Var, w0Var);
            } else {
                c0294p = D2.f.c(function2, w0Var, w0Var);
            }
        } catch (Throwable th) {
            c0294p = new C0294p(th, false);
        }
        D2.a aVar = D2.a.f2163d;
        if (c0294p == aVar || (V3 = w0Var.V(c0294p)) == B.f4212e) {
            return aVar;
        }
        if (V3 instanceof C0294p) {
            Throwable th2 = ((C0294p) V3).f4291a;
            if (!(th2 instanceof v0)) {
                throw th2;
            }
            if (((v0) th2).f4297d != w0Var) {
                throw th2;
            }
            if (c0294p instanceof C0294p) {
                throw ((C0294p) c0294p).f4291a;
            }
        } else {
            c0294p = B.p(V3);
        }
        return c0294p;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(long j4, Function2 function2, E2.c cVar) {
        x0 frame;
        int i2;
        M2.E e4;
        if (cVar instanceof x0) {
            frame = (x0) cVar;
            int i4 = frame.f4303m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                frame.f4303m = i4 - Integer.MIN_VALUE;
                Object obj = frame.f4302l;
                D2.a aVar = D2.a.f2163d;
                i2 = frame.f4303m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    if (j4 <= 0) {
                        return null;
                    }
                    M2.E e5 = new M2.E();
                    try {
                        frame.f4300j = function2;
                        frame.f4301k = e5;
                        frame.f4303m = 1;
                        w0 w0Var = new w0(j4, frame);
                        e5.f3580d = w0Var;
                        Object a4 = a(w0Var, function2);
                        if (a4 == aVar) {
                            try {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            } catch (v0 e6) {
                                e = e6;
                                e4 = e5;
                                if (e.f4297d == e4.f3580d) {
                                }
                            }
                        }
                        return a4 == aVar ? aVar : a4;
                    } catch (v0 e7) {
                        e = e7;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e4 = frame.f4301k;
                    try {
                        AbstractC1343r.b(obj);
                        return obj;
                    } catch (v0 e8) {
                        e = e8;
                    }
                }
                if (e.f4297d == e4.f3580d) {
                    return null;
                }
                throw e;
            }
        }
        frame = new x0(cVar);
        Object obj2 = frame.f4302l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = frame.f4303m;
        if (i2 != 0) {
        }
        if (e.f4297d == e4.f3580d) {
        }
    }
}
