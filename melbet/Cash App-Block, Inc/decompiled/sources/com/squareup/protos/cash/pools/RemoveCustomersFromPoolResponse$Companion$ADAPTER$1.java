package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RemoveCustomersFromPoolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemoveCustomersFromPoolResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RemoveCustomersFromPoolResponse.RemoveCustomerResult.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemoveCustomersFromPoolResponse removeCustomersFromPoolResponse = (RemoveCustomersFromPoolResponse) obj;
        reverseProtoWriter.getClass();
        removeCustomersFromPoolResponse.getClass();
        reverseProtoWriter.writeBytes(removeCustomersFromPoolResponse.unknownFields());
        RemoveCustomersFromPoolResponse.RemoveCustomerResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, removeCustomersFromPoolResponse.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemoveCustomersFromPoolResponse removeCustomersFromPoolResponse = (RemoveCustomersFromPoolResponse) obj;
        removeCustomersFromPoolResponse.getClass();
        return RemoveCustomersFromPoolResponse.RemoveCustomerResult.ADAPTER.asRepeated().encodedSizeWithTag(1, removeCustomersFromPoolResponse.results) + removeCustomersFromPoolResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemoveCustomersFromPoolResponse removeCustomersFromPoolResponse = (RemoveCustomersFromPoolResponse) obj;
        removeCustomersFromPoolResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(removeCustomersFromPoolResponse.results, RemoveCustomersFromPoolResponse.RemoveCustomerResult.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RemoveCustomersFromPoolResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemoveCustomersFromPoolResponse removeCustomersFromPoolResponse = (RemoveCustomersFromPoolResponse) obj;
        removeCustomersFromPoolResponse.getClass();
        RemoveCustomersFromPoolResponse.RemoveCustomerResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, removeCustomersFromPoolResponse.results);
        protoWriter.writeBytes(removeCustomersFromPoolResponse.unknownFields());
    }
}
