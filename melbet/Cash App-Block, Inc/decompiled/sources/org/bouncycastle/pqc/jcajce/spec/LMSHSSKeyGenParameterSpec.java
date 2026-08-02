package org.bouncycastle.pqc.jcajce.spec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes10.dex */
public class LMSHSSKeyGenParameterSpec implements AlgorithmParameterSpec {
    private final LMSKeyGenParameterSpec[] specs;

    public LMSHSSKeyGenParameterSpec(LMSKeyGenParameterSpec... lMSKeyGenParameterSpecArr) {
        if (lMSKeyGenParameterSpecArr.length != 0) {
            this.specs = (LMSKeyGenParameterSpec[]) lMSKeyGenParameterSpecArr.clone();
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("at least one LMSKeyGenParameterSpec required");
            throw null;
        }
    }

    public LMSKeyGenParameterSpec[] getLMSSpecs() {
        return (LMSKeyGenParameterSpec[]) this.specs.clone();
    }
}
