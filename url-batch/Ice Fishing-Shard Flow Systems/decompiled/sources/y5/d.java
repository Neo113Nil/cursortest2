package y5;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import x5.C1018h;

/* loaded from: classes.dex */
public final class d extends k implements I4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1018h f8676h;

    @Override // y5.k, I4.e
    public final I4.e a(String str) {
        super.a(str);
        return this;
    }

    @Override // y5.k, I4.e
    public final void b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        h hVar = this.f8686a;
        if (hVar.f8682e != null) {
            return;
        }
        M4.a a7 = M4.a.a();
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        long j = nanos + nano;
        g gVar = hVar.f8681d;
        gVar.v(a7, new f(hVar.f8679b, this.f8688c, this.f8689d, j, ((K4.f) K4.g.a(a7)).f1461a, this.f8690e, this.f8691f, this.f8676h));
    }

    @Override // I4.e
    public I4.e c(C4.f fVar) {
        if (fVar != null && !fVar.isEmpty()) {
            fVar.forEach(new C4.c(2, this));
        }
        return this;
    }

    @Override // y5.k, I4.e
    public final I4.e d(I4.i iVar) {
        this.f8690e = iVar;
        return this;
    }

    @Override // y5.k, I4.e
    public final I4.e e(Instant instant) {
        super.e(instant);
        return this;
    }

    @Override // y5.k, I4.e
    public final /* bridge */ /* synthetic */ I4.e f(H4.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // y5.k
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ k f(H4.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // y5.k
    public final k h(C4.i iVar) {
        this.f8691f = iVar;
        return this;
    }

    @Override // y5.k
    /* renamed from: i */
    public final k a(String str) {
        super.a(str);
        return this;
    }

    @Override // y5.k
    /* renamed from: j */
    public final k d(I4.i iVar) {
        this.f8690e = iVar;
        return this;
    }

    @Override // y5.k
    /* renamed from: k */
    public final k e(Instant instant) {
        super.e(instant);
        return this;
    }

    public final void l(H4.e eVar, Object obj) {
        if (eVar == null || eVar.f991b.isEmpty() || obj == null) {
            return;
        }
        E4.a c7 = E4.a.c(eVar);
        if (c7.f701b.isEmpty()) {
            return;
        }
        if (this.f8676h == null) {
            C1048b c1048b = this.f8687b;
            c1048b.getClass();
            this.f8676h = new C1018h(128, c1048b.f8666a);
        }
        this.f8676h.put(c7, obj);
    }
}
