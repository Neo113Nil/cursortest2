package com.squareup.protos.cash.p2pencoreedge;

import androidx.room.TransactorKt;
import com.squareup.cash.p2pencore.v1.RecurringPayment;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRecurringPaymentsResponse$RecurringPaymentWrapper$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRecurringPaymentsResponse.RecurringPaymentWrapper((RecurringPayment) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RecurringPayment.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRecurringPaymentsResponse.RecurringPaymentWrapper recurringPaymentWrapper = (GetRecurringPaymentsResponse.RecurringPaymentWrapper) obj;
        reverseProtoWriter.getClass();
        recurringPaymentWrapper.getClass();
        reverseProtoWriter.writeBytes(recurringPaymentWrapper.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, recurringPaymentWrapper.time_to_payment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recurringPaymentWrapper.schedule_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recurringPaymentWrapper.edit_url);
        RecurringPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, recurringPaymentWrapper.recurring_payment);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRecurringPaymentsResponse.RecurringPaymentWrapper recurringPaymentWrapper = (GetRecurringPaymentsResponse.RecurringPaymentWrapper) obj;
        recurringPaymentWrapper.getClass();
        int encodedSizeWithTag = RecurringPayment.ADAPTER.encodedSizeWithTag(1, recurringPaymentWrapper.recurring_payment) + recurringPaymentWrapper.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, recurringPaymentWrapper.time_to_payment) + protoAdapter.encodedSizeWithTag(3, recurringPaymentWrapper.schedule_description) + protoAdapter.encodedSizeWithTag(2, recurringPaymentWrapper.edit_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRecurringPaymentsResponse.RecurringPaymentWrapper recurringPaymentWrapper = (GetRecurringPaymentsResponse.RecurringPaymentWrapper) obj;
        recurringPaymentWrapper.getClass();
        RecurringPayment recurringPayment = recurringPaymentWrapper.recurring_payment;
        RecurringPayment recurringPayment2 = recurringPayment != null ? (RecurringPayment) RecurringPayment.ADAPTER.redact(recurringPayment) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recurringPaymentWrapper.edit_url;
        String str2 = recurringPaymentWrapper.schedule_description;
        String str3 = recurringPaymentWrapper.time_to_payment;
        byteString.getClass();
        return new GetRecurringPaymentsResponse.RecurringPaymentWrapper(recurringPayment2, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRecurringPaymentsResponse.RecurringPaymentWrapper recurringPaymentWrapper = (GetRecurringPaymentsResponse.RecurringPaymentWrapper) obj;
        recurringPaymentWrapper.getClass();
        RecurringPayment.ADAPTER.encodeWithTag(protoWriter, 1, recurringPaymentWrapper.recurring_payment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, recurringPaymentWrapper.edit_url);
        protoAdapter.encodeWithTag(protoWriter, 3, recurringPaymentWrapper.schedule_description);
        protoAdapter.encodeWithTag(protoWriter, 4, recurringPaymentWrapper.time_to_payment);
        protoWriter.writeBytes(recurringPaymentWrapper.unknownFields());
    }
}
