package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TooltipMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TooltipMessage((Placement) obj, (AppMessageAction) obj2, (TooltipMessage.ArrowPosition) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Placement.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = TooltipMessage.ArrowPosition.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TooltipMessage tooltipMessage = (TooltipMessage) obj;
        reverseProtoWriter.getClass();
        tooltipMessage.getClass();
        reverseProtoWriter.writeBytes(tooltipMessage.unknownFields());
        TooltipMessage.ArrowPosition.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tooltipMessage.arrow_position);
        AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tooltipMessage.tooltip);
        Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tooltipMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TooltipMessage tooltipMessage = (TooltipMessage) obj;
        tooltipMessage.getClass();
        return TooltipMessage.ArrowPosition.ADAPTER.encodedSizeWithTag(3, tooltipMessage.arrow_position) + AppMessageAction.ADAPTER.encodedSizeWithTag(2, tooltipMessage.tooltip) + Placement.ADAPTER.encodedSizeWithTag(1, tooltipMessage.placement) + tooltipMessage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TooltipMessage tooltipMessage = (TooltipMessage) obj;
        tooltipMessage.getClass();
        AppMessageAction appMessageAction = tooltipMessage.tooltip;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Placement placement = tooltipMessage.placement;
        TooltipMessage.ArrowPosition arrowPosition = tooltipMessage.arrow_position;
        byteString.getClass();
        return new TooltipMessage(placement, appMessageAction2, arrowPosition, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TooltipMessage tooltipMessage = (TooltipMessage) obj;
        tooltipMessage.getClass();
        Placement.ADAPTER.encodeWithTag(protoWriter, 1, tooltipMessage.placement);
        AppMessageAction.ADAPTER.encodeWithTag(protoWriter, 2, tooltipMessage.tooltip);
        TooltipMessage.ArrowPosition.ADAPTER.encodeWithTag(protoWriter, 3, tooltipMessage.arrow_position);
        protoWriter.writeBytes(tooltipMessage.unknownFields());
    }
}
