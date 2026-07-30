package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.x9.g;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.i;
import org.bouncycastle.math.ec.x;

/* loaded from: classes5.dex */
public class b {
    static final Hashtable names;
    static final Hashtable objIds;
    static final Hashtable params;

    static {
        Hashtable hashtable = new Hashtable();
        objIds = hashtable;
        Hashtable hashtable2 = new Hashtable();
        params = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        names = hashtable3;
        BigInteger fromHex = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97");
        BigInteger fromHex2 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893");
        BigInteger fromHex3 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94");
        BigInteger fromHex4 = fromHex("A6");
        BigInteger bigInteger = d.ONE;
        e configureCurve = configureCurve(new e.f(fromHex, fromHex3, fromHex4, fromHex2, bigInteger));
        f fVar = new f(configureCurve, configureBasepoint(configureCurve, bigInteger, fromHex("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14")), fromHex2, bigInteger);
        o oVar = a.gostR3410_2001_CryptoPro_A;
        hashtable2.put(oVar, fVar);
        BigInteger fromHex5 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97");
        BigInteger fromHex6 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893");
        e configureCurve2 = configureCurve(new e.f(fromHex5, fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94"), fromHex("A6"), fromHex6, bigInteger));
        f fVar2 = new f(configureCurve2, configureBasepoint(configureCurve2, bigInteger, fromHex("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14")), fromHex6, bigInteger);
        o oVar2 = a.gostR3410_2001_CryptoPro_XchA;
        hashtable2.put(oVar2, fVar2);
        BigInteger fromHex7 = fromHex("8000000000000000000000000000000000000000000000000000000000000C99");
        BigInteger fromHex8 = fromHex("800000000000000000000000000000015F700CFFF1A624E5E497161BCC8A198F");
        e configureCurve3 = configureCurve(new e.f(fromHex7, fromHex("8000000000000000000000000000000000000000000000000000000000000C96"), fromHex("3E1AF419A269A5F866A7D3C25C3DF80AE979259373FF2B182F49D4CE7E1BBC8B"), fromHex8, bigInteger));
        f fVar3 = new f(configureCurve3, configureBasepoint(configureCurve3, bigInteger, fromHex("3FA8124359F96680B83D1C3EB2C070E5C545C9858D03ECFB744BF8D717717EFC")), fromHex8, bigInteger);
        o oVar3 = a.gostR3410_2001_CryptoPro_B;
        hashtable2.put(oVar3, fVar3);
        BigInteger fromHex9 = fromHex("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D759B");
        BigInteger fromHex10 = fromHex("9B9F605F5A858107AB1EC85E6B41C8AA582CA3511EDDFB74F02F3A6598980BB9");
        e configureCurve4 = configureCurve(new e.f(fromHex9, fromHex("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D7598"), fromHex("805A"), fromHex10, bigInteger));
        BigInteger bigInteger2 = d.ZERO;
        f fVar4 = new f(configureCurve4, configureBasepoint(configureCurve4, bigInteger2, fromHex("41ECE55743711A8C3CBF3783CD08C0EE4D4DC440D4641A8F366E550DFDB3BB67")), fromHex10, bigInteger);
        o oVar4 = a.gostR3410_2001_CryptoPro_XchB;
        hashtable2.put(oVar4, fVar4);
        BigInteger fromHex11 = fromHex("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D759B");
        BigInteger fromHex12 = fromHex("9B9F605F5A858107AB1EC85E6B41C8AA582CA3511EDDFB74F02F3A6598980BB9");
        e configureCurve5 = configureCurve(new e.f(fromHex11, fromHex("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D7598"), fromHex("805A"), fromHex12, bigInteger));
        f fVar5 = new f(configureCurve5, configureBasepoint(configureCurve5, bigInteger2, fromHex("41ECE55743711A8C3CBF3783CD08C0EE4D4DC440D4641A8F366E550DFDB3BB67")), fromHex12, bigInteger);
        o oVar5 = a.gostR3410_2001_CryptoPro_C;
        hashtable2.put(oVar5, fVar5);
        BigInteger fromHex13 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97");
        BigInteger fromHex14 = fromHex("400000000000000000000000000000000FD8CDDFC87B6635C115AF556C360C67");
        BigInteger fromHex15 = fromHex("C2173F1513981673AF4892C23035A27CE25E2013BF95AA33B22C656F277E7335");
        BigInteger fromHex16 = fromHex("295F9BAE7428ED9CCC20E7C359A9D41A22FCCD9108E17BF7BA9337A6F8AE9513");
        BigInteger bigInteger3 = d.FOUR;
        e configureCurve6 = configureCurve(new e.f(fromHex13, fromHex15, fromHex16, fromHex14, bigInteger3));
        f fVar6 = new f(configureCurve6, configureBasepoint(configureCurve6, fromHex("91E38443A5E82C0D880923425712B2BB658B9196932E02C78B2582FE742DAA28"), fromHex("32879423AB1A0375895786C4BB46E9565FDE0B5344766740AF268ADB32322E5C")), fromHex14, bigInteger3);
        o oVar6 = u6.a.id_tc26_gost_3410_12_256_paramSetA;
        hashtable2.put(oVar6, fVar6);
        BigInteger fromHex17 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7");
        BigInteger fromHex18 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF27E69532F48D89116FF22B8D4E0560609B4B38ABFAD2B85DCACDB1411F10B275");
        e configureCurve7 = configureCurve(new e.f(fromHex17, fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC4"), fromHex("E8C2505DEDFC86DDC1BD0B2B6667F1DA34B82574761CB0E879BD081CFD0B6265EE3CB090F30D27614CB4574010DA90DD862EF9D4EBEE4761503190785A71C760"), fromHex18, bigInteger));
        f fVar7 = new f(configureCurve7, configureBasepoint(configureCurve7, d.THREE, fromHex("7503CFE87A836AE3A61B8816E25450E6CE5E1C93ACF1ABC1778064FDCBEFA921DF1626BE4FD036E93D75E6A50E3A41E98028FE5FC235F5B889A589CB5215F2A4")), fromHex18, bigInteger);
        o oVar7 = u6.a.id_tc26_gost_3410_12_512_paramSetA;
        hashtable2.put(oVar7, fVar7);
        BigInteger fromHex19 = fromHex("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006F");
        BigInteger fromHex20 = fromHex("800000000000000000000000000000000000000000000000000000000000000149A1EC142565A545ACFDB77BD9D40CFA8B996712101BEA0EC6346C54374F25BD");
        e configureCurve8 = configureCurve(new e.f(fromHex19, fromHex("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006C"), fromHex("687D1B459DC841457E3E06CF6F5E2517B97C7D614AF138BCBF85DC806C4B289F3E965D2DB1416D217F8B276FAD1AB69C50F78BEE1FA3106EFB8CCBC7C5140116"), fromHex20, bigInteger));
        f fVar8 = new f(configureCurve8, configureBasepoint(configureCurve8, d.TWO, fromHex("1A8F7EDA389B094C2C071E3647A8940F3C123B697578C213BE6DD9E6C8EC7335DCB228FD1EDF4A39152CBCAAF8C0398828041055F94CEEEC7E21340780FE41BD")), fromHex20, bigInteger);
        o oVar8 = u6.a.id_tc26_gost_3410_12_512_paramSetB;
        hashtable2.put(oVar8, fVar8);
        BigInteger fromHex21 = fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7");
        BigInteger fromHex22 = fromHex("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC98CDBA46506AB004C33A9FF5147502CC8EDA9E7A769A12694623CEF47F023ED");
        e configureCurve9 = configureCurve(new e.f(fromHex21, fromHex("DC9203E514A721875485A529D2C722FB187BC8980EB866644DE41C68E143064546E861C0E2C9EDD92ADE71F46FCF50FF2AD97F951FDA9F2A2EB6546F39689BD3"), fromHex("B4C4EE28CEBC6C2C8AC12952CF37F16AC7EFB6A9F69F4B57FFDA2E4F0DE5ADE038CBC2FFF719D2C18DE0284B8BFEF3B52B8CC7A5F5BF0A3C8D2319A5312557E1"), fromHex22, bigInteger3));
        f fVar9 = new f(configureCurve9, configureBasepoint(configureCurve9, fromHex("E2E31EDFC23DE7BDEBE241CE593EF5DE2295B7A9CBAEF021D385F7074CEA043AA27272A7AE602BF2A7B9033DB9ED3610C6FB85487EAE97AAC5BC7928C1950148"), fromHex("F5CE40D95B5EB899ABBCCFF5911CB8577939804D6527378B8C108C3D2090FF9BE18E2D33E3021ED2EF32D85822423B6304F726AA854BAE07D0396E9A9ADDC40F")), fromHex22, bigInteger3);
        o oVar9 = u6.a.id_tc26_gost_3410_12_512_paramSetC;
        hashtable2.put(oVar9, fVar9);
        hashtable.put("GostR3410-2001-CryptoPro-A", oVar);
        hashtable.put("GostR3410-2001-CryptoPro-B", oVar3);
        hashtable.put("GostR3410-2001-CryptoPro-C", oVar5);
        hashtable.put("GostR3410-2001-CryptoPro-XchA", oVar2);
        hashtable.put("GostR3410-2001-CryptoPro-XchB", oVar4);
        hashtable.put("Tc26-Gost-3410-12-256-paramSetA", oVar6);
        hashtable.put("Tc26-Gost-3410-12-512-paramSetA", oVar7);
        hashtable.put("Tc26-Gost-3410-12-512-paramSetB", oVar8);
        hashtable.put("Tc26-Gost-3410-12-512-paramSetC", oVar9);
        hashtable3.put(oVar, "GostR3410-2001-CryptoPro-A");
        hashtable3.put(oVar3, "GostR3410-2001-CryptoPro-B");
        hashtable3.put(oVar5, "GostR3410-2001-CryptoPro-C");
        hashtable3.put(oVar2, "GostR3410-2001-CryptoPro-XchA");
        hashtable3.put(oVar4, "GostR3410-2001-CryptoPro-XchB");
        hashtable3.put(oVar6, "Tc26-Gost-3410-12-256-paramSetA");
        hashtable3.put(oVar7, "Tc26-Gost-3410-12-512-paramSetA");
        hashtable3.put(oVar8, "Tc26-Gost-3410-12-512-paramSetB");
        hashtable3.put(oVar9, "Tc26-Gost-3410-12-512-paramSetC");
    }

    private static i configureBasepoint(e eVar, BigInteger bigInteger, BigInteger bigInteger2) {
        i createPoint = eVar.createPoint(bigInteger, bigInteger2);
        x.configureBasepoint(createPoint);
        return createPoint;
    }

    private static e configureCurve(e eVar) {
        return eVar;
    }

    private static BigInteger fromHex(String str) {
        return new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict(str));
    }

    public static f getByName(String str) {
        o oVar = (o) objIds.get(str);
        if (oVar == null) {
            return null;
        }
        return (f) params.get(oVar);
    }

    public static org.bouncycastle.asn1.x9.e getByNameX9(String str) {
        o oVar = (o) objIds.get(str);
        if (oVar == null) {
            return null;
        }
        return getByOIDX9(oVar);
    }

    public static f getByOID(o oVar) {
        return (f) params.get(oVar);
    }

    public static org.bouncycastle.asn1.x9.e getByOIDX9(o oVar) {
        f fVar = (f) params.get(oVar);
        if (fVar == null) {
            return null;
        }
        return new org.bouncycastle.asn1.x9.e(fVar.getCurve(), new g(fVar.getG(), false), fVar.getN(), fVar.getH(), fVar.getSeed());
    }

    public static String getName(o oVar) {
        return (String) names.get(oVar);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static o getOID(String str) {
        return (o) objIds.get(str);
    }
}
