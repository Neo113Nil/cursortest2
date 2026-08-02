package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentDevicePresentation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentDevicePresentation(m, (PaymentDevicePresentation.DeviceType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PresentationEntry.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj = PaymentDevicePresentation.DeviceType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentDevicePresentation paymentDevicePresentation = (PaymentDevicePresentation) obj;
        reverseProtoWriter.getClass();
        paymentDevicePresentation.getClass();
        reverseProtoWriter.writeBytes(paymentDevicePresentation.unknownFields());
        PaymentDevicePresentation.DeviceType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paymentDevicePresentation.device_type);
        PresentationEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paymentDevicePresentation.entries);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentDevicePresentation paymentDevicePresentation = (PaymentDevicePresentation) obj;
        paymentDevicePresentation.getClass();
        return PaymentDevicePresentation.DeviceType.ADAPTER.encodedSizeWithTag(2, paymentDevicePresentation.device_type) + PresentationEntry.ADAPTER.asRepeated().encodedSizeWithTag(1, paymentDevicePresentation.entries) + paymentDevicePresentation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentDevicePresentation paymentDevicePresentation = (PaymentDevicePresentation) obj;
        paymentDevicePresentation.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paymentDevicePresentation.entries, PresentationEntry.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        PaymentDevicePresentation.DeviceType deviceType = paymentDevicePresentation.device_type;
        byteString.getClass();
        return new PaymentDevicePresentation(m1169redactElements, deviceType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentDevicePresentation paymentDevicePresentation = (PaymentDevicePresentation) obj;
        paymentDevicePresentation.getClass();
        PresentationEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paymentDevicePresentation.entries);
        PaymentDevicePresentation.DeviceType.ADAPTER.encodeWithTag(protoWriter, 2, paymentDevicePresentation.device_type);
        protoWriter.writeBytes(paymentDevicePresentation.unknownFields());
    }
}
