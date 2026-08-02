package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrand$FulfillmentSelection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBrand.FulfillmentSelection(m, arrayList, (LocalFulfillmentType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    LocalFulfillmentType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                arrayList.add(LocalAddress.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj = LocalFulfillmentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBrand.FulfillmentSelection fulfillmentSelection = (LocalBrand.FulfillmentSelection) obj;
        reverseProtoWriter.getClass();
        fulfillmentSelection.getClass();
        reverseProtoWriter.writeBytes(fulfillmentSelection.unknownFields());
        ProtoAdapter protoAdapter = LocalFulfillmentType.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fulfillmentSelection.previous_fulfillment_method_used);
        LocalAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, fulfillmentSelection.saved_delivery_addresses);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, fulfillmentSelection.available_fulfillment_types);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBrand.FulfillmentSelection fulfillmentSelection = (LocalBrand.FulfillmentSelection) obj;
        fulfillmentSelection.getClass();
        int size$okio = fulfillmentSelection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalFulfillmentType.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, fulfillmentSelection.previous_fulfillment_method_used) + LocalAddress.ADAPTER.asRepeated().encodedSizeWithTag(2, fulfillmentSelection.saved_delivery_addresses) + protoAdapter.asRepeated().encodedSizeWithTag(1, fulfillmentSelection.available_fulfillment_types) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBrand.FulfillmentSelection fulfillmentSelection = (LocalBrand.FulfillmentSelection) obj;
        fulfillmentSelection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(fulfillmentSelection.saved_delivery_addresses, LocalAddress.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = fulfillmentSelection.available_fulfillment_types;
        LocalFulfillmentType localFulfillmentType = fulfillmentSelection.previous_fulfillment_method_used;
        list.getClass();
        byteString.getClass();
        return new LocalBrand.FulfillmentSelection(list, m1169redactElements, localFulfillmentType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBrand.FulfillmentSelection fulfillmentSelection = (LocalBrand.FulfillmentSelection) obj;
        fulfillmentSelection.getClass();
        ProtoAdapter protoAdapter = LocalFulfillmentType.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, fulfillmentSelection.available_fulfillment_types);
        LocalAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, fulfillmentSelection.saved_delivery_addresses);
        protoAdapter.encodeWithTag(protoWriter, 3, fulfillmentSelection.previous_fulfillment_method_used);
        protoWriter.writeBytes(fulfillmentSelection.unknownFields());
    }
}
