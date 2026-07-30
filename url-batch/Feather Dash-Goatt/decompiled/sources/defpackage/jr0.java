package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jr0 implements rf {
    public final qc d;
    public final /* synthetic */ kr0 e;

    public jr0(kr0 kr0Var, qc qcVar) {
        qcVar.getClass();
        this.e = kr0Var;
        this.d = qcVar;
    }

    @Override // defpackage.rf
    public final void cancel() {
        kr0 kr0Var = this.e;
        m9 m9Var = kr0Var.b;
        qc qcVar = this.d;
        m9Var.remove(qcVar);
        if (Intrinsics.a(kr0Var.c, qcVar)) {
            qcVar.getClass();
            kr0Var.c = null;
        }
        qcVar.getClass();
        qcVar.b.remove(this);
        Function0 function0 = qcVar.c;
        if (function0 != null) {
            function0.invoke();
        }
        qcVar.c = null;
    }
}
