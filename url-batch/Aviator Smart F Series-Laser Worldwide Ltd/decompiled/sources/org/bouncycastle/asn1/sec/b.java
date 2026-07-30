package org.bouncycastle.asn1.sec;

import com.baidu.ar.face.algo.FAUEnum;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class b {
    static org.bouncycastle.asn1.x9.f secp112r1 = new k();
    static org.bouncycastle.asn1.x9.f secp112r2 = new v();
    static org.bouncycastle.asn1.x9.f secp128r1 = new a0();
    static org.bouncycastle.asn1.x9.f secp128r2 = new b0();
    static org.bouncycastle.asn1.x9.f secp160k1 = new c0();
    static org.bouncycastle.asn1.x9.f secp160r1 = new d0();
    static org.bouncycastle.asn1.x9.f secp160r2 = new e0();
    static org.bouncycastle.asn1.x9.f secp192k1 = new f0();
    static org.bouncycastle.asn1.x9.f secp192r1 = new g0();
    static org.bouncycastle.asn1.x9.f secp224k1 = new a();
    static org.bouncycastle.asn1.x9.f secp224r1 = new C0385b();
    static org.bouncycastle.asn1.x9.f secp256k1 = new c();
    static org.bouncycastle.asn1.x9.f secp256r1 = new d();
    static org.bouncycastle.asn1.x9.f secp384r1 = new e();
    static org.bouncycastle.asn1.x9.f secp521r1 = new f();
    static org.bouncycastle.asn1.x9.f sect113r1 = new g();
    static org.bouncycastle.asn1.x9.f sect113r2 = new h();
    static org.bouncycastle.asn1.x9.f sect131r1 = new i();
    static org.bouncycastle.asn1.x9.f sect131r2 = new j();
    static org.bouncycastle.asn1.x9.f sect163k1 = new l();
    static org.bouncycastle.asn1.x9.f sect163r1 = new m();
    static org.bouncycastle.asn1.x9.f sect163r2 = new n();
    static org.bouncycastle.asn1.x9.f sect193r1 = new o();
    static org.bouncycastle.asn1.x9.f sect193r2 = new p();
    static org.bouncycastle.asn1.x9.f sect233k1 = new q();
    static org.bouncycastle.asn1.x9.f sect233r1 = new r();
    static org.bouncycastle.asn1.x9.f sect239k1 = new s();
    static org.bouncycastle.asn1.x9.f sect283k1 = new t();
    static org.bouncycastle.asn1.x9.f sect283r1 = new u();
    static org.bouncycastle.asn1.x9.f sect409k1 = new w();
    static org.bouncycastle.asn1.x9.f sect409r1 = new x();
    static org.bouncycastle.asn1.x9.f sect571k1 = new y();
    static org.bouncycastle.asn1.x9.f sect571r1 = new z();
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static class a extends org.bouncycastle.asn1.x9.f {
        a() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D");
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(5L);
            BigInteger fromHex2 = b.fromHex("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7");
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurveGLV = b.configureCurveGLV(new e.f(fromHex, bigInteger, valueOf, fromHex2, valueOf2), new org.bouncycastle.math.ec.endo.f(new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16), new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16), new org.bouncycastle.math.ec.endo.g(new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240)));
            return new org.bouncycastle.asn1.x9.e(configureCurveGLV, b.configureBasepoint(configureCurveGLV, "04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5"), fromHex2, valueOf2, null);
        }
    }

    static class a0 extends org.bouncycastle.asn1.x9.f {
        a0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
            BigInteger fromHex2 = b.fromHex("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC");
            BigInteger fromHex3 = b.fromHex("E87579C11079F43DD824993C2CEE5ED3");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("000E0D4D696E6768756151750CC03A4473D03679");
            BigInteger fromHex4 = b.fromHex("FFFFFFFE0000000075A30D1B9038A115");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83"), fromHex4, valueOf, decodeStrict);
        }
    }

    /* renamed from: org.bouncycastle.asn1.sec.b$b, reason: collision with other inner class name */
    static class C0385b extends org.bouncycastle.asn1.x9.f {
        C0385b() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
            BigInteger fromHex3 = b.fromHex("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
            BigInteger fromHex4 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class b0 extends org.bouncycastle.asn1.x9.f {
        b0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
            BigInteger fromHex2 = b.fromHex("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
            BigInteger fromHex3 = b.fromHex("5EEEFCA380D02919DC2C6558BB6D8A5D");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("004D696E67687561517512D8F03431FCE63B88F4");
            BigInteger fromHex4 = b.fromHex("3FFFFFFF7FFFFFFFBE0024720613B5A3");
            BigInteger valueOf = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class c extends org.bouncycastle.asn1.x9.f {
        c() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F");
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(7L);
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141");
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurveGLV = b.configureCurveGLV(new e.f(fromHex, bigInteger, valueOf, fromHex2, valueOf2), new org.bouncycastle.math.ec.endo.f(new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16), new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16), new org.bouncycastle.math.ec.endo.g(new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), DfuException.ERROR_READ_PATCH_INFO_ERROR)));
            return new org.bouncycastle.asn1.x9.e(configureCurveGLV, b.configureBasepoint(configureCurveGLV, "0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8"), fromHex2, valueOf2, null);
        }
    }

    static class c0 extends org.bouncycastle.asn1.x9.f {
        c0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(7L);
            BigInteger fromHex2 = b.fromHex("0100000000000000000001B8FA16DFAB9ACA16B6B3");
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurveGLV = b.configureCurveGLV(new e.f(fromHex, bigInteger, valueOf, fromHex2, valueOf2), new org.bouncycastle.math.ec.endo.f(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new org.bouncycastle.math.ec.endo.g(new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), DfuAdapter.ConnectState.REQUEST_MTU)));
            return new org.bouncycastle.asn1.x9.e(configureCurveGLV, b.configureBasepoint(configureCurveGLV, "043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE"), fromHex2, valueOf2, null);
        }
    }

    static class d extends org.bouncycastle.asn1.x9.f {
        d() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF");
            BigInteger fromHex2 = b.fromHex("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC");
            BigInteger fromHex3 = b.fromHex("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("C49D360886E704936A6678E1139D26B7819F7E90");
            BigInteger fromHex4 = b.fromHex("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class d0 extends org.bouncycastle.asn1.x9.f {
        d0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
            BigInteger fromHex3 = b.fromHex("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("1053CDE42C14D696E67687561517533BF3F83345");
            BigInteger fromHex4 = b.fromHex("0100000000000000000001F4C8F927AED3CA752257");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class e extends org.bouncycastle.asn1.x9.f {
        e() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF");
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC");
            BigInteger fromHex3 = b.fromHex("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("A335926AA319A27A1D00896A6773A4827ACDAC73");
            BigInteger fromHex4 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class e0 extends org.bouncycastle.asn1.x9.f {
        e0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70");
            BigInteger fromHex3 = b.fromHex("B4E134D3FB59EB8BAB57274904664D5AF50388BA");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("B99B99B099B323E02709A4D696E6768756151751");
            BigInteger fromHex4 = b.fromHex("0100000000000000000000351EE786A818F3A1A16B");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class f extends org.bouncycastle.asn1.x9.f {
        f() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
            BigInteger fromHex2 = b.fromHex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC");
            BigInteger fromHex3 = b.fromHex("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("D09E8800291CB85396CC6717393284AAA0DA64BA");
            BigInteger fromHex4 = b.fromHex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class f0 extends org.bouncycastle.asn1.x9.f {
        f0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37");
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(3L);
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D");
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurveGLV = b.configureCurveGLV(new e.f(fromHex, bigInteger, valueOf, fromHex2, valueOf2), new org.bouncycastle.math.ec.endo.f(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new org.bouncycastle.math.ec.endo.g(new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), FAUEnum.PR_ANIMATE_FAILED)));
            return new org.bouncycastle.asn1.x9.e(configureCurveGLV, b.configureBasepoint(configureCurveGLV, "04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D"), fromHex2, valueOf2, null);
        }
    }

    static class g extends org.bouncycastle.asn1.x9.f {
        g() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("003088250CA6E7C7FE649CE85820F7");
            BigInteger fromHex2 = b.fromHex("00E8BEE4D3E2260744188BE0E9C723");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("10E723AB14D696E6768756151756FEBF8FCB49A9");
            BigInteger fromHex3 = b.fromHex("0100000000000000D9CCEC8A39E56F");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(113, 9, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class g0 extends org.bouncycastle.asn1.x9.f {
        g0() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF");
            BigInteger fromHex2 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC");
            BigInteger fromHex3 = b.fromHex("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("3045AE6FC8422F64ED579528D38120EAE12196D5");
            BigInteger fromHex4 = b.fromHex("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class h extends org.bouncycastle.asn1.x9.f {
        h() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("00689918DBEC7E5A0DD6DFC0AA55C7");
            BigInteger fromHex2 = b.fromHex("0095E9A9EC9B297BD4BF36E059184F");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("10C0FB15760860DEF1EEF4D696E676875615175D");
            BigInteger fromHex3 = b.fromHex("010000000000000108789B2496AF93");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(113, 9, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class i extends org.bouncycastle.asn1.x9.f {
        i() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("07A11B09A76B562144418FF3FF8C2570B8");
            BigInteger fromHex2 = b.fromHex("0217C05610884B63B9C6C7291678F9D341");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("4D696E676875615175985BD3ADBADA21B43A97E2");
            BigInteger fromHex3 = b.fromHex("0400000000000000023123953A9464B54D");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(131, 2, 3, 8, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class j extends org.bouncycastle.asn1.x9.f {
        j() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("03E5A88919D7CAFCBF415F07C2176573B2");
            BigInteger fromHex2 = b.fromHex("04B8266A46C55657AC734CE38F018F2192");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("985BD3ADBAD4D696E676875615175A21B43A97E3");
            BigInteger fromHex3 = b.fromHex("0400000000000000016954A233049BA98F");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(131, 2, 3, 8, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class k extends org.bouncycastle.asn1.x9.f {
        k() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("DB7C2ABF62E35E668076BEAD208B");
            BigInteger fromHex2 = b.fromHex("DB7C2ABF62E35E668076BEAD2088");
            BigInteger fromHex3 = b.fromHex("659EF8BA043916EEDE8911702B22");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("00F50B028E4D696E676875615175290472783FB1");
            BigInteger fromHex4 = b.fromHex("DB7C2ABF62E35E7628DFAC6561C5");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class l extends org.bouncycastle.asn1.x9.f {
        l() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("04000000000000000000020108A2E0CC0D99F8A5EF");
            BigInteger valueOf3 = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(163, 3, 6, 7, valueOf, valueOf2, fromHex, valueOf3));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9"), fromHex, valueOf3, null);
        }
    }

    static class m extends org.bouncycastle.asn1.x9.f {
        m() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
            BigInteger fromHex2 = b.fromHex("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("24B7B137C8A14D696E6768756151756FD0DA2E5C");
            BigInteger fromHex3 = b.fromHex("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(163, 3, 6, 7, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class n extends org.bouncycastle.asn1.x9.f {
        n() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("020A601907B8C953CA1481EB10512F78744A3205FD");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("85E25BFE5C86226CDB12016F7553F9D0E693A268");
            BigInteger fromHex2 = b.fromHex("040000000000000000000292FE77E70C12A4234C33");
            BigInteger valueOf2 = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(163, 3, 6, 7, valueOf, fromHex, fromHex2, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1"), fromHex2, valueOf2, decodeStrict);
        }
    }

    static class o extends org.bouncycastle.asn1.x9.f {
        o() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
            BigInteger fromHex2 = b.fromHex("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("103FAEC74D696E676875615175777FC5B191EF30");
            BigInteger fromHex3 = b.fromHex("01000000000000000000000000C7F34A778F443ACC920EBA49");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(193, 15, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class p extends org.bouncycastle.asn1.x9.f {
        p() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
            BigInteger fromHex2 = b.fromHex("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("10B7B4D696E676875615175137C8A16FD0DA2211");
            BigInteger fromHex3 = b.fromHex("010000000000000000000000015AAB561B005413CCD4EE99D5");
            BigInteger valueOf = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(193, 15, fromHex, fromHex2, fromHex3, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C"), fromHex3, valueOf, decodeStrict);
        }
    }

    static class q extends org.bouncycastle.asn1.x9.f {
        q() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF");
            BigInteger valueOf2 = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(233, 74, bigInteger, valueOf, fromHex, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"), fromHex, valueOf2, null);
        }
    }

    static class r extends org.bouncycastle.asn1.x9.f {
        r() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
            BigInteger fromHex2 = b.fromHex("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
            BigInteger valueOf2 = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(233, 74, valueOf, fromHex, fromHex2, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052"), fromHex2, valueOf2, decodeStrict);
        }
    }

    static class s extends org.bouncycastle.asn1.x9.f {
        s() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5");
            BigInteger valueOf2 = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(239, 158, bigInteger, valueOf, fromHex, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA"), fromHex, valueOf2, null);
        }
    }

    static class t extends org.bouncycastle.asn1.x9.f {
        t() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61");
            BigInteger valueOf2 = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(283, 5, 7, 12, bigInteger, valueOf, fromHex, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259"), fromHex, valueOf2, null);
        }
    }

    static class u extends org.bouncycastle.asn1.x9.f {
        u() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
            BigInteger fromHex2 = b.fromHex("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307");
            BigInteger valueOf2 = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(283, 5, 7, 12, valueOf, fromHex, fromHex2, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4"), fromHex2, valueOf2, decodeStrict);
        }
    }

    static class v extends org.bouncycastle.asn1.x9.f {
        v() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = b.fromHex("DB7C2ABF62E35E668076BEAD208B");
            BigInteger fromHex2 = b.fromHex("6127C24C05F38A0AAAF65C0EF02C");
            BigInteger fromHex3 = b.fromHex("51DEF1815DB5ED74FCC34C85D709");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("002757A1114D696E6768756151755316C05E0BD4");
            BigInteger fromHex4 = b.fromHex("36DF0AAFD8B8D7597CA10520D04B");
            BigInteger valueOf = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "044BA30AB5E892B4E1649DD0928643ADCD46F5882E3747DEF36E956E97"), fromHex4, valueOf, decodeStrict);
        }
    }

    static class w extends org.bouncycastle.asn1.x9.f {
        w() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF");
            BigInteger valueOf2 = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(409, 87, bigInteger, valueOf, fromHex, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B"), fromHex, valueOf2, null);
        }
    }

    static class x extends org.bouncycastle.asn1.x9.f {
        x() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("4099B5A457F9D69F79213D094C4BCD4D4262210B");
            BigInteger fromHex2 = b.fromHex("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173");
            BigInteger valueOf2 = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(409, 87, valueOf, fromHex, fromHex2, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A70061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706"), fromHex2, valueOf2, decodeStrict);
        }
    }

    static class y extends org.bouncycastle.asn1.x9.f {
        y() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001");
            BigInteger valueOf2 = BigInteger.valueOf(4L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(571, 2, 5, 10, bigInteger, valueOf, fromHex, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3"), fromHex, valueOf2, null);
        }
    }

    static class z extends org.bouncycastle.asn1.x9.f {
        z() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger valueOf = BigInteger.valueOf(1L);
            BigInteger fromHex = b.fromHex("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A");
            byte[] decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("2AA058F73A0E33AB486B0F610410C53A7F132310");
            BigInteger fromHex2 = b.fromHex("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47");
            BigInteger valueOf2 = BigInteger.valueOf(2L);
            org.bouncycastle.math.ec.e configureCurve = b.configureCurve(new e.C0394e(571, 2, 5, 10, valueOf, fromHex, fromHex2, valueOf2));
            return new org.bouncycastle.asn1.x9.e(configureCurve, b.configureBasepoint(configureCurve, "040303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B"), fromHex2, valueOf2, decodeStrict);
        }
    }

    static {
        defineCurve("secp112r1", org.bouncycastle.asn1.sec.c.secp112r1, secp112r1);
        defineCurve("secp112r2", org.bouncycastle.asn1.sec.c.secp112r2, secp112r2);
        defineCurve("secp128r1", org.bouncycastle.asn1.sec.c.secp128r1, secp128r1);
        defineCurve("secp128r2", org.bouncycastle.asn1.sec.c.secp128r2, secp128r2);
        defineCurve("secp160k1", org.bouncycastle.asn1.sec.c.secp160k1, secp160k1);
        defineCurve("secp160r1", org.bouncycastle.asn1.sec.c.secp160r1, secp160r1);
        defineCurve("secp160r2", org.bouncycastle.asn1.sec.c.secp160r2, secp160r2);
        defineCurve("secp192k1", org.bouncycastle.asn1.sec.c.secp192k1, secp192k1);
        defineCurve("secp192r1", org.bouncycastle.asn1.sec.c.secp192r1, secp192r1);
        defineCurve("secp224k1", org.bouncycastle.asn1.sec.c.secp224k1, secp224k1);
        defineCurve("secp224r1", org.bouncycastle.asn1.sec.c.secp224r1, secp224r1);
        defineCurve("secp256k1", org.bouncycastle.asn1.sec.c.secp256k1, secp256k1);
        defineCurve("secp256r1", org.bouncycastle.asn1.sec.c.secp256r1, secp256r1);
        defineCurve("secp384r1", org.bouncycastle.asn1.sec.c.secp384r1, secp384r1);
        defineCurve("secp521r1", org.bouncycastle.asn1.sec.c.secp521r1, secp521r1);
        defineCurve("sect113r1", org.bouncycastle.asn1.sec.c.sect113r1, sect113r1);
        defineCurve("sect113r2", org.bouncycastle.asn1.sec.c.sect113r2, sect113r2);
        defineCurve("sect131r1", org.bouncycastle.asn1.sec.c.sect131r1, sect131r1);
        defineCurve("sect131r2", org.bouncycastle.asn1.sec.c.sect131r2, sect131r2);
        defineCurve("sect163k1", org.bouncycastle.asn1.sec.c.sect163k1, sect163k1);
        defineCurve("sect163r1", org.bouncycastle.asn1.sec.c.sect163r1, sect163r1);
        defineCurve("sect163r2", org.bouncycastle.asn1.sec.c.sect163r2, sect163r2);
        defineCurve("sect193r1", org.bouncycastle.asn1.sec.c.sect193r1, sect193r1);
        defineCurve("sect193r2", org.bouncycastle.asn1.sec.c.sect193r2, sect193r2);
        defineCurve("sect233k1", org.bouncycastle.asn1.sec.c.sect233k1, sect233k1);
        defineCurve("sect233r1", org.bouncycastle.asn1.sec.c.sect233r1, sect233r1);
        defineCurve("sect239k1", org.bouncycastle.asn1.sec.c.sect239k1, sect239k1);
        defineCurve("sect283k1", org.bouncycastle.asn1.sec.c.sect283k1, sect283k1);
        defineCurve("sect283r1", org.bouncycastle.asn1.sec.c.sect283r1, sect283r1);
        defineCurve("sect409k1", org.bouncycastle.asn1.sec.c.sect409k1, sect409k1);
        defineCurve("sect409r1", org.bouncycastle.asn1.sec.c.sect409r1, sect409r1);
        defineCurve("sect571k1", org.bouncycastle.asn1.sec.c.sect571k1, sect571k1);
        defineCurve("sect571r1", org.bouncycastle.asn1.sec.c.sect571r1, sect571r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.asn1.x9.g configureBasepoint(org.bouncycastle.math.ec.e eVar, String str) {
        org.bouncycastle.asn1.x9.g gVar = new org.bouncycastle.asn1.x9.g(eVar, org.bouncycastle.util.encoders.d.decodeStrict(str));
        org.bouncycastle.math.ec.x.configureBasepoint(gVar.getPoint());
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.math.ec.e configureCurve(org.bouncycastle.math.ec.e eVar) {
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.math.ec.e configureCurveGLV(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.endo.f fVar) {
        return eVar.configure().setEndomorphism(new org.bouncycastle.math.ec.endo.e(eVar, fVar)).create();
    }

    static void defineCurve(String str, org.bouncycastle.asn1.o oVar, org.bouncycastle.asn1.x9.f fVar) {
        objIds.put(str, oVar);
        names.put(oVar, str);
        curves.put(oVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger fromHex(String str) {
        return new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict(str));
    }

    public static org.bouncycastle.asn1.x9.e getByName(String str) {
        org.bouncycastle.asn1.o oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }

    public static org.bouncycastle.asn1.x9.e getByOID(org.bouncycastle.asn1.o oVar) {
        org.bouncycastle.asn1.x9.f fVar = (org.bouncycastle.asn1.x9.f) curves.get(oVar);
        if (fVar == null) {
            return null;
        }
        return fVar.getParameters();
    }

    public static String getName(org.bouncycastle.asn1.o oVar) {
        return (String) names.get(oVar);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static org.bouncycastle.asn1.o getOID(String str) {
        return (org.bouncycastle.asn1.o) objIds.get(Strings.toLowerCase(str));
    }
}
