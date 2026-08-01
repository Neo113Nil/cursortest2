package s7;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f8954d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8955e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c6.l f8956i;

    public q3(c6.l lVar, long j, long j3) {
        Objects.requireNonNull(lVar);
        this.f8956i = lVar;
        this.f8954d = j;
        this.f8955e = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1 o1Var = ((q1) ((t3) this.f8956i.f1830i).f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new b7.k(15, this));
    }
}
