package org.bouncycastle.asn1;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    private static final int MAX_CONTENTS_LENGTH = 4096;
    private static final int MAX_IDENTIFIER_LENGTH = 16383;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1RelativeOID.class, 13) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1RelativeOID.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ConcurrentMap<ASN1ObjectIdentifier.OidHandle, ASN1RelativeOID> pool = new ConcurrentHashMap();
    private final byte[] contents;
    private String identifier;

    public ASN1RelativeOID(String str) {
        checkIdentifier(str);
        byte[] parseIdentifier = parseIdentifier(str);
        checkContentsLength(parseIdentifier.length);
        this.contents = parseIdentifier;
        this.identifier = str;
    }

    public static void checkContentsLength(int i) {
        if (i <= 4096) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("exceeded relative OID contents length limit");
    }

    public static void checkIdentifier(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'identifier' cannot be null");
        } else if (str.length() > MAX_IDENTIFIER_LENGTH) {
            a$$ExternalSyntheticBUOutline0.m$3("exceeded relative OID contents length limit");
        } else {
            if (isValidIdentifier(str, 0)) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("string ", str, " not a valid relative OID"));
        }
    }

    public static ASN1RelativeOID createPrimitive(byte[] bArr, boolean z) {
        checkContentsLength(bArr.length);
        ASN1RelativeOID aSN1RelativeOID = pool.get(new ASN1ObjectIdentifier.OidHandle(bArr));
        if (aSN1RelativeOID != null) {
            return aSN1RelativeOID;
        }
        if (!isValidContents(bArr)) {
            a$$ExternalSyntheticBUOutline0.m$3("invalid relative OID contents");
            return null;
        }
        if (z) {
            bArr = Arrays.clone(bArr);
        }
        return new ASN1RelativeOID(bArr, null);
    }

    public static ASN1RelativeOID fromContents(byte[] bArr) {
        if (bArr != null) {
            return createPrimitive(bArr, true);
        }
        a$$ExternalSyntheticBUOutline0.m$2("'contents' cannot be null");
        return null;
    }

    public static ASN1RelativeOID getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1RelativeOID)) {
            return (ASN1RelativeOID) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1RelativeOID) {
                return (ASN1RelativeOID) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1RelativeOID) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("failed to construct relative OID from byte[]: "));
            }
        }
        m = Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: ");
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public static boolean isValidContents(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & 128) == 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isValidIdentifier(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                return i2 != 0 && (i2 <= 1 || str.charAt(length) != '0');
            }
            char charAt = str.charAt(i3);
            if (charAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
            } else {
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                i2++;
            }
            length = i3;
        }
        return false;
    }

    public static String parseContents(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= LONG_LIMIT) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append('.');
                    }
                    sb.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(j);
                }
                BigInteger or = bigInteger.or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append('.');
                    }
                    sb.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] parseIdentifier(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OIDTokenizer oIDTokenizer = new OIDTokenizer(str);
        while (oIDTokenizer.hasMoreTokens()) {
            String nextToken = oIDTokenizer.nextToken();
            if (nextToken.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(nextToken));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(nextToken));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static ASN1RelativeOID tryFromID(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'identifier' cannot be null");
            return null;
        }
        if (str.length() > MAX_IDENTIFIER_LENGTH || !isValidIdentifier(str, 0)) {
            return null;
        }
        byte[] parseIdentifier = parseIdentifier(str);
        if (parseIdentifier.length <= 4096) {
            return new ASN1RelativeOID(parseIdentifier, str);
        }
        return null;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return Arrays.areEqual(this.contents, ((ASN1RelativeOID) aSN1Primitive).contents);
        }
        return false;
    }

    public ASN1RelativeOID branch(String str) {
        byte[] concatenate;
        checkIdentifier(str);
        if (str.length() <= 2) {
            checkContentsLength(this.contents.length + 1);
            int charAt = str.charAt(0) - '0';
            if (str.length() == 2) {
                charAt = (charAt * 10) + (str.charAt(1) - '0');
            }
            concatenate = Arrays.append(this.contents, (byte) charAt);
        } else {
            byte[] parseIdentifier = parseIdentifier(str);
            checkContentsLength(this.contents.length + parseIdentifier.length);
            concatenate = Arrays.concatenate(this.contents, parseIdentifier);
        }
        return new ASN1RelativeOID(concatenate, Recorder$$ExternalSyntheticOutline2.m(getId(), ".", str));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 13, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public synchronized String getId() {
        try {
            if (this.identifier == null) {
                this.identifier = parseContents(this.contents);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getId();
    }

    private ASN1RelativeOID(byte[] bArr, String str) {
        this.contents = bArr;
        this.identifier = str;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static ASN1RelativeOID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1RelativeOID) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
