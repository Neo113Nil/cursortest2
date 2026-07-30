package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qs1 extends a implements g61 {
    public static final qs1 n = new qs1(qb2.U);

    @Override // defpackage.g61
    public final Object J(r30 r30Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.g61
    public final boolean b() {
        return true;
    }

    @Override // defpackage.g61
    public final ec0 o(Function1 function1) {
        return rs1.m;
    }

    @Override // defpackage.g61
    public final ec0 q(boolean z, boolean z2, rk rkVar) {
        return rs1.m;
    }

    @Override // defpackage.g61
    public final bu s(n61 n61Var) {
        return rs1.m;
    }

    @Override // defpackage.g61
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.g61
    public final CancellationException v() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.g61, defpackage.gt
    public final void f(CancellationException cancellationException) {
    }
}
