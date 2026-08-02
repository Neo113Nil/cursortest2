package com.squareup.protos.cash.money.content;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.app.v1.ListMarketingMessagesResponse;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest;
import com.squareup.protos.cash.local.client.v1.AutoCompleteAddressResponse;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusRequest;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.GetBrandLocationsResponse;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.GetMapLocationsResponse;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.protos.cash.local.client.v1.LocalNumberedList;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.protos.cash.local.client.v1.ShippingRateConfiguration;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.marketdata.GetInvestmentEntityNewsRequest;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.model.PortfolioNews;
import com.squareup.protos.cash.marketdata.model.SectorsDetails;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesV2Response;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.orderly.app.afterpaystatements.ListStatementsAppApiResponse;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningStreamsSummaryResponse;
import com.squareup.protos.cash.paychecks.api.v1.RecordPayerTaggingPromptDismissalRequest;
import com.squareup.protos.cash.paychecks.api.v1.SetPayersForCustomerRequest;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.unicorn.FdicDisclosureCopy;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneyTab extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneyTab> CREATOR;
    public final List applets;

    public final class Applet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Applet> CREATOR;
        public final Banner banner;
        public final Id id;

        public final class Banner extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Banner> CREATOR;
            public final LocalizedString body;
            public final Image image;
            public final LocalizedString title;

            static {
                MoneyTab$Applet$Banner$Companion$ADAPTER$1 moneyTab$Applet$Banner$Companion$ADAPTER$1 = new MoneyTab$Applet$Banner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Banner.class), "type.googleapis.com/squareup.cash.money.MoneyTab.Applet.Banner", Syntax.PROTO_2, null, "squareup/cash/money/content/money_tab.proto");
                ADAPTER = moneyTab$Applet$Banner$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(moneyTab$Applet$Banner$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Banner(LocalizedString localizedString, LocalizedString localizedString2, Image image, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.body = localizedString2;
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    return false;
                }
                Banner banner = (Banner) obj;
                return Intrinsics.areEqual(unknownFields(), banner.unknownFields()) && Intrinsics.areEqual(this.title, banner.title) && Intrinsics.areEqual(this.body, banner.body) && Intrinsics.areEqual(this.image, banner.image);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Image image = this.image;
                int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                FdicDisclosureCopy.Builder builder = new FdicDisclosureCopy.Builder(1);
                builder.uninsured_copy = this.title;
                builder.insured_copy = this.body;
                builder.icon = this.image;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Banner{", "}", 0, null, null, 56);
            }
        }

        public enum Id implements WireEnum {
            UNSPECIFIED(0),
            BANKING_CARD(1),
            BANKING_BENEFITS(2),
            TAXES(3),
            SAVINGS(4),
            BORROW(5),
            PAYCHECKS(6),
            BITCOIN(7),
            STOCKS(8),
            EARNINGS(9),
            FAMILY(10),
            AFTERPAY(11),
            POOLS(12),
            CASH_CREDIT_SCORE(13),
            EARNER(14),
            PHONE_PLAN(15);

            public static final MoneyTab$Applet$Id$Companion$ADAPTER$1 ADAPTER;
            public static final ContactAliasType.Companion Companion;
            public final int value;

            static {
                Id id = UNSPECIFIED;
                Companion = new ContactAliasType.Companion();
                ADAPTER = new MoneyTab$Applet$Id$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Id.class), Syntax.PROTO_2, id);
            }

            Id(int i) {
                this.value = i;
            }

            public static final Id fromValue(int i) {
                Companion.getClass();
                return ContactAliasType.Companion.m3895fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            MoneyTab$Applet$Companion$ADAPTER$1 moneyTab$Applet$Companion$ADAPTER$1 = new MoneyTab$Applet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Applet.class), "type.googleapis.com/squareup.cash.money.MoneyTab.Applet", Syntax.PROTO_2, null, "squareup/cash/money/content/money_tab.proto");
            ADAPTER = moneyTab$Applet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(moneyTab$Applet$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Applet(Id id, Banner banner, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = id;
            this.banner = banner;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Applet)) {
                return false;
            }
            Applet applet = (Applet) obj;
            return Intrinsics.areEqual(unknownFields(), applet.unknownFields()) && this.id == applet.id && Intrinsics.areEqual(this.banner, applet.banner);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Id id = this.id;
            int hashCode2 = (hashCode + (id != null ? id.hashCode() : 0)) * 37;
            Banner banner = this.banner;
            int hashCode3 = hashCode2 + (banner != null ? banner.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InputValue.Builder builder = new InputValue.Builder(26);
            builder.input_id = this.id;
            builder.value = this.banner;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Id id = this.id;
            if (id != null) {
                arrayList.add("id=" + id);
            }
            Banner banner = this.banner;
            if (banner != null) {
                arrayList.add("banner=" + banner);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Applet{", "}", 0, null, null, 56);
        }
    }

    static {
        MoneyTab$Companion$ADAPTER$1 moneyTab$Companion$ADAPTER$1 = new MoneyTab$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyTab.class), "type.googleapis.com/squareup.cash.money.MoneyTab", Syntax.PROTO_2, null, "squareup/cash/money/content/money_tab.proto");
        ADAPTER = moneyTab$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneyTab$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTab(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.applets = TransactorKt.immutableCopyOf("applets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneyTab)) {
            return false;
        }
        MoneyTab moneyTab = (MoneyTab) obj;
        return Intrinsics.areEqual(unknownFields(), moneyTab.unknownFields()) && Intrinsics.areEqual(this.applets, moneyTab.applets);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.applets.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.applets = this.applets;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.applets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("applets=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyTab{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List applets;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 15:
                    this.applets = EmptyList.INSTANCE;
                    break;
                case 28:
                    this.applets = EmptyList.INSTANCE;
                    break;
                case 29:
                    this.applets = EmptyList.INSTANCE;
                    break;
                default:
                    this.applets = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new MoneyTab(this.applets, buildUnknownFields());
                case 1:
                    return new ListMarketingMessagesResponse(this.applets, buildUnknownFields());
                case 2:
                    return new ReportMarketingMessageViewedRequest.MarketingMessageTokenList(this.applets, buildUnknownFields());
                case 3:
                    return new AutoCompleteAddressResponse.Success(this.applets, buildUnknownFields());
                case 4:
                    return new BatchGetLocationStatusRequest(this.applets, buildUnknownFields());
                case 5:
                    return new CreateOrderResponse.ErrorResponse(this.applets, buildUnknownFields());
                case 6:
                    return new GetBrandLocationsResponse.Success(this.applets, buildUnknownFields());
                case 7:
                    return new GetEditorialResponse.EditorialContent.Preview(this.applets, buildUnknownFields());
                case 8:
                    return new GetMapLocationsResponse(this.applets, buildUnknownFields());
                case 9:
                    return new LocalErrorResponse(this.applets, buildUnknownFields());
                case 10:
                    return new LocalMenuItemModifierList.SelectFromList(this.applets, buildUnknownFields());
                case 11:
                    return new LocalNumberedList(this.applets, buildUnknownFields());
                case 12:
                    return new LocalProfileWidget.LinksData(this.applets, buildUnknownFields());
                case 13:
                    return new ShippingRateConfiguration(this.applets, buildUnknownFields());
                case 14:
                    return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData(this.applets, buildUnknownFields());
                case 15:
                    return new GetInvestmentEntityNewsRequest(this.applets, buildUnknownFields());
                case 16:
                    return new InvestmentEntityStats.InvestmentEntityStatsDetails(this.applets, buildUnknownFields());
                case 17:
                    return new PortfolioNews(this.applets, buildUnknownFields());
                case 18:
                    return new SectorsDetails(this.applets, buildUnknownFields());
                case 19:
                    return new GetAppMessagesResponse(this.applets, buildUnknownFields());
                case 20:
                    return new GetAppMessagesV2Response(this.applets, buildUnknownFields());
                case 21:
                    return new GetInAppMessagesResponse(this.applets, buildUnknownFields());
                case 22:
                    return new GetRetailerLocationsResponse(this.applets, buildUnknownFields());
                case 23:
                    return new UiNotificationSettings(this.applets, buildUnknownFields());
                case 24:
                    return new NotificationCategoryExtraConfig.FamiliesConfiguration(this.applets, buildUnknownFields());
                case 25:
                    return new ListStatementsAppApiResponse(this.applets, buildUnknownFields());
                case 26:
                    return new com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse(this.applets, buildUnknownFields());
                case 27:
                    return new GetEarningStreamsSummaryResponse(this.applets, buildUnknownFields());
                case 28:
                    return new RecordPayerTaggingPromptDismissalRequest(this.applets, buildUnknownFields());
                default:
                    return new SetPayersForCustomerRequest(this.applets, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
