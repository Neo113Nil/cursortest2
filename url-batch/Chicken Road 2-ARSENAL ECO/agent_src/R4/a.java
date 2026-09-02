package R4;

import d4.InterfaceC0326h;
import f5.C0387a;

/* loaded from: classes.dex */
public final class a implements T4.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0387a f2084a;

    /* renamed from: b, reason: collision with root package name */
    public final O4.a f2085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2086c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2087d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0326h f2088e;

    /* renamed from: f, reason: collision with root package name */
    public final b4.i f2089f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2090g;

    /* renamed from: h, reason: collision with root package name */
    public final W3.b f2091h;

    /* renamed from: i, reason: collision with root package name */
    public final V3.g f2092i;

    public a(C0387a c0387a, O4.a aVar, long j4, long j7, InterfaceC0326h interfaceC0326h, b4.i iVar, int i7, W3.a aVar2, V3.g gVar) {
        if (c0387a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f2084a = c0387a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f2085b = aVar;
        this.f2086c = j4;
        this.f2087d = j7;
        if (interfaceC0326h == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f2088e = interfaceC0326h;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f2089f = iVar;
        this.f2090g = i7;
        if (aVar2 == null) {
            throw new NullPointerException("Null extendedAttributes");
        }
        this.f2091h = aVar2;
        this.f2092i = gVar;
    }

    @Override // S4.a
    public final int a() {
        return this.f2090g;
    }

    @Override // S4.a
    public final String b() {
        return null;
    }

    @Override // T4.a
    public final W3.b c() {
        return this.f2091h;
    }

    @Override // S4.a
    public final InterfaceC0326h d() {
        return this.f2088e;
    }

    @Override // S4.a
    public final b4.i e() {
        return this.f2089f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        C0387a c0387a = aVar.f2084a;
        V3.g gVar = aVar.f2092i;
        if (!this.f2084a.equals(c0387a) || !this.f2085b.equals(aVar.f2085b) || this.f2086c != aVar.f2086c || this.f2087d != aVar.f2087d || !this.f2088e.equals(aVar.f2088e) || !this.f2089f.equals(aVar.f2089f) || this.f2090g != aVar.f2090g || !this.f2091h.equals(aVar.f2091h)) {
            return false;
        }
        V3.g gVar2 = this.f2092i;
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
        return this.f2086c;
    }

    @Override // S4.a
    public final V3.g h() {
        return this.f2092i;
    }

    public final int hashCode() {
        int hashCode = (((this.f2084a.hashCode() ^ 1000003) * 1000003) ^ this.f2085b.hashCode()) * 1000003;
        long j4 = this.f2086c;
        int i7 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j7 = this.f2087d;
        int hashCode2 = (((((((((i7 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f2088e.hashCode()) * 1000003) ^ this.f2089f.hashCode()) * (-721379959)) ^ this.f2090g) * 1000003) ^ this.f2091h.hashCode()) * 1000003;
        V3.g gVar = this.f2092i;
        return (hashCode2 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
    }

    @Override // S4.a
    public final C0387a i() {
        return this.f2084a;
    }

    @Override // S4.a
    public final long j() {
        return this.f2087d;
    }

    @Override // S4.a
    public final O4.a k() {
        return this.f2085b;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.f2084a + ", instrumentationScopeInfo=" + this.f2085b + ", timestampEpochNanos=" + this.f2086c + ", observedTimestampEpochNanos=" + this.f2087d + ", spanContext=" + this.f2088e + ", severity=" + this.f2089f + ", severityText=null, totalAttributeCount=" + this.f2090g + ", extendedAttributes=" + this.f2091h + ", bodyValue=" + this.f2092i + ", eventName=null}";
    }
}
