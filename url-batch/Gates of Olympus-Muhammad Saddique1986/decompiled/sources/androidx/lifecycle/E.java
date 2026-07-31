package androidx.lifecycle;

import e2.InterfaceC0426e;
import p1.C0803b;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class E extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public y2.a f5150h;

    /* renamed from: i, reason: collision with root package name */
    public C0803b f5151i;

    /* renamed from: j, reason: collision with root package name */
    public int f5152j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f5153k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0803b f5154l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(y2.c cVar, C0803b c0803b, V1.d dVar) {
        super(2, dVar);
        this.f5153k = cVar;
        this.f5154l = c0803b;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((E) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new E(this.f5153k, this.f5154l, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [y2.a] */
    @Override // X1.a
    public final Object q(Object obj) {
        y2.c cVar;
        C0803b c0803b;
        y2.a aVar;
        Throwable th;
        W1.a aVar2 = W1.a.f4608d;
        int i3 = this.f5152j;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                cVar = this.f5153k;
                this.f5150h = cVar;
                c0803b = this.f5154l;
                this.f5151i = c0803b;
                this.f5152j = 1;
                if (cVar.c(null, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f5150h;
                    try {
                        R1.a.e(obj);
                        ((y2.c) aVar).e(null);
                        return R1.y.f4171a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((y2.c) aVar).e(null);
                        throw th;
                    }
                }
                c0803b = this.f5151i;
                ?? r3 = this.f5150h;
                R1.a.e(obj);
                cVar = r3;
            }
            D d3 = new D(c0803b, null);
            this.f5150h = cVar;
            this.f5151i = null;
            this.f5152j = 2;
            if (AbstractC0837y.e(d3, this) == aVar2) {
                return aVar2;
            }
            aVar = cVar;
            ((y2.c) aVar).e(null);
            return R1.y.f4171a;
        } catch (Throwable th3) {
            aVar = cVar;
            th = th3;
            ((y2.c) aVar).e(null);
            throw th;
        }
    }
}
