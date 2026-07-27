package l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771P extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public int f7612k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f7614m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f7615n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m0 f7616o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7617p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771P(Object obj, Object obj2, U u4, m0 m0Var, float f4, C2.a aVar) {
        super(1, aVar);
        this.f7613l = obj;
        this.f7614m = obj2;
        this.f7615n = u4;
        this.f7616o = m0Var;
        this.f7617p = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m0 m0Var = this.f7616o;
        float f4 = this.f7617p;
        return new C0771P(this.f7613l, this.f7614m, this.f7615n, m0Var, f4, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7612k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0770O c0770o = new C0770O(this.f7613l, this.f7614m, this.f7615n, this.f7616o, this.f7617p, null);
            this.f7612k = 1;
            if (W2.B.d(c0770o, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
