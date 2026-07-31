package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes13.dex */
public abstract class AbstractParser implements Parser {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();

    private UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
        if (messageLite instanceof AbstractMessageLite) {
            return ((AbstractMessageLite) messageLite).newUninitializedMessageException();
        }
        return new UninitializedMessageException(messageLite);
    }

    private MessageLite checkMessageInitialized(MessageLite messageLite) {
        if (messageLite == null || messageLite.isInitialized()) {
            return messageLite;
        }
        throw newUninitializedMessageException(messageLite).asInvalidProtocolBufferException().setUnfinishedMessage(messageLite);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3230parsePartialFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (MessageLite) parsePartialFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized((MessageLite) parsePartialFrom(codedInputStream, extensionRegistryLite));
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parseFrom(codedInputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3229parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageLite messageLite = (MessageLite) parsePartialFrom(newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3228parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return m3229parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m3229parsePartialFrom(byteString, extensionRegistryLite));
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream newInstance = CodedInputStream.newInstance(byteBuffer);
        MessageLite messageLite = (MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return checkMessageInitialized(messageLite);
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3235parsePartialFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
        MessageLite messageLite = (MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3234parsePartialFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m3235parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3236parsePartialFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return m3235parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3233parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return m3235parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3225parseFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m3235parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3224parseFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m3225parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return m3225parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3232parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
        MessageLite messageLite = (MessageLite) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3231parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m3232parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m3232parsePartialFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3227parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m3232parsePartialFrom((InputStream) new AbstractMessageLite.Builder.LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e);
        }
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m3226parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m3227parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m3227parsePartialDelimitedFrom(inputStream, extensionRegistryLite));
    }

    @Override // com.explorestack.protobuf.Parser
    public MessageLite parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
