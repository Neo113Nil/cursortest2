package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzju;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InlineMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzju inlineMessage$VisualAsset$Image;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzju zzjuVar = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InlineMessage((InlineMessage.Placement) obj, zzjuVar, (String) obj2, (String) obj3, (AppMessageAction) obj4, (AppMessageAction) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = InlineMessage.Placement.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    inlineMessage$VisualAsset$Image = new InlineMessage$VisualAsset$Image((Image) Image.ADAPTER.decode(protoReader));
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
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 8:
                    inlineMessage$VisualAsset$Image = new InlineMessage$VisualAsset$Animation((Animation) Animation.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzjuVar = inlineMessage$VisualAsset$Image;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        reverseProtoWriter.getClass();
        inlineMessage.getClass();
        reverseProtoWriter.writeBytes(inlineMessage.unknownFields());
        zzju zzjuVar = inlineMessage.visualAsset;
        if (zzjuVar instanceof InlineMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InlineMessage$VisualAsset$Image) zzjuVar).value);
        } else if (zzjuVar instanceof InlineMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((InlineMessage$VisualAsset$Animation) zzjuVar).value);
        } else if (zzjuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, inlineMessage.cannot_be_dismissed);
        ProtoAdapter protoAdapter = AppMessageAction.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, inlineMessage.secondary_navigation_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inlineMessage.primary_navigation_action);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, inlineMessage.message_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, inlineMessage.message_title);
        InlineMessage.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inlineMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InlineMessage inlineMessage = (InlineMessage) obj;
        inlineMessage.getClass();
        int encodedSizeWithTag2 = InlineMessage.Placement.ADAPTER.encodedSizeWithTag(1, inlineMessage.placement) + inlineMessage.unknownFields().getSize$okio();
        zzju zzjuVar = inlineMessage.visualAsset;
        if (zzjuVar instanceof InlineMessage$VisualAsset$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, ((InlineMessage$VisualAsset$Image) zzjuVar).value);
        } else {
            if (!(zzjuVar instanceof InlineMessage$VisualAsset$Animation)) {
                if (zzjuVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(4, inlineMessage.message_subtitle) + protoAdapter.encodedSizeWithTag(3, inlineMessage.message_title) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                return ProtoAdapter.BOOL.encodedSizeWithTag(7, inlineMessage.cannot_be_dismissed) + protoAdapter2.encodedSizeWithTag(6, inlineMessage.secondary_navigation_action) + protoAdapter2.encodedSizeWithTag(5, inlineMessage.primary_navigation_action) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = Animation.ADAPTER.encodedSizeWithTag(8, ((InlineMessage$VisualAsset$Animation) zzjuVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag32 = protoAdapter3.encodedSizeWithTag(4, inlineMessage.message_subtitle) + protoAdapter3.encodedSizeWithTag(3, inlineMessage.message_title) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = AppMessageAction.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, inlineMessage.cannot_be_dismissed) + protoAdapter22.encodedSizeWithTag(6, inlineMessage.secondary_navigation_action) + protoAdapter22.encodedSizeWithTag(5, inlineMessage.primary_navigation_action) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        inlineMessage.getClass();
        AppMessageAction appMessageAction = inlineMessage.primary_navigation_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        AppMessageAction appMessageAction3 = inlineMessage.secondary_navigation_action;
        AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
        ByteString byteString = ByteString.EMPTY;
        InlineMessage.Placement placement = inlineMessage.placement;
        zzju zzjuVar = inlineMessage.visualAsset;
        String str = inlineMessage.message_title;
        String str2 = inlineMessage.message_subtitle;
        Boolean bool = inlineMessage.cannot_be_dismissed;
        byteString.getClass();
        return new InlineMessage(placement, zzjuVar, str, str2, appMessageAction2, appMessageAction4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        inlineMessage.getClass();
        InlineMessage.Placement.ADAPTER.encodeWithTag(protoWriter, 1, inlineMessage.placement);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, inlineMessage.message_title);
        protoAdapter.encodeWithTag(protoWriter, 4, inlineMessage.message_subtitle);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, inlineMessage.primary_navigation_action);
        protoAdapter2.encodeWithTag(protoWriter, 6, inlineMessage.secondary_navigation_action);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, inlineMessage.cannot_be_dismissed);
        zzju zzjuVar = inlineMessage.visualAsset;
        if (zzjuVar instanceof InlineMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 2, ((InlineMessage$VisualAsset$Image) zzjuVar).value);
        } else if (zzjuVar instanceof InlineMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(protoWriter, 8, ((InlineMessage$VisualAsset$Animation) zzjuVar).value);
        } else if (zzjuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inlineMessage.unknownFields());
    }
}
