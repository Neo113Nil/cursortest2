package y5;

import v5.C0975a;
import z5.InterfaceC1060a;

/* loaded from: classes.dex */
public final class c implements InterfaceC1060a {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8667a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975a f8668b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8669c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8670d;

    /* renamed from: e, reason: collision with root package name */
    public final K4.h f8671e;

    /* renamed from: f, reason: collision with root package name */
    public final I4.i f8672f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.f f8673g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8674h;

    /* renamed from: i, reason: collision with root package name */
    public final C4.j f8675i;

    public c(M5.a aVar, C0975a c0975a, long j, long j7, K4.h hVar, I4.i iVar, C4.b bVar, int i2, C4.j jVar) {
        if (aVar == null) {
            throw new NullPointerException("Null resource");
        }
        this.f8667a = aVar;
        if (c0975a == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f8668b = c0975a;
        this.f8669c = j;
        this.f8670d = j7;
        if (hVar == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f8671e = hVar;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f8672f = iVar;
        if (bVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f8673g = bVar;
        this.f8674h = i2;
        this.f8675i = jVar;
    }

    @Override // z5.InterfaceC1060a
    public final int a() {
        return this.f8674h;
    }

    @Override // z5.InterfaceC1060a
    public final String b() {
        return null;
    }

    @Override // z5.InterfaceC1060a
    public final K4.h d() {
        return this.f8671e;
    }

    @Override // z5.InterfaceC1060a
    public final I4.i e() {
        return this.f8672f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        M5.a aVar = cVar.f8667a;
        C4.j jVar = cVar.f8675i;
        if (!this.f8667a.equals(aVar) || !this.f8668b.equals(cVar.f8668b) || this.f8669c != cVar.f8669c || this.f8670d != cVar.f8670d || !this.f8671e.equals(cVar.f8671e) || !this.f8672f.equals(cVar.f8672f) || !this.f8673g.equals(cVar.f8673g) || this.f8674h != cVar.f8674h) {
            return false;
        }
        C4.j jVar2 = this.f8675i;
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
        return this.f8669c;
    }

    @Override // z5.InterfaceC1060a
    public final C4.f getAttributes() {
        return this.f8673g;
    }

    @Override // z5.InterfaceC1060a
    public final C4.j h() {
        return this.f8675i;
    }

    public final int hashCode() {
        int hashCode = (((this.f8667a.hashCode() ^ 1000003) * 1000003) ^ this.f8668b.hashCode()) * 1000003;
        long j = this.f8669c;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f8670d;
        int hashCode2 = (((((((((i2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f8671e.hashCode()) * 1000003) ^ this.f8672f.hashCode()) * (-721379959)) ^ this.f8673g.hashCode()) * 1000003) ^ this.f8674h) * 1000003;
        C4.j jVar = this.f8675i;
        return (hashCode2 ^ (jVar == null ? 0 : jVar.hashCode())) * 1000003;
    }

    @Override // z5.InterfaceC1060a
    public final M5.a i() {
        return this.f8667a;
    }

    @Override // z5.InterfaceC1060a
    public final long j() {
        return this.f8670d;
    }

    @Override // z5.InterfaceC1060a
    public final C0975a k() {
        return this.f8668b;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f8667a + ", instrumentationScopeInfo=" + this.f8668b + ", timestampEpochNanos=" + this.f8669c + ", observedTimestampEpochNanos=" + this.f8670d + ", spanContext=" + this.f8671e + ", severity=" + this.f8672f + ", severityText=null, attributes=" + this.f8673g + ", totalAttributeCount=" + this.f8674h + ", bodyValue=" + this.f8675i + ", eventName=null}";
    }
}
