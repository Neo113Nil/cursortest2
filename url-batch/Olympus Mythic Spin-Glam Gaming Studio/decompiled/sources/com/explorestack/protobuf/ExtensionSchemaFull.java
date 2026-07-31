package com.explorestack.protobuf;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.explorestack.protobuf.GeneratedMessageV3;

/* loaded from: classes5.dex */
final class ExtensionSchemaFull extends ExtensionSchema {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final long EXTENSION_FIELD_OFFSET = getExtensionsFieldOffset();

    ExtensionSchemaFull() {
    }

    private static long getExtensionsFieldOffset() {
        return UnsafeUtil.objectFieldOffset(GeneratedMessageV3.ExtendableMessage.class.getDeclaredField("extensions"));
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageV3.ExtendableMessage;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    public FieldSet getExtensions(Object obj) {
        return (FieldSet) UnsafeUtil.getObject(obj, EXTENSION_FIELD_OFFSET);
    }

    void setExtensions(Object obj, FieldSet fieldSet) {
        UnsafeUtil.putObject(obj, EXTENSION_FIELD_OFFSET, fieldSet);
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    FieldSet getMutableExtensions(Object obj) {
        FieldSet extensions = getExtensions(obj);
        if (!extensions.isImmutable()) {
            return extensions;
        }
        FieldSet m3243clone = extensions.m3243clone();
        setExtensions(obj, m3243clone);
        return m3243clone;
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
        ((ExtensionRegistry) extensionRegistryLite).findExtensionByNumber(((Message) messageLite).getDescriptorForType(), i);
        return null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        if (ExtensionRegistryLite.isEagerlyParseMessageSets()) {
            throw null;
        }
        throw null;
    }

    @Override // com.explorestack.protobuf.ExtensionSchema
    void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
