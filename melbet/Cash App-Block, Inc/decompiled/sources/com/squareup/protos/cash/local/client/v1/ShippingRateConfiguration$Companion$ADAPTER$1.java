package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShippingRateConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShippingRateConfiguration(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ShippingRate.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShippingRateConfiguration shippingRateConfiguration = (ShippingRateConfiguration) obj;
        reverseProtoWriter.getClass();
        shippingRateConfiguration.getClass();
        reverseProtoWriter.writeBytes(shippingRateConfiguration.unknownFields());
        ShippingRate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, shippingRateConfiguration.shipping_rates);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShippingRateConfiguration shippingRateConfiguration = (ShippingRateConfiguration) obj;
        shippingRateConfiguration.getClass();
        return ShippingRate.ADAPTER.asRepeated().encodedSizeWithTag(1, shippingRateConfiguration.shipping_rates) + shippingRateConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShippingRateConfiguration shippingRateConfiguration = (ShippingRateConfiguration) obj;
        shippingRateConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shippingRateConfiguration.shipping_rates, ShippingRate.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ShippingRateConfiguration(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShippingRateConfiguration shippingRateConfiguration = (ShippingRateConfiguration) obj;
        shippingRateConfiguration.getClass();
        ShippingRate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shippingRateConfiguration.shipping_rates);
        protoWriter.writeBytes(shippingRateConfiguration.unknownFields());
    }
}
