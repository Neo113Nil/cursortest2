package com.squareup.protos.cash.spendinginsights.appapi;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RefreshCardSpendingInsightsEntryPointResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshCardSpendingInsightsEntryPointResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RefreshCardSpendingInsightsEntryPointResponse refreshCardSpendingInsightsEntryPointResponse = (RefreshCardSpendingInsightsEntryPointResponse) obj;
        reverseProtoWriter.getClass();
        refreshCardSpendingInsightsEntryPointResponse.getClass();
        reverseProtoWriter.writeBytes(refreshCardSpendingInsightsEntryPointResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshCardSpendingInsightsEntryPointResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshCardSpendingInsightsEntryPointResponse refreshCardSpendingInsightsEntryPointResponse = (RefreshCardSpendingInsightsEntryPointResponse) obj;
        refreshCardSpendingInsightsEntryPointResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, refreshCardSpendingInsightsEntryPointResponse.response_context) + refreshCardSpendingInsightsEntryPointResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshCardSpendingInsightsEntryPointResponse refreshCardSpendingInsightsEntryPointResponse = (RefreshCardSpendingInsightsEntryPointResponse) obj;
        refreshCardSpendingInsightsEntryPointResponse.getClass();
        ResponseContext responseContext = refreshCardSpendingInsightsEntryPointResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefreshCardSpendingInsightsEntryPointResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshCardSpendingInsightsEntryPointResponse refreshCardSpendingInsightsEntryPointResponse = (RefreshCardSpendingInsightsEntryPointResponse) obj;
        refreshCardSpendingInsightsEntryPointResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshCardSpendingInsightsEntryPointResponse.response_context);
        protoWriter.writeBytes(refreshCardSpendingInsightsEntryPointResponse.unknownFields());
    }
}
