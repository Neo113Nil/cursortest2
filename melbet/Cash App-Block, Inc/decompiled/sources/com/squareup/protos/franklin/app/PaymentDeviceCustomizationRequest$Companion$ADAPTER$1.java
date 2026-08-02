package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentDeviceCustomizationRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentDeviceCustomizationRequest((RequestContext) obj, (String) obj2, (PaymentDeviceType) obj3, (CustomizationInputs) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = PaymentDeviceType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CustomizationInputs.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentDeviceCustomizationRequest paymentDeviceCustomizationRequest = (PaymentDeviceCustomizationRequest) obj;
        reverseProtoWriter.getClass();
        paymentDeviceCustomizationRequest.getClass();
        reverseProtoWriter.writeBytes(paymentDeviceCustomizationRequest.unknownFields());
        CustomizationInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentDeviceCustomizationRequest.customization_inputs);
        PaymentDeviceType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paymentDeviceCustomizationRequest.payment_device_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, paymentDeviceCustomizationRequest.payment_device_id);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paymentDeviceCustomizationRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentDeviceCustomizationRequest paymentDeviceCustomizationRequest = (PaymentDeviceCustomizationRequest) obj;
        paymentDeviceCustomizationRequest.getClass();
        return CustomizationInputs.ADAPTER.encodedSizeWithTag(4, paymentDeviceCustomizationRequest.customization_inputs) + PaymentDeviceType.ADAPTER.encodedSizeWithTag(3, paymentDeviceCustomizationRequest.payment_device_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, paymentDeviceCustomizationRequest.payment_device_id) + RequestContext.ADAPTER.encodedSizeWithTag(1, paymentDeviceCustomizationRequest.request_context) + paymentDeviceCustomizationRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentDeviceCustomizationRequest paymentDeviceCustomizationRequest = (PaymentDeviceCustomizationRequest) obj;
        paymentDeviceCustomizationRequest.getClass();
        RequestContext requestContext = paymentDeviceCustomizationRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        CustomizationInputs customizationInputs = paymentDeviceCustomizationRequest.customization_inputs;
        CustomizationInputs customizationInputs2 = customizationInputs != null ? (CustomizationInputs) CustomizationInputs.ADAPTER.redact(customizationInputs) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paymentDeviceCustomizationRequest.payment_device_id;
        PaymentDeviceType paymentDeviceType = paymentDeviceCustomizationRequest.payment_device_type;
        byteString.getClass();
        return new PaymentDeviceCustomizationRequest(requestContext2, str, paymentDeviceType, customizationInputs2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentDeviceCustomizationRequest paymentDeviceCustomizationRequest = (PaymentDeviceCustomizationRequest) obj;
        paymentDeviceCustomizationRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, paymentDeviceCustomizationRequest.request_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, paymentDeviceCustomizationRequest.payment_device_id);
        PaymentDeviceType.ADAPTER.encodeWithTag(protoWriter, 3, paymentDeviceCustomizationRequest.payment_device_type);
        CustomizationInputs.ADAPTER.encodeWithTag(protoWriter, 4, paymentDeviceCustomizationRequest.customization_inputs);
        protoWriter.writeBytes(paymentDeviceCustomizationRequest.unknownFields());
    }
}
