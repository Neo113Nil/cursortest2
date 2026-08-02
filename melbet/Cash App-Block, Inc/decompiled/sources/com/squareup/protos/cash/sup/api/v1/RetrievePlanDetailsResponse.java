package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftUsage;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/sup/api/v1/RetrievePlanDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/overdraft/OverdraftUsage$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RetrievePlanDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetrievePlanDetailsResponse> CREATOR;
    public final Money down_payment;
    public final Money estimated_total;

    static {
        RetrievePlanDetailsResponse$Companion$ADAPTER$1 retrievePlanDetailsResponse$Companion$ADAPTER$1 = new RetrievePlanDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetrievePlanDetailsResponse.class), "type.googleapis.com/squareup.cash.sup.api.v1.RetrievePlanDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/sup/api/v1/checkout.proto");
        ADAPTER = retrievePlanDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(retrievePlanDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrievePlanDetailsResponse(Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.down_payment = money;
        this.estimated_total = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrievePlanDetailsResponse)) {
            return false;
        }
        RetrievePlanDetailsResponse retrievePlanDetailsResponse = (RetrievePlanDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), retrievePlanDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.down_payment, retrievePlanDetailsResponse.down_payment) && Intrinsics.areEqual(this.estimated_total, retrievePlanDetailsResponse.estimated_total);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.down_payment;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.estimated_total;
        int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OverdraftUsage.Builder builder = new OverdraftUsage.Builder(4);
        builder.limit = this.down_payment;
        builder.usage = this.estimated_total;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.down_payment;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("down_payment=", money, arrayList);
        }
        Money money2 = this.estimated_total;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("estimated_total=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetrievePlanDetailsResponse{", "}", 0, null, null, 56);
    }
}
