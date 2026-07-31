package h1;

import e2.InterfaceC0424c;

/* renamed from: h1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507z extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public Throwable f6216h;

    /* renamed from: i, reason: collision with root package name */
    public int f6217i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f6218j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507z(M m3, V1.d dVar) {
        super(1, dVar);
        this.f6218j = m3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        return new C0507z(this.f6218j, (V1.d) obj).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Throwable th;
        X x3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6217i;
        M m3 = this.f6218j;
        try {
        } catch (Throwable th2) {
            W f3 = m3.f();
            this.f6216h = th2;
            this.f6217i = 2;
            Integer a3 = f3.a();
            if (a3 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a3;
        }
        if (i3 == 0) {
            R1.a.e(obj);
            this.f6217i = 1;
            obj = M.e(m3, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f6216h;
                R1.a.e(obj);
                x3 = new P(((Number) obj).intValue(), th);
                return new R1.i(x3, Boolean.TRUE);
            }
            R1.a.e(obj);
        }
        x3 = (X) obj;
        return new R1.i(x3, Boolean.TRUE);
    }
}
