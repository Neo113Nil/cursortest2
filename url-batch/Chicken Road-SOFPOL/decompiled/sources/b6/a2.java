package b6;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a2 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1261h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Object obj, g6.c cVar, int i) {
        super(2, cVar);
        this.f1261h = i;
        this.i = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f1261h) {
            case 0:
                a2 a2Var = (a2) l(cVar, uVar);
                c6.m mVar = c6.m.f1757a;
                a2Var.p(mVar);
                return mVar;
            default:
                a2 a2Var2 = (a2) l(cVar, uVar);
                c6.m mVar2 = c6.m.f1757a;
                a2Var2.p(mVar2);
                return mVar2;
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1261h) {
            case 0:
                return new a2((m0.z0) this.i, cVar, 0);
            default:
                return new a2((u2.p) this.i, cVar, 1);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f1261h;
        c6.m mVar = c6.m.f1757a;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                s6.a.K(obj);
                m0.z0 z0Var = (m0.z0) obj2;
                ArrayList arrayList = new ArrayList(50);
                for (int i8 = 0; i8 < 50; i8++) {
                    t6.d dVar = t6.e.f6924d;
                    arrayList.add(new b2(dVar.a() * 1000.0f, (dVar.a() * 2000.0f) - 2000.0f, (dVar.a() * 5.0f) + 2.0f, (dVar.a() * 3.0f) + 1.0f, (dVar.a() * 0.5f) + 0.5f));
                }
                z0Var.setValue(arrayList);
                break;
            default:
                s6.a.K(obj);
                ((u2.p) obj2).show();
                break;
        }
        return mVar;
    }
}
