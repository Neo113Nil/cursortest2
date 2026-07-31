package m0;

import androidx.work.impl.WorkDatabase;
import d0.s;
import l0.q;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    private static final String f18852i = d0.j.f("StopWorkRunnable");

    /* renamed from: f, reason: collision with root package name */
    private final e0.i f18853f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18854g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18855h;

    public i(e0.i iVar, String str, boolean z6) {
        this.f18853f = iVar;
        this.f18854g = str;
        this.f18855h = z6;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o7;
        WorkDatabase o8 = this.f18853f.o();
        e0.d m7 = this.f18853f.m();
        q B = o8.B();
        o8.c();
        try {
            boolean h7 = m7.h(this.f18854g);
            if (this.f18855h) {
                o7 = this.f18853f.m().n(this.f18854g);
            } else {
                if (!h7 && B.h(this.f18854g) == s.RUNNING) {
                    B.j(s.ENQUEUED, this.f18854g);
                }
                o7 = this.f18853f.m().o(this.f18854g);
            }
            d0.j.c().a(f18852i, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f18854g, Boolean.valueOf(o7)), new Throwable[0]);
            o8.r();
        } finally {
            o8.g();
        }
    }
}
