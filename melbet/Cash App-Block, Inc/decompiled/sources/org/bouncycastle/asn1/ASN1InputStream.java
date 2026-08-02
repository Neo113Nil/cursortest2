package org.bouncycastle.asn1;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    private ASN1InputStream(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.limit = i;
        this.lazyEvaluate = z;
        this.tmpBuffers = bArr;
    }

    public static ASN1Primitive createPrimitiveDERObject(int i, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        try {
            switch (i) {
                case 1:
                    return ASN1Boolean.createPrimitive(getBuffer(definiteLengthInputStream, bArr));
                case 2:
                    return ASN1Integer.createPrimitive(definiteLengthInputStream.toByteArray());
                case 3:
                    return ASN1BitString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 4:
                    return ASN1OctetString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 5:
                    return ASN1Null.createPrimitive(definiteLengthInputStream.toByteArray());
                case 6:
                    ASN1ObjectIdentifier.checkContentsLength(definiteLengthInputStream.getRemaining());
                    return ASN1ObjectIdentifier.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
                case 7:
                    return ASN1ObjectDescriptor.createPrimitive(definiteLengthInputStream.toByteArray());
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return ASN1Enumerated.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
                case 12:
                    return ASN1UTF8String.createPrimitive(definiteLengthInputStream.toByteArray());
                case 13:
                    ASN1RelativeOID.checkContentsLength(definiteLengthInputStream.getRemaining());
                    return ASN1RelativeOID.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return ASN1NumericString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 19:
                    return ASN1PrintableString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 20:
                    return ASN1T61String.createPrimitive(definiteLengthInputStream.toByteArray());
                case 21:
                    return ASN1VideotexString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 22:
                    return ASN1IA5String.createPrimitive(definiteLengthInputStream.toByteArray());
                case 23:
                    return ASN1UTCTime.createPrimitive(definiteLengthInputStream.toByteArray());
                case 24:
                    return ASN1GeneralizedTime.createPrimitive(definiteLengthInputStream.toByteArray());
                case 25:
                    return ASN1GraphicString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 26:
                    return ASN1VisibleString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 27:
                    return ASN1GeneralString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 28:
                    return ASN1UniversalString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 30:
                    return ASN1BMPString.createPrimitive(getBMPCharBuffer(definiteLengthInputStream));
            }
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new ASN1Exception(e2.getMessage(), e2);
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) {
        int remaining = definiteLengthInputStream.getRemaining();
        if ((remaining & 1) != 0) {
            a$$ExternalSyntheticBUOutline0.m$4("malformed BMPString encoding encountered");
            return null;
        }
        int i = remaining / 2;
        char[] cArr = new char[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        int i3 = 0;
        while (remaining >= 8) {
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, 8) != 8) {
                Path$$ExternalSyntheticBUOutline0.m$1("EOF encountered in middle of BMPString");
                return null;
            }
            cArr[i3] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i3 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i3 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i3 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i3 += 4;
            remaining -= 8;
        }
        if (remaining > 0) {
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, remaining) != remaining) {
                Path$$ExternalSyntheticBUOutline0.m$1("EOF encountered in middle of BMPString");
                return null;
            }
            do {
                int i4 = i2 + 1;
                int i5 = bArr[i2] << 8;
                i2 += 2;
                cArr[i3] = (char) ((bArr[i4] & 255) | i5);
                i3++;
            } while (i2 < remaining);
        }
        if (definiteLengthInputStream.getRemaining() == 0 && i == i3) {
            return cArr;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        int remaining = definiteLengthInputStream.getRemaining();
        if (remaining >= bArr.length) {
            return definiteLengthInputStream.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        definiteLengthInputStream.readAllIntoByteArray(bArr2);
        return bArr2;
    }

    public static int readLength(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1("EOF found when length expected");
            return 0;
        }
        if (255 == read) {
            a$$ExternalSyntheticBUOutline0.m$4("invalid long form definite-length 0xFF");
            return 0;
        }
        int i2 = read & 127;
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1("EOF found reading length");
                return 0;
            }
            if ((i3 >>> 23) != 0) {
                a$$ExternalSyntheticBUOutline0.m$4("long form definite-length more than 31 bits");
                return 0;
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < i2);
        if (i3 < i || z) {
            return i3;
        }
        a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("corrupted stream - out of bounds length found: ", i3, i, " >= "));
        return 0;
    }

    public static int readTagNumber(InputStream inputStream, int i) {
        String str;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read >= 31) {
            int i3 = read & 127;
            if (i3 != 0) {
                while ((read & 128) != 0) {
                    if ((i3 >>> 24) == 0) {
                        int i4 = i3 << 7;
                        int read2 = inputStream.read();
                        if (read2 < 0) {
                            Path$$ExternalSyntheticBUOutline0.m$1("EOF found inside tag value.");
                            return 0;
                        }
                        i3 = i4 | (read2 & 127);
                        read = read2;
                    } else {
                        str = "Tag number more than 31 bits";
                    }
                }
                return i3;
            }
            str = "corrupted stream - invalid high tag number found";
        } else {
            if (read < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1("EOF found inside tag value.");
                return 0;
            }
            str = "corrupted stream - high tag number < 31 found";
        }
        a$$ExternalSyntheticBUOutline0.m$4(str);
        return 0;
    }

    public ASN1BitString buildConstructedBitString(ASN1EncodableVector aSN1EncodableVector) {
        int size = aSN1EncodableVector.size();
        ASN1BitString[] aSN1BitStringArr = new ASN1BitString[size];
        for (int i = 0; i != size; i++) {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i);
            if (!(aSN1Encodable instanceof ASN1BitString)) {
                throw new ASN1Exception("unknown object encountered in constructed BIT STRING: " + aSN1Encodable.getClass());
            }
            aSN1BitStringArr[i] = (ASN1BitString) aSN1Encodable;
        }
        return new BERBitString(aSN1BitStringArr);
    }

    public ASN1OctetString buildConstructedOctetString(ASN1EncodableVector aSN1EncodableVector) {
        int size = aSN1EncodableVector.size();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
        for (int i = 0; i != size; i++) {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i);
            if (!(aSN1Encodable instanceof ASN1OctetString)) {
                throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + aSN1Encodable.getClass());
            }
            aSN1OctetStringArr[i] = (ASN1OctetString) aSN1Encodable;
        }
        return new BEROctetString(aSN1OctetStringArr);
    }

    public ASN1Primitive buildObject(int i, int i2, int i3) {
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i3, this.limit);
        if ((i & 224) == 0) {
            return createPrimitiveDERObject(i2, definiteLengthInputStream, this.tmpBuffers);
        }
        int i4 = i & 192;
        if (i4 != 0) {
            return readTaggedObjectDL(i4, i2, (i & 32) != 0, definiteLengthInputStream);
        }
        if (i2 == 3) {
            return buildConstructedBitString(readVector(definiteLengthInputStream));
        }
        if (i2 == 4) {
            return buildConstructedOctetString(readVector(definiteLengthInputStream));
        }
        if (i2 == 8) {
            return DLFactory.createSequence(readVector(definiteLengthInputStream)).toASN1External();
        }
        if (i2 == 16) {
            return definiteLengthInputStream.getRemaining() < 1 ? DLFactory.EMPTY_SEQUENCE : this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DLFactory.createSequence(readVector(definiteLengthInputStream));
        }
        if (i2 == 17) {
            return DLFactory.createSet(readVector(definiteLengthInputStream));
        }
        a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "unknown tag ", " encountered"));
        return null;
    }

    public int getLimit() {
        return this.limit;
    }

    public void readFully(byte[] bArr) {
        if (Streams.readFully(this, bArr, 0, bArr.length) == bArr.length) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1("EOF encountered in middle of object");
    }

    public ASN1Primitive readObject() {
        String str;
        int read = read();
        if (read > 0) {
            int readTagNumber = readTagNumber(this, read);
            int readLength = readLength();
            if (readLength >= 0) {
                try {
                    return buildObject(read, readTagNumber, readLength);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            }
            if ((read & 32) != 0) {
                ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit, this.tmpBuffers);
                int i = read & 192;
                if (i != 0) {
                    return aSN1StreamParser.loadTaggedIL(i, readTagNumber);
                }
                if (readTagNumber == 3) {
                    return BERBitStringParser.parse(aSN1StreamParser);
                }
                if (readTagNumber == 4) {
                    return BEROctetStringParser.parse(aSN1StreamParser);
                }
                if (readTagNumber == 8) {
                    return DERExternalParser.parse(aSN1StreamParser);
                }
                if (readTagNumber == 16) {
                    return BERSequenceParser.parse(aSN1StreamParser);
                }
                if (readTagNumber == 17) {
                    return BERSetParser.parse(aSN1StreamParser);
                }
                str = "unknown BER object encountered";
            } else {
                str = "indefinite-length primitive encoding encountered";
            }
        } else {
            if (read != 0) {
                return null;
            }
            str = "unexpected end-of-contents marker";
        }
        a$$ExternalSyntheticBUOutline0.m$4(str);
        return null;
    }

    public ASN1Primitive readTaggedObjectDL(int i, int i2, boolean z, DefiniteLengthInputStream definiteLengthInputStream) {
        return !z ? ASN1TaggedObject.createPrimitive(i, i2, definiteLengthInputStream.toByteArray()) : ASN1TaggedObject.createConstructedDL(i, i2, readVector(definiteLengthInputStream));
    }

    public ASN1EncodableVector readVector() {
        ASN1Primitive readObject = readObject();
        if (readObject == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.add(readObject);
            readObject = readObject();
        } while (readObject != null);
        return aSN1EncodableVector;
    }

    public ASN1InputStream(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public ASN1InputStream(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    public ASN1InputStream(InputStream inputStream, boolean z) {
        this(inputStream, StreamUtil.findLimit(inputStream), z);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public ASN1EncodableVector readVector(DefiniteLengthInputStream definiteLengthInputStream) {
        int remaining = definiteLengthInputStream.getRemaining();
        return remaining < 1 ? new ASN1EncodableVector(0) : new ASN1InputStream(definiteLengthInputStream, remaining, this.lazyEvaluate, this.tmpBuffers).readVector();
    }

    public int readLength() {
        return readLength(this, this.limit, false);
    }
}
