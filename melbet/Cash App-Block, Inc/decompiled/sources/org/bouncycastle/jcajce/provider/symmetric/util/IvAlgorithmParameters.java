package org.bouncycastle.jcajce.provider.symmetric.util;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private byte[] iv;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return new DEROctetString(engineGetEncoded("RAW")).getEncoded();
        }
        if (str.equals("RAW")) {
            return Arrays.clone(this.iv);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) {
        String m;
        if (isASN1FormatString(str)) {
            try {
                engineInit(((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets());
                return;
            } catch (Exception e) {
                m = Boxes$$ExternalSyntheticOutline1.m(e, "Exception decoding: ");
            }
        } else {
            if (str.equals("RAW")) {
                engineInit(bArr);
                return;
            }
            m = "Unknown parameters format in IV parameters object";
        }
        a$$ExternalSyntheticBUOutline0.m$4(m);
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "IV Parameters";
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        Mod$$ExternalSyntheticBUOutline0.m("unknown parameter spec passed to IV parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets();
        }
        this.iv = Arrays.clone(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        } else {
            Mod$$ExternalSyntheticBUOutline0.m("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
    }
}
