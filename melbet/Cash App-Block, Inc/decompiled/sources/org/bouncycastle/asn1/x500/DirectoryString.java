package org.bouncycastle.asn1.x500;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.DERUTF8String;

/* loaded from: classes9.dex */
public class DirectoryString extends ASN1Object implements ASN1Choice, ASN1String {

    /* renamed from: string, reason: collision with root package name */
    private ASN1String f1566string;

    public DirectoryString(String str) {
        this.f1566string = new DERUTF8String(str);
    }

    public static DirectoryString getInstance(Object obj) {
        if (obj == null || (obj instanceof DirectoryString)) {
            return (DirectoryString) obj;
        }
        if (obj instanceof ASN1T61String) {
            return new DirectoryString((ASN1T61String) obj);
        }
        if (obj instanceof ASN1PrintableString) {
            return new DirectoryString((ASN1PrintableString) obj);
        }
        if (obj instanceof ASN1UniversalString) {
            return new DirectoryString((ASN1UniversalString) obj);
        }
        if (obj instanceof ASN1UTF8String) {
            return new DirectoryString((ASN1UTF8String) obj);
        }
        if (obj instanceof ASN1BMPString) {
            return new DirectoryString((ASN1BMPString) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: "));
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return this.f1566string.getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ((ASN1Encodable) this.f1566string).toASN1Primitive();
    }

    public String toString() {
        return this.f1566string.getString();
    }

    private DirectoryString(ASN1BMPString aSN1BMPString) {
        this.f1566string = aSN1BMPString;
    }

    private DirectoryString(ASN1PrintableString aSN1PrintableString) {
        this.f1566string = aSN1PrintableString;
    }

    private DirectoryString(ASN1T61String aSN1T61String) {
        this.f1566string = aSN1T61String;
    }

    private DirectoryString(ASN1UTF8String aSN1UTF8String) {
        this.f1566string = aSN1UTF8String;
    }

    private DirectoryString(ASN1UniversalString aSN1UniversalString) {
        this.f1566string = aSN1UniversalString;
    }

    public static DirectoryString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
        a$$ExternalSyntheticBUOutline0.m$3("choice item must be explicitly tagged");
        return null;
    }
}
