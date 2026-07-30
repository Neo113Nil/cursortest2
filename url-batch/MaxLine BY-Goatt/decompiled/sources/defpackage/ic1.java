package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ic1 extends jo2 {
    public final o30 r;

    public ic1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.r = q41.a(this, this, function2);
    }

    @Override // defpackage.n61
    public final void a0() {
        try {
            o30 b = q41.b(this.r);
            aa2.a aVar = aa2.m;
            j8.U(b, Unit.a);
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            resumeWith(new ba2(th));
            throw th;
        }
    }
}
