package e1;

import g1.C0404k;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350M extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Z1.r f4632e;

    /* renamed from: f, reason: collision with root package name */
    public int f4633f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z1.r f4635h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0351N f4636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4637j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f4638k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0350M(Z1.r rVar, C0351N c0351n, Object obj, boolean z3, P1.d dVar) {
        super(2, dVar);
        this.f4635h = rVar;
        this.f4636i = c0351n;
        this.f4637j = obj;
        this.f4638k = z3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0350M c0350m = new C0350M(this.f4635h, this.f4636i, this.f4637j, this.f4638k, dVar);
        c0350m.f4634g = obj;
        return c0350m;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0350M) create((C0404k) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Z1.r rVar;
        C0404k c0404k;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4633f;
        Z1.r rVar2 = this.f4635h;
        Object obj2 = this.f4637j;
        C0351N c0351n = this.f4636i;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0404k c0404k2 = (C0404k) this.f4634g;
            X d3 = c0351n.d();
            this.f4634g = c0404k2;
            this.f4632e = rVar2;
            this.f4633f = 1;
            Integer num = new Integer(((AtomicInteger) d3.f4675b.f83b).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            rVar = rVar2;
            c0404k = c0404k2;
            obj = num;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
                if (this.f4638k) {
                    c0351n.f4645g.v(new C0354c(obj2, obj2 != null ? obj2.hashCode() : 0, rVar2.f3478d));
                }
                return L1.z.f2729a;
            }
            rVar = this.f4632e;
            c0404k = (C0404k) this.f4634g;
            I2.l.Q(obj);
        }
        rVar.f3478d = ((Number) obj).intValue();
        this.f4634g = null;
        this.f4632e = null;
        this.f4633f = 2;
        if (c0404k.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f4638k) {
        }
        return L1.z.f2729a;
    }
}
