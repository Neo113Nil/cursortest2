package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class Openrtb extends GeneratedMessageV3 implements OpenrtbOrBuilder {
    public static final int DOMAINSPEC_FIELD_NUMBER = 2;
    public static final int DOMAINVER_FIELD_NUMBER = 3;
    public static final int REQUEST_FIELD_NUMBER = 4;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    public static final int VER_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object domainspec_;
    private volatile Object domainver_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private volatile Object ver_;
    private static final Openrtb DEFAULT_INSTANCE = new Openrtb();
    private static final Parser PARSER = new AbstractParser() { // from class: com.explorestack.protobuf.openrtb.Openrtb.1
        @Override // com.explorestack.protobuf.Parser
        public Openrtb parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Openrtb(codedInputStream, extensionRegistryLite);
        }
    };

    private Openrtb(GeneratedMessageV3.Builder builder) {
        super(builder);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Openrtb() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.ver_ = "";
        this.domainspec_ = "";
        this.domainver_ = "";
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Openrtb();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Openrtb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.ver_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.domainspec_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 26) {
                                if (readTag == 34) {
                                    Request.Builder builder = this.payloadCase_ == 4 ? ((Request) this.payload_).toBuilder() : null;
                                    MessageLite readMessage = codedInputStream.readMessage(Request.parser(), extensionRegistryLite);
                                    this.payload_ = readMessage;
                                    if (builder != null) {
                                        builder.mergeFrom((Request) readMessage);
                                        this.payload_ = builder.buildPartial();
                                    }
                                    this.payloadCase_ = 4;
                                } else if (readTag == 42) {
                                    Response.Builder builder2 = this.payloadCase_ == 5 ? ((Response) this.payload_).toBuilder() : null;
                                    MessageLite readMessage2 = codedInputStream.readMessage(Response.parser(), extensionRegistryLite);
                                    this.payload_ = readMessage2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Response) readMessage2);
                                        this.payload_ = builder2.buildPartial();
                                    }
                                    this.payloadCase_ = 5;
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.domainver_ = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_descriptor;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_fieldAccessorTable.ensureFieldAccessorsInitialized(Openrtb.class, Builder.class);
    }

    public enum PayloadCase implements Internal.EnumLite {
        REQUEST(4),
        RESPONSE(5),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }

        public static PayloadCase forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i == 4) {
                return REQUEST;
            }
            if (i != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }
    }

    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    public String getVer() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVerBytes() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    public String getDomainspec() {
        Object obj = this.domainspec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainspec_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainspecBytes() {
        Object obj = this.domainspec_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainspec_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    public String getDomainver() {
        Object obj = this.domainver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainverBytes() {
        Object obj = this.domainver_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainver_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    public boolean hasRequest() {
        return this.payloadCase_ == 4;
    }

    public Request getRequest() {
        if (this.payloadCase_ == 4) {
            return (Request) this.payload_;
        }
        return Request.getDefaultInstance();
    }

    public RequestOrBuilder getRequestOrBuilder() {
        if (this.payloadCase_ == 4) {
            return (Request) this.payload_;
        }
        return Request.getDefaultInstance();
    }

    public boolean hasResponse() {
        return this.payloadCase_ == 5;
    }

    public Response getResponse() {
        if (this.payloadCase_ == 5) {
            return (Response) this.payload_;
        }
        return Response.getDefaultInstance();
    }

    public ResponseOrBuilder getResponseOrBuilder() {
        if (this.payloadCase_ == 5) {
            return (Response) this.payload_;
        }
        return Response.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getVerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.ver_);
        }
        if (!getDomainspecBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            codedOutputStream.writeMessage(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            codedOutputStream.writeMessage(5, (Response) this.payload_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getVerBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.ver_) : 0;
        if (!getDomainspecBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, (Response) this.payload_);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Openrtb)) {
            return super.equals(obj);
        }
        Openrtb openrtb = (Openrtb) obj;
        if (!getVer().equals(openrtb.getVer()) || !getDomainspec().equals(openrtb.getDomainspec()) || !getDomainver().equals(openrtb.getDomainver()) || !getPayloadCase().equals(openrtb.getPayloadCase())) {
            return false;
        }
        int i = this.payloadCase_;
        if (i == 4) {
            if (!getRequest().equals(openrtb.getRequest())) {
                return false;
            }
        } else if (i == 5 && !getResponse().equals(openrtb.getResponse())) {
            return false;
        }
        return this.unknownFields.equals(openrtb.unknownFields);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i;
        int hashCode;
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode2 = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVer().hashCode()) * 37) + 2) * 53) + getDomainspec().hashCode()) * 37) + 3) * 53) + getDomainver().hashCode();
        int i3 = this.payloadCase_;
        if (i3 == 4) {
            i = ((hashCode2 * 37) + 4) * 53;
            hashCode = getRequest().hashCode();
        } else {
            if (i3 == 5) {
                i = ((hashCode2 * 37) + 5) * 53;
                hashCode = getResponse().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }
        hashCode2 = i + hashCode;
        int hashCode32 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode32;
        return hashCode32;
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteBuffer);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Openrtb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteString);
    }

    public static Openrtb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Openrtb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(bArr);
    }

    public static Openrtb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Openrtb parseFrom(InputStream inputStream) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Openrtb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Openrtb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Openrtb openrtb) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(openrtb);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder implements OpenrtbOrBuilder {
        private Object domainspec_;
        private Object domainver_;
        private int payloadCase_;
        private Object payload_;
        private SingleFieldBuilderV3 requestBuilder_;
        private SingleFieldBuilderV3 responseBuilder_;
        private Object ver_;

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_fieldAccessorTable.ensureFieldAccessorsInitialized(Openrtb.class, Builder.class);
        }

        private Builder() {
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_descriptor;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* renamed from: getDefaultInstanceForType */
        public Openrtb mo3244getDefaultInstanceForType() {
            return Openrtb.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb build() {
            Openrtb buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb buildPartial() {
            Openrtb openrtb = new Openrtb(this);
            openrtb.ver_ = this.ver_;
            openrtb.domainspec_ = this.domainspec_;
            openrtb.domainver_ = this.domainver_;
            if (this.payloadCase_ == 4) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = singleFieldBuilderV3.build();
                }
            }
            if (this.payloadCase_ == 5) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.responseBuilder_;
                if (singleFieldBuilderV32 == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = singleFieldBuilderV32.build();
                }
            }
            openrtb.payloadCase_ = this.payloadCase_;
            onBuilt();
            return openrtb;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* renamed from: clone */
        public Builder mo3223clone() {
            return (Builder) super.mo3223clone();
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Openrtb) {
                return mergeFrom((Openrtb) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Openrtb openrtb) {
            if (openrtb == Openrtb.getDefaultInstance()) {
                return this;
            }
            if (!openrtb.getVer().isEmpty()) {
                this.ver_ = openrtb.ver_;
                onChanged();
            }
            if (!openrtb.getDomainspec().isEmpty()) {
                this.domainspec_ = openrtb.domainspec_;
                onChanged();
            }
            if (!openrtb.getDomainver().isEmpty()) {
                this.domainver_ = openrtb.domainver_;
                onChanged();
            }
            int i = AnonymousClass2.$SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[openrtb.getPayloadCase().ordinal()];
            if (i == 1) {
                mergeRequest(openrtb.getRequest());
            } else if (i == 2) {
                mergeResponse(openrtb.getResponse());
            }
            mergeUnknownFields(((GeneratedMessageV3) openrtb).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Openrtb openrtb = null;
            try {
                try {
                    Openrtb openrtb2 = (Openrtb) Openrtb.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (openrtb2 != null) {
                        mergeFrom(openrtb2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Openrtb openrtb3 = (Openrtb) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        openrtb = openrtb3;
                        if (openrtb != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (openrtb != null) {
                    mergeFrom(openrtb);
                }
                throw th;
            }
        }

        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public String getVer() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ver_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ver_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setVer(String str) {
            str.getClass();
            this.ver_ = str;
            onChanged();
            return this;
        }

        public Builder clearVer() {
            this.ver_ = Openrtb.getDefaultInstance().getVer();
            onChanged();
            return this;
        }

        public Builder setVerBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ver_ = byteString;
            onChanged();
            return this;
        }

        public String getDomainspec() {
            Object obj = this.domainspec_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domainspec_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        public ByteString getDomainspecBytes() {
            Object obj = this.domainspec_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domainspec_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDomainspec(String str) {
            str.getClass();
            this.domainspec_ = str;
            onChanged();
            return this;
        }

        public Builder clearDomainspec() {
            this.domainspec_ = Openrtb.getDefaultInstance().getDomainspec();
            onChanged();
            return this;
        }

        public Builder setDomainspecBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.domainspec_ = byteString;
            onChanged();
            return this;
        }

        public String getDomainver() {
            Object obj = this.domainver_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domainver_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        public ByteString getDomainverBytes() {
            Object obj = this.domainver_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domainver_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDomainver(String str) {
            str.getClass();
            this.domainver_ = str;
            onChanged();
            return this;
        }

        public Builder clearDomainver() {
            this.domainver_ = Openrtb.getDefaultInstance().getDomainver();
            onChanged();
            return this;
        }

        public Builder setDomainverBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.domainver_ = byteString;
            onChanged();
            return this;
        }

        public boolean hasRequest() {
            return this.payloadCase_ == 4;
        }

        public Request getRequest() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 4) {
                    return (Request) this.payload_;
                }
                return Request.getDefaultInstance();
            }
            if (this.payloadCase_ == 4) {
                return (Request) singleFieldBuilderV3.getMessage();
            }
            return Request.getDefaultInstance();
        }

        public Builder setRequest(Request request) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                request.getClass();
                this.payload_ = request;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder mergeRequest(Request request) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 4 && this.payload_ != Request.getDefaultInstance()) {
                    this.payload_ = Request.newBuilder((Request) this.payload_).mergeFrom(request).buildPartial();
                } else {
                    this.payload_ = request;
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 4) {
                    singleFieldBuilderV3.mergeFrom(request);
                }
                this.requestBuilder_.setMessage(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder clearRequest() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
            } else {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Request.Builder getRequestBuilder() {
            return (Request.Builder) getRequestFieldBuilder().getBuilder();
        }

        public RequestOrBuilder getRequestOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.payloadCase_;
            if (i == 4 && (singleFieldBuilderV3 = this.requestBuilder_) != null) {
                return (RequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 4) {
                return (Request) this.payload_;
            }
            return Request.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 4) {
                    this.payload_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new SingleFieldBuilderV3((Request) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 4;
            onChanged();
            return this.requestBuilder_;
        }

        public boolean hasResponse() {
            return this.payloadCase_ == 5;
        }

        public Response getResponse() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 5) {
                    return (Response) this.payload_;
                }
                return Response.getDefaultInstance();
            }
            if (this.payloadCase_ == 5) {
                return (Response) singleFieldBuilderV3.getMessage();
            }
            return Response.getDefaultInstance();
        }

        public Builder setResponse(Response response) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                response.getClass();
                this.payload_ = response;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder mergeResponse(Response response) {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 5 && this.payload_ != Response.getDefaultInstance()) {
                    this.payload_ = Response.newBuilder((Response) this.payload_).mergeFrom(response).buildPartial();
                } else {
                    this.payload_ = response;
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 5) {
                    singleFieldBuilderV3.mergeFrom(response);
                }
                this.responseBuilder_.setMessage(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder clearResponse() {
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
            } else {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Response.Builder getResponseBuilder() {
            return (Response.Builder) getResponseFieldBuilder().getBuilder();
        }

        public ResponseOrBuilder getResponseOrBuilder() {
            SingleFieldBuilderV3 singleFieldBuilderV3;
            int i = this.payloadCase_;
            if (i == 5 && (singleFieldBuilderV3 = this.responseBuilder_) != null) {
                return (ResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 5) {
                return (Response) this.payload_;
            }
            return Response.getDefaultInstance();
        }

        private SingleFieldBuilderV3 getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 5) {
                    this.payload_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new SingleFieldBuilderV3((Response) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 5;
            onChanged();
            return this.responseBuilder_;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    /* renamed from: com.explorestack.protobuf.openrtb.Openrtb$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Openrtb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    public Openrtb mo3244getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
