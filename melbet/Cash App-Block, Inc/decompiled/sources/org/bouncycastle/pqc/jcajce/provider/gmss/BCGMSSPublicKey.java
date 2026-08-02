package org.bouncycastle.pqc.jcajce.provider.gmss;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.GMSSPublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.ParSet;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSPublicKeyParameters;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes10.dex */
public class BCGMSSPublicKey implements CipherParameters, PublicKey {
    private static final long serialVersionUID = 1;
    private GMSSParameters gmssParameterSet;
    private GMSSParameters gmssParams;
    private byte[] publicKeyBytes;

    public BCGMSSPublicKey(GMSSPublicKeyParameters gMSSPublicKeyParameters) {
        this(gMSSPublicKeyParameters.getPublicKey(), gMSSPublicKeyParameters.getParameters());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.gmss, new ParSet(this.gmssParameterSet.getNumOfLayers(), this.gmssParameterSet.getHeightOfTrees(), this.gmssParameterSet.getWinternitzParameter(), this.gmssParameterSet.getK()).toASN1Primitive()), new GMSSPublicKey(this.publicKeyBytes));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public GMSSParameters getParameterSet() {
        return this.gmssParameterSet;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("GMSS public key : "), new String(Hex.encode(this.publicKeyBytes)), "\nHeight of Trees: \n");
        for (int i = 0; i < this.gmssParameterSet.getHeightOfTrees().length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(m);
            sb.append("Layer ");
            sb.append(i);
            sb.append(" : ");
            sb.append(this.gmssParameterSet.getHeightOfTrees()[i]);
            sb.append(" WinternitzParameter: ");
            sb.append(this.gmssParameterSet.getWinternitzParameter()[i]);
            sb.append(" K: ");
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.gmssParameterSet.getK()[i], "\n", sb);
        }
        return m;
    }

    public BCGMSSPublicKey(byte[] bArr, GMSSParameters gMSSParameters) {
        this.gmssParameterSet = gMSSParameters;
        this.publicKeyBytes = bArr;
    }
}
