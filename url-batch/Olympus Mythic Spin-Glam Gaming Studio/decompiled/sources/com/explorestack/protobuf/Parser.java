package com.explorestack.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface Parser {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

    Object parseFrom(ByteString byteString);

    Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    Object parseFrom(CodedInputStream codedInputStream);

    Object parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite);

    Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
}
