package u0;

import W.J;
import Y.z;
import android.net.Uri;
import q0.C1377t;

/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f15487a = C1377t.f15067b.getAndIncrement();

    /* renamed from: b, reason: collision with root package name */
    public final Y.k f15488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15489c;

    /* renamed from: d, reason: collision with root package name */
    public final z f15490d;

    /* renamed from: e, reason: collision with root package name */
    public final p f15491e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f15492f;

    public q(Y.h hVar, Y.k kVar, int i4, p pVar) {
        this.f15490d = new z(hVar);
        this.f15488b = kVar;
        this.f15489c = i4;
        this.f15491e = pVar;
    }

    @Override // u0.k
    public final void c() {
        this.f15490d.f3753b = 0L;
        Y.j jVar = new Y.j(this.f15490d, this.f15488b);
        try {
            jVar.f3695a.b(jVar.f3696b);
            jVar.f3698d = true;
            Uri B4 = this.f15490d.f3752a.B();
            B4.getClass();
            this.f15492f = this.f15491e.u(B4, jVar);
        } finally {
            J.h(jVar);
        }
    }

    @Override // u0.k
    public final void d() {
    }
}
