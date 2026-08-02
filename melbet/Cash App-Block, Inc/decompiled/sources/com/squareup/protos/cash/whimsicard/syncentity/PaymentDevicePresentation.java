package com.squareup.protos.cash.whimsicard.syncentity;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentDevicePresentation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDevicePresentation> CREATOR;
    public final DeviceType device_type;
    public final List entries;

    public enum DeviceType implements WireEnum {
        DEVICE_TYPE_UNSPECIFIED(0),
        CASH_APP_CARD(1),
        CASH_APP_TAG(2);

        public static final PaymentDevicePresentation$DeviceType$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            DeviceType deviceType = DEVICE_TYPE_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new PaymentDevicePresentation$DeviceType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DeviceType.class), Syntax.PROTO_2, deviceType);
        }

        DeviceType(int i) {
            this.value = i;
        }

        public static final DeviceType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DEVICE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CASH_APP_CARD;
            }
            if (i != 2) {
                return null;
            }
            return CASH_APP_TAG;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PaymentDevicePresentation$Companion$ADAPTER$1 paymentDevicePresentation$Companion$ADAPTER$1 = new PaymentDevicePresentation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentDevicePresentation.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.PaymentDevicePresentation", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
        ADAPTER = paymentDevicePresentation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentDevicePresentation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDevicePresentation(List list, DeviceType deviceType, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.device_type = deviceType;
        this.entries = TransactorKt.immutableCopyOf("entries", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDevicePresentation)) {
            return false;
        }
        PaymentDevicePresentation paymentDevicePresentation = (PaymentDevicePresentation) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDevicePresentation.unknownFields()) && Intrinsics.areEqual(this.entries, paymentDevicePresentation.entries) && this.device_type == paymentDevicePresentation.device_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.entries);
        DeviceType deviceType = this.device_type;
        int hashCode = m + (deviceType != null ? deviceType.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(22);
        builder.primary_button = this.entries;
        builder.secondary_button = this.device_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.entries;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entries=", arrayList, list);
        }
        DeviceType deviceType = this.device_type;
        if (deviceType != null) {
            arrayList.add("device_type=" + deviceType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDevicePresentation{", "}", 0, null, null, 56);
    }
}
