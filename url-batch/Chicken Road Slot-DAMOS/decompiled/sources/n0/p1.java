package n0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f6776a;

    public p1(Function0 function0) {
        this.f6776a = new r0(function0);
    }

    public abstract q1 a(Object obj);

    public p2 b() {
        return this.f6776a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p2 c(q1 q1Var, p2 p2Var) {
        Object obj = q1Var.f6797e;
        boolean z10 = q1Var.f6796d;
        c0 c0Var = null;
        if (p2Var instanceof c0) {
            if (z10) {
                c0Var = (c0) p2Var;
                c0Var.f6646a.setValue(q1Var.a());
            }
        } else if ((p2Var instanceof o2) && ((q1Var.f6794b || obj != null) && !z10)) {
            o2 o2Var = (o2) p2Var;
            if (Intrinsics.a(q1Var.a(), o2Var.f6772a)) {
                c0Var = o2Var;
            }
        }
        if (c0Var != null) {
            return c0Var;
        }
        if (!z10) {
            return new o2(q1Var.a());
        }
        e eVar = q1Var.f6795c;
        if (eVar == null) {
            eVar = e.f6663u;
        }
        return new c0(new j1(obj, eVar));
    }
}
