package org.bouncycastle.asn1.cryptopro;

import androidx.exifinterface.media.ExifInterface;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public interface a {
    public static final o GOST_id;
    public static final o gostR28147_gcfb;
    public static final o gostR3410_2001;
    public static final o gostR3410_2001DH;
    public static final o gostR3410_2001_CryptoPro_A;
    public static final o gostR3410_2001_CryptoPro_B;
    public static final o gostR3410_2001_CryptoPro_C;
    public static final o gostR3410_2001_CryptoPro_ESDH;
    public static final o gostR3410_2001_CryptoPro_XchA;
    public static final o gostR3410_2001_CryptoPro_XchB;
    public static final o gostR3410_94;
    public static final o gostR3410_94_CryptoPro_A;
    public static final o gostR3410_94_CryptoPro_B;
    public static final o gostR3410_94_CryptoPro_C;
    public static final o gostR3410_94_CryptoPro_D;
    public static final o gostR3410_94_CryptoPro_XchA;
    public static final o gostR3410_94_CryptoPro_XchB;
    public static final o gostR3410_94_CryptoPro_XchC;
    public static final o gostR3411;
    public static final o gostR3411Hmac;
    public static final o gostR3411_94_CryptoProParamSet;
    public static final o gostR3411_94_with_gostR3410_2001;
    public static final o gostR3411_94_with_gostR3410_94;
    public static final o gost_ElSgDH3410_1;
    public static final o gost_ElSgDH3410_default;
    public static final o id_Gost28147_89_CryptoPro_A_ParamSet;
    public static final o id_Gost28147_89_CryptoPro_B_ParamSet;
    public static final o id_Gost28147_89_CryptoPro_C_ParamSet;
    public static final o id_Gost28147_89_CryptoPro_D_ParamSet;
    public static final o id_Gost28147_89_CryptoPro_KeyWrap;
    public static final o id_Gost28147_89_CryptoPro_TestParamSet;
    public static final o id_Gost28147_89_None_KeyWrap;

    static {
        o oVar = new o("1.2.643.2.2");
        GOST_id = oVar;
        gostR3411 = oVar.branch("9");
        gostR3411Hmac = oVar.branch("10");
        id_Gost28147_89_None_KeyWrap = oVar.branch("13.0");
        id_Gost28147_89_CryptoPro_KeyWrap = oVar.branch("13.1");
        gostR28147_gcfb = oVar.branch("21");
        id_Gost28147_89_CryptoPro_TestParamSet = oVar.branch("31.0");
        id_Gost28147_89_CryptoPro_A_ParamSet = oVar.branch("31.1");
        id_Gost28147_89_CryptoPro_B_ParamSet = oVar.branch("31.2");
        id_Gost28147_89_CryptoPro_C_ParamSet = oVar.branch("31.3");
        id_Gost28147_89_CryptoPro_D_ParamSet = oVar.branch("31.4");
        gostR3410_94 = oVar.branch("20");
        gostR3410_2001 = oVar.branch("19");
        gostR3411_94_with_gostR3410_94 = oVar.branch("4");
        gostR3411_94_with_gostR3410_2001 = oVar.branch(ExifInterface.GPS_MEASUREMENT_3D);
        gostR3411_94_CryptoProParamSet = oVar.branch("30.1");
        gostR3410_94_CryptoPro_A = oVar.branch("32.2");
        gostR3410_94_CryptoPro_B = oVar.branch("32.3");
        gostR3410_94_CryptoPro_C = oVar.branch("32.4");
        gostR3410_94_CryptoPro_D = oVar.branch("32.5");
        gostR3410_94_CryptoPro_XchA = oVar.branch("33.1");
        gostR3410_94_CryptoPro_XchB = oVar.branch("33.2");
        gostR3410_94_CryptoPro_XchC = oVar.branch("33.3");
        gostR3410_2001_CryptoPro_A = oVar.branch("35.1");
        gostR3410_2001_CryptoPro_B = oVar.branch("35.2");
        gostR3410_2001_CryptoPro_C = oVar.branch("35.3");
        gostR3410_2001_CryptoPro_XchA = oVar.branch("36.0");
        gostR3410_2001_CryptoPro_XchB = oVar.branch("36.1");
        gost_ElSgDH3410_default = oVar.branch("36.0");
        gost_ElSgDH3410_1 = oVar.branch("36.1");
        gostR3410_2001_CryptoPro_ESDH = oVar.branch("96");
        gostR3410_2001DH = oVar.branch("98");
    }
}
