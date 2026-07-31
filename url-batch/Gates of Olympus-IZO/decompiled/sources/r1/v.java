package r1;

import k2.InterfaceC0550w;
import m.M;
import m.W;
import m.Z;
import m.s0;
import q1.C0784h;

/* loaded from: classes.dex */
public final class v extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f7271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f7272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f7273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0784h f7274h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(float f3, Z z3, C0784h c0784h, P1.d dVar) {
        super(2, dVar);
        this.f7272f = f3;
        this.f7273g = z3;
        this.f7274h = c0784h;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new v(this.f7272f, this.f7273g, this.f7274h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((v) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f7271e;
        L1.z zVar = L1.z.f2729a;
        Z z3 = this.f7273g;
        float f3 = this.f7272f;
        if (i3 == 0) {
            I2.l.Q(obj);
            if (f3 > 0.0f) {
                this.f7271e = 1;
                if (z3.m(f3, z3.f5660b.getValue(), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
                return zVar;
            }
            I2.l.Q(obj);
        }
        if (f3 == 0.0f) {
            this.f7271e = 2;
            s0 s0Var = z3.f5663e;
            if (s0Var != null) {
                Object value = z3.f5661c.getValue();
                C0784h c0784h = this.f7274h;
                if (!Z1.i.a(value, c0784h) || !Z1.i.a(z3.f5660b.getValue(), c0784h)) {
                    a3 = M.a(z3.f5669k, new W(z3, c0784h, s0Var, null), this);
                }
            }
            a3 = zVar;
            if (a3 == aVar) {
                return aVar;
            }
        }
        return zVar;
    }
}
