package H5;

import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class s0 extends M5.s implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public final long f1099j;

    public s0(long j4, AbstractC0607c abstractC0607c) {
        super(abstractC0607c.getContext(), abstractC0607c);
        this.f1099j = j4;
    }

    @Override // H5.g0
    public final String K() {
        return super.K() + "(timeMillis=" + this.f1099j + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0165z.f(this.f1053h);
        n(new r0("Timed out waiting for " + this.f1099j + " ms", this));
    }
}
