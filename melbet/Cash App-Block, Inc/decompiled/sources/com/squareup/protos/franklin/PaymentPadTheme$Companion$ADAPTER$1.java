package com.squareup.protos.franklin;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentPadTheme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                try {
                    obj = PaymentPadThemeIdentifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        PaymentPadThemeIdentifier paymentPadThemeIdentifier = (PaymentPadThemeIdentifier) obj;
        if (paymentPadThemeIdentifier != null) {
            return new PaymentPadTheme(paymentPadThemeIdentifier, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "id");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj;
        reverseProtoWriter.getClass();
        paymentPadTheme.getClass();
        reverseProtoWriter.writeBytes(paymentPadTheme.unknownFields());
        PaymentPadThemeIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paymentPadTheme.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj;
        paymentPadTheme.getClass();
        return PaymentPadThemeIdentifier.ADAPTER.encodedSizeWithTag(1, paymentPadTheme.id) + paymentPadTheme.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj;
        paymentPadTheme.getClass();
        ByteString byteString = ByteString.EMPTY;
        PaymentPadThemeIdentifier paymentPadThemeIdentifier = paymentPadTheme.id;
        paymentPadThemeIdentifier.getClass();
        byteString.getClass();
        return new PaymentPadTheme(paymentPadThemeIdentifier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj;
        paymentPadTheme.getClass();
        PaymentPadThemeIdentifier.ADAPTER.encodeWithTag(protoWriter, 1, paymentPadTheme.id);
        protoWriter.writeBytes(paymentPadTheme.unknownFields());
    }
}
