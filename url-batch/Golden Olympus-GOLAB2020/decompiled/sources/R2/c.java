package R2;

import S2.f;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes3.dex */
public abstract class c implements AlgorithmParameterSpec {

    /* renamed from: a, reason: collision with root package name */
    private S2.c f9176a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f9177b;

    /* renamed from: c, reason: collision with root package name */
    private f f9178c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f9179d;

    /* renamed from: e, reason: collision with root package name */
    private BigInteger f9180e;

    public c(S2.c cVar, f fVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f9176a = cVar;
        this.f9178c = fVar.s();
        this.f9179d = bigInteger;
        this.f9180e = bigInteger2;
        this.f9177b = bArr;
    }

    public S2.c a() {
        return this.f9176a;
    }

    public f b() {
        return this.f9178c;
    }

    public BigInteger c() {
        return this.f9179d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return a().i(cVar.a()) && b().d(cVar.b());
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }
}
