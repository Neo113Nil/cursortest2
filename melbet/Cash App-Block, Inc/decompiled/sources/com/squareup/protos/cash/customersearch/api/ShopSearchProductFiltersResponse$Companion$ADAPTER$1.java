package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopSearchProductFiltersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopSearchProductFiltersResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Filter.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopSearchProductFiltersResponse shopSearchProductFiltersResponse = (ShopSearchProductFiltersResponse) obj;
        reverseProtoWriter.getClass();
        shopSearchProductFiltersResponse.getClass();
        reverseProtoWriter.writeBytes(shopSearchProductFiltersResponse.unknownFields());
        Filter.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, shopSearchProductFiltersResponse.available_filters);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopSearchProductFiltersResponse shopSearchProductFiltersResponse = (ShopSearchProductFiltersResponse) obj;
        shopSearchProductFiltersResponse.getClass();
        return Filter.ADAPTER.asRepeated().encodedSizeWithTag(1, shopSearchProductFiltersResponse.available_filters) + shopSearchProductFiltersResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopSearchProductFiltersResponse shopSearchProductFiltersResponse = (ShopSearchProductFiltersResponse) obj;
        shopSearchProductFiltersResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopSearchProductFiltersResponse.available_filters, Filter.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ShopSearchProductFiltersResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopSearchProductFiltersResponse shopSearchProductFiltersResponse = (ShopSearchProductFiltersResponse) obj;
        shopSearchProductFiltersResponse.getClass();
        Filter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shopSearchProductFiltersResponse.available_filters);
        protoWriter.writeBytes(shopSearchProductFiltersResponse.unknownFields());
    }
}
