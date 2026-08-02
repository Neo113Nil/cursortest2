package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ActionEvent.Os.Companion cardMessage$VisualAsset$Image;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ActionEvent.Os.Companion companion = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardMessage((CardMessage.Placement) obj, companion, (String) obj2, (String) obj3, (AppMessageAction) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CardMessage.Placement.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    cardMessage$VisualAsset$Image = new CardMessage$VisualAsset$Image((Image) Image.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj4);
                    continue;
                case 6:
                    cardMessage$VisualAsset$Image = new CardMessage$VisualAsset$Animation((Animation) Animation.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            companion = cardMessage$VisualAsset$Image;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardMessage cardMessage = (CardMessage) obj;
        reverseProtoWriter.getClass();
        cardMessage.getClass();
        reverseProtoWriter.writeBytes(cardMessage.unknownFields());
        ActionEvent.Os.Companion companion = cardMessage.visualAsset;
        if (companion instanceof CardMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardMessage$VisualAsset$Image) companion).value);
        } else if (companion instanceof CardMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((CardMessage$VisualAsset$Animation) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cardMessage.primary_navigation_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardMessage.message_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardMessage.message_title);
        CardMessage.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardMessage cardMessage = (CardMessage) obj;
        cardMessage.getClass();
        int encodedSizeWithTag2 = CardMessage.Placement.ADAPTER.encodedSizeWithTag(1, cardMessage.placement) + cardMessage.unknownFields().getSize$okio();
        ActionEvent.Os.Companion companion = cardMessage.visualAsset;
        if (companion instanceof CardMessage$VisualAsset$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, ((CardMessage$VisualAsset$Image) companion).value);
        } else {
            if (!(companion instanceof CardMessage$VisualAsset$Animation)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                return AppMessageAction.ADAPTER.encodedSizeWithTag(5, cardMessage.primary_navigation_action) + protoAdapter.encodedSizeWithTag(4, cardMessage.message_subtitle) + protoAdapter.encodedSizeWithTag(3, cardMessage.message_title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Animation.ADAPTER.encodedSizeWithTag(6, ((CardMessage$VisualAsset$Animation) companion).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return AppMessageAction.ADAPTER.encodedSizeWithTag(5, cardMessage.primary_navigation_action) + protoAdapter2.encodedSizeWithTag(4, cardMessage.message_subtitle) + protoAdapter2.encodedSizeWithTag(3, cardMessage.message_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardMessage cardMessage = (CardMessage) obj;
        cardMessage.getClass();
        AppMessageAction appMessageAction = cardMessage.primary_navigation_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        ByteString byteString = ByteString.EMPTY;
        CardMessage.Placement placement = cardMessage.placement;
        ActionEvent.Os.Companion companion = cardMessage.visualAsset;
        String str = cardMessage.message_title;
        String str2 = cardMessage.message_subtitle;
        byteString.getClass();
        return new CardMessage(placement, companion, str, str2, appMessageAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardMessage cardMessage = (CardMessage) obj;
        cardMessage.getClass();
        CardMessage.Placement.ADAPTER.encodeWithTag(protoWriter, 1, cardMessage.placement);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, cardMessage.message_title);
        protoAdapter.encodeWithTag(protoWriter, 4, cardMessage.message_subtitle);
        AppMessageAction.ADAPTER.encodeWithTag(protoWriter, 5, cardMessage.primary_navigation_action);
        ActionEvent.Os.Companion companion = cardMessage.visualAsset;
        if (companion instanceof CardMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 2, ((CardMessage$VisualAsset$Image) companion).value);
        } else if (companion instanceof CardMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(protoWriter, 6, ((CardMessage$VisualAsset$Animation) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardMessage.unknownFields());
    }
}
