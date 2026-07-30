package i7;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class a implements AlgorithmParameterSpec {
    public static final String PROVABLY_SECURE_I = org.bouncycastle.pqc.crypto.qtesla.c.getName(5);
    public static final String PROVABLY_SECURE_III = org.bouncycastle.pqc.crypto.qtesla.c.getName(6);
    private String securityCategory;

    public a(String str) {
        this.securityCategory = str;
    }

    public String getSecurityCategory() {
        return this.securityCategory;
    }
}
