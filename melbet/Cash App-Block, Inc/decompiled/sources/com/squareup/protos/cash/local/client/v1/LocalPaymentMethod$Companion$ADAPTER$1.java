package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalPaymentMethod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalPaymentMethod((LocalPaymentOption) obj, localPaymentMethod$PaymentMethodData$StoredInstrument, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LocalPaymentOption.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                localPaymentMethod$PaymentMethodData$StoredInstrument = new LocalPaymentMethod$PaymentMethodData$StoredInstrument((LocalStoredInstrument) LocalStoredInstrument.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalPaymentMethod localPaymentMethod = (LocalPaymentMethod) obj;
        reverseProtoWriter.getClass();
        localPaymentMethod.getClass();
        reverseProtoWriter.writeBytes(localPaymentMethod.unknownFields());
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = localPaymentMethod.payment_method_data;
        if (localPaymentMethod$PaymentMethodData$StoredInstrument != null) {
            LocalStoredInstrument.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localPaymentMethod$PaymentMethodData$StoredInstrument.value);
        } else if (localPaymentMethod$PaymentMethodData$StoredInstrument != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalPaymentOption.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localPaymentMethod.payment_option);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalPaymentMethod localPaymentMethod = (LocalPaymentMethod) obj;
        localPaymentMethod.getClass();
        int encodedSizeWithTag = LocalPaymentOption.ADAPTER.encodedSizeWithTag(1, localPaymentMethod.payment_option) + localPaymentMethod.unknownFields().getSize$okio();
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = localPaymentMethod.payment_method_data;
        if (localPaymentMethod$PaymentMethodData$StoredInstrument != null) {
            return LocalStoredInstrument.ADAPTER.encodedSizeWithTag(2, localPaymentMethod$PaymentMethodData$StoredInstrument.value) + encodedSizeWithTag;
        }
        if (localPaymentMethod$PaymentMethodData$StoredInstrument == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalPaymentMethod localPaymentMethod = (LocalPaymentMethod) obj;
        localPaymentMethod.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalPaymentOption localPaymentOption = localPaymentMethod.payment_option;
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = localPaymentMethod.payment_method_data;
        byteString.getClass();
        return new LocalPaymentMethod(localPaymentOption, localPaymentMethod$PaymentMethodData$StoredInstrument, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalPaymentMethod localPaymentMethod = (LocalPaymentMethod) obj;
        localPaymentMethod.getClass();
        LocalPaymentOption.ADAPTER.encodeWithTag(protoWriter, 1, localPaymentMethod.payment_option);
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = localPaymentMethod.payment_method_data;
        if (localPaymentMethod$PaymentMethodData$StoredInstrument != null) {
            LocalStoredInstrument.ADAPTER.encodeWithTag(protoWriter, 2, localPaymentMethod$PaymentMethodData$StoredInstrument.value);
        } else if (localPaymentMethod$PaymentMethodData$StoredInstrument != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localPaymentMethod.unknownFields());
    }
}
