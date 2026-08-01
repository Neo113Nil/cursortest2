package b3;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.i0;
import n0.z0;
import wd.g0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Object obj) {
        super(2);
        this.f1058d = i3;
        this.f1059e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f1058d;
        boolean z10 = false;
        Object obj3 = this.f1059e;
        switch (i3) {
            case 0:
                i0 i0Var = (i0) obj;
                int intValue = ((Number) obj2).intValue();
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    Object L = i0Var.L();
                    if (L == n0.k.f6729a) {
                        L = d.f1057d;
                        i0Var.g0(L);
                    }
                    AtomicInteger atomicInteger = j2.k.f4979a;
                    k7.e.c(new j2.b((Function1) L, false), (Function2) ((z0) obj3).getValue(), i0Var, 0);
                } else {
                    i0Var.R();
                }
                return Unit.f5554a;
            case 1:
                ((Number) obj2).intValue();
                ((n) obj3).a(n0.h.z(1), (i0) obj);
                return Unit.f5554a;
            case 2:
                d1.l lVar = (d1.l) obj;
                d1.l lVar2 = (d1.j) obj2;
                i0 i0Var2 = (i0) obj3;
                if (lVar2 instanceof d1.g) {
                    x.k kVar = ((d1.g) lVar2).f3302b;
                    g0.c(3, kVar);
                    lVar2 = w.B((d1.l) kVar.a(d1.i.f3304a, i0Var2, 0), i0Var2);
                }
                return lVar.c(lVar2);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                i0 i0Var3 = (i0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (i0Var3.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((d2.a) obj3).a(0, i0Var3);
                } else {
                    i0Var3.R();
                }
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                ((d2.z0) obj3).a(n0.h.z(1), (i0) obj);
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                ((f1.e) obj3).m(((Number) obj).intValue(), (j2.m) obj2);
                return Unit.f5554a;
            default:
                u.w wVar = (u.w) obj;
                u.w wVar2 = (u.w) obj2;
                u.w wVar3 = u.w.f9557i;
                if (wVar == wVar3 && wVar2 == wVar3 && !((u.i0) obj3).f9520a.f9534b) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(d2.a aVar, int i3, int i10) {
        super(2);
        this.f1058d = i10;
        this.f1059e = aVar;
    }
}
