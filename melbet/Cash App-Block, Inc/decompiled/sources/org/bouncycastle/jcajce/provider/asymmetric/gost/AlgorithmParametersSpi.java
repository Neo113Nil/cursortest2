package org.bouncycastle.jcajce.provider.asymmetric.gost;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    GOST3410ParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(this.currentSpec.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(this.currentSpec.getDigestParamSetOID()), new ASN1ObjectIdentifier(this.currentSpec.getEncryptionParamSetOID())).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Error encoding GOST3410Parameters");
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
    public void engineInit(byte[] bArr, String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
        } else {
            a$$ExternalSyntheticBUOutline0.m$4("Unknown parameter format ".concat(str));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "GOST3410 Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == GOST3410PublicKeyParameterSetSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        Mod$$ExternalSyntheticBUOutline0.m("unknown parameter spec passed to GOST3410 parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        try {
            this.currentSpec = GOST3410ParameterSpec.fromPublicKeyAlg(GOST3410PublicKeyAlgParameters.getInstance((ASN1Sequence) ASN1Primitive.fromByteArray(bArr)));
        } catch (ArrayIndexOutOfBoundsException unused) {
            a$$ExternalSyntheticBUOutline0.m$4("Not a valid GOST3410 Parameter encoding.");
        } catch (ClassCastException unused2) {
            a$$ExternalSyntheticBUOutline0.m$4("Not a valid GOST3410 Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof GOST3410ParameterSpec) {
            this.currentSpec = (GOST3410ParameterSpec) algorithmParameterSpec;
        } else {
            Mod$$ExternalSyntheticBUOutline0.m("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }
}
