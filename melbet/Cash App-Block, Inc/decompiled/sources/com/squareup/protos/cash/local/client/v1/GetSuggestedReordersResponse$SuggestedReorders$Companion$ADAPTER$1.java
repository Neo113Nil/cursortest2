package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSuggestedReordersResponse$SuggestedReorders$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSuggestedReordersResponse.SuggestedReorders((Long) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GetSuggestedReordersResponse.Reorder.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSuggestedReordersResponse.SuggestedReorders suggestedReorders = (GetSuggestedReordersResponse.SuggestedReorders) obj;
        reverseProtoWriter.getClass();
        suggestedReorders.getClass();
        reverseProtoWriter.writeBytes(suggestedReorders.unknownFields());
        GetSuggestedReordersResponse.Reorder.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, suggestedReorders.reorders);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, suggestedReorders.expires_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSuggestedReordersResponse.SuggestedReorders suggestedReorders = (GetSuggestedReordersResponse.SuggestedReorders) obj;
        suggestedReorders.getClass();
        return GetSuggestedReordersResponse.Reorder.ADAPTER.asRepeated().encodedSizeWithTag(2, suggestedReorders.reorders) + ProtoAdapter.INT64.encodedSizeWithTag(1, suggestedReorders.expires_at) + suggestedReorders.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSuggestedReordersResponse.SuggestedReorders suggestedReorders = (GetSuggestedReordersResponse.SuggestedReorders) obj;
        suggestedReorders.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(suggestedReorders.reorders, GetSuggestedReordersResponse.Reorder.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = suggestedReorders.expires_at;
        byteString.getClass();
        return new GetSuggestedReordersResponse.SuggestedReorders(l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSuggestedReordersResponse.SuggestedReorders suggestedReorders = (GetSuggestedReordersResponse.SuggestedReorders) obj;
        suggestedReorders.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, suggestedReorders.expires_at);
        GetSuggestedReordersResponse.Reorder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, suggestedReorders.reorders);
        protoWriter.writeBytes(suggestedReorders.unknownFields());
    }
}
