package com.squareup.protos.cash.whimsicard.flows.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OrderPaymentDeviceFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OrderPaymentDeviceFlowParameters((PaymentDeviceOrderScenarioType) obj, (PaymentDeviceConfig) obj2, (InitiationSource) obj3, (PaymentDeviceReportReason) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PaymentDeviceOrderScenarioType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(PaymentDeviceConfig.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = InitiationSource.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = PaymentDeviceReportReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderPaymentDeviceFlowParameters orderPaymentDeviceFlowParameters = (OrderPaymentDeviceFlowParameters) obj;
        reverseProtoWriter.getClass();
        orderPaymentDeviceFlowParameters.getClass();
        reverseProtoWriter.writeBytes(orderPaymentDeviceFlowParameters.unknownFields());
        PaymentDeviceReportReason.ADAPTER.encodeWithTag(reverseProtoWriter, 4, orderPaymentDeviceFlowParameters.report_reason);
        InitiationSource.ADAPTER.encodeWithTag(reverseProtoWriter, 3, orderPaymentDeviceFlowParameters.initiation_source);
        PaymentDeviceConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, orderPaymentDeviceFlowParameters.payment_device_config);
        PaymentDeviceOrderScenarioType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderPaymentDeviceFlowParameters.scenario_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OrderPaymentDeviceFlowParameters orderPaymentDeviceFlowParameters = (OrderPaymentDeviceFlowParameters) obj;
        orderPaymentDeviceFlowParameters.getClass();
        return PaymentDeviceReportReason.ADAPTER.encodedSizeWithTag(4, orderPaymentDeviceFlowParameters.report_reason) + InitiationSource.ADAPTER.encodedSizeWithTag(3, orderPaymentDeviceFlowParameters.initiation_source) + PaymentDeviceConfig.ADAPTER.encodedSizeWithTag(2, orderPaymentDeviceFlowParameters.payment_device_config) + PaymentDeviceOrderScenarioType.ADAPTER.encodedSizeWithTag(1, orderPaymentDeviceFlowParameters.scenario_type) + orderPaymentDeviceFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderPaymentDeviceFlowParameters orderPaymentDeviceFlowParameters = (OrderPaymentDeviceFlowParameters) obj;
        orderPaymentDeviceFlowParameters.getClass();
        PaymentDeviceConfig paymentDeviceConfig = orderPaymentDeviceFlowParameters.payment_device_config;
        PaymentDeviceConfig paymentDeviceConfig2 = paymentDeviceConfig != null ? (PaymentDeviceConfig) PaymentDeviceConfig.ADAPTER.redact(paymentDeviceConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        PaymentDeviceOrderScenarioType paymentDeviceOrderScenarioType = orderPaymentDeviceFlowParameters.scenario_type;
        InitiationSource initiationSource = orderPaymentDeviceFlowParameters.initiation_source;
        PaymentDeviceReportReason paymentDeviceReportReason = orderPaymentDeviceFlowParameters.report_reason;
        byteString.getClass();
        return new OrderPaymentDeviceFlowParameters(paymentDeviceOrderScenarioType, paymentDeviceConfig2, initiationSource, paymentDeviceReportReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderPaymentDeviceFlowParameters orderPaymentDeviceFlowParameters = (OrderPaymentDeviceFlowParameters) obj;
        orderPaymentDeviceFlowParameters.getClass();
        PaymentDeviceOrderScenarioType.ADAPTER.encodeWithTag(protoWriter, 1, orderPaymentDeviceFlowParameters.scenario_type);
        PaymentDeviceConfig.ADAPTER.encodeWithTag(protoWriter, 2, orderPaymentDeviceFlowParameters.payment_device_config);
        InitiationSource.ADAPTER.encodeWithTag(protoWriter, 3, orderPaymentDeviceFlowParameters.initiation_source);
        PaymentDeviceReportReason.ADAPTER.encodeWithTag(protoWriter, 4, orderPaymentDeviceFlowParameters.report_reason);
        protoWriter.writeBytes(orderPaymentDeviceFlowParameters.unknownFields());
    }
}
