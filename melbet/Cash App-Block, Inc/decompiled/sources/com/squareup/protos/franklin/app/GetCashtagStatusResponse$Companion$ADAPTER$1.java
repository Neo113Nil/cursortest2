package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.api.CashtagStatus;
import com.squareup.protos.franklin.app.GetCashtagStatusResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetCashtagStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetCashtagStatusResponse((GetCashtagStatusResponse.Status) obj, (String) obj2, (CashtagStatus) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = GetCashtagStatusResponse.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj3 = CashtagStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) obj;
        reverseProtoWriter.getClass();
        getCashtagStatusResponse.getClass();
        reverseProtoWriter.writeBytes(getCashtagStatusResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, getCashtagStatusResponse.confirm_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getCashtagStatusResponse.failure_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getCashtagStatusResponse.cashtag_url_display_text);
        CashtagStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCashtagStatusResponse.cashtag_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, getCashtagStatusResponse.cashtag_candidate);
        GetCashtagStatusResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCashtagStatusResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) obj;
        getCashtagStatusResponse.getClass();
        int encodedSizeWithTag = GetCashtagStatusResponse.Status.ADAPTER.encodedSizeWithTag(1, getCashtagStatusResponse.status) + getCashtagStatusResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, getCashtagStatusResponse.confirm_message) + protoAdapter.encodedSizeWithTag(4, getCashtagStatusResponse.failure_message) + protoAdapter.encodedSizeWithTag(3, getCashtagStatusResponse.cashtag_url_display_text) + CashtagStatus.ADAPTER.encodedSizeWithTag(2, getCashtagStatusResponse.cashtag_status) + protoAdapter.encodedSizeWithTag(6, getCashtagStatusResponse.cashtag_candidate) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) obj;
        getCashtagStatusResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        GetCashtagStatusResponse.Status status = getCashtagStatusResponse.status;
        CashtagStatus cashtagStatus = getCashtagStatusResponse.cashtag_status;
        String str = getCashtagStatusResponse.failure_message;
        String str2 = getCashtagStatusResponse.confirm_message;
        byteString.getClass();
        return new GetCashtagStatusResponse(status, null, cashtagStatus, null, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) obj;
        getCashtagStatusResponse.getClass();
        GetCashtagStatusResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, getCashtagStatusResponse.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 6, getCashtagStatusResponse.cashtag_candidate);
        CashtagStatus.ADAPTER.encodeWithTag(protoWriter, 2, getCashtagStatusResponse.cashtag_status);
        protoAdapter.encodeWithTag(protoWriter, 3, getCashtagStatusResponse.cashtag_url_display_text);
        protoAdapter.encodeWithTag(protoWriter, 4, getCashtagStatusResponse.failure_message);
        protoAdapter.encodeWithTag(protoWriter, 5, getCashtagStatusResponse.confirm_message);
        protoWriter.writeBytes(getCashtagStatusResponse.unknownFields());
    }
}
