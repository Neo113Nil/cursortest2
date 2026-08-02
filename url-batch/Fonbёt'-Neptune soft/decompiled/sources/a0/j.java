package a0;

import P0.p;
import android.app.Activity;
import b0.InterfaceC0164a;

/* loaded from: classes.dex */
public final class j extends J0.g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f1278i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1279j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0134b f1280k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f1281l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0134b c0134b, Activity activity, H0.d dVar) {
        super(2, dVar);
        this.f1280k = c0134b;
        this.f1281l = activity;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        j jVar = new j(this.f1280k, this.f1281l, dVar);
        jVar.f1279j = obj;
        return jVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((j) b((H0.d) obj2, (a1.p) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f1278i;
        if (i2 == 0) {
            i1.a.G(obj);
            a1.p pVar = (a1.p) this.f1279j;
            i iVar = new i(0, pVar);
            C0134b c0134b = this.f1280k;
            ((InterfaceC0164a) c0134b.f1262f).a(this.f1281l, new N.d(), iVar);
            K.b bVar = new K.b(1, c0134b, iVar);
            this.f1278i = 1;
            if (a1.i.b(pVar, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return F0.h.f469a;
    }
}
