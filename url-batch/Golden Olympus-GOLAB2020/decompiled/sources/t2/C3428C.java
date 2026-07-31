package t2;

import a2.AbstractC1241b;
import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3311E;
import o2.AbstractC3317a;

/* renamed from: t2.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3428C extends AbstractC3317a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.d f46201e;

    public C3428C(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext, true, true);
        this.f46201e = dVar;
    }

    @Override // o2.D0
    protected void C(Object obj) {
        AbstractC3441l.c(AbstractC1241b.c(this.f46201e), AbstractC3311E.a(obj, this.f46201e), null, 2, null);
    }

    @Override // o2.AbstractC3317a
    protected void O0(Object obj) {
        kotlin.coroutines.d dVar = this.f46201e;
        dVar.resumeWith(AbstractC3311E.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f46201e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // o2.D0
    protected final boolean j0() {
        return true;
    }
}
