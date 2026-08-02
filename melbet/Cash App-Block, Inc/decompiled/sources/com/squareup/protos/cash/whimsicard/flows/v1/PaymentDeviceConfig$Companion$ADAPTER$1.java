package com.squareup.protos.cash.whimsicard.flows.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentDeviceConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentDeviceConfig(m, (String) obj, (PresentationMode) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    PaymentDeviceType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = PresentationMode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentDeviceConfig paymentDeviceConfig = (PaymentDeviceConfig) obj;
        reverseProtoWriter.getClass();
        paymentDeviceConfig.getClass();
        reverseProtoWriter.writeBytes(paymentDeviceConfig.unknownFields());
        PresentationMode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paymentDeviceConfig.presentation_mode);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, paymentDeviceConfig.pre_selected_payment_device_id);
        PaymentDeviceType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paymentDeviceConfig.orderable_payment_devices);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentDeviceConfig paymentDeviceConfig = (PaymentDeviceConfig) obj;
        paymentDeviceConfig.getClass();
        return PresentationMode.ADAPTER.encodedSizeWithTag(3, paymentDeviceConfig.presentation_mode) + ProtoAdapter.STRING.encodedSizeWithTag(2, paymentDeviceConfig.pre_selected_payment_device_id) + PaymentDeviceType.ADAPTER.asRepeated().encodedSizeWithTag(1, paymentDeviceConfig.orderable_payment_devices) + paymentDeviceConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentDeviceConfig paymentDeviceConfig = (PaymentDeviceConfig) obj;
        paymentDeviceConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = paymentDeviceConfig.orderable_payment_devices;
        String str = paymentDeviceConfig.pre_selected_payment_device_id;
        PresentationMode presentationMode = paymentDeviceConfig.presentation_mode;
        list.getClass();
        byteString.getClass();
        return new PaymentDeviceConfig(list, str, presentationMode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentDeviceConfig paymentDeviceConfig = (PaymentDeviceConfig) obj;
        paymentDeviceConfig.getClass();
        PaymentDeviceType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paymentDeviceConfig.orderable_payment_devices);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, paymentDeviceConfig.pre_selected_payment_device_id);
        PresentationMode.ADAPTER.encodeWithTag(protoWriter, 3, paymentDeviceConfig.presentation_mode);
        protoWriter.writeBytes(paymentDeviceConfig.unknownFields());
    }
}
