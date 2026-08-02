package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayRenderData$Refund$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayRenderData.Refund((String) obj, (String) obj2, (Money) obj3, (Money) obj4, (Long) obj5, (Long) obj6, (Long) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayRenderData.Refund refund = (CashAppPayRenderData.Refund) obj;
        reverseProtoWriter.getClass();
        refund.getClass();
        reverseProtoWriter.writeBytes(refund.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, refund.display_instrument);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, refund.captured_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, refund.voided_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, refund.authorized_at);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, refund.customer_capture_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, refund.customer_auth_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, refund.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, refund.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayRenderData.Refund refund = (CashAppPayRenderData.Refund) obj;
        refund.getClass();
        int size$okio = refund.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, refund.state) + protoAdapter.encodedSizeWithTag(1, refund.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, refund.customer_capture_money) + protoAdapter2.encodedSizeWithTag(3, refund.customer_auth_money) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(8, refund.display_instrument) + protoAdapter3.encodedSizeWithTag(7, refund.captured_at) + protoAdapter3.encodedSizeWithTag(6, refund.voided_at) + protoAdapter3.encodedSizeWithTag(5, refund.authorized_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayRenderData.Refund refund = (CashAppPayRenderData.Refund) obj;
        refund.getClass();
        Money money = refund.customer_auth_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = refund.customer_capture_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = refund.token;
        String str2 = refund.state;
        Long l = refund.authorized_at;
        Long l2 = refund.voided_at;
        Long l3 = refund.captured_at;
        String str3 = refund.display_instrument;
        byteString.getClass();
        return new CashAppPayRenderData.Refund(str, str2, money2, money4, l, l2, l3, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayRenderData.Refund refund = (CashAppPayRenderData.Refund) obj;
        refund.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, refund.token);
        protoAdapter.encodeWithTag(protoWriter, 2, refund.state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, refund.customer_auth_money);
        protoAdapter2.encodeWithTag(protoWriter, 4, refund.customer_capture_money);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 5, refund.authorized_at);
        protoAdapter3.encodeWithTag(protoWriter, 6, refund.voided_at);
        protoAdapter3.encodeWithTag(protoWriter, 7, refund.captured_at);
        protoAdapter.encodeWithTag(protoWriter, 8, refund.display_instrument);
        protoWriter.writeBytes(refund.unknownFields());
    }
}
