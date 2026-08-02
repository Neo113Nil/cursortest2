package com.squareup.protos.cash.postbank.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDirectDepositFormResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDirectDepositFormResponse((String) obj, (String) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (String) obj6, (Long) obj7, (Money) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDirectDepositFormResponse getDirectDepositFormResponse = (GetDirectDepositFormResponse) obj;
        reverseProtoWriter.getClass();
        getDirectDepositFormResponse.getClass();
        reverseProtoWriter.writeBytes(getDirectDepositFormResponse.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 8, getDirectDepositFormResponse.amount_money);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, getDirectDepositFormResponse.file_url_expires_at);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, getDirectDepositFormResponse.file_url);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, getDirectDepositFormResponse.add_signature);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getDirectDepositFormResponse.percentage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getDirectDepositFormResponse.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getDirectDepositFormResponse.employer_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getDirectDepositFormResponse.customer_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDirectDepositFormResponse getDirectDepositFormResponse = (GetDirectDepositFormResponse) obj;
        getDirectDepositFormResponse.getClass();
        int size$okio = getDirectDepositFormResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(8, getDirectDepositFormResponse.amount_money) + ProtoAdapter.INT64.encodedSizeWithTag(7, getDirectDepositFormResponse.file_url_expires_at) + protoAdapter.encodedSizeWithTag(6, getDirectDepositFormResponse.file_url) + ProtoAdapter.BOOL.encodedSizeWithTag(5, getDirectDepositFormResponse.add_signature) + protoAdapter.encodedSizeWithTag(4, getDirectDepositFormResponse.percentage) + protoAdapter.encodedSizeWithTag(3, getDirectDepositFormResponse.amount) + protoAdapter.encodedSizeWithTag(2, getDirectDepositFormResponse.employer_name) + protoAdapter.encodedSizeWithTag(1, getDirectDepositFormResponse.customer_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDirectDepositFormResponse getDirectDepositFormResponse = (GetDirectDepositFormResponse) obj;
        getDirectDepositFormResponse.getClass();
        Money money = getDirectDepositFormResponse.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = getDirectDepositFormResponse.add_signature;
        String str = getDirectDepositFormResponse.file_url;
        Long l = getDirectDepositFormResponse.file_url_expires_at;
        byteString.getClass();
        return new GetDirectDepositFormResponse(null, null, null, null, bool, str, l, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDirectDepositFormResponse getDirectDepositFormResponse = (GetDirectDepositFormResponse) obj;
        getDirectDepositFormResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getDirectDepositFormResponse.customer_name);
        protoAdapter.encodeWithTag(protoWriter, 2, getDirectDepositFormResponse.employer_name);
        protoAdapter.encodeWithTag(protoWriter, 3, getDirectDepositFormResponse.amount);
        protoAdapter.encodeWithTag(protoWriter, 4, getDirectDepositFormResponse.percentage);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getDirectDepositFormResponse.add_signature);
        protoAdapter.encodeWithTag(protoWriter, 6, getDirectDepositFormResponse.file_url);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getDirectDepositFormResponse.file_url_expires_at);
        Money.ADAPTER.encodeWithTag(protoWriter, 8, getDirectDepositFormResponse.amount_money);
        protoWriter.writeBytes(getDirectDepositFormResponse.unknownFields());
    }
}
