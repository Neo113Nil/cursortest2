package com.withpersona.sdk2.inquiry.governmentid.network;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IdClass {
    public static final /* synthetic */ IdClass[] $VALUES;
    public static final KClasses$$Lambda$1 Companion;
    public static final IdClass DriverLicense;
    public static final IdClass Passport;
    public static final IdClass ResidencyPermit;
    public static final IdClass StateID;
    public static final IdClass Unknown;
    public static final IdClass Visa;
    public static final Map codes;

    static {
        IdClass idClass = new IdClass("DriverLicense", 0);
        DriverLicense = idClass;
        IdClass idClass2 = new IdClass("StateID", 1);
        StateID = idClass2;
        IdClass idClass3 = new IdClass("Keypass", 2);
        IdClass idClass4 = new IdClass("MilitaryID", 3);
        IdClass idClass5 = new IdClass("MyNumberCard", 4);
        IdClass idClass6 = new IdClass("NRIC", 5);
        IdClass idClass7 = new IdClass("OFWID", 6);
        IdClass idClass8 = new IdClass("Passport", 7);
        Passport = idClass8;
        IdClass idClass9 = new IdClass("PermanentResidentCard", 8);
        IdClass idClass10 = new IdClass("ResidencyPermit", 9);
        ResidencyPermit = idClass10;
        IdClass idClass11 = new IdClass("StudentPermit", 10);
        IdClass idClass12 = new IdClass("SocialSecurityID", 11);
        IdClass idClass13 = new IdClass("UMID", 12);
        IdClass idClass14 = new IdClass("VoterID", 13);
        IdClass idClass15 = new IdClass("PassportCard", 14);
        IdClass idClass16 = new IdClass("PostalID", 15);
        IdClass idClass17 = new IdClass("Visa", 16);
        Visa = idClass17;
        IdClass idClass18 = new IdClass("WorkPermit", 17);
        IdClass idClass19 = new IdClass("CitizenshipCertificate", 18);
        IdClass idClass20 = new IdClass("ConsularID", 19);
        IdClass idClass21 = new IdClass("ForeignerID", 20);
        IdClass idClass22 = new IdClass("HealthInsuranceCard", 21);
        IdClass idClass23 = new IdClass("LongTermPass", 22);
        IdClass idClass24 = new IdClass("NBICertificate", 23);
        IdClass idClass25 = new IdClass("PermanentAccountNumber", 24);
        IdClass idClass26 = new IdClass("Unknown", 25);
        Unknown = idClass26;
        $VALUES = new IdClass[]{idClass, idClass2, idClass3, idClass4, idClass5, idClass6, idClass7, idClass8, idClass9, idClass10, idClass11, idClass12, idClass13, idClass14, idClass15, idClass16, idClass17, idClass18, idClass19, idClass20, idClass21, idClass22, idClass23, idClass24, idClass25, idClass26};
        Companion = new KClasses$$Lambda$1(18);
        codes = MapsKt__MapsKt.mapOf(new Pair("dl", idClass), new Pair("id", idClass2), new Pair("keyp", idClass3), new Pair("mid", idClass4), new Pair("myn", idClass5), new Pair("nric", idClass6), new Pair("ofw", idClass7), new Pair("pp", idClass8), new Pair("pr", idClass9), new Pair("rp", idClass10), new Pair("sp", idClass11), new Pair("sss", idClass12), new Pair("umid", idClass13), new Pair("vid", idClass14), new Pair("ppc", idClass15), new Pair("pid", idClass16), new Pair("visa", idClass17), new Pair("wp", idClass18), new Pair("cct", idClass19), new Pair("cid", idClass20), new Pair("foid", idClass21), new Pair("hic", idClass22), new Pair("ltpass", idClass23), new Pair("nbi", idClass24), new Pair("pan", idClass25));
    }

    public static IdClass valueOf(String str) {
        return (IdClass) Enum.valueOf(IdClass.class, str);
    }

    public static IdClass[] values() {
        return (IdClass[]) $VALUES.clone();
    }
}
