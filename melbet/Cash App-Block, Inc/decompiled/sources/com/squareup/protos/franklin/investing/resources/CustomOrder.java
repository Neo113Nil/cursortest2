package com.squareup.protos.franklin.investing.resources;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LiftedRestrictionTransferRenderData;
import com.squareup.protos.franklin.common.PaymentRenderData;
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
public final class CustomOrder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomOrder> CREATOR;
    public final Money original_share_price;
    public final String period_token;
    public final Money target_share_price;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money original_share_price;
        public String period_token;
        public Money target_share_price;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CustomOrder(this.original_share_price, this.target_share_price, this.period_token, buildUnknownFields());
                case 1:
                    return new Order.CustomOrderConfiguration(this.original_share_price, this.target_share_price, this.period_token, buildUnknownFields());
                case 2:
                    return new GetRetailerLocationsResponse.Fee(this.original_share_price, this.target_share_price, this.period_token, buildUnknownFields());
                case 3:
                    return new LiftedRestrictionTransferRenderData(this.original_share_price, this.target_share_price, this.period_token, buildUnknownFields());
                default:
                    return new PaymentRenderData.CrossCurrencyRewardInfo(this.original_share_price, this.target_share_price, this.period_token, buildUnknownFields());
            }
        }
    }

    static {
        CustomOrder$Companion$ADAPTER$1 customOrder$Companion$ADAPTER$1 = new CustomOrder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomOrder.class), "type.googleapis.com/squareup.franklin.investing.resources.CustomOrder", Syntax.PROTO_2, null, "squareup/franklin/investing/resources.proto");
        ADAPTER = customOrder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customOrder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomOrder(Money money, Money money2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.period_token = str;
        this.original_share_price = money;
        this.target_share_price = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomOrder)) {
            return false;
        }
        CustomOrder customOrder = (CustomOrder) obj;
        return Intrinsics.areEqual(unknownFields(), customOrder.unknownFields()) && Intrinsics.areEqual(this.period_token, customOrder.period_token) && Intrinsics.areEqual(this.original_share_price, customOrder.original_share_price) && Intrinsics.areEqual(this.target_share_price, customOrder.target_share_price);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.period_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.original_share_price;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.target_share_price;
        int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.period_token = this.period_token;
        builder.original_share_price = this.original_share_price;
        builder.target_share_price = this.target_share_price;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.period_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "period_token=", arrayList);
        }
        Money money = this.original_share_price;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("original_share_price=", money, arrayList);
        }
        Money money2 = this.target_share_price;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_share_price=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomOrder{", "}", 0, null, null, 56);
    }
}
