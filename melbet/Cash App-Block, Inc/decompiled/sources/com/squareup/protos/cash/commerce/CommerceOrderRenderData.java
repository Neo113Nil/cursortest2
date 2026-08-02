package com.squareup.protos.cash.commerce;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CommerceOrderRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CommerceOrderRenderData> CREATOR;
    public final Long created_at;
    public final String order_id;
    public final Product product;
    public final List refunds;

    public enum Product implements WireEnum {
        PRODUCT_UNKNOWN(0),
        PRODUCT_CASH_APP_PAY(1),
        PRODUCT_AFTERPAY_ONLINE_CHECKOUT(2),
        PRODUCT_RETROACTIVE_FINANCING(3),
        PRODUCT_PRE_PURCHASE_FINANCING(10),
        PRODUCT_CASH_APP_CARD(4),
        PRODUCT_CASH_CARD_RETROACTIVE_FINANCING(5),
        PRODUCT_P2P_RETROACTIVE_FINANCING(9),
        PRODUCT_CASH_APP_PAY_RETROACTIVE_FINANCING(15),
        PRODUCT_AFTERPAY_PAY_IN_FOUR(6),
        PRODUCT_AFTERPAY_PAY_NOW(7),
        PRODUCT_AFTERPAY_PAY_MONTHLY(8),
        PRODUCT_CF_BNPL(12),
        PRODUCT_SINGLE_USE_PAYMENT(13),
        PRODUCT_PAYOUT(14),
        PRODUCT_OTHER(11);

        public static final CommerceOrderRenderData$Product$Companion$ADAPTER$1 ADAPTER;
        public static final ImageLayout.Companion Companion;
        public final int value;

        static {
            Product product = PRODUCT_UNKNOWN;
            Companion = new ImageLayout.Companion();
            ADAPTER = new CommerceOrderRenderData$Product$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Product.class), Syntax.PROTO_2, product);
        }

        Product(int i) {
            this.value = i;
        }

        public static final Product fromValue(int i) {
            Companion.getClass();
            return ImageLayout.Companion.m3843fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CommerceOrderRenderData$Companion$ADAPTER$1 commerceOrderRenderData$Companion$ADAPTER$1 = new CommerceOrderRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CommerceOrderRenderData.class), "type.googleapis.com/squareup.cash.commerce.CommerceOrderRenderData", Syntax.PROTO_2, null, "squareup/cash/commerce/commerce_order.proto");
        ADAPTER = commerceOrderRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(commerceOrderRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommerceOrderRenderData(String str, Long l, Product product, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.order_id = str;
        this.created_at = l;
        this.product = product;
        this.refunds = TransactorKt.immutableCopyOf("refunds", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceOrderRenderData)) {
            return false;
        }
        CommerceOrderRenderData commerceOrderRenderData = (CommerceOrderRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), commerceOrderRenderData.unknownFields()) && Intrinsics.areEqual(this.order_id, commerceOrderRenderData.order_id) && Intrinsics.areEqual(this.created_at, commerceOrderRenderData.created_at) && this.product == commerceOrderRenderData.product && Intrinsics.areEqual(this.refunds, commerceOrderRenderData.refunds);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Product product = this.product;
        int hashCode4 = this.refunds.hashCode() + ((hashCode3 + (product != null ? product.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(23, false);
        builder.title = this.order_id;
        builder.icon = this.created_at;
        builder.enabled = this.product;
        builder.id = this.refunds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Product product = this.product;
        if (product != null) {
            arrayList.add("product=" + product);
        }
        List list = this.refunds;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("refunds=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CommerceOrderRenderData{", "}", 0, null, null, 56);
    }
}
