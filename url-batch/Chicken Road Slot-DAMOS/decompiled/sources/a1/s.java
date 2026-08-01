package a1;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final c6.c f50a = new c6.c(1, new e(1, 0), new f(1));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object b(Object[] objArr, c6.c cVar, Function0 function0, i0 i0Var, int i3, int i10) {
        Object[] objArr2;
        c6.c cVar2;
        final Object obj;
        Object e2;
        final String l10 = Long.toString(i0Var.T, CharsKt.checkRadix(36));
        l10.getClass();
        final m mVar = (m) i0Var.j(p.f46a);
        Object L = i0Var.L();
        Object obj2 = n0.k.f6729a;
        if (L == obj2) {
            Object invoke = (mVar == null || (e2 = mVar.e(l10)) == null) ? null : ((Function1) cVar.f1810i).invoke(e2);
            if (invoke == null) {
                invoke = function0.invoke();
            }
            objArr2 = objArr;
            cVar2 = cVar;
            Object cVar3 = new c(cVar2, mVar, l10, invoke, objArr2);
            i0Var.g0(cVar3);
            L = cVar3;
        } else {
            objArr2 = objArr;
            cVar2 = cVar;
        }
        final c cVar4 = (c) L;
        Object obj3 = Arrays.equals(objArr2, cVar4.f12s) ? cVar4.f11r : null;
        if (obj3 == null) {
            obj3 = function0.invoke();
        }
        boolean h10 = i0Var.h(cVar4) | ((((i3 & 112) ^ 48) > 32 && i0Var.h(cVar2)) || (i3 & 48) == 32) | i0Var.h(mVar) | i0Var.f(l10) | i0Var.h(obj3) | i0Var.h(objArr2);
        Object L2 = i0Var.L();
        if (h10 || L2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final c6.c cVar5 = cVar2;
            Object obj4 = new Function0() { // from class: a1.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z10;
                    c cVar6 = c.this;
                    m mVar2 = cVar6.f9e;
                    m mVar3 = mVar;
                    boolean z11 = true;
                    if (mVar2 != mVar3) {
                        cVar6.f9e = mVar3;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str = cVar6.f10i;
                    String str2 = l10;
                    if (Intrinsics.a(str, str2)) {
                        z11 = z10;
                    } else {
                        cVar6.f10i = str2;
                    }
                    cVar6.f8d = cVar5;
                    cVar6.f11r = obj;
                    cVar6.f12s = objArr3;
                    l lVar = cVar6.f13t;
                    if (lVar != null && z11) {
                        ((n) lVar).L();
                        cVar6.f13t = null;
                        cVar6.a();
                    }
                    return Unit.f5554a;
                }
            };
            i0Var.g0(obj4);
            L2 = obj4;
        } else {
            obj = obj3;
        }
        n0.h.g((Function0) L2, i0Var);
        return obj;
    }

    public static final j c(i0 i0Var) {
        i0Var.W(1967007413);
        Object[] objArr = new Object[0];
        Object L = i0Var.L();
        if (L == n0.k.f6729a) {
            L = new k(0);
            i0Var.g0(L);
        }
        j jVar = (j) b(Arrays.copyOf(objArr, 0), j.f32e, (Function0) L, i0Var, 3456, 0);
        jVar.f35c = (m) i0Var.j(p.f46a);
        i0Var.p(false);
        return jVar;
    }
}
