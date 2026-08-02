package org.bouncycastle.pqc.crypto.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.CMCEPrivateKey;
import org.bouncycastle.pqc.asn1.FalconPrivateKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.SPHINCSPLUSPrivateKey;
import org.bouncycastle.pqc.asn1.SPHINCSPLUSPublicKey;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes10.dex */
public class PrivateKeyFactory {
    private static short[] convert(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = Pack.littleEndianToShort(bArr, i * 2);
        }
        return sArr;
    }

    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privateKeyInfo) {
        byte[] octets;
        byte[] octets2;
        byte[] octets3;
        byte[] octets4;
        byte[] octets5;
        byte[] octets6;
        byte[] octets7;
        byte[] octets8;
        byte[] octets9;
        if (privateKeyInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$3("keyInfo array null");
            return null;
        }
        AlgorithmIdentifier privateKeyAlgorithm = privateKeyInfo.getPrivateKeyAlgorithm();
        ASN1ObjectIdentifier algorithm = privateKeyAlgorithm.getAlgorithm();
        if (algorithm.on(PQCObjectIdentifiers.qTESLA)) {
            return new QTESLAPrivateKeyParameters(Utils.qTeslaLookupSecurityCategory(privateKeyAlgorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.sphincs256)) {
            return new SPHINCSPrivateKeyParameters(ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets(), Utils.sphincs256LookupTreeAlgName(SPHINCS256KeyParams.getInstance(privateKeyAlgorithm.getParameters())));
        }
        if (algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.newHope)) {
            return new NHPrivateKeyParameters(convert(ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets()));
        }
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_hss_lms_hashsig)) {
            byte[] octets10 = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            ASN1BitString publicKeyData = privateKeyInfo.getPublicKeyData();
            if (Pack.bigEndianToInt(octets10, 0) != 1) {
                if (publicKeyData != null) {
                    return HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets10, 4, octets10.length), publicKeyData.getOctets());
                }
                return HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets10, 4, octets10.length));
            }
            if (publicKeyData == null) {
                return LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets10, 4, octets10.length));
            }
            byte[] octets11 = publicKeyData.getOctets();
            return LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets10, 4, octets10.length), Arrays.copyOfRange(octets11, 4, octets11.length));
        }
        if (algorithm.on(BCObjectIdentifiers.sphincsPlus) || algorithm.on(BCObjectIdentifiers.sphincsPlus_interop)) {
            SPHINCSPlusParameters sphincsPlusParamsLookup = Utils.sphincsPlusParamsLookup(algorithm);
            ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
            if (!(parsePrivateKey instanceof ASN1Sequence)) {
                return new SPHINCSPlusPrivateKeyParameters(sphincsPlusParamsLookup, ASN1OctetString.getInstance(parsePrivateKey).getOctets());
            }
            SPHINCSPLUSPrivateKey sPHINCSPLUSPrivateKey = SPHINCSPLUSPrivateKey.getInstance(parsePrivateKey);
            SPHINCSPLUSPublicKey publicKey = sPHINCSPLUSPrivateKey.getPublicKey();
            return new SPHINCSPlusPrivateKeyParameters(sphincsPlusParamsLookup, sPHINCSPLUSPrivateKey.getSkseed(), sPHINCSPLUSPrivateKey.getSkprf(), publicKey.getPkseed(), publicKey.getPkroot());
        }
        if (Utils.shldsaParams.containsKey(algorithm)) {
            SLHDSAParameters slhdsaParamsLookup = Utils.slhdsaParamsLookup(algorithm);
            ASN1Encodable parsePrivateKey2 = privateKeyInfo.parsePrivateKey();
            if (!(parsePrivateKey2 instanceof ASN1Sequence)) {
                return new SLHDSAPrivateKeyParameters(slhdsaParamsLookup, ASN1OctetString.getInstance(parsePrivateKey2).getOctets());
            }
            SPHINCSPLUSPrivateKey sPHINCSPLUSPrivateKey2 = SPHINCSPLUSPrivateKey.getInstance(parsePrivateKey2);
            SPHINCSPLUSPublicKey publicKey2 = sPHINCSPLUSPrivateKey2.getPublicKey();
            return new SLHDSAPrivateKeyParameters(slhdsaParamsLookup, sPHINCSPLUSPrivateKey2.getSkseed(), sPHINCSPLUSPrivateKey2.getSkprf(), publicKey2.getPkseed(), publicKey2.getPkroot());
        }
        if (algorithm.on(BCObjectIdentifiers.picnic)) {
            return new PicnicPrivateKeyParameters(Utils.picnicParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_mceliece)) {
            CMCEPrivateKey cMCEPrivateKey = CMCEPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new CMCEPrivateKeyParameters(Utils.mcElieceParamsLookup(algorithm), cMCEPrivateKey.getDelta(), cMCEPrivateKey.getC(), cMCEPrivateKey.getG(), cMCEPrivateKey.getAlpha(), cMCEPrivateKey.getS());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_frodo)) {
            return new FrodoPrivateKeyParameters(Utils.frodoParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_saber)) {
            return new SABERPrivateKeyParameters(Utils.saberParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_ntru)) {
            return new NTRUPrivateKeyParameters(Utils.ntruParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_alg_ml_kem_512) || algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_alg_ml_kem_768) || algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_alg_ml_kem_1024)) {
            return new MLKEMPrivateKeyParameters(Utils.mlkemParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_ntrulprime)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            NTRULPRimeParameters ntrulprimeParamsLookup = Utils.ntrulprimeParamsLookup(algorithm);
            octets6 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
            octets7 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            octets8 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets();
            octets9 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets();
            return new NTRULPRimePrivateKeyParameters(ntrulprimeParamsLookup, octets6, octets7, octets8, octets9);
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_sntruprime)) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            SNTRUPrimeParameters sntruprimeParamsLookup = Utils.sntruprimeParamsLookup(algorithm);
            octets = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(0)).getOctets();
            octets2 = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(1)).getOctets();
            octets3 = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(2)).getOctets();
            octets4 = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(3)).getOctets();
            octets5 = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(4)).getOctets();
            return new SNTRUPrimePrivateKeyParameters(sntruprimeParamsLookup, octets, octets2, octets3, octets4, octets5);
        }
        if (Utils.mldsaParams.containsKey(algorithm)) {
            ASN1Encodable parsePrivateKey3 = privateKeyInfo.parsePrivateKey();
            MLDSAParameters mldsaParamsLookup = Utils.mldsaParamsLookup(algorithm);
            if (!(parsePrivateKey3 instanceof ASN1Sequence)) {
                if (parsePrivateKey3 instanceof DEROctetString) {
                    byte[] octets12 = ASN1OctetString.getInstance(parsePrivateKey3).getOctets();
                    return privateKeyInfo.getPublicKeyData() != null ? new MLDSAPrivateKeyParameters(mldsaParamsLookup, octets12, PublicKeyFactory.MLDSAConverter.getPublicKeyParams(mldsaParamsLookup, privateKeyInfo.getPublicKeyData())) : new MLDSAPrivateKeyParameters(mldsaParamsLookup, octets12);
                }
                a$$ExternalSyntheticBUOutline0.m$4("not supported");
                return null;
            }
            ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(parsePrivateKey3);
            int m = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence3, 0);
            if (m != 0) {
                a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, "unknown private key version: "));
                return null;
            }
            if (privateKeyInfo.getPublicKeyData() != null) {
                return new MLDSAPrivateKeyParameters(mldsaParamsLookup, GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 1), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 2), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 3), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 4), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 5), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 6), PublicKeyFactory.MLDSAConverter.getPublicKeyParams(mldsaParamsLookup, privateKeyInfo.getPublicKeyData()).getT1());
            }
            return new MLDSAPrivateKeyParameters(mldsaParamsLookup, GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 1), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 2), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 3), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 4), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 5), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence3, 6), null);
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium2) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium3) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium5)) {
            ASN1Encodable parsePrivateKey4 = privateKeyInfo.parsePrivateKey();
            DilithiumParameters dilithiumParamsLookup = Utils.dilithiumParamsLookup(algorithm);
            if (!(parsePrivateKey4 instanceof ASN1Sequence)) {
                if (parsePrivateKey4 instanceof DEROctetString) {
                    byte[] octets13 = ASN1OctetString.getInstance(parsePrivateKey4).getOctets();
                    return privateKeyInfo.getPublicKeyData() != null ? new DilithiumPrivateKeyParameters(dilithiumParamsLookup, octets13, PublicKeyFactory.DilithiumConverter.getPublicKeyParams(dilithiumParamsLookup, privateKeyInfo.getPublicKeyData())) : new DilithiumPrivateKeyParameters(dilithiumParamsLookup, octets13, null);
                }
                a$$ExternalSyntheticBUOutline0.m$4("not supported");
                return null;
            }
            ASN1Sequence aSN1Sequence4 = ASN1Sequence.getInstance(parsePrivateKey4);
            int m2 = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence4, 0);
            if (m2 != 0) {
                a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m2, "unknown private key version: "));
                return null;
            }
            if (privateKeyInfo.getPublicKeyData() != null) {
                return new DilithiumPrivateKeyParameters(dilithiumParamsLookup, GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 1), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 2), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 3), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 4), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 5), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 6), PublicKeyFactory.DilithiumConverter.getPublicKeyParams(dilithiumParamsLookup, privateKeyInfo.getPublicKeyData()).getT1());
            }
            return new DilithiumPrivateKeyParameters(dilithiumParamsLookup, GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 1), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 2), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 3), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 4), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 5), GetCert$$ExternalSyntheticOutline0.m4360m(aSN1Sequence4, 6), null);
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.falcon_512) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.falcon_1024)) {
            FalconPrivateKey falconPrivateKey = FalconPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new FalconPrivateKeyParameters(Utils.falconParamsLookup(algorithm), falconPrivateKey.getf(), falconPrivateKey.getG(), falconPrivateKey.getF(), falconPrivateKey.getPublicKey().getH());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_bike)) {
            byte[] octets14 = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            BIKEParameters bikeParamsLookup = Utils.bikeParamsLookup(algorithm);
            return new BIKEPrivateKeyParameters(bikeParamsLookup, Arrays.copyOfRange(octets14, 0, bikeParamsLookup.getRByte()), Arrays.copyOfRange(octets14, bikeParamsLookup.getRByte(), bikeParamsLookup.getRByte() * 2), Arrays.copyOfRange(octets14, bikeParamsLookup.getRByte() * 2, octets14.length));
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_hqc)) {
            return new HQCPrivateKeyParameters(Utils.hqcParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.rainbow)) {
            return new RainbowPrivateKeyParameters(Utils.rainbowParamsLookup(algorithm), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.xmss)) {
            XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(privateKeyAlgorithm.getParameters());
            ASN1ObjectIdentifier algorithm2 = xMSSKeyParams.getTreeDigest().getAlgorithm();
            XMSSPrivateKey xMSSPrivateKey = XMSSPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            try {
                XMSSPrivateKeyParameters.Builder withRoot = new XMSSPrivateKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), Utils.getDigest(algorithm2))).withIndex(xMSSPrivateKey.getIndex()).withSecretKeySeed(xMSSPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSPrivateKey.getPublicSeed()).withRoot(xMSSPrivateKey.getRoot());
                if (xMSSPrivateKey.getVersion() != 0) {
                    withRoot.withMaxIndex(xMSSPrivateKey.getMaxIndex());
                }
                if (xMSSPrivateKey.getBdsState() != null) {
                    withRoot.withBDSState(((BDS) XMSSUtil.deserialize(xMSSPrivateKey.getBdsState(), BDS.class)).withWOTSDigest(algorithm2));
                }
                return withRoot.build();
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m$4(e.getMessage(), "ClassNotFoundException processing BDS state: ");
                return null;
            }
        }
        if (!algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.xmss_mt)) {
            if (algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.mcElieceCca2)) {
                McElieceCCA2PrivateKey mcElieceCCA2PrivateKey = McElieceCCA2PrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
                return new McElieceCCA2PrivateKeyParameters(mcElieceCCA2PrivateKey.getN(), mcElieceCCA2PrivateKey.getK(), mcElieceCCA2PrivateKey.getField(), mcElieceCCA2PrivateKey.getGoppaPoly(), mcElieceCCA2PrivateKey.getP(), Utils.getDigestName(mcElieceCCA2PrivateKey.getDigest().getAlgorithm()));
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1("algorithm identifier in private key not recognised");
            return null;
        }
        XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(privateKeyAlgorithm.getParameters());
        ASN1ObjectIdentifier algorithm3 = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
        try {
            XMSSMTPrivateKey xMSSMTPrivateKey = XMSSMTPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            XMSSMTPrivateKeyParameters.Builder withRoot2 = new XMSSMTPrivateKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), Utils.getDigest(algorithm3))).withIndex(xMSSMTPrivateKey.getIndex()).withSecretKeySeed(xMSSMTPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKey.getPublicSeed()).withRoot(xMSSMTPrivateKey.getRoot());
            if (xMSSMTPrivateKey.getVersion() != 0) {
                withRoot2.withMaxIndex(xMSSMTPrivateKey.getMaxIndex());
            }
            if (xMSSMTPrivateKey.getBdsState() != null) {
                withRoot2.withBDSState(((BDSStateMap) XMSSUtil.deserialize(xMSSMTPrivateKey.getBdsState(), BDSStateMap.class)).withWOTSDigest(algorithm3));
            }
            return withRoot2.build();
        } catch (ClassNotFoundException e2) {
            a$$ExternalSyntheticBUOutline0.m$4(e2.getMessage(), "ClassNotFoundException processing BDS state: ");
            return null;
        }
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) {
        return createKey(PrivateKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) {
        String str;
        if (bArr == null) {
            str = "privateKeyInfoData array null";
        } else {
            if (bArr.length != 0) {
                return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
            }
            str = "privateKeyInfoData array empty";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }
}
