package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjw;
import com.squareup.protos.cash.messagingplatformcommon.app.StatusResultMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StatusResultMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzjw statusResultMessage$VisualAsset$Image;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzjw zzjwVar = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatusResultMessage((StatusResultMessage.Placement) obj, zzjwVar, (String) obj2, (String) obj3, (AppMessageAction) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = StatusResultMessage.Placement.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    statusResultMessage$VisualAsset$Image = new StatusResultMessage$VisualAsset$Image((Image) Image.ADAPTER.decode(protoReader));
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
                    statusResultMessage$VisualAsset$Image = new StatusResultMessage$VisualAsset$Animation((Animation) Animation.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzjwVar = statusResultMessage$VisualAsset$Image;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatusResultMessage statusResultMessage = (StatusResultMessage) obj;
        reverseProtoWriter.getClass();
        statusResultMessage.getClass();
        reverseProtoWriter.writeBytes(statusResultMessage.unknownFields());
        zzjw zzjwVar = statusResultMessage.visualAsset;
        if (zzjwVar instanceof StatusResultMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((StatusResultMessage$VisualAsset$Image) zzjwVar).value);
        } else if (zzjwVar instanceof StatusResultMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((StatusResultMessage$VisualAsset$Animation) zzjwVar).value);
        } else if (zzjwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, statusResultMessage.action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, statusResultMessage.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, statusResultMessage.title);
        StatusResultMessage.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, statusResultMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        StatusResultMessage statusResultMessage = (StatusResultMessage) obj;
        statusResultMessage.getClass();
        int encodedSizeWithTag2 = StatusResultMessage.Placement.ADAPTER.encodedSizeWithTag(1, statusResultMessage.placement) + statusResultMessage.unknownFields().getSize$okio();
        zzjw zzjwVar = statusResultMessage.visualAsset;
        if (zzjwVar instanceof StatusResultMessage$VisualAsset$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, ((StatusResultMessage$VisualAsset$Image) zzjwVar).value);
        } else {
            if (!(zzjwVar instanceof StatusResultMessage$VisualAsset$Animation)) {
                if (zzjwVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                return AppMessageAction.ADAPTER.encodedSizeWithTag(5, statusResultMessage.action) + protoAdapter.encodedSizeWithTag(4, statusResultMessage.subtitle) + protoAdapter.encodedSizeWithTag(3, statusResultMessage.title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Animation.ADAPTER.encodedSizeWithTag(6, ((StatusResultMessage$VisualAsset$Animation) zzjwVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return AppMessageAction.ADAPTER.encodedSizeWithTag(5, statusResultMessage.action) + protoAdapter2.encodedSizeWithTag(4, statusResultMessage.subtitle) + protoAdapter2.encodedSizeWithTag(3, statusResultMessage.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatusResultMessage statusResultMessage = (StatusResultMessage) obj;
        statusResultMessage.getClass();
        AppMessageAction appMessageAction = statusResultMessage.action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        ByteString byteString = ByteString.EMPTY;
        StatusResultMessage.Placement placement = statusResultMessage.placement;
        zzjw zzjwVar = statusResultMessage.visualAsset;
        String str = statusResultMessage.title;
        String str2 = statusResultMessage.subtitle;
        byteString.getClass();
        return new StatusResultMessage(placement, zzjwVar, str, str2, appMessageAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatusResultMessage statusResultMessage = (StatusResultMessage) obj;
        statusResultMessage.getClass();
        StatusResultMessage.Placement.ADAPTER.encodeWithTag(protoWriter, 1, statusResultMessage.placement);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, statusResultMessage.title);
        protoAdapter.encodeWithTag(protoWriter, 4, statusResultMessage.subtitle);
        AppMessageAction.ADAPTER.encodeWithTag(protoWriter, 5, statusResultMessage.action);
        zzjw zzjwVar = statusResultMessage.visualAsset;
        if (zzjwVar instanceof StatusResultMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 2, ((StatusResultMessage$VisualAsset$Image) zzjwVar).value);
        } else if (zzjwVar instanceof StatusResultMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(protoWriter, 6, ((StatusResultMessage$VisualAsset$Animation) zzjwVar).value);
        } else if (zzjwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(statusResultMessage.unknownFields());
    }
}
