package org.bouncycastle.jcajce.provider.asymmetric.dh;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    DHParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new DHParameter(this.currentSpec.getP(), this.currentSpec.getG(), this.currentSpec.getL()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Error encoding DHParameters");
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
            DHParameter dHParameter = DHParameter.getInstance(bArr);
            this.currentSpec = dHParameter.getL() != null ? new DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue()) : new DHParameterSpec(dHParameter.getP(), dHParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            a$$ExternalSyntheticBUOutline0.m$4("Not a valid DH Parameter encoding.");
        } catch (ClassCastException unused2) {
            a$$ExternalSyntheticBUOutline0.m$4("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        Mod$$ExternalSyntheticBUOutline0.m("unknown parameter spec passed to DH parameters object.");
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
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            this.currentSpec = (DHParameterSpec) algorithmParameterSpec;
        } else {
            Mod$$ExternalSyntheticBUOutline0.m("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) {
        if (isASN1FormatString(str)) {
            engineInit(bArr);
        } else {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("Unknown parameter format ", str));
        }
    }
}
