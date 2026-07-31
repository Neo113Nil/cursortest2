package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DynamicMessage extends AbstractMessage {
    private final FieldSet fields;
    private int memoizedSize = -1;
    private final Descriptors.FieldDescriptor[] oneofCases;
    private final Descriptors.Descriptor type;
    private final UnknownFieldSet unknownFields;

    DynamicMessage(Descriptors.Descriptor descriptor, FieldSet fieldSet, Descriptors.FieldDescriptor[] fieldDescriptorArr, UnknownFieldSet unknownFieldSet) {
        this.type = descriptor;
        this.fields = fieldSet;
        this.oneofCases = fieldDescriptorArr;
        this.unknownFields = unknownFieldSet;
    }

    public static DynamicMessage getDefaultInstance(Descriptors.Descriptor descriptor) {
        return new DynamicMessage(descriptor, FieldSet.emptySet(), new Descriptors.FieldDescriptor[descriptor.toProto().getOneofDeclCount()], UnknownFieldSet.getDefaultInstance());
    }

    public static Builder newBuilder(Descriptors.Descriptor descriptor) {
        return new Builder(descriptor);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.type;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    public DynamicMessage mo3244getDefaultInstanceForType() {
        return getDefaultInstance(this.type);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map getAllFields() {
        return this.fields.getAllFields();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        verifyOneofContainingType(oneofDescriptor);
        return this.oneofCases[oneofDescriptor.getIndex()] != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        verifyOneofContainingType(oneofDescriptor);
        return this.oneofCases[oneofDescriptor.getIndex()];
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        return this.fields.hasField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        Object field = this.fields.getField(fieldDescriptor);
        if (field != null) {
            return field;
        }
        if (fieldDescriptor.isRepeated()) {
            return Collections.emptyList();
        }
        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            return getDefaultInstance(fieldDescriptor.getMessageType());
        }
        return fieldDescriptor.getDefaultValue();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        return this.fields.getRepeatedFieldCount(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        verifyContainingType(fieldDescriptor);
        return this.fields.getRepeatedField(fieldDescriptor, i);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    static boolean isInitialized(Descriptors.Descriptor descriptor, FieldSet fieldSet) {
        for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
            if (fieldDescriptor.isRequired() && !fieldSet.hasField(fieldDescriptor)) {
                return false;
            }
        }
        return fieldSet.isInitialized();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return isInitialized(this.type, this.fields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.type.getOptions().getMessageSetWireFormat()) {
            this.fields.writeMessageSetTo(codedOutputStream);
            this.unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            this.fields.writeTo(codedOutputStream);
            this.unknownFields.writeTo(codedOutputStream);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int serializedSize;
        int serializedSize2;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        if (this.type.getOptions().getMessageSetWireFormat()) {
            serializedSize = this.fields.getMessageSetSerializedSize();
            serializedSize2 = this.unknownFields.getSerializedSizeAsMessageSet();
        } else {
            serializedSize = this.fields.getSerializedSize();
            serializedSize2 = this.unknownFields.getSerializedSize();
        }
        int i2 = serializedSize + serializedSize2;
        this.memoizedSize = i2;
        return i2;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return new Builder(this.type);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return newBuilderForType().mergeFrom((Message) this);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser getParserForType() {
        return new AbstractParser() { // from class: com.explorestack.protobuf.DynamicMessage.1
            @Override // com.explorestack.protobuf.Parser
            public DynamicMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = DynamicMessage.newBuilder(DynamicMessage.this.type);
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
    }

    private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.type) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    private void verifyOneofContainingType(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() != this.type) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    public static final class Builder extends AbstractMessage.Builder {
        private FieldSet fields;
        private final Descriptors.FieldDescriptor[] oneofCases;
        private final Descriptors.Descriptor type;
        private UnknownFieldSet unknownFields;

        private Builder(Descriptors.Descriptor descriptor) {
            this.type = descriptor;
            this.fields = FieldSet.newFieldSet();
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            this.oneofCases = new Descriptors.FieldDescriptor[descriptor.toProto().getOneofDeclCount()];
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            if (this.fields.isImmutable()) {
                this.fields = FieldSet.newFieldSet();
            } else {
                this.fields.clear();
            }
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof DynamicMessage) {
                DynamicMessage dynamicMessage = (DynamicMessage) message;
                if (dynamicMessage.type != this.type) {
                    throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
                }
                ensureIsMutable();
                this.fields.mergeFrom(dynamicMessage.fields);
                mergeUnknownFields(dynamicMessage.unknownFields);
                int i = 0;
                while (true) {
                    Descriptors.FieldDescriptor[] fieldDescriptorArr = this.oneofCases;
                    if (i >= fieldDescriptorArr.length) {
                        return this;
                    }
                    if (fieldDescriptorArr[i] == null) {
                        fieldDescriptorArr[i] = dynamicMessage.oneofCases[i];
                    } else if (dynamicMessage.oneofCases[i] != null && this.oneofCases[i] != dynamicMessage.oneofCases[i]) {
                        this.fields.clearField(this.oneofCases[i]);
                        this.oneofCases[i] = dynamicMessage.oneofCases[i];
                    }
                    i++;
                }
            } else {
                return (Builder) super.mergeFrom(message);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public DynamicMessage build() {
            if (!isInitialized()) {
                Descriptors.Descriptor descriptor = this.type;
                FieldSet fieldSet = this.fields;
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.oneofCases;
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) new DynamicMessage(descriptor, fieldSet, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.unknownFields));
            }
            return buildPartial();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public DynamicMessage buildPartial() {
            if (this.type.getOptions().getMapEntry()) {
                for (Descriptors.FieldDescriptor fieldDescriptor : this.type.getFields()) {
                    if (fieldDescriptor.isOptional() && !this.fields.hasField(fieldDescriptor)) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.fields.setField(fieldDescriptor, DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType()));
                        } else {
                            this.fields.setField(fieldDescriptor, fieldDescriptor.getDefaultValue());
                        }
                    }
                }
            }
            this.fields.makeImmutable();
            Descriptors.Descriptor descriptor = this.type;
            FieldSet fieldSet = this.fields;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.oneofCases;
            return new DynamicMessage(descriptor, fieldSet, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.unknownFields);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* renamed from: clone */
        public Builder mo3223clone() {
            Builder builder = new Builder(this.type);
            builder.fields.mergeFrom(this.fields);
            builder.mergeUnknownFields(this.unknownFields);
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.oneofCases;
            System.arraycopy(fieldDescriptorArr, 0, builder.oneofCases, 0, fieldDescriptorArr.length);
            return builder;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return DynamicMessage.isInitialized(this.type, this.fields);
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return this.type;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public DynamicMessage mo3244getDefaultInstanceForType() {
            return DynamicMessage.getDefaultInstance(this.type);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            return this.fields.getAllFields();
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
            }
            return new Builder(fieldDescriptor.getMessageType());
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            verifyOneofContainingType(oneofDescriptor);
            return this.oneofCases[oneofDescriptor.getIndex()] != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            verifyOneofContainingType(oneofDescriptor);
            return this.oneofCases[oneofDescriptor.getIndex()];
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            verifyOneofContainingType(oneofDescriptor);
            Descriptors.FieldDescriptor fieldDescriptor = this.oneofCases[oneofDescriptor.getIndex()];
            if (fieldDescriptor != null) {
                clearField(fieldDescriptor);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            return this.fields.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            Object field = this.fields.getField(fieldDescriptor);
            if (field != null) {
                return field;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.emptyList();
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
            }
            return fieldDescriptor.getDefaultValue();
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            verifyContainingType(fieldDescriptor);
            ensureIsMutable();
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                ensureEnumValueDescriptor(fieldDescriptor, obj);
            }
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                Descriptors.FieldDescriptor fieldDescriptor2 = this.oneofCases[index];
                if (fieldDescriptor2 != null && fieldDescriptor2 != fieldDescriptor) {
                    this.fields.clearField(fieldDescriptor2);
                }
                this.oneofCases[index] = fieldDescriptor;
            } else if (fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && !fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE && obj.equals(fieldDescriptor.getDefaultValue())) {
                this.fields.clearField(fieldDescriptor);
                return this;
            }
            this.fields.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            ensureIsMutable();
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.oneofCases;
                if (fieldDescriptorArr[index] == fieldDescriptor) {
                    fieldDescriptorArr[index] = null;
                }
            }
            this.fields.clearField(fieldDescriptor);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            return this.fields.getRepeatedFieldCount(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            verifyContainingType(fieldDescriptor);
            return this.fields.getRepeatedField(fieldDescriptor, i);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            verifyContainingType(fieldDescriptor);
            ensureIsMutable();
            this.fields.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            verifyContainingType(fieldDescriptor);
            ensureIsMutable();
            this.fields.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            this.unknownFields = unknownFieldSet;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            this.unknownFields = UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(unknownFieldSet).build();
            return this;
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.type) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void verifyOneofContainingType(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() != this.type) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
        }

        private void ensureSingularEnumValueDescriptor(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            Internal.checkNotNull(obj);
            if (!(obj instanceof Descriptors.EnumValueDescriptor)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void ensureEnumValueDescriptor(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (fieldDescriptor.isRepeated()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ensureSingularEnumValueDescriptor(fieldDescriptor, it.next());
                }
                return;
            }
            ensureSingularEnumValueDescriptor(fieldDescriptor, obj);
        }

        private void ensureIsMutable() {
            if (this.fields.isImmutable()) {
                this.fields = this.fields.m3243clone();
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
        }
    }
}
