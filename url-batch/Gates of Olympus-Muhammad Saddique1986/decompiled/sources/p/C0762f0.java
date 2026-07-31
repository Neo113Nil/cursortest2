package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: p.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762f0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7664h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0762f0(C0776m0 c0776m0, long j3, V1.d dVar) {
        super(2, dVar);
        this.f7665i = c0776m0;
        this.f7666j = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0762f0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0762f0(this.f7665i, this.f7666j, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object q3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7664h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0793v0 c0793v0 = this.f7665i.f7720F;
            this.f7664h = 1;
            P p3 = c0793v0.f7781d;
            P p4 = P.f7568e;
            long j3 = this.f7666j;
            long a3 = p3 == p4 ? O0.o.a(j3, 0.0f, 0.0f, 1) : O0.o.a(j3, 0.0f, 0.0f, 2);
            C0789t0 c0789t0 = new C0789t0(c0793v0, null);
            n.l0 l0Var = c0793v0.f7779b;
            if (l0Var == null || !(c0793v0.f7778a.a() || c0793v0.f7778a.c())) {
                C0789t0 c0789t02 = new C0789t0(c0789t0.f7772k, this);
                c0789t02.f7771j = a3;
                q3 = c0789t02.q(yVar);
            } else {
                q3 = l0Var.b(a3, c0789t0, this);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
