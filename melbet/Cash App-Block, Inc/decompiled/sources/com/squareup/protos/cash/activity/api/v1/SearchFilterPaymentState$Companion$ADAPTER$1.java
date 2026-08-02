package com.squareup.protos.cash.activity.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SearchFilterPaymentState$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterPaymentState;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterPaymentState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchFilterPaymentState(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    PaymentState.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchFilterPaymentState searchFilterPaymentState = (SearchFilterPaymentState) obj;
        reverseProtoWriter.getClass();
        searchFilterPaymentState.getClass();
        reverseProtoWriter.writeBytes(searchFilterPaymentState.unknownFields());
        PaymentState.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchFilterPaymentState.filter_by_payment_states);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchFilterPaymentState searchFilterPaymentState = (SearchFilterPaymentState) obj;
        searchFilterPaymentState.getClass();
        return PaymentState.ADAPTER.asRepeated().encodedSizeWithTag(1, searchFilterPaymentState.filter_by_payment_states) + searchFilterPaymentState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchFilterPaymentState searchFilterPaymentState = (SearchFilterPaymentState) obj;
        searchFilterPaymentState.getClass();
        ByteString byteString = ByteString.EMPTY;
        List<PaymentState> list = searchFilterPaymentState.filter_by_payment_states;
        list.getClass();
        byteString.getClass();
        return new SearchFilterPaymentState(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchFilterPaymentState searchFilterPaymentState = (SearchFilterPaymentState) obj;
        searchFilterPaymentState.getClass();
        PaymentState.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchFilterPaymentState.filter_by_payment_states);
        protoWriter.writeBytes(searchFilterPaymentState.unknownFields());
    }
}
