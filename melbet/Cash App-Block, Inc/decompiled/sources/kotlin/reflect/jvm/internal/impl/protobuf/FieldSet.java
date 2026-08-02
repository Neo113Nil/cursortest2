package kotlin.reflect.jvm.internal.impl.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes9.dex */
public final class FieldSet {
    public static final FieldSet DEFAULT_INSTANCE = new FieldSet(0);
    public boolean isImmutable;
    public boolean hasLazyField = false;
    public final SmallSortedMap$1 fields = new SmallSortedMap$1(16);

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    public FieldSet(int i) {
        makeImmutable();
    }

    public static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 10:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 11:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 17:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int computeFieldSize(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        int computeTagSize;
        int computeElementSizeNoTag;
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i = 0;
            if (!fieldDescriptorLite.isPacked()) {
                for (Object obj2 : (List) obj) {
                    int computeTagSize2 = CodedOutputStream.computeTagSize(number);
                    if (liteType == WireFormat.FieldType.GROUP) {
                        computeTagSize2 *= 2;
                    }
                    i += computeElementSizeNoTag(liteType, obj2) + computeTagSize2;
                }
                return i;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i += computeElementSizeNoTag(liteType, it.next());
            }
            computeTagSize = CodedOutputStream.computeTagSize(number) + i;
            computeElementSizeNoTag = CodedOutputStream.computeRawVarint32Size(i);
        } else {
            computeTagSize = CodedOutputStream.computeTagSize(number);
            if (liteType == WireFormat.FieldType.GROUP) {
                computeTagSize *= 2;
            }
            computeElementSizeNoTag = computeElementSizeNoTag(liteType, obj);
        }
        return computeElementSizeNoTag + computeTagSize;
    }

    public static boolean isInitialized(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (fieldDescriptorLite.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((MessageLite) it.next()).isInitialized()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof MessageLite)) {
            if (value instanceof LazyField) {
                return true;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((MessageLite) value).isInitialized()) {
            return true;
        }
        return false;
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                a$$ExternalSyntheticBUOutline0.m$3("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                a$$ExternalSyntheticBUOutline0.m$3("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                a$$ExternalSyntheticBUOutline0.m$3("readPrimitiveField() cannot handle enums.");
                break;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void verifyType(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString)) {
                    break;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof MessageLite)) {
                    break;
                }
                z2 = z;
                break;
        }
        if (z2) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Wrong object type used with protocol message reflection.");
    }

    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    public static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeStringNoTag((String) obj);
                break;
            case 10:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 11:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 17:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    break;
                }
        }
    }

    public final void addRepeatedField(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List list;
        if (!fieldDescriptorLite.isRepeated()) {
            a$$ExternalSyntheticBUOutline0.m$3("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        verifyType(fieldDescriptorLite.getLiteType(), obj);
        Object field = getField(fieldDescriptorLite);
        if (field == null) {
            list = new ArrayList();
            this.fields.put(fieldDescriptorLite, list);
        } else {
            list = (List) field;
        }
        list.add(obj);
    }

    public final FieldSet clone() {
        SmallSortedMap$1 smallSortedMap$1;
        FieldSet fieldSet = new FieldSet();
        int i = 0;
        while (true) {
            smallSortedMap$1 = this.fields;
            if (i >= smallSortedMap$1.entryList.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) smallSortedMap$1.entryList.get(i);
            fieldSet.setField((FieldDescriptorLite) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : smallSortedMap$1.getOverflowEntries()) {
            fieldSet.setField((FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        fieldSet.hasLazyField = this.hasLazyField;
        return fieldSet;
    }

    public final Object getField(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.fields.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        SmallSortedMap$1 smallSortedMap$1 = this.fields;
        if (!smallSortedMap$1.isImmutable) {
            for (int i = 0; i < smallSortedMap$1.entryList.size(); i++) {
                Map.Entry entry = (Map.Entry) smallSortedMap$1.entryList.get(i);
                if (((FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : smallSortedMap$1.getOverflowEntries()) {
                if (((FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!smallSortedMap$1.isImmutable) {
            smallSortedMap$1.overflowEntries = smallSortedMap$1.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(smallSortedMap$1.overflowEntries);
            smallSortedMap$1.isImmutable = true;
        }
        this.isImmutable = true;
    }

    public final void mergeFromField(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean isRepeated = fieldDescriptorLite.isRepeated();
        SmallSortedMap$1 smallSortedMap$1 = this.fields;
        if (isRepeated) {
            Object field = getField(fieldDescriptorLite);
            if (field == null) {
                field = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) field;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            smallSortedMap$1.put(fieldDescriptorLite, field);
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            smallSortedMap$1.put(fieldDescriptorLite, value);
            return;
        }
        Object field2 = getField(fieldDescriptorLite);
        if (field2 != null) {
            smallSortedMap$1.put(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        smallSortedMap$1.put(fieldDescriptorLite, value);
    }

    public final void setField(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            verifyType(fieldDescriptorLite.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                a$$ExternalSyntheticBUOutline0.m$3("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(fieldDescriptorLite.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put(fieldDescriptorLite, obj);
    }

    public FieldSet() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isInitialized() {
        int i = 0;
        while (true) {
            SmallSortedMap$1 smallSortedMap$1 = this.fields;
            if (i < smallSortedMap$1.entryList.size()) {
                if (!isInitialized((Map.Entry) smallSortedMap$1.entryList.get(i))) {
                    break;
                }
                i++;
            } else {
                Iterator it = smallSortedMap$1.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!isInitialized((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
    }
}
