package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oc extends pc0 implements Function0 {
    public final /* synthetic */ qc d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(qc qcVar, boolean z) {
        super(0);
        this.d = qcVar;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = this.e;
        qc qcVar = this.d;
        qcVar.a = z;
        Function0 function0 = qcVar.c;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.a;
    }
}
