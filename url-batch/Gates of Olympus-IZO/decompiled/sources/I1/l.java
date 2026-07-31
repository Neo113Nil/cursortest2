package I1;

import L1.z;
import M1.n;
import java.util.ArrayList;
import java.util.List;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import n2.C0692Q;

/* loaded from: classes.dex */
public final class l extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f2482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, P1.d dVar) {
        super(2, dVar);
        this.f2482f = mVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new l(this.f2482f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((l) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        i iVar;
        ArrayList arrayList;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2481e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f2481e = 1;
            if (AbstractC0552y.e(750L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        C0692Q c0692q = this.f2482f.f2484c;
        do {
            value = c0692q.getValue();
            iVar = (i) value;
            List<c> list = iVar.f2470a;
            arrayList = new ArrayList(n.g0(list, 10));
            for (c cVar : list) {
                if (!cVar.f2463g) {
                    cVar = c.a(cVar, false, false, 95);
                }
                arrayList.add(cVar);
            }
        } while (!c0692q.i(value, i.a(iVar, arrayList, 0, 0, false, false, 0, 110)));
        return z.f2729a;
    }
}
