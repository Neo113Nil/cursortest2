package y5;

import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import v5.C0975a;
import x5.C1012b;

/* loaded from: classes.dex */
public class k implements I4.e {

    /* renamed from: a, reason: collision with root package name */
    public final h f8686a;

    /* renamed from: b, reason: collision with root package name */
    public final C1048b f8687b;

    /* renamed from: c, reason: collision with root package name */
    public final C0975a f8688c;

    /* renamed from: d, reason: collision with root package name */
    public long f8689d;

    /* renamed from: e, reason: collision with root package name */
    public I4.i f8690e = I4.i.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public C4.i f8691f;

    /* renamed from: g, reason: collision with root package name */
    public C1012b f8692g;

    public k(h hVar, C0975a c0975a) {
        this.f8686a = hVar;
        this.f8687b = (C1048b) hVar.f8680c.get();
        this.f8688c = c0975a;
    }

    @Override // I4.e
    public void b() {
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
        gVar.v(a7, new n(hVar.f8679b, this.f8688c, this.f8689d, j, ((K4.f) K4.g.a(a7)).f1461a, this.f8690e, this.f8691f, this.f8692g));
    }

    @Override // I4.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k f(H4.e eVar, Object obj) {
        if (eVar != null && !eVar.f991b.isEmpty() && obj != null) {
            if (this.f8692g == null) {
                C1048b c1048b = this.f8687b;
                c1048b.getClass();
                this.f8692g = new C1012b(128, c1048b.f8666a);
            }
            this.f8692g.put(eVar, obj);
        }
        return this;
    }

    public k h(C4.i iVar) {
        this.f8691f = iVar;
        return this;
    }

    @Override // I4.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public k a(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return h(new C4.i(2, str));
    }

    @Override // I4.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public k d(I4.i iVar) {
        this.f8690e = iVar;
        return this;
    }

    @Override // I4.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public k e(Instant instant) {
        long epochSecond;
        int nano;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f8689d = nanos + nano;
        return this;
    }
}
