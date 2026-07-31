package h1;

import e2.InterfaceC0426e;

/* renamed from: h1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477A extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public Throwable f6041h;

    /* renamed from: i, reason: collision with root package name */
    public int f6042i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f6043j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M f6044k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6045l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0477A(M m3, int i3, V1.d dVar) {
        super(2, dVar);
        this.f6044k = m3;
        this.f6045l = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0477A) o((V1.d) obj2, bool)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0477A c0477a = new C0477A(this.f6044k, this.f6045l, dVar);
        c0477a.f6043j = ((Boolean) obj).booleanValue();
        return c0477a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // X1.a
    public final Object q(Object obj) {
        Throwable th;
        int i3;
        boolean z3;
        X x3;
        boolean z4;
        W1.a aVar = W1.a.f4608d;
        boolean z5 = this.f6042i;
        M m3 = this.f6044k;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                W f3 = m3.f();
                this.f6041h = th2;
                this.f6043j = z5;
                this.f6042i = 2;
                Integer a3 = f3.a();
                if (a3 == aVar) {
                    return aVar;
                }
                z3 = z5;
                th = th2;
                obj = a3;
            } else {
                boolean z6 = z5;
                th = th2;
                i3 = this.f6045l;
                z3 = z6;
            }
        }
        if (z5 == 0) {
            R1.a.e(obj);
            boolean z7 = this.f6043j;
            this.f6043j = z7;
            this.f6042i = 1;
            obj = M.e(m3, z7, this);
            z5 = z7;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z5 != 1) {
                if (z5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = this.f6043j;
                th = this.f6041h;
                R1.a.e(obj);
                i3 = ((Number) obj).intValue();
                P p3 = new P(i3, th);
                z4 = z3;
                x3 = p3;
                return new R1.i(x3, Boolean.valueOf(z4));
            }
            boolean z8 = this.f6043j;
            R1.a.e(obj);
            z5 = z8;
        }
        x3 = (X) obj;
        z4 = z5;
        return new R1.i(x3, Boolean.valueOf(z4));
    }
}
