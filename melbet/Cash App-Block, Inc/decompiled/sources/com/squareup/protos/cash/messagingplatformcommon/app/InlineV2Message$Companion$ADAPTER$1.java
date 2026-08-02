package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InlineV2Message$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InlineV2Message((InlineV2Message.Placement) obj, inlineV2Message$VisualAsset$Avatar, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InlineV2Message.Placement.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                inlineV2Message$VisualAsset$Avatar = new InlineV2Message$VisualAsset$Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InlineV2Message inlineV2Message = (InlineV2Message) obj;
        reverseProtoWriter.getClass();
        inlineV2Message.getClass();
        reverseProtoWriter.writeBytes(inlineV2Message.unknownFields());
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = inlineV2Message.visualAsset;
        if (inlineV2Message$VisualAsset$Avatar != null) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inlineV2Message$VisualAsset$Avatar.value);
        } else if (inlineV2Message$VisualAsset$Avatar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inlineV2Message.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inlineV2Message.message_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, inlineV2Message.message_title);
        InlineV2Message.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inlineV2Message.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InlineV2Message inlineV2Message = (InlineV2Message) obj;
        inlineV2Message.getClass();
        int encodedSizeWithTag = InlineV2Message.Placement.ADAPTER.encodedSizeWithTag(1, inlineV2Message.placement) + inlineV2Message.unknownFields().getSize$okio();
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = inlineV2Message.visualAsset;
        if (inlineV2Message$VisualAsset$Avatar != null) {
            encodedSizeWithTag += UiAvatar.ADAPTER.encodedSizeWithTag(2, inlineV2Message$VisualAsset$Avatar.value);
        } else if (inlineV2Message$VisualAsset$Avatar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, inlineV2Message.url) + protoAdapter.encodedSizeWithTag(4, inlineV2Message.message_subtitle) + protoAdapter.encodedSizeWithTag(3, inlineV2Message.message_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InlineV2Message inlineV2Message = (InlineV2Message) obj;
        inlineV2Message.getClass();
        ByteString byteString = ByteString.EMPTY;
        InlineV2Message.Placement placement = inlineV2Message.placement;
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = inlineV2Message.visualAsset;
        String str = inlineV2Message.message_title;
        String str2 = inlineV2Message.message_subtitle;
        String str3 = inlineV2Message.url;
        byteString.getClass();
        return new InlineV2Message(placement, inlineV2Message$VisualAsset$Avatar, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InlineV2Message inlineV2Message = (InlineV2Message) obj;
        inlineV2Message.getClass();
        InlineV2Message.Placement.ADAPTER.encodeWithTag(protoWriter, 1, inlineV2Message.placement);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, inlineV2Message.message_title);
        protoAdapter.encodeWithTag(protoWriter, 4, inlineV2Message.message_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, inlineV2Message.url);
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = inlineV2Message.visualAsset;
        if (inlineV2Message$VisualAsset$Avatar != null) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 2, inlineV2Message$VisualAsset$Avatar.value);
        } else if (inlineV2Message$VisualAsset$Avatar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inlineV2Message.unknownFields());
    }
}
