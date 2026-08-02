package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SquareWebPaymentMethodDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SquareWebPaymentMethodDetail> CREATOR;

    static {
        SquareWebPaymentMethodDetail$Companion$ADAPTER$1 squareWebPaymentMethodDetail$Companion$ADAPTER$1 = new SquareWebPaymentMethodDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SquareWebPaymentMethodDetail.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.SquareWebPaymentMethodDetail", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = squareWebPaymentMethodDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(squareWebPaymentMethodDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareWebPaymentMethodDetail(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SquareWebPaymentMethodDetail) && Intrinsics.areEqual(unknownFields(), ((SquareWebPaymentMethodDetail) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CopyCardNumber.Builder builder = new CopyCardNumber.Builder(21);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "SquareWebPaymentMethodDetail{}";
    }
}
