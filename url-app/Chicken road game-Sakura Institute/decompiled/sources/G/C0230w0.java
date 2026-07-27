package G;

import A0.C0030a;
import B1.C0097d;
import Q.C0273i;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import a3.AbstractC0425c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;
import z2.C1403G;

/* renamed from: G.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230w0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public C0273i f2950k;

    /* renamed from: l, reason: collision with root package name */
    public int f2951l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f2953n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0234y0 f2954o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X f2955p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230w0(C0236z0 c0236z0, C0234y0 c0234y0, X x2, C2.a aVar) {
        super(2, aVar);
        this.f2953n = c0236z0;
        this.f2954o = c0234y0;
        this.f2955p = x2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0230w0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0230w0 c0230w0 = new C0230w0(this.f2953n, this.f2954o, this.f2955p, aVar);
        c0230w0.f2952m = obj;
        return c0230w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Z2.S s4;
        Object obj2;
        M.b bVar;
        InterfaceC0280c0 interfaceC0280c0;
        Throwable th;
        C0273i c0273i;
        List w4;
        C0236z0 c0236z0;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2951l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0280c0 g4 = W2.B.g(((InterfaceC0302y) this.f2952m).q());
            C0236z0 c0236z02 = this.f2953n;
            synchronized (c0236z02.f2983b) {
                Throwable th2 = c0236z02.f2985d;
                if (th2 != null) {
                    throw th2;
                }
                if (((EnumC0224t0) c0236z02.f2999r.getValue()).compareTo(EnumC0224t0.f2917e) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c0236z02.f2984c != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c0236z02.f2984c = g4;
                c0236z02.t();
            }
            C0030a c0030a = new C0030a(2, this.f2953n);
            C0097d c0097d = Q.q.f3877a;
            Q.q.f(Q.p.f3875i);
            synchronized (Q.q.f3878b) {
                Q.q.f3883g = C1403G.A(Q.q.f3883g, c0030a);
                Unit unit = Unit.f7487a;
            }
            C0273i c0273i2 = new C0273i(c0030a);
            Z2.S s5 = C0236z0.f2980v;
            W w5 = this.f2953n.f3002u;
            try {
                do {
                    s4 = C0236z0.f2980v;
                    obj2 = (J.f) s4.getValue();
                    bVar = (M.b) obj2;
                    L.c cVar = bVar.f3534j;
                    if (!cVar.containsKey(w5)) {
                        boolean isEmpty = bVar.isEmpty();
                        N.b bVar2 = N.b.f3612a;
                        if (isEmpty) {
                            bVar = new M.b(w5, w5, cVar.h(w5, new M.a(bVar2, bVar2)));
                        } else {
                            Object obj3 = bVar.f3533i;
                            Object obj4 = cVar.get(obj3);
                            Intrinsics.c(obj4);
                            bVar = new M.b(bVar.f3532e, w5, cVar.h(obj3, new M.a(((M.a) obj4).f3529a, w5)).h(w5, new M.a(obj3, bVar2)));
                        }
                    }
                    if (obj2 != bVar) {
                        Object obj5 = AbstractC0425c.f4947b;
                        if (obj2 == null) {
                            obj2 = obj5;
                        }
                    }
                    break;
                } while (!s4.l(obj2, bVar));
                break;
                C0236z0 c0236z03 = this.f2953n;
                synchronized (c0236z03.f2983b) {
                    w4 = c0236z03.w();
                }
                int size = w4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C0225u) w4.get(i4)).q();
                }
                C0228v0 c0228v0 = new C0228v0(this.f2954o, this.f2955p, null);
                this.f2952m = g4;
                this.f2950k = c0273i2;
                this.f2951l = 1;
                if (W2.B.d(c0228v0, this) == aVar) {
                    return aVar;
                }
                interfaceC0280c0 = g4;
                c0273i = c0273i2;
            } catch (Throwable th3) {
                interfaceC0280c0 = g4;
                th = th3;
                c0273i = c0273i2;
                c0273i.a();
                c0236z0 = this.f2953n;
                synchronized (c0236z0.f2983b) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0273i = this.f2950k;
            interfaceC0280c0 = (InterfaceC0280c0) this.f2952m;
            try {
                AbstractC1343r.b(obj);
            } catch (Throwable th4) {
                th = th4;
                c0273i.a();
                c0236z0 = this.f2953n;
                synchronized (c0236z0.f2983b) {
                    try {
                        if (c0236z0.f2984c == interfaceC0280c0) {
                            c0236z0.f2984c = null;
                        }
                        c0236z0.t();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                Z2.S s6 = C0236z0.f2980v;
                W.b(this.f2953n.f3002u);
                throw th;
            }
        }
        c0273i.a();
        C0236z0 c0236z04 = this.f2953n;
        synchronized (c0236z04.f2983b) {
            try {
                if (c0236z04.f2984c == interfaceC0280c0) {
                    c0236z04.f2984c = null;
                }
                c0236z04.t();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        Z2.S s7 = C0236z0.f2980v;
        W.b(this.f2953n.f3002u);
        return Unit.f7487a;
    }
}
