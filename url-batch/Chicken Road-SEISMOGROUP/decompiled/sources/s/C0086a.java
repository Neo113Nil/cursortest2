package s;

import E.s;
import U.g;
import W.d;
import Y.f;
import a.AbstractC0016a;
import d0.p;
import k0.r;
import n0.c;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086a extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f1256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f1257h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086a(c cVar, s sVar, d dVar) {
        super(dVar);
        this.f1256g = cVar;
        this.f1257h = sVar;
    }

    @Override // Y.b
    public final d b(Object obj, d dVar) {
        return new C0086a(this.f1256g, this.f1257h, dVar);
    }

    @Override // Y.b
    public final Object c(Object obj) {
        X.a aVar = X.a.f450b;
        int i2 = this.f1255f;
        if (i2 == 0) {
            AbstractC0016a.D(obj);
            io.flutter.plugin.editing.a aVar2 = new io.flutter.plugin.editing.a(6, this.f1257h);
            this.f1255f = 1;
            if (this.f1256g.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0016a.D(obj);
        }
        return g.f433a;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((C0086a) b((r) obj, (d) obj2)).c(g.f433a);
    }
}
