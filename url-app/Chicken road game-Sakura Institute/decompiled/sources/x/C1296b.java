package x;

import E2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import m3.z;
import y2.AbstractC1343r;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296b extends j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11395k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11396l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1297c f11397m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296b(C1297c c1297c, C2.a aVar) {
        super(2, aVar);
        this.f11397m = c1297c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1296b) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1296b c1296b = new C1296b(this.f11397m, aVar);
        c1296b.f11396l = obj;
        return c1296b;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11395k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f11396l;
            C1295a c1295a = new C1295a(this.f11397m, null);
            this.f11395k = 1;
            if (z.g(c0802c, c1295a, this) == aVar) {
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
