package org.bouncycastle.oer;

import androidx.webkit.ProxyConfig;
import coil3.disk.DiskLruCache;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.SwitchIndexer;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class OERInputStream extends FilterInputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    private static final int[] bitsR = {128, 64, 32, 16, 8, 4, 2, 1};
    protected PrintWriter debugOutput;
    protected PrintWriter debugStream;
    private int maxByteAllocation;

    /* renamed from: org.bouncycastle.oer.OERInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.OPAQUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Switch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Supplier.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.IA5String.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static class Choice extends OERInputStream {
        final int preamble;
        final int tag;
        final int tagClass;

        public Choice(InputStream inputStream) throws IOException {
            super(inputStream);
            int read;
            int read2 = read();
            this.preamble = read2;
            if (read2 < 0) {
                throw new EOFException("expecting preamble byte of choice");
            }
            this.tagClass = read2 & 192;
            int i = read2 & 63;
            if (i >= 63) {
                i = 0;
                do {
                    read = inputStream.read();
                    if (read < 0) {
                        throw new EOFException("expecting further tag bytes");
                    }
                    i = (i << 7) | (read & 127);
                } while ((read & 128) != 0);
            }
            this.tag = i;
        }

        public int getTag() {
            return this.tag;
        }

        public int getTagClass() {
            return this.tagClass;
        }

        public boolean isApplicationTagClass() {
            return this.tagClass == 64;
        }

        public boolean isContextSpecific() {
            return this.tagClass == 128;
        }

        public boolean isPrivateTagClass() {
            return this.tagClass == 192;
        }

        public boolean isUniversalTagClass() {
            return this.tagClass == 0;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("CHOICE(");
            int i = this.tagClass;
            if (i == 0) {
                str = "Universal ";
            } else if (i == 64) {
                str = "Application ";
            } else {
                if (i != 128) {
                    if (i == 192) {
                        str = "Private ";
                    }
                    sb.append("Tag = " + this.tag);
                    sb.append(")");
                    return sb.toString();
                }
                str = "ContextSpecific ";
            }
            sb.append(str);
            sb.append("Tag = " + this.tag);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class LengthInfo {
        private final BigInteger length;
        private final boolean shortForm;

        public LengthInfo(BigInteger bigInteger, boolean z) {
            this.length = bigInteger;
            this.shortForm = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int intLength() {
            return BigIntegers.intValueExact(this.length);
        }
    }

    public static class Sequence extends OERInputStream {
        private final boolean extensionFlagSet;
        private final int preamble;
        private final boolean[] valuePresent;

        public Sequence(InputStream inputStream, Element element) throws IOException {
            super(inputStream);
            int i;
            if (!element.hasPopulatedExtension() && element.getOptionals() <= 0 && !element.hasDefaultChildren()) {
                this.preamble = 0;
                this.extensionFlagSet = false;
                this.valuePresent = null;
                return;
            }
            int read = this.in.read();
            this.preamble = read;
            if (read < 0) {
                throw new EOFException("expecting preamble byte of sequence");
            }
            this.extensionFlagSet = element.hasPopulatedExtension() && (read & 128) == 128;
            this.valuePresent = new boolean[element.getChildren().size()];
            int i2 = element.hasPopulatedExtension() ? 6 : 7;
            int i3 = 0;
            for (Element element2 : element.getChildren()) {
                if (element2.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                    if (element2.getBlock() != 0) {
                        return;
                    }
                    if (element2.isExplicit()) {
                        i = i3 + 1;
                        this.valuePresent[i3] = true;
                    } else {
                        if (i2 < 0) {
                            read = inputStream.read();
                            if (read < 0) {
                                throw new EOFException("expecting mask byte sequence");
                            }
                            i2 = 7;
                        }
                        i = i3 + 1;
                        this.valuePresent[i3] = (OERInputStream.bits[i2] & read) > 0;
                        i2--;
                    }
                    i3 = i;
                }
            }
        }

        public boolean hasExtension() {
            return this.extensionFlagSet;
        }

        public boolean hasOptional(int i) {
            return this.valuePresent[i];
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SEQ(");
            sb.append(hasExtension() ? "Ext " : "");
            if (this.valuePresent != null) {
                int i = 0;
                while (true) {
                    boolean[] zArr = this.valuePresent;
                    if (i >= zArr.length) {
                        break;
                    }
                    sb.append(zArr[i] ? DiskLruCache.VERSION : "0");
                    i++;
                }
            } else {
                sb.append(ProxyConfig.MATCH_ALL_SCHEMES);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    public OERInputStream(InputStream inputStream) {
        super(inputStream);
        this.debugOutput = null;
        this.maxByteAllocation = 1048576;
        this.debugStream = null;
    }

    public OERInputStream(InputStream inputStream, int i) {
        super(inputStream);
        this.debugOutput = null;
        this.debugStream = null;
        this.maxByteAllocation = i;
    }

    private ASN1Encodable absent(Element element) {
        debugPrint(element + "Absent");
        return OEROptional.ABSENT;
    }

    private byte[] allocateArray(int i) {
        if (i <= this.maxByteAllocation) {
            return new byte[i];
        }
        throw new IllegalArgumentException("required byte array size " + i + " was greater than " + this.maxByteAllocation);
    }

    private int countOptionalChildTypes(Element element) {
        Iterator<Element> it = element.getChildren().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += !it.next().isExplicit() ? 1 : 0;
        }
        return i;
    }

    public static ASN1Encodable parse(byte[] bArr, Element element) throws IOException {
        return new OERInputStream(new ByteArrayInputStream(bArr)).parse(element);
    }

    public Choice choice() throws IOException {
        return new Choice(this);
    }

    protected void debugPrint(String str) {
        if (this.debugOutput == null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = -1;
        for (int i2 = 0; i2 != stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement.getMethodName().equals("debugPrint")) {
                i = 0;
            } else if (stackTraceElement.getClassName().contains("OERInput")) {
                i++;
            }
        }
        while (true) {
            PrintWriter printWriter = this.debugOutput;
            if (i <= 0) {
                printWriter.append((CharSequence) str).append((CharSequence) "\n");
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((CharSequence) "    ");
                i--;
            }
        }
    }

    public BigInteger enumeration() throws IOException {
        int read = read();
        if (read == -1) {
            throw new EOFException("expecting prefix of enumeration");
        }
        if ((read & 128) != 128) {
            return BigInteger.valueOf(read);
        }
        int i = read & 127;
        if (i == 0) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[i];
        if (Streams.readFully(this, bArr) == i) {
            return new BigInteger(1, bArr);
        }
        throw new EOFException("unable to fully read integer component of enumeration");
    }

    public BigInteger int16() throws Exception {
        return parseInt(false, 2);
    }

    public BigInteger int32() throws Exception {
        return parseInt(false, 4);
    }

    public BigInteger int64() throws Exception {
        return parseInt(false, 8);
    }

    public BigInteger int8() throws Exception {
        return parseInt(false, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0481  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ASN1Object parse(Element element) throws IOException {
        ASN1Encodable aSN1Encodable;
        Element element2;
        ASN1Encodable defaultValue;
        byte[] allocateArray;
        BigInteger bigInteger;
        int i = 8;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[element.getBaseType().ordinal()]) {
            case 1:
                return parse(new Element(element.resolveSupplier().build(), element));
            case 2:
                throw new IllegalStateException("A switch element should only be found within a sequence.");
            case 3:
                return parse(new Element(element.getElementSupplier().build(), element));
            case 4:
                byte[] allocateArray2 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, allocateArray2) != allocateArray2.length) {
                    throw new IOException("could not read all of count of seq-of values");
                }
                int intValue = BigIntegers.fromUnsignedByteArray(allocateArray2).intValue();
                debugPrint(element + "(len = " + intValue + ")");
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                if (element.getChildren().get(0).getaSwitch() != null) {
                    throw new IllegalStateException("element def for item in SEQ OF has a switch, switches only supported in sequences");
                }
                for (int i2 = 0; i2 < intValue; i2++) {
                    aSN1EncodableVector.add(parse(Element.expandDeferredDefinition(element.getChildren().get(0), element)));
                }
                return new DERSequence(aSN1EncodableVector);
            case 5:
                Sequence sequence = new Sequence(this.in, element);
                debugPrint(element + sequence.toString());
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                List<Element> children = element.getChildren();
                int i3 = 0;
                while (i3 < children.size()) {
                    Element element3 = children.get(i3);
                    if (element3.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                        if (element3.getBlock() > 0) {
                            if (sequence.extensionFlagSet) {
                                byte[] allocateArray3 = allocateArray(readLength().intLength());
                                if (Streams.readFully(this.in, allocateArray3) != allocateArray3.length) {
                                    throw new IOException("did not fully read presence list.");
                                }
                                int length = (allocateArray3.length * 8) - allocateArray3[0];
                                while (true) {
                                    if (i3 < children.size() || i < length) {
                                        Element element4 = i3 < children.size() ? children.get(i3) : null;
                                        if (element4 != null) {
                                            if (i < length && (allocateArray3[i / 8] & bitsR[i % 8]) != 0) {
                                                aSN1Encodable = parseOpenType(element4);
                                            } else {
                                                if (element4.isExplicit()) {
                                                    throw new IOException("extension is marked as explicit but is not defined in presence list");
                                                }
                                                aSN1Encodable = OEROptional.ABSENT;
                                            }
                                            aSN1EncodableVector2.add(aSN1Encodable);
                                        } else if ((allocateArray3[i / 8] & bitsR[i % 8]) != 0) {
                                            int intLength = readLength().intLength();
                                            while (true) {
                                                intLength--;
                                                if (intLength >= 0) {
                                                    this.in.read();
                                                }
                                            }
                                        }
                                        i++;
                                        i3++;
                                    }
                                }
                            }
                            return new DERSequence(aSN1EncodableVector2);
                        }
                        Element expandDeferredDefinition = Element.expandDeferredDefinition(element3, element);
                        if (expandDeferredDefinition.getaSwitch() != null) {
                            element2 = expandDeferredDefinition.getaSwitch().result(new SwitchIndexer.Asn1EncodableVectorIndexer(aSN1EncodableVector2));
                            if (element2.getParent() != element) {
                                element2 = new Element(element2, element);
                            }
                        } else {
                            element2 = expandDeferredDefinition;
                        }
                        if (sequence.valuePresent != null) {
                            if (!sequence.valuePresent[i3]) {
                                defaultValue = element2.getDefaultValue() != null ? expandDeferredDefinition.getDefaultValue() : absent(expandDeferredDefinition);
                            } else if (!element2.isExplicit()) {
                                defaultValue = OEROptional.getInstance(parse(element2));
                            }
                            aSN1EncodableVector2.add(defaultValue);
                        }
                        defaultValue = parse(element2);
                        aSN1EncodableVector2.add(defaultValue);
                    }
                    i3++;
                }
                if (sequence.extensionFlagSet) {
                }
                return new DERSequence(aSN1EncodableVector2);
            case 6:
                Choice choice = choice();
                debugPrint(choice.toString() + " " + choice.tag);
                if (choice.isContextSpecific()) {
                    Element expandDeferredDefinition2 = Element.expandDeferredDefinition(element.getChildren().get(choice.getTag()), element);
                    if (expandDeferredDefinition2.getBlock() > 0) {
                        debugPrint("Chosen (Ext): " + expandDeferredDefinition2);
                        return new DERTaggedObject(choice.tag, parseOpenType(expandDeferredDefinition2));
                    }
                    debugPrint("Chosen: " + expandDeferredDefinition2);
                    return new DERTaggedObject(choice.tag, parse(expandDeferredDefinition2));
                }
                if (choice.isApplicationTagClass()) {
                    throw new IllegalStateException("Unimplemented tag type");
                }
                if (choice.isPrivateTagClass()) {
                    throw new IllegalStateException("Unimplemented tag type");
                }
                if (choice.isUniversalTagClass()) {
                    throw new IllegalStateException("Unimplemented tag type");
                }
                throw new IllegalStateException("Unimplemented tag type");
            case 7:
                BigInteger enumeration = enumeration();
                debugPrint(element + "ENUM(" + enumeration + ") = " + element.getChildren().get(enumeration.intValue()).getLabel());
                return new ASN1Enumerated(enumeration);
            case 8:
                int intBytesForRange = element.intBytesForRange();
                if (intBytesForRange != 0) {
                    allocateArray = allocateArray(Math.abs(intBytesForRange));
                    Streams.readFully(this, allocateArray);
                    bigInteger = intBytesForRange < 0 ? new BigInteger(allocateArray) : BigIntegers.fromUnsignedByteArray(allocateArray);
                } else if (element.isLowerRangeZero()) {
                    allocateArray = allocateArray(readLength().intLength());
                    Streams.readFully(this, allocateArray);
                    if (allocateArray.length != 0) {
                        bigInteger = new BigInteger(1, allocateArray);
                    }
                    bigInteger = BigInteger.ZERO;
                } else {
                    allocateArray = allocateArray(readLength().intLength());
                    Streams.readFully(this, allocateArray);
                    if (allocateArray.length != 0) {
                        bigInteger = new BigInteger(allocateArray);
                    }
                    bigInteger = BigInteger.ZERO;
                }
                if (this.debugOutput != null) {
                    debugPrint(element + "INTEGER byteLen= " + allocateArray.length + " hex= " + bigInteger.toString(16) + ")");
                }
                return new ASN1Integer(bigInteger);
            case 9:
                int intLength2 = (element.getUpperBound() == null || !element.getUpperBound().equals(element.getLowerBound())) ? readLength().intLength() : element.getUpperBound().intValue();
                byte[] allocateArray4 = allocateArray(intLength2);
                if (Streams.readFully(this, allocateArray4) != intLength2) {
                    throw new IOException("did not read all of " + element.getLabel());
                }
                if (this.debugOutput != null) {
                    debugPrint(element + "OCTET STRING (" + allocateArray4.length + ") = " + Hex.toHexString(allocateArray4, 0, Math.min(allocateArray4.length, 32)) + " " + (allocateArray4.length > 32 ? "..." : ""));
                }
                return new DEROctetString(allocateArray4);
            case 10:
                byte[] allocateArray5 = allocateArray(element.isFixedLength() ? element.getUpperBound().intValue() : readLength().intLength());
                if (Streams.readFully(this, allocateArray5) != allocateArray5.length) {
                    throw new IOException("could not read all of IA5 string");
                }
                String fromByteArray = Strings.fromByteArray(allocateArray5);
                if (this.debugOutput != null) {
                    debugPrint(element.appendLabel("IA5 String (" + allocateArray5.length + ") = " + fromByteArray));
                }
                return new DERIA5String(fromByteArray);
            case 11:
                byte[] allocateArray6 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, allocateArray6) != allocateArray6.length) {
                    throw new IOException("could not read all of utf 8 string");
                }
                String fromUTF8ByteArray = Strings.fromUTF8ByteArray(allocateArray6);
                if (this.debugOutput != null) {
                    debugPrint(element + "UTF8 String (" + allocateArray6.length + ") = " + fromUTF8ByteArray);
                }
                return new DERUTF8String(fromUTF8ByteArray);
            case 12:
                byte[] allocateArray7 = element.isFixedLength() ? new byte[element.getLowerBound().intValue() / 8] : allocateArray((BigInteger.ZERO.compareTo(element.getUpperBound()) > 0 ? element.getUpperBound().intValue() : readLength().intLength()) / 8);
                Streams.readFully(this, allocateArray7);
                if (this.debugOutput != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("BIT STRING(" + (allocateArray7.length * 8) + ") = ");
                    for (int i4 = 0; i4 != allocateArray7.length; i4++) {
                        byte b = allocateArray7[i4];
                        for (int i5 = 0; i5 < 8; i5++) {
                            stringBuffer.append((b & ByteCompanionObject.MIN_VALUE) > 0 ? DiskLruCache.VERSION : "0");
                            b = (byte) (b << 1);
                        }
                    }
                    debugPrint(element + stringBuffer.toString());
                }
                return new DERBitString(allocateArray7);
            case 13:
                debugPrint(element + "NULL");
                return DERNull.INSTANCE;
            case 14:
                LengthInfo readLength = readLength();
                byte[] bArr = new byte[readLength.intLength()];
                if (Streams.readFully(this, bArr) != readLength.intLength()) {
                    throw new IOException("could not read all of count of open value in choice (...) ");
                }
                debugPrint("ext " + readLength.intLength() + " " + Hex.toHexString(bArr));
                return new DEROctetString(bArr);
            case 15:
                return read() == 0 ? ASN1Boolean.FALSE : ASN1Boolean.TRUE;
            default:
                throw new IllegalStateException("Unhandled type " + element.getBaseType());
        }
    }

    public BigInteger parseInt(boolean z, int i) throws Exception {
        byte[] bArr = new byte[i];
        if (Streams.readFully(this, bArr) == i) {
            return z ? new BigInteger(1, bArr) : new BigInteger(bArr);
        }
        throw new IllegalStateException("integer not fully read");
    }

    protected ASN1Encodable parseOpenType(Element element) throws IOException {
        byte[] allocateArray = allocateArray(readLength().intLength());
        if (Streams.readFully(this.in, allocateArray) != allocateArray.length) {
            throw new IOException("did not fully read open type as raw bytes");
        }
        OERInputStream oERInputStream = null;
        try {
            OERInputStream oERInputStream2 = new OERInputStream(new ByteArrayInputStream(allocateArray));
            try {
                ASN1Object parse = oERInputStream2.parse(element);
                oERInputStream2.close();
                return parse;
            } catch (Throwable th) {
                th = th;
                oERInputStream = oERInputStream2;
                if (oERInputStream != null) {
                    oERInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public LengthInfo readLength() throws IOException {
        int read = read();
        if (read == -1) {
            throw new EOFException("expecting length");
        }
        if ((read & 128) == 0) {
            int i = read & 127;
            debugPrint("Len (Short form): " + i);
            return new LengthInfo(BigInteger.valueOf(i), true);
        }
        int i2 = read & 127;
        byte[] bArr = new byte[i2];
        if (Streams.readFully(this, bArr) != i2) {
            throw new EOFException("did not read all bytes of length definition");
        }
        debugPrint("Len (Long Form): " + i2 + " actual len: " + Hex.toHexString(bArr));
        return new LengthInfo(BigIntegers.fromUnsignedByteArray(bArr), false);
    }

    public BigInteger uint16() throws Exception {
        return parseInt(true, 2);
    }

    public BigInteger uint32() throws Exception {
        return parseInt(true, 4);
    }

    public BigInteger uint64() throws Exception {
        return parseInt(false, 8);
    }

    public BigInteger uint8() throws Exception {
        return parseInt(true, 1);
    }
}
