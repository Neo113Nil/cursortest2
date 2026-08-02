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
public final class GetCashInAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCashInAccountResponse((ResponseContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetCashInAccountResponse getCashInAccountResponse = (GetCashInAccountResponse) obj;
        reverseProtoWriter.getClass();
        getCashInAccountResponse.getClass();
        reverseProtoWriter.writeBytes(getCashInAccountResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCashInAccountResponse.response_context);
        Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getCashInAccountResponse.account_info_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCashInAccountResponse getCashInAccountResponse = (GetCashInAccountResponse) obj;
        getCashInAccountResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getCashInAccountResponse.response_context) + Row.ADAPTER.asRepeated().encodedSizeWithTag(1, getCashInAccountResponse.account_info_rows) + getCashInAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCashInAccountResponse getCashInAccountResponse = (GetCashInAccountResponse) obj;
        getCashInAccountResponse.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ResponseContext responseContext = getCashInAccountResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        emptyList.getClass();
        byteString.getClass();
        return new GetCashInAccountResponse(responseContext2, emptyList, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCashInAccountResponse getCashInAccountResponse = (GetCashInAccountResponse) obj;
        getCashInAccountResponse.getClass();
        Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCashInAccountResponse.account_info_rows);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getCashInAccountResponse.response_context);
        protoWriter.writeBytes(getCashInAccountResponse.unknownFields());
    }
}
