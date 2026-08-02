package com.squareup.protos.cash.investcustomer.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerControls$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerControls((Boolean) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CustomerLimit.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerControls customerControls = (CustomerControls) obj;
        reverseProtoWriter.getClass();
        customerControls.getClass();
        reverseProtoWriter.writeBytes(customerControls.unknownFields());
        CustomerLimit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, customerControls.trading_limits);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, customerControls.trading_enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customerControls.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerControls customerControls = (CustomerControls) obj;
        customerControls.getClass();
        return CustomerLimit.ADAPTER.asRepeated().encodedSizeWithTag(3, customerControls.trading_limits) + ProtoAdapter.BOOL.encodedSizeWithTag(2, customerControls.trading_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(1, customerControls.customer_token) + customerControls.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerControls customerControls = (CustomerControls) obj;
        customerControls.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(customerControls.trading_limits, CustomerLimit.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = customerControls.customer_token;
        Boolean bool = customerControls.trading_enabled;
        byteString.getClass();
        return new CustomerControls(bool, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerControls customerControls = (CustomerControls) obj;
        customerControls.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customerControls.customer_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, customerControls.trading_enabled);
        CustomerLimit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, customerControls.trading_limits);
        protoWriter.writeBytes(customerControls.unknownFields());
    }
}
