package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForBookletResponse;
import com.squareup.cash.mosaic.resources.api.v2.SearchMusicResourcesResponse;
import com.squareup.cash.supportarticles.app.v1.ListSupportArticlesRequest;
import com.squareup.protos.cash.aegis.api.SetCustomLimitsRequest;
import com.squareup.protos.cash.aegis.api.SetCustomLimitsResponse;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateReceiptResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashstorefronts.api.CashAppAfterpayMetadata;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductsResponse;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.disputron.core.ListClaimResolutionStatusesResponse;
import com.squareup.protos.cash.familynotifications.api.v1.UpdateNotificationSettingsRequest;
import com.squareup.protos.cash.giftly.app.GiftCardStoreUpsell;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.ListAppointmentsResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalRelatedContent;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityNews;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsResponse;
import com.squareup.protos.cash.pools.AddCustomersToPoolRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ToggleScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ToggleScreen> CREATOR;
    public final List sections;
    public final String toggle_title;

    static {
        ToggleScreen$Companion$ADAPTER$1 toggleScreen$Companion$ADAPTER$1 = new ToggleScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToggleScreen.class), "type.googleapis.com/squareup.cash.cashsuggest.api.ToggleScreen", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = toggleScreen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleScreen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleScreen(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.toggle_title = str;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ToggleScreen)) {
            return false;
        }
        ToggleScreen toggleScreen = (ToggleScreen) obj;
        return Intrinsics.areEqual(unknownFields(), toggleScreen.unknownFields()) && Intrinsics.areEqual(this.toggle_title, toggleScreen.toggle_title) && Intrinsics.areEqual(this.sections, toggleScreen.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.toggle_title;
        int hashCode2 = this.sections.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.toggle_title = this.toggle_title;
        builder.sections = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.toggle_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "toggle_title=", arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleScreen{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List sections;
        public String toggle_title;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 5:
                    this.sections = EmptyList.INSTANCE;
                    break;
                case 16:
                    this.sections = EmptyList.INSTANCE;
                    break;
                case 18:
                    this.sections = EmptyList.INSTANCE;
                    break;
                case 19:
                    this.sections = EmptyList.INSTANCE;
                    break;
                case 21:
                    this.sections = EmptyList.INSTANCE;
                    break;
                case 29:
                    this.sections = EmptyList.INSTANCE;
                    break;
                default:
                    this.sections = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ToggleScreen(this.toggle_title, this.sections, buildUnknownFields());
                case 1:
                    return new BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section(this.toggle_title, this.sections, buildUnknownFields());
                case 2:
                    return new GetBankingBenefitsForBookletResponse(this.sections, this.toggle_title, buildUnknownFields());
                case 3:
                    return new SearchMusicResourcesResponse(this.sections, this.toggle_title, buildUnknownFields());
                case 4:
                    return new ListSupportArticlesRequest(this.toggle_title, this.sections, buildUnknownFields());
                case 5:
                    return new SetCustomLimitsRequest(this.toggle_title, this.sections, buildUnknownFields());
                case 6:
                    return new SetCustomLimitsResponse(this.toggle_title, this.sections, buildUnknownFields());
                case 7:
                    return new TapToPayDescriptionSuggestions(this.sections, this.toggle_title, buildUnknownFields());
                case 8:
                    return new CreateReceiptResponse(this.toggle_title, this.sections, buildUnknownFields());
                case 9:
                    return new GetCustomerLimitsResponse.FlatLimits(this.toggle_title, this.sections, buildUnknownFields());
                case 10:
                    return new GetCustomerLimitsResponse.FlatLimits.LimitsCategory(this.toggle_title, this.sections, buildUnknownFields());
                case 11:
                    return new CashAppAfterpayMetadata(this.toggle_title, this.sections, buildUnknownFields());
                case 12:
                    return new CardTabNullStateSwipeConfig.SwipePage(this.sections, this.toggle_title, buildUnknownFields());
                case 13:
                    return new ShopSearchProductsResponse(this.sections, this.toggle_title, buildUnknownFields());
                case 14:
                    return new GetSupportSurveyResponse.Survey.ReasonList(this.toggle_title, this.sections, buildUnknownFields());
                case 15:
                    return new ListClaimResolutionStatusesResponse(this.sections, this.toggle_title, buildUnknownFields());
                case 16:
                    return new UpdateNotificationSettingsRequest(this.toggle_title, this.sections, buildUnknownFields());
                case 17:
                    return new GiftCardStoreUpsell(this.toggle_title, this.sections, buildUnknownFields());
                case 18:
                    return new MarketTilesScreen(this.toggle_title, this.sections, buildUnknownFields());
                case 19:
                    return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks(this.toggle_title, this.sections, buildUnknownFields());
                case 20:
                    return new ListAppointmentsResponse.Success(this.sections, this.toggle_title, buildUnknownFields());
                case 21:
                    return new LocalCashActivity(this.toggle_title, this.sections, buildUnknownFields());
                case 22:
                    return new LocalMenuItem.ItemOptionsConfig(this.toggle_title, this.sections, buildUnknownFields());
                case 23:
                    return new LocalRelatedContent(this.toggle_title, this.sections, buildUnknownFields());
                case 24:
                    return new MapboxConfiguration(this.toggle_title, this.sections, buildUnknownFields());
                case 25:
                    return new POSBrandOnboarding.HowItWorks(this.toggle_title, this.sections, buildUnknownFields());
                case 26:
                    return new LoyaltyPromotionSheetPlaceholder.LocationData(this.toggle_title, this.sections, buildUnknownFields());
                case 27:
                    return new InvestmentEntityNews(this.toggle_title, this.sections, buildUnknownFields());
                case 28:
                    return new GetRecurringPaymentsResponse(this.sections, this.toggle_title, buildUnknownFields());
                default:
                    return new AddCustomersToPoolRequest(this.toggle_title, this.sections, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
