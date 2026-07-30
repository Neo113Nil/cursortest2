package z6;

import java.util.Enumeration;
import org.bouncycastle.asn1.cryptopro.b;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.x9.e;

/* loaded from: classes5.dex */
public class a {
    public static Enumeration getNames() {
        return b.getNames();
    }

    public static org.bouncycastle.jce.spec.b getParameterSpec(String str) {
        e byNameX9 = b.getByNameX9(str);
        if (byNameX9 == null) {
            try {
                byNameX9 = b.getByOIDX9(new o(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (byNameX9 == null) {
            return null;
        }
        return new org.bouncycastle.jce.spec.b(str, byNameX9.getCurve(), byNameX9.getG(), byNameX9.getN(), byNameX9.getH(), byNameX9.getSeed());
    }
}
