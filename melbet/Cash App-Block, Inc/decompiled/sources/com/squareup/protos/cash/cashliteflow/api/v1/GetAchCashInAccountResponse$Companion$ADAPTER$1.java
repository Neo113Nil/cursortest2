package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAchCashInAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAchCashInAccountResponse((ResponseContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Row.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAchCashInAccountResponse getAchCashInAccountResponse = (GetAchCashInAccountResponse) obj;
        reverseProtoWriter.getClass();
        getAchCashInAccountResponse.getClass();
        reverseProtoWriter.writeBytes(getAchCashInAccountResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAchCashInAccountResponse.response_context);
        Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAchCashInAccountResponse.account_info_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAchCashInAccountResponse getAchCashInAccountResponse = (GetAchCashInAccountResponse) obj;
        getAchCashInAccountResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getAchCashInAccountResponse.response_context) + Row.ADAPTER.asRepeated().encodedSizeWithTag(1, getAchCashInAccountResponse.account_info_rows) + getAchCashInAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAchCashInAccountResponse getAchCashInAccountResponse = (GetAchCashInAccountResponse) obj;
        getAchCashInAccountResponse.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ResponseContext responseContext = getAchCashInAccountResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        emptyList.getClass();
        byteString.getClass();
        return new GetAchCashInAccountResponse(responseContext2, emptyList, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAchCashInAccountResponse getAchCashInAccountResponse = (GetAchCashInAccountResponse) obj;
        getAchCashInAccountResponse.getClass();
        Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAchCashInAccountResponse.account_info_rows);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getAchCashInAccountResponse.response_context);
        protoWriter.writeBytes(getAchCashInAccountResponse.unknownFields());
    }
}
