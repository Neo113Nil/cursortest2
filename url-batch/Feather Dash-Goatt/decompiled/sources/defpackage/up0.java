package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class up0 extends a implements jb0 {
    public static final up0 e = new up0(j41.m);

    @Override // defpackage.jb0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.jb0
    public final rs h(Function1 function1) {
        return vp0.d;
    }

    @Override // defpackage.jb0
    public final tg k(qb0 qb0Var) {
        return vp0.d;
    }

    @Override // defpackage.jb0
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.jb0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.jb0
    public final Object x(fn fnVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.jb0
    public final rs z(boolean z, boolean z2, e eVar) {
        return vp0.d;
    }

    @Override // defpackage.jb0, defpackage.fg
    public final void a(CancellationException cancellationException) {
    }
}
