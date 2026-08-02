package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.CashtagStatus;
import com.squareup.protos.franklin.app.SetCashtagResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetCashtagResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCashtagResponse((ResponseContext) obj, (SetCashtagResponse.Status) obj2, (String) obj3, (String) obj4, (CashtagStatus) obj5, (SetCashtagResponse.FailureReason) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SetCashtagResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj5 = CashtagStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 7) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 8) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj6 = SetCashtagResponse.FailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCashtagResponse setCashtagResponse = (SetCashtagResponse) obj;
        reverseProtoWriter.getClass();
        setCashtagResponse.getClass();
        reverseProtoWriter.writeBytes(setCashtagResponse.unknownFields());
        SetCashtagResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 9, setCashtagResponse.failure_reason);
        CashtagStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setCashtagResponse.cashtag_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, setCashtagResponse.cashtag_url_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, setCashtagResponse.cashtag_url);
        SetCashtagResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCashtagResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, setCashtagResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCashtagResponse setCashtagResponse = (SetCashtagResponse) obj;
        setCashtagResponse.getClass();
        int encodedSizeWithTag = SetCashtagResponse.Status.ADAPTER.encodedSizeWithTag(1, setCashtagResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(8, setCashtagResponse.response_context) + setCashtagResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SetCashtagResponse.FailureReason.ADAPTER.encodedSizeWithTag(9, setCashtagResponse.failure_reason) + CashtagStatus.ADAPTER.encodedSizeWithTag(3, setCashtagResponse.cashtag_status) + protoAdapter.encodedSizeWithTag(7, setCashtagResponse.cashtag_url_display_text) + protoAdapter.encodedSizeWithTag(2, setCashtagResponse.cashtag_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCashtagResponse setCashtagResponse = (SetCashtagResponse) obj;
        setCashtagResponse.getClass();
        ResponseContext responseContext = setCashtagResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetCashtagResponse.Status status = setCashtagResponse.status;
        CashtagStatus cashtagStatus = setCashtagResponse.cashtag_status;
        SetCashtagResponse.FailureReason failureReason = setCashtagResponse.failure_reason;
        byteString.getClass();
        return new SetCashtagResponse(responseContext2, status, null, null, cashtagStatus, failureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCashtagResponse setCashtagResponse = (SetCashtagResponse) obj;
        setCashtagResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 8, setCashtagResponse.response_context);
        SetCashtagResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setCashtagResponse.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, setCashtagResponse.cashtag_url);
        protoAdapter.encodeWithTag(protoWriter, 7, setCashtagResponse.cashtag_url_display_text);
        CashtagStatus.ADAPTER.encodeWithTag(protoWriter, 3, setCashtagResponse.cashtag_status);
        SetCashtagResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 9, setCashtagResponse.failure_reason);
        protoWriter.writeBytes(setCashtagResponse.unknownFields());
    }
}
