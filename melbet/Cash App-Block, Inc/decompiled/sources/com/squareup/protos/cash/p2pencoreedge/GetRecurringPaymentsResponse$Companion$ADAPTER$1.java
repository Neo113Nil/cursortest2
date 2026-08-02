package com.squareup.protos.cash.p2pencoreedge;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRecurringPaymentsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRecurringPaymentsResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetRecurringPaymentsResponse.RecurringPaymentWrapper.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRecurringPaymentsResponse getRecurringPaymentsResponse = (GetRecurringPaymentsResponse) obj;
        reverseProtoWriter.getClass();
        getRecurringPaymentsResponse.getClass();
        reverseProtoWriter.writeBytes(getRecurringPaymentsResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getRecurringPaymentsResponse.create_url);
        GetRecurringPaymentsResponse.RecurringPaymentWrapper.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getRecurringPaymentsResponse.recurring_payments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRecurringPaymentsResponse getRecurringPaymentsResponse = (GetRecurringPaymentsResponse) obj;
        getRecurringPaymentsResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getRecurringPaymentsResponse.create_url) + GetRecurringPaymentsResponse.RecurringPaymentWrapper.ADAPTER.asRepeated().encodedSizeWithTag(1, getRecurringPaymentsResponse.recurring_payments) + getRecurringPaymentsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRecurringPaymentsResponse getRecurringPaymentsResponse = (GetRecurringPaymentsResponse) obj;
        getRecurringPaymentsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getRecurringPaymentsResponse.recurring_payments, GetRecurringPaymentsResponse.RecurringPaymentWrapper.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getRecurringPaymentsResponse.create_url;
        byteString.getClass();
        return new GetRecurringPaymentsResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRecurringPaymentsResponse getRecurringPaymentsResponse = (GetRecurringPaymentsResponse) obj;
        getRecurringPaymentsResponse.getClass();
        GetRecurringPaymentsResponse.RecurringPaymentWrapper.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRecurringPaymentsResponse.recurring_payments);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getRecurringPaymentsResponse.create_url);
        protoWriter.writeBytes(getRecurringPaymentsResponse.unknownFields());
    }
}
