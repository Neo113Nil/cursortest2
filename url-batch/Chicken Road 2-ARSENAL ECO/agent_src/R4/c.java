package R4;

import d4.InterfaceC0326h;
import f5.C0387a;

/* loaded from: classes.dex */
public final class c implements S4.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0387a f2095a;

    /* renamed from: b, reason: collision with root package name */
    public final O4.a f2096b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2097c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2098d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0326h f2099e;

    /* renamed from: f, reason: collision with root package name */
    public final b4.i f2100f;

    /* renamed from: g, reason: collision with root package name */
    public final V3.c f2101g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2102h;

    /* renamed from: i, reason: collision with root package name */
    public final V3.g f2103i;

    public c(C0387a c0387a, O4.a aVar, long j4, long j7, InterfaceC0326h interfaceC0326h, b4.i iVar, V3.a aVar2, int i7, V3.g gVar) {
        if (c0387a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f2095a = c0387a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f2096b = aVar;
        this.f2097c = j4;
        this.f2098d = j7;
        if (interfaceC0326h == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f2099e = interfaceC0326h;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f2100f = iVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f2101g = aVar2;
        this.f2102h = i7;
        this.f2103i = gVar;
    }

    @Override // S4.a
    public final int a() {
        return this.f2102h;
    }

    @Override // S4.a
    public final String b() {
        return null;
    }

    @Override // S4.a
    public final InterfaceC0326h d() {
        return this.f2099e;
    }

    @Override // S4.a
    public final b4.i e() {
        return this.f2100f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        C0387a c0387a = cVar.f2095a;
        V3.g gVar = cVar.f2103i;
        if (!this.f2095a.equals(c0387a) || !this.f2096b.equals(cVar.f2096b) || this.f2097c != cVar.f2097c || this.f2098d != cVar.f2098d || !this.f2099e.equals(cVar.f2099e) || !this.f2100f.equals(cVar.f2100f) || !this.f2101g.equals(cVar.f2101g) || this.f2102h != cVar.f2102h) {
            return false;
        }
        V3.g gVar2 = this.f2103i;
        if (gVar2 == null) {
            if (gVar != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar)) {
            return false;
        }
        return true;
    }

    @Override // S4.a
    public final String f() {
        return null;
    }

    @Override // S4.a
    public final long g() {
        return this.f2097c;
    }

    @Override // S4.a
    public final V3.c getAttributes() {
        return this.f2101g;
    }

    @Override // S4.a
    public final V3.g h() {
        return this.f2103i;
    }

    public final int hashCode() {
        int hashCode = (((this.f2095a.hashCode() ^ 1000003) * 1000003) ^ this.f2096b.hashCode()) * 1000003;
        long j4 = this.f2097c;
        int i7 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j7 = this.f2098d;
        int hashCode2 = (((((((((i7 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f2099e.hashCode()) * 1000003) ^ this.f2100f.hashCode()) * (-721379959)) ^ this.f2101g.hashCode()) * 1000003) ^ this.f2102h) * 1000003;
        V3.g gVar = this.f2103i;
        return (hashCode2 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
    }

    @Override // S4.a
    public final C0387a i() {
        return this.f2095a;
    }

    @Override // S4.a
    public final long j() {
        return this.f2098d;
    }

    @Override // S4.a
    public final O4.a k() {
        return this.f2096b;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f2095a + ", instrumentationScopeInfo=" + this.f2096b + ", timestampEpochNanos=" + this.f2097c + ", observedTimestampEpochNanos=" + this.f2098d + ", spanContext=" + this.f2099e + ", severity=" + this.f2100f + ", severityText=null, attributes=" + this.f2101g + ", totalAttributeCount=" + this.f2102h + ", bodyValue=" + this.f2103i + ", eventName=null}";
    }
}
