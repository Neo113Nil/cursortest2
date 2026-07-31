package I;

import D1.C0014b;
import F.C0036e;
import java.util.List;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import n2.C0692Q;

/* renamed from: I.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129x0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public D1.h f2396e;

    /* renamed from: f, reason: collision with root package name */
    public int f2397f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A0 f2399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0133z0 f2400i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y f2401j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129x0(A0 a02, C0133z0 c0133z0, Y y3, P1.d dVar) {
        super(2, dVar);
        this.f2399h = a02;
        this.f2400i = c0133z0;
        this.f2401j = y3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0129x0 c0129x0 = new C0129x0(this.f2399h, this.f2400i, this.f2401j, dVar);
        c0129x0.f2398g = obj;
        return c0129x0;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0129x0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0692Q c0692q;
        L.b bVar;
        O.b bVar2;
        k2.X x3;
        Throwable th;
        D1.h hVar;
        List w3;
        A0 a02;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2397f;
        if (i3 == 0) {
            I2.l.Q(obj);
            k2.X j3 = AbstractC0552y.j(((InterfaceC0550w) this.f2398g).u());
            A0 a03 = this.f2399h;
            synchronized (a03.f2061b) {
                Throwable th2 = a03.f2063d;
                if (th2 != null) {
                    throw th2;
                }
                if (((EnumC0121t0) a03.f2076r.getValue()).compareTo(EnumC0121t0.f2361e) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (a03.f2062c != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                a03.f2062c = j3;
                a03.t();
            }
            C0036e c0036e = new C0036e(3, this.f2399h);
            C0014b c0014b = S.q.f3234a;
            S.q.f(S.o.f3230g);
            synchronized (S.q.f3235b) {
                S.q.f3240g = M1.l.v0(S.q.f3240g, c0036e);
            }
            D1.h hVar2 = new D1.h(c0036e);
            C0692Q c0692q2 = A0.f2058v;
            X x4 = this.f2399h.f2079u;
            try {
                do {
                    c0692q = A0.f2058v;
                    bVar = (L.b) c0692q.getValue();
                    bVar2 = (O.b) bVar;
                    N.c cVar = bVar2.f2981f;
                    if (!cVar.containsKey(x4)) {
                        boolean isEmpty = bVar2.isEmpty();
                        P.b bVar3 = P.b.f3020a;
                        if (isEmpty) {
                            bVar2 = new O.b(x4, x4, cVar.a(x4, new O.a(bVar3, bVar3)));
                        } else {
                            Object obj2 = bVar2.f2980e;
                            Object obj3 = cVar.get(obj2);
                            Z1.i.c(obj3);
                            bVar2 = new O.b(bVar2.f2979d, x4, cVar.a(obj2, new O.a(((O.a) obj3).f2976a, x4)).a(x4, new O.a(obj2, bVar3)));
                        }
                    }
                    if (bVar != bVar2) {
                    }
                    break;
                } while (!c0692q.i(bVar, bVar2));
                break;
                A0 a04 = this.f2399h;
                synchronized (a04.f2061b) {
                    w3 = a04.w();
                }
                int size = w3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C0122u) w3.get(i4)).q();
                }
                C0127w0 c0127w0 = new C0127w0(this.f2400i, this.f2401j, null);
                this.f2398g = j3;
                this.f2396e = hVar2;
                this.f2397f = 1;
                if (AbstractC0552y.d(c0127w0, this) == aVar) {
                    return aVar;
                }
                x3 = j3;
                hVar = hVar2;
            } catch (Throwable th3) {
                x3 = j3;
                th = th3;
                hVar = hVar2;
                hVar.a();
                a02 = this.f2399h;
                synchronized (a02.f2061b) {
                    try {
                        if (a02.f2062c == x3) {
                            a02.f2062c = null;
                        }
                        a02.t();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                C0692Q c0692q3 = A0.f2058v;
                X.b(this.f2399h.f2079u);
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.f2396e;
            x3 = (k2.X) this.f2398g;
            try {
                I2.l.Q(obj);
            } catch (Throwable th5) {
                th = th5;
                hVar.a();
                a02 = this.f2399h;
                synchronized (a02.f2061b) {
                }
            }
        }
        hVar.a();
        A0 a05 = this.f2399h;
        synchronized (a05.f2061b) {
            try {
                if (a05.f2062c == x3) {
                    a05.f2062c = null;
                }
                a05.t();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        C0692Q c0692q4 = A0.f2058v;
        X.b(this.f2399h.f2079u);
        return L1.z.f2729a;
    }
}
