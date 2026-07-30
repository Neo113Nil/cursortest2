package U;

import E0.p;
import android.app.Activity;
import u0.C0247g;

/* loaded from: classes.dex */
public final class j extends y0.f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f1017i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1018j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f1019k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f1020l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, w0.d dVar) {
        super(2, dVar);
        this.f1019k = bVar;
        this.f1020l = activity;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        j jVar = new j(this.f1019k, this.f1020l, dVar);
        jVar.f1018j = obj;
        return jVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((j) b((O0.p) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f1017i;
        if (i2 == 0) {
            o.g.z(obj);
            O0.p pVar = (O0.p) this.f1018j;
            i iVar = new i(0, pVar);
            b bVar = this.f1019k;
            ((V.a) bVar.f1001f).b(this.f1020l, new J.d(), iVar);
            F.b bVar2 = new F.b(1, bVar, iVar);
            this.f1017i = 1;
            if (O0.i.b(pVar, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0247g.f3005a;
    }
}
