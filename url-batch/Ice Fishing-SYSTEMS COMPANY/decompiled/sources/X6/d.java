package X6;

import d6.C4460a;
import j6.C4604f;
import j6.InterfaceC4605g;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import l6.C4694a;

/* loaded from: classes2.dex */
public final class d extends k implements h6.e {

    /* renamed from: h, reason: collision with root package name */
    public W6.f f3848h;

    @Override // X6.k, h6.e
    public final h6.e a(String str) {
        super.a(str);
        return this;
    }

    @Override // X6.k, h6.e
    public final void b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        h hVar = this.f3859a;
        if (hVar.f3855e != null) {
            return;
        }
        C4694a a9 = C4694a.a();
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        long j9 = nanos + nano;
        g gVar = hVar.f3854d;
        gVar.T(a9, new f(hVar.f3852b, this.f3861c, this.f3862d, j9, ((C4604f) InterfaceC4605g.a(a9)).f38577a, this.f3863e, this.f3864f, this.f3848h));
    }

    @Override // X6.k, h6.e
    public final h6.e c(h6.i iVar) {
        this.f3863e = iVar;
        return this;
    }

    @Override // h6.e
    public h6.e d(b6.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new O6.a(3, this));
        }
        return this;
    }

    @Override // X6.k, h6.e
    public final /* bridge */ /* synthetic */ h6.e e(g6.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // X6.k, h6.e
    public final h6.e f(Instant instant) {
        super.f(instant);
        return this;
    }

    @Override // X6.k
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ k e(g6.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // X6.k
    public final k h(b6.f fVar) {
        this.f3864f = fVar;
        return this;
    }

    @Override // X6.k
    /* renamed from: i */
    public final k a(String str) {
        super.a(str);
        return this;
    }

    @Override // X6.k
    /* renamed from: j */
    public final k c(h6.i iVar) {
        this.f3863e = iVar;
        return this;
    }

    @Override // X6.k
    /* renamed from: k */
    public final k f(Instant instant) {
        super.f(instant);
        return this;
    }

    public final void l(g6.e eVar, Object obj) {
        if (eVar == null || eVar.f37932b.isEmpty() || obj == null) {
            return;
        }
        C4460a c4 = C4460a.c(eVar);
        if (c4.f37203b.isEmpty()) {
            return;
        }
        if (this.f3848h == null) {
            b bVar = this.f3860b;
            bVar.getClass();
            this.f3848h = new W6.f(128, bVar.f3839a);
        }
        this.f3848h.put(c4, obj);
    }
}
