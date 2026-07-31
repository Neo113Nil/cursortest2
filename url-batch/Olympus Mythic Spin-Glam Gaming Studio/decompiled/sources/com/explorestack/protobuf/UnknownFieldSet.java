package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public final class UnknownFieldSet implements MessageLite {
    private final Map fields;
    private final Map fieldsDescending;
    private static final UnknownFieldSet defaultInstance = new UnknownFieldSet(Collections.emptyMap(), Collections.emptyMap());
    private static final Parser PARSER = new Parser();

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return true;
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(UnknownFieldSet unknownFieldSet) {
        return newBuilder().mergeFrom(unknownFieldSet);
    }

    public static UnknownFieldSet getDefaultInstance() {
        return defaultInstance;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    public UnknownFieldSet mo3244getDefaultInstanceForType() {
        return defaultInstance;
    }

    UnknownFieldSet(Map map, Map map2) {
        this.fields = map;
        this.fieldsDescending = map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnknownFieldSet) && this.fields.equals(((UnknownFieldSet) obj).fields);
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public Map asMap() {
        return this.fields;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (Map.Entry entry : this.fields.entrySet()) {
            ((Field) entry.getValue()).writeTo(((Integer) entry.getKey()).intValue(), codedOutputStream);
        }
    }

    public String toString() {
        return TextFormat.printer().printToString(this);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) {
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream);
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) {
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream);
        newInstance.writeRawVarint32(getSerializedSize());
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = 0;
        for (Map.Entry entry : this.fields.entrySet()) {
            i += ((Field) entry.getValue()).getSerializedSize(((Integer) entry.getKey()).intValue());
        }
        return i;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        for (Map.Entry entry : this.fields.entrySet()) {
            ((Field) entry.getValue()).writeAsMessageSetExtensionTo(((Integer) entry.getKey()).intValue(), codedOutputStream);
        }
    }

    public int getSerializedSizeAsMessageSet() {
        int i = 0;
        for (Map.Entry entry : this.fields.entrySet()) {
            i += ((Field) entry.getValue()).getSerializedSizeAsMessageSetExtension(((Integer) entry.getKey()).intValue());
        }
        return i;
    }

    public static UnknownFieldSet parseFrom(ByteString byteString) {
        return newBuilder().mergeFrom(byteString).build();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return newBuilder().mergeFrom(this);
    }

    public static final class Builder implements MessageLite.Builder {
        private Map fields;
        private Field.Builder lastField;
        private int lastFieldNumber;

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return true;
        }

        private Builder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Builder create() {
            Builder builder = new Builder();
            builder.reinitialize();
            return builder;
        }

        private Field.Builder getFieldBuilder(int i) {
            Field.Builder builder = this.lastField;
            if (builder != null) {
                int i2 = this.lastFieldNumber;
                if (i == i2) {
                    return builder;
                }
                addField(i2, builder.build());
            }
            if (i == 0) {
                return null;
            }
            Field field = (Field) this.fields.get(Integer.valueOf(i));
            this.lastFieldNumber = i;
            Field.Builder newBuilder = Field.newBuilder();
            this.lastField = newBuilder;
            if (field != null) {
                newBuilder.mergeFrom(field);
            }
            return this.lastField;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public UnknownFieldSet build() {
            UnknownFieldSet unknownFieldSet;
            getFieldBuilder(0);
            if (this.fields.isEmpty()) {
                unknownFieldSet = UnknownFieldSet.getDefaultInstance();
            } else {
                unknownFieldSet = new UnknownFieldSet(Collections.unmodifiableMap(this.fields), Collections.unmodifiableMap(((TreeMap) this.fields).descendingMap()));
            }
            this.fields = null;
            return unknownFieldSet;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public UnknownFieldSet buildPartial() {
            return build();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder m3246clone() {
            getFieldBuilder(0);
            return UnknownFieldSet.newBuilder().mergeFrom(new UnknownFieldSet(this.fields, Collections.unmodifiableMap(((TreeMap) this.fields).descendingMap())));
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public UnknownFieldSet mo3244getDefaultInstanceForType() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private void reinitialize() {
            this.fields = Collections.emptyMap();
            this.lastFieldNumber = 0;
            this.lastField = null;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            reinitialize();
            return this;
        }

        public Builder mergeFrom(UnknownFieldSet unknownFieldSet) {
            if (unknownFieldSet != UnknownFieldSet.getDefaultInstance()) {
                for (Map.Entry entry : unknownFieldSet.fields.entrySet()) {
                    mergeField(((Integer) entry.getKey()).intValue(), (Field) entry.getValue());
                }
            }
            return this;
        }

        public Builder mergeField(int i, Field field) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (hasField(i)) {
                getFieldBuilder(i).mergeFrom(field);
            } else {
                addField(i, field);
            }
            return this;
        }

        public Builder mergeVarintField(int i, int i2) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            getFieldBuilder(i).addVarint(i2);
            return this;
        }

        public boolean hasField(int i) {
            if (i != 0) {
                return i == this.lastFieldNumber || this.fields.containsKey(Integer.valueOf(i));
            }
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }

        public Builder addField(int i, Field field) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.lastField != null && this.lastFieldNumber == i) {
                this.lastField = null;
                this.lastFieldNumber = 0;
            }
            if (this.fields.isEmpty()) {
                this.fields = new TreeMap();
            }
            this.fields.put(Integer.valueOf(i), field);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream) {
            int readTag;
            do {
                readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
            } while (mergeFieldFrom(readTag, codedInputStream));
            return this;
        }

        public boolean mergeFieldFrom(int i, CodedInputStream codedInputStream) {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                getFieldBuilder(tagFieldNumber).addVarint(codedInputStream.readInt64());
                return true;
            }
            if (tagWireType == 1) {
                getFieldBuilder(tagFieldNumber).addFixed64(codedInputStream.readFixed64());
                return true;
            }
            if (tagWireType == 2) {
                getFieldBuilder(tagFieldNumber).addLengthDelimited(codedInputStream.readBytes());
                return true;
            }
            if (tagWireType == 3) {
                Builder newBuilder = UnknownFieldSet.newBuilder();
                codedInputStream.readGroup(tagFieldNumber, newBuilder, ExtensionRegistry.getEmptyRegistry());
                getFieldBuilder(tagFieldNumber).addGroup(newBuilder.build());
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                getFieldBuilder(tagFieldNumber).addFixed32(codedInputStream.readFixed32());
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(ByteString byteString) {
            try {
                CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr) {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(InputStream inputStream) {
            CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new AbstractMessageLite.Builder.LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeDelimitedFrom(inputStream);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(codedInputStream);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr, int i, int i2) {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(bArr);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(bArr, i, i2);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mergeFrom(inputStream);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder
        public Builder mergeFrom(MessageLite messageLite) {
            if (messageLite instanceof UnknownFieldSet) {
                return mergeFrom((UnknownFieldSet) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static final class Field {
        private static final Field fieldDefaultInstance = newBuilder().build();
        private List fixed32;
        private List fixed64;
        private List group;
        private List lengthDelimited;
        private List varint;

        private Field() {
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public List getVarintList() {
            return this.varint;
        }

        public List getFixed32List() {
            return this.fixed32;
        }

        public List getFixed64List() {
            return this.fixed64;
        }

        public List getLengthDelimitedList() {
            return this.lengthDelimited;
        }

        public List getGroupList() {
            return this.group;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Field) {
                return Arrays.equals(getIdentityArray(), ((Field) obj).getIdentityArray());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(getIdentityArray());
        }

        private Object[] getIdentityArray() {
            return new Object[]{this.varint, this.fixed32, this.fixed64, this.lengthDelimited, this.group};
        }

        public void writeTo(int i, CodedOutputStream codedOutputStream) {
            Iterator it = this.varint.iterator();
            while (it.hasNext()) {
                codedOutputStream.writeUInt64(i, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.fixed32.iterator();
            while (it2.hasNext()) {
                codedOutputStream.writeFixed32(i, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.fixed64.iterator();
            while (it3.hasNext()) {
                codedOutputStream.writeFixed64(i, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.lengthDelimited.iterator();
            while (it4.hasNext()) {
                codedOutputStream.writeBytes(i, (ByteString) it4.next());
            }
            Iterator it5 = this.group.iterator();
            while (it5.hasNext()) {
                codedOutputStream.writeGroup(i, (UnknownFieldSet) it5.next());
            }
        }

        public int getSerializedSize(int i) {
            Iterator it = this.varint.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += CodedOutputStream.computeUInt64Size(i, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.fixed32.iterator();
            while (it2.hasNext()) {
                i2 += CodedOutputStream.computeFixed32Size(i, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.fixed64.iterator();
            while (it3.hasNext()) {
                i2 += CodedOutputStream.computeFixed64Size(i, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.lengthDelimited.iterator();
            while (it4.hasNext()) {
                i2 += CodedOutputStream.computeBytesSize(i, (ByteString) it4.next());
            }
            Iterator it5 = this.group.iterator();
            while (it5.hasNext()) {
                i2 += CodedOutputStream.computeGroupSize(i, (UnknownFieldSet) it5.next());
            }
            return i2;
        }

        public void writeAsMessageSetExtensionTo(int i, CodedOutputStream codedOutputStream) {
            Iterator it = this.lengthDelimited.iterator();
            while (it.hasNext()) {
                codedOutputStream.writeRawMessageSetExtension(i, (ByteString) it.next());
            }
        }

        public int getSerializedSizeAsMessageSetExtension(int i) {
            Iterator it = this.lengthDelimited.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += CodedOutputStream.computeRawMessageSetExtensionSize(i, (ByteString) it.next());
            }
            return i2;
        }

        public static final class Builder {
            private Field result;

            private Builder() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                Builder builder = new Builder();
                builder.result = new Field();
                return builder;
            }

            public Field build() {
                if (this.result.varint == null) {
                    this.result.varint = Collections.emptyList();
                } else {
                    Field field = this.result;
                    field.varint = Collections.unmodifiableList(field.varint);
                }
                if (this.result.fixed32 == null) {
                    this.result.fixed32 = Collections.emptyList();
                } else {
                    Field field2 = this.result;
                    field2.fixed32 = Collections.unmodifiableList(field2.fixed32);
                }
                if (this.result.fixed64 == null) {
                    this.result.fixed64 = Collections.emptyList();
                } else {
                    Field field3 = this.result;
                    field3.fixed64 = Collections.unmodifiableList(field3.fixed64);
                }
                if (this.result.lengthDelimited == null) {
                    this.result.lengthDelimited = Collections.emptyList();
                } else {
                    Field field4 = this.result;
                    field4.lengthDelimited = Collections.unmodifiableList(field4.lengthDelimited);
                }
                if (this.result.group == null) {
                    this.result.group = Collections.emptyList();
                } else {
                    Field field5 = this.result;
                    field5.group = Collections.unmodifiableList(field5.group);
                }
                Field field6 = this.result;
                this.result = null;
                return field6;
            }

            public Builder mergeFrom(Field field) {
                if (!field.varint.isEmpty()) {
                    if (this.result.varint == null) {
                        this.result.varint = new ArrayList();
                    }
                    this.result.varint.addAll(field.varint);
                }
                if (!field.fixed32.isEmpty()) {
                    if (this.result.fixed32 == null) {
                        this.result.fixed32 = new ArrayList();
                    }
                    this.result.fixed32.addAll(field.fixed32);
                }
                if (!field.fixed64.isEmpty()) {
                    if (this.result.fixed64 == null) {
                        this.result.fixed64 = new ArrayList();
                    }
                    this.result.fixed64.addAll(field.fixed64);
                }
                if (!field.lengthDelimited.isEmpty()) {
                    if (this.result.lengthDelimited == null) {
                        this.result.lengthDelimited = new ArrayList();
                    }
                    this.result.lengthDelimited.addAll(field.lengthDelimited);
                }
                if (!field.group.isEmpty()) {
                    if (this.result.group == null) {
                        this.result.group = new ArrayList();
                    }
                    this.result.group.addAll(field.group);
                }
                return this;
            }

            public Builder addVarint(long j) {
                if (this.result.varint == null) {
                    this.result.varint = new ArrayList();
                }
                this.result.varint.add(Long.valueOf(j));
                return this;
            }

            public Builder addFixed32(int i) {
                if (this.result.fixed32 == null) {
                    this.result.fixed32 = new ArrayList();
                }
                this.result.fixed32.add(Integer.valueOf(i));
                return this;
            }

            public Builder addFixed64(long j) {
                if (this.result.fixed64 == null) {
                    this.result.fixed64 = new ArrayList();
                }
                this.result.fixed64.add(Long.valueOf(j));
                return this;
            }

            public Builder addLengthDelimited(ByteString byteString) {
                if (this.result.lengthDelimited == null) {
                    this.result.lengthDelimited = new ArrayList();
                }
                this.result.lengthDelimited.add(byteString);
                return this;
            }

            public Builder addGroup(UnknownFieldSet unknownFieldSet) {
                if (this.result.group == null) {
                    this.result.group = new ArrayList();
                }
                this.result.group.add(unknownFieldSet);
                return this;
            }
        }
    }

    public static final class Parser extends AbstractParser {
        @Override // com.explorestack.protobuf.Parser
        public UnknownFieldSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Builder newBuilder = UnknownFieldSet.newBuilder();
            try {
                newBuilder.mergeFrom(codedInputStream);
                return newBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(newBuilder.buildPartial());
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(newBuilder.buildPartial());
            }
        }
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final Parser getParserForType() {
        return PARSER;
    }
}
