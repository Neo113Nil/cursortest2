package com.squareup.protos.cash.btcnetwork.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.portfolios.syncvalues.PortfolioState;

/* loaded from: classes7.dex */
public final class PaymentMethods extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentMethods> CREATOR;
    public final Boolean lightning;
    public final Boolean on_chain;

    static {
        PaymentMethods$Companion$ADAPTER$1 paymentMethods$Companion$ADAPTER$1 = new PaymentMethods$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentMethods.class), "type.googleapis.com/squareup.cash.btcnetwork.external.PaymentMethods", Syntax.PROTO_2, null, "squareup/cash/btcnetwork/external/public.proto");
        ADAPTER = paymentMethods$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentMethods$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethods(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.on_chain = bool;
        this.lightning = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentMethods)) {
            return false;
        }
        PaymentMethods paymentMethods = (PaymentMethods) obj;
        return Intrinsics.areEqual(unknownFields(), paymentMethods.unknownFields()) && Intrinsics.areEqual(this.on_chain, paymentMethods.on_chain) && Intrinsics.areEqual(this.lightning, paymentMethods.lightning);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.on_chain;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.lightning;
        int hashCode3 = hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PortfolioState.Builder builder = new PortfolioState.Builder(1);
        builder.has_portfolio = this.on_chain;
        builder.has_holdings = this.lightning;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.on_chain;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("on_chain=", bool, arrayList);
        }
        Boolean bool2 = this.lightning;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("lightning=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentMethods{", "}", 0, null, null, 56);
    }
}
