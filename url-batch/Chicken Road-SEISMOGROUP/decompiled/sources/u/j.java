package u;

import E.s;
import a.AbstractC0016a;
import android.app.Activity;
import d0.p;
import m.ExecutorC0069e;
import m0.r;
import v.InterfaceC0094a;

/* loaded from: classes.dex */
public final class j extends Y.f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1283f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0088b f1285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Activity f1286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0088b c0088b, Activity activity, W.d dVar) {
        super(dVar);
        this.f1285h = c0088b;
        this.f1286i = activity;
    }

    @Override // Y.b
    public final W.d b(Object obj, W.d dVar) {
        j jVar = new j(this.f1285h, this.f1286i, dVar);
        jVar.f1284g = obj;
        return jVar;
    }

    @Override // Y.b
    public final Object c(Object obj) {
        X.a aVar = X.a.f450b;
        int i2 = this.f1283f;
        if (i2 == 0) {
            AbstractC0016a.D(obj);
            r rVar = (r) this.f1284g;
            s sVar = new s(1, rVar);
            C0088b c0088b = this.f1285h;
            ((InterfaceC0094a) c0088b.f1267c).a(this.f1286i, new ExecutorC0069e(), sVar);
            i iVar = new i(c0088b, sVar);
            this.f1283f = 1;
            if (m0.j.a(rVar, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0016a.D(obj);
        }
        return U.g.f433a;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((j) b((r) obj, (W.d) obj2)).c(U.g.f433a);
    }
}
