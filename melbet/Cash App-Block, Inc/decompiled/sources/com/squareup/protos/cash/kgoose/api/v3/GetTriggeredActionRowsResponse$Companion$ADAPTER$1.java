package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetTriggeredActionRowsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetTriggeredActionRowsResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TriggeredActionRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetTriggeredActionRowsResponse getTriggeredActionRowsResponse = (GetTriggeredActionRowsResponse) obj;
        reverseProtoWriter.getClass();
        getTriggeredActionRowsResponse.getClass();
        reverseProtoWriter.writeBytes(getTriggeredActionRowsResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getTriggeredActionRowsResponse.next_cursor);
        TriggeredActionRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getTriggeredActionRowsResponse.triggered_action_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetTriggeredActionRowsResponse getTriggeredActionRowsResponse = (GetTriggeredActionRowsResponse) obj;
        getTriggeredActionRowsResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getTriggeredActionRowsResponse.next_cursor) + TriggeredActionRow.ADAPTER.asRepeated().encodedSizeWithTag(1, getTriggeredActionRowsResponse.triggered_action_rows) + getTriggeredActionRowsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetTriggeredActionRowsResponse getTriggeredActionRowsResponse = (GetTriggeredActionRowsResponse) obj;
        getTriggeredActionRowsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getTriggeredActionRowsResponse.triggered_action_rows, TriggeredActionRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getTriggeredActionRowsResponse.next_cursor;
        byteString.getClass();
        return new GetTriggeredActionRowsResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetTriggeredActionRowsResponse getTriggeredActionRowsResponse = (GetTriggeredActionRowsResponse) obj;
        getTriggeredActionRowsResponse.getClass();
        TriggeredActionRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getTriggeredActionRowsResponse.triggered_action_rows);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getTriggeredActionRowsResponse.next_cursor);
        protoWriter.writeBytes(getTriggeredActionRowsResponse.unknownFields());
    }
}
