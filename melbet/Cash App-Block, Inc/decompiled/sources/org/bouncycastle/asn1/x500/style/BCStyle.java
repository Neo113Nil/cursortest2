package org.bouncycastle.asn1.x500.style;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* loaded from: classes9.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier JURISDICTION_C;
    public static final ASN1ObjectIdentifier JURISDICTION_L;
    public static final ASN1ObjectIdentifier JURISDICTION_ST;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier m = GetCert$$ExternalSyntheticOutline0.m("2.5.4.6");
        C = m;
        ASN1ObjectIdentifier m2 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.10");
        O = m2;
        ASN1ObjectIdentifier m3 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.11");
        OU = m3;
        ASN1ObjectIdentifier m4 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.12");
        T = m4;
        ASN1ObjectIdentifier m5 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.3");
        CN = m5;
        SN = GetCert$$ExternalSyntheticOutline0.m("2.5.4.5");
        ASN1ObjectIdentifier m6 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.9");
        STREET = m6;
        ASN1ObjectIdentifier m7 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.5");
        SERIALNUMBER = m7;
        ASN1ObjectIdentifier m8 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.7");
        L = m8;
        ASN1ObjectIdentifier m9 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.8");
        ST = m9;
        ASN1ObjectIdentifier m10 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.4");
        SURNAME = m10;
        ASN1ObjectIdentifier m11 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.42");
        GIVENNAME = m11;
        ASN1ObjectIdentifier m12 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.43");
        INITIALS = m12;
        ASN1ObjectIdentifier m13 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.44");
        GENERATION = m13;
        ASN1ObjectIdentifier m14 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.45");
        UNIQUE_IDENTIFIER = m14;
        ASN1ObjectIdentifier m15 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.13");
        DESCRIPTION = m15;
        ASN1ObjectIdentifier m16 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.15");
        BUSINESS_CATEGORY = m16;
        ASN1ObjectIdentifier m17 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.17");
        POSTAL_CODE = m17;
        ASN1ObjectIdentifier m18 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.46");
        DN_QUALIFIER = m18;
        ASN1ObjectIdentifier m19 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.65");
        PSEUDONYM = m19;
        ASN1ObjectIdentifier m20 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.72");
        ROLE = m20;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_pda;
        ASN1ObjectIdentifier intern = aSN1ObjectIdentifier.branch("1").intern();
        DATE_OF_BIRTH = intern;
        ASN1ObjectIdentifier intern2 = aSN1ObjectIdentifier.branch("2").intern();
        PLACE_OF_BIRTH = intern2;
        ASN1ObjectIdentifier intern3 = aSN1ObjectIdentifier.branch("3").intern();
        GENDER = intern3;
        ASN1ObjectIdentifier intern4 = aSN1ObjectIdentifier.branch("4").intern();
        COUNTRY_OF_CITIZENSHIP = intern4;
        ASN1ObjectIdentifier intern5 = aSN1ObjectIdentifier.branch("5").intern();
        COUNTRY_OF_RESIDENCE = intern5;
        ASN1ObjectIdentifier m21 = GetCert$$ExternalSyntheticOutline0.m("1.3.36.8.3.14");
        NAME_AT_BIRTH = m21;
        ASN1ObjectIdentifier m22 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.16");
        POSTAL_ADDRESS = m22;
        DMD_NAME = GetCert$$ExternalSyntheticOutline0.m("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier7;
        E = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.3");
        JURISDICTION_C = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.2");
        JURISDICTION_ST = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.1");
        JURISDICTION_L = aSN1ObjectIdentifier12;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(m, "C");
        hashtable.put(m2, "O");
        hashtable.put(m4, "T");
        hashtable.put(m3, "OU");
        hashtable.put(m5, "CN");
        hashtable.put(m8, "L");
        hashtable.put(m9, "ST");
        hashtable.put(m7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier5, "E");
        hashtable.put(aSN1ObjectIdentifier8, "DC");
        hashtable.put(aSN1ObjectIdentifier9, "UID");
        hashtable.put(m6, "STREET");
        hashtable.put(m10, "SURNAME");
        hashtable.put(m11, "GIVENNAME");
        hashtable.put(m12, "INITIALS");
        hashtable.put(m13, "GENERATION");
        hashtable.put(m15, "DESCRIPTION");
        hashtable.put(m20, "ROLE");
        hashtable.put(aSN1ObjectIdentifier7, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredName");
        hashtable.put(m14, "UniqueIdentifier");
        hashtable.put(m18, "DN");
        hashtable.put(m19, "Pseudonym");
        hashtable.put(m22, "PostalAddress");
        hashtable.put(m21, "NameAtBirth");
        hashtable.put(intern4, "CountryOfCitizenship");
        hashtable.put(intern5, "CountryOfResidence");
        hashtable.put(intern3, "Gender");
        hashtable.put(intern2, "PlaceOfBirth");
        hashtable.put(intern, "DateOfBirth");
        hashtable.put(m17, "PostalCode");
        hashtable.put(m16, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier2, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier3, "Name");
        hashtable.put(aSN1ObjectIdentifier4, "organizationIdentifier");
        hashtable.put(aSN1ObjectIdentifier10, "jurisdictionCountry");
        hashtable.put(aSN1ObjectIdentifier11, "jurisdictionState");
        hashtable.put(aSN1ObjectIdentifier12, "jurisdictionLocality");
        hashtable2.put("c", m);
        hashtable2.put("o", m2);
        hashtable2.put("t", m4);
        hashtable2.put("ou", m3);
        hashtable2.put("cn", m5);
        hashtable2.put("l", m8);
        hashtable2.put("st", m9);
        hashtable2.put("sn", m10);
        hashtable2.put("serialnumber", m7);
        hashtable2.put("street", m6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier5);
        hashtable2.put("dc", aSN1ObjectIdentifier8);
        hashtable2.put("e", aSN1ObjectIdentifier5);
        hashtable2.put("uid", aSN1ObjectIdentifier9);
        hashtable2.put("surname", m10);
        hashtable2.put("givenname", m11);
        hashtable2.put("initials", m12);
        hashtable2.put("generation", m13);
        hashtable2.put("description", m15);
        hashtable2.put("role", m20);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier7);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier6);
        hashtable2.put("uniqueidentifier", m14);
        hashtable2.put("dn", m18);
        hashtable2.put("pseudonym", m19);
        hashtable2.put("postaladdress", m22);
        hashtable2.put("nameatbirth", m21);
        hashtable2.put("countryofcitizenship", intern4);
        hashtable2.put("countryofresidence", intern5);
        hashtable2.put("gender", intern3);
        hashtable2.put("placeofbirth", intern2);
        hashtable2.put("dateofbirth", intern);
        hashtable2.put("postalcode", m17);
        hashtable2.put("businesscategory", m16);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier2);
        hashtable2.put("name", aSN1ObjectIdentifier3);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier4);
        hashtable2.put("jurisdictioncountry", aSN1ObjectIdentifier10);
        hashtable2.put("jurisdictionstate", aSN1ObjectIdentifier11);
        hashtable2.put("jurisdictionlocality", aSN1ObjectIdentifier12);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SERIALNUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) JURISDICTION_C)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
