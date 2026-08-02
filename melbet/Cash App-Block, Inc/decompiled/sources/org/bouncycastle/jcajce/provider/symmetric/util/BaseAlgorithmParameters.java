package org.bouncycastle.jcajce.provider.symmetric.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes9.dex */
public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        a$$ExternalSyntheticBUOutline0.m$2("argument to getParameterSpec must not be null");
        return null;
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);
}
