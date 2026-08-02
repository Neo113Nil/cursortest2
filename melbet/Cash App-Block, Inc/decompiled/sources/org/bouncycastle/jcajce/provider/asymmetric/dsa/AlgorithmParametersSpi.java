package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    DSAParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new DSAParameter(this.currentSpec.getP(), this.currentSpec.getQ(), this.currentSpec.getG()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Error encoding DSAParameters");
            return null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        a$$ExternalSyntheticBUOutline0.m$2("argument to getParameterSpec must not be null");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        try {
            DSAParameter dSAParameter = DSAParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
            this.currentSpec = new DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            a$$ExternalSyntheticBUOutline0.m$4("Not a valid DSA Parameter encoding.");
        } catch (ClassCastException unused2) {
            a$$ExternalSyntheticBUOutline0.m$4("Not a valid DSA Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "DSA Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        Mod$$ExternalSyntheticBUOutline0.m("unknown parameter spec passed to DSA parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            this.currentSpec = (DSAParameterSpec) algorithmParameterSpec;
        } else {
            Mod$$ExternalSyntheticBUOutline0.m("DSAParameterSpec required to initialise a DSA algorithm parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
        } else {
            a$$ExternalSyntheticBUOutline0.m$4("Unknown parameter format ".concat(str));
        }
    }
}
