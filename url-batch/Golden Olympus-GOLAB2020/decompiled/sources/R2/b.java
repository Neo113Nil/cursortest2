package R2;

import S2.f;
import X2.e;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes3.dex */
public class b extends ECParameterSpec {

    /* renamed from: a, reason: collision with root package name */
    private String f9175a;

    public b(String str, S2.c cVar, f fVar, BigInteger bigInteger) {
        super(a(cVar, null), c(fVar), bigInteger, 1);
        this.f9175a = str;
    }

    private static EllipticCurve a(S2.c cVar, byte[] bArr) {
        return new EllipticCurve(b(cVar.o()), cVar.k().r(), cVar.l().r(), bArr);
    }

    private static ECField b(X2.a aVar) {
        if (S2.a.d(aVar)) {
            return new ECFieldFp(aVar.c());
        }
        e a4 = ((X2.f) aVar).a();
        int[] a5 = a4.a();
        return new ECFieldF2m(a4.b(), Z2.a.l(Z2.a.f(a5, 1, a5.length - 1)));
    }

    private static ECPoint c(f fVar) {
        f s4 = fVar.s();
        return new ECPoint(s4.e().r(), s4.f().r());
    }
}
