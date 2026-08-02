package com.squareup.protos.cash.marketprices.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCurrentPricesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCurrentPricesResponse((Long) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CurrentPrice.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCurrentPricesResponse getCurrentPricesResponse = (GetCurrentPricesResponse) obj;
        reverseProtoWriter.getClass();
        getCurrentPricesResponse.getClass();
        reverseProtoWriter.writeBytes(getCurrentPricesResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getCurrentPricesResponse.next_refresh_ms);
        CurrentPrice.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getCurrentPricesResponse.prices);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCurrentPricesResponse getCurrentPricesResponse = (GetCurrentPricesResponse) obj;
        getCurrentPricesResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, getCurrentPricesResponse.next_refresh_ms) + CurrentPrice.ADAPTER.asRepeated().encodedSizeWithTag(1, getCurrentPricesResponse.prices) + getCurrentPricesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCurrentPricesResponse getCurrentPricesResponse = (GetCurrentPricesResponse) obj;
        getCurrentPricesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getCurrentPricesResponse.prices, CurrentPrice.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = getCurrentPricesResponse.next_refresh_ms;
        byteString.getClass();
        return new GetCurrentPricesResponse(l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCurrentPricesResponse getCurrentPricesResponse = (GetCurrentPricesResponse) obj;
        getCurrentPricesResponse.getClass();
        CurrentPrice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCurrentPricesResponse.prices);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getCurrentPricesResponse.next_refresh_ms);
        protoWriter.writeBytes(getCurrentPricesResponse.unknownFields());
    }
}
