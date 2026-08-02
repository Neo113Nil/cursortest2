package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddCustomersToPoolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddCustomersToPoolResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AddCustomersToPoolResponse.AddCustomerResult.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddCustomersToPoolResponse addCustomersToPoolResponse = (AddCustomersToPoolResponse) obj;
        reverseProtoWriter.getClass();
        addCustomersToPoolResponse.getClass();
        reverseProtoWriter.writeBytes(addCustomersToPoolResponse.unknownFields());
        AddCustomersToPoolResponse.AddCustomerResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, addCustomersToPoolResponse.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddCustomersToPoolResponse addCustomersToPoolResponse = (AddCustomersToPoolResponse) obj;
        addCustomersToPoolResponse.getClass();
        return AddCustomersToPoolResponse.AddCustomerResult.ADAPTER.asRepeated().encodedSizeWithTag(1, addCustomersToPoolResponse.results) + addCustomersToPoolResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddCustomersToPoolResponse addCustomersToPoolResponse = (AddCustomersToPoolResponse) obj;
        addCustomersToPoolResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(addCustomersToPoolResponse.results, AddCustomersToPoolResponse.AddCustomerResult.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddCustomersToPoolResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddCustomersToPoolResponse addCustomersToPoolResponse = (AddCustomersToPoolResponse) obj;
        addCustomersToPoolResponse.getClass();
        AddCustomersToPoolResponse.AddCustomerResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, addCustomersToPoolResponse.results);
        protoWriter.writeBytes(addCustomersToPoolResponse.unknownFields());
    }
}
