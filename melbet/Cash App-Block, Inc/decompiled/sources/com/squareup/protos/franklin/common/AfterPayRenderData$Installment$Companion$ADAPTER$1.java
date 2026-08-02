package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterPayRenderData$Installment$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AfterPayRenderData.Installment((String) obj, (Money) obj2, (Long) obj3, (Long) obj4, (Boolean) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
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
        AfterPayRenderData.Installment installment = (AfterPayRenderData.Installment) obj;
        reverseProtoWriter.getClass();
        installment.getClass();
        reverseProtoWriter.writeBytes(installment.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, installment.ap_consumer_uuid);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, installment.is_partial_payment);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, installment.installment_sequence_number);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, installment.total_number_of_installments);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, installment.total_order_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, installment.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterPayRenderData.Installment installment = (AfterPayRenderData.Installment) obj;
        installment.getClass();
        int size$okio = installment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, installment.total_order_amount) + protoAdapter.encodedSizeWithTag(1, installment.order_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(6, installment.ap_consumer_uuid) + ProtoAdapter.BOOL.encodedSizeWithTag(5, installment.is_partial_payment) + protoAdapter2.encodedSizeWithTag(4, installment.installment_sequence_number) + protoAdapter2.encodedSizeWithTag(3, installment.total_number_of_installments) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterPayRenderData.Installment installment = (AfterPayRenderData.Installment) obj;
        installment.getClass();
        Money money = installment.total_order_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = installment.order_id;
        Long l = installment.total_number_of_installments;
        Long l2 = installment.installment_sequence_number;
        Boolean bool = installment.is_partial_payment;
        String str2 = installment.ap_consumer_uuid;
        byteString.getClass();
        return new AfterPayRenderData.Installment(str, money2, l, l2, bool, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterPayRenderData.Installment installment = (AfterPayRenderData.Installment) obj;
        installment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, installment.order_id);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, installment.total_order_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, installment.total_number_of_installments);
        protoAdapter2.encodeWithTag(protoWriter, 4, installment.installment_sequence_number);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, installment.is_partial_payment);
        protoAdapter.encodeWithTag(protoWriter, 6, installment.ap_consumer_uuid);
        protoWriter.writeBytes(installment.unknownFields());
    }
}
