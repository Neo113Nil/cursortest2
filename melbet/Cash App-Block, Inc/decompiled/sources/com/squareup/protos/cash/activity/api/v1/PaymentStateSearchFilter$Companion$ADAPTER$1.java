package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/PaymentStateSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentStateSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentStateSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentStateSearchFilter((PaymentState) obj, (SearchFilterEquals) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PaymentState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SearchFilterEquals.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentStateSearchFilter paymentStateSearchFilter = (PaymentStateSearchFilter) obj;
        reverseProtoWriter.getClass();
        paymentStateSearchFilter.getClass();
        reverseProtoWriter.writeBytes(paymentStateSearchFilter.unknownFields());
        SearchFilterEquals.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paymentStateSearchFilter.equals);
        PaymentState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paymentStateSearchFilter.payment_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentStateSearchFilter paymentStateSearchFilter = (PaymentStateSearchFilter) obj;
        paymentStateSearchFilter.getClass();
        return SearchFilterEquals.ADAPTER.encodedSizeWithTag(2, paymentStateSearchFilter.equals) + PaymentState.ADAPTER.encodedSizeWithTag(1, paymentStateSearchFilter.payment_state) + paymentStateSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentStateSearchFilter paymentStateSearchFilter = (PaymentStateSearchFilter) obj;
        paymentStateSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        PaymentState paymentState = paymentStateSearchFilter.payment_state;
        SearchFilterEquals searchFilterEquals = paymentStateSearchFilter.equals;
        byteString.getClass();
        return new PaymentStateSearchFilter(paymentState, searchFilterEquals, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentStateSearchFilter paymentStateSearchFilter = (PaymentStateSearchFilter) obj;
        paymentStateSearchFilter.getClass();
        PaymentState.ADAPTER.encodeWithTag(protoWriter, 1, paymentStateSearchFilter.payment_state);
        SearchFilterEquals.ADAPTER.encodeWithTag(protoWriter, 2, paymentStateSearchFilter.equals);
        protoWriter.writeBytes(paymentStateSearchFilter.unknownFields());
    }
}
