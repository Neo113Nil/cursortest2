package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
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

/* loaded from: classes8.dex */
public final class LiftedRestrictionTransferRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LiftedRestrictionTransferRenderData> CREATOR;
    public final Money lifted_btc_amount;
    public final Money lifted_usd_amount;
    public final String transaction_number;

    static {
        LiftedRestrictionTransferRenderData$Companion$ADAPTER$1 liftedRestrictionTransferRenderData$Companion$ADAPTER$1 = new LiftedRestrictionTransferRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LiftedRestrictionTransferRenderData.class), "type.googleapis.com/squareup.franklin.LiftedRestrictionTransferRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = liftedRestrictionTransferRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(liftedRestrictionTransferRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiftedRestrictionTransferRenderData(Money money, Money money2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.lifted_usd_amount = money;
        this.lifted_btc_amount = money2;
        this.transaction_number = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiftedRestrictionTransferRenderData)) {
            return false;
        }
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = (LiftedRestrictionTransferRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), liftedRestrictionTransferRenderData.unknownFields()) && Intrinsics.areEqual(this.lifted_usd_amount, liftedRestrictionTransferRenderData.lifted_usd_amount) && Intrinsics.areEqual(this.lifted_btc_amount, liftedRestrictionTransferRenderData.lifted_btc_amount) && Intrinsics.areEqual(this.transaction_number, liftedRestrictionTransferRenderData.transaction_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.lifted_usd_amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.lifted_btc_amount;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str = this.transaction_number;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CustomOrder.Builder builder = new CustomOrder.Builder(3);
        builder.original_share_price = this.lifted_usd_amount;
        builder.target_share_price = this.lifted_btc_amount;
        builder.period_token = this.transaction_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.lifted_usd_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("lifted_usd_amount=", money, arrayList);
        }
        Money money2 = this.lifted_btc_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("lifted_btc_amount=", money2, arrayList);
        }
        String str = this.transaction_number;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transaction_number=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LiftedRestrictionTransferRenderData{", "}", 0, null, null, 56);
    }
}
