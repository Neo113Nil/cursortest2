package org.bouncycastle.pqc.crypto.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Integers;

/* loaded from: classes10.dex */
class Utils {
    static final AlgorithmIdentifier AlgID_qTESLA_p_I;
    static final AlgorithmIdentifier AlgID_qTESLA_p_III;
    static final AlgorithmIdentifier SPHINCS_SHA3_256;
    static final AlgorithmIdentifier SPHINCS_SHA512_256;
    static final AlgorithmIdentifier XMSS_SHA256;
    static final AlgorithmIdentifier XMSS_SHA512;
    static final AlgorithmIdentifier XMSS_SHAKE128;
    static final AlgorithmIdentifier XMSS_SHAKE256;
    static final Map bikeOids;
    static final Map bikeParams;
    static final Map categories;
    static final Map dilithiumOids;
    static final Map dilithiumParams;
    static final Map falconOids;
    static final Map falconParams;
    static final Map frodoOids;
    static final Map frodoParams;
    static final Map hqcOids;
    static final Map hqcParams;
    static final Map mcElieceOids;
    static final Map mcElieceParams;
    static final Map mldsaOids;
    static final Map mldsaParams;
    static final Map mlkemOids;
    static final Map mlkemParams;
    static final Map ntruOids;
    static final Map ntruParams;
    static final Map ntruprimeOids;
    static final Map ntruprimeParams;
    static final Map picnicOids;
    static final Map picnicParams;
    static final Map rainbowOids;
    static final Map rainbowParams;
    static final Map saberOids;
    static final Map saberParams;
    static final Map shldsaOids;
    static final Map shldsaParams;
    static final Map sikeOids;
    static final Map sikeParams;
    static final Map sntruprimeOids;
    static final Map sntruprimeParams;
    static final Map sphincsPlusOids;
    static final Map sphincsPlusParams;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.qTESLA_p_I;
        AlgID_qTESLA_p_I = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.qTESLA_p_III;
        AlgID_qTESLA_p_III = new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        SPHINCS_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
        SPHINCS_SHA512_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);
        XMSS_SHA256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        XMSS_SHA512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        XMSS_SHAKE128 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
        XMSS_SHAKE256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
        HashMap hashMap = new HashMap();
        categories = hashMap;
        HashMap hashMap2 = new HashMap();
        picnicOids = hashMap2;
        HashMap hashMap3 = new HashMap();
        picnicParams = hashMap3;
        HashMap hashMap4 = new HashMap();
        frodoOids = hashMap4;
        HashMap hashMap5 = new HashMap();
        frodoParams = hashMap5;
        HashMap hashMap6 = new HashMap();
        saberOids = hashMap6;
        HashMap hashMap7 = new HashMap();
        saberParams = hashMap7;
        HashMap hashMap8 = new HashMap();
        mcElieceOids = hashMap8;
        HashMap hashMap9 = new HashMap();
        mcElieceParams = hashMap9;
        HashMap hashMap10 = new HashMap();
        sphincsPlusOids = hashMap10;
        HashMap hashMap11 = new HashMap();
        sphincsPlusParams = hashMap11;
        sikeOids = new HashMap();
        sikeParams = new HashMap();
        HashMap hashMap12 = new HashMap();
        ntruOids = hashMap12;
        HashMap hashMap13 = new HashMap();
        ntruParams = hashMap13;
        HashMap hashMap14 = new HashMap();
        falconOids = hashMap14;
        HashMap hashMap15 = new HashMap();
        falconParams = hashMap15;
        HashMap hashMap16 = new HashMap();
        ntruprimeOids = hashMap16;
        HashMap hashMap17 = new HashMap();
        ntruprimeParams = hashMap17;
        HashMap hashMap18 = new HashMap();
        sntruprimeOids = hashMap18;
        HashMap hashMap19 = new HashMap();
        sntruprimeParams = hashMap19;
        HashMap hashMap20 = new HashMap();
        dilithiumOids = hashMap20;
        HashMap hashMap21 = new HashMap();
        dilithiumParams = hashMap21;
        HashMap hashMap22 = new HashMap();
        bikeOids = hashMap22;
        HashMap hashMap23 = new HashMap();
        bikeParams = hashMap23;
        HashMap hashMap24 = new HashMap();
        hqcOids = hashMap24;
        HashMap hashMap25 = new HashMap();
        hqcParams = hashMap25;
        HashMap hashMap26 = new HashMap();
        rainbowOids = hashMap26;
        HashMap hashMap27 = new HashMap();
        rainbowParams = hashMap27;
        HashMap hashMap28 = new HashMap();
        mlkemOids = hashMap28;
        HashMap hashMap29 = new HashMap();
        mlkemParams = hashMap29;
        HashMap hashMap30 = new HashMap();
        mldsaOids = hashMap30;
        HashMap hashMap31 = new HashMap();
        mldsaParams = hashMap31;
        HashMap hashMap32 = new HashMap();
        shldsaOids = hashMap32;
        HashMap hashMap33 = new HashMap();
        shldsaParams = hashMap33;
        hashMap.put(aSN1ObjectIdentifier, Integers.valueOf(5));
        hashMap.put(aSN1ObjectIdentifier2, Integers.valueOf(6));
        CMCEParameters cMCEParameters = CMCEParameters.mceliece348864r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.mceliece348864_r3;
        hashMap8.put(cMCEParameters, aSN1ObjectIdentifier3);
        CMCEParameters cMCEParameters2 = CMCEParameters.mceliece348864fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.mceliece348864f_r3;
        hashMap8.put(cMCEParameters2, aSN1ObjectIdentifier4);
        CMCEParameters cMCEParameters3 = CMCEParameters.mceliece460896r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.mceliece460896_r3;
        hashMap8.put(cMCEParameters3, aSN1ObjectIdentifier5);
        CMCEParameters cMCEParameters4 = CMCEParameters.mceliece460896fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.mceliece460896f_r3;
        hashMap8.put(cMCEParameters4, aSN1ObjectIdentifier6);
        CMCEParameters cMCEParameters5 = CMCEParameters.mceliece6688128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.mceliece6688128_r3;
        hashMap8.put(cMCEParameters5, aSN1ObjectIdentifier7);
        CMCEParameters cMCEParameters6 = CMCEParameters.mceliece6688128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.mceliece6688128f_r3;
        hashMap8.put(cMCEParameters6, aSN1ObjectIdentifier8);
        CMCEParameters cMCEParameters7 = CMCEParameters.mceliece6960119r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.mceliece6960119_r3;
        hashMap8.put(cMCEParameters7, aSN1ObjectIdentifier9);
        CMCEParameters cMCEParameters8 = CMCEParameters.mceliece6960119fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.mceliece6960119f_r3;
        hashMap8.put(cMCEParameters8, aSN1ObjectIdentifier10);
        CMCEParameters cMCEParameters9 = CMCEParameters.mceliece8192128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.mceliece8192128_r3;
        hashMap8.put(cMCEParameters9, aSN1ObjectIdentifier11);
        CMCEParameters cMCEParameters10 = CMCEParameters.mceliece8192128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.mceliece8192128f_r3;
        hashMap8.put(cMCEParameters10, aSN1ObjectIdentifier12);
        hashMap9.put(aSN1ObjectIdentifier3, cMCEParameters);
        hashMap9.put(aSN1ObjectIdentifier4, cMCEParameters2);
        hashMap9.put(aSN1ObjectIdentifier5, cMCEParameters3);
        hashMap9.put(aSN1ObjectIdentifier6, cMCEParameters4);
        hashMap9.put(aSN1ObjectIdentifier7, cMCEParameters5);
        hashMap9.put(aSN1ObjectIdentifier8, cMCEParameters6);
        hashMap9.put(aSN1ObjectIdentifier9, cMCEParameters7);
        hashMap9.put(aSN1ObjectIdentifier10, cMCEParameters8);
        hashMap9.put(aSN1ObjectIdentifier11, cMCEParameters9);
        hashMap9.put(aSN1ObjectIdentifier12, cMCEParameters10);
        FrodoParameters frodoParameters = FrodoParameters.frodokem640aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.frodokem640aes;
        hashMap4.put(frodoParameters, aSN1ObjectIdentifier13);
        FrodoParameters frodoParameters2 = FrodoParameters.frodokem640shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.frodokem640shake;
        hashMap4.put(frodoParameters2, aSN1ObjectIdentifier14);
        FrodoParameters frodoParameters3 = FrodoParameters.frodokem976aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.frodokem976aes;
        hashMap4.put(frodoParameters3, aSN1ObjectIdentifier15);
        FrodoParameters frodoParameters4 = FrodoParameters.frodokem976shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.frodokem976shake;
        hashMap4.put(frodoParameters4, aSN1ObjectIdentifier16);
        FrodoParameters frodoParameters5 = FrodoParameters.frodokem1344aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.frodokem1344aes;
        hashMap4.put(frodoParameters5, aSN1ObjectIdentifier17);
        FrodoParameters frodoParameters6 = FrodoParameters.frodokem1344shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.frodokem1344shake;
        hashMap4.put(frodoParameters6, aSN1ObjectIdentifier18);
        hashMap5.put(aSN1ObjectIdentifier13, frodoParameters);
        hashMap5.put(aSN1ObjectIdentifier14, frodoParameters2);
        hashMap5.put(aSN1ObjectIdentifier15, frodoParameters3);
        hashMap5.put(aSN1ObjectIdentifier16, frodoParameters4);
        hashMap5.put(aSN1ObjectIdentifier17, frodoParameters5);
        hashMap5.put(aSN1ObjectIdentifier18, frodoParameters6);
        SABERParameters sABERParameters = SABERParameters.lightsaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.lightsaberkem128r3;
        hashMap6.put(sABERParameters, aSN1ObjectIdentifier19);
        SABERParameters sABERParameters2 = SABERParameters.saberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = BCObjectIdentifiers.saberkem128r3;
        hashMap6.put(sABERParameters2, aSN1ObjectIdentifier20);
        SABERParameters sABERParameters3 = SABERParameters.firesaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BCObjectIdentifiers.firesaberkem128r3;
        hashMap6.put(sABERParameters3, aSN1ObjectIdentifier21);
        SABERParameters sABERParameters4 = SABERParameters.lightsaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = BCObjectIdentifiers.lightsaberkem192r3;
        hashMap6.put(sABERParameters4, aSN1ObjectIdentifier22);
        SABERParameters sABERParameters5 = SABERParameters.saberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = BCObjectIdentifiers.saberkem192r3;
        hashMap6.put(sABERParameters5, aSN1ObjectIdentifier23);
        SABERParameters sABERParameters6 = SABERParameters.firesaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = BCObjectIdentifiers.firesaberkem192r3;
        hashMap6.put(sABERParameters6, aSN1ObjectIdentifier24);
        SABERParameters sABERParameters7 = SABERParameters.lightsaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.lightsaberkem256r3;
        hashMap6.put(sABERParameters7, aSN1ObjectIdentifier25);
        SABERParameters sABERParameters8 = SABERParameters.saberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.saberkem256r3;
        hashMap6.put(sABERParameters8, aSN1ObjectIdentifier26);
        SABERParameters sABERParameters9 = SABERParameters.firesaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.firesaberkem256r3;
        hashMap6.put(sABERParameters9, aSN1ObjectIdentifier27);
        SABERParameters sABERParameters10 = SABERParameters.ulightsaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.ulightsaberkemr3;
        hashMap6.put(sABERParameters10, aSN1ObjectIdentifier28);
        SABERParameters sABERParameters11 = SABERParameters.usaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.usaberkemr3;
        hashMap6.put(sABERParameters11, aSN1ObjectIdentifier29);
        SABERParameters sABERParameters12 = SABERParameters.ufiresaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.ufiresaberkemr3;
        hashMap6.put(sABERParameters12, aSN1ObjectIdentifier30);
        SABERParameters sABERParameters13 = SABERParameters.lightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = BCObjectIdentifiers.lightsaberkem90sr3;
        hashMap6.put(sABERParameters13, aSN1ObjectIdentifier31);
        SABERParameters sABERParameters14 = SABERParameters.saberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = BCObjectIdentifiers.saberkem90sr3;
        hashMap6.put(sABERParameters14, aSN1ObjectIdentifier32);
        SABERParameters sABERParameters15 = SABERParameters.firesaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = BCObjectIdentifiers.firesaberkem90sr3;
        hashMap6.put(sABERParameters15, aSN1ObjectIdentifier33);
        SABERParameters sABERParameters16 = SABERParameters.ulightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = BCObjectIdentifiers.ulightsaberkem90sr3;
        hashMap6.put(sABERParameters16, aSN1ObjectIdentifier34);
        SABERParameters sABERParameters17 = SABERParameters.usaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = BCObjectIdentifiers.usaberkem90sr3;
        hashMap6.put(sABERParameters17, aSN1ObjectIdentifier35);
        SABERParameters sABERParameters18 = SABERParameters.ufiresaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = BCObjectIdentifiers.ufiresaberkem90sr3;
        hashMap6.put(sABERParameters18, aSN1ObjectIdentifier36);
        hashMap7.put(aSN1ObjectIdentifier19, sABERParameters);
        hashMap7.put(aSN1ObjectIdentifier20, sABERParameters2);
        hashMap7.put(aSN1ObjectIdentifier21, sABERParameters3);
        hashMap7.put(aSN1ObjectIdentifier22, sABERParameters4);
        hashMap7.put(aSN1ObjectIdentifier23, sABERParameters5);
        hashMap7.put(aSN1ObjectIdentifier24, sABERParameters6);
        hashMap7.put(aSN1ObjectIdentifier25, sABERParameters7);
        hashMap7.put(aSN1ObjectIdentifier26, sABERParameters8);
        hashMap7.put(aSN1ObjectIdentifier27, sABERParameters9);
        hashMap7.put(aSN1ObjectIdentifier28, sABERParameters10);
        hashMap7.put(aSN1ObjectIdentifier29, sABERParameters11);
        hashMap7.put(aSN1ObjectIdentifier30, sABERParameters12);
        hashMap7.put(aSN1ObjectIdentifier31, sABERParameters13);
        hashMap7.put(aSN1ObjectIdentifier32, sABERParameters14);
        hashMap7.put(aSN1ObjectIdentifier33, sABERParameters15);
        hashMap7.put(aSN1ObjectIdentifier34, sABERParameters16);
        hashMap7.put(aSN1ObjectIdentifier35, sABERParameters17);
        hashMap7.put(aSN1ObjectIdentifier36, sABERParameters18);
        PicnicParameters picnicParameters = PicnicParameters.picnicl1fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = BCObjectIdentifiers.picnicl1fs;
        hashMap2.put(picnicParameters, aSN1ObjectIdentifier37);
        PicnicParameters picnicParameters2 = PicnicParameters.picnicl1ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = BCObjectIdentifiers.picnicl1ur;
        hashMap2.put(picnicParameters2, aSN1ObjectIdentifier38);
        PicnicParameters picnicParameters3 = PicnicParameters.picnicl3fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = BCObjectIdentifiers.picnicl3fs;
        hashMap2.put(picnicParameters3, aSN1ObjectIdentifier39);
        PicnicParameters picnicParameters4 = PicnicParameters.picnicl3ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = BCObjectIdentifiers.picnicl3ur;
        hashMap2.put(picnicParameters4, aSN1ObjectIdentifier40);
        PicnicParameters picnicParameters5 = PicnicParameters.picnicl5fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = BCObjectIdentifiers.picnicl5fs;
        hashMap2.put(picnicParameters5, aSN1ObjectIdentifier41);
        PicnicParameters picnicParameters6 = PicnicParameters.picnicl5ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = BCObjectIdentifiers.picnicl5ur;
        hashMap2.put(picnicParameters6, aSN1ObjectIdentifier42);
        PicnicParameters picnicParameters7 = PicnicParameters.picnic3l1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = BCObjectIdentifiers.picnic3l1;
        hashMap2.put(picnicParameters7, aSN1ObjectIdentifier43);
        PicnicParameters picnicParameters8 = PicnicParameters.picnic3l3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier44 = BCObjectIdentifiers.picnic3l3;
        hashMap2.put(picnicParameters8, aSN1ObjectIdentifier44);
        PicnicParameters picnicParameters9 = PicnicParameters.picnic3l5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier45 = BCObjectIdentifiers.picnic3l5;
        hashMap2.put(picnicParameters9, aSN1ObjectIdentifier45);
        PicnicParameters picnicParameters10 = PicnicParameters.picnicl1full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier46 = BCObjectIdentifiers.picnicl1full;
        hashMap2.put(picnicParameters10, aSN1ObjectIdentifier46);
        PicnicParameters picnicParameters11 = PicnicParameters.picnicl3full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier47 = BCObjectIdentifiers.picnicl3full;
        hashMap2.put(picnicParameters11, aSN1ObjectIdentifier47);
        PicnicParameters picnicParameters12 = PicnicParameters.picnicl5full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier48 = BCObjectIdentifiers.picnicl5full;
        hashMap2.put(picnicParameters12, aSN1ObjectIdentifier48);
        hashMap3.put(aSN1ObjectIdentifier37, picnicParameters);
        hashMap3.put(aSN1ObjectIdentifier38, picnicParameters2);
        hashMap3.put(aSN1ObjectIdentifier39, picnicParameters3);
        hashMap3.put(aSN1ObjectIdentifier40, picnicParameters4);
        hashMap3.put(aSN1ObjectIdentifier41, picnicParameters5);
        hashMap3.put(aSN1ObjectIdentifier42, picnicParameters6);
        hashMap3.put(aSN1ObjectIdentifier43, picnicParameters7);
        hashMap3.put(aSN1ObjectIdentifier44, picnicParameters8);
        hashMap3.put(aSN1ObjectIdentifier45, picnicParameters9);
        hashMap3.put(aSN1ObjectIdentifier46, picnicParameters10);
        hashMap3.put(aSN1ObjectIdentifier47, picnicParameters11);
        hashMap3.put(aSN1ObjectIdentifier48, picnicParameters12);
        NTRUParameters nTRUParameters = NTRUParameters.ntruhps2048509;
        ASN1ObjectIdentifier aSN1ObjectIdentifier49 = BCObjectIdentifiers.ntruhps2048509;
        hashMap12.put(nTRUParameters, aSN1ObjectIdentifier49);
        NTRUParameters nTRUParameters2 = NTRUParameters.ntruhps2048677;
        ASN1ObjectIdentifier aSN1ObjectIdentifier50 = BCObjectIdentifiers.ntruhps2048677;
        hashMap12.put(nTRUParameters2, aSN1ObjectIdentifier50);
        NTRUParameters nTRUParameters3 = NTRUParameters.ntruhps4096821;
        ASN1ObjectIdentifier aSN1ObjectIdentifier51 = BCObjectIdentifiers.ntruhps4096821;
        hashMap12.put(nTRUParameters3, aSN1ObjectIdentifier51);
        NTRUParameters nTRUParameters4 = NTRUParameters.ntruhps40961229;
        ASN1ObjectIdentifier aSN1ObjectIdentifier52 = BCObjectIdentifiers.ntruhps40961229;
        hashMap12.put(nTRUParameters4, aSN1ObjectIdentifier52);
        NTRUParameters nTRUParameters5 = NTRUParameters.ntruhrss701;
        ASN1ObjectIdentifier aSN1ObjectIdentifier53 = BCObjectIdentifiers.ntruhrss701;
        hashMap12.put(nTRUParameters5, aSN1ObjectIdentifier53);
        NTRUParameters nTRUParameters6 = NTRUParameters.ntruhrss1373;
        ASN1ObjectIdentifier aSN1ObjectIdentifier54 = BCObjectIdentifiers.ntruhrss1373;
        hashMap12.put(nTRUParameters6, aSN1ObjectIdentifier54);
        hashMap13.put(aSN1ObjectIdentifier49, nTRUParameters);
        hashMap13.put(aSN1ObjectIdentifier50, nTRUParameters2);
        hashMap13.put(aSN1ObjectIdentifier51, nTRUParameters3);
        hashMap13.put(aSN1ObjectIdentifier52, nTRUParameters4);
        hashMap13.put(aSN1ObjectIdentifier53, nTRUParameters5);
        hashMap13.put(aSN1ObjectIdentifier54, nTRUParameters6);
        FalconParameters falconParameters = FalconParameters.falcon_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier55 = BCObjectIdentifiers.falcon_512;
        hashMap14.put(falconParameters, aSN1ObjectIdentifier55);
        FalconParameters falconParameters2 = FalconParameters.falcon_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier56 = BCObjectIdentifiers.falcon_1024;
        hashMap14.put(falconParameters2, aSN1ObjectIdentifier56);
        hashMap15.put(aSN1ObjectIdentifier55, falconParameters);
        hashMap15.put(aSN1ObjectIdentifier56, falconParameters2);
        MLKEMParameters mLKEMParameters = MLKEMParameters.ml_kem_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier57 = NISTObjectIdentifiers.id_alg_ml_kem_512;
        hashMap28.put(mLKEMParameters, aSN1ObjectIdentifier57);
        MLKEMParameters mLKEMParameters2 = MLKEMParameters.ml_kem_768;
        ASN1ObjectIdentifier aSN1ObjectIdentifier58 = NISTObjectIdentifiers.id_alg_ml_kem_768;
        hashMap28.put(mLKEMParameters2, aSN1ObjectIdentifier58);
        MLKEMParameters mLKEMParameters3 = MLKEMParameters.ml_kem_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier59 = NISTObjectIdentifiers.id_alg_ml_kem_1024;
        hashMap28.put(mLKEMParameters3, aSN1ObjectIdentifier59);
        hashMap29.put(aSN1ObjectIdentifier57, mLKEMParameters);
        hashMap29.put(aSN1ObjectIdentifier58, mLKEMParameters2);
        hashMap29.put(aSN1ObjectIdentifier59, mLKEMParameters3);
        NTRULPRimeParameters nTRULPRimeParameters = NTRULPRimeParameters.ntrulpr653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier60 = BCObjectIdentifiers.ntrulpr653;
        hashMap16.put(nTRULPRimeParameters, aSN1ObjectIdentifier60);
        NTRULPRimeParameters nTRULPRimeParameters2 = NTRULPRimeParameters.ntrulpr761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier61 = BCObjectIdentifiers.ntrulpr761;
        hashMap16.put(nTRULPRimeParameters2, aSN1ObjectIdentifier61);
        NTRULPRimeParameters nTRULPRimeParameters3 = NTRULPRimeParameters.ntrulpr857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier62 = BCObjectIdentifiers.ntrulpr857;
        hashMap16.put(nTRULPRimeParameters3, aSN1ObjectIdentifier62);
        NTRULPRimeParameters nTRULPRimeParameters4 = NTRULPRimeParameters.ntrulpr953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier63 = BCObjectIdentifiers.ntrulpr953;
        hashMap16.put(nTRULPRimeParameters4, aSN1ObjectIdentifier63);
        NTRULPRimeParameters nTRULPRimeParameters5 = NTRULPRimeParameters.ntrulpr1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier64 = BCObjectIdentifiers.ntrulpr1013;
        hashMap16.put(nTRULPRimeParameters5, aSN1ObjectIdentifier64);
        NTRULPRimeParameters nTRULPRimeParameters6 = NTRULPRimeParameters.ntrulpr1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier65 = BCObjectIdentifiers.ntrulpr1277;
        hashMap16.put(nTRULPRimeParameters6, aSN1ObjectIdentifier65);
        hashMap17.put(aSN1ObjectIdentifier60, nTRULPRimeParameters);
        hashMap17.put(aSN1ObjectIdentifier61, nTRULPRimeParameters2);
        hashMap17.put(aSN1ObjectIdentifier62, nTRULPRimeParameters3);
        hashMap17.put(aSN1ObjectIdentifier63, nTRULPRimeParameters4);
        hashMap17.put(aSN1ObjectIdentifier64, nTRULPRimeParameters5);
        hashMap17.put(aSN1ObjectIdentifier65, nTRULPRimeParameters6);
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier66 = BCObjectIdentifiers.sntrup653;
        hashMap18.put(sNTRUPrimeParameters, aSN1ObjectIdentifier66);
        SNTRUPrimeParameters sNTRUPrimeParameters2 = SNTRUPrimeParameters.sntrup761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier67 = BCObjectIdentifiers.sntrup761;
        hashMap18.put(sNTRUPrimeParameters2, aSN1ObjectIdentifier67);
        SNTRUPrimeParameters sNTRUPrimeParameters3 = SNTRUPrimeParameters.sntrup857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier68 = BCObjectIdentifiers.sntrup857;
        hashMap18.put(sNTRUPrimeParameters3, aSN1ObjectIdentifier68);
        SNTRUPrimeParameters sNTRUPrimeParameters4 = SNTRUPrimeParameters.sntrup953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier69 = BCObjectIdentifiers.sntrup953;
        hashMap18.put(sNTRUPrimeParameters4, aSN1ObjectIdentifier69);
        SNTRUPrimeParameters sNTRUPrimeParameters5 = SNTRUPrimeParameters.sntrup1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier70 = BCObjectIdentifiers.sntrup1013;
        hashMap18.put(sNTRUPrimeParameters5, aSN1ObjectIdentifier70);
        SNTRUPrimeParameters sNTRUPrimeParameters6 = SNTRUPrimeParameters.sntrup1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier71 = BCObjectIdentifiers.sntrup1277;
        hashMap18.put(sNTRUPrimeParameters6, aSN1ObjectIdentifier71);
        hashMap19.put(aSN1ObjectIdentifier66, sNTRUPrimeParameters);
        hashMap19.put(aSN1ObjectIdentifier67, sNTRUPrimeParameters2);
        hashMap19.put(aSN1ObjectIdentifier68, sNTRUPrimeParameters3);
        hashMap19.put(aSN1ObjectIdentifier69, sNTRUPrimeParameters4);
        hashMap19.put(aSN1ObjectIdentifier70, sNTRUPrimeParameters5);
        hashMap19.put(aSN1ObjectIdentifier71, sNTRUPrimeParameters6);
        MLDSAParameters mLDSAParameters = MLDSAParameters.ml_dsa_44;
        ASN1ObjectIdentifier aSN1ObjectIdentifier72 = NISTObjectIdentifiers.id_ml_dsa_44;
        hashMap30.put(mLDSAParameters, aSN1ObjectIdentifier72);
        MLDSAParameters mLDSAParameters2 = MLDSAParameters.ml_dsa_65;
        ASN1ObjectIdentifier aSN1ObjectIdentifier73 = NISTObjectIdentifiers.id_ml_dsa_65;
        hashMap30.put(mLDSAParameters2, aSN1ObjectIdentifier73);
        MLDSAParameters mLDSAParameters3 = MLDSAParameters.ml_dsa_87;
        ASN1ObjectIdentifier aSN1ObjectIdentifier74 = NISTObjectIdentifiers.id_ml_dsa_87;
        hashMap30.put(mLDSAParameters3, aSN1ObjectIdentifier74);
        MLDSAParameters mLDSAParameters4 = MLDSAParameters.ml_dsa_44_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier75 = NISTObjectIdentifiers.id_hash_ml_dsa_44_with_sha512;
        hashMap30.put(mLDSAParameters4, aSN1ObjectIdentifier75);
        MLDSAParameters mLDSAParameters5 = MLDSAParameters.ml_dsa_65_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier76 = NISTObjectIdentifiers.id_hash_ml_dsa_65_with_sha512;
        hashMap30.put(mLDSAParameters5, aSN1ObjectIdentifier76);
        MLDSAParameters mLDSAParameters6 = MLDSAParameters.ml_dsa_87_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier77 = NISTObjectIdentifiers.id_hash_ml_dsa_87_with_sha512;
        hashMap30.put(mLDSAParameters6, aSN1ObjectIdentifier77);
        hashMap31.put(aSN1ObjectIdentifier72, mLDSAParameters);
        hashMap31.put(aSN1ObjectIdentifier73, mLDSAParameters2);
        hashMap31.put(aSN1ObjectIdentifier74, mLDSAParameters3);
        hashMap31.put(aSN1ObjectIdentifier75, mLDSAParameters4);
        hashMap31.put(aSN1ObjectIdentifier76, mLDSAParameters5);
        hashMap31.put(aSN1ObjectIdentifier77, mLDSAParameters6);
        DilithiumParameters dilithiumParameters = DilithiumParameters.dilithium2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier78 = BCObjectIdentifiers.dilithium2;
        hashMap20.put(dilithiumParameters, aSN1ObjectIdentifier78);
        DilithiumParameters dilithiumParameters2 = DilithiumParameters.dilithium3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier79 = BCObjectIdentifiers.dilithium3;
        hashMap20.put(dilithiumParameters2, aSN1ObjectIdentifier79);
        DilithiumParameters dilithiumParameters3 = DilithiumParameters.dilithium5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier80 = BCObjectIdentifiers.dilithium5;
        hashMap20.put(dilithiumParameters3, aSN1ObjectIdentifier80);
        hashMap21.put(aSN1ObjectIdentifier78, dilithiumParameters);
        hashMap21.put(aSN1ObjectIdentifier79, dilithiumParameters2);
        hashMap21.put(aSN1ObjectIdentifier80, dilithiumParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier81 = BCObjectIdentifiers.bike128;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        hashMap23.put(aSN1ObjectIdentifier81, bIKEParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier82 = BCObjectIdentifiers.bike192;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        hashMap23.put(aSN1ObjectIdentifier82, bIKEParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier83 = BCObjectIdentifiers.bike256;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        hashMap23.put(aSN1ObjectIdentifier83, bIKEParameters3);
        hashMap22.put(bIKEParameters, aSN1ObjectIdentifier81);
        hashMap22.put(bIKEParameters2, aSN1ObjectIdentifier82);
        hashMap22.put(bIKEParameters3, aSN1ObjectIdentifier83);
        ASN1ObjectIdentifier aSN1ObjectIdentifier84 = BCObjectIdentifiers.hqc128;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        hashMap25.put(aSN1ObjectIdentifier84, hQCParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier85 = BCObjectIdentifiers.hqc192;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        hashMap25.put(aSN1ObjectIdentifier85, hQCParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier86 = BCObjectIdentifiers.hqc256;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        hashMap25.put(aSN1ObjectIdentifier86, hQCParameters3);
        hashMap24.put(hQCParameters, aSN1ObjectIdentifier84);
        hashMap24.put(hQCParameters2, aSN1ObjectIdentifier85);
        hashMap24.put(hQCParameters3, aSN1ObjectIdentifier86);
        ASN1ObjectIdentifier aSN1ObjectIdentifier87 = BCObjectIdentifiers.rainbow_III_classic;
        RainbowParameters rainbowParameters = RainbowParameters.rainbowIIIclassic;
        hashMap27.put(aSN1ObjectIdentifier87, rainbowParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier88 = BCObjectIdentifiers.rainbow_III_circumzenithal;
        RainbowParameters rainbowParameters2 = RainbowParameters.rainbowIIIcircumzenithal;
        hashMap27.put(aSN1ObjectIdentifier88, rainbowParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier89 = BCObjectIdentifiers.rainbow_III_compressed;
        RainbowParameters rainbowParameters3 = RainbowParameters.rainbowIIIcompressed;
        hashMap27.put(aSN1ObjectIdentifier89, rainbowParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier90 = BCObjectIdentifiers.rainbow_V_classic;
        RainbowParameters rainbowParameters4 = RainbowParameters.rainbowVclassic;
        hashMap27.put(aSN1ObjectIdentifier90, rainbowParameters4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier91 = BCObjectIdentifiers.rainbow_V_circumzenithal;
        RainbowParameters rainbowParameters5 = RainbowParameters.rainbowVcircumzenithal;
        hashMap27.put(aSN1ObjectIdentifier91, rainbowParameters5);
        ASN1ObjectIdentifier aSN1ObjectIdentifier92 = BCObjectIdentifiers.rainbow_V_compressed;
        RainbowParameters rainbowParameters6 = RainbowParameters.rainbowVcompressed;
        hashMap27.put(aSN1ObjectIdentifier92, rainbowParameters6);
        hashMap26.put(rainbowParameters, aSN1ObjectIdentifier87);
        hashMap26.put(rainbowParameters2, aSN1ObjectIdentifier88);
        hashMap26.put(rainbowParameters3, aSN1ObjectIdentifier89);
        hashMap26.put(rainbowParameters4, aSN1ObjectIdentifier90);
        hashMap26.put(rainbowParameters5, aSN1ObjectIdentifier91);
        hashMap26.put(rainbowParameters6, aSN1ObjectIdentifier92);
        SLHDSAParameters sLHDSAParameters = SLHDSAParameters.sha2_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier93 = NISTObjectIdentifiers.id_slh_dsa_sha2_128s;
        hashMap32.put(sLHDSAParameters, aSN1ObjectIdentifier93);
        SLHDSAParameters sLHDSAParameters2 = SLHDSAParameters.sha2_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier94 = NISTObjectIdentifiers.id_slh_dsa_sha2_128f;
        hashMap32.put(sLHDSAParameters2, aSN1ObjectIdentifier94);
        SLHDSAParameters sLHDSAParameters3 = SLHDSAParameters.sha2_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier95 = NISTObjectIdentifiers.id_slh_dsa_sha2_192s;
        hashMap32.put(sLHDSAParameters3, aSN1ObjectIdentifier95);
        SLHDSAParameters sLHDSAParameters4 = SLHDSAParameters.sha2_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier96 = NISTObjectIdentifiers.id_slh_dsa_sha2_192f;
        hashMap32.put(sLHDSAParameters4, aSN1ObjectIdentifier96);
        SLHDSAParameters sLHDSAParameters5 = SLHDSAParameters.sha2_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier97 = NISTObjectIdentifiers.id_slh_dsa_sha2_256s;
        hashMap32.put(sLHDSAParameters5, aSN1ObjectIdentifier97);
        SLHDSAParameters sLHDSAParameters6 = SLHDSAParameters.sha2_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier98 = NISTObjectIdentifiers.id_slh_dsa_sha2_256f;
        hashMap32.put(sLHDSAParameters6, aSN1ObjectIdentifier98);
        SLHDSAParameters sLHDSAParameters7 = SLHDSAParameters.shake_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier99 = NISTObjectIdentifiers.id_slh_dsa_shake_128s;
        hashMap32.put(sLHDSAParameters7, aSN1ObjectIdentifier99);
        SLHDSAParameters sLHDSAParameters8 = SLHDSAParameters.shake_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier100 = NISTObjectIdentifiers.id_slh_dsa_shake_128f;
        hashMap32.put(sLHDSAParameters8, aSN1ObjectIdentifier100);
        SLHDSAParameters sLHDSAParameters9 = SLHDSAParameters.shake_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier101 = NISTObjectIdentifiers.id_slh_dsa_shake_192s;
        hashMap32.put(sLHDSAParameters9, aSN1ObjectIdentifier101);
        SLHDSAParameters sLHDSAParameters10 = SLHDSAParameters.shake_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier102 = NISTObjectIdentifiers.id_slh_dsa_shake_192f;
        hashMap32.put(sLHDSAParameters10, aSN1ObjectIdentifier102);
        SLHDSAParameters sLHDSAParameters11 = SLHDSAParameters.shake_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier103 = NISTObjectIdentifiers.id_slh_dsa_shake_256s;
        hashMap32.put(sLHDSAParameters11, aSN1ObjectIdentifier103);
        SLHDSAParameters sLHDSAParameters12 = SLHDSAParameters.shake_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier104 = NISTObjectIdentifiers.id_slh_dsa_shake_256f;
        hashMap32.put(sLHDSAParameters12, aSN1ObjectIdentifier104);
        SLHDSAParameters sLHDSAParameters13 = SLHDSAParameters.sha2_128s_with_sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier105 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128s_with_sha256;
        hashMap32.put(sLHDSAParameters13, aSN1ObjectIdentifier105);
        SLHDSAParameters sLHDSAParameters14 = SLHDSAParameters.sha2_128f_with_sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier106 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128f_with_sha256;
        hashMap32.put(sLHDSAParameters14, aSN1ObjectIdentifier106);
        SLHDSAParameters sLHDSAParameters15 = SLHDSAParameters.sha2_192s_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier107 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192s_with_sha512;
        hashMap32.put(sLHDSAParameters15, aSN1ObjectIdentifier107);
        SLHDSAParameters sLHDSAParameters16 = SLHDSAParameters.sha2_192f_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier108 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192f_with_sha512;
        hashMap32.put(sLHDSAParameters16, aSN1ObjectIdentifier108);
        SLHDSAParameters sLHDSAParameters17 = SLHDSAParameters.sha2_256s_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier109 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256s_with_sha512;
        hashMap32.put(sLHDSAParameters17, aSN1ObjectIdentifier109);
        SLHDSAParameters sLHDSAParameters18 = SLHDSAParameters.sha2_256f_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier110 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256f_with_sha512;
        hashMap32.put(sLHDSAParameters18, aSN1ObjectIdentifier110);
        SLHDSAParameters sLHDSAParameters19 = SLHDSAParameters.shake_128s_with_shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier111 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128s_with_shake128;
        hashMap32.put(sLHDSAParameters19, aSN1ObjectIdentifier111);
        SLHDSAParameters sLHDSAParameters20 = SLHDSAParameters.shake_128f_with_shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier112 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128f_with_shake128;
        hashMap32.put(sLHDSAParameters20, aSN1ObjectIdentifier112);
        SLHDSAParameters sLHDSAParameters21 = SLHDSAParameters.shake_192s_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier113 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192s_with_shake256;
        hashMap32.put(sLHDSAParameters21, aSN1ObjectIdentifier113);
        SLHDSAParameters sLHDSAParameters22 = SLHDSAParameters.shake_192f_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier114 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192f_with_shake256;
        hashMap32.put(sLHDSAParameters22, aSN1ObjectIdentifier114);
        SLHDSAParameters sLHDSAParameters23 = SLHDSAParameters.shake_256s_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier115 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256s_with_shake256;
        hashMap32.put(sLHDSAParameters23, aSN1ObjectIdentifier115);
        SLHDSAParameters sLHDSAParameters24 = SLHDSAParameters.shake_256f_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier116 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256f_with_shake256;
        hashMap32.put(sLHDSAParameters24, aSN1ObjectIdentifier116);
        hashMap33.put(aSN1ObjectIdentifier93, sLHDSAParameters);
        hashMap33.put(aSN1ObjectIdentifier94, sLHDSAParameters2);
        hashMap33.put(aSN1ObjectIdentifier95, sLHDSAParameters3);
        hashMap33.put(aSN1ObjectIdentifier96, sLHDSAParameters4);
        hashMap33.put(aSN1ObjectIdentifier97, sLHDSAParameters5);
        hashMap33.put(aSN1ObjectIdentifier98, sLHDSAParameters6);
        hashMap33.put(aSN1ObjectIdentifier99, sLHDSAParameters7);
        hashMap33.put(aSN1ObjectIdentifier100, sLHDSAParameters8);
        hashMap33.put(aSN1ObjectIdentifier101, sLHDSAParameters9);
        hashMap33.put(aSN1ObjectIdentifier102, sLHDSAParameters10);
        hashMap33.put(aSN1ObjectIdentifier103, sLHDSAParameters11);
        hashMap33.put(aSN1ObjectIdentifier104, sLHDSAParameters12);
        hashMap33.put(aSN1ObjectIdentifier105, sLHDSAParameters13);
        hashMap33.put(aSN1ObjectIdentifier106, sLHDSAParameters14);
        hashMap33.put(aSN1ObjectIdentifier107, sLHDSAParameters15);
        hashMap33.put(aSN1ObjectIdentifier108, sLHDSAParameters16);
        hashMap33.put(aSN1ObjectIdentifier109, sLHDSAParameters17);
        hashMap33.put(aSN1ObjectIdentifier110, sLHDSAParameters18);
        hashMap33.put(aSN1ObjectIdentifier111, sLHDSAParameters19);
        hashMap33.put(aSN1ObjectIdentifier112, sLHDSAParameters20);
        hashMap33.put(aSN1ObjectIdentifier113, sLHDSAParameters21);
        hashMap33.put(aSN1ObjectIdentifier114, sLHDSAParameters22);
        hashMap33.put(aSN1ObjectIdentifier115, sLHDSAParameters23);
        hashMap33.put(aSN1ObjectIdentifier116, sLHDSAParameters24);
        ASN1ObjectIdentifier aSN1ObjectIdentifier117 = BCObjectIdentifiers.sphincsPlus_sha2_128s;
        hashMap10.put(sLHDSAParameters, aSN1ObjectIdentifier117);
        ASN1ObjectIdentifier aSN1ObjectIdentifier118 = BCObjectIdentifiers.sphincsPlus_sha2_128f;
        hashMap10.put(sLHDSAParameters2, aSN1ObjectIdentifier118);
        ASN1ObjectIdentifier aSN1ObjectIdentifier119 = BCObjectIdentifiers.sphincsPlus_sha2_192s;
        hashMap10.put(sLHDSAParameters3, aSN1ObjectIdentifier119);
        ASN1ObjectIdentifier aSN1ObjectIdentifier120 = BCObjectIdentifiers.sphincsPlus_sha2_192f;
        hashMap10.put(sLHDSAParameters4, aSN1ObjectIdentifier120);
        ASN1ObjectIdentifier aSN1ObjectIdentifier121 = BCObjectIdentifiers.sphincsPlus_sha2_256s;
        hashMap10.put(sLHDSAParameters5, aSN1ObjectIdentifier121);
        ASN1ObjectIdentifier aSN1ObjectIdentifier122 = BCObjectIdentifiers.sphincsPlus_sha2_256f;
        hashMap10.put(sLHDSAParameters6, aSN1ObjectIdentifier122);
        ASN1ObjectIdentifier aSN1ObjectIdentifier123 = BCObjectIdentifiers.sphincsPlus_shake_128s;
        hashMap10.put(sLHDSAParameters7, aSN1ObjectIdentifier123);
        ASN1ObjectIdentifier aSN1ObjectIdentifier124 = BCObjectIdentifiers.sphincsPlus_shake_128f;
        hashMap10.put(sLHDSAParameters8, aSN1ObjectIdentifier124);
        ASN1ObjectIdentifier aSN1ObjectIdentifier125 = BCObjectIdentifiers.sphincsPlus_shake_192s;
        hashMap10.put(sLHDSAParameters9, aSN1ObjectIdentifier125);
        ASN1ObjectIdentifier aSN1ObjectIdentifier126 = BCObjectIdentifiers.sphincsPlus_shake_192f;
        hashMap10.put(sLHDSAParameters10, aSN1ObjectIdentifier126);
        ASN1ObjectIdentifier aSN1ObjectIdentifier127 = BCObjectIdentifiers.sphincsPlus_shake_256s;
        hashMap10.put(sLHDSAParameters11, aSN1ObjectIdentifier127);
        ASN1ObjectIdentifier aSN1ObjectIdentifier128 = BCObjectIdentifiers.sphincsPlus_shake_256f;
        hashMap10.put(sLHDSAParameters12, aSN1ObjectIdentifier128);
        SPHINCSPlusParameters sPHINCSPlusParameters = SPHINCSPlusParameters.sha2_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier129 = BCObjectIdentifiers.sphincsPlus_sha2_128s_r3;
        hashMap10.put(sPHINCSPlusParameters, aSN1ObjectIdentifier129);
        SPHINCSPlusParameters sPHINCSPlusParameters2 = SPHINCSPlusParameters.sha2_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier130 = BCObjectIdentifiers.sphincsPlus_sha2_128f_r3;
        hashMap10.put(sPHINCSPlusParameters2, aSN1ObjectIdentifier130);
        SPHINCSPlusParameters sPHINCSPlusParameters3 = SPHINCSPlusParameters.shake_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier131 = BCObjectIdentifiers.sphincsPlus_shake_128s_r3;
        hashMap10.put(sPHINCSPlusParameters3, aSN1ObjectIdentifier131);
        SPHINCSPlusParameters sPHINCSPlusParameters4 = SPHINCSPlusParameters.shake_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier132 = BCObjectIdentifiers.sphincsPlus_shake_128f_r3;
        hashMap10.put(sPHINCSPlusParameters4, aSN1ObjectIdentifier132);
        SPHINCSPlusParameters sPHINCSPlusParameters5 = SPHINCSPlusParameters.haraka_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier133 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3;
        hashMap10.put(sPHINCSPlusParameters5, aSN1ObjectIdentifier133);
        SPHINCSPlusParameters sPHINCSPlusParameters6 = SPHINCSPlusParameters.haraka_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier134 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3;
        hashMap10.put(sPHINCSPlusParameters6, aSN1ObjectIdentifier134);
        SPHINCSPlusParameters sPHINCSPlusParameters7 = SPHINCSPlusParameters.sha2_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier135 = BCObjectIdentifiers.sphincsPlus_sha2_192s_r3;
        hashMap10.put(sPHINCSPlusParameters7, aSN1ObjectIdentifier135);
        SPHINCSPlusParameters sPHINCSPlusParameters8 = SPHINCSPlusParameters.sha2_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier136 = BCObjectIdentifiers.sphincsPlus_sha2_192f_r3;
        hashMap10.put(sPHINCSPlusParameters8, aSN1ObjectIdentifier136);
        SPHINCSPlusParameters sPHINCSPlusParameters9 = SPHINCSPlusParameters.shake_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier137 = BCObjectIdentifiers.sphincsPlus_shake_192s_r3;
        hashMap10.put(sPHINCSPlusParameters9, aSN1ObjectIdentifier137);
        SPHINCSPlusParameters sPHINCSPlusParameters10 = SPHINCSPlusParameters.shake_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier138 = BCObjectIdentifiers.sphincsPlus_shake_192f_r3;
        hashMap10.put(sPHINCSPlusParameters10, aSN1ObjectIdentifier138);
        SPHINCSPlusParameters sPHINCSPlusParameters11 = SPHINCSPlusParameters.haraka_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier139 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3;
        hashMap10.put(sPHINCSPlusParameters11, aSN1ObjectIdentifier139);
        SPHINCSPlusParameters sPHINCSPlusParameters12 = SPHINCSPlusParameters.haraka_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier140 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3;
        hashMap10.put(sPHINCSPlusParameters12, aSN1ObjectIdentifier140);
        SPHINCSPlusParameters sPHINCSPlusParameters13 = SPHINCSPlusParameters.sha2_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier141 = BCObjectIdentifiers.sphincsPlus_sha2_256s_r3;
        hashMap10.put(sPHINCSPlusParameters13, aSN1ObjectIdentifier141);
        SPHINCSPlusParameters sPHINCSPlusParameters14 = SPHINCSPlusParameters.sha2_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier142 = BCObjectIdentifiers.sphincsPlus_sha2_256f_r3;
        hashMap10.put(sPHINCSPlusParameters14, aSN1ObjectIdentifier142);
        SPHINCSPlusParameters sPHINCSPlusParameters15 = SPHINCSPlusParameters.shake_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier143 = BCObjectIdentifiers.sphincsPlus_shake_256s_r3;
        hashMap10.put(sPHINCSPlusParameters15, aSN1ObjectIdentifier143);
        SPHINCSPlusParameters sPHINCSPlusParameters16 = SPHINCSPlusParameters.shake_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier144 = BCObjectIdentifiers.sphincsPlus_shake_256f_r3;
        hashMap10.put(sPHINCSPlusParameters16, aSN1ObjectIdentifier144);
        SPHINCSPlusParameters sPHINCSPlusParameters17 = SPHINCSPlusParameters.haraka_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier145 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3;
        hashMap10.put(sPHINCSPlusParameters17, aSN1ObjectIdentifier145);
        SPHINCSPlusParameters sPHINCSPlusParameters18 = SPHINCSPlusParameters.haraka_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier146 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3;
        hashMap10.put(sPHINCSPlusParameters18, aSN1ObjectIdentifier146);
        SPHINCSPlusParameters sPHINCSPlusParameters19 = SPHINCSPlusParameters.haraka_128s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier147 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple;
        hashMap10.put(sPHINCSPlusParameters19, aSN1ObjectIdentifier147);
        SPHINCSPlusParameters sPHINCSPlusParameters20 = SPHINCSPlusParameters.haraka_128f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier148 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple;
        hashMap10.put(sPHINCSPlusParameters20, aSN1ObjectIdentifier148);
        SPHINCSPlusParameters sPHINCSPlusParameters21 = SPHINCSPlusParameters.haraka_192s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier149 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple;
        hashMap10.put(sPHINCSPlusParameters21, aSN1ObjectIdentifier149);
        SPHINCSPlusParameters sPHINCSPlusParameters22 = SPHINCSPlusParameters.haraka_192f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier150 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple;
        hashMap10.put(sPHINCSPlusParameters22, aSN1ObjectIdentifier150);
        SPHINCSPlusParameters sPHINCSPlusParameters23 = SPHINCSPlusParameters.haraka_256s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier151 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple;
        hashMap10.put(sPHINCSPlusParameters23, aSN1ObjectIdentifier151);
        SPHINCSPlusParameters sPHINCSPlusParameters24 = SPHINCSPlusParameters.haraka_256f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier152 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple;
        hashMap10.put(sPHINCSPlusParameters24, aSN1ObjectIdentifier152);
        SPHINCSPlusParameters sPHINCSPlusParameters25 = SPHINCSPlusParameters.sha2_128s;
        hashMap10.put(sPHINCSPlusParameters25, aSN1ObjectIdentifier117);
        SPHINCSPlusParameters sPHINCSPlusParameters26 = SPHINCSPlusParameters.sha2_128f;
        hashMap10.put(sPHINCSPlusParameters26, aSN1ObjectIdentifier118);
        SPHINCSPlusParameters sPHINCSPlusParameters27 = SPHINCSPlusParameters.sha2_192s;
        hashMap10.put(sPHINCSPlusParameters27, aSN1ObjectIdentifier119);
        SPHINCSPlusParameters sPHINCSPlusParameters28 = SPHINCSPlusParameters.sha2_192f;
        hashMap10.put(sPHINCSPlusParameters28, aSN1ObjectIdentifier120);
        SPHINCSPlusParameters sPHINCSPlusParameters29 = SPHINCSPlusParameters.sha2_256s;
        hashMap10.put(sPHINCSPlusParameters29, aSN1ObjectIdentifier121);
        SPHINCSPlusParameters sPHINCSPlusParameters30 = SPHINCSPlusParameters.sha2_256f;
        hashMap10.put(sPHINCSPlusParameters30, aSN1ObjectIdentifier122);
        SPHINCSPlusParameters sPHINCSPlusParameters31 = SPHINCSPlusParameters.shake_128s;
        hashMap10.put(sPHINCSPlusParameters31, aSN1ObjectIdentifier123);
        SPHINCSPlusParameters sPHINCSPlusParameters32 = SPHINCSPlusParameters.shake_128f;
        hashMap10.put(sPHINCSPlusParameters32, aSN1ObjectIdentifier124);
        SPHINCSPlusParameters sPHINCSPlusParameters33 = SPHINCSPlusParameters.shake_192s;
        hashMap10.put(sPHINCSPlusParameters33, aSN1ObjectIdentifier125);
        SPHINCSPlusParameters sPHINCSPlusParameters34 = SPHINCSPlusParameters.shake_192f;
        hashMap10.put(sPHINCSPlusParameters34, aSN1ObjectIdentifier126);
        SPHINCSPlusParameters sPHINCSPlusParameters35 = SPHINCSPlusParameters.shake_256s;
        hashMap10.put(sPHINCSPlusParameters35, aSN1ObjectIdentifier127);
        SPHINCSPlusParameters sPHINCSPlusParameters36 = SPHINCSPlusParameters.shake_256f;
        hashMap10.put(sPHINCSPlusParameters36, aSN1ObjectIdentifier128);
        hashMap11.put(aSN1ObjectIdentifier117, sPHINCSPlusParameters25);
        hashMap11.put(aSN1ObjectIdentifier118, sPHINCSPlusParameters26);
        hashMap11.put(aSN1ObjectIdentifier123, sPHINCSPlusParameters31);
        hashMap11.put(aSN1ObjectIdentifier124, sPHINCSPlusParameters32);
        hashMap11.put(aSN1ObjectIdentifier119, sPHINCSPlusParameters27);
        hashMap11.put(aSN1ObjectIdentifier120, sPHINCSPlusParameters28);
        hashMap11.put(aSN1ObjectIdentifier125, sPHINCSPlusParameters33);
        hashMap11.put(aSN1ObjectIdentifier126, sPHINCSPlusParameters34);
        hashMap11.put(aSN1ObjectIdentifier121, sPHINCSPlusParameters29);
        hashMap11.put(aSN1ObjectIdentifier122, sPHINCSPlusParameters30);
        hashMap11.put(aSN1ObjectIdentifier127, sPHINCSPlusParameters35);
        hashMap11.put(aSN1ObjectIdentifier128, sPHINCSPlusParameters36);
        hashMap11.put(aSN1ObjectIdentifier129, sPHINCSPlusParameters);
        hashMap11.put(aSN1ObjectIdentifier130, sPHINCSPlusParameters2);
        hashMap11.put(aSN1ObjectIdentifier131, sPHINCSPlusParameters3);
        hashMap11.put(aSN1ObjectIdentifier132, sPHINCSPlusParameters4);
        hashMap11.put(aSN1ObjectIdentifier133, sPHINCSPlusParameters5);
        hashMap11.put(aSN1ObjectIdentifier134, sPHINCSPlusParameters6);
        hashMap11.put(aSN1ObjectIdentifier135, sPHINCSPlusParameters7);
        hashMap11.put(aSN1ObjectIdentifier136, sPHINCSPlusParameters8);
        hashMap11.put(aSN1ObjectIdentifier137, sPHINCSPlusParameters9);
        hashMap11.put(aSN1ObjectIdentifier138, sPHINCSPlusParameters10);
        hashMap11.put(aSN1ObjectIdentifier139, sPHINCSPlusParameters11);
        hashMap11.put(aSN1ObjectIdentifier140, sPHINCSPlusParameters12);
        hashMap11.put(aSN1ObjectIdentifier141, sPHINCSPlusParameters13);
        hashMap11.put(aSN1ObjectIdentifier142, sPHINCSPlusParameters14);
        hashMap11.put(aSN1ObjectIdentifier143, sPHINCSPlusParameters15);
        hashMap11.put(aSN1ObjectIdentifier144, sPHINCSPlusParameters16);
        hashMap11.put(aSN1ObjectIdentifier145, sPHINCSPlusParameters17);
        hashMap11.put(aSN1ObjectIdentifier146, sPHINCSPlusParameters18);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, sPHINCSPlusParameters25);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, sPHINCSPlusParameters26);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, sPHINCSPlusParameters31);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, sPHINCSPlusParameters32);
        hashMap11.put(aSN1ObjectIdentifier147, sPHINCSPlusParameters19);
        hashMap11.put(aSN1ObjectIdentifier148, sPHINCSPlusParameters20);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, sPHINCSPlusParameters27);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, sPHINCSPlusParameters28);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, sPHINCSPlusParameters33);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, sPHINCSPlusParameters34);
        hashMap11.put(aSN1ObjectIdentifier149, sPHINCSPlusParameters21);
        hashMap11.put(aSN1ObjectIdentifier150, sPHINCSPlusParameters22);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, sPHINCSPlusParameters29);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, sPHINCSPlusParameters30);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, sPHINCSPlusParameters35);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, sPHINCSPlusParameters36);
        hashMap11.put(aSN1ObjectIdentifier151, sPHINCSPlusParameters23);
        hashMap11.put(aSN1ObjectIdentifier152, sPHINCSPlusParameters24);
    }

    public static ASN1ObjectIdentifier bikeOidLookup(BIKEParameters bIKEParameters) {
        return (ASN1ObjectIdentifier) bikeOids.get(bIKEParameters);
    }

    public static BIKEParameters bikeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (BIKEParameters) bikeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier dilithiumOidLookup(DilithiumParameters dilithiumParameters) {
        return (ASN1ObjectIdentifier) dilithiumOids.get(dilithiumParameters);
    }

    public static DilithiumParameters dilithiumParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (DilithiumParameters) dilithiumParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier falconOidLookup(FalconParameters falconParameters) {
        return (ASN1ObjectIdentifier) falconOids.get(falconParameters);
    }

    public static FalconParameters falconParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FalconParameters) falconParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier frodoOidLookup(FrodoParameters frodoParameters) {
        return (ASN1ObjectIdentifier) frodoOids.get(frodoParameters);
    }

    public static FrodoParameters frodoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FrodoParameters) frodoParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA1)) {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224);
        }
        if (str.equals("SHA-256")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        if (str.equals("SHA-512")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        }
        a$$ExternalSyntheticBUOutline0.m$3("unrecognised digest algorithm: ".concat(str));
        return null;
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m("unrecognized digest OID: ", aSN1ObjectIdentifier));
        return null;
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return McElieceCCA2KeyGenParameterSpec.SHA224;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return "SHA-256";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return "SHA-512";
        }
        a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m("unrecognised digest algorithm: ", aSN1ObjectIdentifier));
        return null;
    }

    public static ASN1ObjectIdentifier hqcOidLookup(HQCParameters hQCParameters) {
        return (ASN1ObjectIdentifier) hqcOids.get(hQCParameters);
    }

    public static HQCParameters hqcParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (HQCParameters) hqcParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mcElieceOidLookup(CMCEParameters cMCEParameters) {
        return (ASN1ObjectIdentifier) mcElieceOids.get(cMCEParameters);
    }

    public static CMCEParameters mcElieceParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (CMCEParameters) mcElieceParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mldsaOidLookup(MLDSAParameters mLDSAParameters) {
        return (ASN1ObjectIdentifier) mldsaOids.get(mLDSAParameters);
    }

    public static MLDSAParameters mldsaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MLDSAParameters) mldsaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mlkemOidLookup(MLKEMParameters mLKEMParameters) {
        return (ASN1ObjectIdentifier) mlkemOids.get(mLKEMParameters);
    }

    public static MLKEMParameters mlkemParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MLKEMParameters) mlkemParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntruOidLookup(NTRUParameters nTRUParameters) {
        return (ASN1ObjectIdentifier) ntruOids.get(nTRUParameters);
    }

    public static NTRUParameters ntruParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRUParameters) ntruParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntrulprimeOidLookup(NTRULPRimeParameters nTRULPRimeParameters) {
        return (ASN1ObjectIdentifier) ntruprimeOids.get(nTRULPRimeParameters);
    }

    public static NTRULPRimeParameters ntrulprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRULPRimeParameters) ntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier picnicOidLookup(PicnicParameters picnicParameters) {
        return (ASN1ObjectIdentifier) picnicOids.get(picnicParameters);
    }

    public static PicnicParameters picnicParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (PicnicParameters) picnicParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier qTeslaLookupAlgID(int i) {
        if (i == 5) {
            return AlgID_qTESLA_p_I;
        }
        if (i == 6) {
            return AlgID_qTESLA_p_III;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "unknown security category: "));
        return null;
    }

    public static int qTeslaLookupSecurityCategory(AlgorithmIdentifier algorithmIdentifier) {
        return ((Integer) categories.get(algorithmIdentifier.getAlgorithm())).intValue();
    }

    public static ASN1ObjectIdentifier rainbowOidLookup(RainbowParameters rainbowParameters) {
        return (ASN1ObjectIdentifier) rainbowOids.get(rainbowParameters);
    }

    public static RainbowParameters rainbowParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (RainbowParameters) rainbowParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier saberOidLookup(SABERParameters sABERParameters) {
        return (ASN1ObjectIdentifier) saberOids.get(sABERParameters);
    }

    public static SABERParameters saberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SABERParameters) saberParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier slhdsaOidLookup(SLHDSAParameters sLHDSAParameters) {
        return (ASN1ObjectIdentifier) shldsaOids.get(sLHDSAParameters);
    }

    public static SLHDSAParameters slhdsaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SLHDSAParameters) shldsaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier sntruprimeOidLookup(SNTRUPrimeParameters sNTRUPrimeParameters) {
        return (ASN1ObjectIdentifier) sntruprimeOids.get(sNTRUPrimeParameters);
    }

    public static SNTRUPrimeParameters sntruprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SNTRUPrimeParameters) sntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier sphincs256LookupTreeAlgID(String str) {
        if (str.equals("SHA3-256")) {
            return SPHINCS_SHA3_256;
        }
        if (str.equals(SPHINCSKeyParameters.SHA512_256)) {
            return SPHINCS_SHA512_256;
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown tree digest: ".concat(str));
        return null;
    }

    public static String sphincs256LookupTreeAlgName(SPHINCS256KeyParams sPHINCS256KeyParams) {
        AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA3_256.getAlgorithm())) {
            return "SHA3-256";
        }
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA512_256.getAlgorithm())) {
            return SPHINCSKeyParameters.SHA512_256;
        }
        Path$$ExternalSyntheticBUOutline0.m(treeDigest.getAlgorithm(), "unknown tree digest: ");
        return null;
    }

    public static ASN1ObjectIdentifier sphincsPlusOidLookup(SPHINCSPlusParameters sPHINCSPlusParameters) {
        return (ASN1ObjectIdentifier) sphincsPlusOids.get(sPHINCSPlusParameters);
    }

    public static SPHINCSPlusParameters sphincsPlusParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SPHINCSPlusParameters) sphincsPlusParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier xmssLookupTreeAlgID(String str) {
        if (str.equals("SHA-256")) {
            return XMSS_SHA256;
        }
        if (str.equals("SHA-512")) {
            return XMSS_SHA512;
        }
        if (str.equals("SHAKE128")) {
            return XMSS_SHAKE128;
        }
        if (str.equals("SHAKE256")) {
            return XMSS_SHAKE256;
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown tree digest: ".concat(str));
        return null;
    }
}
