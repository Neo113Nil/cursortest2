package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
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
public final class CashAppPayLineItemRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayLineItemRenderData> CREATOR;
    public final Money amount_money;
    public final String description;
    public final String image_url;
    public final List incentives;
    public final String name;
    public final String quantity;
    public final List taxes;

    public final class LineItemIncentive extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItemIncentive> CREATOR;
        public final Money amount_money;
        public final String external_incentive_uid;

        static {
            CashAppPayLineItemRenderData$LineItemIncentive$Companion$ADAPTER$1 cashAppPayLineItemRenderData$LineItemIncentive$Companion$ADAPTER$1 = new CashAppPayLineItemRenderData$LineItemIncentive$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineItemIncentive.class), "type.googleapis.com/squareup.cash.pay.CashAppPayLineItemRenderData.LineItemIncentive", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_line_item.proto");
            ADAPTER = cashAppPayLineItemRenderData$LineItemIncentive$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLineItemRenderData$LineItemIncentive$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItemIncentive(Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.external_incentive_uid = str;
            this.amount_money = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineItemIncentive)) {
                return false;
            }
            LineItemIncentive lineItemIncentive = (LineItemIncentive) obj;
            return Intrinsics.areEqual(unknownFields(), lineItemIncentive.unknownFields()) && Intrinsics.areEqual(this.external_incentive_uid, lineItemIncentive.external_incentive_uid) && Intrinsics.areEqual(this.amount_money, lineItemIncentive.amount_money);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.external_incentive_uid;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.amount_money;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BalanceImpact.Builder builder = new BalanceImpact.Builder(4);
            builder.balance_name = this.external_incentive_uid;
            builder.amount = this.amount_money;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.external_incentive_uid;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_incentive_uid=", arrayList);
            }
            Money money = this.amount_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItemIncentive{", "}", 0, null, null, 56);
        }
    }

    public final class LineItemTax extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItemTax> CREATOR;
        public final Money amount_money;
        public final String tax_uid;

        static {
            CashAppPayLineItemRenderData$LineItemTax$Companion$ADAPTER$1 cashAppPayLineItemRenderData$LineItemTax$Companion$ADAPTER$1 = new CashAppPayLineItemRenderData$LineItemTax$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineItemTax.class), "type.googleapis.com/squareup.cash.pay.CashAppPayLineItemRenderData.LineItemTax", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_line_item.proto");
            ADAPTER = cashAppPayLineItemRenderData$LineItemTax$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLineItemRenderData$LineItemTax$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItemTax(Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.tax_uid = str;
            this.amount_money = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineItemTax)) {
                return false;
            }
            LineItemTax lineItemTax = (LineItemTax) obj;
            return Intrinsics.areEqual(unknownFields(), lineItemTax.unknownFields()) && Intrinsics.areEqual(this.tax_uid, lineItemTax.tax_uid) && Intrinsics.areEqual(this.amount_money, lineItemTax.amount_money);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.tax_uid;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.amount_money;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BalanceImpact.Builder builder = new BalanceImpact.Builder(5);
            builder.balance_name = this.tax_uid;
            builder.amount = this.amount_money;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.tax_uid;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tax_uid=", arrayList);
            }
            Money money = this.amount_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItemTax{", "}", 0, null, null, 56);
        }
    }

    static {
        CashAppPayLineItemRenderData$Companion$ADAPTER$1 cashAppPayLineItemRenderData$Companion$ADAPTER$1 = new CashAppPayLineItemRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayLineItemRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayLineItemRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_line_item.proto");
        ADAPTER = cashAppPayLineItemRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLineItemRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayLineItemRenderData(String str, String str2, String str3, Money money, String str4, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.name = str;
        this.description = str2;
        this.quantity = str3;
        this.amount_money = money;
        this.image_url = str4;
        this.incentives = TransactorKt.immutableCopyOf("incentives", list);
        this.taxes = TransactorKt.immutableCopyOf("taxes", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayLineItemRenderData)) {
            return false;
        }
        CashAppPayLineItemRenderData cashAppPayLineItemRenderData = (CashAppPayLineItemRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayLineItemRenderData.unknownFields()) && Intrinsics.areEqual(this.name, cashAppPayLineItemRenderData.name) && Intrinsics.areEqual(this.description, cashAppPayLineItemRenderData.description) && Intrinsics.areEqual(this.quantity, cashAppPayLineItemRenderData.quantity) && Intrinsics.areEqual(this.amount_money, cashAppPayLineItemRenderData.amount_money) && Intrinsics.areEqual(this.image_url, cashAppPayLineItemRenderData.image_url) && Intrinsics.areEqual(this.incentives, cashAppPayLineItemRenderData.incentives) && Intrinsics.areEqual(this.taxes, cashAppPayLineItemRenderData.taxes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.quantity;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money = this.amount_money;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        String str4 = this.image_url;
        int hashCode6 = this.taxes.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.incentives);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(11);
        builder.customer_identifier = this.name;
        builder.full_name = this.description;
        builder.profile_photo_url = this.quantity;
        builder.aggregated_contribution_amount = this.amount_money;
        builder.cashtag = this.image_url;
        builder.added_at = this.incentives;
        builder.participant_type = this.taxes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        String str3 = this.quantity;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "quantity=", arrayList);
        }
        Money money = this.amount_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
        }
        String str4 = this.image_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "image_url=", arrayList);
        }
        List list = this.incentives;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("incentives=", arrayList, list);
        }
        List list2 = this.taxes;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("taxes=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayLineItemRenderData{", "}", 0, null, null, 56);
    }
}
