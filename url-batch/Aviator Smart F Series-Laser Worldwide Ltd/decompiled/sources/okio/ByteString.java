package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final a Companion = new a(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(a aVar, String str, Charset charset, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                charset = kotlin.text.d.UTF_8;
            }
            return aVar.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(a aVar, byte[] bArr, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = bArr.length;
            }
            return aVar.of(bArr, i8, i9);
        }

        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m1441deprecated_decodeBase64(String string) {
            kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
            return decodeBase64(string);
        }

        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m1442deprecated_decodeHex(String string) {
            kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
            return decodeHex(string);
        }

        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m1443deprecated_encodeString(String string, Charset charset) {
            kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
            kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
            return encodeString(string, charset);
        }

        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m1444deprecated_encodeUtf8(String string) {
            kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
            return encodeUtf8(string);
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m1445deprecated_of(ByteBuffer buffer) {
            kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
            return of(buffer);
        }

        /* renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m1447deprecated_read(InputStream inputstream, int i8) {
            kotlin.jvm.internal.s.checkNotNullParameter(inputstream, "inputstream");
            return read(inputstream, i8);
        }

        public final ByteString decodeBase64(String str) {
            kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
            byte[] decodeBase64ToArray = b1.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        public final ByteString decodeHex(String str) {
            kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
            int i8 = 0;
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i9 = length - 1;
            if (i9 >= 0) {
                while (true) {
                    int i10 = i8 + 1;
                    int i11 = i8 * 2;
                    bArr[i8] = (byte) ((okio.internal.e.decodeHexDigit(str.charAt(i11)) << 4) + okio.internal.e.decodeHexDigit(str.charAt(i11 + 1)));
                    if (i10 > i9) {
                        break;
                    }
                    i8 = i10;
                }
            }
            return new ByteString(bArr);
        }

        public final ByteString encodeString(String str, Charset charset) {
            kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
            kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
            ByteString byteString = new ByteString(c1.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(ByteBuffer byteBuffer) {
            kotlin.jvm.internal.s.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString read(InputStream inputStream, int i8) {
            kotlin.jvm.internal.s.checkNotNullParameter(inputStream, "<this>");
            int i9 = 0;
            if (!(i8 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Integer.valueOf(i8)).toString());
            }
            byte[] bArr = new byte[i8];
            while (i9 < i8) {
                int read = inputStream.read(bArr, i9, i8 - i9);
                if (read == -1) {
                    throw new EOFException();
                }
                i9 += read;
            }
            return new ByteString(bArr);
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m1446deprecated_of(byte[] array, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
            return of(array, i8, i9);
        }

        public final ByteString of(byte... data) {
            kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        public final ByteString of(byte[] bArr, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
            d1.checkOffsetAndCount(bArr.length, i8, i9);
            return new ByteString(kotlin.collections.k.copyOfRange(bArr, i8, i9 + i8));
        }
    }

    public ByteString(byte[] data) {
        kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i8, byte[] bArr, int i9, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i11 & 1) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        byteString.copyInto(i8, bArr, i9, i10);
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return byteString.indexOf(byteString2, i8);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i9 & 2) != 0) {
            i8 = d1.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i8);
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    public static final ByteString read(InputStream inputStream, int i8) {
        return Companion.read(inputStream, i8);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = d1.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i8, i9);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m1439deprecated_getByte(int i8) {
        return getByte(i8);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m1440deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(asReadOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return b1.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return b1.encodeBase64(getData$okio(), b1.getBASE64_URL_SAFE());
    }

    public void copyInto(int i8, byte[] target, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        kotlin.collections.k.copyInto(getData$okio(), target, i9, i8, i10 + i8);
    }

    public ByteString digest$okio(String algorithm) {
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(getData$okio(), 0, size());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    public final boolean endsWith(ByteString suffix) {
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i8) {
        return internalGet$okio(i8);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        String concatToString;
        char[] cArr = new char[getData$okio().length * 2];
        byte[] data$okio = getData$okio();
        int length = data$okio.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = data$okio[i8];
            i8++;
            int i10 = i9 + 1;
            cArr[i9] = okio.internal.e.getHEX_DIGIT_CHARS()[(b8 >> 4) & 15];
            i9 += 2;
            cArr[i10] = okio.internal.e.getHEX_DIGIT_CHARS()[b8 & 15];
        }
        concatToString = kotlin.text.t.concatToString(cArr);
        return concatToString;
    }

    public ByteString hmac$okio(String algorithm, ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public ByteString hmacSha1(ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public ByteString hmacSha256(ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public ByteString hmacSha512(ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(ByteString other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i8) {
        return getData$okio()[i8];
    }

    public final int lastIndexOf(ByteString other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i8, ByteString other, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return other.rangeEquals(i9, getData$okio(), i8, i10);
    }

    public final void setHashCode$okio(int i8) {
        this.hashCode = i8;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio(org.bouncycastle.pqc.crypto.xmss.o.SHA_256);
    }

    public final ByteString sha512() {
        return digest$okio(org.bouncycastle.pqc.crypto.xmss.o.SHA_512);
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString prefix) {
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public String string(Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString toAsciiLowercase() {
        byte b8;
        for (int i8 = 0; i8 < getData$okio().length; i8++) {
            byte b9 = getData$okio()[i8];
            byte b10 = (byte) 65;
            if (b9 >= b10 && b9 <= (b8 = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i8] = (byte) (b9 + 32);
                for (int i9 = i8 + 1; i9 < copyOf.length; i9++) {
                    byte b11 = copyOf[i9];
                    if (b11 >= b10 && b11 <= b8) {
                        copyOf[i9] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b8;
        for (int i8 = 0; i8 < getData$okio().length; i8++) {
            byte b9 = getData$okio()[i8];
            byte b10 = (byte) 97;
            if (b9 >= b10 && b9 <= (b8 = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i8] = (byte) (b9 - 32);
                for (int i9 = i8 + 1; i9 < copyOf.length; i9++) {
                    byte b11 = copyOf[i9];
                    if (b11 >= b10 && b11 <= b8) {
                        copyOf[i9] = (byte) (b11 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String toString() {
        String replace$default;
        String replace$default2;
        String replace$default3;
        String str;
        if (getData$okio().length == 0) {
            str = "[size=0]";
        } else {
            int codePointIndexToCharIndex = okio.internal.e.codePointIndexToCharIndex(getData$okio(), 64);
            if (codePointIndexToCharIndex != -1) {
                String utf8 = utf8();
                if (utf8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = utf8.substring(0, codePointIndexToCharIndex);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                replace$default = kotlin.text.t.replace$default(substring, "\\", "\\\\", false, 4, (Object) null);
                replace$default2 = kotlin.text.t.replace$default(replace$default, "\n", "\\n", false, 4, (Object) null);
                replace$default3 = kotlin.text.t.replace$default(replace$default2, "\r", "\\r", false, 4, (Object) null);
                if (codePointIndexToCharIndex >= utf8.length()) {
                    return "[text=" + replace$default3 + ']';
                }
                return "[size=" + getData$okio().length + " text=" + replace$default3 + "…]";
            }
            if (getData$okio().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" hex=");
                int resolveDefaultParameter = d1.resolveDefaultParameter(this, 64);
                if (resolveDefaultParameter <= getData$okio().length) {
                    if (!(resolveDefaultParameter >= 0)) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    sb.append((resolveDefaultParameter == getData$okio().length ? this : new ByteString(kotlin.collections.k.copyOfRange(getData$okio(), 0, resolveDefaultParameter))).hex());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
            str = "[hex=" + hex() + ']';
        }
        return str;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = c1.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream out) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        out.write(this.data);
    }

    public void write$okio(c buffer, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        okio.internal.e.commonWrite(this, buffer, i8, i9);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return byteString.indexOf(bArr, i8);
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(ByteString other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int size = size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = getByte(i8) & 255;
            int i10 = other.getByte(i8) & 255;
            if (i9 != i10) {
                return i9 < i10 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
        }
    }

    public final boolean endsWith(byte[] suffix) {
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public final int indexOf(byte[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i8, byte[] other, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return i8 >= 0 && i8 <= getData$okio().length - i10 && i9 >= 0 && i9 <= other.length - i10 && d1.arrayRangeEquals(getData$okio(), i8, other, i9, i10);
    }

    public final boolean startsWith(byte[] prefix) {
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final ByteString substring(int i8) {
        return substring$default(this, i8, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i9 & 2) != 0) {
            i8 = d1.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i8);
    }

    public static final ByteString of(byte[] bArr, int i8, int i9) {
        return Companion.of(bArr, i8, i9);
    }

    public final int indexOf(ByteString other, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return indexOf(other.internalArray$okio(), i8);
    }

    public final int lastIndexOf(ByteString other, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return lastIndexOf(other.internalArray$okio(), i8);
    }

    public ByteString substring(int i8, int i9) {
        int resolveDefaultParameter = d1.resolveDefaultParameter(this, i9);
        if (i8 >= 0) {
            if (resolveDefaultParameter <= getData$okio().length) {
                if (resolveDefaultParameter - i8 >= 0) {
                    return (i8 == 0 && resolveDefaultParameter == getData$okio().length) ? this : new ByteString(kotlin.collections.k.copyOfRange(getData$okio(), i8, resolveDefaultParameter));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public int indexOf(byte[] other, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = getData$okio().length - other.length;
        int max = Math.max(i8, 0);
        if (max <= length) {
            while (true) {
                int i9 = max + 1;
                if (d1.arrayRangeEquals(getData$okio(), max, other, 0, other.length)) {
                    return max;
                }
                if (max == length) {
                    break;
                }
                max = i9;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] other, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(d1.resolveDefaultParameter(this, i8), getData$okio().length - other.length);
        if (min >= 0) {
            while (true) {
                int i9 = min - 1;
                if (d1.arrayRangeEquals(getData$okio(), min, other, 0, other.length)) {
                    return min;
                }
                if (i9 < 0) {
                    break;
                }
                min = i9;
            }
        }
        return -1;
    }
}
