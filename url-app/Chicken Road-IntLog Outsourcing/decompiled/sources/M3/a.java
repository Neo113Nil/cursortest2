package M3;

import a4.AbstractC0197c;

/* loaded from: classes.dex */
public final class a implements O3.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0197c f1938a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.a f1939b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1940c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1941d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.a f1942e;

    /* renamed from: f, reason: collision with root package name */
    public final W2.i f1943f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1944g;

    /* renamed from: h, reason: collision with root package name */
    public final R2.a f1945h;

    /* renamed from: i, reason: collision with root package name */
    public final Q2.f f1946i;

    public a(AbstractC0197c abstractC0197c, J3.a aVar, long j2, long j6, V2.a aVar2, W2.i iVar, int i2, R2.a aVar3, Q2.f fVar) {
        if (abstractC0197c == null) {
            throw new NullPointerException("Null resource");
        }
        this.f1938a = abstractC0197c;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f1939b = aVar;
        this.f1940c = j2;
        this.f1941d = j6;
        if (aVar2 == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f1942e = aVar2;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f1943f = iVar;
        this.f1944g = i2;
        if (aVar3 == null) {
            throw new NullPointerException("Null extendedAttributes");
        }
        this.f1945h = aVar3;
        this.f1946i = fVar;
    }

    @Override // N3.a
    public final int b() {
        return this.f1944g;
    }

    @Override // N3.a
    public final String c() {
        return null;
    }

    @Override // O3.a
    public final R2.b d() {
        return this.f1945h;
    }

    @Override // N3.a
    public final Y2.h e() {
        return this.f1942e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1938a.equals(aVar.f1938a) && this.f1939b.equals(aVar.f1939b) && this.f1940c == aVar.f1940c && this.f1941d == aVar.f1941d && this.f1942e.equals(aVar.f1942e) && this.f1943f.equals(aVar.f1943f) && this.f1944g == aVar.f1944g && this.f1945h.equals(aVar.f1945h)) {
            Q2.f fVar = aVar.f1946i;
            Q2.f fVar2 = this.f1946i;
            if (fVar2 == null) {
                if (fVar == null) {
                    return true;
                }
            } else if (fVar2.equals(fVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // N3.a
    public final W2.i f() {
        return this.f1943f;
    }

    @Override // N3.a
    public final String g() {
        return null;
    }

    @Override // N3.a
    public final long h() {
        return this.f1940c;
    }

    public final int hashCode() {
        int hashCode = (((this.f1938a.hashCode() ^ 1000003) * 1000003) ^ this.f1939b.hashCode()) * 1000003;
        long j2 = this.f1940c;
        int i2 = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j6 = this.f1941d;
        int hashCode2 = (((((((((i2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f1942e.hashCode()) * 1000003) ^ this.f1943f.hashCode()) * (-721379959)) ^ this.f1944g) * 1000003) ^ this.f1945h.hashCode()) * 1000003;
        Q2.f fVar = this.f1946i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f2488b).hashCode())) * 1000003;
    }

    @Override // N3.a
    public final Q2.g i() {
        return this.f1946i;
    }

    @Override // N3.a
    public final AbstractC0197c j() {
        return this.f1938a;
    }

    @Override // N3.a
    public final long k() {
        return this.f1941d;
    }

    @Override // N3.a
    public final J3.a l() {
        return this.f1939b;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.f1938a + ", instrumentationScopeInfo=" + this.f1939b + ", timestampEpochNanos=" + this.f1940c + ", observedTimestampEpochNanos=" + this.f1941d + ", spanContext=" + this.f1942e + ", severity=" + this.f1943f + ", severityText=null, totalAttributeCount=" + this.f1944g + ", extendedAttributes=" + this.f1945h + ", bodyValue=" + this.f1946i + ", eventName=null}";
    }
}
