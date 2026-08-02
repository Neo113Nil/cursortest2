package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ScheduledPaymentDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScheduledPaymentDetails((Text) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(RowItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledPaymentDetails scheduledPaymentDetails = (ScheduledPaymentDetails) obj;
        reverseProtoWriter.getClass();
        scheduledPaymentDetails.getClass();
        reverseProtoWriter.writeBytes(scheduledPaymentDetails.unknownFields());
        RowItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, scheduledPaymentDetails.details);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, scheduledPaymentDetails.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledPaymentDetails scheduledPaymentDetails = (ScheduledPaymentDetails) obj;
        scheduledPaymentDetails.getClass();
        return RowItem.ADAPTER.asRepeated().encodedSizeWithTag(2, scheduledPaymentDetails.details) + Text.ADAPTER.encodedSizeWithTag(1, scheduledPaymentDetails.title) + scheduledPaymentDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledPaymentDetails scheduledPaymentDetails = (ScheduledPaymentDetails) obj;
        scheduledPaymentDetails.getClass();
        Text text = scheduledPaymentDetails.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(scheduledPaymentDetails.details, RowItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ScheduledPaymentDetails(text2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledPaymentDetails scheduledPaymentDetails = (ScheduledPaymentDetails) obj;
        scheduledPaymentDetails.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, scheduledPaymentDetails.title);
        RowItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, scheduledPaymentDetails.details);
        protoWriter.writeBytes(scheduledPaymentDetails.unknownFields());
    }
}
