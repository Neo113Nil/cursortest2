package r1;

import I.C0094f0;
import k2.InterfaceC0550w;
import m.AbstractC0595e;
import m.M;
import m.Q;
import m.Z;
import m.s0;
import m.x0;
import o.U;
import q1.C0784h;

/* loaded from: classes.dex */
public final class w extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f7275e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f7277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0784h f7278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0 f7279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Z z3, C0784h c0784h, s0 s0Var, P1.d dVar) {
        super(2, dVar);
        this.f7277g = z3;
        this.f7278h = c0784h;
        this.f7279i = s0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        w wVar = new w(this.f7277g, this.f7278h, this.f7279i, dVar);
        wVar.f7276f = obj;
        return wVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((w) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r15 == r0) goto L17;
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f7275e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f7276f;
            Z z3 = this.f7277g;
            Object value = z3.f5661c.getValue();
            C0784h c0784h = this.f7278h;
            if (Z1.i.a(value, c0784h)) {
                long longValue = ((Number) this.f7279i.f5852l.getValue()).longValue() / 1000000;
                C0094f0 c0094f0 = z3.f5666h;
                float g3 = c0094f0.g();
                x0 i4 = AbstractC0595e.i((int) (c0094f0.g() * longValue), 0, null, 6);
                U u3 = new U(interfaceC0550w, z3, c0784h, 1);
                this.f7275e = 2;
                if (AbstractC0595e.c(g3, 0.0f, i4, u3, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                this.f7275e = 1;
                s0 s0Var = z3.f5663e;
                if (s0Var != null) {
                    a3 = M.a(z3.f5669k, new Q(null, c0784h, null, z3, s0Var), this);
                }
                a3 = zVar;
                if (a3 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
