package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductClassifierSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProductClassifierSearchFilter((ActivityProductClassifier) obj, (SearchFilterContains) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ActivityProductClassifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SearchFilterContains.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProductClassifierSearchFilter productClassifierSearchFilter = (ProductClassifierSearchFilter) obj;
        reverseProtoWriter.getClass();
        productClassifierSearchFilter.getClass();
        reverseProtoWriter.writeBytes(productClassifierSearchFilter.unknownFields());
        SearchFilterContains.ADAPTER.encodeWithTag(reverseProtoWriter, 2, productClassifierSearchFilter.contains);
        ActivityProductClassifier.ADAPTER.encodeWithTag(reverseProtoWriter, 1, productClassifierSearchFilter.product_classifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProductClassifierSearchFilter productClassifierSearchFilter = (ProductClassifierSearchFilter) obj;
        productClassifierSearchFilter.getClass();
        return SearchFilterContains.ADAPTER.encodedSizeWithTag(2, productClassifierSearchFilter.contains) + ActivityProductClassifier.ADAPTER.encodedSizeWithTag(1, productClassifierSearchFilter.product_classifier) + productClassifierSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProductClassifierSearchFilter productClassifierSearchFilter = (ProductClassifierSearchFilter) obj;
        productClassifierSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        ActivityProductClassifier activityProductClassifier = productClassifierSearchFilter.product_classifier;
        SearchFilterContains searchFilterContains = productClassifierSearchFilter.contains;
        byteString.getClass();
        return new ProductClassifierSearchFilter(activityProductClassifier, searchFilterContains, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProductClassifierSearchFilter productClassifierSearchFilter = (ProductClassifierSearchFilter) obj;
        productClassifierSearchFilter.getClass();
        ActivityProductClassifier.ADAPTER.encodeWithTag(protoWriter, 1, productClassifierSearchFilter.product_classifier);
        SearchFilterContains.ADAPTER.encodeWithTag(protoWriter, 2, productClassifierSearchFilter.contains);
        protoWriter.writeBytes(productClassifierSearchFilter.unknownFields());
    }
}
