package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bg0 extends rc1 {
    public final dn j;

    public bg0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.j = qa0.a(this, this, function2);
    }

    @Override // defpackage.qb0
    public final void e0() {
        try {
            dn b = qa0.b(this.j);
            i31 i31Var = k31.d;
            m90.L(b, Unit.a);
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            l(new j31(th));
            throw th;
        }
    }
}
