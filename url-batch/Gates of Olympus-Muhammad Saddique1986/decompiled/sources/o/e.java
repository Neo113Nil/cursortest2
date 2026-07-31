package o;

import R1.y;
import e2.InterfaceC0426e;
import n.r;
import n0.C0700A;
import n0.EnumC0712j;
import n0.s;
import p.U0;

/* loaded from: classes.dex */
public final class e extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f7391f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A0.l f7393h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(A0.l lVar, V1.d dVar) {
        super(2, dVar);
        this.f7393h = lVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((e) o((V1.d) obj2, (C0700A) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        e eVar = new e(this.f7393h, dVar);
        eVar.f7392g = obj;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0700A c0700a;
        s sVar;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7391f;
        if (i3 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f7392g;
            this.f7392g = c0700a;
            this.f7391f = 1;
            obj = r.d(c0700a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                sVar = (s) obj;
                if (sVar != null) {
                    sVar.a();
                }
                return y.f4171a;
            }
            c0700a = (C0700A) this.f7392g;
            R1.a.e(obj);
        }
        s sVar2 = (s) obj;
        sVar2.a();
        A0.l lVar = this.f7393h;
        ((n) lVar.f134f).f7419a.setValue(new l(sVar2.f7310c));
        this.f7392g = null;
        this.f7391f = 2;
        obj = U0.d(c0700a, EnumC0712j.f7296e, this);
        if (obj == aVar) {
            return aVar;
        }
        sVar = (s) obj;
        if (sVar != null) {
        }
        return y.f4171a;
    }
}
