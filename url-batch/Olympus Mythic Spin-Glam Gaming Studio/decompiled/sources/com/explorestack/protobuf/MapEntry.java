package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MapEntryLite;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes13.dex */
public final class MapEntry extends AbstractMessage {
    private volatile int cachedSerializedSize;
    private final Object key;
    private final Metadata metadata;
    private final Object value;

    /* JADX INFO: Access modifiers changed from: private */
    static final class Metadata extends MapEntryLite.Metadata {
        public final Descriptors.Descriptor descriptor;
        public final Parser parser;

        public Metadata(Descriptors.Descriptor descriptor, MapEntry mapEntry, WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2) {
            super(fieldType, mapEntry.key, fieldType2, mapEntry.value);
            this.descriptor = descriptor;
            this.parser = new AbstractParser() { // from class: com.explorestack.protobuf.MapEntry.Metadata.1
                @Override // com.explorestack.protobuf.Parser
                public MapEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new MapEntry(Metadata.this, codedInputStream, extensionRegistryLite);
                }
            };
        }
    }

    private MapEntry(Descriptors.Descriptor descriptor, WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = new Metadata(descriptor, this, fieldType, fieldType2);
    }

    private MapEntry(Metadata metadata, Object obj, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = metadata;
    }

    private MapEntry(Metadata metadata, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this.cachedSerializedSize = -1;
        try {
            this.metadata = metadata;
            Map.Entry parseEntry = MapEntryLite.parseEntry(codedInputStream, metadata, extensionRegistryLite);
            this.key = parseEntry.getKey();
            this.value = parseEntry.getValue();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    public static MapEntry newDefaultInstance(Descriptors.Descriptor descriptor, WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        return new MapEntry(descriptor, fieldType, obj, fieldType2, obj2);
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.cachedSerializedSize != -1) {
            return this.cachedSerializedSize;
        }
        int computeSerializedSize = MapEntryLite.computeSerializedSize(this.metadata, this.key, this.value);
        this.cachedSerializedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        MapEntryLite.writeTo(codedOutputStream, this.metadata, this.key, this.value);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return isInitialized(this.metadata, this.value);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser getParserForType() {
        return this.metadata.parser;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return new Builder(this.metadata);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return new Builder(this.metadata, this.key, this.value, true, true);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    public MapEntry mo3244getDefaultInstanceForType() {
        Metadata metadata = this.metadata;
        return new MapEntry(metadata, metadata.defaultKey, metadata.defaultValue);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.metadata.descriptor;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.metadata.descriptor.getFields()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    private void checkFieldDescriptor(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() == this.metadata.descriptor) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.metadata.descriptor.getFullName());
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        checkFieldDescriptor(fieldDescriptor);
        return true;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        checkFieldDescriptor(fieldDescriptor);
        Object key = fieldDescriptor.getNumber() == 1 ? getKey() : getValue();
        return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.m3242getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public UnknownFieldSet getUnknownFields() {
        return UnknownFieldSet.getDefaultInstance();
    }

    public static class Builder extends AbstractMessage.Builder {
        private boolean hasKey;
        private boolean hasValue;
        private Object key;
        private final Metadata metadata;
        private Object value;

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return this;
        }

        private Builder(Metadata metadata) {
            this(metadata, metadata.defaultKey, metadata.defaultValue, false, false);
        }

        private Builder(Metadata metadata, Object obj, Object obj2, boolean z, boolean z2) {
            this.metadata = metadata;
            this.key = obj;
            this.value = obj2;
            this.hasKey = z;
            this.hasValue = z2;
        }

        public Object getKey() {
            return this.key;
        }

        public Object getValue() {
            return this.value;
        }

        public Builder setKey(Object obj) {
            this.key = obj;
            this.hasKey = true;
            return this;
        }

        public Builder clearKey() {
            this.key = this.metadata.defaultKey;
            this.hasKey = false;
            return this;
        }

        public Builder setValue(Object obj) {
            this.value = obj;
            this.hasValue = true;
            return this;
        }

        public Builder clearValue() {
            this.value = this.metadata.defaultValue;
            this.hasValue = false;
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MapEntry build() {
            MapEntry buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MapEntry buildPartial() {
            return new MapEntry(this.metadata, this.key, this.value);
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return this.metadata.descriptor;
        }

        private void checkFieldDescriptor(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() == this.metadata.descriptor) {
                return;
            }
            throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.metadata.descriptor.getFullName());
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() != 2 || fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new RuntimeException("\"" + fieldDescriptor.getFullName() + "\" is not a message value field.");
            }
            return ((Message) this.value).newBuilderForType();
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                setKey(obj);
            } else {
                if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                    obj = Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber());
                } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && obj != null && !this.metadata.defaultValue.getClass().isInstance(obj)) {
                    obj = ((Message) this.metadata.defaultValue).toBuilder().mergeFrom((Message) obj).build();
                }
                setValue(obj);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                clearKey();
            } else {
                clearValue();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public MapEntry mo3244getDefaultInstanceForType() {
            Metadata metadata = this.metadata;
            return new MapEntry(metadata, metadata.defaultKey, metadata.defaultValue);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return MapEntry.isInitialized(this.metadata, this.value);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (Descriptors.FieldDescriptor fieldDescriptor : this.metadata.descriptor.getFields()) {
                if (hasField(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            return fieldDescriptor.getNumber() == 1 ? this.hasKey : this.hasValue;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            Object key = fieldDescriptor.getNumber() == 1 ? getKey() : getValue();
            return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.m3242getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* renamed from: clone */
        public Builder mo3223clone() {
            return new Builder(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInitialized(Metadata metadata, Object obj) {
        if (metadata.valueType.getJavaType() == WireFormat.JavaType.MESSAGE) {
            return ((MessageLite) obj).isInitialized();
        }
        return true;
    }

    final Metadata getMetadata() {
        return this.metadata;
    }
}
