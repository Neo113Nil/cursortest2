package com.squareup.protos.cash.fiatly.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class PaymentUpdateHeartbeat extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentUpdateHeartbeat> CREATOR;
    public final String data;

    static {
        PaymentUpdateHeartbeat$Companion$ADAPTER$1 paymentUpdateHeartbeat$Companion$ADAPTER$1 = new PaymentUpdateHeartbeat$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentUpdateHeartbeat.class), "type.googleapis.com/squareup.cash.fiatly.api.v2beta.PaymentUpdateHeartbeat", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v2beta/p2p_real_time_service.proto");
        ADAPTER = paymentUpdateHeartbeat$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentUpdateHeartbeat$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentUpdateHeartbeat(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.data = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentUpdateHeartbeat)) {
            return false;
        }
        PaymentUpdateHeartbeat paymentUpdateHeartbeat = (PaymentUpdateHeartbeat) obj;
        return Intrinsics.areEqual(unknownFields(), paymentUpdateHeartbeat.unknownFields()) && Intrinsics.areEqual(this.data, paymentUpdateHeartbeat.data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.data;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(6);
        builder.favorite_customer_token = this.data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.data;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "data=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentUpdateHeartbeat{", "}", 0, null, null, 56);
    }
}
