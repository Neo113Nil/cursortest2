package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.google.android.gms.internal.mlkit_vision_common.zzib;
import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.google.android.gms.internal.mlkit_vision_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzim;
import com.google.android.gms.internal.mlkit_vision_common.zzis;
import com.google.android.gms.internal.mlkit_vision_common.zzjb;
import com.google.android.gms.internal.mlkit_vision_common.zzjc;
import com.google.android.gms.internal.mlkit_vision_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_common.zzje;
import com.google.android.gms.internal.mlkit_vision_common.zzji;
import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessageByTemplateTokenResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.GetDetailsPageResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageComponent;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageImage;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageImageAsset;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageSpacerSize;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageVerticalSpacer;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile$Payload$V1;
import com.squareup.protos.cash.papermate.api.PaperMoneyDeposit;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositResponse;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningsChartRequest;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningsChartResponse;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.piggybank.appapi.GetInterestSettingsResponse;
import com.squareup.protos.cash.pools.Instrument;
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
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes7.dex */
public final class LocalBuyer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalBuyer> CREATOR;
    public final zzis local_buyer;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object local_buyer;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalBuyer((zzis) this.local_buyer, buildUnknownFields());
                case 1:
                    return new GetDiscountDetailResponse((zzib) this.local_buyer, buildUnknownFields());
                case 2:
                    return new GetEditorialResponse.EditorialContent((zzic) this.local_buyer, buildUnknownFields());
                case 3:
                    return new GetFulfillmentSchedulingQuoteResponse((RumTagsUtilsKt) this.local_buyer, buildUnknownFields());
                case 4:
                    return new GetMarketingCouponOfferDetailsResponse((RuntimeUtilsKt) this.local_buyer, buildUnknownFields());
                case 5:
                    return new GetSuggestedReordersResponse((zzij) this.local_buyer, buildUnknownFields());
                case 6:
                    return new InputValue.InputData((zzil) this.local_buyer, buildUnknownFields());
                case 7:
                    return new ListAppointmentsResponse((zzim) this.local_buyer, buildUnknownFields());
                case 8:
                    return new LocalMenuItemDeal((LocalMenuItemDeal$Deal$AdjustedPrice) this.local_buyer, buildUnknownFields());
                case 9:
                    return new LocalMenuItemDealAdjustedPrice((LocalMoney) this.local_buyer, buildUnknownFields());
                case 10:
                    return new RescheduleAppointmentResponse((zzjb) this.local_buyer, buildUnknownFields());
                case 11:
                    return new SetOrderLiveActivityTokenResponse((zzjc) this.local_buyer, buildUnknownFields());
                case 12:
                    return new SetPushToStartLiveActivityTokenResponse((zzjd) this.local_buyer, buildUnknownFields());
                case 13:
                    return new ShortlinkAppAction((zzje) this.local_buyer, buildUnknownFields());
                case 14:
                    return new UpdateUserIntentResponse((zzji) this.local_buyer, buildUnknownFields());
                case 15:
                    return new UpdateUserIntentResponse.Success((LocalUserIntent) this.local_buyer, buildUnknownFields());
                case 16:
                    return new Animation((zzjm) this.local_buyer, buildUnknownFields());
                case 17:
                    return new AppMessageFormat((zzjo) this.local_buyer, buildUnknownFields());
                case 18:
                    return new GetAppMessageByTemplateTokenResponse((AppMessage) this.local_buyer, buildUnknownFields());
                case 19:
                    return new GetDetailsPageResponse((DetailsPageView) this.local_buyer, buildUnknownFields());
                case 20:
                    return new Image((zzjs) this.local_buyer, buildUnknownFields());
                case 21:
                    return new DetailsPageComponent((zzjz) this.local_buyer, buildUnknownFields());
                case 22:
                    return new DetailsPageImage((DetailsPageImageAsset) this.local_buyer, buildUnknownFields());
                case 23:
                    return new DetailsPageVerticalSpacer((DetailsPageSpacerSize) this.local_buyer, buildUnknownFields());
                case 24:
                    return new VersionedFinishSetupTile((VersionedFinishSetupTile$Payload$V1) this.local_buyer, buildUnknownFields());
                case 25:
                    return new GetPaperCashDepositBarcodeResponse((zzke) this.local_buyer, buildUnknownFields());
                case 26:
                    return new GetPaperCashDepositResponse((PaperMoneyDeposit) this.local_buyer, buildUnknownFields());
                case 27:
                    return new GetEarningsChartRequest((EarningsTimeFrame) this.local_buyer, buildUnknownFields());
                case 28:
                    return new GetEarningsChartResponse((EarningsChartData) this.local_buyer, buildUnknownFields());
                default:
                    return new GetInterestSettingsResponse((InterestYieldStatus) this.local_buyer, buildUnknownFields());
            }
        }
    }

    public final class LocalBuyerAccount extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalBuyerAccount> CREATOR;
        public final String cashtag;
        public final String cashtag_with_currency_symbol;
        public final String customer_token;
        public final String email;
        public final String name;
        public final List payment_methods;
        public final PreferredPaymentMethod preferred_payment_method;
        public final String profile_picture_url;
        public final String sms_number;

        static {
            LocalBuyer$LocalBuyerAccount$Companion$ADAPTER$1 localBuyer$LocalBuyerAccount$Companion$ADAPTER$1 = new LocalBuyer$LocalBuyerAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalBuyerAccount.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBuyer.LocalBuyerAccount", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = localBuyer$LocalBuyerAccount$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localBuyer$LocalBuyerAccount$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalBuyerAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, PreferredPaymentMethod preferredPaymentMethod, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.cashtag = str;
            this.profile_picture_url = str2;
            this.email = str3;
            this.sms_number = str4;
            this.customer_token = str5;
            this.name = str6;
            this.cashtag_with_currency_symbol = str7;
            this.preferred_payment_method = preferredPaymentMethod;
            this.payment_methods = TransactorKt.immutableCopyOf("payment_methods", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalBuyerAccount)) {
                return false;
            }
            LocalBuyerAccount localBuyerAccount = (LocalBuyerAccount) obj;
            return Intrinsics.areEqual(unknownFields(), localBuyerAccount.unknownFields()) && Intrinsics.areEqual(this.cashtag, localBuyerAccount.cashtag) && Intrinsics.areEqual(this.profile_picture_url, localBuyerAccount.profile_picture_url) && Intrinsics.areEqual(this.email, localBuyerAccount.email) && Intrinsics.areEqual(this.sms_number, localBuyerAccount.sms_number) && Intrinsics.areEqual(this.customer_token, localBuyerAccount.customer_token) && Intrinsics.areEqual(this.name, localBuyerAccount.name) && Intrinsics.areEqual(this.cashtag_with_currency_symbol, localBuyerAccount.cashtag_with_currency_symbol) && Intrinsics.areEqual(this.payment_methods, localBuyerAccount.payment_methods) && Intrinsics.areEqual(this.preferred_payment_method, localBuyerAccount.preferred_payment_method);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.cashtag;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.profile_picture_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.email;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.sms_number;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.customer_token;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.name;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.cashtag_with_currency_symbol;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37, 37, this.payment_methods);
            PreferredPaymentMethod preferredPaymentMethod = this.preferred_payment_method;
            int hashCode8 = m + (preferredPaymentMethod != null ? preferredPaymentMethod.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(25, false);
            builder.locale = this.cashtag;
            builder.title = this.profile_picture_url;
            builder.info_rows_header = this.email;
            builder.footer_text = this.sms_number;
            builder.loadable_subtitle = this.customer_token;
            builder.primary_footer_button_state = this.name;
            builder.secondary_footer_button_state = this.cashtag_with_currency_symbol;
            builder.info_rows = this.payment_methods;
            builder.payment_plans_data = this.preferred_payment_method;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.cashtag != null) {
                arrayList.add("cashtag=██");
            }
            if (this.profile_picture_url != null) {
                arrayList.add("profile_picture_url=██");
            }
            if (this.email != null) {
                arrayList.add("email=██");
            }
            if (this.sms_number != null) {
                arrayList.add("sms_number=██");
            }
            String str = this.customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
            }
            if (this.name != null) {
                arrayList.add("name=██");
            }
            if (this.cashtag_with_currency_symbol != null) {
                arrayList.add("cashtag_with_currency_symbol=██");
            }
            List list = this.payment_methods;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("payment_methods=", arrayList, list);
            }
            PreferredPaymentMethod preferredPaymentMethod = this.preferred_payment_method;
            if (preferredPaymentMethod != null) {
                arrayList.add("preferred_payment_method=" + preferredPaymentMethod);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalBuyerAccount{", "}", 0, null, null, 56);
        }
    }

    public final class LocalBuyerGuest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalBuyerGuest> CREATOR;
        public final String anonymous_user_app_token;

        static {
            LocalBuyer$LocalBuyerGuest$Companion$ADAPTER$1 localBuyer$LocalBuyerGuest$Companion$ADAPTER$1 = new LocalBuyer$LocalBuyerGuest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalBuyerGuest.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBuyer.LocalBuyerGuest", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = localBuyer$LocalBuyerGuest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localBuyer$LocalBuyerGuest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalBuyerGuest(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.anonymous_user_app_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalBuyerGuest)) {
                return false;
            }
            LocalBuyerGuest localBuyerGuest = (LocalBuyerGuest) obj;
            return Intrinsics.areEqual(unknownFields(), localBuyerGuest.unknownFields()) && Intrinsics.areEqual(this.anonymous_user_app_token, localBuyerGuest.anonymous_user_app_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.anonymous_user_app_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Instrument.Builder builder = new Instrument.Builder(13);
            builder.token = this.anonymous_user_app_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.anonymous_user_app_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "anonymous_user_app_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalBuyerGuest{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalBuyer$Companion$ADAPTER$1 localBuyer$Companion$ADAPTER$1 = new LocalBuyer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalBuyer.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBuyer", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = localBuyer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localBuyer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBuyer(zzis zzisVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.local_buyer = zzisVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalBuyer)) {
            return false;
        }
        LocalBuyer localBuyer = (LocalBuyer) obj;
        return Intrinsics.areEqual(unknownFields(), localBuyer.unknownFields()) && Intrinsics.areEqual(this.local_buyer, localBuyer.local_buyer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzis zzisVar = this.local_buyer;
        int hashCode2 = hashCode + (zzisVar != null ? zzisVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.local_buyer = this.local_buyer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzis zzisVar = this.local_buyer;
        if (zzisVar != null) {
            arrayList.add("local_buyer=" + zzisVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalBuyer{", "}", 0, null, null, 56);
    }
}
