package d3;

import W2.AbstractC0298u;
import b3.n;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class l extends AbstractC0298u {

    /* renamed from: i, reason: collision with root package name */
    public static final l f6130i = new l();

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        e.f6118j.f6120i.b(runnable, true, false);
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // W2.AbstractC0298u
    public final AbstractC0298u z(int i2, String str) {
        b3.a.c(i2);
        return i2 >= k.f6127d ? str != null ? new n(this, str) : this : super.z(i2, str);
    }
}
