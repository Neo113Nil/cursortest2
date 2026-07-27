package m;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* renamed from: m.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839l extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8133k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8134l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0840m f8135m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0839l(C0840m c0840m, C2.a aVar) {
        super(2, aVar);
        this.f8135m = c0840m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0839l) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0839l c0839l = new C0839l(this.f8135m, aVar);
        c0839l.f8134l = obj;
        return c0839l;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8133k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f8134l;
            C0838k c0838k = new C0838k(this.f8135m, null);
            this.f8133k = 1;
            if (m3.z.g(c0802c, c0838k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
