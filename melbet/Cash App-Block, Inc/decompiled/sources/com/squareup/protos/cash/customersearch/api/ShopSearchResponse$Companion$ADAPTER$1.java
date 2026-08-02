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
public final class ShopSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopSearchResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SearchCommonSection.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopSearchResponse shopSearchResponse = (ShopSearchResponse) obj;
        reverseProtoWriter.getClass();
        shopSearchResponse.getClass();
        reverseProtoWriter.writeBytes(shopSearchResponse.unknownFields());
        SearchCommonSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, shopSearchResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopSearchResponse shopSearchResponse = (ShopSearchResponse) obj;
        shopSearchResponse.getClass();
        return SearchCommonSection.ADAPTER.asRepeated().encodedSizeWithTag(1, shopSearchResponse.sections) + shopSearchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopSearchResponse shopSearchResponse = (ShopSearchResponse) obj;
        shopSearchResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopSearchResponse.sections, SearchCommonSection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ShopSearchResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopSearchResponse shopSearchResponse = (ShopSearchResponse) obj;
        shopSearchResponse.getClass();
        SearchCommonSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shopSearchResponse.sections);
        protoWriter.writeBytes(shopSearchResponse.unknownFields());
    }
}
