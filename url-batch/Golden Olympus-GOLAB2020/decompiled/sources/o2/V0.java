package o2;

import t2.C3428C;

/* loaded from: classes3.dex */
final class V0 extends C3428C implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final long f42028f;

    public V0(long j4, kotlin.coroutines.d dVar) {
        super(dVar.getContext(), dVar);
        this.f42028f = j4;
    }

    @Override // o2.AbstractC3317a, o2.D0
    public String q0() {
        return super.q0() + "(timeMillis=" + this.f42028f + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        F(W0.a(this.f42028f, U.b(getContext()), this));
    }
}
