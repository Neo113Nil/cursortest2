package u6;

import kotlin.coroutines.CoroutineContext;
import n6.AbstractC0786t;
import s6.AbstractC0898a;

/* loaded from: classes.dex */
public final class l extends AbstractC0786t {

    /* renamed from: i, reason: collision with root package name */
    public static final l f8120i = new l();

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        C0953e.f8108l.f8110i.d(runnable, true, false);
    }

    @Override // n6.AbstractC0786t
    public final void F(CoroutineContext coroutineContext, Runnable runnable) {
        C0953e.f8108l.f8110i.d(runnable, true, true);
    }

    @Override // n6.AbstractC0786t
    public final AbstractC0786t H(int i2) {
        AbstractC0898a.a(i2);
        return i2 >= k.f8117d ? this : super.H(i2);
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
