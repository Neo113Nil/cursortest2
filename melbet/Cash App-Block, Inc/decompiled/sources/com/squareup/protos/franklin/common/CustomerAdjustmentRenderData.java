package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerAdjustmentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerAdjustmentRenderData> CREATOR;
    public final AdditionalAchContext additional_ach_context;
    public final Action adjustment_action;
    public final String bank_name;
    public final String instrument_display_name;
    public final Long original_transaction_created_at;
    public final Product product_type;

    public enum Action implements WireEnum {
        CLAWBACK(1),
        REIMBURSEMENT(2);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final CustomerAdjustmentRenderData$Action$Companion$ADAPTER$1 ADAPTER = new CustomerAdjustmentRenderData$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return CLAWBACK;
            }
            if (i != 2) {
                return null;
            }
            return REIMBURSEMENT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class AdditionalAchContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AdditionalAchContext> CREATOR;
        public final BitcoinContext bitcoin_context;
        public final String product_id;
        public final String return_code;

        static {
            CustomerAdjustmentRenderData$AdditionalAchContext$Companion$ADAPTER$1 customerAdjustmentRenderData$AdditionalAchContext$Companion$ADAPTER$1 = new CustomerAdjustmentRenderData$AdditionalAchContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdditionalAchContext.class), "type.googleapis.com/squareup.franklin.CustomerAdjustmentRenderData.AdditionalAchContext", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = customerAdjustmentRenderData$AdditionalAchContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(customerAdjustmentRenderData$AdditionalAchContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalAchContext(BitcoinContext bitcoinContext, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.bitcoin_context = bitcoinContext;
            this.return_code = str;
            this.product_id = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdditionalAchContext)) {
                return false;
            }
            AdditionalAchContext additionalAchContext = (AdditionalAchContext) obj;
            return Intrinsics.areEqual(unknownFields(), additionalAchContext.unknownFields()) && Intrinsics.areEqual(this.bitcoin_context, additionalAchContext.bitcoin_context) && Intrinsics.areEqual(this.return_code, additionalAchContext.return_code) && Intrinsics.areEqual(this.product_id, additionalAchContext.product_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            BitcoinContext bitcoinContext = this.bitcoin_context;
            int hashCode2 = (hashCode + (bitcoinContext != null ? bitcoinContext.hashCode() : 0)) * 37;
            String str = this.return_code;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.product_id;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Institution.Builder builder = new Institution.Builder(14, false);
            builder.display_info = this.bitcoin_context;
            builder.institution_token = this.return_code;
            builder.help_menu_items = this.product_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BitcoinContext bitcoinContext = this.bitcoin_context;
            if (bitcoinContext != null) {
                arrayList.add("bitcoin_context=" + bitcoinContext);
            }
            String str = this.return_code;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "return_code=", arrayList);
            }
            String str2 = this.product_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "product_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AdditionalAchContext{", "}", 0, null, null, 56);
        }
    }

    public final class BitcoinContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BitcoinContext> CREATOR;
        public final Boolean btc_sold;

        static {
            CustomerAdjustmentRenderData$BitcoinContext$Companion$ADAPTER$1 customerAdjustmentRenderData$BitcoinContext$Companion$ADAPTER$1 = new CustomerAdjustmentRenderData$BitcoinContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinContext.class), "type.googleapis.com/squareup.franklin.CustomerAdjustmentRenderData.BitcoinContext", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = customerAdjustmentRenderData$BitcoinContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(customerAdjustmentRenderData$BitcoinContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BitcoinContext(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.btc_sold = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BitcoinContext)) {
                return false;
            }
            BitcoinContext bitcoinContext = (BitcoinContext) obj;
            return Intrinsics.areEqual(unknownFields(), bitcoinContext.unknownFields()) && Intrinsics.areEqual(this.btc_sold, bitcoinContext.btc_sold);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.btc_sold;
            int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAppLock.Builder builder = new UiAppLock.Builder(24);
            builder.activated = this.btc_sold;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.btc_sold;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("btc_sold=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinContext{", "}", 0, null, null, 56);
        }
    }

    public enum Product implements WireEnum {
        P2P_CASH(1),
        CASH_IN(2),
        CASH_OUT(3),
        UNDEFINED(4);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final CustomerAdjustmentRenderData$Product$Companion$ADAPTER$1 ADAPTER = new CustomerAdjustmentRenderData$Product$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Product.class), Syntax.PROTO_2, null);

        Product(int i) {
            this.value = i;
        }

        public static final Product fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return P2P_CASH;
            }
            if (i == 2) {
                return CASH_IN;
            }
            if (i == 3) {
                return CASH_OUT;
            }
            if (i != 4) {
                return null;
            }
            return UNDEFINED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CustomerAdjustmentRenderData$Companion$ADAPTER$1 customerAdjustmentRenderData$Companion$ADAPTER$1 = new CustomerAdjustmentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerAdjustmentRenderData.class), "type.googleapis.com/squareup.franklin.CustomerAdjustmentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = customerAdjustmentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerAdjustmentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerAdjustmentRenderData(Product product, Action action, String str, String str2, Long l, AdditionalAchContext additionalAchContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.product_type = product;
        this.adjustment_action = action;
        this.bank_name = str;
        this.instrument_display_name = str2;
        this.original_transaction_created_at = l;
        this.additional_ach_context = additionalAchContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerAdjustmentRenderData)) {
            return false;
        }
        CustomerAdjustmentRenderData customerAdjustmentRenderData = (CustomerAdjustmentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), customerAdjustmentRenderData.unknownFields()) && this.product_type == customerAdjustmentRenderData.product_type && this.adjustment_action == customerAdjustmentRenderData.adjustment_action && Intrinsics.areEqual(this.bank_name, customerAdjustmentRenderData.bank_name) && Intrinsics.areEqual(this.instrument_display_name, customerAdjustmentRenderData.instrument_display_name) && Intrinsics.areEqual(this.original_transaction_created_at, customerAdjustmentRenderData.original_transaction_created_at) && Intrinsics.areEqual(this.additional_ach_context, customerAdjustmentRenderData.additional_ach_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Product product = this.product_type;
        int hashCode2 = (hashCode + (product != null ? product.hashCode() : 0)) * 37;
        Action action = this.adjustment_action;
        int hashCode3 = (hashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        String str = this.bank_name;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_display_name;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.original_transaction_created_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        AdditionalAchContext additionalAchContext = this.additional_ach_context;
        int hashCode7 = hashCode6 + (additionalAchContext != null ? additionalAchContext.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(25, false);
        builder.title = this.product_type;
        builder.url = this.adjustment_action;
        builder.category = this.bank_name;
        builder.token = this.instrument_display_name;
        builder.document_date = this.original_transaction_created_at;
        builder.owner_token = this.additional_ach_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Product product = this.product_type;
        if (product != null) {
            arrayList.add("product_type=" + product);
        }
        Action action = this.adjustment_action;
        if (action != null) {
            arrayList.add("adjustment_action=" + action);
        }
        String str = this.bank_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "bank_name=", arrayList);
        }
        String str2 = this.instrument_display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_display_name=", arrayList);
        }
        Long l = this.original_transaction_created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("original_transaction_created_at=", l, arrayList);
        }
        AdditionalAchContext additionalAchContext = this.additional_ach_context;
        if (additionalAchContext != null) {
            arrayList.add("additional_ach_context=" + additionalAchContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerAdjustmentRenderData{", "}", 0, null, null, 56);
    }
}
