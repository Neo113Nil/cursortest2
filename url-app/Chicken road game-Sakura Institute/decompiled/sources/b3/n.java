package b3;

import W2.AbstractC0298u;
import W2.C0286h;
import W2.D;
import W2.E;
import W2.L;
import W2.w0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class n extends AbstractC0298u implements E {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f5680i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0298u f5681j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5682k;

    /* JADX WARN: Multi-variable type inference failed */
    public n(AbstractC0298u abstractC0298u, String str) {
        E e4 = abstractC0298u instanceof E ? (E) abstractC0298u : null;
        this.f5680i = e4 == null ? D.f4221a : e4;
        this.f5681j = abstractC0298u;
        this.f5682k = str;
    }

    @Override // W2.E
    public final void n(long j4, C0286h c0286h) {
        this.f5680i.n(j4, c0286h);
    }

    @Override // W2.E
    public final L p(long j4, w0 w0Var, CoroutineContext coroutineContext) {
        return this.f5680i.p(j4, w0Var, coroutineContext);
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        this.f5681j.t(coroutineContext, runnable);
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return this.f5682k;
    }

    @Override // W2.AbstractC0298u
    public final boolean u(CoroutineContext coroutineContext) {
        return this.f5681j.u(coroutineContext);
    }
}
