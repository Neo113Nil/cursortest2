package com.squareup.protos.cash.investcustomer.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetCustomerControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCustomerControlsResponse((CustomerControls) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(CustomerControls.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCustomerControlsResponse setCustomerControlsResponse = (SetCustomerControlsResponse) obj;
        reverseProtoWriter.getClass();
        setCustomerControlsResponse.getClass();
        reverseProtoWriter.writeBytes(setCustomerControlsResponse.unknownFields());
        CustomerControls.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setCustomerControlsResponse.customer_controls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCustomerControlsResponse setCustomerControlsResponse = (SetCustomerControlsResponse) obj;
        setCustomerControlsResponse.getClass();
        return CustomerControls.ADAPTER.encodedSizeWithTag(2, setCustomerControlsResponse.customer_controls) + setCustomerControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCustomerControlsResponse setCustomerControlsResponse = (SetCustomerControlsResponse) obj;
        setCustomerControlsResponse.getClass();
        CustomerControls customerControls = setCustomerControlsResponse.customer_controls;
        CustomerControls customerControls2 = customerControls != null ? (CustomerControls) CustomerControls.ADAPTER.redact(customerControls) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetCustomerControlsResponse(customerControls2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCustomerControlsResponse setCustomerControlsResponse = (SetCustomerControlsResponse) obj;
        setCustomerControlsResponse.getClass();
        CustomerControls.ADAPTER.encodeWithTag(protoWriter, 2, setCustomerControlsResponse.customer_controls);
        protoWriter.writeBytes(setCustomerControlsResponse.unknownFields());
    }
}
