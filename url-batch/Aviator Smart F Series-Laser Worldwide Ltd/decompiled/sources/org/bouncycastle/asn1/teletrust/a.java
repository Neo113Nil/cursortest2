package org.bouncycastle.asn1.teletrust;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.o;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.x;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class a {
    static org.bouncycastle.asn1.x9.f brainpoolP160r1 = new f();
    static org.bouncycastle.asn1.x9.f brainpoolP160t1 = new g();
    static org.bouncycastle.asn1.x9.f brainpoolP192r1 = new h();
    static org.bouncycastle.asn1.x9.f brainpoolP192t1 = new i();
    static org.bouncycastle.asn1.x9.f brainpoolP224r1 = new j();
    static org.bouncycastle.asn1.x9.f brainpoolP224t1 = new k();
    static org.bouncycastle.asn1.x9.f brainpoolP256r1 = new l();
    static org.bouncycastle.asn1.x9.f brainpoolP256t1 = new m();
    static org.bouncycastle.asn1.x9.f brainpoolP320r1 = new n();
    static org.bouncycastle.asn1.x9.f brainpoolP320t1 = new C0386a();
    static org.bouncycastle.asn1.x9.f brainpoolP384r1 = new b();
    static org.bouncycastle.asn1.x9.f brainpoolP384t1 = new c();
    static org.bouncycastle.asn1.x9.f brainpoolP512r1 = new d();
    static org.bouncycastle.asn1.x9.f brainpoolP512t1 = new e();
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    /* renamed from: org.bouncycastle.asn1.teletrust.a$a, reason: collision with other inner class name */
    static class C0386a extends org.bouncycastle.asn1.x9.f {
        C0386a() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27"), a.fromHex("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E24"), a.fromHex("A7F561E038EB1ED560B3D147DB782013064C19F27ED27C6780AAF77FB8A547CEB5B4FEF422340353"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04925BE9FB01AFC6FB4D3E7D4990010F813408AB106C4F09CB7EE07868CC136FFF3357F624A21BED5263BA3A7A27483EBF6671DBEF7ABB30EBEE084E58A0B077AD42A5A0989D1EE71B1B9BC0455FB0D2C3"), fromHex, valueOf);
        }
    }

    static class b extends org.bouncycastle.asn1.x9.f {
        b() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53"), a.fromHex("7BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826"), a.fromHex("04A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C11"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C5315"), fromHex, valueOf);
        }
    }

    static class c extends org.bouncycastle.asn1.x9.f {
        c() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53"), a.fromHex("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC50"), a.fromHex("7F519EADA7BDA81BD826DBA647910F8C4B9346ED8CCDC64E4B1ABD11756DCE1D2074AA263B88805CED70355A33B471EE"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "0418DE98B02DB9A306F2AFCD7235F72A819B80AB12EBD653172476FECD462AABFFC4FF191B946A5F54D8D0AA2F418808CC25AB056962D30651A114AFD2755AD336747F93475B7A1FCA3B88F2B6A208CCFE469408584DC2B2912675BF5B9E582928"), fromHex, valueOf);
        }
    }

    static class d extends org.bouncycastle.asn1.x9.f {
        d() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA70330870553E5C414CA92619418661197FAC10471DB1D381085DDADDB58796829CA90069");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F3"), a.fromHex("7830A3318B603B89E2327145AC234CC594CBDD8D3DF91610A83441CAEA9863BC2DED5D5AA8253AA10A2EF1C98B9AC8B57F1117A72BF2C7B9E7C1AC4D77FC94CA"), a.fromHex("3DF91610A83441CAEA9863BC2DED5D5AA8253AA10A2EF1C98B9AC8B57F1117A72BF2C7B9E7C1AC4D77FC94CADC083E67984050B75EBAE5DD2809BD638016F723"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "0481AEE4BDD82ED9645A21322E9C4C6A9385ED9F70B5D916C1B43B62EEF4D0098EFF3B1F78E2D0D48D50D1687B93B97D5F7C6D5047406A5E688B352209BCB9F8227DDE385D566332ECC0EABFA9CF7822FDF209F70024A57B1AA000C55B881F8111B2DCDE494A5F485E5BCA4BD88A2763AED1CA2B2FA8F0540678CD1E0F3AD80892"), fromHex, valueOf);
        }
    }

    static class e extends org.bouncycastle.asn1.x9.f {
        e() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA70330870553E5C414CA92619418661197FAC10471DB1D381085DDADDB58796829CA90069");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F3"), a.fromHex("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F0"), a.fromHex("7CBBBCF9441CFAB76E1890E46884EAE321F70C0BCB4981527897504BEC3E36A62BCDFA2304976540F6450085F2DAE145C22553B465763689180EA2571867423E"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04640ECE5C12788717B9C1BA06CBC2A6FEBA85842458C56DDE9DB1758D39C0313D82BA51735CDB3EA499AA77A7D6943A64F7A3F25FE26F06B51BAA2696FA9035DA5B534BD595F5AF0FA2C892376C84ACE1BB4E3019B71634C01131159CAE03CEE9D9932184BEEF216BD71DF2DADF86A627306ECFF96DBB8BACE198B61E00F8B332"), fromHex, valueOf);
        }
    }

    static class f extends org.bouncycastle.asn1.x9.f {
        f() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("E95E4A5F737059DC60DF5991D45029409E60FC09");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("E95E4A5F737059DC60DFC7AD95B3D8139515620F"), a.fromHex("340E7BE2A280EB74E2BE61BADA745D97E8F7C300"), a.fromHex("1E589A8595423412134FAA2DBDEC95C8D8675E58"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04BED5AF16EA3F6A4F62938C4631EB5AF7BDBCDBC31667CB477A1A8EC338F94741669C976316DA6321"), fromHex, valueOf);
        }
    }

    static class g extends org.bouncycastle.asn1.x9.f {
        g() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("E95E4A5F737059DC60DF5991D45029409E60FC09");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("E95E4A5F737059DC60DFC7AD95B3D8139515620F"), a.fromHex("E95E4A5F737059DC60DFC7AD95B3D8139515620C"), a.fromHex("7A556B6DAE535B7B51ED2C4D7DAA7A0B5C55F380"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04B199B13B9B34EFC1397E64BAEB05ACC265FF2378ADD6718B7C7C1961F0991B842443772152C9E0AD"), fromHex, valueOf);
        }
    }

    static class h extends org.bouncycastle.asn1.x9.f {
        h() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297"), a.fromHex("6A91174076B1E0E19C39C031FE8685C1CAE040E5C69A28EF"), a.fromHex("469A28EF7C28CCA3DC721D044F4496BCCA7EF4146FBF25C9"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04C0A0647EAAB6A48753B033C56CB0F0900A2F5C4853375FD614B690866ABD5BB88B5F4828C1490002E6773FA2FA299B8F"), fromHex, valueOf);
        }
    }

    static class i extends org.bouncycastle.asn1.x9.f {
        i() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297"), a.fromHex("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86294"), a.fromHex("13D56FFAEC78681E68F9DEB43B35BEC2FB68542E27897B79"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "043AE9E58C82F63C30282E1FE7BBF43FA72C446AF6F4618129097E2C5667C2223A902AB5CA449D0084B7E5B3DE7CCC01C9"), fromHex, valueOf);
        }
    }

    static class j extends org.bouncycastle.asn1.x9.f {
        j() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF"), a.fromHex("68A5E62CA9CE6C1C299803A6C1530B514E182AD8B0042A59CAD29F43"), a.fromHex("2580F63CCFE44138870713B1A92369E33E2135D266DBB372386C400B"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "040D9029AD2C7E5CF4340823B2A87DC68C9E4CE3174C1E6EFDEE12C07D58AA56F772C0726F24C6B89E4ECDAC24354B9E99CAA3F6D3761402CD"), fromHex, valueOf);
        }
    }

    static class k extends org.bouncycastle.asn1.x9.f {
        k() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF"), a.fromHex("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FC"), a.fromHex("4B337D934104CD7BEF271BF60CED1ED20DA14C08B3BB64F18A60888D"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "046AB1E344CE25FF3896424E7FFE14762ECB49F8928AC0C76029B4D5800374E9F5143E568CD23F3F4D7C0D4B1E41C8CC0D1C6ABD5F1A46DB4C"), fromHex, valueOf);
        }
    }

    static class l extends org.bouncycastle.asn1.x9.f {
        l() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377"), a.fromHex("7D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9"), a.fromHex("26DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B6"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F046997"), fromHex, valueOf);
        }
    }

    static class m extends org.bouncycastle.asn1.x9.f {
        m() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377"), a.fromHex("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5374"), a.fromHex("662C61C430D84EA4FE66A7733D0B76B7BF93EBC4AF2F49256AE58101FEE92B04"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04A3E8EB3CC1CFE7B7732213B23A656149AFA142C47AAFBC2B79A191562E1305F42D996C823439C56D7F7B22E14644417E69BCB6DE39D027001DABE8F35B25C9BE"), fromHex, valueOf);
        }
    }

    static class n extends org.bouncycastle.asn1.x9.f {
        n() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(a.fromHex("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27"), a.fromHex("3EE30B568FBAB0F883CCEBD46D3F3BB8A2A73513F5EB79DA66190EB085FFA9F492F375A97D860EB4"), a.fromHex("520883949DFDBC42D3AD198640688A6FE13F41349554B49ACC31DCCD884539816F5EB4AC8FB1F1A6"), fromHex, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "0443BD7E9AFB53D8B85289BCC48EE5BFE6F20137D10A087EB6E7871E2A10A599C710AF8D0D39E2061114FDD05545EC1CC8AB4093247F77275E0743FFED117182EAA9C77877AAAC6AC7D35245D1692E8EE1"), fromHex, valueOf);
        }
    }

    static {
        defineCurve("brainpoolP160r1", org.bouncycastle.asn1.teletrust.b.brainpoolP160r1, brainpoolP160r1);
        defineCurve("brainpoolP160t1", org.bouncycastle.asn1.teletrust.b.brainpoolP160t1, brainpoolP160t1);
        defineCurve("brainpoolP192r1", org.bouncycastle.asn1.teletrust.b.brainpoolP192r1, brainpoolP192r1);
        defineCurve("brainpoolP192t1", org.bouncycastle.asn1.teletrust.b.brainpoolP192t1, brainpoolP192t1);
        defineCurve("brainpoolP224r1", org.bouncycastle.asn1.teletrust.b.brainpoolP224r1, brainpoolP224r1);
        defineCurve("brainpoolP224t1", org.bouncycastle.asn1.teletrust.b.brainpoolP224t1, brainpoolP224t1);
        defineCurve("brainpoolP256r1", org.bouncycastle.asn1.teletrust.b.brainpoolP256r1, brainpoolP256r1);
        defineCurve("brainpoolP256t1", org.bouncycastle.asn1.teletrust.b.brainpoolP256t1, brainpoolP256t1);
        defineCurve("brainpoolP320r1", org.bouncycastle.asn1.teletrust.b.brainpoolP320r1, brainpoolP320r1);
        defineCurve("brainpoolP320t1", org.bouncycastle.asn1.teletrust.b.brainpoolP320t1, brainpoolP320t1);
        defineCurve("brainpoolP384r1", org.bouncycastle.asn1.teletrust.b.brainpoolP384r1, brainpoolP384r1);
        defineCurve("brainpoolP384t1", org.bouncycastle.asn1.teletrust.b.brainpoolP384t1, brainpoolP384t1);
        defineCurve("brainpoolP512r1", org.bouncycastle.asn1.teletrust.b.brainpoolP512r1, brainpoolP512r1);
        defineCurve("brainpoolP512t1", org.bouncycastle.asn1.teletrust.b.brainpoolP512t1, brainpoolP512t1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.asn1.x9.g configureBasepoint(org.bouncycastle.math.ec.e eVar, String str) {
        org.bouncycastle.asn1.x9.g gVar = new org.bouncycastle.asn1.x9.g(eVar, org.bouncycastle.util.encoders.d.decodeStrict(str));
        x.configureBasepoint(gVar.getPoint());
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.math.ec.e configureCurve(org.bouncycastle.math.ec.e eVar) {
        return eVar;
    }

    static void defineCurve(String str, o oVar, org.bouncycastle.asn1.x9.f fVar) {
        objIds.put(Strings.toLowerCase(str), oVar);
        names.put(oVar, str);
        curves.put(oVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger fromHex(String str) {
        return new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict(str));
    }

    public static org.bouncycastle.asn1.x9.e getByName(String str) {
        o oVar = (o) objIds.get(Strings.toLowerCase(str));
        if (oVar != null) {
            return getByOID(oVar);
        }
        return null;
    }

    public static org.bouncycastle.asn1.x9.e getByOID(o oVar) {
        org.bouncycastle.asn1.x9.f fVar = (org.bouncycastle.asn1.x9.f) curves.get(oVar);
        if (fVar != null) {
            return fVar.getParameters();
        }
        return null;
    }

    public static String getName(o oVar) {
        return (String) names.get(oVar);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static o getOID(String str) {
        return (o) objIds.get(Strings.toLowerCase(str));
    }

    public static o getOID(short s7, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("brainpoolP");
        sb.append((int) s7);
        sb.append(z7 ? "t" : "r");
        sb.append("1");
        return getOID(sb.toString());
    }
}
