package r;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public k f6207h;
    public q6.o i;

    /* renamed from: j, reason: collision with root package name */
    public int f6208j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f6209k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c1 f6211m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f6212n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p6.c f6213o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, c1 c1Var, long j7, p6.c cVar2, g6.c cVar3) {
        super(1, cVar3);
        this.f6209k = cVar;
        this.f6210l = obj;
        this.f6211m = c1Var;
        this.f6212n = j7;
        this.f6213o = cVar2;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        long j7 = this.f6212n;
        p6.c cVar = this.f6213o;
        return new a(this.f6209k, this.f6210l, this.f6211m, j7, cVar, (g6.c) obj).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        c cVar;
        k kVar;
        q6.o oVar;
        c1 c1Var = this.f6211m;
        int i = this.f6208j;
        c cVar2 = this.f6209k;
        if (i == 0) {
            s6.a.K(obj);
            try {
                cVar2.f6235c.f6332f = (p) cVar2.f6233a.f6413a.i(this.f6210l);
                cVar2.f6237e.setValue(c1Var.f6248c);
                cVar2.f6236d.setValue(Boolean.TRUE);
                k kVar2 = cVar2.f6235c;
                k kVar3 = new k(kVar2.f6330d, kVar2.f6331e.getValue(), d.f(kVar2.f6332f), kVar2.f6333g, Long.MIN_VALUE, kVar2.i);
                q6.o oVar2 = new q6.o();
                long j7 = this.f6212n;
                a0.d0 d0Var = new a0.d0(cVar2, kVar3, this.f6213o, oVar2, 1);
                cVar = cVar2;
                try {
                    this.f6207h = kVar3;
                    this.i = oVar2;
                    this.f6208j = 1;
                    Object b8 = d.b(kVar3, c1Var, j7, d0Var, this);
                    h6.a aVar = h6.a.f3204d;
                    if (b8 == aVar) {
                        return aVar;
                    }
                    kVar = kVar3;
                    oVar = oVar2;
                } catch (CancellationException e8) {
                    e = e8;
                    c.b(cVar);
                    throw e;
                }
            } catch (CancellationException e9) {
                e = e9;
                cVar = cVar2;
                c.b(cVar);
                throw e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.i;
            kVar = this.f6207h;
            try {
                s6.a.K(obj);
                cVar = cVar2;
            } catch (CancellationException e10) {
                e = e10;
                cVar = cVar2;
                c.b(cVar);
                throw e;
            }
        }
        h hVar = oVar.f6201d ? h.f6296d : h.f6297e;
        c.b(cVar);
        return new a0.a0(18, kVar, hVar);
    }
}
