package com.squareup.protos.cash.orderly.plasma;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.papermate.enums.FeeType;
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
public final class OmsInitiateLoanPaymentFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OmsInitiateLoanPaymentFlowParameters> CREATOR;
    public final String client_id;
    public final String order_id;
    public final List products;
    public final String reference_id;

    public enum Product implements WireEnum {
        PRODUCT_RETROACTIVE_FINANCING(0),
        PRODUCT_AFTERPAY_ONLINE_CHECKOUT(1),
        PRODUCT_PRE_PURCHASE_FINANCING(2);

        public static final OmsInitiateLoanPaymentFlowParameters$Product$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            Product product = PRODUCT_RETROACTIVE_FINANCING;
            Companion = new FeeType.Companion();
            ADAPTER = new OmsInitiateLoanPaymentFlowParameters$Product$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Product.class), Syntax.PROTO_2, product);
        }

        Product(int i) {
            this.value = i;
        }

        public static final Product fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PRODUCT_RETROACTIVE_FINANCING;
            }
            if (i == 1) {
                return PRODUCT_AFTERPAY_ONLINE_CHECKOUT;
            }
            if (i != 2) {
                return null;
            }
            return PRODUCT_PRE_PURCHASE_FINANCING;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        OmsInitiateLoanPaymentFlowParameters$Companion$ADAPTER$1 omsInitiateLoanPaymentFlowParameters$Companion$ADAPTER$1 = new OmsInitiateLoanPaymentFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OmsInitiateLoanPaymentFlowParameters.class), "type.googleapis.com/squareup.cash.orderly.plasma.OmsInitiateLoanPaymentFlowParameters", Syntax.PROTO_2, null, "squareup/cash/orderly/plasma/oms_initiate_loan_payment_flow.proto");
        ADAPTER = omsInitiateLoanPaymentFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(omsInitiateLoanPaymentFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmsInitiateLoanPaymentFlowParameters(String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.order_id = str;
        this.client_id = str2;
        this.reference_id = str3;
        this.products = TransactorKt.immutableCopyOf("products", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsInitiateLoanPaymentFlowParameters)) {
            return false;
        }
        OmsInitiateLoanPaymentFlowParameters omsInitiateLoanPaymentFlowParameters = (OmsInitiateLoanPaymentFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), omsInitiateLoanPaymentFlowParameters.unknownFields()) && Intrinsics.areEqual(this.order_id, omsInitiateLoanPaymentFlowParameters.order_id) && Intrinsics.areEqual(this.client_id, omsInitiateLoanPaymentFlowParameters.client_id) && Intrinsics.areEqual(this.reference_id, omsInitiateLoanPaymentFlowParameters.reference_id) && Intrinsics.areEqual(this.products, omsInitiateLoanPaymentFlowParameters.products);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.client_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.reference_id;
        int hashCode4 = this.products.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.SessionAuthentication.Builder builder = new Action.SessionAuthentication.Builder(1);
        builder.associated_request_id = this.order_id;
        builder.associated_redirect_url = this.client_id;
        builder.associated_client_id = this.reference_id;
        builder.scopes = this.products;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        String str2 = this.client_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_id=", arrayList);
        }
        String str3 = this.reference_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "reference_id=", arrayList);
        }
        List list = this.products;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("products=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OmsInitiateLoanPaymentFlowParameters{", "}", 0, null, null, 56);
    }
}
