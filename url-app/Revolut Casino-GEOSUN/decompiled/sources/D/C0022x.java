package D;

import u0.C0247g;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022x extends y0.f implements E0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f277i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I f278j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022x(I i2, w0.d dVar) {
        super(1, dVar);
        this.f278j = i2;
    }

    @Override // E0.l
    public final Object i(Object obj) {
        return new C0022x(this.f278j, (w0.d) obj).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f277i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f277i = 1;
            obj = this.f278j.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
