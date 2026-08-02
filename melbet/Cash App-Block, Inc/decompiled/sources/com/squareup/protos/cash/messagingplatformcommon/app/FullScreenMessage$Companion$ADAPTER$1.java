package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FullScreenMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FullScreenMessage(fullScreenMessage$VisualAsset$Video, (AppMessageAction) obj, (AppMessageAction) obj2, (Color) obj3, (Color) obj4, (FullScreenMessage.Placement) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    fullScreenMessage$VisualAsset$Video = new FullScreenMessage$VisualAsset$Video((Video) Video.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    try {
                        obj5 = FullScreenMessage.Placement.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        reverseProtoWriter.getClass();
        fullScreenMessage.getClass();
        reverseProtoWriter.writeBytes(fullScreenMessage.unknownFields());
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = fullScreenMessage.visualAsset;
        if (fullScreenMessage$VisualAsset$Video != null) {
            Video.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fullScreenMessage$VisualAsset$Video.value);
        } else if (fullScreenMessage$VisualAsset$Video != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        FullScreenMessage.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 6, fullScreenMessage.placement);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fullScreenMessage.secondary_button_accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fullScreenMessage.primary_button_accent_color);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, fullScreenMessage.secondary_action);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, fullScreenMessage.primary_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        fullScreenMessage.getClass();
        int size$okio = fullScreenMessage.unknownFields().getSize$okio();
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = fullScreenMessage.visualAsset;
        if (fullScreenMessage$VisualAsset$Video != null) {
            size$okio += Video.ADAPTER.encodedSizeWithTag(1, fullScreenMessage$VisualAsset$Video.value);
        } else if (fullScreenMessage$VisualAsset$Video != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        ProtoAdapter protoAdapter = AppMessageAction.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, fullScreenMessage.secondary_action) + protoAdapter.encodedSizeWithTag(2, fullScreenMessage.primary_action) + size$okio;
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        return FullScreenMessage.Placement.ADAPTER.encodedSizeWithTag(6, fullScreenMessage.placement) + protoAdapter2.encodedSizeWithTag(5, fullScreenMessage.secondary_button_accent_color) + protoAdapter2.encodedSizeWithTag(4, fullScreenMessage.primary_button_accent_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        fullScreenMessage.getClass();
        AppMessageAction appMessageAction = fullScreenMessage.primary_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        AppMessageAction appMessageAction3 = fullScreenMessage.secondary_action;
        AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
        Color color = fullScreenMessage.primary_button_accent_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = fullScreenMessage.secondary_button_accent_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = fullScreenMessage.visualAsset;
        FullScreenMessage.Placement placement = fullScreenMessage.placement;
        byteString.getClass();
        return new FullScreenMessage(fullScreenMessage$VisualAsset$Video, appMessageAction2, appMessageAction4, color2, color4, placement, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        fullScreenMessage.getClass();
        ProtoAdapter protoAdapter = AppMessageAction.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, fullScreenMessage.primary_action);
        protoAdapter.encodeWithTag(protoWriter, 3, fullScreenMessage.secondary_action);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, fullScreenMessage.primary_button_accent_color);
        protoAdapter2.encodeWithTag(protoWriter, 5, fullScreenMessage.secondary_button_accent_color);
        FullScreenMessage.Placement.ADAPTER.encodeWithTag(protoWriter, 6, fullScreenMessage.placement);
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = fullScreenMessage.visualAsset;
        if (fullScreenMessage$VisualAsset$Video != null) {
            Video.ADAPTER.encodeWithTag(protoWriter, 1, fullScreenMessage$VisualAsset$Video.value);
        } else if (fullScreenMessage$VisualAsset$Video != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(fullScreenMessage.unknownFields());
    }
}
