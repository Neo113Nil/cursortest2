package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse$EligibleRetroOrdersSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RetroOrderSelectionResponse.EligibleRetroOrdersSection(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActivityRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(OrderRow.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection = (RetroOrderSelectionResponse.EligibleRetroOrdersSection) obj;
        reverseProtoWriter.getClass();
        eligibleRetroOrdersSection.getClass();
        reverseProtoWriter.writeBytes(eligibleRetroOrdersSection.unknownFields());
        OrderRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, eligibleRetroOrdersSection.order_rows);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, eligibleRetroOrdersSection.activity_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection = (RetroOrderSelectionResponse.EligibleRetroOrdersSection) obj;
        eligibleRetroOrdersSection.getClass();
        return OrderRow.ADAPTER.asRepeated().encodedSizeWithTag(2, eligibleRetroOrdersSection.order_rows) + ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(1, eligibleRetroOrdersSection.activity_rows) + eligibleRetroOrdersSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection = (RetroOrderSelectionResponse.EligibleRetroOrdersSection) obj;
        eligibleRetroOrdersSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(eligibleRetroOrdersSection.activity_rows, ActivityRow.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(eligibleRetroOrdersSection.order_rows, OrderRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RetroOrderSelectionResponse.EligibleRetroOrdersSection(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection = (RetroOrderSelectionResponse.EligibleRetroOrdersSection) obj;
        eligibleRetroOrdersSection.getClass();
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, eligibleRetroOrdersSection.activity_rows);
        OrderRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, eligibleRetroOrdersSection.order_rows);
        protoWriter.writeBytes(eligibleRetroOrdersSection.unknownFields());
    }
}
