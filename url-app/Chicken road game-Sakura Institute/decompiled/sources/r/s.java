package r;

import C.F;
import G.C0199g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.S;
import r0.E;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class s extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f9543k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9545m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, int i2, int i4, C2.a aVar) {
        super(2, aVar);
        this.f9543k = vVar;
        this.f9544l = i2;
        this.f9545m = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((s) j((C2.a) obj2, (S) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new s(this.f9543k, this.f9544l, this.f9545m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        v vVar = this.f9543k;
        F f4 = vVar.f9554d;
        int d4 = ((C0199g0) f4.f1052b).d();
        int i2 = this.f9544l;
        int i4 = this.f9545m;
        if (d4 != i2 || ((C0199g0) f4.f1053c).d() != i4) {
            vVar.f9563m.c();
        }
        f4.i(i2, i4);
        f4.f1054d = null;
        E e4 = vVar.f9560j;
        if (e4 != null) {
            e4.k();
        }
        return Unit.f7487a;
    }
}
