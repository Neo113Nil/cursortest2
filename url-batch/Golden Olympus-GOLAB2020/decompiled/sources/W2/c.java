package W2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final BigInteger f9646a;

    /* renamed from: b, reason: collision with root package name */
    protected final BigInteger f9647b;

    /* renamed from: c, reason: collision with root package name */
    protected final BigInteger f9648c;

    /* renamed from: d, reason: collision with root package name */
    protected final BigInteger f9649d;

    /* renamed from: e, reason: collision with root package name */
    protected final BigInteger f9650e;

    /* renamed from: f, reason: collision with root package name */
    protected final BigInteger f9651f;

    /* renamed from: g, reason: collision with root package name */
    protected final BigInteger f9652g;

    /* renamed from: h, reason: collision with root package name */
    protected final BigInteger f9653h;

    /* renamed from: i, reason: collision with root package name */
    protected final int f9654i;

    public c(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i4) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f9646a = bigInteger;
        this.f9647b = bigInteger2;
        this.f9648c = bigIntegerArr[0];
        this.f9649d = bigIntegerArr[1];
        this.f9650e = bigIntegerArr2[0];
        this.f9651f = bigIntegerArr2[1];
        this.f9652g = bigInteger3;
        this.f9653h = bigInteger4;
        this.f9654i = i4;
    }

    private static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public BigInteger b() {
        return this.f9646a;
    }
}
