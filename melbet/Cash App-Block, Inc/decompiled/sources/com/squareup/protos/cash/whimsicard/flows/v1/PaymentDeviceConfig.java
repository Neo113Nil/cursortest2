package com.squareup.protos.cash.whimsicard.flows.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentDeviceConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDeviceConfig> CREATOR;
    public final List orderable_payment_devices;
    public final String pre_selected_payment_device_id;
    public final PresentationMode presentation_mode;

    static {
        PaymentDeviceConfig$Companion$ADAPTER$1 paymentDeviceConfig$Companion$ADAPTER$1 = new PaymentDeviceConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentDeviceConfig.class), "type.googleapis.com/squareup.cash.whimsicard.flows.v1.PaymentDeviceConfig", Syntax.PROTO_2, null, "squareup/cash/whimsicard/flows/v1/order_payment_device_flow_parameters.proto");
        ADAPTER = paymentDeviceConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentDeviceConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceConfig(List list, String str, PresentationMode presentationMode, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pre_selected_payment_device_id = str;
        this.presentation_mode = presentationMode;
        this.orderable_payment_devices = TransactorKt.immutableCopyOf("orderable_payment_devices", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceConfig)) {
            return false;
        }
        PaymentDeviceConfig paymentDeviceConfig = (PaymentDeviceConfig) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDeviceConfig.unknownFields()) && Intrinsics.areEqual(this.orderable_payment_devices, paymentDeviceConfig.orderable_payment_devices) && Intrinsics.areEqual(this.pre_selected_payment_device_id, paymentDeviceConfig.pre_selected_payment_device_id) && this.presentation_mode == paymentDeviceConfig.presentation_mode;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.orderable_payment_devices);
        String str = this.pre_selected_payment_device_id;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        PresentationMode presentationMode = this.presentation_mode;
        int hashCode2 = hashCode + (presentationMode != null ? presentationMode.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(4);
        builder.f1364type = this.orderable_payment_devices;
        builder.canonical_text = this.pre_selected_payment_device_id;
        builder.formatted = this.presentation_mode;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.orderable_payment_devices;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("orderable_payment_devices=", arrayList, list);
        }
        String str = this.pre_selected_payment_device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pre_selected_payment_device_id=", arrayList);
        }
        PresentationMode presentationMode = this.presentation_mode;
        if (presentationMode != null) {
            arrayList.add("presentation_mode=" + presentationMode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDeviceConfig{", "}", 0, null, null, 56);
    }
}
