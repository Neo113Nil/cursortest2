package p;

import e2.InterfaceC0426e;

/* renamed from: p.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789t0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public long f7769h;

    /* renamed from: i, reason: collision with root package name */
    public int f7770i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f7771j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7772k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0789t0(C0793v0 c0793v0, V1.d dVar) {
        super(2, dVar);
        this.f7772k = c0793v0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        long j3 = ((O0.o) obj).f3749a;
        C0789t0 c0789t0 = new C0789t0(this.f7772k, (V1.d) obj2);
        c0789t0.f7771j = j3;
        return c0789t0.q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0789t0 c0789t0 = new C0789t0(this.f7772k, dVar);
        c0789t0.f7771j = ((O0.o) obj).f3749a;
        return c0789t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        long j3;
        Object e3;
        Object b3;
        long j4;
        long j5;
        Object d3;
        long j6;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7770i;
        C0793v0 c0793v0 = this.f7772k;
        if (i3 == 0) {
            R1.a.e(obj);
            j3 = this.f7771j;
            G1.m mVar = c0793v0.f7783f;
            this.f7771j = j3;
            this.f7770i = 1;
            e3 = mVar.e(j3, this);
            if (e3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j7 = this.f7769h;
                    j6 = this.f7771j;
                    R1.a.e(obj);
                    j5 = j7;
                    d3 = obj;
                    return new O0.o(O0.o.d(j6, O0.o.d(j5, ((O0.o) d3).f3749a)));
                }
                j4 = this.f7769h;
                j3 = this.f7771j;
                R1.a.e(obj);
                b3 = obj;
                j5 = ((O0.o) b3).f3749a;
                G1.m mVar2 = c0793v0.f7783f;
                long d4 = O0.o.d(j4, j5);
                this.f7771j = j3;
                this.f7769h = j5;
                this.f7770i = 3;
                d3 = mVar2.d(d4, j5, this);
                if (d3 != aVar) {
                    return aVar;
                }
                j6 = j3;
                return new O0.o(O0.o.d(j6, O0.o.d(j5, ((O0.o) d3).f3749a)));
            }
            j3 = this.f7771j;
            R1.a.e(obj);
            e3 = obj;
        }
        long d5 = O0.o.d(j3, ((O0.o) e3).f3749a);
        this.f7771j = j3;
        this.f7769h = d5;
        this.f7770i = 2;
        b3 = c0793v0.b(d5, this);
        if (b3 == aVar) {
            return aVar;
        }
        j4 = d5;
        j5 = ((O0.o) b3).f3749a;
        G1.m mVar22 = c0793v0.f7783f;
        long d42 = O0.o.d(j4, j5);
        this.f7771j = j3;
        this.f7769h = j5;
        this.f7770i = 3;
        d3 = mVar22.d(d42, j5, this);
        if (d3 != aVar) {
        }
    }
}
