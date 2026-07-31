package b4;

import c6.m;
import i6.i;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1241h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1242j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f1243k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p6.e eVar, g6.c cVar, int i) {
        super(2, cVar);
        this.f1241h = i;
        switch (i) {
            case 1:
                this.f1243k = (i) eVar;
                super(2, cVar);
                break;
            default:
                this.f1243k = (i) eVar;
                break;
        }
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a aVar = (a) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f1241h) {
        }
        return ((b) l(cVar, aVar)).p(m.f1757a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i6.i, p6.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i6.i, p6.e] */
    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1241h) {
            case 0:
                b bVar = new b(this.f1243k, cVar, 0);
                bVar.f1242j = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f1243k, cVar, 1);
                bVar2.f1242j = obj;
                return bVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i6.i, p6.e] */
    /* JADX WARN: Type inference failed for: r4v14, types: [i6.i, p6.e] */
    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f1241h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    a aVar = (a) this.f1242j;
                    this.i = 1;
                    obj = this.f1243k.g(aVar, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                a aVar3 = (a) obj;
                q6.i.c(aVar3, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) aVar3.f1240b.f1050e).set(true);
                return aVar3;
            default:
                int i8 = this.i;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar4 = (a) this.f1242j;
                    s6.a.K(obj);
                    return aVar4;
                }
                s6.a.K(obj);
                a aVar5 = new a(new LinkedHashMap(((a) this.f1242j).a()), false);
                this.f1242j = aVar5;
                this.i = 1;
                Object g3 = this.f1243k.g(aVar5, this);
                h6.a aVar6 = h6.a.f3204d;
                return g3 == aVar6 ? aVar6 : aVar5;
        }
    }
}
