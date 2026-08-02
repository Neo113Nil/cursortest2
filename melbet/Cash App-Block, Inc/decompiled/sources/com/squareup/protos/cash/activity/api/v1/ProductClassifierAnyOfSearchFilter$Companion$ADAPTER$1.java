package com.squareup.protos.cash.activity.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ProductClassifierAnyOfSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductClassifierAnyOfSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProductClassifierAnyOfSearchFilter(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    ActivityProductClassifier.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProductClassifierAnyOfSearchFilter productClassifierAnyOfSearchFilter = (ProductClassifierAnyOfSearchFilter) obj;
        reverseProtoWriter.getClass();
        productClassifierAnyOfSearchFilter.getClass();
        reverseProtoWriter.writeBytes(productClassifierAnyOfSearchFilter.unknownFields());
        ActivityProductClassifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, productClassifierAnyOfSearchFilter.product_classifiers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProductClassifierAnyOfSearchFilter productClassifierAnyOfSearchFilter = (ProductClassifierAnyOfSearchFilter) obj;
        productClassifierAnyOfSearchFilter.getClass();
        return ActivityProductClassifier.ADAPTER.asRepeated().encodedSizeWithTag(1, productClassifierAnyOfSearchFilter.product_classifiers) + productClassifierAnyOfSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProductClassifierAnyOfSearchFilter productClassifierAnyOfSearchFilter = (ProductClassifierAnyOfSearchFilter) obj;
        productClassifierAnyOfSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        List<ActivityProductClassifier> list = productClassifierAnyOfSearchFilter.product_classifiers;
        list.getClass();
        byteString.getClass();
        return new ProductClassifierAnyOfSearchFilter(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProductClassifierAnyOfSearchFilter productClassifierAnyOfSearchFilter = (ProductClassifierAnyOfSearchFilter) obj;
        productClassifierAnyOfSearchFilter.getClass();
        ActivityProductClassifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, productClassifierAnyOfSearchFilter.product_classifiers);
        protoWriter.writeBytes(productClassifierAnyOfSearchFilter.unknownFields());
    }
}
