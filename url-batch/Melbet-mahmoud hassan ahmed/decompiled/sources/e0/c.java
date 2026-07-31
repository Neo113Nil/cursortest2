package e0;

import androidx.lifecycle.o;
import d0.m;

/* loaded from: classes.dex */
public class c implements m {

    /* renamed from: c, reason: collision with root package name */
    private final o<m.b> f15760c = new o<>();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.d<m.b.c> f15761d = androidx.work.impl.utils.futures.d.u();

    public c() {
        a(m.f15490b);
    }

    public void a(m.b bVar) {
        this.f15760c.f(bVar);
        if (bVar instanceof m.b.c) {
            this.f15761d.q((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f15761d.r(((m.b.a) bVar).a());
        }
    }
}
