package ge;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l1 extends r1 {

    /* renamed from: r, reason: collision with root package name */
    public final ld.a f4378r;

    public l1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f4378r = md.f.a(function2, this, this);
    }

    @Override // ge.k1
    public final void Y() {
        try {
            ld.a b10 = md.f.b(this.f4378r);
            hd.l lVar = hd.n.f4511e;
            le.b.g(Unit.f5554a, b10);
        } catch (Throwable th) {
            th = th;
            if (th instanceof g0) {
                th = ((g0) th).f4351d;
            }
            hd.l lVar2 = hd.n.f4511e;
            resumeWith(cf.c.n(th));
            throw th;
        }
    }
}
