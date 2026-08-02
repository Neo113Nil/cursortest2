package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjo zzjoVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppMessageFormat(zzjoVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzjoVar = new AppMessageFormat$Message$PopupMessage((PopupMessage) PopupMessage.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzjoVar = new AppMessageFormat$Message$InlineMessage((InlineMessage) InlineMessage.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzjoVar = new AppMessageFormat$Message$InAppNotificationMessage((InAppNotificationMessage) InAppNotificationMessage.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzjoVar = new AppMessageFormat$Message$StatusResultMessage((StatusResultMessage) StatusResultMessage.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzjoVar = new AppMessageFormat$Message$BoostMessage((BoostMessage) BoostMessage.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzjoVar = new AppMessageFormat$Message$FullScreenMessage((FullScreenMessage) FullScreenMessage.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    zzjoVar = new AppMessageFormat$Message$TooltipMessage((TooltipMessage) TooltipMessage.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    zzjoVar = new AppMessageFormat$Message$HalfSheetMessage((HalfSheetMessage) HalfSheetMessage.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    zzjoVar = new AppMessageFormat$Message$CardMessage((CardMessage) CardMessage.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    zzjoVar = new AppMessageFormat$Message$InlineV2Message((InlineV2Message) InlineV2Message.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppMessageFormat appMessageFormat = (AppMessageFormat) obj;
        appMessageFormat.getClass();
        zzjo zzjoVar = appMessageFormat.message;
        if (zzjoVar instanceof AppMessageFormat$Message$PopupMessage) {
            PopupMessage.ADAPTER.encodeWithTag(protoWriter, 1, ((AppMessageFormat$Message$PopupMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$InlineMessage) {
            InlineMessage.ADAPTER.encodeWithTag(protoWriter, 2, ((AppMessageFormat$Message$InlineMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$InAppNotificationMessage) {
            InAppNotificationMessage.ADAPTER.encodeWithTag(protoWriter, 3, ((AppMessageFormat$Message$InAppNotificationMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$StatusResultMessage) {
            StatusResultMessage.ADAPTER.encodeWithTag(protoWriter, 4, ((AppMessageFormat$Message$StatusResultMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$BoostMessage) {
            BoostMessage.ADAPTER.encodeWithTag(protoWriter, 5, ((AppMessageFormat$Message$BoostMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$FullScreenMessage) {
            FullScreenMessage.ADAPTER.encodeWithTag(protoWriter, 6, ((AppMessageFormat$Message$FullScreenMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$TooltipMessage) {
            TooltipMessage.ADAPTER.encodeWithTag(protoWriter, 7, ((AppMessageFormat$Message$TooltipMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$HalfSheetMessage) {
            HalfSheetMessage.ADAPTER.encodeWithTag(protoWriter, 8, ((AppMessageFormat$Message$HalfSheetMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$CardMessage) {
            CardMessage.ADAPTER.encodeWithTag(protoWriter, 9, ((AppMessageFormat$Message$CardMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$InlineV2Message) {
            InlineV2Message.ADAPTER.encodeWithTag(protoWriter, 10, ((AppMessageFormat$Message$InlineV2Message) zzjoVar).value);
        } else if (zzjoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(appMessageFormat.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AppMessageFormat appMessageFormat = (AppMessageFormat) obj;
        appMessageFormat.getClass();
        int size$okio = appMessageFormat.unknownFields().getSize$okio();
        zzjo zzjoVar = appMessageFormat.message;
        if (zzjoVar instanceof AppMessageFormat$Message$PopupMessage) {
            encodedSizeWithTag = PopupMessage.ADAPTER.encodedSizeWithTag(1, ((AppMessageFormat$Message$PopupMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$InlineMessage) {
            encodedSizeWithTag = InlineMessage.ADAPTER.encodedSizeWithTag(2, ((AppMessageFormat$Message$InlineMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$InAppNotificationMessage) {
            encodedSizeWithTag = InAppNotificationMessage.ADAPTER.encodedSizeWithTag(3, ((AppMessageFormat$Message$InAppNotificationMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$StatusResultMessage) {
            encodedSizeWithTag = StatusResultMessage.ADAPTER.encodedSizeWithTag(4, ((AppMessageFormat$Message$StatusResultMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$BoostMessage) {
            encodedSizeWithTag = BoostMessage.ADAPTER.encodedSizeWithTag(5, ((AppMessageFormat$Message$BoostMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$FullScreenMessage) {
            encodedSizeWithTag = FullScreenMessage.ADAPTER.encodedSizeWithTag(6, ((AppMessageFormat$Message$FullScreenMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$TooltipMessage) {
            encodedSizeWithTag = TooltipMessage.ADAPTER.encodedSizeWithTag(7, ((AppMessageFormat$Message$TooltipMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$HalfSheetMessage) {
            encodedSizeWithTag = HalfSheetMessage.ADAPTER.encodedSizeWithTag(8, ((AppMessageFormat$Message$HalfSheetMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$CardMessage) {
            encodedSizeWithTag = CardMessage.ADAPTER.encodedSizeWithTag(9, ((AppMessageFormat$Message$CardMessage) zzjoVar).value);
        } else {
            if (!(zzjoVar instanceof AppMessageFormat$Message$InlineV2Message)) {
                if (zzjoVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = InlineV2Message.ADAPTER.encodedSizeWithTag(10, ((AppMessageFormat$Message$InlineV2Message) zzjoVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppMessageFormat appMessageFormat = (AppMessageFormat) obj;
        appMessageFormat.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjo zzjoVar = appMessageFormat.message;
        byteString.getClass();
        return new AppMessageFormat(zzjoVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppMessageFormat appMessageFormat = (AppMessageFormat) obj;
        reverseProtoWriter.getClass();
        appMessageFormat.getClass();
        reverseProtoWriter.writeBytes(appMessageFormat.unknownFields());
        zzjo zzjoVar = appMessageFormat.message;
        if (zzjoVar instanceof AppMessageFormat$Message$PopupMessage) {
            PopupMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AppMessageFormat$Message$PopupMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$InlineMessage) {
            InlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AppMessageFormat$Message$InlineMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$InAppNotificationMessage) {
            InAppNotificationMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((AppMessageFormat$Message$InAppNotificationMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$StatusResultMessage) {
            StatusResultMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((AppMessageFormat$Message$StatusResultMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$BoostMessage) {
            BoostMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((AppMessageFormat$Message$BoostMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$FullScreenMessage) {
            FullScreenMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((AppMessageFormat$Message$FullScreenMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$TooltipMessage) {
            TooltipMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((AppMessageFormat$Message$TooltipMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$HalfSheetMessage) {
            HalfSheetMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((AppMessageFormat$Message$HalfSheetMessage) zzjoVar).value);
            return;
        }
        if (zzjoVar instanceof AppMessageFormat$Message$CardMessage) {
            CardMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((AppMessageFormat$Message$CardMessage) zzjoVar).value);
        } else if (zzjoVar instanceof AppMessageFormat$Message$InlineV2Message) {
            InlineV2Message.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((AppMessageFormat$Message$InlineV2Message) zzjoVar).value);
        } else {
            if (zzjoVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
