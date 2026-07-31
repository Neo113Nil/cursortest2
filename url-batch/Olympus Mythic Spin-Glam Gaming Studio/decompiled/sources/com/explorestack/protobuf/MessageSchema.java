package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
final class MessageSchema implements Schema {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite = false;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema unknownFieldSchema;
    private final boolean useCachedSizeField;

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        boolean z3 = false;
        this.proto3 = z;
        if (extensionSchema != null && extensionSchema.hasExtensions(messageLite)) {
            z3 = true;
        }
        this.hasExtensions = z3;
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    static MessageSchema newSchema(Class cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static MessageSchema newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        boolean z = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
        int objectFieldOffset;
        int id;
        long objectFieldOffset2;
        int i2;
        int i3;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof != null) {
            id = fieldInfo.getType().id() + 51;
            objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
            objectFieldOffset2 = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        } else {
            FieldType type = fieldInfo.getType();
            objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            id = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                i2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                i3 = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                i2 = 0;
                i3 = 0;
            } else {
                objectFieldOffset2 = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i] = fieldInfo.getFieldNumber();
            iArr[i + 1] = (fieldInfo.isRequired() ? 268435456 : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
            iArr[i + 2] = i2 | (i3 << 20);
            Class messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            int i4 = (i / 3) * 2;
            objArr[i4] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i4 + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[i4 + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i2 = (int) objectFieldOffset2;
        i3 = 0;
        iArr[i] = fieldInfo.getFieldNumber();
        if (!fieldInfo.isEnforceUtf8()) {
        }
        iArr[i + 1] = (fieldInfo.isRequired() ? 268435456 : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
        iArr[i + 2] = i2 | (i3 << 20);
        Class messageFieldClass2 = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
        }
    }

    @Override // com.explorestack.protobuf.Schema
    public Object newInstance() {
        return this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // com.explorestack.protobuf.Schema
    public int getSerializedSize(Object obj) {
        return this.proto3 ? getSerializedSizeProto3(obj) : getSerializedSizeProto2(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(Object obj) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        boolean z;
        int computeSizeFixed32List;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            int numberAt = numberAt(i5);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i = this.buffer[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
            } else {
                i = (!this.useCachedSizeField || type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i5 + 2] & i3;
                i2 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i6 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i6 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, offset);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i6 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i5));
                        i6 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i6 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(obj, offset), getMessageFieldSchema(i5));
                        i6 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeBoolSize;
                    break;
                case 19:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 20:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 21:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 22:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 23:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 24:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 25:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 26:
                    computeBoolSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i6 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i5));
                    i6 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i6 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeBoolSize;
                    break;
                case 30:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 31:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 32:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 33:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 34:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i5));
                    i6 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(obj, offset), getMapFieldDefaultEntry(i5));
                    i6 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i6 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i6 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i6 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i6 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        Object object2 = unsafe.getObject(obj, offset);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i6 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i5));
                        i6 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i6 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i6 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(obj, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(obj, offset), getMessageFieldSchema(i5));
                        i6 += computeBoolSize;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int unknownFieldsSerializedSize = i6 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(Object obj) {
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i = 0;
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i2);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i2);
            long offset = offset(typeAndOffsetAt);
            int i3 = (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i2 + 2] & 1048575;
            switch (type) {
                case 0:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(obj, i2)) {
                        Object object = UnsafeUtil.getObject(obj, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(obj, offset));
                    i += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(obj, offset), getMessageFieldSchema(i2));
                    i += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(obj, offset));
                    i += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(obj, offset), getMessageFieldSchema(i2));
                    i += computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(obj, offset), getMapFieldDefaultEntry(i2));
                    i += computeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        Object object2 = UnsafeUtil.getObject(obj, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
    }

    private int getUnknownFieldsSerializedSize(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(obj));
    }

    private static List listAt(Object obj, long j) {
        return (List) UnsafeUtil.getObject(obj, j);
    }

    @Override // com.explorestack.protobuf.Schema
    public void mergeFrom(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, reader, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x007b, code lost:
    
        r0 = r16.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x007f, code lost:
    
        if (r0 >= r16.repeatedFieldOffsetStart) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0081, code lost:
    
        r13 = filterMapUnknownEnumValues(r19, r16.intArray[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x008c, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x008e, code lost:
    
        r17.setBuilderToMessage(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mergeFromHelper(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Object obj2 = null;
        FieldSet fieldSet = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int positionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (positionForFieldNumber >= 0) {
                    int typeAndOffsetAt = typeAndOffsetAt(positionForFieldNumber);
                    try {
                        switch (type(typeAndOffsetAt)) {
                            case 0:
                                UnsafeUtil.putDouble(obj, offset(typeAndOffsetAt), reader.readDouble());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 1:
                                UnsafeUtil.putFloat(obj, offset(typeAndOffsetAt), reader.readFloat());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 2:
                                UnsafeUtil.putLong(obj, offset(typeAndOffsetAt), reader.readInt64());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 3:
                                UnsafeUtil.putLong(obj, offset(typeAndOffsetAt), reader.readUInt64());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 4:
                                UnsafeUtil.putInt(obj, offset(typeAndOffsetAt), reader.readInt32());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 5:
                                UnsafeUtil.putLong(obj, offset(typeAndOffsetAt), reader.readFixed64());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 6:
                                UnsafeUtil.putInt(obj, offset(typeAndOffsetAt), reader.readFixed32());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 7:
                                UnsafeUtil.putBoolean(obj, offset(typeAndOffsetAt), reader.readBool());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 8:
                                readString(obj, typeAndOffsetAt, reader);
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 9:
                                if (isFieldPresent(obj, positionForFieldNumber)) {
                                    UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite)));
                                    break;
                                } else {
                                    UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(obj, positionForFieldNumber);
                                    break;
                                }
                            case 10:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), reader.readBytes());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 11:
                                UnsafeUtil.putInt(obj, offset(typeAndOffsetAt), reader.readUInt32());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 12:
                                int readEnum = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(readEnum)) {
                                    obj2 = SchemaUtil.storeUnknownEnum(fieldNumber, readEnum, obj2, unknownFieldSchema);
                                    break;
                                }
                                UnsafeUtil.putInt(obj, offset(typeAndOffsetAt), readEnum);
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 13:
                                UnsafeUtil.putInt(obj, offset(typeAndOffsetAt), reader.readSFixed32());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 14:
                                UnsafeUtil.putLong(obj, offset(typeAndOffsetAt), reader.readSFixed64());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 15:
                                UnsafeUtil.putInt(obj, offset(typeAndOffsetAt), reader.readSInt32());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 16:
                                UnsafeUtil.putLong(obj, offset(typeAndOffsetAt), reader.readSInt64());
                                setFieldPresent(obj, positionForFieldNumber);
                                break;
                            case 17:
                                if (isFieldPresent(obj, positionForFieldNumber)) {
                                    UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), reader.readGroupBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite)));
                                    break;
                                } else {
                                    UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), reader.readGroupBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(obj, positionForFieldNumber);
                                    break;
                                }
                            case 18:
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 19:
                                reader.readFloatList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 20:
                                reader.readInt64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 21:
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 22:
                                reader.readInt32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 23:
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 24:
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 25:
                                reader.readBoolList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 26:
                                readStringList(obj, typeAndOffsetAt, reader);
                                break;
                            case 27:
                                readMessageList(obj, typeAndOffsetAt, reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                break;
                            case 28:
                                reader.readBytesList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 29:
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 30:
                                List mutableListAt = this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt);
                                obj2 = SchemaUtil.filterUnknownEnumList(fieldNumber, mutableListAt, getEnumFieldVerifier(positionForFieldNumber), obj2, unknownFieldSchema);
                                break;
                            case 31:
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 32:
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 33:
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 34:
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 35:
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 36:
                                reader.readFloatList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 37:
                                reader.readInt64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 38:
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 39:
                                reader.readInt32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 40:
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 41:
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 42:
                                reader.readBoolList(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 43:
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 44:
                                List mutableListAt2 = this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt2);
                                obj2 = SchemaUtil.filterUnknownEnumList(fieldNumber, mutableListAt2, getEnumFieldVerifier(positionForFieldNumber), obj2, unknownFieldSchema);
                                break;
                            case 45:
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 46:
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 47:
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 48:
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(obj, offset(typeAndOffsetAt)));
                                break;
                            case 49:
                                readGroupList(obj, offset(typeAndOffsetAt), reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                break;
                            case 50:
                                mergeMap(obj, positionForFieldNumber, getMapFieldDefaultEntry(positionForFieldNumber), extensionRegistryLite, reader);
                                break;
                            case 51:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Double.valueOf(reader.readDouble()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 52:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Float.valueOf(reader.readFloat()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 53:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Long.valueOf(reader.readInt64()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 54:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Long.valueOf(reader.readUInt64()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 55:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Integer.valueOf(reader.readInt32()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 56:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Long.valueOf(reader.readFixed64()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 57:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Integer.valueOf(reader.readFixed32()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 58:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Boolean.valueOf(reader.readBool()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 59:
                                readString(obj, typeAndOffsetAt, reader);
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 60:
                                if (isOneofPresent(obj, fieldNumber, positionForFieldNumber)) {
                                    UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(obj, positionForFieldNumber);
                                }
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 61:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), reader.readBytes());
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 62:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Integer.valueOf(reader.readUInt32()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 63:
                                int readEnum2 = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(readEnum2)) {
                                    obj2 = SchemaUtil.storeUnknownEnum(fieldNumber, readEnum2, obj2, unknownFieldSchema);
                                    break;
                                }
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Integer.valueOf(readEnum2));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 64:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Integer.valueOf(reader.readSFixed32()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 65:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Long.valueOf(reader.readSFixed64()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 66:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Integer.valueOf(reader.readSInt32()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 67:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), Long.valueOf(reader.readSInt64()));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            case 68:
                                UnsafeUtil.putObject(obj, offset(typeAndOffsetAt), reader.readGroupBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite));
                                setOneofPresent(obj, fieldNumber, positionForFieldNumber);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = unknownFieldSchema.newBuilder();
                                }
                                if (!unknownFieldSchema.mergeOneFieldFrom(obj2, reader)) {
                                    for (int i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                        obj2 = filterMapUnknownEnumValues(obj, this.intArray[i], obj2, unknownFieldSchema);
                                    }
                                    if (obj2 != null) {
                                        unknownFieldSchema.setBuilderToMessage(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!unknownFieldSchema.shouldDiscardUnknownFields(reader)) {
                            if (obj2 == null) {
                                obj2 = unknownFieldSchema.getBuilderFromMessage(obj);
                            }
                            if (!unknownFieldSchema.mergeOneFieldFrom(obj2, reader)) {
                                for (int i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                    obj2 = filterMapUnknownEnumValues(obj, this.intArray[i2], obj2, unknownFieldSchema);
                                }
                                if (obj2 != null) {
                                    unknownFieldSchema.setBuilderToMessage(obj, obj2);
                                    return;
                                }
                                return;
                            }
                        } else if (!reader.skipField()) {
                            for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                obj2 = filterMapUnknownEnumValues(obj, this.intArray[i3], obj2, unknownFieldSchema);
                            }
                            if (obj2 != null) {
                                unknownFieldSchema.setBuilderToMessage(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                            obj2 = filterMapUnknownEnumValues(obj, this.intArray[i4], obj2, unknownFieldSchema);
                        }
                        if (obj2 != null) {
                            unknownFieldSchema.setBuilderToMessage(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object findExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, fieldNumber);
                    if (findExtensionByNumber != null) {
                        if (fieldSet == null) {
                            fieldSet = extensionSchema.getMutableExtensions(obj);
                        }
                        obj2 = extensionSchema.parseExtension(reader, findExtensionByNumber, extensionRegistryLite, fieldSet, obj2, unknownFieldSchema);
                    } else if (!unknownFieldSchema.shouldDiscardUnknownFields(reader)) {
                        if (obj2 == null) {
                            obj2 = unknownFieldSchema.getBuilderFromMessage(obj);
                        }
                        if (unknownFieldSchema.mergeOneFieldFrom(obj2, reader)) {
                        }
                    } else if (reader.skipField()) {
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.checkInitializedCount; i5 < this.repeatedFieldOffsetStart; i5++) {
                    obj2 = filterMapUnknownEnumValues(obj, this.intArray[i5], obj2, unknownFieldSchema);
                }
                if (obj2 != null) {
                    unknownFieldSchema.setBuilderToMessage(obj, obj2);
                }
                throw th;
            }
        }
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    @Override // com.explorestack.protobuf.Schema
    public void makeImmutable(Object obj) {
        int i;
        int i2 = this.checkInitializedCount;
        while (true) {
            i = this.repeatedFieldOffsetStart;
            if (i2 >= i) {
                break;
            }
            long offset = offset(typeAndOffsetAt(this.intArray[i2]));
            Object object = UnsafeUtil.getObject(obj, offset);
            if (object != null) {
                UnsafeUtil.putObject(obj, offset, this.mapFieldSchema.toImmutable(object));
            }
            i2++;
        }
        int length = this.intArray.length;
        while (i < length) {
            this.listFieldSchema.makeImmutableListAt(obj, this.intArray[i]);
            i++;
        }
        this.unknownFieldSchema.makeImmutable(obj);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(obj);
        }
    }

    private final void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private final Object filterMapUnknownEnumValues(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? obj2 : filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, obj2, unknownFieldSchema);
    }

    private final Object filterUnknownEnumMap(int i, int i2, Map map, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema) {
        MapEntryLite.Metadata forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifier.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = unknownFieldSchema.newBuilder();
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, entry.getKey(), entry.getValue());
                    unknownFieldSchema.addLengthDelimited(obj, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    private void readString(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private void readMessageList(Object obj, int i, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readGroupList(Object obj, long j, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private static int oneofIntAt(Object obj, long j) {
        return ((Integer) UnsafeUtil.getObject(obj, j)).intValue();
    }

    private static long oneofLongAt(Object obj, long j) {
        return ((Long) UnsafeUtil.getObject(obj, j)).longValue();
    }

    private boolean isFieldPresent(Object obj, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(obj, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return UnsafeUtil.getDouble(obj, offset) != 0.0d;
            case 1:
                return UnsafeUtil.getFloat(obj, offset) != 0.0f;
            case 2:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(obj, offset);
            case 8:
                Object object = UnsafeUtil.getObject(obj, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(obj, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(obj, offset));
            case 11:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(obj, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void setFieldPresent(Object obj, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(obj, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(obj, j));
    }

    private boolean isOneofPresent(Object obj, int i, int i2) {
        return UnsafeUtil.getInt(obj, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private void setOneofPresent(Object obj, int i, int i2) {
        UnsafeUtil.putInt(obj, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
