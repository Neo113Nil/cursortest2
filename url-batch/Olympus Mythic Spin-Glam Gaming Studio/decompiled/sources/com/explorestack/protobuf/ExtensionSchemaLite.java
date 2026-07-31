package com.explorestack.protobuf;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;

/* loaded from: classes15.dex */
final class ExtensionSchemaLite extends ExtensionSchema {
    @Override // com.explorestack.protobuf.ExtensionSchema
    boolean hasExtensions(MessageLite messageLite) {
        return false;
    }

    ExtensionSchemaLite() {
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    FieldSet getExtensions(Object obj) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    FieldSet getMutableExtensions(Object obj) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    Object parseExtension(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
        return null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
