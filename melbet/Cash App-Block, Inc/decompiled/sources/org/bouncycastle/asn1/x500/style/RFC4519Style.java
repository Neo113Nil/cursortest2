package org.bouncycastle.asn1.x500.style;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* loaded from: classes9.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier m = GetCert$$ExternalSyntheticOutline0.m("2.5.4.15");
        businessCategory = m;
        ASN1ObjectIdentifier m2 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.6");
        c = m2;
        ASN1ObjectIdentifier m3 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.3");
        cn = m3;
        ASN1ObjectIdentifier m4 = GetCert$$ExternalSyntheticOutline0.m("0.9.2342.19200300.100.1.25");
        dc = m4;
        ASN1ObjectIdentifier m5 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.13");
        description = m5;
        ASN1ObjectIdentifier m6 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.27");
        destinationIndicator = m6;
        ASN1ObjectIdentifier m7 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.49");
        distinguishedName = m7;
        ASN1ObjectIdentifier m8 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.46");
        dnQualifier = m8;
        ASN1ObjectIdentifier m9 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.47");
        enhancedSearchGuide = m9;
        ASN1ObjectIdentifier m10 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.23");
        facsimileTelephoneNumber = m10;
        ASN1ObjectIdentifier m11 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.44");
        generationQualifier = m11;
        ASN1ObjectIdentifier m12 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.42");
        givenName = m12;
        ASN1ObjectIdentifier m13 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.51");
        houseIdentifier = m13;
        ASN1ObjectIdentifier m14 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.43");
        initials = m14;
        ASN1ObjectIdentifier m15 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.25");
        internationalISDNNumber = m15;
        ASN1ObjectIdentifier m16 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.7");
        l = m16;
        ASN1ObjectIdentifier m17 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.31");
        member = m17;
        ASN1ObjectIdentifier m18 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.41");
        name = m18;
        ASN1ObjectIdentifier m19 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.10");
        o = m19;
        ASN1ObjectIdentifier m20 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.11");
        ou = m20;
        ASN1ObjectIdentifier m21 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.32");
        owner = m21;
        ASN1ObjectIdentifier m22 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.19");
        physicalDeliveryOfficeName = m22;
        ASN1ObjectIdentifier m23 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.16");
        postalAddress = m23;
        ASN1ObjectIdentifier m24 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.17");
        postalCode = m24;
        ASN1ObjectIdentifier m25 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.18");
        postOfficeBox = m25;
        ASN1ObjectIdentifier m26 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.28");
        preferredDeliveryMethod = m26;
        ASN1ObjectIdentifier m27 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.26");
        registeredAddress = m27;
        ASN1ObjectIdentifier m28 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.33");
        roleOccupant = m28;
        ASN1ObjectIdentifier m29 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.14");
        searchGuide = m29;
        ASN1ObjectIdentifier m30 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.34");
        seeAlso = m30;
        ASN1ObjectIdentifier m31 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.5");
        serialNumber = m31;
        ASN1ObjectIdentifier m32 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.4");
        sn = m32;
        ASN1ObjectIdentifier m33 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.8");
        st = m33;
        ASN1ObjectIdentifier m34 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.9");
        street = m34;
        ASN1ObjectIdentifier m35 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.20");
        telephoneNumber = m35;
        ASN1ObjectIdentifier m36 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.22");
        teletexTerminalIdentifier = m36;
        ASN1ObjectIdentifier m37 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.21");
        telexNumber = m37;
        ASN1ObjectIdentifier m38 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.12");
        title = m38;
        ASN1ObjectIdentifier m39 = GetCert$$ExternalSyntheticOutline0.m("0.9.2342.19200300.100.1.1");
        uid = m39;
        ASN1ObjectIdentifier m40 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.50");
        uniqueMember = m40;
        ASN1ObjectIdentifier m41 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.35");
        userPassword = m41;
        ASN1ObjectIdentifier m42 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.24");
        x121Address = m42;
        ASN1ObjectIdentifier m43 = GetCert$$ExternalSyntheticOutline0.m("2.5.4.45");
        x500UniqueIdentifier = m43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(m, "businessCategory");
        hashtable.put(m2, "c");
        hashtable.put(m3, "cn");
        hashtable.put(m4, "dc");
        hashtable.put(m5, "description");
        hashtable.put(m6, "destinationIndicator");
        hashtable.put(m7, "distinguishedName");
        hashtable.put(m8, "dnQualifier");
        hashtable.put(m9, "enhancedSearchGuide");
        hashtable.put(m10, "facsimileTelephoneNumber");
        hashtable.put(m11, "generationQualifier");
        hashtable.put(m12, "givenName");
        hashtable.put(m13, "houseIdentifier");
        hashtable.put(m14, "initials");
        hashtable.put(m15, "internationalISDNNumber");
        hashtable.put(m16, "l");
        hashtable.put(m17, "member");
        hashtable.put(m18, "name");
        hashtable.put(m19, "o");
        hashtable.put(m20, "ou");
        hashtable.put(m21, "owner");
        hashtable.put(m22, "physicalDeliveryOfficeName");
        hashtable.put(m23, "postalAddress");
        hashtable.put(m24, "postalCode");
        hashtable.put(m25, "postOfficeBox");
        hashtable.put(m26, "preferredDeliveryMethod");
        hashtable.put(m27, "registeredAddress");
        hashtable.put(m28, "roleOccupant");
        hashtable.put(m29, "searchGuide");
        hashtable.put(m30, "seeAlso");
        hashtable.put(m31, "serialNumber");
        hashtable.put(m32, "sn");
        hashtable.put(m33, "st");
        hashtable.put(m34, "street");
        hashtable.put(m35, "telephoneNumber");
        hashtable.put(m36, "teletexTerminalIdentifier");
        hashtable.put(m37, "telexNumber");
        hashtable.put(m38, "title");
        hashtable.put(m39, "uid");
        hashtable.put(m40, "uniqueMember");
        hashtable.put(m41, "userPassword");
        hashtable.put(m42, "x121Address");
        hashtable.put(m43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", m);
        hashtable2.put("c", m2);
        hashtable2.put("cn", m3);
        hashtable2.put("dc", m4);
        hashtable2.put("description", m5);
        hashtable2.put("destinationindicator", m6);
        hashtable2.put("distinguishedname", m7);
        hashtable2.put("dnqualifier", m8);
        hashtable2.put("enhancedsearchguide", m9);
        hashtable2.put("facsimiletelephonenumber", m10);
        hashtable2.put("generationqualifier", m11);
        hashtable2.put("givenname", m12);
        hashtable2.put("houseidentifier", m13);
        hashtable2.put("initials", m14);
        hashtable2.put("internationalisdnnumber", m15);
        hashtable2.put("l", m16);
        hashtable2.put("member", m17);
        hashtable2.put("name", m18);
        hashtable2.put("o", m19);
        hashtable2.put("ou", m20);
        hashtable2.put("owner", m21);
        hashtable2.put("physicaldeliveryofficename", m22);
        hashtable2.put("postaladdress", m23);
        hashtable2.put("postalcode", m24);
        hashtable2.put("postofficebox", m25);
        hashtable2.put("preferreddeliverymethod", m26);
        hashtable2.put("registeredaddress", m27);
        hashtable2.put("roleoccupant", m28);
        hashtable2.put("searchguide", m29);
        hashtable2.put("seealso", m30);
        hashtable2.put("serialnumber", m31);
        hashtable2.put("sn", m32);
        hashtable2.put("st", m33);
        hashtable2.put("street", m34);
        hashtable2.put("telephonenumber", m35);
        hashtable2.put("teletexterminalidentifier", m36);
        hashtable2.put("telexnumber", m37);
        hashtable2.put("title", m38);
        hashtable2.put("uid", m39);
        hashtable2.put("uniquemember", m40);
        hashtable2.put("userpassword", m41);
        hashtable2.put("x121address", m42);
        hashtable2.put("x500uniqueidentifier", m43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rDNsFromString.length];
        for (int i = 0; i != rDNsFromString.length; i++) {
            rdnArr[(r5 - i) - 1] = rDNsFromString[i];
        }
        return rdnArr;
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
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
