package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.AbstractC0792z;

/* renamed from: P.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155u extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public C0139d f2159d;

    /* renamed from: e, reason: collision with root package name */
    public int f2160e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2161i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f2162l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155u(Q q4, V5.b bVar) {
        super(2, bVar);
        this.f2162l = q4;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0155u c0155u = new C0155u(this.f2162l, bVar);
        c0155u.f2161i = obj;
        return c0155u;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0155u) create((q6.e) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c8, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r3.a(r11, r10) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q6.e eVar;
        m0 m0Var;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2160e;
        Q q4 = this.f2162l;
        if (i2 == 0) {
            V6.b.P(obj);
            q6.e eVar2 = (q6.e) this.f2161i;
            this.f2161i = eVar2;
            this.f2160e = 1;
            Object t6 = AbstractC0792z.t(q4.f2019i.f7823d, new I(q4, null), this);
            if (t6 != aVar) {
                eVar = eVar2;
                obj = t6;
            }
            return aVar;
        }
        if (i2 == 1) {
            q6.e eVar3 = (q6.e) this.f2161i;
            V6.b.P(obj);
            eVar = eVar3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return Unit.f6114a;
            }
            m0Var = this.f2159d;
            eVar = (q6.e) this.f2161i;
            V6.b.P(obj);
            q6.i iVar = new q6.i(new l2.c(new P0.e(8, new P0.l(new P0.c(new C0150o(q4, null), 9, (q6.v) q4.f2024p.f152e), 9, new C0151p(2, null)), new C0152q(m0Var, null), false)), new r(q4, (V5.b) null));
            this.f2161i = null;
            this.f2159d = null;
            this.f2160e = 3;
            if (!(eVar instanceof q6.y)) {
                throw ((q6.y) eVar).f7425d;
            }
            Object e7 = iVar.e(eVar, this);
            if (e7 != aVar) {
                e7 = Unit.f6114a;
            }
        }
        m0Var = (m0) obj;
        if (m0Var instanceof C0139d) {
            Object obj2 = ((C0139d) m0Var).f2066b;
            this.f2161i = eVar;
            this.f2159d = (C0139d) m0Var;
            this.f2160e = 2;
        } else {
            if (m0Var instanceof n0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (m0Var instanceof e0) {
                throw ((e0) m0Var).f2075b;
            }
            if (m0Var instanceof c0) {
                return Unit.f6114a;
            }
        }
        q6.i iVar2 = new q6.i(new l2.c(new P0.e(8, new P0.l(new P0.c(new C0150o(q4, null), 9, (q6.v) q4.f2024p.f152e), 9, new C0151p(2, null)), new C0152q(m0Var, null), false)), new r(q4, (V5.b) null));
        this.f2161i = null;
        this.f2159d = null;
        this.f2160e = 3;
        if (!(eVar instanceof q6.y)) {
        }
    }
}
