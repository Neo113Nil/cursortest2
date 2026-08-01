package a3;

import android.graphics.Canvas;
import c2.b2;
import c2.c2;
import c2.g0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.m2;
import u.m0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f217e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f218i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f219r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(i1.t tVar, i1.k kVar, Function1 function1) {
        super(1);
        this.f216d = 2;
        this.f217e = tVar;
        this.f218i = kVar;
        this.f219r = (wd.p) function1;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.jvm.functions.Function1, wd.p] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue;
        switch (this.f216d) {
            case 0:
                e0 e0Var = (e0) this.f217e;
                g0 g0Var = (g0) this.f219r;
                e0 e0Var2 = (e0) this.f218i;
                k1.n p4 = ((m1.d) obj).s().p();
                if (e0Var.getView().getVisibility() != 8) {
                    e0Var.M = true;
                    d2.v vVar = g0Var.B;
                    if (!(vVar instanceof d2.v)) {
                        vVar = null;
                    }
                    if (vVar != null) {
                        Canvas a9 = k1.c.a(p4);
                        vVar.getAndroidViewsHandler$ui().getClass();
                        e0Var2.draw(a9);
                    }
                    e0Var.M = false;
                }
                return Unit.f5554a;
            case 1:
                c2 c2Var = (c2) obj;
                g1.e eVar = (g1.e) c2Var;
                if (!((g1.b) c2.k.v((g1.e) this.f218i).m40getDragAndDropManager()).f4227b.contains(eVar) || !c6.f.e(eVar, cf.c.y((d9.c) this.f219r))) {
                    return b2.f1499d;
                }
                ((wd.b0) this.f217e).f10141d = c2Var;
                return b2.f1501i;
            case 2:
                i1.t tVar = (i1.t) obj;
                if (Intrinsics.a(tVar, (i1.t) this.f217e)) {
                    booleanValue = false;
                } else {
                    if (Intrinsics.a(tVar, ((i1.k) this.f218i).f4603c)) {
                        i0.l("Focus search landed at the root.");
                        return null;
                    }
                    booleanValue = ((Boolean) ((wd.p) this.f219r).invoke(tVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new a1.i((b1.w) this.f217e, this.f218i, (u.o) this.f219r, 3);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                k1.d0 d0Var = (k1.d0) obj;
                m2 m2Var = (m2) this.f218i;
                m2 m2Var2 = (m2) this.f217e;
                d0Var.b(m2Var2 != null ? ((Number) m2Var2.getValue()).floatValue() : 1.0f);
                d0Var.c(m2Var != null ? ((Number) m2Var.getValue()).floatValue() : 1.0f);
                d0Var.e(m2Var != null ? ((Number) m2Var.getValue()).floatValue() : 1.0f);
                m2 m2Var3 = (m2) this.f219r;
                d0Var.h(m2Var3 != null ? ((k1.i0) m2Var3.getValue()).f5328a : k1.i0.f5326b);
                return Unit.f5554a;
            default:
                u.i0 i0Var = (u.i0) this.f219r;
                int ordinal = ((u.w) obj).ordinal();
                k1.i0 i0Var2 = null;
                if (ordinal == 0) {
                    m0 m0Var = i0Var.f9520a;
                } else if (ordinal == 1) {
                    i0Var2 = (k1.i0) this.f217e;
                } else {
                    if (ordinal != 2) {
                        a2.r.p();
                        return null;
                    }
                    m0 m0Var2 = i0Var.f9520a;
                }
                return new k1.i0(i0Var2 != null ? i0Var2.f5328a : k1.i0.f5326b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e0 e0Var, g0 g0Var, e0 e0Var2) {
        super(1);
        this.f216d = 0;
        this.f217e = e0Var;
        this.f219r = g0Var;
        this.f218i = e0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i3) {
        super(1);
        this.f216d = i3;
        this.f217e = obj;
        this.f218i = obj2;
        this.f219r = obj3;
    }
}
