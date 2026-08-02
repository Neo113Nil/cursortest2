package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class PreferredPaymentMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreferredPaymentMethod> CREATOR;
    public final String instrument_token;
    public final LocalPaymentOption preferred_payment_type;

    static {
        PreferredPaymentMethod$Companion$ADAPTER$1 preferredPaymentMethod$Companion$ADAPTER$1 = new PreferredPaymentMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreferredPaymentMethod.class), "type.googleapis.com/squareup.cash.local.client.v1.PreferredPaymentMethod", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = preferredPaymentMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(preferredPaymentMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferredPaymentMethod(LocalPaymentOption localPaymentOption, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preferred_payment_type = localPaymentOption;
        this.instrument_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreferredPaymentMethod)) {
            return false;
        }
        PreferredPaymentMethod preferredPaymentMethod = (PreferredPaymentMethod) obj;
        return Intrinsics.areEqual(unknownFields(), preferredPaymentMethod.unknownFields()) && this.preferred_payment_type == preferredPaymentMethod.preferred_payment_type && Intrinsics.areEqual(this.instrument_token, preferredPaymentMethod.instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalPaymentOption localPaymentOption = this.preferred_payment_type;
        int hashCode2 = (hashCode + (localPaymentOption != null ? localPaymentOption.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(19);
        builder.value = this.preferred_payment_type;
        builder.input_id = this.instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalPaymentOption localPaymentOption = this.preferred_payment_type;
        if (localPaymentOption != null) {
            arrayList.add("preferred_payment_type=" + localPaymentOption);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreferredPaymentMethod{", "}", 0, null, null, 56);
    }
}
