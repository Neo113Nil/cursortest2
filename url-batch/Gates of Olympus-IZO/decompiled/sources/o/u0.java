package o;

import F.C0047j0;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import n.C0666v;
import n.C0667w;

/* loaded from: classes.dex */
public final class u0 extends R1.h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6620e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0550w f6622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0666v f6623h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0047j0 f6624i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f6625j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(InterfaceC0550w interfaceC0550w, C0666v c0666v, C0047j0 c0047j0, M m3, P1.d dVar) {
        super(2, dVar);
        this.f6622g = interfaceC0550w;
        this.f6623h = c0666v;
        this.f6624i = c0047j0;
        this.f6625j = m3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0047j0 c0047j0 = this.f6624i;
        M m3 = this.f6625j;
        u0 u0Var = new u0(this.f6622g, this.f6623h, c0047j0, m3, dVar);
        u0Var.f6621f = obj;
        return u0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((u0) create((n0.t) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n0.t tVar;
        n0.m mVar;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6620e;
        M m3 = this.f6625j;
        InterfaceC0550w interfaceC0550w = this.f6622g;
        if (i3 == 0) {
            I2.l.Q(obj);
            tVar = (n0.t) this.f6621f;
            AbstractC0552y.q(interfaceC0550w, null, null, new q0(m3, null), 3);
            this.f6621f = tVar;
            this.f6620e = 1;
            obj = x0.a(tVar, (r3 & 1) != 0, n0.h.f6217e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
                mVar = (n0.m) obj;
                if (mVar != null) {
                    AbstractC0552y.q(interfaceC0550w, null, null, new s0(m3, null), 3);
                } else {
                    mVar.a();
                    AbstractC0552y.q(interfaceC0550w, null, null, new t0(m3, null), 3);
                    C0667w c0667w = (C0667w) this.f6624i.f1274f;
                    if (c0667w.f6179w) {
                        c0667w.f6180x.b();
                    }
                }
                return L1.z.f2729a;
            }
            tVar = (n0.t) this.f6621f;
            I2.l.Q(obj);
        }
        n0.m mVar2 = (n0.m) obj;
        mVar2.a();
        F f3 = x0.f6662a;
        C0666v c0666v = this.f6623h;
        if (c0666v != f3) {
            AbstractC0552y.q(interfaceC0550w, null, null, new r0(c0666v, m3, mVar2, null), 3);
        }
        this.f6621f = null;
        this.f6620e = 2;
        obj = x0.c(tVar, n0.h.f6217e, this);
        if (obj == aVar) {
            return aVar;
        }
        mVar = (n0.m) obj;
        if (mVar != null) {
        }
        return L1.z.f2729a;
    }
}
