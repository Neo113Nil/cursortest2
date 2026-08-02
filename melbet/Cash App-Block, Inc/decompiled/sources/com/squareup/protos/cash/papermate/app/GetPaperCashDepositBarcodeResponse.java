package com.squareup.protos.cash.papermate.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.GetP2pProfileDetailsResponse;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositBarcodeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzke", "Success", "Failure", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPaperCashDepositBarcodeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaperCashDepositBarcodeResponse> CREATOR;
    public final zzke result;

    /* loaded from: classes.dex */
    public final class Failure extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Failure> CREATOR;
        public final String close_button_text;
        public final String detail_text;
        public final String title_text;

        static {
            GetPaperCashDepositBarcodeResponse$Failure$Companion$ADAPTER$1 getPaperCashDepositBarcodeResponse$Failure$Companion$ADAPTER$1 = new GetPaperCashDepositBarcodeResponse$Failure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Failure.class), "type.googleapis.com/squareup.cash.papermate.app.GetPaperCashDepositBarcodeResponse.Failure", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetPaperCashDepositBarcode.proto");
            ADAPTER = getPaperCashDepositBarcodeResponse$Failure$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaperCashDepositBarcodeResponse$Failure$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title_text = str;
            this.detail_text = str2;
            this.close_button_text = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(unknownFields(), failure.unknownFields()) && Intrinsics.areEqual(this.title_text, failure.title_text) && Intrinsics.areEqual(this.detail_text, failure.detail_text) && Intrinsics.areEqual(this.close_button_text, failure.close_button_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.close_button_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(20);
            builder.contact_support_url = this.title_text;
            builder.privacy_policy_url = this.detail_text;
            builder.terms_of_service_url = this.close_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title_text=", arrayList);
            }
            String str2 = this.detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
            }
            String str3 = this.close_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "close_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Failure{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final String barcode_detail_text;
        public final String barcode_number;
        public final String barcode_screen_fee_text;
        public final BenefitReinforcementMessage benefit_reinforcement_message;
        public final String deposit_token;
        public final List detail_rows;
        public final String detail_text;
        public final String done_button_text;
        public final Long expiration_duration_seconds;
        public final BenefitExplainerScreen explainer_screen;
        public final String retailer_screen_fee_text;
        public final String subtitle_text;
        public final String support_button_text;
        public final String support_url;
        public final String terms_text;
        public final String title_image_url;
        public final String title_text;
        public final String tutorial_button_text;

        /* loaded from: classes7.dex */
        public final class BenefitReinforcementMessage extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BenefitReinforcementMessage> CREATOR;
            public final Icon icon;
            public final String text;

            static {
                GetPaperCashDepositBarcodeResponse$Success$BenefitReinforcementMessage$Companion$ADAPTER$1 getPaperCashDepositBarcodeResponse$Success$BenefitReinforcementMessage$Companion$ADAPTER$1 = new GetPaperCashDepositBarcodeResponse$Success$BenefitReinforcementMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitReinforcementMessage.class), "type.googleapis.com/squareup.cash.papermate.app.GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetPaperCashDepositBarcode.proto");
                ADAPTER = getPaperCashDepositBarcodeResponse$Success$BenefitReinforcementMessage$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaperCashDepositBarcodeResponse$Success$BenefitReinforcementMessage$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BenefitReinforcementMessage(Icon icon, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BenefitReinforcementMessage)) {
                    return false;
                }
                BenefitReinforcementMessage benefitReinforcementMessage = (BenefitReinforcementMessage) obj;
                return Intrinsics.areEqual(unknownFields(), benefitReinforcementMessage.unknownFields()) && Intrinsics.areEqual(this.icon, benefitReinforcementMessage.icon) && Intrinsics.areEqual(this.text, benefitReinforcementMessage.text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                String str = this.text;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                GetP2pProfileDetailsResponse.TrustElement.Builder builder = new GetP2pProfileDetailsResponse.TrustElement.Builder(1);
                builder.icon = this.icon;
                builder.text = this.text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitReinforcementMessage{", "}", 0, null, null, 56);
            }
        }

        static {
            GetPaperCashDepositBarcodeResponse$Success$Companion$ADAPTER$1 getPaperCashDepositBarcodeResponse$Success$Companion$ADAPTER$1 = new GetPaperCashDepositBarcodeResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.papermate.app.GetPaperCashDepositBarcodeResponse.Success", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetPaperCashDepositBarcode.proto");
            ADAPTER = getPaperCashDepositBarcodeResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaperCashDepositBarcodeResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str, Long l, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, BenefitReinforcementMessage benefitReinforcementMessage, String str13, String str14, BenefitExplainerScreen benefitExplainerScreen, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.barcode_number = str;
            this.expiration_duration_seconds = l;
            this.title_text = str2;
            this.tutorial_button_text = str3;
            this.done_button_text = str4;
            this.deposit_token = str5;
            this.terms_text = str6;
            this.title_image_url = str7;
            this.subtitle_text = str8;
            this.barcode_detail_text = str9;
            this.detail_text = str10;
            this.support_button_text = str11;
            this.support_url = str12;
            this.benefit_reinforcement_message = benefitReinforcementMessage;
            this.retailer_screen_fee_text = str13;
            this.barcode_screen_fee_text = str14;
            this.explainer_screen = benefitExplainerScreen;
            this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.barcode_number, success.barcode_number) && Intrinsics.areEqual(this.expiration_duration_seconds, success.expiration_duration_seconds) && Intrinsics.areEqual(this.title_text, success.title_text) && Intrinsics.areEqual(this.detail_rows, success.detail_rows) && Intrinsics.areEqual(this.tutorial_button_text, success.tutorial_button_text) && Intrinsics.areEqual(this.done_button_text, success.done_button_text) && Intrinsics.areEqual(this.deposit_token, success.deposit_token) && Intrinsics.areEqual(this.terms_text, success.terms_text) && Intrinsics.areEqual(this.title_image_url, success.title_image_url) && Intrinsics.areEqual(this.subtitle_text, success.subtitle_text) && Intrinsics.areEqual(this.barcode_detail_text, success.barcode_detail_text) && Intrinsics.areEqual(this.detail_text, success.detail_text) && Intrinsics.areEqual(this.support_button_text, success.support_button_text) && Intrinsics.areEqual(this.support_url, success.support_url) && Intrinsics.areEqual(this.benefit_reinforcement_message, success.benefit_reinforcement_message) && Intrinsics.areEqual(this.retailer_screen_fee_text, success.retailer_screen_fee_text) && Intrinsics.areEqual(this.barcode_screen_fee_text, success.barcode_screen_fee_text) && Intrinsics.areEqual(this.explainer_screen, success.explainer_screen);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.barcode_number;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.expiration_duration_seconds;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            String str2 = this.title_text;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.detail_rows);
            String str3 = this.tutorial_button_text;
            int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.done_button_text;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.deposit_token;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.terms_text;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.title_image_url;
            int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.subtitle_text;
            int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
            String str9 = this.barcode_detail_text;
            int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
            String str10 = this.detail_text;
            int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
            String str11 = this.support_button_text;
            int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 37;
            String str12 = this.support_url;
            int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 37;
            BenefitReinforcementMessage benefitReinforcementMessage = this.benefit_reinforcement_message;
            int hashCode14 = (hashCode13 + (benefitReinforcementMessage != null ? benefitReinforcementMessage.hashCode() : 0)) * 37;
            String str13 = this.retailer_screen_fee_text;
            int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 37;
            String str14 = this.barcode_screen_fee_text;
            int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 37;
            BenefitExplainerScreen benefitExplainerScreen = this.explainer_screen;
            int hashCode17 = hashCode16 + (benefitExplainerScreen != null ? benefitExplainerScreen.hashCode() : 0);
            this.hashCode = hashCode17;
            return hashCode17;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BalanceData.Builder builder = new BalanceData.Builder();
            builder.enable_cryptocurrency_transfer_out_button_text = this.barcode_number;
            builder.balance_limit_groups = this.expiration_duration_seconds;
            builder.enable_cryptocurrency_transfer_in_button_text = this.title_text;
            builder.supported_transfer_instruments = this.detail_rows;
            builder.cash_balance_home_screen_button_enabled = this.tutorial_button_text;
            builder.adding_cash_enabled = this.done_button_text;
            builder.scheduled_reload_enabled = this.deposit_token;
            builder.scheduled_btc_buy_enabled = this.terms_text;
            builder.check_deposits_enabled = this.title_image_url;
            builder.bitcoin_p2p_enabled = this.subtitle_text;
            builder.cash_balance_home_screen_button_priority = this.barcode_detail_text;
            builder.enable_cryptocurrency_transfer_out_status = this.detail_text;
            builder.enable_cryptocurrency_transfer_in_status = this.support_button_text;
            builder.scheduled_reload_data = this.support_url;
            builder.scheduled_btc_buy_data = this.benefit_reinforcement_message;
            builder.direct_deposit = this.retailer_screen_fee_text;
            builder.deposit_check = this.barcode_screen_fee_text;
            builder.dda_form = this.explainer_screen;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.barcode_number;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "barcode_number=", arrayList);
            }
            Long l = this.expiration_duration_seconds;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("expiration_duration_seconds=", l, arrayList);
            }
            String str2 = this.title_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title_text=", arrayList);
            }
            List list = this.detail_rows;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
            }
            String str3 = this.tutorial_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tutorial_button_text=", arrayList);
            }
            String str4 = this.done_button_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "done_button_text=", arrayList);
            }
            String str5 = this.deposit_token;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "deposit_token=", arrayList);
            }
            String str6 = this.terms_text;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "terms_text=", arrayList);
            }
            String str7 = this.title_image_url;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "title_image_url=", arrayList);
            }
            String str8 = this.subtitle_text;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "subtitle_text=", arrayList);
            }
            String str9 = this.barcode_detail_text;
            if (str9 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "barcode_detail_text=", arrayList);
            }
            String str10 = this.detail_text;
            if (str10 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "detail_text=", arrayList);
            }
            String str11 = this.support_button_text;
            if (str11 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "support_button_text=", arrayList);
            }
            String str12 = this.support_url;
            if (str12 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "support_url=", arrayList);
            }
            BenefitReinforcementMessage benefitReinforcementMessage = this.benefit_reinforcement_message;
            if (benefitReinforcementMessage != null) {
                arrayList.add("benefit_reinforcement_message=" + benefitReinforcementMessage);
            }
            String str13 = this.retailer_screen_fee_text;
            if (str13 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "retailer_screen_fee_text=", arrayList);
            }
            String str14 = this.barcode_screen_fee_text;
            if (str14 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "barcode_screen_fee_text=", arrayList);
            }
            BenefitExplainerScreen benefitExplainerScreen = this.explainer_screen;
            if (benefitExplainerScreen != null) {
                arrayList.add("explainer_screen=" + benefitExplainerScreen);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        GetPaperCashDepositBarcodeResponse$Companion$ADAPTER$1 getPaperCashDepositBarcodeResponse$Companion$ADAPTER$1 = new GetPaperCashDepositBarcodeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaperCashDepositBarcodeResponse.class), "type.googleapis.com/squareup.cash.papermate.app.GetPaperCashDepositBarcodeResponse", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetPaperCashDepositBarcode.proto");
        ADAPTER = getPaperCashDepositBarcodeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaperCashDepositBarcodeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaperCashDepositBarcodeResponse(zzke zzkeVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = zzkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaperCashDepositBarcodeResponse)) {
            return false;
        }
        GetPaperCashDepositBarcodeResponse getPaperCashDepositBarcodeResponse = (GetPaperCashDepositBarcodeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPaperCashDepositBarcodeResponse.unknownFields()) && Intrinsics.areEqual(this.result, getPaperCashDepositBarcodeResponse.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzke zzkeVar = this.result;
        int hashCode2 = hashCode + (zzkeVar != null ? zzkeVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(25);
        builder.local_buyer = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzke zzkeVar = this.result;
        if (zzkeVar != null) {
            arrayList.add("result=" + zzkeVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaperCashDepositBarcodeResponse{", "}", 0, null, null, 56);
    }
}
