package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreferredPaymentMethod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PreferredPaymentMethod((LocalPaymentOption) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PreferredPaymentMethod preferredPaymentMethod = (PreferredPaymentMethod) obj;
        reverseProtoWriter.getClass();
        preferredPaymentMethod.getClass();
        reverseProtoWriter.writeBytes(preferredPaymentMethod.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, preferredPaymentMethod.instrument_token);
        LocalPaymentOption.ADAPTER.encodeWithTag(reverseProtoWriter, 1, preferredPaymentMethod.preferred_payment_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PreferredPaymentMethod preferredPaymentMethod = (PreferredPaymentMethod) obj;
        preferredPaymentMethod.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, preferredPaymentMethod.instrument_token) + LocalPaymentOption.ADAPTER.encodedSizeWithTag(1, preferredPaymentMethod.preferred_payment_type) + preferredPaymentMethod.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PreferredPaymentMethod preferredPaymentMethod = (PreferredPaymentMethod) obj;
        preferredPaymentMethod.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalPaymentOption localPaymentOption = preferredPaymentMethod.preferred_payment_type;
        String str = preferredPaymentMethod.instrument_token;
        byteString.getClass();
        return new PreferredPaymentMethod(localPaymentOption, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PreferredPaymentMethod preferredPaymentMethod = (PreferredPaymentMethod) obj;
        preferredPaymentMethod.getClass();
        LocalPaymentOption.ADAPTER.encodeWithTag(protoWriter, 1, preferredPaymentMethod.preferred_payment_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, preferredPaymentMethod.instrument_token);
        protoWriter.writeBytes(preferredPaymentMethod.unknownFields());
    }
}
