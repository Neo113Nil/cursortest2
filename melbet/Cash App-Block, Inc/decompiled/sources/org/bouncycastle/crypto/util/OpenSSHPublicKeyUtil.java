package org.bouncycastle.crypto.util;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: classes9.dex */
public class OpenSSHPublicKeyUtil {
    private static final String DSS = "ssh-dss";
    private static final String ECDSA = "ecdsa";
    private static final String ED_25519 = "ssh-ed25519";
    private static final String FIDO2_EC_P256 = "sk-ecdsa-sha2-nistp256@openssh.com";
    private static final String FIDO_ED_25519 = "sk-ssh-ed25519@openssh.com";
    private static final String RSA = "ssh-rsa";

    private OpenSSHPublicKeyUtil() {
    }

    public static byte[] encodePublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        if (asymmetricKeyParameter == null) {
            a$$ExternalSyntheticBUOutline0.m$3("cipherParameters was null.");
            return null;
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                a$$ExternalSyntheticBUOutline0.m$3("RSAKeyParamaters was for encryption");
                return null;
            }
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            SSHBuilder sSHBuilder = new SSHBuilder();
            sSHBuilder.writeString(RSA);
            sSHBuilder.writeBigNum(rSAKeyParameters.getExponent());
            sSHBuilder.writeBigNum(rSAKeyParameters.getModulus());
            return sSHBuilder.getBytes();
        }
        if (asymmetricKeyParameter instanceof ECPublicKeyParameters) {
            SSHBuilder sSHBuilder2 = new SSHBuilder();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
            String nameForParameters = SSHNamedCurves.getNameForParameters(eCPublicKeyParameters.getParameters());
            if (nameForParameters == null) {
                a$$ExternalSyntheticBUOutline0.m$3("unable to derive ssh curve name for ".concat(eCPublicKeyParameters.getParameters().getCurve().getClass().getName()));
                return null;
            }
            sSHBuilder2.writeString("ecdsa-sha2-".concat(nameForParameters));
            sSHBuilder2.writeString(nameForParameters);
            sSHBuilder2.writeBlock(eCPublicKeyParameters.getQ().getEncoded(false));
            return sSHBuilder2.getBytes();
        }
        if (!(asymmetricKeyParameter instanceof DSAPublicKeyParameters)) {
            if (!(asymmetricKeyParameter instanceof Ed25519PublicKeyParameters)) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("unable to convert ", asymmetricKeyParameter.getClass().getName(), " to public key");
                return null;
            }
            SSHBuilder sSHBuilder3 = new SSHBuilder();
            sSHBuilder3.writeString(ED_25519);
            sSHBuilder3.writeBlock(((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            return sSHBuilder3.getBytes();
        }
        DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
        DSAParameters parameters = dSAPublicKeyParameters.getParameters();
        SSHBuilder sSHBuilder4 = new SSHBuilder();
        sSHBuilder4.writeString(DSS);
        sSHBuilder4.writeBigNum(parameters.getP());
        sSHBuilder4.writeBigNum(parameters.getQ());
        sSHBuilder4.writeBigNum(parameters.getG());
        sSHBuilder4.writeBigNum(dSAPublicKeyParameters.getY());
        return sSHBuilder4.getBytes();
    }

    public static AsymmetricKeyParameter parsePublicKey(SSHBuffer sSHBuffer) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        String readString = sSHBuffer.readString();
        if (RSA.equals(readString)) {
            asymmetricKeyParameter = new RSAKeyParameters(false, sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive());
        } else if (DSS.equals(readString)) {
            asymmetricKeyParameter = new DSAPublicKeyParameters(sSHBuffer.readBigNumPositive(), new DSAParameters(sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive()));
        } else if (readString.startsWith(ECDSA)) {
            String readString2 = sSHBuffer.readString();
            ASN1ObjectIdentifier byName = SSHNamedCurves.getByName(readString2);
            X9ECParameters parameters = SSHNamedCurves.getParameters(byName);
            if (parameters == null) {
                a$$ExternalSyntheticBUOutline0.m$1(CameraSelector$$ExternalSyntheticOutline0.m("unable to find curve for ", readString, " using curve name ", readString2));
                return null;
            }
            asymmetricKeyParameter = new ECPublicKeyParameters(parameters.getCurve().decodePoint(sSHBuffer.readBlock()), new ECNamedDomainParameters(byName, parameters));
        } else if (readString.equals(FIDO2_EC_P256)) {
            String readString3 = sSHBuffer.readString();
            ASN1ObjectIdentifier byName2 = SSHNamedCurves.getByName(readString3);
            X9ECParameters parameters2 = SSHNamedCurves.getParameters(byName2);
            if (parameters2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1(CameraSelector$$ExternalSyntheticOutline0.m("unable to find curve for ", readString, " using curve name ", readString3));
                return null;
            }
            ECCurve curve = parameters2.getCurve();
            byte[] readBlock = sSHBuffer.readBlock();
            sSHBuffer.readString();
            asymmetricKeyParameter = new ECPublicKeyParameters(curve.decodePoint(readBlock), new ECNamedDomainParameters(byName2, parameters2));
        } else if (ED_25519.equals(readString)) {
            byte[] readBlock2 = sSHBuffer.readBlock();
            if (readBlock2.length != 32) {
                a$$ExternalSyntheticBUOutline0.m$1("public key value of wrong length");
                return null;
            }
            asymmetricKeyParameter = new Ed25519PublicKeyParameters(readBlock2, 0);
        } else if (FIDO2_EC_P256.equals(readString)) {
            byte[] readBlock3 = sSHBuffer.readBlock();
            if (readBlock3.length != 32) {
                a$$ExternalSyntheticBUOutline0.m$1("public key value of wrong length");
                return null;
            }
            sSHBuffer.readString();
            asymmetricKeyParameter = new Ed25519PublicKeyParameters(readBlock3, 0);
        } else {
            asymmetricKeyParameter = null;
        }
        if (asymmetricKeyParameter == null) {
            a$$ExternalSyntheticBUOutline0.m$3("unable to parse key");
            return null;
        }
        if (!sSHBuffer.hasRemaining()) {
            return asymmetricKeyParameter;
        }
        a$$ExternalSyntheticBUOutline0.m$3("decoded key has trailing data");
        return null;
    }

    public static AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        return parsePublicKey(new SSHBuffer(bArr));
    }
}
