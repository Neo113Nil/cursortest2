package R4;

import d4.C0324f;
import d4.InterfaceC0325g;
import f4.C0374a;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k implements b4.e {

    /* renamed from: a, reason: collision with root package name */
    public final h f2115a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2116b;

    /* renamed from: c, reason: collision with root package name */
    public final O4.a f2117c;

    /* renamed from: d, reason: collision with root package name */
    public long f2118d;

    /* renamed from: e, reason: collision with root package name */
    public b4.i f2119e = b4.i.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public V3.f f2120f;

    /* renamed from: g, reason: collision with root package name */
    public Q4.b f2121g;

    public k(h hVar, O4.a aVar) {
        this.f2115a = hVar;
        this.f2116b = (b) hVar.f2109c.get();
        this.f2117c = aVar;
    }

    @Override // b4.e
    public void b() {
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
        gVar.x(a7, new o(hVar.f2108b, this.f2117c, this.f2118d, j4, ((C0324f) InterfaceC0325g.a(a7)).f3957a, this.f2119e, this.f2120f, this.f2121g));
    }

    @Override // b4.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k d(a4.e eVar, Object obj) {
        if (eVar != null && !eVar.f3140b.isEmpty() && obj != null) {
            if (this.f2121g == null) {
                b bVar = this.f2116b;
                bVar.getClass();
                this.f2121g = new Q4.b(128, bVar.f2094a);
            }
            this.f2121g.put(eVar, obj);
        }
        return this;
    }

    public k h(V3.f fVar) {
        this.f2120f = fVar;
        return this;
    }

    @Override // b4.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public k a(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return h(new V3.f(2, str));
    }

    @Override // b4.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public k e(b4.i iVar) {
        this.f2119e = iVar;
        return this;
    }

    @Override // b4.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public k c(Instant instant) {
        long epochSecond;
        int nano;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f2118d = nanos + nano;
        return this;
    }
}
