package w;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import o.P0;
import o.R0;
import y2.AbstractC1343r;

/* renamed from: w.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285z extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11369k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f11370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11371m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285z(C0802C c0802c, A.a0 a0Var, C2.a aVar) {
        super(2, aVar);
        this.f11370l = c0802c;
        this.f11371m = a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1285z) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1285z(this.f11370l, this.f11371m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f11369k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1271k c1271k = new C1271k(this.f11371m, 1);
            this.f11369k = 1;
            Object d4 = W2.B.d(new P0(this.f11370l, R0.f8710a, null, null, c1271k, null), this);
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 == obj2) {
                return obj2;
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
