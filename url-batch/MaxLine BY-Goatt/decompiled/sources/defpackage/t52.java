package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class t52 {
    public final lc1 a;

    public t52(Function0 function0) {
        this.a = new lc1(function0);
    }

    public abstract ye a(Object obj);

    public r33 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r33 c(ye yeVar, r33 r33Var) {
        Object obj = yeVar.b;
        boolean z = yeVar.d;
        te0 te0Var = null;
        if (r33Var instanceof te0) {
            if (z) {
                te0Var = (te0) r33Var;
                te0Var.a.setValue(yeVar.c());
            }
        } else if ((r33Var instanceof cp2) && ((yeVar.c || obj != null) && !z)) {
            cp2 cp2Var = (cp2) r33Var;
            if (Intrinsics.b(yeVar.c(), cp2Var.a)) {
                te0Var = cp2Var;
            }
        }
        if (te0Var != null) {
            return te0Var;
        }
        if (!z) {
            return new cp2(yeVar.c());
        }
        zm2 zm2Var = (zm2) yeVar.a;
        if (zm2Var == null) {
            zm2Var = by1.B;
        }
        return new te0(new lz1(obj, zm2Var));
    }
}
