package Q0;

import android.content.Context;
import java.util.UUID;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R0.k f2329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UUID f2330e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G0.j f2331i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f2332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f2333m;

    public r(s sVar, R0.k kVar, UUID uuid, G0.j jVar, Context context) {
        this.f2333m = sVar;
        this.f2329d = kVar;
        this.f2330e = uuid;
        this.f2331i = jVar;
        this.f2332l = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f2329d.f2395d instanceof R0.a)) {
                String uuid = this.f2330e.toString();
                P0.p g7 = this.f2333m.f2336c.g(uuid);
                if (g7 == null || g7.f2221b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((H0.f) this.f2333m.f2335b).g(uuid, this.f2331i);
                this.f2332l.startService(O0.b.a(this.f2332l, AbstractC1053a.x(g7), this.f2331i));
            }
            this.f2329d.i(null);
        } catch (Throwable th) {
            this.f2329d.j(th);
        }
    }
}
