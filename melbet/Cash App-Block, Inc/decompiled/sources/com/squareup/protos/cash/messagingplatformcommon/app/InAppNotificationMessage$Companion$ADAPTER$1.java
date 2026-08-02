package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppNotificationMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ActionEvent.Usr.Companion companion = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppNotificationMessage((Integer) obj, companion, (AppMessageAction) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    companion = new InAppNotificationMessage$VisualAsset$AssetUrl((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    companion = new InAppNotificationMessage$VisualAsset$Animation((Animation) Animation.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    companion = new InAppNotificationMessage$VisualAsset$Image((Image) Image.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    companion = new InAppNotificationMessage$VisualAsset$Avatar((Image) Image.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj;
        reverseProtoWriter.getClass();
        inAppNotificationMessage.getClass();
        reverseProtoWriter.writeBytes(inAppNotificationMessage.unknownFields());
        ActionEvent.Usr.Companion companion = inAppNotificationMessage.visualAsset;
        if (companion instanceof InAppNotificationMessage$VisualAsset$AssetUrl) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((InAppNotificationMessage$VisualAsset$AssetUrl) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((InAppNotificationMessage$VisualAsset$Animation) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((InAppNotificationMessage$VisualAsset$Image) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Avatar) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((InAppNotificationMessage$VisualAsset$Avatar) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, inAppNotificationMessage.action);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, inAppNotificationMessage.duration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj;
        inAppNotificationMessage.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.INT32.encodedSizeWithTag(1, inAppNotificationMessage.duration) + inAppNotificationMessage.unknownFields().getSize$okio();
        ActionEvent.Usr.Companion companion = inAppNotificationMessage.visualAsset;
        if (companion instanceof InAppNotificationMessage$VisualAsset$AssetUrl) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((InAppNotificationMessage$VisualAsset$AssetUrl) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Animation) {
            encodedSizeWithTag = Animation.ADAPTER.encodedSizeWithTag(4, ((InAppNotificationMessage$VisualAsset$Animation) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(5, ((InAppNotificationMessage$VisualAsset$Image) companion).value);
        } else {
            if (!(companion instanceof InAppNotificationMessage$VisualAsset$Avatar)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return AppMessageAction.ADAPTER.encodedSizeWithTag(3, inAppNotificationMessage.action) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(6, ((InAppNotificationMessage$VisualAsset$Avatar) companion).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return AppMessageAction.ADAPTER.encodedSizeWithTag(3, inAppNotificationMessage.action) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj;
        inAppNotificationMessage.getClass();
        AppMessageAction appMessageAction = inAppNotificationMessage.action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = inAppNotificationMessage.duration;
        ActionEvent.Usr.Companion companion = inAppNotificationMessage.visualAsset;
        byteString.getClass();
        return new InAppNotificationMessage(num, companion, appMessageAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj;
        inAppNotificationMessage.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inAppNotificationMessage.duration);
        AppMessageAction.ADAPTER.encodeWithTag(protoWriter, 3, inAppNotificationMessage.action);
        ActionEvent.Usr.Companion companion = inAppNotificationMessage.visualAsset;
        if (companion instanceof InAppNotificationMessage$VisualAsset$AssetUrl) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((InAppNotificationMessage$VisualAsset$AssetUrl) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Animation) {
            Animation.ADAPTER.encodeWithTag(protoWriter, 4, ((InAppNotificationMessage$VisualAsset$Animation) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 5, ((InAppNotificationMessage$VisualAsset$Image) companion).value);
        } else if (companion instanceof InAppNotificationMessage$VisualAsset$Avatar) {
            Image.ADAPTER.encodeWithTag(protoWriter, 6, ((InAppNotificationMessage$VisualAsset$Avatar) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inAppNotificationMessage.unknownFields());
    }
}
