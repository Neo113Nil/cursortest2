package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.InputValue;
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

/* loaded from: classes7.dex */
public final class LocalPaymentMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalPaymentMethod> CREATOR;
    public final LocalPaymentMethod$PaymentMethodData$StoredInstrument payment_method_data;
    public final LocalPaymentOption payment_option;

    static {
        LocalPaymentMethod$Companion$ADAPTER$1 localPaymentMethod$Companion$ADAPTER$1 = new LocalPaymentMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalPaymentMethod.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalPaymentMethod", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_payment_method.proto");
        ADAPTER = localPaymentMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localPaymentMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalPaymentMethod(LocalPaymentOption localPaymentOption, LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_option = localPaymentOption;
        this.payment_method_data = localPaymentMethod$PaymentMethodData$StoredInstrument;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalPaymentMethod)) {
            return false;
        }
        LocalPaymentMethod localPaymentMethod = (LocalPaymentMethod) obj;
        return Intrinsics.areEqual(unknownFields(), localPaymentMethod.unknownFields()) && this.payment_option == localPaymentMethod.payment_option && Intrinsics.areEqual(this.payment_method_data, localPaymentMethod.payment_method_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalPaymentOption localPaymentOption = this.payment_option;
        int hashCode2 = (hashCode + (localPaymentOption != null ? localPaymentOption.hashCode() : 0)) * 37;
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = this.payment_method_data;
        int hashCode3 = hashCode2 + (localPaymentMethod$PaymentMethodData$StoredInstrument != null ? localPaymentMethod$PaymentMethodData$StoredInstrument.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(17);
        builder.input_id = this.payment_option;
        builder.value = this.payment_method_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalPaymentOption localPaymentOption = this.payment_option;
        if (localPaymentOption != null) {
            arrayList.add("payment_option=" + localPaymentOption);
        }
        LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = this.payment_method_data;
        if (localPaymentMethod$PaymentMethodData$StoredInstrument != null) {
            arrayList.add("payment_method_data=" + localPaymentMethod$PaymentMethodData$StoredInstrument);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalPaymentMethod{", "}", 0, null, null, 56);
    }
}
