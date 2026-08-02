package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class PaymentDeviceCustomizationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDeviceCustomizationRequest> CREATOR;
    public final CustomizationInputs customization_inputs;
    public final String payment_device_id;
    public final PaymentDeviceType payment_device_type;
    public final RequestContext request_context;

    static {
        PaymentDeviceCustomizationRequest$Companion$ADAPTER$1 paymentDeviceCustomizationRequest$Companion$ADAPTER$1 = new PaymentDeviceCustomizationRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentDeviceCustomizationRequest.class), "type.googleapis.com/squareup.franklin.app.PaymentDeviceCustomizationRequest", Syntax.PROTO_2, null, "squareup/franklin/app/payment_device_customization.proto");
        ADAPTER = paymentDeviceCustomizationRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentDeviceCustomizationRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceCustomizationRequest(RequestContext requestContext, String str, PaymentDeviceType paymentDeviceType, CustomizationInputs customizationInputs, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.payment_device_id = str;
        this.payment_device_type = paymentDeviceType;
        this.customization_inputs = customizationInputs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceCustomizationRequest)) {
            return false;
        }
        PaymentDeviceCustomizationRequest paymentDeviceCustomizationRequest = (PaymentDeviceCustomizationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDeviceCustomizationRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, paymentDeviceCustomizationRequest.request_context) && Intrinsics.areEqual(this.payment_device_id, paymentDeviceCustomizationRequest.payment_device_id) && this.payment_device_type == paymentDeviceCustomizationRequest.payment_device_type && Intrinsics.areEqual(this.customization_inputs, paymentDeviceCustomizationRequest.customization_inputs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.payment_device_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        PaymentDeviceType paymentDeviceType = this.payment_device_type;
        int hashCode4 = (hashCode3 + (paymentDeviceType != null ? paymentDeviceType.hashCode() : 0)) * 37;
        CustomizationInputs customizationInputs = this.customization_inputs;
        int hashCode5 = hashCode4 + (customizationInputs != null ? customizationInputs.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(14);
        builder.button_color = this.request_context;
        builder.text_color = this.payment_device_id;
        builder.text = this.payment_device_type;
        builder.action = this.customization_inputs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.payment_device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_device_id=", arrayList);
        }
        PaymentDeviceType paymentDeviceType = this.payment_device_type;
        if (paymentDeviceType != null) {
            arrayList.add("payment_device_type=" + paymentDeviceType);
        }
        CustomizationInputs customizationInputs = this.customization_inputs;
        if (customizationInputs != null) {
            arrayList.add("customization_inputs=" + customizationInputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDeviceCustomizationRequest{", "}", 0, null, null, 56);
    }
}
