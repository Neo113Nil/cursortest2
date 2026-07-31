package v0;

import android.content.Context;
import java.util.UUID;
import t0.C0650b;
import u0.C0686p;
import w0.C0709a;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0.j f6088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UUID f6089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0.i f6090h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f6091i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f6092j;

    public p(q qVar, w0.j jVar, UUID uuid, l0.i iVar, Context context) {
        this.f6092j = qVar;
        this.f6088f = jVar;
        this.f6089g = uuid;
        this.f6090h = iVar;
        this.f6091i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f6088f.f6173f instanceof C0709a)) {
                String uuid = this.f6089g.toString();
                C0686p g7 = this.f6092j.f6095c.g(uuid);
                if (g7 == null || W4.o.a(g7.f6001b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((m0.f) this.f6092j.f6094b).g(uuid, this.f6090h);
                this.f6091i.startService(C0650b.a(this.f6091i, i6.g.n(g7), this.f6090h));
            }
            this.f6088f.i(null);
        } catch (Throwable th) {
            this.f6088f.j(th);
        }
    }
}
