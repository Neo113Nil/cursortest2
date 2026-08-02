package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
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

/* loaded from: classes7.dex */
public final class PaymentOptions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentOptions> CREATOR;
    public final List oon_payment_methods;

    static {
        PaymentOptions$Companion$ADAPTER$1 paymentOptions$Companion$ADAPTER$1 = new PaymentOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentOptions.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.PaymentOptions", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = paymentOptions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentOptions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.oon_payment_methods = TransactorKt.immutableCopyOf("oon_payment_methods", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentOptions)) {
            return false;
        }
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        return Intrinsics.areEqual(unknownFields(), paymentOptions.unknownFields()) && Intrinsics.areEqual(this.oon_payment_methods, paymentOptions.oon_payment_methods);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.oon_payment_methods.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(3, false);
        builder.pools = this.oon_payment_methods;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.oon_payment_methods;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("oon_payment_methods=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentOptions{", "}", 0, null, null, 56);
    }
}
