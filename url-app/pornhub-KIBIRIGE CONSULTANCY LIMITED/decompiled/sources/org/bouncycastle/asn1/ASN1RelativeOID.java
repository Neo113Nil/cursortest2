package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.io.FilenameUtils;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    private static final int MAX_CONTENTS_LENGTH = 4096;
    private static final int MAX_IDENTIFIER_LENGTH = 16383;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1RelativeOID.class, 13) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
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

    private ASN1RelativeOID(byte[] bArr, String str) {
        this.contents = bArr;
        this.identifier = str;
    }

    static void checkContentsLength(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
    }

    static void checkIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > MAX_IDENTIFIER_LENGTH) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (!isValidIdentifier(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid relative OID");
        }
    }

    static ASN1RelativeOID createPrimitive(byte[] bArr, boolean z) {
        checkContentsLength(bArr.length);
        ASN1RelativeOID aSN1RelativeOID = pool.get(new ASN1ObjectIdentifier.OidHandle(bArr));
        if (aSN1RelativeOID != null) {
            return aSN1RelativeOID;
        }
        if (!isValidContents(bArr)) {
            throw new IllegalArgumentException("invalid relative OID contents");
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
        throw new NullPointerException("'contents' cannot be null");
    }

    public static ASN1RelativeOID getInstance(Object obj) {
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
                throw new IllegalArgumentException("failed to construct relative OID from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static ASN1RelativeOID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1RelativeOID) TYPE.getContextInstance(aSN1TaggedObject, z);
    }

    static boolean isValidContents(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & UByte.MAX_VALUE) == 128) {
                return false;
            }
            z = (bArr[i] & ByteCompanionObject.MIN_VALUE) == 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValidIdentifier(String str, int i) {
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

    static String parseContents(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= LONG_LIMIT) {
                long j2 = j + (b & ByteCompanionObject.MAX_VALUE);
                if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(j);
                }
                BigInteger or = bigInteger.or(BigInteger.valueOf(b & ByteCompanionObject.MAX_VALUE));
                if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        return stringBuffer.toString();
    }

    static byte[] parseIdentifier(String str) {
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
            throw new NullPointerException("'identifier' cannot be null");
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

    static void writeField(ByteArrayOutputStream byteArrayOutputStream, long j) {
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

    static void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
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
        bArr[i] = (byte) (bArr[i] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return Arrays.areEqual(this.contents, ((ASN1RelativeOID) aSN1Primitive).contents);
        }
        return false;
    }

    public ASN1RelativeOID branch(String str) {
        checkIdentifier(str);
        byte[] parseIdentifier = parseIdentifier(str);
        checkContentsLength(this.contents.length + parseIdentifier.length);
        return new ASN1RelativeOID(Arrays.concatenate(this.contents, parseIdentifier), getId() + "." + str);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.writeEncodingDL(z, 13, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public synchronized String getId() {
        if (this.identifier == null) {
            this.identifier = parseContents(this.contents);
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
}
