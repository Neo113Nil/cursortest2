package v;

import D.C0018t;
import android.app.Activity;
import d0.p;
import m0.r;
import n.ExecutorC0078e;
import w.InterfaceC0112a;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107j extends Y.f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1286f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0099b f1288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Activity f1289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0107j(C0099b c0099b, Activity activity, W.d dVar) {
        super(dVar);
        this.f1288h = c0099b;
        this.f1289i = activity;
    }

    @Override // Y.b
    public final W.d b(Object obj, W.d dVar) {
        C0107j c0107j = new C0107j(this.f1288h, this.f1289i, dVar);
        c0107j.f1287g = obj;
        return c0107j;
    }

    @Override // Y.b
    public final Object c(Object obj) {
        X.a aVar = X.a.f395b;
        int i2 = this.f1286f;
        if (i2 == 0) {
            a.a.B(obj);
            r rVar = (r) this.f1287g;
            C0018t c0018t = new C0018t(1, rVar);
            C0099b c0099b = this.f1288h;
            ((InterfaceC0112a) c0099b.f1270c).a(this.f1289i, new ExecutorC0078e(), c0018t);
            C0106i c0106i = new C0106i(c0099b, c0018t);
            this.f1286f = 1;
            if (m0.j.a(rVar, c0106i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a.B(obj);
        }
        return U.g.f378a;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((C0107j) b((r) obj, (W.d) obj2)).c(U.g.f378a);
    }
}
