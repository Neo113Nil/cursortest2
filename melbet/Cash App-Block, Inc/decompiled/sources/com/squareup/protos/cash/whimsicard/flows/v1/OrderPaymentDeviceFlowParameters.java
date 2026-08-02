package com.squareup.protos.cash.whimsicard.flows.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OrderPaymentDeviceFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderPaymentDeviceFlowParameters> CREATOR;
    public final InitiationSource initiation_source;
    public final PaymentDeviceConfig payment_device_config;
    public final PaymentDeviceReportReason report_reason;
    public final PaymentDeviceOrderScenarioType scenario_type;

    static {
        OrderPaymentDeviceFlowParameters$Companion$ADAPTER$1 orderPaymentDeviceFlowParameters$Companion$ADAPTER$1 = new OrderPaymentDeviceFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderPaymentDeviceFlowParameters.class), "type.googleapis.com/squareup.cash.whimsicard.flows.v1.OrderPaymentDeviceFlowParameters", Syntax.PROTO_2, null, "squareup/cash/whimsicard/flows/v1/order_payment_device_flow_parameters.proto");
        ADAPTER = orderPaymentDeviceFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderPaymentDeviceFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentDeviceFlowParameters(PaymentDeviceOrderScenarioType paymentDeviceOrderScenarioType, PaymentDeviceConfig paymentDeviceConfig, InitiationSource initiationSource, PaymentDeviceReportReason paymentDeviceReportReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scenario_type = paymentDeviceOrderScenarioType;
        this.payment_device_config = paymentDeviceConfig;
        this.initiation_source = initiationSource;
        this.report_reason = paymentDeviceReportReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderPaymentDeviceFlowParameters)) {
            return false;
        }
        OrderPaymentDeviceFlowParameters orderPaymentDeviceFlowParameters = (OrderPaymentDeviceFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), orderPaymentDeviceFlowParameters.unknownFields()) && this.scenario_type == orderPaymentDeviceFlowParameters.scenario_type && Intrinsics.areEqual(this.payment_device_config, orderPaymentDeviceFlowParameters.payment_device_config) && this.initiation_source == orderPaymentDeviceFlowParameters.initiation_source && this.report_reason == orderPaymentDeviceFlowParameters.report_reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentDeviceOrderScenarioType paymentDeviceOrderScenarioType = this.scenario_type;
        int hashCode2 = (hashCode + (paymentDeviceOrderScenarioType != null ? paymentDeviceOrderScenarioType.hashCode() : 0)) * 37;
        PaymentDeviceConfig paymentDeviceConfig = this.payment_device_config;
        int hashCode3 = (hashCode2 + (paymentDeviceConfig != null ? paymentDeviceConfig.hashCode() : 0)) * 37;
        InitiationSource initiationSource = this.initiation_source;
        int hashCode4 = (hashCode3 + (initiationSource != null ? initiationSource.hashCode() : 0)) * 37;
        PaymentDeviceReportReason paymentDeviceReportReason = this.report_reason;
        int hashCode5 = hashCode4 + (paymentDeviceReportReason != null ? paymentDeviceReportReason.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(7);
        builder.button_color = this.scenario_type;
        builder.text_color = this.payment_device_config;
        builder.text = this.initiation_source;
        builder.action = this.report_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentDeviceOrderScenarioType paymentDeviceOrderScenarioType = this.scenario_type;
        if (paymentDeviceOrderScenarioType != null) {
            arrayList.add("scenario_type=" + paymentDeviceOrderScenarioType);
        }
        PaymentDeviceConfig paymentDeviceConfig = this.payment_device_config;
        if (paymentDeviceConfig != null) {
            arrayList.add("payment_device_config=" + paymentDeviceConfig);
        }
        InitiationSource initiationSource = this.initiation_source;
        if (initiationSource != null) {
            arrayList.add("initiation_source=" + initiationSource);
        }
        PaymentDeviceReportReason paymentDeviceReportReason = this.report_reason;
        if (paymentDeviceReportReason != null) {
            arrayList.add("report_reason=" + paymentDeviceReportReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderPaymentDeviceFlowParameters{", "}", 0, null, null, 56);
    }
}
