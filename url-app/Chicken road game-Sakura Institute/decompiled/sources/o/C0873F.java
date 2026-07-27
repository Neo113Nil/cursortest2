package o;

import A.C0028y;
import D.C0120c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import m0.C0855c;
import y2.AbstractC1343r;

/* renamed from: o.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873F extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8617k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8618l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8619m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873F(C0891i0 c0891i0, C2.a aVar) {
        super(2, aVar);
        this.f8619m = c0891i0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0873F) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0873F c0873f = new C0873F(this.f8619m, aVar);
        c0873f.f8618l = obj;
        return c0873f;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8617k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f8618l;
            C0855c c0855c = new C0855c();
            C0891i0 c0891i0 = this.f8619m;
            C0871D c0871d = new C0871D(c0891i0, c0802c, new A.J(c0891i0, 5, c0855c), new C0028y(c0855c, 27, c0891i0), new C0872E(c0891i0, 0), new C0872E(c0891i0, 1), new C0120c(c0855c, 8, c0891i0), null);
            this.f8617k = 1;
            if (W2.B.d(c0871d, this) == aVar) {
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
