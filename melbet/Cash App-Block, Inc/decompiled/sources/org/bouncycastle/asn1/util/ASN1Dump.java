package org.bouncycastle.asn1.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes9.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public static void _dumpAsString(String str, boolean z, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder m108m;
        int length;
        String lineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(lineSeparator);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            stringBuffer.append(lineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str, TAB);
            int size = aSN1Sequence.size();
            while (i < size) {
                _dumpAsString(m$1, z, aSN1Sequence.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            stringBuffer.append(lineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(str, TAB);
            int size2 = aSN1Set.size();
            while (i < size2) {
                _dumpAsString(m$12, z, aSN1Set.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(lineSeparator);
            _dumpAsString(str + TAB, z, aSN1TaggedObject.getBaseObject().toASN1Primitive(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, "BER Constructed Octet String[");
                length = aSN1OctetString.getOctets().length;
            } else {
                m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, "DER Octet String[");
                length = aSN1OctetString.getOctets().length;
            }
            m108m.append(length);
            m108m.append("] ");
            stringBuffer.append(m108m.toString());
            if (z) {
                stringBuffer.append(dumpBinaryDataAsString(str, aSN1OctetString.getOctets()));
                return;
            } else {
                stringBuffer.append(lineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str, "ObjectIdentifier(");
            m108m2.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
            m108m2.append(")");
            m108m2.append(lineSeparator);
            stringBuffer.append(m108m2.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            StringBuilder m108m3 = Recorder$$ExternalSyntheticOutline2.m108m(str, "RelativeOID(");
            m108m3.append(((ASN1RelativeOID) aSN1Primitive).getId());
            m108m3.append(")");
            m108m3.append(lineSeparator);
            stringBuffer.append(m108m3.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            StringBuilder m108m4 = Recorder$$ExternalSyntheticOutline2.m108m(str, "Boolean(");
            m108m4.append(((ASN1Boolean) aSN1Primitive).isTrue());
            m108m4.append(")");
            m108m4.append(lineSeparator);
            stringBuffer.append(m108m4.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            StringBuilder m108m5 = Recorder$$ExternalSyntheticOutline2.m108m(str, "Integer(");
            m108m5.append(((ASN1Integer) aSN1Primitive).getValue());
            m108m5.append(")");
            m108m5.append(lineSeparator);
            stringBuffer.append(m108m5.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] bytes = aSN1BitString.getBytes();
            stringBuffer.append(Recorder$$ExternalSyntheticOutline1.m(bytes.length, aSN1BitString.getPadBits(), ", ", "] ", Recorder$$ExternalSyntheticOutline2.m108m(str, aSN1BitString instanceof DERBitString ? "DER Bit String[" : aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[")));
            if (z) {
                stringBuffer.append(dumpBinaryDataAsString(str, bytes));
                return;
            } else {
                stringBuffer.append(lineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            StringBuilder m108m6 = Recorder$$ExternalSyntheticOutline2.m108m(str, "IA5String(");
            m108m6.append(((ASN1IA5String) aSN1Primitive).getString());
            m108m6.append(") ");
            m108m6.append(lineSeparator);
            stringBuffer.append(m108m6.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            StringBuilder m108m7 = Recorder$$ExternalSyntheticOutline2.m108m(str, "UTF8String(");
            m108m7.append(((ASN1UTF8String) aSN1Primitive).getString());
            m108m7.append(") ");
            m108m7.append(lineSeparator);
            stringBuffer.append(m108m7.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            StringBuilder m108m8 = Recorder$$ExternalSyntheticOutline2.m108m(str, "NumericString(");
            m108m8.append(((ASN1NumericString) aSN1Primitive).getString());
            m108m8.append(") ");
            m108m8.append(lineSeparator);
            stringBuffer.append(m108m8.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            StringBuilder m108m9 = Recorder$$ExternalSyntheticOutline2.m108m(str, "PrintableString(");
            m108m9.append(((ASN1PrintableString) aSN1Primitive).getString());
            m108m9.append(") ");
            m108m9.append(lineSeparator);
            stringBuffer.append(m108m9.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            StringBuilder m108m10 = Recorder$$ExternalSyntheticOutline2.m108m(str, "VisibleString(");
            m108m10.append(((ASN1VisibleString) aSN1Primitive).getString());
            m108m10.append(") ");
            m108m10.append(lineSeparator);
            stringBuffer.append(m108m10.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            StringBuilder m108m11 = Recorder$$ExternalSyntheticOutline2.m108m(str, "BMPString(");
            m108m11.append(((ASN1BMPString) aSN1Primitive).getString());
            m108m11.append(") ");
            m108m11.append(lineSeparator);
            stringBuffer.append(m108m11.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            StringBuilder m108m12 = Recorder$$ExternalSyntheticOutline2.m108m(str, "T61String(");
            m108m12.append(((ASN1T61String) aSN1Primitive).getString());
            m108m12.append(") ");
            m108m12.append(lineSeparator);
            stringBuffer.append(m108m12.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            StringBuilder m108m13 = Recorder$$ExternalSyntheticOutline2.m108m(str, "GraphicString(");
            m108m13.append(((ASN1GraphicString) aSN1Primitive).getString());
            m108m13.append(") ");
            m108m13.append(lineSeparator);
            stringBuffer.append(m108m13.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            StringBuilder m108m14 = Recorder$$ExternalSyntheticOutline2.m108m(str, "VideotexString(");
            m108m14.append(((ASN1VideotexString) aSN1Primitive).getString());
            m108m14.append(") ");
            m108m14.append(lineSeparator);
            stringBuffer.append(m108m14.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            StringBuilder m108m15 = Recorder$$ExternalSyntheticOutline2.m108m(str, "UTCTime(");
            m108m15.append(((ASN1UTCTime) aSN1Primitive).getTime());
            m108m15.append(") ");
            m108m15.append(lineSeparator);
            stringBuffer.append(m108m15.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            StringBuilder m108m16 = Recorder$$ExternalSyntheticOutline2.m108m(str, "GeneralizedTime(");
            m108m16.append(((ASN1GeneralizedTime) aSN1Primitive).getTime());
            m108m16.append(") ");
            m108m16.append(lineSeparator);
            stringBuffer.append(m108m16.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            StringBuilder m108m17 = Recorder$$ExternalSyntheticOutline2.m108m(str, "DER Enumerated(");
            m108m17.append(((ASN1Enumerated) aSN1Primitive).getValue());
            m108m17.append(")");
            m108m17.append(lineSeparator);
            stringBuffer.append(m108m17.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            StringBuilder m108m18 = Recorder$$ExternalSyntheticOutline2.m108m(str, "ObjectDescriptor(");
            m108m18.append(((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString());
            m108m18.append(") ");
            m108m18.append(lineSeparator);
            stringBuffer.append(m108m18.toString());
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
            m.append(aSN1Primitive.toString());
            m.append(lineSeparator);
            stringBuffer.append(m.toString());
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        stringBuffer.append(str + "External " + lineSeparator);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TAB);
        String sb2 = sb.toString();
        if (aSN1External.getDirectReference() != null) {
            StringBuilder m108m19 = Recorder$$ExternalSyntheticOutline2.m108m(sb2, "Direct Reference: ");
            m108m19.append(aSN1External.getDirectReference().getId());
            m108m19.append(lineSeparator);
            stringBuffer.append(m108m19.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder m108m20 = Recorder$$ExternalSyntheticOutline2.m108m(sb2, "Indirect Reference: ");
            m108m20.append(aSN1External.getIndirectReference().toString());
            m108m20.append(lineSeparator);
            stringBuffer.append(m108m20.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(sb2, z, aSN1External.getDataValueDescriptor(), stringBuffer);
        }
        StringBuilder m108m21 = Recorder$$ExternalSyntheticOutline2.m108m(sb2, "Encoding: ");
        m108m21.append(aSN1External.getEncoding());
        m108m21.append(lineSeparator);
        stringBuffer.append(m108m21.toString());
        _dumpAsString(sb2, z, aSN1External.getExternalContent(), stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                stringBuffer.append((char) b);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj, boolean z) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String calculateAscString;
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + TAB;
        stringBuffer.append(lineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, 32)));
                stringBuffer.append(TAB);
                calculateAscString = calculateAscString(bArr, i, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                calculateAscString = calculateAscString(bArr, i, bArr.length - i);
            }
            stringBuffer.append(calculateAscString);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }
}
