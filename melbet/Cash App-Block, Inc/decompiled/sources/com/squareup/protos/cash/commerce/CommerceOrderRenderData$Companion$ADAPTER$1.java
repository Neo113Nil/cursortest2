package com.squareup.protos.cash.commerce;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.commerce.CommerceOrderRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CommerceOrderRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CommerceOrderRenderData((String) obj, (Long) obj2, (CommerceOrderRenderData.Product) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = CommerceOrderRenderData.Product.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CommerceRefund.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CommerceOrderRenderData commerceOrderRenderData = (CommerceOrderRenderData) obj;
        reverseProtoWriter.getClass();
        commerceOrderRenderData.getClass();
        reverseProtoWriter.writeBytes(commerceOrderRenderData.unknownFields());
        CommerceRefund.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, commerceOrderRenderData.refunds);
        CommerceOrderRenderData.Product.ADAPTER.encodeWithTag(reverseProtoWriter, 3, commerceOrderRenderData.product);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, commerceOrderRenderData.created_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, commerceOrderRenderData.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CommerceOrderRenderData commerceOrderRenderData = (CommerceOrderRenderData) obj;
        commerceOrderRenderData.getClass();
        return CommerceRefund.ADAPTER.asRepeated().encodedSizeWithTag(5, commerceOrderRenderData.refunds) + CommerceOrderRenderData.Product.ADAPTER.encodedSizeWithTag(3, commerceOrderRenderData.product) + ProtoAdapter.INT64.encodedSizeWithTag(2, commerceOrderRenderData.created_at) + ProtoAdapter.STRING.encodedSizeWithTag(1, commerceOrderRenderData.order_id) + commerceOrderRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CommerceOrderRenderData commerceOrderRenderData = (CommerceOrderRenderData) obj;
        commerceOrderRenderData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(commerceOrderRenderData.refunds, CommerceRefund.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = commerceOrderRenderData.order_id;
        Long l = commerceOrderRenderData.created_at;
        CommerceOrderRenderData.Product product = commerceOrderRenderData.product;
        byteString.getClass();
        return new CommerceOrderRenderData(str, l, product, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CommerceOrderRenderData commerceOrderRenderData = (CommerceOrderRenderData) obj;
        commerceOrderRenderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commerceOrderRenderData.order_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, commerceOrderRenderData.created_at);
        CommerceOrderRenderData.Product.ADAPTER.encodeWithTag(protoWriter, 3, commerceOrderRenderData.product);
        CommerceRefund.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, commerceOrderRenderData.refunds);
        protoWriter.writeBytes(commerceOrderRenderData.unknownFields());
    }
}
