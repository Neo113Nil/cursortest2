package C0;

import android.content.Context;
import b2.AbstractC0279e;
import java.util.UUID;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D0.k f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.i f364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f366e;

    public t(u uVar, D0.k kVar, UUID uuid, s0.i iVar, Context context) {
        this.f366e = uVar;
        this.f362a = kVar;
        this.f363b = uuid;
        this.f364c = iVar;
        this.f365d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f362a.f428a instanceof D0.a)) {
                String uuid = this.f363b.toString();
                B0.q g6 = this.f366e.f369c.g(uuid);
                if (g6 == null || AbstractC0279e.a(g6.f174b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                this.f366e.f368b.g(uuid, this.f364c);
                this.f365d.startService(A0.b.a(this.f365d, AbstractC1477a.p(g6), this.f364c));
            }
            this.f362a.k(null);
        } catch (Throwable th) {
            this.f362a.l(th);
        }
    }
}
