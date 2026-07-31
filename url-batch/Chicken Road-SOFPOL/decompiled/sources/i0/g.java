package i0;

import a7.u;
import a7.x;
import c6.m;
import m0.l2;
import r.h0;
import r.j;
import r.l1;
import r.m0;
import r.s0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3278h = 1;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f3279j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3280k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3281l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f6, s0 s0Var, o4.d dVar, g6.c cVar) {
        super(2, cVar);
        this.f3279j = f6;
        this.f3280k = s0Var;
        this.f3281l = dVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        u uVar = (u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f3278h) {
        }
        return ((g) l(cVar, uVar)).p(m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f3278h) {
            case 0:
                return new g((h) this.f3280k, this.f3279j, (j) this.f3281l, cVar);
            case 1:
                return new g(this.f3279j, (s0) this.f3280k, (o4.d) this.f3281l, cVar);
            default:
                g gVar = new g((l1) this.f3281l, cVar);
                gVar.f3280k = obj;
                return gVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0090, code lost:
    
        if (r0.n(r1, r0.f6418b.getValue(), r8) == r7) goto L44;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        Object a8;
        final float i;
        u uVar;
        switch (this.f3278h) {
            case 0:
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    r.c cVar = (r.c) ((h) this.f3280k).f3284c;
                    Float f6 = new Float(this.f3279j);
                    j jVar = (j) this.f3281l;
                    this.i = 1;
                    Object c8 = r.c.c(cVar, f6, jVar, null, this, 12);
                    h6.a aVar = h6.a.f3204d;
                    if (c8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case 1:
                s0 s0Var = (s0) this.f3280k;
                float f8 = this.f3279j;
                int i9 = this.i;
                m mVar = m.f1757a;
                h6.a aVar2 = h6.a.f3204d;
                if (i9 == 0) {
                    s6.a.K(obj);
                    if (f8 > 0.0f) {
                        this.i = 1;
                        break;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        return mVar;
                    }
                    s6.a.K(obj);
                }
                if (f8 != 0.0f) {
                    return mVar;
                }
                o4.d dVar = (o4.d) this.f3281l;
                this.i = 2;
                l1 l1Var = s0Var.f6421e;
                if (l1Var == null || ((q6.i.a(s0Var.f6419c.getValue(), dVar) && q6.i.a(s0Var.f6418b.getValue(), dVar)) || (a8 = h0.a(s0Var.f6426k, new m0(s0Var, dVar, l1Var, (g6.c) null), this)) != aVar2)) {
                    a8 = mVar;
                }
                if (a8 != aVar2) {
                    return mVar;
                }
                return aVar2;
            default:
                int i10 = this.i;
                if (i10 == 0) {
                    s6.a.K(obj);
                    u uVar2 = (u) this.f3280k;
                    i = r.d.i(uVar2.h());
                    uVar = uVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.f3279j;
                    uVar = (u) this.f3280k;
                    s6.a.K(obj);
                }
                while (x.l(uVar)) {
                    final l1 l1Var2 = (l1) this.f3281l;
                    p6.c cVar2 = new p6.c() { // from class: r.j1
                        @Override // p6.c
                        public final Object i(Object obj2) {
                            long longValue = ((Long) obj2).longValue();
                            l1 l1Var3 = l1.this;
                            boolean g3 = l1Var3.g();
                            m0.f1 f1Var = l1Var3.f6352g;
                            if (!g3) {
                                if (((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c == Long.MIN_VALUE) {
                                    f1Var.g(longValue);
                                    ((m0.h1) l1Var3.f6346a.f6389a).setValue(Boolean.TRUE);
                                }
                                long j7 = longValue - ((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c;
                                float f9 = i;
                                if (f9 != 0.0f) {
                                    j7 = s6.a.C(j7 / f9);
                                }
                                l1Var3.n(j7);
                                l1Var3.h(j7, f9 == 0.0f);
                            }
                            return c6.m.f1757a;
                        }
                    };
                    this.f3280k = uVar;
                    this.f3279j = i;
                    this.i = 1;
                    g6.h hVar = this.f3460e;
                    q6.i.b(hVar);
                    Object d8 = m0.b.o(hVar).d(cVar2, this);
                    h6.a aVar3 = h6.a.f3204d;
                    if (d8 == aVar3) {
                        return aVar3;
                    }
                }
                return m.f1757a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, float f6, j jVar, g6.c cVar) {
        super(2, cVar);
        this.f3280k = hVar;
        this.f3279j = f6;
        this.f3281l = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l1 l1Var, g6.c cVar) {
        super(2, cVar);
        this.f3281l = l1Var;
    }
}
