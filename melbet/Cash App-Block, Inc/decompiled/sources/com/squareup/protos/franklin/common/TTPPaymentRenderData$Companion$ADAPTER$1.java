package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.TTPPaymentRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TTPPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TTPPaymentRenderData((TTPPaymentRenderData.Status) obj, (Money) obj2, (Money) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = TTPPaymentRenderData.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TTPPaymentRenderData tTPPaymentRenderData = (TTPPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        tTPPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(tTPPaymentRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, tTPPaymentRenderData.application_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, tTPPaymentRenderData.auth_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, tTPPaymentRenderData.display_id);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, tTPPaymentRenderData.ttp_customer_refund_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, tTPPaymentRenderData.ttp_customer_payment_money);
        TTPPaymentRenderData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tTPPaymentRenderData.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TTPPaymentRenderData tTPPaymentRenderData = (TTPPaymentRenderData) obj;
        tTPPaymentRenderData.getClass();
        int encodedSizeWithTag = TTPPaymentRenderData.Status.ADAPTER.encodedSizeWithTag(1, tTPPaymentRenderData.status) + tTPPaymentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, tTPPaymentRenderData.ttp_customer_refund_money) + protoAdapter.encodedSizeWithTag(2, tTPPaymentRenderData.ttp_customer_payment_money) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(6, tTPPaymentRenderData.application_id) + protoAdapter2.encodedSizeWithTag(5, tTPPaymentRenderData.auth_code) + protoAdapter2.encodedSizeWithTag(4, tTPPaymentRenderData.display_id) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TTPPaymentRenderData tTPPaymentRenderData = (TTPPaymentRenderData) obj;
        tTPPaymentRenderData.getClass();
        Money money = tTPPaymentRenderData.ttp_customer_payment_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = tTPPaymentRenderData.ttp_customer_refund_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        TTPPaymentRenderData.Status status = tTPPaymentRenderData.status;
        String str = tTPPaymentRenderData.display_id;
        String str2 = tTPPaymentRenderData.auth_code;
        String str3 = tTPPaymentRenderData.application_id;
        byteString.getClass();
        return new TTPPaymentRenderData(status, money2, money4, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TTPPaymentRenderData tTPPaymentRenderData = (TTPPaymentRenderData) obj;
        tTPPaymentRenderData.getClass();
        TTPPaymentRenderData.Status.ADAPTER.encodeWithTag(protoWriter, 1, tTPPaymentRenderData.status);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, tTPPaymentRenderData.ttp_customer_payment_money);
        protoAdapter.encodeWithTag(protoWriter, 3, tTPPaymentRenderData.ttp_customer_refund_money);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, tTPPaymentRenderData.display_id);
        protoAdapter2.encodeWithTag(protoWriter, 5, tTPPaymentRenderData.auth_code);
        protoAdapter2.encodeWithTag(protoWriter, 6, tTPPaymentRenderData.application_id);
        protoWriter.writeBytes(tTPPaymentRenderData.unknownFields());
    }
}
