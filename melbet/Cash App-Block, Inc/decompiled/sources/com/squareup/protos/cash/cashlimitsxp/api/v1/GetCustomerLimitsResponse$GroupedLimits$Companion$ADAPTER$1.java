package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$GroupedLimits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse.GroupedLimits(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetCustomerLimitsResponse.LimitsSection.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.GroupedLimits groupedLimits = (GetCustomerLimitsResponse.GroupedLimits) obj;
        reverseProtoWriter.getClass();
        groupedLimits.getClass();
        reverseProtoWriter.writeBytes(groupedLimits.unknownFields());
        GetCustomerLimitsResponse.LimitsSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, groupedLimits.limits_sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.GroupedLimits groupedLimits = (GetCustomerLimitsResponse.GroupedLimits) obj;
        groupedLimits.getClass();
        return GetCustomerLimitsResponse.LimitsSection.ADAPTER.asRepeated().encodedSizeWithTag(1, groupedLimits.limits_sections) + groupedLimits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.GroupedLimits groupedLimits = (GetCustomerLimitsResponse.GroupedLimits) obj;
        groupedLimits.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(groupedLimits.limits_sections, GetCustomerLimitsResponse.LimitsSection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCustomerLimitsResponse.GroupedLimits(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.GroupedLimits groupedLimits = (GetCustomerLimitsResponse.GroupedLimits) obj;
        groupedLimits.getClass();
        GetCustomerLimitsResponse.LimitsSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, groupedLimits.limits_sections);
        protoWriter.writeBytes(groupedLimits.unknownFields());
    }
}
