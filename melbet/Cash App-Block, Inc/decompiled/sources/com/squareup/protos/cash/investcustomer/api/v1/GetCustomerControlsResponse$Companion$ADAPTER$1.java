package com.squareup.protos.cash.investcustomer.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerControlsResponse((String) obj, (CustomerControls) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CustomerControls.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerControlsResponse getCustomerControlsResponse = (GetCustomerControlsResponse) obj;
        reverseProtoWriter.getClass();
        getCustomerControlsResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomerControlsResponse.unknownFields());
        CustomerControls.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCustomerControlsResponse.customer_controls);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getCustomerControlsResponse.prerequisite_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerControlsResponse getCustomerControlsResponse = (GetCustomerControlsResponse) obj;
        getCustomerControlsResponse.getClass();
        return CustomerControls.ADAPTER.encodedSizeWithTag(2, getCustomerControlsResponse.customer_controls) + ProtoAdapter.STRING.encodedSizeWithTag(1, getCustomerControlsResponse.prerequisite_link) + getCustomerControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerControlsResponse getCustomerControlsResponse = (GetCustomerControlsResponse) obj;
        getCustomerControlsResponse.getClass();
        CustomerControls customerControls = getCustomerControlsResponse.customer_controls;
        CustomerControls customerControls2 = customerControls != null ? (CustomerControls) CustomerControls.ADAPTER.redact(customerControls) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getCustomerControlsResponse.prerequisite_link;
        byteString.getClass();
        return new GetCustomerControlsResponse(str, customerControls2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerControlsResponse getCustomerControlsResponse = (GetCustomerControlsResponse) obj;
        getCustomerControlsResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCustomerControlsResponse.prerequisite_link);
        CustomerControls.ADAPTER.encodeWithTag(protoWriter, 2, getCustomerControlsResponse.customer_controls);
        protoWriter.writeBytes(getCustomerControlsResponse.unknownFields());
    }
}
