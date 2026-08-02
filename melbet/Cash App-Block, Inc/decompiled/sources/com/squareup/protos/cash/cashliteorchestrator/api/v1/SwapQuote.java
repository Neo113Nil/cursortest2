package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
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
public final class SwapQuote extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SwapQuote> CREATOR;
    public final SwapEstimate estimate;
    public final String expires_at;
    public final String lightning_invoice;
    public final String quote_id;

    static {
        SwapQuote$Companion$ADAPTER$1 swapQuote$Companion$ADAPTER$1 = new SwapQuote$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SwapQuote.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.SwapQuote", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = swapQuote$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(swapQuote$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapQuote(String str, SwapEstimate swapEstimate, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.quote_id = str;
        this.estimate = swapEstimate;
        this.lightning_invoice = str2;
        this.expires_at = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwapQuote)) {
            return false;
        }
        SwapQuote swapQuote = (SwapQuote) obj;
        return Intrinsics.areEqual(unknownFields(), swapQuote.unknownFields()) && Intrinsics.areEqual(this.quote_id, swapQuote.quote_id) && Intrinsics.areEqual(this.estimate, swapQuote.estimate) && Intrinsics.areEqual(this.lightning_invoice, swapQuote.lightning_invoice) && Intrinsics.areEqual(this.expires_at, swapQuote.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.quote_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SwapEstimate swapEstimate = this.estimate;
        int hashCode3 = (hashCode2 + (swapEstimate != null ? swapEstimate.hashCode() : 0)) * 37;
        String str2 = this.lightning_invoice;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.expires_at;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(11, false);
        builder.title = this.quote_id;
        builder.icon = this.estimate;
        builder.enabled = this.lightning_invoice;
        builder.id = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.quote_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "quote_id=", arrayList);
        }
        SwapEstimate swapEstimate = this.estimate;
        if (swapEstimate != null) {
            arrayList.add("estimate=" + swapEstimate);
        }
        String str2 = this.lightning_invoice;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "lightning_invoice=", arrayList);
        }
        String str3 = this.expires_at;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "expires_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwapQuote{", "}", 0, null, null, 56);
    }
}
