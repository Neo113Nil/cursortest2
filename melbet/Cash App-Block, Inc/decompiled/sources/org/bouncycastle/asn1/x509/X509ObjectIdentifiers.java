package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;

/* loaded from: classes9.dex */
public interface X509ObjectIdentifiers {
    public static final ASN1ObjectIdentifier attributeType;
    public static final ASN1ObjectIdentifier commonName;
    public static final ASN1ObjectIdentifier countryName;
    public static final ASN1ObjectIdentifier crlAccessMethod;
    public static final ASN1ObjectIdentifier id_PasswordBasedMac;
    public static final ASN1ObjectIdentifier id_SHA1;
    public static final ASN1ObjectIdentifier id_ad;
    public static final ASN1ObjectIdentifier id_ad_caIssuers;
    public static final ASN1ObjectIdentifier id_ad_ocsp;
    public static final ASN1ObjectIdentifier id_at_name;
    public static final ASN1ObjectIdentifier id_at_organizationIdentifier;
    public static final ASN1ObjectIdentifier id_at_telephoneNumber;
    public static final ASN1ObjectIdentifier id_ce;
    public static final ASN1ObjectIdentifier id_ea_rsa;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake128;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake256;
    public static final ASN1ObjectIdentifier id_pda;
    public static final ASN1ObjectIdentifier id_pe;
    public static final ASN1ObjectIdentifier id_pkix;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake128;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake256;
    public static final ASN1ObjectIdentifier localityName;
    public static final ASN1ObjectIdentifier ocspAccessMethod;
    public static final ASN1ObjectIdentifier organization;
    public static final ASN1ObjectIdentifier organizationalUnitName;
    public static final ASN1ObjectIdentifier pkix_algorithms;
    public static final ASN1ObjectIdentifier ripemd160;
    public static final ASN1ObjectIdentifier ripemd160WithRSAEncryption;
    public static final ASN1ObjectIdentifier stateOrProvinceName;

    static {
        ASN1ObjectIdentifier m = GetCert$$ExternalSyntheticOutline0.m("2.5.4");
        attributeType = m;
        commonName = m.branch("3").intern();
        countryName = m.branch("6").intern();
        localityName = m.branch("7").intern();
        stateOrProvinceName = m.branch("8").intern();
        organization = m.branch("10").intern();
        organizationalUnitName = m.branch("11").intern();
        id_at_telephoneNumber = m.branch("20").intern();
        id_at_name = m.branch("41").intern();
        id_at_organizationIdentifier = m.branch("97").intern();
        id_SHA1 = GetCert$$ExternalSyntheticOutline0.m("1.3.14.3.2.26");
        ripemd160 = GetCert$$ExternalSyntheticOutline0.m("1.3.36.3.2.1");
        ripemd160WithRSAEncryption = GetCert$$ExternalSyntheticOutline0.m("1.3.36.3.3.1.2");
        id_ea_rsa = GetCert$$ExternalSyntheticOutline0.m("2.5.8.1.1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        id_pe = aSN1ObjectIdentifier.branch("1");
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("6");
        pkix_algorithms = branch;
        id_rsassa_pss_shake128 = branch.branch("30");
        id_rsassa_pss_shake256 = branch.branch("31");
        id_ecdsa_with_shake128 = branch.branch("32");
        id_ecdsa_with_shake256 = branch.branch("33");
        id_pda = aSN1ObjectIdentifier.branch("9");
        ASN1ObjectIdentifier branch2 = aSN1ObjectIdentifier.branch("48");
        id_ad = branch2;
        ASN1ObjectIdentifier intern = branch2.branch("2").intern();
        id_ad_caIssuers = intern;
        ASN1ObjectIdentifier intern2 = branch2.branch("1").intern();
        id_ad_ocsp = intern2;
        ocspAccessMethod = intern2;
        crlAccessMethod = intern;
        id_ce = new ASN1ObjectIdentifier("2.5.29");
        id_PasswordBasedMac = MiscObjectIdentifiers.entrust.branch("66.13");
    }
}
