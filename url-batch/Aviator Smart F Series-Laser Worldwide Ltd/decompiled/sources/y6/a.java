package y6;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.b;
import org.bouncycastle.crypto.params.c;

/* loaded from: classes5.dex */
public class a extends DHParameterSpec {

    /* renamed from: j, reason: collision with root package name */
    private final BigInteger f17334j;

    /* renamed from: m, reason: collision with root package name */
    private final int f17335m;

    /* renamed from: q, reason: collision with root package name */
    private final BigInteger f17336q;
    private c validationParameters;

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public b getDomainParameters() {
        return new b(getP(), getG(), this.f17336q, this.f17335m, getL(), this.f17334j, this.validationParameters);
    }

    public BigInteger getJ() {
        return this.f17334j;
    }

    public int getM() {
        return this.f17335m;
    }

    public BigInteger getQ() {
        return this.f17336q;
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i8) {
        this(bigInteger, bigInteger2, bigInteger3, null, i8);
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i8) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i8);
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i8, int i9) {
        super(bigInteger, bigInteger3, i9);
        this.f17336q = bigInteger2;
        this.f17334j = bigInteger4;
        this.f17335m = i8;
    }

    public a(b bVar) {
        this(bVar.getP(), bVar.getQ(), bVar.getG(), bVar.getJ(), bVar.getM(), bVar.getL());
        this.validationParameters = bVar.getValidationParameters();
    }
}
