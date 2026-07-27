package g2;

import G.C0231x;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class r implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6747d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f6748e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f6749i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6750j;

    public r(s sVar, e eVar, o2.s sVar2) {
        this.f6749i = sVar;
        this.f6748e = eVar;
        this.f6750j = sVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6747d) {
            case 0:
                s sVar = this.f6749i;
                C0231x c0231x = (C0231x) sVar.f6757g;
                e eVar = this.f6748e;
                l2.i.a(eVar);
                c0231x.b();
                return s.h(sVar, new h2.f(h2.e.f6877e, eVar, (o2.s) this.f6750j));
            default:
                C0639b B = C0639b.B((HashMap) this.f6750j);
                s sVar2 = this.f6749i;
                C0231x c0231x2 = (C0231x) sVar2.f6757g;
                e eVar2 = this.f6748e;
                c0231x2.b();
                return s.h(sVar2, new h2.c(h2.e.f6877e, eVar2, B));
        }
    }

    public r(s sVar, HashMap hashMap, e eVar) {
        this.f6749i = sVar;
        this.f6750j = hashMap;
        this.f6748e = eVar;
    }
}
