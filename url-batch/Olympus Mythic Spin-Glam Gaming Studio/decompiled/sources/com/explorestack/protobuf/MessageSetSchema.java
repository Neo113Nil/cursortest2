package com.explorestack.protobuf;

/* loaded from: classes4.dex */
final class MessageSetSchema implements Schema {
    private final MessageLite defaultInstance;
    private final ExtensionSchema extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    static MessageSetSchema newSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
    }

    @Override // com.explorestack.protobuf.Schema
    public Object newInstance() {
        return this.defaultInstance.newBuilderForType().buildPartial();
    }

    @Override // com.explorestack.protobuf.Schema
    public void mergeFrom(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, reader, extensionRegistryLite);
    }

    private void mergeFromHelper(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Object builderFromMessage = unknownFieldSchema.getBuilderFromMessage(obj);
        FieldSet mutableExtensions = extensionSchema.getMutableExtensions(obj);
        do {
            try {
                if (reader.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                unknownFieldSchema.setBuilderToMessage(obj, builderFromMessage);
            }
        } while (parseMessageSetItemOrUnknownField(reader, extensionRegistryLite, extensionSchema, mutableExtensions, unknownFieldSchema, builderFromMessage));
    }

    @Override // com.explorestack.protobuf.Schema
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    private boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) {
        int tag = reader.getTag();
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object findExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, findExtensionByNumber, extensionRegistryLite, fieldSet);
                    return true;
                }
                return unknownFieldSchema.mergeOneFieldFrom(obj, reader);
            }
            return reader.skipField();
        }
        Object obj2 = null;
        int i = 0;
        ByteString byteString = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = reader.readUInt32();
                obj2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, i);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (obj2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, obj2, extensionRegistryLite, fieldSet);
                } else {
                    byteString = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteString != null) {
            if (obj2 != null) {
                extensionSchema.parseMessageSetItem(byteString, obj2, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.addLengthDelimited(obj, i, byteString);
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.Schema
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getUnknownFieldsSerializedSize(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(obj));
    }
}
