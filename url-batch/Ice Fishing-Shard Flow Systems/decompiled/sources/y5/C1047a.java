package y5;

import v5.C0975a;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047a implements A5.a {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8656a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975a f8657b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8658c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8659d;

    /* renamed from: e, reason: collision with root package name */
    public final K4.h f8660e;

    /* renamed from: f, reason: collision with root package name */
    public final I4.i f8661f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8662g;

    /* renamed from: h, reason: collision with root package name */
    public final D4.b f8663h;

    /* renamed from: i, reason: collision with root package name */
    public final C4.j f8664i;

    public C1047a(M5.a aVar, C0975a c0975a, long j, long j7, K4.h hVar, I4.i iVar, int i2, D4.a aVar2, C4.j jVar) {
        if (aVar == null) {
            throw new NullPointerException("Null resource");
        }
        this.f8656a = aVar;
        if (c0975a == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f8657b = c0975a;
        this.f8658c = j;
        this.f8659d = j7;
        if (hVar == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f8660e = hVar;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f8661f = iVar;
        this.f8662g = i2;
        if (aVar2 == null) {
            throw new NullPointerException("Null extendedAttributes");
        }
        this.f8663h = aVar2;
        this.f8664i = jVar;
    }

    @Override // z5.InterfaceC1060a
    public final int a() {
        return this.f8662g;
    }

    @Override // z5.InterfaceC1060a
    public final String b() {
        return null;
    }

    @Override // A5.a
    public final D4.b c() {
        return this.f8663h;
    }

    @Override // z5.InterfaceC1060a
    public final K4.h d() {
        return this.f8660e;
    }

    @Override // z5.InterfaceC1060a
    public final I4.i e() {
        return this.f8661f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1047a)) {
            return false;
        }
        C1047a c1047a = (C1047a) obj;
        M5.a aVar = c1047a.f8656a;
        C4.j jVar = c1047a.f8664i;
        if (!this.f8656a.equals(aVar) || !this.f8657b.equals(c1047a.f8657b) || this.f8658c != c1047a.f8658c || this.f8659d != c1047a.f8659d || !this.f8660e.equals(c1047a.f8660e) || !this.f8661f.equals(c1047a.f8661f) || this.f8662g != c1047a.f8662g || !this.f8663h.equals(c1047a.f8663h)) {
            return false;
        }
        C4.j jVar2 = this.f8664i;
        if (jVar2 == null) {
            if (jVar != null) {
                return false;
            }
        } else if (!jVar2.equals(jVar)) {
            return false;
        }
        return true;
    }

    @Override // z5.InterfaceC1060a
    public final String f() {
        return null;
    }

    @Override // z5.InterfaceC1060a
    public final long g() {
        return this.f8658c;
    }

    @Override // z5.InterfaceC1060a
    public final C4.j h() {
        return this.f8664i;
    }

    public final int hashCode() {
        int hashCode = (((this.f8656a.hashCode() ^ 1000003) * 1000003) ^ this.f8657b.hashCode()) * 1000003;
        long j = this.f8658c;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f8659d;
        int hashCode2 = (((((((((i2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f8660e.hashCode()) * 1000003) ^ this.f8661f.hashCode()) * (-721379959)) ^ this.f8662g) * 1000003) ^ this.f8663h.hashCode()) * 1000003;
        C4.j jVar = this.f8664i;
        return (hashCode2 ^ (jVar == null ? 0 : jVar.hashCode())) * 1000003;
    }

    @Override // z5.InterfaceC1060a
    public final M5.a i() {
        return this.f8656a;
    }

    @Override // z5.InterfaceC1060a
    public final long j() {
        return this.f8659d;
    }

    @Override // z5.InterfaceC1060a
    public final C0975a k() {
        return this.f8657b;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.f8656a + ", instrumentationScopeInfo=" + this.f8657b + ", timestampEpochNanos=" + this.f8658c + ", observedTimestampEpochNanos=" + this.f8659d + ", spanContext=" + this.f8660e + ", severity=" + this.f8661f + ", severityText=null, totalAttributeCount=" + this.f8662g + ", extendedAttributes=" + this.f8663h + ", bodyValue=" + this.f8664i + ", eventName=null}";
    }
}
