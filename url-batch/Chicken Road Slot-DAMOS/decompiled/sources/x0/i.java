package x0;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.i0;
import n0.q;
import n0.s1;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f10235a = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public static final j f10236b = new j(0, new long[0], new Object[0]);

    public static final int a(int i3, int i10) {
        return i3 << (((i10 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(i0 i0Var, Function2 function2) {
        function2.getClass();
        g0.c(2, function2);
        function2.invoke(i0Var, 1);
    }

    public static final d d(int i3, hd.c cVar, i0 i0Var) {
        Object L = i0Var.L();
        if (L == n0.k.f6729a) {
            L = new d(i3, true, cVar);
            i0Var.g0(L);
        }
        d dVar = (d) L;
        if (!dVar.f10224i.equals(cVar)) {
            dVar.f10224i = cVar;
            if (dVar.f10223e) {
                s1 s1Var = dVar.f10225r;
                if (s1Var != null) {
                    q qVar = s1Var.f6809a;
                    if (qVar != null) {
                        qVar.r(s1Var, null);
                    }
                    dVar.f10225r = null;
                }
                ArrayList arrayList = dVar.f10226s;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        s1 s1Var2 = (s1) arrayList.get(i10);
                        q qVar2 = s1Var2.f6809a;
                        if (qVar2 != null) {
                            qVar2.r(s1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return dVar;
    }

    public static final boolean e(s1 s1Var, s1 s1Var2) {
        return s1Var == null || !s1Var.a() || s1Var.equals(s1Var2) || Intrinsics.a(s1Var.f6811c, s1Var2.f6811c);
    }
}
