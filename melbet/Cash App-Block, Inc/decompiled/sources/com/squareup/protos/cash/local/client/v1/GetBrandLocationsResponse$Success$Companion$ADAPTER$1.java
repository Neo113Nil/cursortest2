package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetBrandLocationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBrandLocationsResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBrandLocationsResponse.Success(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalLocationSummary.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBrandLocationsResponse.Success success = (GetBrandLocationsResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        LocalLocationSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, success.location_fulfillment_summary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBrandLocationsResponse.Success success = (GetBrandLocationsResponse.Success) obj;
        success.getClass();
        return LocalLocationSummary.ADAPTER.asRepeated().encodedSizeWithTag(1, success.location_fulfillment_summary) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBrandLocationsResponse.Success success = (GetBrandLocationsResponse.Success) obj;
        success.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(success.location_fulfillment_summary, LocalLocationSummary.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBrandLocationsResponse.Success(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBrandLocationsResponse.Success success = (GetBrandLocationsResponse.Success) obj;
        success.getClass();
        LocalLocationSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, success.location_fulfillment_summary);
        protoWriter.writeBytes(success.unknownFields());
    }
}
