package M3;

import a3.C0182a;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l implements W2.e {

    /* renamed from: a, reason: collision with root package name */
    public final i f1969a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1970b;

    /* renamed from: c, reason: collision with root package name */
    public final J3.a f1971c;

    /* renamed from: d, reason: collision with root package name */
    public long f1972d;

    /* renamed from: e, reason: collision with root package name */
    public W2.i f1973e = W2.i.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public Q2.f f1974f;

    /* renamed from: g, reason: collision with root package name */
    public L3.b f1975g;

    public l(i iVar, J3.a aVar) {
        this.f1969a = iVar;
        this.f1970b = (g) iVar.f1963c.get();
        this.f1971c = aVar;
    }

    @Override // W2.e
    public void c() {
        i iVar = this.f1969a;
        if (iVar.f1965e != null) {
            return;
        }
        C0182a a6 = C0182a.a();
        long a7 = J3.d.f1367a.a(true);
        h hVar = iVar.f1964d;
        hVar.r(a6, new p(iVar.f1962b, this.f1971c, this.f1972d, a7, ((Y2.f) Y2.g.a(a6)).f3694a, this.f1973e, this.f1974f, this.f1975g));
    }

    @Override // W2.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l f(V2.e eVar, Object obj) {
        if (eVar != null && !eVar.f3237b.isEmpty() && obj != null) {
            if (this.f1975g == null) {
                b bVar = (b) this.f1970b;
                bVar.getClass();
                this.f1975g = new L3.b(bVar.f1947b, 128);
            }
            this.f1975g.put(eVar, obj);
        }
        return this;
    }

    public l h(Q2.f fVar) {
        this.f1974f = fVar;
        return this;
    }

    @Override // W2.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public l b(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return h(new Q2.f(2, str));
    }

    @Override // W2.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public l e(W2.i iVar) {
        this.f1973e = iVar;
        return this;
    }

    @Override // W2.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public l d(Instant instant) {
        long epochSecond;
        int nano;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f1972d = nanos + nano;
        return this;
    }
}
