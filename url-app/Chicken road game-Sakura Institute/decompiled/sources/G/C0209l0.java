package G;

import A.C0028y;
import W2.C0286h;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: G.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209l0 implements X {

    /* renamed from: d, reason: collision with root package name */
    public final X f2827d;

    /* renamed from: e, reason: collision with root package name */
    public final S f2828e = new S();

    public C0209l0(X x2) {
        this.f2827d = x2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093 A[PHI: r8
      0x0093: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0090, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // G.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Function1 function1, C2.a aVar) {
        C0207k0 frame;
        int i2;
        boolean z4;
        Object r2;
        C0209l0 c0209l0;
        if (aVar instanceof C0207k0) {
            frame = (C0207k0) aVar;
            int i4 = frame.f2825n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                frame.f2825n = i4 - Integer.MIN_VALUE;
                Object obj = frame.f2823l;
                D2.a aVar2 = D2.a.f2163d;
                i2 = frame.f2825n;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    S s4 = this.f2828e;
                    frame.f2821j = this;
                    frame.f2822k = function1;
                    frame.f2825n = 1;
                    synchronized (s4.f2749a) {
                        z4 = s4.f2752d;
                    }
                    if (z4) {
                        r2 = Unit.f7487a;
                    } else {
                        C0286h c0286h = new C0286h(1, D2.f.b(frame));
                        c0286h.s();
                        synchronized (s4.f2749a) {
                            s4.f2750b.add(c0286h);
                        }
                        c0286h.v(new C0028y(s4, 9, c0286h));
                        r2 = c0286h.r();
                        if (r2 == aVar2) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (r2 != aVar2) {
                            r2 = Unit.f7487a;
                        }
                    }
                    if (r2 == aVar2) {
                        return aVar2;
                    }
                    c0209l0 = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            AbstractC1343r.b(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = frame.f2822k;
                    c0209l0 = frame.f2821j;
                    AbstractC1343r.b(obj);
                }
                X x2 = c0209l0.f2827d;
                frame.f2821j = null;
                frame.f2822k = null;
                frame.f2825n = 2;
                obj = x2.f(function1, frame);
                return obj != aVar2 ? aVar2 : obj;
            }
        }
        frame = new C0207k0(this, aVar);
        Object obj2 = frame.f2823l;
        D2.a aVar22 = D2.a.f2163d;
        i2 = frame.f2825n;
        if (i2 != 0) {
        }
        X x22 = c0209l0.f2827d;
        frame.f2821j = null;
        frame.f2822k = null;
        frame.f2825n = 2;
        obj2 = x22.f(function1, frame);
        if (obj2 != aVar22) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.h(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext coroutineContext) {
        return kotlin.coroutines.f.c(coroutineContext, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.b(this, gVar);
    }
}
