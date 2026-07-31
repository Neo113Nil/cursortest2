package R4;

import d4.C0324f;
import d4.InterfaceC0325g;
import f4.C0374a;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d extends k implements b4.e {

    /* renamed from: h, reason: collision with root package name */
    public Q4.g f2104h;

    @Override // R4.k, b4.e
    public final b4.e a(String str) {
        super.a(str);
        return this;
    }

    @Override // R4.k, b4.e
    public final void b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        h hVar = this.f2115a;
        if (hVar.f2111e != null) {
            return;
        }
        C0374a a7 = C0374a.a();
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        long j4 = nanos + nano;
        g gVar = hVar.f2110d;
        gVar.x(a7, new f(hVar.f2108b, this.f2117c, this.f2118d, j4, ((C0324f) InterfaceC0325g.a(a7)).f3957a, this.f2119e, this.f2120f, this.f2104h));
    }

    @Override // R4.k, b4.e
    public final b4.e c(Instant instant) {
        super.c(instant);
        return this;
    }

    @Override // R4.k, b4.e
    public final /* bridge */ /* synthetic */ b4.e d(a4.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // R4.k, b4.e
    public final b4.e e(b4.i iVar) {
        this.f2119e = iVar;
        return this;
    }

    @Override // b4.e
    public b4.e f(V3.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new I4.a(3, this));
        }
        return this;
    }

    @Override // R4.k
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ k d(a4.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // R4.k
    public final k h(V3.f fVar) {
        this.f2120f = fVar;
        return this;
    }

    @Override // R4.k
    /* renamed from: i */
    public final k a(String str) {
        super.a(str);
        return this;
    }

    @Override // R4.k
    /* renamed from: j */
    public final k e(b4.i iVar) {
        this.f2119e = iVar;
        return this;
    }

    @Override // R4.k
    /* renamed from: k */
    public final k c(Instant instant) {
        super.c(instant);
        return this;
    }

    public final void l(a4.e eVar, Object obj) {
        if (eVar == null || eVar.f3140b.isEmpty() || obj == null) {
            return;
        }
        X3.a c7 = X3.a.c(eVar);
        if (c7.f2864b.isEmpty()) {
            return;
        }
        if (this.f2104h == null) {
            b bVar = this.f2116b;
            bVar.getClass();
            this.f2104h = new Q4.g(128, bVar.f2094a);
        }
        this.f2104h.put(c7, obj);
    }
}
