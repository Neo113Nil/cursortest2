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
public final class ShopSearchProductsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopSearchProductsResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SearchCommonSection.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopSearchProductsResponse shopSearchProductsResponse = (ShopSearchProductsResponse) obj;
        reverseProtoWriter.getClass();
        shopSearchProductsResponse.getClass();
        reverseProtoWriter.writeBytes(shopSearchProductsResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, shopSearchProductsResponse.pagination_token);
        SearchCommonSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, shopSearchProductsResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopSearchProductsResponse shopSearchProductsResponse = (ShopSearchProductsResponse) obj;
        shopSearchProductsResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, shopSearchProductsResponse.pagination_token) + SearchCommonSection.ADAPTER.asRepeated().encodedSizeWithTag(1, shopSearchProductsResponse.sections) + shopSearchProductsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopSearchProductsResponse shopSearchProductsResponse = (ShopSearchProductsResponse) obj;
        shopSearchProductsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopSearchProductsResponse.sections, SearchCommonSection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = shopSearchProductsResponse.pagination_token;
        byteString.getClass();
        return new ShopSearchProductsResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopSearchProductsResponse shopSearchProductsResponse = (ShopSearchProductsResponse) obj;
        shopSearchProductsResponse.getClass();
        SearchCommonSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shopSearchProductsResponse.sections);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shopSearchProductsResponse.pagination_token);
        protoWriter.writeBytes(shopSearchProductsResponse.unknownFields());
    }
}
