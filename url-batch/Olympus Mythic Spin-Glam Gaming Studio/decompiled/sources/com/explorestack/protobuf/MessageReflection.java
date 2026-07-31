package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class MessageReflection {

    interface MergeTarget {

        public enum ContainerType {
            MESSAGE,
            EXTENSION_SET
        }

        MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str);

        ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i);

        Object finish();

        ContainerType getContainerType();

        Descriptors.Descriptor getDescriptorForType();

        Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor);

        WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor);

        MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);
    }

    static void writeMessageTo(Message message, Map map, CodedOutputStream codedOutputStream, boolean z) {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        if (z) {
            TreeMap treeMap = new TreeMap(map);
            for (Descriptors.FieldDescriptor fieldDescriptor : message.getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !treeMap.containsKey(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, message.getField(fieldDescriptor));
                }
            }
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor2 = (Descriptors.FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor2.isExtension() && fieldDescriptor2.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !fieldDescriptor2.isRepeated()) {
                codedOutputStream.writeMessageSetExtension(fieldDescriptor2.getNumber(), (Message) value);
            } else {
                FieldSet.writeField(fieldDescriptor2, value, codedOutputStream);
            }
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }

    static int getSerializedSize(Message message, Map map) {
        int serializedSize;
        int computeFieldSize;
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !fieldDescriptor.isRepeated()) {
                computeFieldSize = CodedOutputStream.computeMessageSetExtensionSize(fieldDescriptor.getNumber(), (Message) value);
            } else {
                computeFieldSize = FieldSet.computeFieldSize(fieldDescriptor, value);
            }
            i += computeFieldSize;
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            serializedSize = unknownFields.getSerializedSizeAsMessageSet();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return i + serializedSize;
    }

    static String delimitWithCommas(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static boolean isInitialized(MessageOrBuilder messageOrBuilder) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String subMessagePrefix(String str, Descriptors.FieldDescriptor fieldDescriptor, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            sb.append('(');
            sb.append(fieldDescriptor.getFullName());
            sb.append(')');
        } else {
            sb.append(fieldDescriptor.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    private static void findMissingFields(MessageOrBuilder messageOrBuilder, String str, List list) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                list.add(str + fieldDescriptor.getName());
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        findMissingFields((MessageOrBuilder) it.next(), subMessagePrefix(str, key, i), list);
                        i++;
                    }
                } else if (messageOrBuilder.hasField(key)) {
                    findMissingFields((MessageOrBuilder) value, subMessagePrefix(str, key, -1), list);
                }
            }
        }
    }

    static List findMissingFields(MessageOrBuilder messageOrBuilder) {
        ArrayList arrayList = new ArrayList();
        findMissingFields(messageOrBuilder, "", arrayList);
        return arrayList;
    }

    static class BuilderAdapter implements MergeTarget {
        private final Message.Builder builder;

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Descriptors.Descriptor getDescriptorForType() {
            return this.builder.getDescriptorForType();
        }

        public BuilderAdapter(Message.Builder builder) {
            this.builder = builder;
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.builder.getField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.builder.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.builder.hasOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.builder.getOneofFieldDescriptor(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget.ContainerType getContainerType() {
            return MergeTarget.ContainerType.MESSAGE;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            extensionRegistry.findImmutableExtensionByName(str);
            return null;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i) {
            extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
            return null;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newBuilderForField;
            Message message2;
            if (message != null) {
                newBuilderForField = message.newBuilderForType();
            } else {
                newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForField.mergeFrom(message2);
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForField, extensionRegistryLite);
            return newBuilderForField.buildPartial();
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newBuilderForField;
            Message message2;
            if (message != null) {
                newBuilderForField = message.newBuilderForType();
            } else {
                newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForField.mergeFrom(message2);
            }
            codedInputStream.readMessage(newBuilderForField, extensionRegistryLite);
            return newBuilderForField.buildPartial();
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newBuilderForField;
            Message message2;
            if (message != null) {
                newBuilderForField = message.newBuilderForType();
            } else {
                newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForField.mergeFrom(message2);
            }
            return new BuilderAdapter(newBuilderForField);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return WireFormat.Utf8Validation.STRICT;
            }
            fieldDescriptor.isRepeated();
            return WireFormat.Utf8Validation.LOOSE;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Object finish() {
            return this.builder.buildPartial();
        }
    }

    static class ExtensionAdapter implements MergeTarget {
        private final FieldSet extensions;

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return null;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return false;
        }

        ExtensionAdapter(FieldSet fieldSet) {
            this.extensions = fieldSet;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Descriptors.Descriptor getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.extensions.getField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.extensions.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget.ContainerType getContainerType() {
            return MergeTarget.ContainerType.EXTENSION_SET;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            extensionRegistry.findImmutableExtensionByName(str);
            return null;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i) {
            extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
            return null;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForType.mergeFrom(message2);
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForType.mergeFrom(message2);
            }
            codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return WireFormat.Utf8Validation.STRICT;
            }
            return WireFormat.Utf8Validation.LOOSE;
        }

        @Override // com.explorestack.protobuf.MessageReflection.MergeTarget
        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean mergeFieldFrom(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptors.Descriptor descriptor, MergeTarget mergeTarget, int i) {
        Descriptors.FieldDescriptor findFieldByNumber;
        boolean z;
        boolean z2;
        Object parseGroup;
        if (descriptor.getOptions().getMessageSetWireFormat() && i == WireFormat.MESSAGE_SET_ITEM_TAG) {
            mergeMessageSetExtensionFromCodedStream(codedInputStream, builder, extensionRegistryLite, descriptor, mergeTarget);
            return true;
        }
        int tagWireType = WireFormat.getTagWireType(i);
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        if (descriptor.isExtensionNumber(tagFieldNumber)) {
            if (extensionRegistryLite instanceof ExtensionRegistry) {
                mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, tagFieldNumber);
            }
        } else if (mergeTarget.getContainerType() == MergeTarget.ContainerType.MESSAGE) {
            findFieldByNumber = descriptor.findFieldByNumber(tagFieldNumber);
            z = false;
            if (findFieldByNumber != null) {
                if (tagWireType == FieldSet.getWireFormatForFieldType(findFieldByNumber.getLiteType(), false)) {
                    z2 = false;
                } else if (findFieldByNumber.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(findFieldByNumber.getLiteType(), true)) {
                    z2 = true;
                }
                if (z) {
                    if (builder != null) {
                        return builder.mergeFieldFrom(i, codedInputStream);
                    }
                    return codedInputStream.skipField(i);
                }
                if (z2) {
                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (findFieldByNumber.getLiteType() == WireFormat.FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            int readEnum = codedInputStream.readEnum();
                            if (findFieldByNumber.getFile().supportsUnknownEnumValue()) {
                                mergeTarget.addRepeatedField(findFieldByNumber, findFieldByNumber.m3242getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                            } else {
                                Descriptors.EnumValueDescriptor m3241findValueByNumber = findFieldByNumber.m3242getEnumType().m3241findValueByNumber(readEnum);
                                if (m3241findValueByNumber != null) {
                                    mergeTarget.addRepeatedField(findFieldByNumber, m3241findValueByNumber);
                                } else if (builder != null) {
                                    builder.mergeVarintField(tagFieldNumber, readEnum);
                                }
                            }
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            mergeTarget.addRepeatedField(findFieldByNumber, WireFormat.readPrimitiveField(codedInputStream, findFieldByNumber.getLiteType(), mergeTarget.getUtf8Validation(findFieldByNumber)));
                        }
                    }
                    codedInputStream.popLimit(pushLimit);
                } else {
                    int i2 = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[findFieldByNumber.getType().ordinal()];
                    if (i2 == 1) {
                        parseGroup = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, findFieldByNumber, null);
                    } else if (i2 == 2) {
                        parseGroup = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, findFieldByNumber, null);
                    } else if (i2 == 3) {
                        int readEnum2 = codedInputStream.readEnum();
                        if (findFieldByNumber.getFile().supportsUnknownEnumValue()) {
                            parseGroup = findFieldByNumber.m3242getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                        } else {
                            Descriptors.EnumValueDescriptor m3241findValueByNumber2 = findFieldByNumber.m3242getEnumType().m3241findValueByNumber(readEnum2);
                            if (m3241findValueByNumber2 == null) {
                                if (builder != null) {
                                    builder.mergeVarintField(tagFieldNumber, readEnum2);
                                }
                                return true;
                            }
                            parseGroup = m3241findValueByNumber2;
                        }
                    } else {
                        parseGroup = WireFormat.readPrimitiveField(codedInputStream, findFieldByNumber.getLiteType(), mergeTarget.getUtf8Validation(findFieldByNumber));
                    }
                    if (findFieldByNumber.isRepeated()) {
                        mergeTarget.addRepeatedField(findFieldByNumber, parseGroup);
                    } else {
                        mergeTarget.setField(findFieldByNumber, parseGroup);
                    }
                }
                return true;
            }
            z2 = false;
            z = true;
            if (z) {
            }
        }
        findFieldByNumber = null;
        z = false;
        if (findFieldByNumber != null) {
        }
        z2 = false;
        z = true;
        if (z) {
        }
    }

    /* renamed from: com.explorestack.protobuf.MessageReflection$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptors.Descriptor descriptor, MergeTarget mergeTarget) {
        int i = 0;
        ByteString byteString = null;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = codedInputStream.readUInt32();
                if (i != 0 && (extensionRegistryLite instanceof ExtensionRegistry)) {
                    mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, i);
                }
            } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                byteString = codedInputStream.readBytes();
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
        if (byteString == null || i == 0 || builder == null) {
            return;
        }
        builder.mergeField(i, UnknownFieldSet.Field.newBuilder().addLengthDelimited(byteString).build());
    }
}
