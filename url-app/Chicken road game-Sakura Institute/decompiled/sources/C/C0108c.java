package C;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0937m;
import r0.AbstractC1065f;
import y2.AbstractC1343r;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108c extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1076k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f1077l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0109d f1078m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0937m f1079n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108c(p pVar, C0109d c0109d, C0937m c0937m, C2.a aVar) {
        super(2, aVar);
        this.f1077l = pVar;
        this.f1078m = c0109d;
        this.f1079n = c0937m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0108c) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0108c(this.f1077l, this.f1078m, this.f1079n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1076k;
        C0937m c0937m = this.f1079n;
        C0109d c0109d = this.f1078m;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                p pVar = this.f1077l;
                this.f1076k = 1;
                if (pVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
            }
            c0109d.f1080D.g(c0937m);
            AbstractC1065f.n(c0109d);
            return Unit.f7487a;
        } catch (Throwable th) {
            c0109d.f1080D.g(c0937m);
            AbstractC1065f.n(c0109d);
            throw th;
        }
    }
}
