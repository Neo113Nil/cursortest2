package org.bouncycastle.pqc.crypto.lms;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class d extends org.bouncycastle.crypto.g {
    private final p[] lmsParameters;

    public d(p[] pVarArr, SecureRandom secureRandom) {
        super(secureRandom, v.calculateStrength(pVarArr[0]));
        if (pVarArr.length == 0 || pVarArr.length > 8) {
            throw new IllegalArgumentException("lmsParameters length should be between 1 and 8 inclusive");
        }
        this.lmsParameters = pVarArr;
    }

    public int getDepth() {
        return this.lmsParameters.length;
    }

    public p[] getLmsParameters() {
        return this.lmsParameters;
    }
}
