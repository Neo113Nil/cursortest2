package x;

import com.android.mltcode.paycertification.sm2.SM2Util;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f17273a;

    public static a a() {
        if (f17273a == null) {
            f17273a = new a();
        }
        return f17273a;
    }

    public org.bouncycastle.crypto.params.j b() {
        return new org.bouncycastle.crypto.params.j(new BigInteger(1, org.bouncycastle.pqc.math.linearalgebra.b.fromHexString(new m().a())), SM2Util.DOMAIN_PARAMS);
    }

    public org.bouncycastle.crypto.params.k c() {
        return new org.bouncycastle.crypto.params.k(SM2Util.CURVE.decodePoint(org.bouncycastle.pqc.math.linearalgebra.b.fromHexString(new m().b())), SM2Util.DOMAIN_PARAMS);
    }
}
