package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Extension<M extends ExtendableMessageNano<M>, T> {
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
    protected final Class<T> clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    public static class PrimitiveExtension<M extends ExtendableMessageNano<M>, T> extends Extension<M, T> {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int i4, Class<T> cls, int i5, boolean z, int i6, int i7) {
            super(i4, cls, i5, z);
            this.nonPackedTag = i6;
            this.packedTag = i7;
        }

        private int computePackedDataSize(Object obj) {
            int length = Array.getLength(obj);
            int i4 = 0;
            switch (this.type) {
                case 1:
                case 6:
                case 16:
                    return length * 8;
                case 2:
                case 7:
                case 15:
                    return length * 4;
                case 3:
                    int i5 = 0;
                    while (i4 < length) {
                        i5 += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(obj, i4));
                        i4++;
                    }
                    return i5;
                case 4:
                    int i6 = 0;
                    while (i4 < length) {
                        i6 += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(obj, i4));
                        i4++;
                    }
                    return i6;
                case 5:
                    int i7 = 0;
                    while (i4 < length) {
                        i7 += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(obj, i4));
                        i4++;
                    }
                    return i7;
                case 8:
                    return length;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    throw new IllegalArgumentException("Unexpected non-packable type " + this.type);
                case 13:
                    int i8 = 0;
                    while (i4 < length) {
                        i8 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(obj, i4));
                        i4++;
                    }
                    return i8;
                case 14:
                    int i9 = 0;
                    while (i4 < length) {
                        i9 += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(obj, i4));
                        i4++;
                    }
                    return i9;
                case 17:
                    int i10 = 0;
                    while (i4 < length) {
                        i10 += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(obj, i4));
                        i4++;
                    }
                    return i10;
                case 18:
                    int i11 = 0;
                    while (i4 < length) {
                        i11 += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(obj, i4));
                        i4++;
                    }
                    return i11;
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public int computeRepeatedSerializedSize(Object obj) {
            int i4 = this.tag;
            if (i4 == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(obj);
            }
            if (i4 == this.packedTag) {
                int computePackedDataSize = computePackedDataSize(obj);
                return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + CodedOutputByteBufferNano.computeRawVarint32Size(computePackedDataSize) + computePackedDataSize;
            }
            throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public final int computeSingularSerializedSize(Object obj) {
            int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1:
                    return CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumber, ((Double) obj).doubleValue());
                case 2:
                    return CodedOutputByteBufferNano.computeFloatSize(tagFieldNumber, ((Float) obj).floatValue());
                case 3:
                    return CodedOutputByteBufferNano.computeInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 4:
                    return CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 5:
                    return CodedOutputByteBufferNano.computeInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 6:
                    return CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 7:
                    return CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 8:
                    return CodedOutputByteBufferNano.computeBoolSize(tagFieldNumber, ((Boolean) obj).booleanValue());
                case 9:
                    return CodedOutputByteBufferNano.computeStringSize(tagFieldNumber, (String) obj);
                case 10:
                case 11:
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
                case 12:
                    return CodedOutputByteBufferNano.computeBytesSize(tagFieldNumber, (byte[]) obj);
                case 13:
                    return CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 14:
                    return CodedOutputByteBufferNano.computeEnumSize(tagFieldNumber, ((Integer) obj).intValue());
                case 15:
                    return CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 16:
                    return CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 17:
                    return CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 18:
                    return CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumber, ((Long) obj).longValue());
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                return codedInputByteBufferNano.readPrimitiveField(this.type);
            } catch (IOException e4) {
                throw new IllegalArgumentException("Error reading extension field", e4);
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
            if (unknownFieldData.tag == this.nonPackedTag) {
                list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
                return;
            }
            CodedInputByteBufferNano newInstance = CodedInputByteBufferNano.newInstance(unknownFieldData.bytes);
            try {
                newInstance.pushLimit(newInstance.readRawVarint32());
                while (!newInstance.isAtEnd()) {
                    list.add(readData(newInstance));
                }
            } catch (IOException e4) {
                throw new IllegalArgumentException("Error reading extension field", e4);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int i4 = this.tag;
            if (i4 == this.nonPackedTag) {
                super.writeRepeatedData(obj, codedOutputByteBufferNano);
                return;
            }
            if (i4 != this.packedTag) {
                throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
            }
            int length = Array.getLength(obj);
            int computePackedDataSize = computePackedDataSize(obj);
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                codedOutputByteBufferNano.writeRawVarint32(computePackedDataSize);
                int i5 = 0;
                switch (this.type) {
                    case 1:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeDoubleNoTag(Array.getDouble(obj, i5));
                            i5++;
                        }
                        return;
                    case 2:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeFloatNoTag(Array.getFloat(obj, i5));
                            i5++;
                        }
                        return;
                    case 3:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeInt64NoTag(Array.getLong(obj, i5));
                            i5++;
                        }
                        return;
                    case 4:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeUInt64NoTag(Array.getLong(obj, i5));
                            i5++;
                        }
                        return;
                    case 5:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeInt32NoTag(Array.getInt(obj, i5));
                            i5++;
                        }
                        return;
                    case 6:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeFixed64NoTag(Array.getLong(obj, i5));
                            i5++;
                        }
                        return;
                    case 7:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeFixed32NoTag(Array.getInt(obj, i5));
                            i5++;
                        }
                        return;
                    case 8:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeBoolNoTag(Array.getBoolean(obj, i5));
                            i5++;
                        }
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new IllegalArgumentException("Unpackable type " + this.type);
                    case 13:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeUInt32NoTag(Array.getInt(obj, i5));
                            i5++;
                        }
                        return;
                    case 14:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeEnumNoTag(Array.getInt(obj, i5));
                            i5++;
                        }
                        return;
                    case 15:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeSFixed32NoTag(Array.getInt(obj, i5));
                            i5++;
                        }
                        return;
                    case 16:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeSFixed64NoTag(Array.getLong(obj, i5));
                            i5++;
                        }
                        return;
                    case 17:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeSInt32NoTag(Array.getInt(obj, i5));
                            i5++;
                        }
                        return;
                    case 18:
                        while (i5 < length) {
                            codedOutputByteBufferNano.writeSInt64NoTag(Array.getLong(obj, i5));
                            i5++;
                        }
                        return;
                }
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public final void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 1:
                        codedOutputByteBufferNano.writeDoubleNoTag(((Double) obj).doubleValue());
                        return;
                    case 2:
                        codedOutputByteBufferNano.writeFloatNoTag(((Float) obj).floatValue());
                        return;
                    case 3:
                        codedOutputByteBufferNano.writeInt64NoTag(((Long) obj).longValue());
                        return;
                    case 4:
                        codedOutputByteBufferNano.writeUInt64NoTag(((Long) obj).longValue());
                        return;
                    case 5:
                        codedOutputByteBufferNano.writeInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 6:
                        codedOutputByteBufferNano.writeFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 7:
                        codedOutputByteBufferNano.writeFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 8:
                        codedOutputByteBufferNano.writeBoolNoTag(((Boolean) obj).booleanValue());
                        return;
                    case 9:
                        codedOutputByteBufferNano.writeStringNoTag((String) obj);
                        return;
                    case 10:
                    case 11:
                    default:
                        throw new IllegalArgumentException("Unknown type " + this.type);
                    case 12:
                        codedOutputByteBufferNano.writeBytesNoTag((byte[]) obj);
                        return;
                    case 13:
                        codedOutputByteBufferNano.writeUInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 14:
                        codedOutputByteBufferNano.writeEnumNoTag(((Integer) obj).intValue());
                        return;
                    case 15:
                        codedOutputByteBufferNano.writeSFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 16:
                        codedOutputByteBufferNano.writeSFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 17:
                        codedOutputByteBufferNano.writeSInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 18:
                        codedOutputByteBufferNano.writeSInt64NoTag(((Long) obj).longValue());
                        return;
                }
            } catch (IOException e4) {
                throw new IllegalStateException(e4);
            }
        }
    }

    @Deprecated
    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int i4, Class<T> cls, int i5) {
        return new Extension<>(i4, cls, i5, false);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createPrimitiveTyped(int i4, Class<T> cls, long j4) {
        return new PrimitiveExtension(i4, cls, (int) j4, false, 0, 0);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T[]> createRepeatedMessageTyped(int i4, Class<T[]> cls, long j4) {
        return new Extension<>(i4, cls, (int) j4, true);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createRepeatedPrimitiveTyped(int i4, Class<T> cls, long j4, long j5, long j6) {
        return new PrimitiveExtension(i4, cls, (int) j4, true, (int) j5, (int) j6);
    }

    private T getRepeatedValueFrom(List<UnknownFieldData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            UnknownFieldData unknownFieldData = list.get(i4);
            if (unknownFieldData.bytes.length != 0) {
                readDataInto(unknownFieldData, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        Class<T> cls = this.clazz;
        T cast = cls.cast(Array.newInstance(cls.getComponentType(), size));
        for (int i5 = 0; i5 < size; i5++) {
            Array.set(cast, i5, arrayList.get(i5));
        }
        return cast;
    }

    private T getSingularValueFrom(List<UnknownFieldData> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.clazz.cast(readData(CodedInputByteBufferNano.newInstance(list.get(list.size() - 1).bytes)));
    }

    public int computeRepeatedSerializedSize(Object obj) {
        int length = Array.getLength(obj);
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (Array.get(obj, i5) != null) {
                i4 = computeSingularSerializedSize(Array.get(obj, i5)) + i4;
            }
        }
        return i4;
    }

    public int computeSerializedSize(Object obj) {
        return this.repeated ? computeRepeatedSerializedSize(obj) : computeSingularSerializedSize(obj);
    }

    public int computeSingularSerializedSize(Object obj) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
        int i4 = this.type;
        if (i4 == 10) {
            return CodedOutputByteBufferNano.computeGroupSize(tagFieldNumber, (MessageNano) obj);
        }
        if (i4 == 11) {
            return CodedOutputByteBufferNano.computeMessageSize(tagFieldNumber, (MessageNano) obj);
        }
        throw new IllegalArgumentException("Unknown type " + this.type);
    }

    public final T getValueFrom(List<UnknownFieldData> list) {
        if (list == null) {
            return null;
        }
        return this.repeated ? getRepeatedValueFrom(list) : getSingularValueFrom(list);
    }

    public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
        Class componentType = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            int i4 = this.type;
            if (i4 == 10) {
                MessageNano messageNano = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                return messageNano;
            }
            if (i4 == 11) {
                MessageNano messageNano2 = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readMessage(messageNano2);
                return messageNano2;
            }
            throw new IllegalArgumentException("Unknown type " + this.type);
        } catch (IOException e4) {
            throw new IllegalArgumentException("Error reading extension field", e4);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e5);
        } catch (InstantiationException e6) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e6);
        }
    }

    public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
        list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            Object obj2 = Array.get(obj, i4);
            if (obj2 != null) {
                writeSingularData(obj2, codedOutputByteBufferNano);
            }
        }
    }

    public void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.writeRawVarint32(this.tag);
            int i4 = this.type;
            if (i4 == 10) {
                int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
                codedOutputByteBufferNano.writeGroupNoTag((MessageNano) obj);
                codedOutputByteBufferNano.writeTag(tagFieldNumber, 4);
            } else if (i4 == 11) {
                codedOutputByteBufferNano.writeMessageNoTag((MessageNano) obj);
            } else {
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (IOException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public void writeTo(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.repeated) {
            writeRepeatedData(obj, codedOutputByteBufferNano);
        } else {
            writeSingularData(obj, codedOutputByteBufferNano);
        }
    }

    private Extension(int i4, Class<T> cls, int i5, boolean z) {
        this.type = i4;
        this.clazz = cls;
        this.tag = i5;
        this.repeated = z;
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int i4, Class<T> cls, long j4) {
        return new Extension<>(i4, cls, (int) j4, false);
    }
}
