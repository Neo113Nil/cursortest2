package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.DynamicMessage;
import com.explorestack.protobuf.FieldSet;
import com.explorestack.protobuf.GeneratedMessageLite;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.LazyField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageReflection;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import com.safedk.android.analytics.brandsafety.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public abstract class GeneratedMessageV3 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected UnknownFieldSet unknownFields;

    /* JADX INFO: Access modifiers changed from: protected */
    public interface BuilderParent extends AbstractMessage.BuilderParent {
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    public abstract /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    protected abstract FieldAccessorTable internalGetFieldAccessorTable();

    protected void makeExtensionsImmutable() {
    }

    protected abstract Message.Builder newBuilderForType(BuilderParent builderParent);

    static /* synthetic */ Extension access$500(ExtensionLite extensionLite) {
        checkNotLite(extensionLite);
        return null;
    }

    protected GeneratedMessageV3() {
        this.unknownFields = UnknownFieldSet.getDefaultInstance();
    }

    protected GeneratedMessageV3(Builder builder) {
        this.unknownFields = builder.getUnknownFields();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().descriptor;
    }

    protected void mergeFromAndMakeImmutableInternal(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Schema schemaFor = Protobuf.getInstance().schemaFor(this);
        try {
            schemaFor.mergeFrom(this, CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaFor.makeImmutable(this);
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
        int i = 0;
        while (i < fields.size()) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                i += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    fieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    if (!z && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        treeMap.put(fieldDescriptor, getFieldRaw(fieldDescriptor));
                    } else {
                        treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                    }
                    i++;
                } else {
                    i++;
                }
            } else {
                if (fieldDescriptor.isRepeated()) {
                    List list = (List) getField(fieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(fieldDescriptor, list);
                    }
                } else {
                    if (!hasField(fieldDescriptor)) {
                    }
                    if (!z) {
                    }
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
                i++;
            }
        }
        return treeMap;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it = ((List) getField(fieldDescriptor)).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).has(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).get(this);
    }

    Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRaw(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedCount(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeated(this, i);
    }

    public UnknownFieldSet getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean parseUnknownField(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        if (codedInputStream.shouldDiscardUnknownFields()) {
            return codedInputStream.skipField(i);
        }
        return builder.mergeFieldFrom(i, codedInputStream);
    }

    protected boolean parseUnknownFieldProto3(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return parseUnknownField(codedInputStream, builder, extensionRegistryLite, i);
    }

    protected static <M extends Message> M parseWithIOException(Parser parser, InputStream inputStream) throws IOException {
        try {
            return (M) parser.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(Parser parser, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return (M) parser.parseFrom(inputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(Parser parser, CodedInputStream codedInputStream) throws IOException {
        try {
            return (M) parser.parseFrom(codedInputStream);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(Parser parser, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return (M) parser.parseFrom(codedInputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseDelimitedWithIOException(Parser parser, InputStream inputStream) throws IOException {
        try {
            return (M) parser.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseDelimitedWithIOException(Parser parser, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return (M) parser.parseDelimitedFrom(inputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    protected static boolean canUseUnsafe() {
        return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Internal.IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    protected static Internal.IntList newIntList() {
        return new IntArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    protected static Internal.LongList newLongList() {
        return new LongArrayList();
    }

    protected static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    protected static Internal.FloatList newFloatList() {
        return new FloatArrayList();
    }

    protected static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    protected static Internal.DoubleList newDoubleList() {
        return new DoubleArrayList();
    }

    protected static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    protected static Internal.BooleanList newBooleanList() {
        return new BooleanArrayList();
    }

    protected static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        MessageReflection.writeMessageTo(this, getAllFieldsRaw(), codedOutputStream, false);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = MessageReflection.getSerializedSize(this, getAllFieldsRaw());
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final class UnusedPrivateParameter {
        static final UnusedPrivateParameter INSTANCE = new UnusedPrivateParameter();

        private UnusedPrivateParameter() {
        }
    }

    protected Object newInstance(UnusedPrivateParameter unusedPrivateParameter) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage
    protected Message.Builder newBuilderForType(final AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType(new BuilderParent() { // from class: com.explorestack.protobuf.GeneratedMessageV3.1
            @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                builderParent.markDirty();
            }
        });
    }

    public static abstract class Builder extends AbstractMessage.Builder {
        private BuilderParent builderParent;
        private boolean isClean;
        private com.explorestack.protobuf.GeneratedMessageV3$Builder.BuilderParentImpl meAsParent;
        private UnknownFieldSet unknownFields;

        public abstract Descriptors.Descriptor getDescriptorForType();

        protected abstract FieldAccessorTable internalGetFieldAccessorTable();

        protected Builder() {
            this(null);
        }

        protected Builder(BuilderParent builderParent) {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            this.builderParent = builderParent;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        void dispose() {
            this.builderParent = null;
        }

        protected void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        protected void markClean() {
            this.isClean = true;
        }

        protected boolean isClean() {
            return this.isClean;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* renamed from: clone */
        public Builder mo3223clone() {
            Builder builder = (Builder) getDefaultInstanceForType().newBuilderForType();
            builder.mergeFrom(buildPartial());
            return builder;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
            int i = 0;
            while (i < fields.size()) {
                Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
                Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    i += containingOneof.getFieldCount() - 1;
                    if (hasOneof(containingOneof)) {
                        fieldDescriptor = getOneofFieldDescriptor(containingOneof);
                        treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                        i++;
                    } else {
                        i++;
                    }
                } else {
                    if (fieldDescriptor.isRepeated()) {
                        List list = (List) getField(fieldDescriptor);
                        if (!list.isEmpty()) {
                            treeMap.put(fieldDescriptor, list);
                        }
                    } else {
                        if (!hasField(fieldDescriptor)) {
                        }
                        treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                    }
                    i++;
                }
            }
            return treeMap;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).newBuilder();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getBuilder(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedBuilder(this, i);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get(this);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).has(this);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object obj = internalGetFieldAccessorTable().getField(fieldDescriptor).get(this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) obj) : obj;
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).set(this, obj);
            return this;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).clear(this);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            internalGetFieldAccessorTable().getOneof(oneofDescriptor).clear(this);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedCount(this);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeated(this, i);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).setRepeated(this, i, obj);
            return this;
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).addRepeated(this, obj);
            return this;
        }

        private Builder setUnknownFieldsInternal(UnknownFieldSet unknownFieldSet) {
            this.unknownFields = unknownFieldSet;
            onChanged();
            return this;
        }

        public Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return setUnknownFieldsInternal(unknownFieldSet);
        }

        protected Builder setUnknownFieldsProto3(UnknownFieldSet unknownFieldSet) {
            return setUnknownFieldsInternal(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return setUnknownFields(UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(unknownFieldSet).build());
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private class BuilderParentImpl implements BuilderParent {
            private BuilderParentImpl() {
            }

            @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                Builder.this.onChanged();
            }
        }

        protected BuilderParent getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new BuilderParentImpl();
            }
            return this.meAsParent;
        }

        protected final void onChanged() {
            BuilderParent builderParent;
            if (!this.isClean || (builderParent = this.builderParent) == null) {
                return;
            }
            builderParent.markDirty();
            this.isClean = false;
        }

        protected MapField internalGetMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected MapField internalGetMutableMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage> extends GeneratedMessageV3 implements MessageOrBuilder {
        private static final long serialVersionUID = 1;
        private final FieldSet extensions;

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public abstract /* synthetic */ Message mo3244getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public abstract /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

        protected ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        protected ExtendableMessage(ExtendableBuilder extendableBuilder) {
            super(extendableBuilder);
            this.extensions = extendableBuilder.buildExtensions();
        }

        private void verifyExtensionContainingType(Extension extension) {
            throw null;
        }

        public final <Type> boolean hasExtension(ExtensionLite extensionLite) {
            GeneratedMessageV3.access$500(extensionLite);
            verifyExtensionContainingType(null);
            throw null;
        }

        public final <Type> int getExtensionCount(ExtensionLite extensionLite) {
            GeneratedMessageV3.access$500(extensionLite);
            verifyExtensionContainingType(null);
            throw null;
        }

        public final <Type> Type getExtension(ExtensionLite extensionLite) {
            GeneratedMessageV3.access$500(extensionLite);
            verifyExtensionContainingType(null);
            throw null;
        }

        public final <Type> Type getExtension(ExtensionLite extensionLite, int i) {
            GeneratedMessageV3.access$500(extensionLite);
            verifyExtensionContainingType(null);
            throw null;
        }

        public final <Type> boolean hasExtension(Extension extension) {
            return hasExtension((ExtensionLite) extension);
        }

        public final <Type> boolean hasExtension(GeneratedMessage$GeneratedExtension generatedMessage$GeneratedExtension) {
            return hasExtension((ExtensionLite) generatedMessage$GeneratedExtension);
        }

        public final <Type> int getExtensionCount(Extension extension) {
            return getExtensionCount((ExtensionLite) extension);
        }

        public final <Type> int getExtensionCount(GeneratedMessage$GeneratedExtension generatedMessage$GeneratedExtension) {
            return getExtensionCount((ExtensionLite) generatedMessage$GeneratedExtension);
        }

        public final <Type> Type getExtension(Extension extension) {
            return (Type) getExtension((ExtensionLite) extension);
        }

        public final <Type> Type getExtension(GeneratedMessage$GeneratedExtension generatedMessage$GeneratedExtension) {
            return (Type) getExtension((ExtensionLite) generatedMessage$GeneratedExtension);
        }

        public final <Type> Type getExtension(Extension extension, int i) {
            return (Type) getExtension((ExtensionLite) extension, i);
        }

        public final <Type> Type getExtension(GeneratedMessage$GeneratedExtension generatedMessage$GeneratedExtension, int i) {
            return (Type) getExtension((ExtensionLite) generatedMessage$GeneratedExtension, i);
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected boolean parseUnknownField(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            if (codedInputStream.shouldDiscardUnknownFields()) {
                builder = null;
            }
            return MessageReflection.mergeFieldFrom(codedInputStream, builder, extensionRegistryLite, getDescriptorForType(), new MessageReflection.ExtensionAdapter(this.extensions), i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected boolean parseUnknownFieldProto3(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return parseUnknownField(codedInputStream, builder, extensionRegistryLite, i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        protected class ExtensionWriter {
            private final Iterator iter;
            private final boolean messageSetWireFormat;
            private Map.Entry next;

            private ExtensionWriter(boolean z) {
                Iterator it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (Map.Entry) it.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.next;
                    if (entry == null || ((Descriptors.FieldDescriptor) entry.getKey()).getNumber() >= i) {
                        return;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) this.next.getKey();
                    if (this.messageSetWireFormat && fieldDescriptor.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptor.isRepeated()) {
                        if (this.next instanceof LazyField.LazyEntry) {
                            codedOutputStream.writeRawMessageSetExtension(fieldDescriptor.getNumber(), ((LazyField.LazyEntry) this.next).getField().toByteString());
                        } else {
                            codedOutputStream.writeMessageSetExtension(fieldDescriptor.getNumber(), (Message) this.next.getValue());
                        }
                    } else {
                        FieldSet.writeField(fieldDescriptor, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = (Map.Entry) this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        protected ExtendableMessage<MessageType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(true);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        protected Map<Descriptors.FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.getAllFields();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                return this.extensions.hasField(fieldDescriptor);
            }
            return super.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                Object field = this.extensions.getField(fieldDescriptor);
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
            return super.getField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                return this.extensions.getRepeatedFieldCount(fieldDescriptor);
            }
            return super.getRepeatedFieldCount(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                return this.extensions.getRepeatedField(fieldDescriptor, i);
            }
            return super.getRepeatedField(fieldDescriptor, i);
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    public static abstract class ExtendableBuilder extends Builder implements MessageOrBuilder {
        private FieldSet.Builder extensions;

        protected ExtendableBuilder() {
        }

        protected ExtendableBuilder(BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ExtendableBuilder clear() {
            this.extensions = null;
            return (ExtendableBuilder) super.clear();
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                this.extensions = FieldSet.newBuilder();
            }
        }

        protected boolean extensionsAreInitialized() {
            FieldSet.Builder builder = this.extensions;
            if (builder == null) {
                return true;
            }
            return builder.isInitialized();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldSet buildExtensions() {
            FieldSet.Builder builder = this.extensions;
            if (builder == null) {
                return FieldSet.emptySet();
            }
            return builder.build();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            FieldSet.Builder builder = this.extensions;
            if (builder != null) {
                allFieldsMutable.putAll(builder.getAllFields());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                FieldSet.Builder builder = this.extensions;
                Object field = builder == null ? null : builder.getField(fieldDescriptor);
                if (field != null) {
                    return field;
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
                }
                return fieldDescriptor.getDefaultValue();
            }
            return super.getField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
                }
                ensureExtensionsIsMutable();
                Object fieldAllowBuilders = this.extensions.getFieldAllowBuilders(fieldDescriptor);
                if (fieldAllowBuilders == null) {
                    DynamicMessage.Builder newBuilder = DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
                    this.extensions.setField(fieldDescriptor, newBuilder);
                    onChanged();
                    return newBuilder;
                }
                if (fieldAllowBuilders instanceof Message.Builder) {
                    return (Message.Builder) fieldAllowBuilders;
                }
                if (fieldAllowBuilders instanceof Message) {
                    Message.Builder builder = ((Message) fieldAllowBuilders).toBuilder();
                    this.extensions.setField(fieldDescriptor, builder);
                    onChanged();
                    return builder;
                }
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            return super.getFieldBuilder(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                FieldSet.Builder builder = this.extensions;
                if (builder == null) {
                    return 0;
                }
                return builder.getRepeatedFieldCount(fieldDescriptor);
            }
            return super.getRepeatedFieldCount(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                FieldSet.Builder builder = this.extensions;
                if (builder == null) {
                    throw new IndexOutOfBoundsException();
                }
                return builder.getRepeatedField(fieldDescriptor, i);
            }
            return super.getRepeatedField(fieldDescriptor, i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                }
                Object repeatedFieldAllowBuilders = this.extensions.getRepeatedFieldAllowBuilders(fieldDescriptor, i);
                if (repeatedFieldAllowBuilders instanceof Message.Builder) {
                    return (Message.Builder) repeatedFieldAllowBuilders;
                }
                if (repeatedFieldAllowBuilders instanceof Message) {
                    Message.Builder builder = ((Message) repeatedFieldAllowBuilders).toBuilder();
                    this.extensions.setRepeatedField(fieldDescriptor, i, builder);
                    onChanged();
                    return builder;
                }
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            return super.getRepeatedFieldBuilder(fieldDescriptor, i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                FieldSet.Builder builder = this.extensions;
                if (builder == null) {
                    return false;
                }
                return builder.hasField(fieldDescriptor);
            }
            return super.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public ExtendableBuilder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                this.extensions.setField(fieldDescriptor, obj);
                onChanged();
                return this;
            }
            return (ExtendableBuilder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public ExtendableBuilder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                this.extensions.clearField(fieldDescriptor);
                onChanged();
                return this;
            }
            return (ExtendableBuilder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                this.extensions.setRepeatedField(fieldDescriptor, i, obj);
                onChanged();
                return this;
            }
            return (ExtendableBuilder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                this.extensions.addRepeatedField(fieldDescriptor, obj);
                onChanged();
                return this;
            }
            return (ExtendableBuilder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                return DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
            }
            return super.newBuilderForField(fieldDescriptor);
        }

        protected final void mergeExtensionFields(ExtendableMessage extendableMessage) {
            if (extendableMessage.extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.mergeFrom(extendableMessage.extensions);
                onChanged();
            }
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected MapField internalGetMapField(int i) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    public static final class FieldAccessorTable {
        private String[] camelCaseNames;
        private final Descriptors.Descriptor descriptor;
        private final FieldAccessor[] fields;
        private volatile boolean initialized = false;
        private final OneofAccessor[] oneofs;

        private interface FieldAccessor {
            void addRepeated(Builder builder, Object obj);

            void clear(Builder builder);

            Object get(Builder builder);

            Object get(GeneratedMessageV3 generatedMessageV3);

            Message.Builder getBuilder(Builder builder);

            Object getRaw(GeneratedMessageV3 generatedMessageV3);

            Object getRepeated(Builder builder, int i);

            Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i);

            Message.Builder getRepeatedBuilder(Builder builder, int i);

            int getRepeatedCount(Builder builder);

            int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);

            boolean has(Builder builder);

            boolean has(GeneratedMessageV3 generatedMessageV3);

            Message.Builder newBuilder();

            void set(Builder builder, Object obj);

            void setRepeated(Builder builder, int i, Object obj);
        }

        public FieldAccessorTable(Descriptors.Descriptor descriptor, String[] strArr) {
            this.descriptor = descriptor;
            this.camelCaseNames = strArr;
            this.fields = new FieldAccessor[descriptor.getFields().size()];
            this.oneofs = new OneofAccessor[descriptor.getOneofs().size()];
        }

        public FieldAccessorTable ensureFieldAccessorsInitialized(Class cls, Class cls2) {
            if (this.initialized) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.initialized) {
                        return this;
                    }
                    int length = this.fields.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Descriptors.FieldDescriptor fieldDescriptor = this.descriptor.getFields().get(i);
                        String str = fieldDescriptor.getContainingOneof() != null ? this.camelCaseNames[fieldDescriptor.getContainingOneof().getIndex() + length] : null;
                        if (fieldDescriptor.isRepeated()) {
                            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                                if (fieldDescriptor.isMapField()) {
                                    this.fields[i] = new MapFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                                } else {
                                    this.fields[i] = new RepeatedMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                                }
                            } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                                this.fields[i] = new RepeatedEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                            } else {
                                this.fields[i] = new RepeatedFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.fields[i] = new SingularMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str);
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.fields[i] = new SingularEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str);
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                            this.fields[i] = new SingularStringFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str);
                        } else {
                            this.fields[i] = new SingularFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str);
                        }
                        i++;
                    }
                    int length2 = this.oneofs.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        this.oneofs[i2] = new OneofAccessor(this.descriptor, i2, this.camelCaseNames[i2 + length], cls, cls2);
                    }
                    this.initialized = true;
                    this.camelCaseNames = null;
                    return this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldAccessor getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fieldDescriptor.isExtension()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.fields[fieldDescriptor.getIndex()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OneofAccessor getOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
            return this.oneofs[oneofDescriptor.getIndex()];
        }

        private static class OneofAccessor {
            private final Method caseMethod;
            private final Method caseMethodBuilder;
            private final Method clearMethod;
            private final Descriptors.Descriptor descriptor;
            private final Descriptors.FieldDescriptor fieldDescriptor;

            OneofAccessor(Descriptors.Descriptor descriptor, int i, String str, Class cls, Class cls2) {
                this.descriptor = descriptor;
                Descriptors.OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(i);
                if (oneofDescriptor.isSynthetic()) {
                    this.caseMethod = null;
                    this.caseMethodBuilder = null;
                    this.fieldDescriptor = oneofDescriptor.getFields().get(0);
                } else {
                    this.caseMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Case", new Class[0]);
                    this.caseMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Case", new Class[0]);
                    this.fieldDescriptor = null;
                }
                this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, "clear" + str, new Class[0]);
            }

            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                Descriptors.FieldDescriptor fieldDescriptor = this.fieldDescriptor;
                if (fieldDescriptor != null) {
                    return generatedMessageV3.hasField(fieldDescriptor);
                }
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber() != 0;
            }

            public boolean has(Builder builder) {
                Descriptors.FieldDescriptor fieldDescriptor = this.fieldDescriptor;
                if (fieldDescriptor != null) {
                    return builder.hasField(fieldDescriptor);
                }
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber() != 0;
            }

            public Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3) {
                Descriptors.FieldDescriptor fieldDescriptor = this.fieldDescriptor;
                if (fieldDescriptor == null) {
                    int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                    if (number > 0) {
                        return this.descriptor.findFieldByNumber(number);
                    }
                    return null;
                }
                if (generatedMessageV3.hasField(fieldDescriptor)) {
                    return this.fieldDescriptor;
                }
                return null;
            }

            public Descriptors.FieldDescriptor get(Builder builder) {
                Descriptors.FieldDescriptor fieldDescriptor = this.fieldDescriptor;
                if (fieldDescriptor == null) {
                    int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                    if (number > 0) {
                        return this.descriptor.findFieldByNumber(number);
                    }
                    return null;
                }
                if (builder.hasField(fieldDescriptor)) {
                    return this.fieldDescriptor;
                }
                return null;
            }

            public void clear(Builder builder) {
                GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
            }
        }

        private static class SingularFieldAccessor implements FieldAccessor {
            protected final Descriptors.FieldDescriptor field;
            protected final boolean hasHasMethod;
            protected final MethodInvoker invoker;
            protected final boolean isOneofField;
            protected final Class type;

            private interface MethodInvoker {
                void clear(Builder builder);

                Object get(Builder builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                int getOneofFieldNumber(Builder builder);

                int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3);

                boolean has(Builder builder);

                boolean has(GeneratedMessageV3 generatedMessageV3);

                void set(Builder builder, Object obj);
            }

            static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            private static final class ReflectionInvoker implements MethodInvoker {
                protected final Method caseMethod;
                protected final Method caseMethodBuilder;
                protected final Method clearMethod;
                protected final Method getMethod;
                protected final Method getMethodBuilder;
                protected final Method hasMethod;
                protected final Method hasMethodBuilder;
                protected final Method setMethod;

                ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
                    Method method;
                    Method method2;
                    Method method3;
                    Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, "get" + str, new Class[0]);
                    this.getMethod = methodOrDie;
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str, new Class[0]);
                    this.setMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str, methodOrDie.getReturnType());
                    Method method4 = null;
                    if (z2) {
                        method = GeneratedMessageV3.getMethodOrDie(cls, "has" + str, new Class[0]);
                    } else {
                        method = null;
                    }
                    this.hasMethod = method;
                    if (z2) {
                        method2 = GeneratedMessageV3.getMethodOrDie(cls2, "has" + str, new Class[0]);
                    } else {
                        method2 = null;
                    }
                    this.hasMethodBuilder = method2;
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, "clear" + str, new Class[0]);
                    if (z) {
                        method3 = GeneratedMessageV3.getMethodOrDie(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        method3 = null;
                    }
                    this.caseMethod = method3;
                    if (z) {
                        method4 = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.caseMethodBuilder = method4;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public Object get(Builder builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public int getOneofFieldNumber(Builder builder) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public void set(Builder builder, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.setMethod, builder, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public boolean has(GeneratedMessageV3 generatedMessageV3) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethod, generatedMessageV3, new Object[0])).booleanValue();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public boolean has(Builder builder) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethodBuilder, builder, new Object[0])).booleanValue();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public void clear(Builder builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }
            }

            SingularFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                boolean z = (fieldDescriptor.getContainingOneof() == null || fieldDescriptor.getContainingOneof().isSynthetic()) ? false : true;
                this.isOneofField = z;
                boolean z2 = fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!z && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.hasHasMethod = z2;
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2, str2, z, z2);
                this.field = fieldDescriptor;
                this.type = reflectionInvoker.getMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder builder) {
                return this.invoker.get(builder);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder builder, Object obj) {
                this.invoker.set(builder, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder builder, int i, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder builder, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                if (!this.hasHasMethod) {
                    if (this.isOneofField) {
                        return this.invoker.getOneofFieldNumber(generatedMessageV3) == this.field.getNumber();
                    }
                    return !get(generatedMessageV3).equals(this.field.getDefaultValue());
                }
                return this.invoker.has(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder builder) {
                if (!this.hasHasMethod) {
                    if (this.isOneofField) {
                        return this.invoker.getOneofFieldNumber(builder) == this.field.getNumber();
                    }
                    return !get(builder).equals(this.field.getDefaultValue());
                }
                return this.invoker.has(builder);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(Builder builder) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void clear(Builder builder) {
                this.invoker.clear(builder);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
        }

        private static class RepeatedFieldAccessor implements FieldAccessor {
            protected final MethodInvoker invoker;
            protected final Class type;

            interface MethodInvoker {
                void addRepeated(Builder builder, Object obj);

                void clear(Builder builder);

                Object get(Builder builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                Object getRepeated(Builder builder, int i);

                Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i);

                int getRepeatedCount(Builder builder);

                int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);

                void setRepeated(Builder builder, int i, Object obj);
            }

            static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            private static final class ReflectionInvoker implements MethodInvoker {
                protected final Method addRepeatedMethod;
                protected final Method clearMethod;
                protected final Method getCountMethod;
                protected final Method getCountMethodBuilder;
                protected final Method getMethod;
                protected final Method getMethodBuilder;
                protected final Method getRepeatedMethod;
                protected final Method getRepeatedMethodBuilder;
                protected final Method setRepeatedMethod;

                ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "List", new Class[0]);
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    sb.append(str);
                    String sb2 = sb.toString();
                    Class cls3 = Integer.TYPE;
                    Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, sb2, cls3);
                    this.getRepeatedMethod = methodOrDie;
                    this.getRepeatedMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str, cls3);
                    Class<?> returnType = methodOrDie.getReturnType();
                    this.setRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str, cls3, returnType);
                    this.addRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, m.l + str, returnType);
                    this.getCountMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Count", new Class[0]);
                    this.getCountMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clear");
                    sb3.append(str);
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, sb3.toString(), new Class[0]);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object get(Builder builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethod, generatedMessageV3, Integer.valueOf(i));
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object getRepeated(Builder builder, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethodBuilder, builder, Integer.valueOf(i));
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void setRepeated(Builder builder, int i, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.setRepeatedMethod, builder, Integer.valueOf(i), obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void addRepeated(Builder builder, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedMethod, builder, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethod, generatedMessageV3, new Object[0])).intValue();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public int getRepeatedCount(Builder builder) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethodBuilder, builder, new Object[0])).intValue();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void clear(Builder builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }
            }

            RepeatedFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2);
                this.type = reflectionInvoker.getRepeatedMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder builder) {
                return this.invoker.get(builder);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder builder, Object obj) {
                clear(builder);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    addRepeated(builder, it.next());
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                return this.invoker.getRepeated(generatedMessageV3, i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder builder, int i) {
                return this.invoker.getRepeated(builder, i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder builder, int i, Object obj) {
                this.invoker.setRepeated(builder, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder builder, Object obj) {
                this.invoker.addRepeated(builder, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder builder) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.getRepeatedCount(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(Builder builder) {
                return this.invoker.getRepeatedCount(builder);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void clear(Builder builder) {
                this.invoker.clear(builder);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
        }

        private static class MapFieldAccessor implements FieldAccessor {
            private final Descriptors.FieldDescriptor field;
            private final Message mapEntryMessageDefaultInstance;

            MapFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                this.field = fieldDescriptor;
                this.mapEntryMessageDefaultInstance = getMapField((GeneratedMessageV3) GeneratedMessageV3.invokeOrDie(GeneratedMessageV3.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).getMapEntryMessageDefaultInstance();
            }

            private MapField getMapField(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.internalGetMapField(this.field.getNumber());
            }

            private MapField getMapField(Builder builder) {
                return builder.internalGetMapField(this.field.getNumber());
            }

            private MapField getMutableMapField(Builder builder) {
                return builder.internalGetMutableMapField(this.field.getNumber());
            }

            private Message coerceType(Message message) {
                if (message == null) {
                    return null;
                }
                return this.mapEntryMessageDefaultInstance.getClass().isInstance(message) ? message : this.mapEntryMessageDefaultInstance.toBuilder().mergeFrom(message).build();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < getRepeatedCount(generatedMessageV3); i++) {
                    arrayList.add(getRepeated(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder builder) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < getRepeatedCount(builder); i++) {
                    arrayList.add(getRepeated(builder, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder builder, Object obj) {
                clear(builder);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    addRepeated(builder, it.next());
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                return getMapField(generatedMessageV3).getList().get(i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder builder, int i) {
                return getMapField(builder).getList().get(i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder builder, int i, Object obj) {
                getMutableMapField(builder).getMutableList().set(i, coerceType((Message) obj));
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder builder, Object obj) {
                getMutableMapField(builder).getMutableList().add(coerceType((Message) obj));
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder builder) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return getMapField(generatedMessageV3).getList().size();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(Builder builder) {
                return getMapField(builder).getList().size();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void clear(Builder builder) {
                getMutableMapField(builder).getMutableList().clear();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return this.mapEntryMessageDefaultInstance.newBuilderForType();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder builder) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
        }

        private static final class SingularEnumFieldAccessor extends SingularFieldAccessor {
            private Descriptors.EnumDescriptor enumDescriptor;
            private Method getValueDescriptorMethod;
            private Method getValueMethod;
            private Method getValueMethodBuilder;
            private Method setValueMethod;
            private boolean supportUnknownEnumValue;
            private Method valueOfMethod;

            SingularEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.enumDescriptor = fieldDescriptor.m3242getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
                boolean supportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.supportUnknownEnumValue = supportsUnknownEnumValue;
                if (supportsUnknownEnumValue) {
                    this.getValueMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Value", new Class[0]);
                    this.getValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Value", new Class[0]);
                    this.setValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethod, generatedMessageV3, new Object[0])).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(generatedMessageV3), new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder builder) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethodBuilder, builder, new Object[0])).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(builder), new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.set(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }
        }

        private static final class RepeatedEnumFieldAccessor extends RepeatedFieldAccessor {
            private Method addRepeatedValueMethod;
            private Descriptors.EnumDescriptor enumDescriptor;
            private Method getRepeatedValueMethod;
            private Method getRepeatedValueMethodBuilder;
            private final Method getValueDescriptorMethod;
            private Method setRepeatedValueMethod;
            private boolean supportUnknownEnumValue;
            private final Method valueOfMethod;

            RepeatedEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.enumDescriptor = fieldDescriptor.m3242getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
                boolean supportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.supportUnknownEnumValue = supportsUnknownEnumValue;
                if (supportsUnknownEnumValue) {
                    Class cls3 = Integer.TYPE;
                    this.getRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Value", cls3);
                    this.getRepeatedValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Value", cls3);
                    this.setRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Value", cls3, cls3);
                    this.addRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, m.l + str + "Value", cls3);
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(generatedMessageV3);
                for (int i = 0; i < repeatedCount; i++) {
                    arrayList.add(getRepeated(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder builder) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(builder);
                for (int i = 0; i < repeatedCount; i++) {
                    arrayList.add(getRepeated(builder, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethod, generatedMessageV3, Integer.valueOf(i))).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(generatedMessageV3, i), new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder builder, int i) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethodBuilder, builder, Integer.valueOf(i))).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(builder, i), new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder builder, int i, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setRepeatedValueMethod, builder, Integer.valueOf(i), Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.setRepeated(builder, i, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.addRepeated(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }
        }

        private static final class SingularStringFieldAccessor extends SingularFieldAccessor {
            private final Method getBytesMethod;
            private final Method getBytesMethodBuilder;
            private final Method setBytesMethodBuilder;

            SingularStringFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.getBytesMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Bytes", new Class[0]);
                this.getBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Bytes", new Class[0]);
                this.setBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Bytes", ByteString.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethod, generatedMessageV3, new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder builder, Object obj) {
                if (obj instanceof ByteString) {
                    GeneratedMessageV3.invokeOrDie(this.setBytesMethodBuilder, builder, obj);
                } else {
                    super.set(builder, obj);
                }
            }
        }

        private static final class SingularMessageFieldAccessor extends SingularFieldAccessor {
            private final Method getBuilderMethodBuilder;
            private final Method newBuilderMethod;

            SingularMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object coerceType(Object obj) {
                return this.type.isInstance(obj) ? obj : ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0])).mergeFrom((Message) obj).buildPartial();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder builder, Object obj) {
                super.set(builder, coerceType(obj));
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder builder) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, new Object[0]);
            }
        }

        private static final class RepeatedMessageFieldAccessor extends RepeatedFieldAccessor {
            private final Method getBuilderMethodBuilder;
            private final Method newBuilderMethod;

            RepeatedMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object coerceType(Object obj) {
                return this.type.isInstance(obj) ? obj : ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0])).mergeFrom((Message) obj).build();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder builder, int i, Object obj) {
                super.setRepeated(builder, i, coerceType(obj));
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder builder, Object obj) {
                super.addRepeated(builder, coerceType(obj));
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0]);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.explorestack.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, Integer.valueOf(i));
            }
        }
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    private static Extension checkNotLite(ExtensionLite extensionLite) {
        throw null;
    }

    protected static int computeStringSize(int i, Object obj) {
        if (obj instanceof String) {
            return CodedOutputStream.computeStringSize(i, (String) obj);
        }
        return CodedOutputStream.computeBytesSize(i, (ByteString) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        if (obj instanceof String) {
            return CodedOutputStream.computeStringSizeNoTag((String) obj);
        }
        return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
    }

    protected static void writeString(CodedOutputStream codedOutputStream, int i, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.writeString(i, (String) obj);
        } else {
            codedOutputStream.writeBytes(i, (ByteString) obj);
        }
    }

    protected static void writeStringNoTag(CodedOutputStream codedOutputStream, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.writeStringNoTag((String) obj);
        } else {
            codedOutputStream.writeBytesNoTag((ByteString) obj);
        }
    }

    protected static <V> void serializeIntegerMapTo(CodedOutputStream codedOutputStream, MapField mapField, MapEntry mapEntry, int i) throws IOException {
        Map map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(Integer.valueOf(i4)).setValue(map.get(Integer.valueOf(i4))).build());
        }
    }

    protected static <V> void serializeLongMapTo(CodedOutputStream codedOutputStream, MapField mapField, MapEntry mapEntry, int i) throws IOException {
        Map map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(Long.valueOf(j)).setValue(map.get(Long.valueOf(j))).build());
        }
    }

    protected static <V> void serializeStringMapTo(CodedOutputStream codedOutputStream, MapField mapField, MapEntry mapEntry, int i) throws IOException {
        Map map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(str).setValue(map.get(str)).build());
        }
    }

    protected static <V> void serializeBooleanMapTo(CodedOutputStream codedOutputStream, MapField mapField, MapEntry mapEntry, int i) throws IOException {
        Map map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
        } else {
            maybeSerializeBooleanEntryTo(codedOutputStream, map, mapEntry, i, false);
            maybeSerializeBooleanEntryTo(codedOutputStream, map, mapEntry, i, true);
        }
    }

    private static void maybeSerializeBooleanEntryTo(CodedOutputStream codedOutputStream, Map map, MapEntry mapEntry, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(Boolean.valueOf(z)).setValue(map.get(Boolean.valueOf(z))).build());
        }
    }

    private static void serializeMapTo(CodedOutputStream codedOutputStream, Map map, MapEntry mapEntry, int i) {
        for (Map.Entry entry : map.entrySet()) {
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
    }
}
