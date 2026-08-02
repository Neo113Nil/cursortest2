package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletRequest;
import com.squareup.cash.bankingbenefits.api.v1_0.core.BenefitLeafletVariant;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault$Action$ClientRouteAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedLink;
import com.squareup.cash.cashcommercebrowser.api.v1.UpdateCustomerPreferencesRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeResponse;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.crypto.amount.BitcoinAmount;
import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.cryptonauts.api.CryptoFeature;
import com.squareup.cash.cryptonauts.api.GetCryptoControlsResponse;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingRequest;
import com.squareup.cash.devicegrip.service.GetDevicesResponse;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.out.api.v1_0.GetInstrumentCapabilityConfigResponse;
import com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig;
import com.squareup.cash.out.sync_entity.InstrumentCapability;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.cash.supportarticles.app.v1.Color;
import com.squareup.cash.supportarticles.app.v1.Glyph;
import com.squareup.cash.supportarticles.app.v1.Icon;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.lending.sync_values.CardsEntryPointData;
import com.squareup.lending.sync_values.CardsEntryPointData$EntryPoint$ToggleEntryPointData;
import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorResponse;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
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
import squareup.cash.ui.arcade.elements.ButtonDefault;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class Member extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Member> CREATOR;
    public final String customer_token;
    public final SponsorshipTier sponsorship_tier;

    static {
        Member$Companion$ADAPTER$1 member$Companion$ADAPTER$1 = new Member$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Member.class), "type.googleapis.com/squareup.cash.aegis.core.Member", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = member$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(member$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Member(String str, SponsorshipTier sponsorshipTier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.sponsorship_tier = sponsorshipTier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Member)) {
            return false;
        }
        Member member = (Member) obj;
        return Intrinsics.areEqual(unknownFields(), member.unknownFields()) && Intrinsics.areEqual(this.customer_token, member.customer_token) && this.sponsorship_tier == member.sponsorship_tier;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SponsorshipTier sponsorshipTier = this.sponsorship_tier;
        int hashCode3 = hashCode2 + (sponsorshipTier != null ? sponsorshipTier.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.customer_token = this.customer_token;
        builder.sponsorship_tier = this.sponsorship_tier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        SponsorshipTier sponsorshipTier = this.sponsorship_tier;
        if (sponsorshipTier != null) {
            arrayList.add("sponsorship_tier=" + sponsorshipTier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Member{", "}", 0, null, null, 56);
    }

    /* loaded from: classes6.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object customer_token;
        public Object sponsorship_tier;

        public /* synthetic */ Builder(boolean z) {
            this.$r8$classId = 13;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Member((String) this.customer_token, (SponsorshipTier) this.sponsorship_tier, buildUnknownFields());
                case 1:
                    return new BenefitsHub.BenefitsBreakdown((List) this.customer_token, (BenefitsHub.BenefitsBreakdown.LearnMore) this.sponsorship_tier, buildUnknownFields());
                case 2:
                    return new BenefitsHub.BenefitsBreakdown.LearnMore((TintedLink) this.customer_token, (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) this.sponsorship_tier, buildUnknownFields());
                case 3:
                    return new BenefitsHub.Disclosures.Disclosure((TintedIcon) this.sponsorship_tier, (String) this.customer_token, buildUnknownFields());
                case 4:
                    return new BenefitsHub.Section((String) this.customer_token, (ImageResourcesKt) this.sponsorship_tier, buildUnknownFields());
                case 5:
                    return new GetBenefitLeafletRequest((PaycheckDepositStatusActiveBenefitType) this.customer_token, (BenefitLeafletVariant) this.sponsorship_tier, buildUnknownFields());
                case 6:
                    return new ActionableButtonDefault((ButtonDefault) this.customer_token, (ActionableButtonDefault$Action$ClientRouteAction) this.sponsorship_tier, buildUnknownFields());
                case 7:
                    return new UpdateCustomerPreferencesRequest((CommerceBrowserAutofillPreferences) this.customer_token, (RequestContext) this.sponsorship_tier, buildUnknownFields());
                case 8:
                    return new GetMobilePlanHomeResponse((ResponseContext) this.customer_token, (MobilePlanHome) this.sponsorship_tier, buildUnknownFields());
                case 9:
                    return new MobilePlanHome.InfoCards((MobilePlanHome.InfoCard) this.customer_token, (MobilePlanHome.InfoCard) this.sponsorship_tier, buildUnknownFields());
                case 10:
                    Long l = (Long) this.customer_token;
                    if (l != null) {
                        return new BitcoinAmount(l.longValue(), (Integer) this.sponsorship_tier, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(l, "satoshi");
                    throw null;
                case 11:
                    return new SponsorshipCryptoAuthorization.FeatureAuthorization((SponsorshipCryptoAuthorization.Feature) this.customer_token, (Boolean) this.sponsorship_tier, buildUnknownFields());
                case 12:
                    return new GetCryptoControlsResponse((String) this.customer_token, (CryptoExchangeCustomerControl) this.sponsorship_tier, buildUnknownFields());
                case 13:
                    return new SetCryptoControlsRequest((String) this.customer_token, (SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl) this.sponsorship_tier, buildUnknownFields());
                case 14:
                    return new StartCryptoOnboardingRequest((RequestContext) this.customer_token, (CryptoFeature) this.sponsorship_tier, buildUnknownFields());
                case 15:
                    return new GetDevicesResponse.Device((Boolean) this.customer_token, (DeviceInfo) this.sponsorship_tier, buildUnknownFields());
                case 16:
                    ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) this.customer_token;
                    if (colorValue != null) {
                        return new ComposePlatform.Color(colorValue, (ComposePlatform.Color.ColorValue) this.sponsorship_tier, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(colorValue, "light");
                    throw null;
                case 17:
                    return new ComposePlatform.Image((Expression) this.customer_token, (ComposePlatform.Image.ImageURL) this.sponsorship_tier, buildUnknownFields());
                case 18:
                    MoneybotScaffold.Evidence.Breakdown.BarChart barChart = (MoneybotScaffold.Evidence.Breakdown.BarChart) this.customer_token;
                    if (barChart != null) {
                        return new MoneybotScaffold.Evidence.Breakdown(barChart, (List) this.sponsorship_tier, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(barChart, "chart");
                    throw null;
                case 19:
                    return new MoneybotScaffold.Evidence((MoneybotScaffold.Evidence.Breakdown) this.customer_token, (MoneybotScaffold.Evidence.MerchantCard) this.sponsorship_tier, buildUnknownFields());
                case 20:
                    MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) this.customer_token;
                    if (summary != null) {
                        return new MoneybotScaffold.Evidence.MerchantCard(summary, (List) this.sponsorship_tier, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(summary, "summary");
                    throw null;
                case 21:
                    return new MoneybotScaffold.Meaning((MoneybotScaffold.Meaning.RiskPattern) this.customer_token, (MoneybotScaffold.Meaning.Opportunity) this.sponsorship_tier, buildUnknownFields());
                case 22:
                    return new GetInstrumentCapabilityConfigResponse((ResponseContext) this.customer_token, (CashOutInstrumentCapabilityConfig) this.sponsorship_tier, buildUnknownFields());
                case 23:
                    return new InstrumentCapability((InstrumentType) this.customer_token, (List) this.sponsorship_tier, buildUnknownFields());
                case 24:
                    return new ToggleOverdraftRequest((zzafe) this.customer_token, (RequestContext) this.sponsorship_tier, buildUnknownFields());
                case 25:
                    return new Icon((Glyph) this.customer_token, (Color) this.sponsorship_tier, buildUnknownFields());
                case 26:
                    return new CashCreditScoreHomeData.DisclaimerSection((LocalizedString) this.customer_token, (CashCreditScoreHomeData.TextAlignment) this.sponsorship_tier, buildUnknownFields());
                case 27:
                    return new CashCreditScoreHomeData.Graphic((Image) this.customer_token, (CashCreditScoreHomeData.Graphic.Card) this.sponsorship_tier, buildUnknownFields());
                case 28:
                    return new CardsEntryPointData((List) this.customer_token, (CardsEntryPointData$EntryPoint$ToggleEntryPointData) this.sponsorship_tier, buildUnknownFields());
                default:
                    return new GetFamilyAccountSponsorResponse((Sponsor) this.customer_token, (Boolean) this.sponsorship_tier, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
