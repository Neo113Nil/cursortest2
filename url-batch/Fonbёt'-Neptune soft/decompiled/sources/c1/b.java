package c1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    public c[] f1999e;

    /* renamed from: f, reason: collision with root package name */
    public int f2000f;

    /* renamed from: g, reason: collision with root package name */
    public int f2001g;

    public final void b(b1.r rVar) {
        synchronized (this) {
            try {
                int i2 = this.f2000f - 1;
                this.f2000f = i2;
                if (i2 == 0) {
                    this.f2001g = 0;
                }
                Q0.h.c(rVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b1.r.f1961a.set(rVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
