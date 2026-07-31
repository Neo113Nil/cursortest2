package e1;

import k2.AbstractC0552y;

/* renamed from: e1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344G extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f4613e;

    /* renamed from: f, reason: collision with root package name */
    public int f4614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0351N f4615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P1.i f4616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ R1.i f4617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0344G(C0351N c0351n, P1.i iVar, Y1.e eVar, P1.d dVar) {
        super(1, dVar);
        this.f4615g = c0351n;
        this.f4616h = iVar;
        this.f4617i = (R1.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0344G(this.f4615g, this.f4616h, this.f4617i, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Type inference failed for: r6v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0354c c0354c;
        Object obj2;
        Object obj3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4614f;
        C0351N c0351n = this.f4615g;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f4614f = 1;
            obj = C0351N.c(c0351n, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f4613e;
                    I2.l.Q(obj);
                    return obj3;
                }
                c0354c = (C0354c) this.f4613e;
                I2.l.Q(obj);
                obj2 = c0354c.f4682b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0354c.f4683c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (Z1.i.a(c0354c.f4682b, obj)) {
                    return obj;
                }
                this.f4613e = obj;
                this.f4614f = 3;
                if (c0351n.i(obj, true, this) == aVar) {
                    return aVar;
                }
                obj3 = obj;
                return obj3;
            }
            I2.l.Q(obj);
        }
        c0354c = (C0354c) obj;
        C0343F c0343f = new C0343F(this.f4617i, c0354c, null);
        this.f4613e = c0354c;
        this.f4614f = 2;
        obj = AbstractC0552y.y(this.f4616h, c0343f, this);
        if (obj == aVar) {
            return aVar;
        }
        obj2 = c0354c.f4682b;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0354c.f4683c) {
        }
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((C0344G) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
