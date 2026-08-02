package io.appmetrica.analytics.protobuf.nano;

import E.AbstractC0005f;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.protobuf.nano.MapFactories;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class InternalNano {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    static final Charset UTF_8 = Charset.forName(CharEncoding.UTF_8);
    static final Charset ISO_8859_1 = Charset.forName(CharEncoding.ISO_8859_1);
    public static final Object LAZY_INIT_LOCK = new Object();

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano extendableMessageNano, ExtendableMessageNano extendableMessageNano2) {
        FieldArray fieldArray = extendableMessageNano.unknownFieldData;
        if (fieldArray != null) {
            extendableMessageNano2.unknownFieldData = fieldArray.m7clone();
        }
    }

    public static <K, V> int computeMapFieldSize(Map<K, V> map, int i4, int i5, int i6) {
        int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i4);
        int i7 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(2, i6, value) + CodedOutputByteBufferNano.computeFieldSize(1, i5, key);
            i7 += CodedOutputByteBufferNano.computeRawVarint32Size(computeFieldSize) + computeTagSize + computeFieldSize;
        }
        return i7;
    }

    public static byte[] copyFromUtf8(String str) {
        return str.getBytes(UTF_8);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    private static boolean equalsMapValue(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    private static int hashCodeForMap(Object obj) {
        return obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> mergeMapEntry(CodedInputByteBufferNano codedInputByteBufferNano, Map<K, V> map, MapFactories.MapFactory mapFactory, int i4, int i5, V v, int i6, int i7) throws IOException {
        Map<K, V> forMap = mapFactory.forMap(map);
        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
        Object obj = null;
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == i6) {
                obj = codedInputByteBufferNano.readPrimitiveField(i4);
            } else if (readTag == i7) {
                if (i5 == 11) {
                    codedInputByteBufferNano.readMessage(v);
                } else {
                    v = (V) codedInputByteBufferNano.readPrimitiveField(i5);
                }
            } else if (!codedInputByteBufferNano.skipField(readTag)) {
                break;
            }
        }
        codedInputByteBufferNano.checkLastTagWas(0);
        codedInputByteBufferNano.popLimit(pushLimit);
        if (obj == null) {
            obj = primitiveDefaultValue(i4);
        }
        if (v == 0) {
            v = primitiveDefaultValue(i5);
        }
        forMap.put(obj, v);
        return forMap;
    }

    private static Object primitiveDefaultValue(int i4) {
        switch (i4) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(AbstractC0005f.k(i4, "Type: ", " is not a primitive type."));
            case 12:
                return WireFormatNano.EMPTY_BYTES;
        }
    }

    public static <K, V> void serializeMapField(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i4, int i5, int i6) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(2, i6, value) + CodedOutputByteBufferNano.computeFieldSize(1, i5, key);
            codedOutputByteBufferNano.writeTag(i4, 2);
            codedOutputByteBufferNano.writeRawVarint32(computeFieldSize);
            codedOutputByteBufferNano.writeField(1, i5, key);
            codedOutputByteBufferNano.writeField(2, i6, value);
        }
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(dArr);
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(zArr);
    }

    public static int hashCode(byte[][] bArr) {
        int length;
        int i4;
        if (bArr == null) {
            length = 0;
            i4 = 0;
        } else {
            length = bArr.length;
            i4 = 0;
        }
        for (int i5 = 0; i5 < length; i5++) {
            byte[] bArr2 = bArr[i5];
            if (bArr2 != null) {
                i4 = Arrays.hashCode(bArr2) + (i4 * 31);
            }
        }
        return i4;
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length == 0) {
            return fArr2 == null || fArr2.length == 0;
        }
        return Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(Object[] objArr) {
        int length;
        int i4;
        if (objArr == null) {
            length = 0;
            i4 = 0;
        } else {
            length = objArr.length;
            i4 = 0;
        }
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = objArr[i5];
            if (obj != null) {
                i4 = obj.hashCode() + (i4 * 31);
            }
        }
        return i4;
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        }
        return Arrays.equals(dArr, dArr2);
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        int i4 = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i4 += hashCodeForMap(entry.getValue()) ^ hashCodeForMap(entry.getKey());
        }
        return i4;
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null || zArr.length == 0) {
            return zArr2 == null || zArr2.length == 0;
        }
        return Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length;
        int i4;
        int length2 = bArr == null ? 0 : bArr.length;
        if (bArr2 == null) {
            length = 0;
            i4 = 0;
        } else {
            length = bArr2.length;
            i4 = 0;
        }
        int i5 = i4;
        while (true) {
            if (i4 >= length2 || bArr[i4] != null) {
                while (i5 < length && bArr2[i5] == null) {
                    i5++;
                }
                boolean z = i4 >= length2;
                boolean z4 = i5 >= length;
                if (z && z4) {
                    return true;
                }
                if (z != z4 || !Arrays.equals(bArr[i4], bArr2[i5])) {
                    return false;
                }
                i4++;
                i5++;
            } else {
                i4++;
            }
        }
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length;
        int i4;
        int length2 = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            length = 0;
            i4 = 0;
        } else {
            length = objArr2.length;
            i4 = 0;
        }
        int i5 = i4;
        while (true) {
            if (i4 >= length2 || objArr[i4] != null) {
                while (i5 < length && objArr2[i5] == null) {
                    i5++;
                }
                boolean z = i4 >= length2;
                boolean z4 = i5 >= length;
                if (z && z4) {
                    return true;
                }
                if (z != z4 || !objArr[i4].equals(objArr2[i5])) {
                    return false;
                }
                i4++;
                i5++;
            } else {
                i4++;
            }
        }
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null) {
            return map2.size() == 0;
        }
        if (map2 == null) {
            return map.size() == 0;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equalsMapValue(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
