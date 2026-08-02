package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetAllowlistForCustomerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAllowlistForCustomerResponse((Boolean) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AllowlistCustomer.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) obj;
        reverseProtoWriter.getClass();
        getAllowlistForCustomerResponse.getClass();
        reverseProtoWriter.writeBytes(getAllowlistForCustomerResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, getAllowlistForCustomerResponse.has_had_approved_contacts);
        AllowlistCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAllowlistForCustomerResponse.allowed_customers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) obj;
        getAllowlistForCustomerResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, getAllowlistForCustomerResponse.has_had_approved_contacts) + AllowlistCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, getAllowlistForCustomerResponse.allowed_customers) + getAllowlistForCustomerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) obj;
        getAllowlistForCustomerResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAllowlistForCustomerResponse.allowed_customers, AllowlistCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = getAllowlistForCustomerResponse.has_had_approved_contacts;
        byteString.getClass();
        return new GetAllowlistForCustomerResponse(bool, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) obj;
        getAllowlistForCustomerResponse.getClass();
        AllowlistCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAllowlistForCustomerResponse.allowed_customers);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getAllowlistForCustomerResponse.has_had_approved_contacts);
        protoWriter.writeBytes(getAllowlistForCustomerResponse.unknownFields());
    }
}
