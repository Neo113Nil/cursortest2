package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.Set;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.CryptoServiceProperties;

/* loaded from: classes9.dex */
public class BitsOfSecurityConstraint extends ServicesConstraint {
    private final int requiredBitsOfSecurity;

    public BitsOfSecurityConstraint(int i) {
        super(Collections.EMPTY_SET);
        this.requiredBitsOfSecurity = i;
    }

    @Override // org.bouncycastle.crypto.CryptoServicesConstraints
    public void check(CryptoServiceProperties cryptoServiceProperties) {
        if (!isException(cryptoServiceProperties.getServiceName()) && cryptoServiceProperties.bitsOfSecurity() < this.requiredBitsOfSecurity) {
            f$$ExternalSyntheticLambda0.m$1(this.requiredBitsOfSecurity, cryptoServiceProperties.bitsOfSecurity());
        }
    }

    public BitsOfSecurityConstraint(int i, Set<String> set) {
        super(set);
        this.requiredBitsOfSecurity = i;
    }
}
