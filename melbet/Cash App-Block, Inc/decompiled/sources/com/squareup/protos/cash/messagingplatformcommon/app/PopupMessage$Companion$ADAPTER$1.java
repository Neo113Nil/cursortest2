package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PopupMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzjv popupMessage$VisualAsset$Image;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzjv zzjvVar = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PopupMessage((PopupMessage.Placement) obj, zzjvVar, (String) obj2, (String) obj3, (AppMessageAction) obj4, (AppMessageAction) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = PopupMessage.Placement.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    popupMessage$VisualAsset$Image = new PopupMessage$VisualAsset$Image((Image) Image.ADAPTER.decode(protoReader));
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
                    obj5 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj5);
                    continue;
                case 7:
                    popupMessage$VisualAsset$Image = new PopupMessage$VisualAsset$Animation((Animation) Animation.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzjvVar = popupMessage$VisualAsset$Image;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PopupMessage popupMessage = (PopupMessage) obj;
        reverseProtoWriter.getClass();
        popupMessage.getClass();
        reverseProtoWriter.writeBytes(popupMessage.unknownFields());
        zzjv zzjvVar = popupMessage.visualAsset;
        if (zzjvVar instanceof PopupMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PopupMessage$VisualAsset$Image) zzjvVar).value);
        } else if (zzjvVar instanceof PopupMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((PopupMessage$VisualAsset$Animation) zzjvVar).value);
        } else if (zzjvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = AppMessageAction.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, popupMessage.secondary_navigation_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, popupMessage.primary_navigation_action);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, popupMessage.message_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, popupMessage.message_title);
        PopupMessage.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, popupMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PopupMessage popupMessage = (PopupMessage) obj;
        popupMessage.getClass();
        int encodedSizeWithTag2 = PopupMessage.Placement.ADAPTER.encodedSizeWithTag(1, popupMessage.placement) + popupMessage.unknownFields().getSize$okio();
        zzjv zzjvVar = popupMessage.visualAsset;
        if (zzjvVar instanceof PopupMessage$VisualAsset$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, ((PopupMessage$VisualAsset$Image) zzjvVar).value);
        } else {
            if (!(zzjvVar instanceof PopupMessage$VisualAsset$Animation)) {
                if (zzjvVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(4, popupMessage.message_subtitle) + protoAdapter.encodedSizeWithTag(3, popupMessage.message_title) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(6, popupMessage.secondary_navigation_action) + protoAdapter2.encodedSizeWithTag(5, popupMessage.primary_navigation_action) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = Animation.ADAPTER.encodedSizeWithTag(7, ((PopupMessage$VisualAsset$Animation) zzjvVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag32 = protoAdapter3.encodedSizeWithTag(4, popupMessage.message_subtitle) + protoAdapter3.encodedSizeWithTag(3, popupMessage.message_title) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = AppMessageAction.ADAPTER;
        return protoAdapter22.encodedSizeWithTag(6, popupMessage.secondary_navigation_action) + protoAdapter22.encodedSizeWithTag(5, popupMessage.primary_navigation_action) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PopupMessage popupMessage = (PopupMessage) obj;
        popupMessage.getClass();
        AppMessageAction appMessageAction = popupMessage.primary_navigation_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        AppMessageAction appMessageAction3 = popupMessage.secondary_navigation_action;
        AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
        ByteString byteString = ByteString.EMPTY;
        PopupMessage.Placement placement = popupMessage.placement;
        zzjv zzjvVar = popupMessage.visualAsset;
        String str = popupMessage.message_title;
        String str2 = popupMessage.message_subtitle;
        byteString.getClass();
        return new PopupMessage(placement, zzjvVar, str, str2, appMessageAction2, appMessageAction4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PopupMessage popupMessage = (PopupMessage) obj;
        popupMessage.getClass();
        PopupMessage.Placement.ADAPTER.encodeWithTag(protoWriter, 1, popupMessage.placement);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, popupMessage.message_title);
        protoAdapter.encodeWithTag(protoWriter, 4, popupMessage.message_subtitle);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, popupMessage.primary_navigation_action);
        protoAdapter2.encodeWithTag(protoWriter, 6, popupMessage.secondary_navigation_action);
        zzjv zzjvVar = popupMessage.visualAsset;
        if (zzjvVar instanceof PopupMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 2, ((PopupMessage$VisualAsset$Image) zzjvVar).value);
        } else if (zzjvVar instanceof PopupMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(protoWriter, 7, ((PopupMessage$VisualAsset$Animation) zzjvVar).value);
        } else if (zzjvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(popupMessage.unknownFields());
    }
}
