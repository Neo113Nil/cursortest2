package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.MessageContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/MessageContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        MessageContent.Content content = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MessageContent((MessageType) obj, content, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = MessageType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    content = new MessageContent.Content.Text((TextContent) TextContent.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    content = new MessageContent.Content.Image((ImageContent) ImageContent.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    content = new MessageContent.Content.ToolRequest((ToolRequest) ToolRequest.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    content = new MessageContent.Content.ToolResponse((ToolResponse) ToolResponse.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    content = new MessageContent.Content.Thinking((ThinkingContent) ThinkingContent.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    content = new MessageContent.Content.RedactedThinking((RedactedThinkingContent) RedactedThinkingContent.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    content = new MessageContent.Content.File((FileContent) FileContent.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MessageContent messageContent = (MessageContent) obj;
        reverseProtoWriter.getClass();
        messageContent.getClass();
        reverseProtoWriter.writeBytes(messageContent.unknownFields());
        MessageContent.Content content = messageContent.content;
        if (content instanceof MessageContent.Content.Text) {
            TextContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((MessageContent.Content.Text) content).getValue());
        } else if (content instanceof MessageContent.Content.Image) {
            ImageContent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((MessageContent.Content.Image) content).getValue());
        } else if (content instanceof MessageContent.Content.ToolRequest) {
            ToolRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((MessageContent.Content.ToolRequest) content).getValue());
        } else if (content instanceof MessageContent.Content.ToolResponse) {
            ToolResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((MessageContent.Content.ToolResponse) content).getValue());
        } else if (content instanceof MessageContent.Content.Thinking) {
            ThinkingContent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((MessageContent.Content.Thinking) content).getValue());
        } else if (content instanceof MessageContent.Content.RedactedThinking) {
            RedactedThinkingContent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((MessageContent.Content.RedactedThinking) content).getValue());
        } else if (content instanceof MessageContent.Content.File) {
            FileContent.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((MessageContent.Content.File) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        MessageType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, messageContent.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MessageContent messageContent = (MessageContent) obj;
        messageContent.getClass();
        int encodedSizeWithTag = MessageType.ADAPTER.encodedSizeWithTag(1, messageContent.type) + messageContent.unknownFields().getSize$okio();
        MessageContent.Content content = messageContent.content;
        if (content instanceof MessageContent.Content.Text) {
            return TextContent.ADAPTER.encodedSizeWithTag(2, ((MessageContent.Content.Text) content).getValue()) + encodedSizeWithTag;
        }
        if (content instanceof MessageContent.Content.Image) {
            return ImageContent.ADAPTER.encodedSizeWithTag(3, ((MessageContent.Content.Image) content).getValue()) + encodedSizeWithTag;
        }
        if (content instanceof MessageContent.Content.ToolRequest) {
            return ToolRequest.ADAPTER.encodedSizeWithTag(4, ((MessageContent.Content.ToolRequest) content).getValue()) + encodedSizeWithTag;
        }
        if (content instanceof MessageContent.Content.ToolResponse) {
            return ToolResponse.ADAPTER.encodedSizeWithTag(5, ((MessageContent.Content.ToolResponse) content).getValue()) + encodedSizeWithTag;
        }
        if (content instanceof MessageContent.Content.Thinking) {
            return ThinkingContent.ADAPTER.encodedSizeWithTag(6, ((MessageContent.Content.Thinking) content).getValue()) + encodedSizeWithTag;
        }
        if (content instanceof MessageContent.Content.RedactedThinking) {
            return RedactedThinkingContent.ADAPTER.encodedSizeWithTag(7, ((MessageContent.Content.RedactedThinking) content).getValue()) + encodedSizeWithTag;
        }
        if (content instanceof MessageContent.Content.File) {
            return FileContent.ADAPTER.encodedSizeWithTag(8, ((MessageContent.Content.File) content).getValue()) + encodedSizeWithTag;
        }
        if (content == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MessageContent messageContent = (MessageContent) obj;
        messageContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        MessageType messageType = messageContent.type;
        MessageContent.Content content = messageContent.content;
        byteString.getClass();
        return new MessageContent(messageType, content, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MessageContent messageContent = (MessageContent) obj;
        messageContent.getClass();
        MessageType.ADAPTER.encodeWithTag(protoWriter, 1, messageContent.type);
        MessageContent.Content content = messageContent.content;
        if (content instanceof MessageContent.Content.Text) {
            TextContent.ADAPTER.encodeWithTag(protoWriter, 2, ((MessageContent.Content.Text) content).getValue());
        } else if (content instanceof MessageContent.Content.Image) {
            ImageContent.ADAPTER.encodeWithTag(protoWriter, 3, ((MessageContent.Content.Image) content).getValue());
        } else if (content instanceof MessageContent.Content.ToolRequest) {
            ToolRequest.ADAPTER.encodeWithTag(protoWriter, 4, ((MessageContent.Content.ToolRequest) content).getValue());
        } else if (content instanceof MessageContent.Content.ToolResponse) {
            ToolResponse.ADAPTER.encodeWithTag(protoWriter, 5, ((MessageContent.Content.ToolResponse) content).getValue());
        } else if (content instanceof MessageContent.Content.Thinking) {
            ThinkingContent.ADAPTER.encodeWithTag(protoWriter, 6, ((MessageContent.Content.Thinking) content).getValue());
        } else if (content instanceof MessageContent.Content.RedactedThinking) {
            RedactedThinkingContent.ADAPTER.encodeWithTag(protoWriter, 7, ((MessageContent.Content.RedactedThinking) content).getValue());
        } else if (content instanceof MessageContent.Content.File) {
            FileContent.ADAPTER.encodeWithTag(protoWriter, 8, ((MessageContent.Content.File) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(messageContent.unknownFields());
    }
}
