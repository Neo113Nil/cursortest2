package u2;

import q2.AbstractC0837y;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class q implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.g f9715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9716e;

    public q(s2.g gVar, int i3) {
        this.f9715d = gVar;
        this.f9716e = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // t2.InterfaceC1054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, V1.d dVar) {
        p pVar;
        W1.a aVar;
        int i3;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i4 = pVar.f9714i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pVar.f9714i = i4 - Integer.MIN_VALUE;
                Object obj2 = pVar.f9712g;
                aVar = W1.a.f4608d;
                i3 = pVar.f9714i;
                if (i3 != 0) {
                    R1.a.e(obj2);
                    S1.x xVar = new S1.x(this.f9716e, obj);
                    pVar.f9714i = 1;
                    if (this.f9715d.f(pVar, xVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R1.a.e(obj2);
                        return R1.y.f4171a;
                    }
                    R1.a.e(obj2);
                }
                pVar.f9714i = 2;
                if (AbstractC0837y.B(pVar) == aVar) {
                    return aVar;
                }
                return R1.y.f4171a;
            }
        }
        pVar = new p(this, dVar);
        Object obj22 = pVar.f9712g;
        aVar = W1.a.f4608d;
        i3 = pVar.f9714i;
        if (i3 != 0) {
        }
        pVar.f9714i = 2;
        if (AbstractC0837y.B(pVar) == aVar) {
        }
        return R1.y.f4171a;
    }
}
