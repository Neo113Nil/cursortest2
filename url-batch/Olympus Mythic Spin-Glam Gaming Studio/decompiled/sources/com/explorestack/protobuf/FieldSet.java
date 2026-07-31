package com.explorestack.protobuf;

import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.LazyField;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
final class FieldSet {
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public interface FieldDescriptorLite extends Comparable {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    private FieldSet() {
        this.fields = SmallSortedMap.newFieldMap(16);
    }

    private FieldSet(boolean z) {
        this(SmallSortedMap.newFieldMap(0));
        makeImmutable();
    }

    private FieldSet(SmallSortedMap smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }

    public static FieldSet newFieldSet() {
        return new FieldSet();
    }

    public static FieldSet emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder((AnonymousClass1) null);
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.fields.equals(((FieldSet) obj).fields);
        }
        return false;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSet m3243clone() {
        FieldSet newFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry arrayEntryAt = this.fields.getArrayEntryAt(i);
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public Map getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        SmallSortedMap cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            cloneAllFieldsMap.makeImmutable();
        }
        return cloneAllFieldsMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SmallSortedMap cloneAllFieldsMap(SmallSortedMap smallSortedMap, boolean z) {
        SmallSortedMap newFieldMap = SmallSortedMap.newFieldMap(16);
        for (int i = 0; i < smallSortedMap.getNumArrayEntries(); i++) {
            cloneFieldEntry(newFieldMap, smallSortedMap.getArrayEntryAt(i), z);
        }
        Iterator it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, (Map.Entry) it.next(), z);
        }
        return newFieldMap;
    }

    private static void cloneFieldEntry(Map map, Map.Entry entry, boolean z) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            map.put(fieldDescriptorLite, ((LazyField) value).getValue());
        } else if (z && (value instanceof List)) {
            map.put(fieldDescriptorLite, new ArrayList((List) value));
        } else {
            map.put(fieldDescriptorLite, value);
        }
    }

    public Iterator iterator() {
        if (this.hasLazyField) {
            return new LazyField.LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public boolean hasField(FieldDescriptorLite fieldDescriptorLite) {
        if (fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(fieldDescriptorLite) != null;
    }

    public Object getField(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.fields.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public void setField(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(fieldDescriptorLite, it.next());
            }
            obj = arrayList;
        } else {
            verifyType(fieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable) fieldDescriptorLite, obj);
    }

    public void clearField(FieldDescriptorLite fieldDescriptorLite) {
        this.fields.remove(fieldDescriptorLite);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public int getRepeatedFieldCount(FieldDescriptorLite fieldDescriptorLite) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fieldDescriptorLite);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public Object getRepeatedField(FieldDescriptorLite fieldDescriptorLite, int i) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fieldDescriptorLite);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) field).get(i);
    }

    public void setRepeatedField(FieldDescriptorLite fieldDescriptorLite, int i, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fieldDescriptorLite);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(fieldDescriptorLite, obj);
        ((List) field).set(i, obj);
    }

    public void addRepeatedField(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List list;
        if (!fieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(fieldDescriptorLite, obj);
        Object field = getField(fieldDescriptorLite);
        if (field == null) {
            list = new ArrayList();
            this.fields.put((Comparable) fieldDescriptorLite, (Object) list);
        } else {
            list = (List) field;
        }
        list.add(obj);
    }

    private void verifyType(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!isValidType(fieldDescriptorLite.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    break;
                }
                break;
        }
        return false;
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInitialized(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLite) {
                    if (!((MessageLite) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public void mergeFrom(FieldSet fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        Iterator it = fieldSet.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((Map.Entry) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void mergeFromField(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object field = getField(fieldDescriptorLite);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable) fieldDescriptorLite, field);
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object field2 = getField(fieldDescriptorLite);
            if (field2 == null) {
                this.fields.put((Comparable) fieldDescriptorLite, cloneIfMutable(value));
                return;
            } else {
                this.fields.put((Comparable) fieldDescriptorLite, (Object) fieldDescriptorLite.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
                return;
            }
        }
        this.fields.put((Comparable) fieldDescriptorLite, cloneIfMutable(value));
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Map.Entry entry : this.fields.getOverflowEntries()) {
            writeField((FieldDescriptorLite) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((Map.Entry) it.next(), codedOutputStream);
        }
    }

    private void writeMessageSetTo(Map.Entry entry, CodedOutputStream codedOutputStream) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            codedOutputStream.writeMessageSetExtension(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
            return;
        }
        writeField(fieldDescriptorLite, entry.getValue(), codedOutputStream);
    }

    static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    /* renamed from: com.explorestack.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 17;
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

    static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
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
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public static void writeField(FieldDescriptorLite fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += computeElementSizeNoTag(liteType, it.next());
                }
                codedOutputStream.writeRawVarint32(i);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(codedOutputStream, liteType, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof LazyField) {
            writeElement(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public int getSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry entry : this.fields.getOverflowEntries()) {
            i += computeFieldSize((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public int getMessageSetSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            i += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i += getMessageSetSerializedSize((Map.Entry) it.next());
        }
        return i;
    }

    private int getMessageSetSerializedSize(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return computeFieldSize(fieldDescriptorLite, value);
    }

    static int computeElementSize(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
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
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i += computeElementSizeNoTag(liteType, it.next());
                }
                return CodedOutputStream.computeTagSize(number) + i + CodedOutputStream.computeRawVarint32Size(i);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i += computeElementSize(liteType, number, it2.next());
            }
            return i;
        }
        return computeElementSize(liteType, number, obj);
    }

    static final class Builder {
        private SmallSortedMap fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            this(SmallSortedMap.newFieldMap(16));
        }

        private Builder(SmallSortedMap smallSortedMap) {
            this.fields = smallSortedMap;
            this.isMutable = true;
        }

        public FieldSet build() {
            if (this.fields.isEmpty()) {
                return FieldSet.emptySet();
            }
            this.isMutable = false;
            SmallSortedMap smallSortedMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMap = FieldSet.cloneAllFieldsMap(smallSortedMap, false);
                replaceBuilders(smallSortedMap);
            }
            FieldSet fieldSet = new FieldSet(smallSortedMap, null);
            fieldSet.hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private static void replaceBuilders(SmallSortedMap smallSortedMap) {
            for (int i = 0; i < smallSortedMap.getNumArrayEntries(); i++) {
                replaceBuilders(smallSortedMap.getArrayEntryAt(i));
            }
            Iterator it = smallSortedMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next());
            }
        }

        private static void replaceBuilders(Map.Entry entry) {
            entry.setValue(replaceBuilders((FieldDescriptorLite) entry.getKey(), entry.getValue()));
        }

        private static Object replaceBuilders(FieldDescriptorLite fieldDescriptorLite, Object obj) {
            if (obj == null || fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (fieldDescriptorLite.isRepeated()) {
                if (!(obj instanceof List)) {
                    throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
                }
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    Object replaceBuilder = replaceBuilder(obj2);
                    if (replaceBuilder != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i, replaceBuilder);
                    }
                }
                return list;
            }
            return replaceBuilder(obj);
        }

        private static Object replaceBuilder(Object obj) {
            return obj instanceof MessageLite.Builder ? ((MessageLite.Builder) obj).build() : obj;
        }

        public Map getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            SmallSortedMap cloneAllFieldsMap = FieldSet.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(cloneAllFieldsMap);
            }
            return cloneAllFieldsMap;
        }

        public boolean hasField(FieldDescriptorLite fieldDescriptorLite) {
            if (fieldDescriptorLite.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(fieldDescriptorLite) != null;
        }

        public Object getField(FieldDescriptorLite fieldDescriptorLite) {
            return replaceBuilders(fieldDescriptorLite, getFieldAllowBuilders(fieldDescriptorLite));
        }

        Object getFieldAllowBuilders(FieldDescriptorLite fieldDescriptorLite) {
            Object obj = this.fields.get(fieldDescriptorLite);
            return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = FieldSet.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public void setField(FieldDescriptorLite fieldDescriptorLite, Object obj) {
            ensureIsMutable();
            if (fieldDescriptorLite.isRepeated()) {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    verifyType(fieldDescriptorLite, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof MessageLite.Builder);
                }
                obj = arrayList;
            } else {
                verifyType(fieldDescriptorLite, obj);
            }
            if (obj instanceof LazyField) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            this.fields.put((Comparable) fieldDescriptorLite, obj);
        }

        public void clearField(FieldDescriptorLite fieldDescriptorLite) {
            ensureIsMutable();
            this.fields.remove(fieldDescriptorLite);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public int getRepeatedFieldCount(FieldDescriptorLite fieldDescriptorLite) {
            if (!fieldDescriptorLite.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object field = getField(fieldDescriptorLite);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }

        public Object getRepeatedField(FieldDescriptorLite fieldDescriptorLite, int i) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(fieldDescriptorLite, i));
        }

        Object getRepeatedFieldAllowBuilders(FieldDescriptorLite fieldDescriptorLite, int i) {
            if (!fieldDescriptorLite.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(fieldDescriptorLite);
            if (fieldAllowBuilders == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List) fieldAllowBuilders).get(i);
        }

        public void setRepeatedField(FieldDescriptorLite fieldDescriptorLite, int i, Object obj) {
            ensureIsMutable();
            if (!fieldDescriptorLite.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            Object field = getField(fieldDescriptorLite);
            if (field == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(fieldDescriptorLite, obj);
            ((List) field).set(i, obj);
        }

        public void addRepeatedField(FieldDescriptorLite fieldDescriptorLite, Object obj) {
            List list;
            ensureIsMutable();
            if (!fieldDescriptorLite.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
            verifyType(fieldDescriptorLite, obj);
            Object field = getField(fieldDescriptorLite);
            if (field == null) {
                list = new ArrayList();
                this.fields.put((Comparable) fieldDescriptorLite, (Object) list);
            } else {
                list = (List) field;
            }
            list.add(obj);
        }

        private void verifyType(FieldDescriptorLite fieldDescriptorLite, Object obj) {
            if (FieldSet.isValidType(fieldDescriptorLite.getLiteType(), obj)) {
                return;
            }
            if (fieldDescriptorLite.getLiteType().getJavaType() != WireFormat.JavaType.MESSAGE || !(obj instanceof MessageLite.Builder)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public boolean isInitialized() {
            for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
                if (!FieldSet.isInitialized(this.fields.getArrayEntryAt(i))) {
                    return false;
                }
            }
            Iterator it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!FieldSet.isInitialized((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(FieldSet fieldSet) {
            ensureIsMutable();
            for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
                mergeFromField(fieldSet.fields.getArrayEntryAt(i));
            }
            Iterator it = fieldSet.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        private void mergeFromField(Map.Entry entry) {
            FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            if (fieldDescriptorLite.isRepeated()) {
                Object field = getField(fieldDescriptorLite);
                if (field == null) {
                    field = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) field).add(FieldSet.cloneIfMutable(it.next()));
                }
                this.fields.put((Comparable) fieldDescriptorLite, field);
                return;
            }
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                this.fields.put((Comparable) fieldDescriptorLite, FieldSet.cloneIfMutable(value));
                return;
            }
            Object field2 = getField(fieldDescriptorLite);
            if (field2 == null) {
                this.fields.put((Comparable) fieldDescriptorLite, FieldSet.cloneIfMutable(value));
            } else if (field2 instanceof MessageLite.Builder) {
                fieldDescriptorLite.internalMergeFrom((MessageLite.Builder) field2, (MessageLite) value);
            } else {
                this.fields.put((Comparable) fieldDescriptorLite, (Object) fieldDescriptorLite.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
            }
        }
    }
}
