package X6;

import c6.C0542a;
import c6.InterfaceC0543b;
import g6.C4531a;
import j6.InterfaceC4606h;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class a implements Z6.a {

    /* renamed from: a, reason: collision with root package name */
    public final C4707a f3830a;

    /* renamed from: b, reason: collision with root package name */
    public final U6.a f3831b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3832c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3833d;

    /* renamed from: e, reason: collision with root package name */
    public final C4531a f3834e;

    /* renamed from: f, reason: collision with root package name */
    public final h6.i f3835f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3836g;

    /* renamed from: h, reason: collision with root package name */
    public final C0542a f3837h;
    public final b6.f i;

    public a(C4707a c4707a, U6.a aVar, long j9, long j10, C4531a c4531a, h6.i iVar, int i, C0542a c0542a, b6.f fVar) {
        if (c4707a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f3830a = c4707a;
        if (aVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f3831b = aVar;
        this.f3832c = j9;
        this.f3833d = j10;
        if (c4531a == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f3834e = c4531a;
        if (iVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f3835f = iVar;
        this.f3836g = i;
        if (c0542a == null) {
            throw new NullPointerException("Null extendedAttributes");
        }
        this.f3837h = c0542a;
        this.i = fVar;
    }

    @Override // Y6.a
    public final h6.i b() {
        return this.f3835f;
    }

    @Override // Y6.a
    public final b6.g c() {
        return this.i;
    }

    @Override // Y6.a
    public final long d() {
        return this.f3833d;
    }

    @Override // Y6.a
    public final int e() {
        return this.f3836g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3830a.equals(aVar.f3830a) || !this.f3831b.equals(aVar.f3831b) || this.f3832c != aVar.f3832c || this.f3833d != aVar.f3833d || !this.f3834e.equals(aVar.f3834e) || !this.f3835f.equals(aVar.f3835f) || this.f3836g != aVar.f3836g || !this.f3837h.equals(aVar.f3837h)) {
            return false;
        }
        b6.f fVar = aVar.i;
        b6.f fVar2 = this.i;
        if (fVar2 == null) {
            if (fVar != null) {
                return false;
            }
        } else if (!fVar2.equals(fVar)) {
            return false;
        }
        return true;
    }

    @Override // Y6.a
    public final String f() {
        return null;
    }

    @Override // Z6.a
    public final InterfaceC0543b g() {
        return this.f3837h;
    }

    @Override // Y6.a
    public final InterfaceC4606h h() {
        return this.f3834e;
    }

    public final int hashCode() {
        int hashCode = (((this.f3830a.hashCode() ^ 1000003) * 1000003) ^ this.f3831b.hashCode()) * 1000003;
        long j9 = this.f3832c;
        int i = (hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f3833d;
        int hashCode2 = (((((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f3834e.hashCode()) * 1000003) ^ this.f3835f.hashCode()) * (-721379959)) ^ this.f3836g) * 1000003) ^ this.f3837h.hashCode()) * 1000003;
        b6.f fVar = this.i;
        return (hashCode2 ^ (fVar == null ? 0 : ((String) fVar.f5570b).hashCode())) * 1000003;
    }

    @Override // Y6.a
    public final String i() {
        return null;
    }

    @Override // Y6.a
    public final long j() {
        return this.f3832c;
    }

    @Override // Y6.a
    public final C4707a k() {
        return this.f3830a;
    }

    @Override // Y6.a
    public final U6.a l() {
        return this.f3831b;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.f3830a + ", instrumentationScopeInfo=" + this.f3831b + ", timestampEpochNanos=" + this.f3832c + ", observedTimestampEpochNanos=" + this.f3833d + ", spanContext=" + this.f3834e + ", severity=" + this.f3835f + ", severityText=null, totalAttributeCount=" + this.f3836g + ", extendedAttributes=" + this.f3837h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
