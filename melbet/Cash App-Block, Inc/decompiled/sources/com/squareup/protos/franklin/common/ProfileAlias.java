package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.google.android.gms.internal.mlkit_vision_face.zzed;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.clients.OSLevelPushSettingState;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.LinkBankAccountRequest;
import com.squareup.protos.franklin.app.RegisterDeviceRequest;
import com.squareup.protos.franklin.app.SetAddressRequest;
import com.squareup.protos.franklin.app.SetRatePlanRequest;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.protos.franklin.common.InvestingAutomationExecutionRenderData;
import com.squareup.protos.franklin.common.InvestingAutomationTriggerRenderData;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.protos.franklin.common.SettingsCategory;
import com.squareup.protos.franklin.onboarding.CashLocalOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.onboarding.InvitationOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.onboarding.LoyaltyOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.onboarding.OnboardingDeepLinkPayload;
import com.squareup.protos.franklin.onboarding.OnboardingDeepLinkType;
import com.squareup.protos.franklin.onboarding.StaffInvitationOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.service.HandleThreeDomainSecureRedirectRequest;
import com.squareup.protos.franklin.service.HandleThreeDomainSecureV2ActionRequest;
import com.squareup.protos.franklin.ui.ProfilePageUpsellComponent;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.franklin.ui.RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.protos.hieroglyph.ClientPublicKey;
import com.squareup.protos.hieroglyph.service.ProvisionKeysRequest;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.invest.ui.Section;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProfileAlias extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileAlias> CREATOR;
    public final UiAlias alias;
    public final Long display_date;
    public final Long expires_at;
    public final Boolean verified;
    public final Long version;

    static {
        ProfileAlias$Companion$ADAPTER$1 profileAlias$Companion$ADAPTER$1 = new ProfileAlias$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileAlias.class), "type.googleapis.com/squareup.franklin.common.ProfileAlias", Syntax.PROTO_2, null, "squareup/franklin/common/profile_alias.proto");
        ADAPTER = profileAlias$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileAlias$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAlias(UiAlias uiAlias, Boolean bool, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.alias = uiAlias;
        this.verified = bool;
        this.expires_at = l;
        this.version = l2;
        this.display_date = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileAlias)) {
            return false;
        }
        ProfileAlias profileAlias = (ProfileAlias) obj;
        return Intrinsics.areEqual(unknownFields(), profileAlias.unknownFields()) && Intrinsics.areEqual(this.alias, profileAlias.alias) && Intrinsics.areEqual(this.verified, profileAlias.verified) && Intrinsics.areEqual(this.expires_at, profileAlias.expires_at) && Intrinsics.areEqual(this.version, profileAlias.version) && Intrinsics.areEqual(this.display_date, profileAlias.display_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAlias uiAlias = this.alias;
        int hashCode2 = (hashCode + (uiAlias != null ? uiAlias.hashCode() : 0)) * 37;
        Boolean bool = this.verified;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.expires_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.version;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.display_date;
        int hashCode6 = hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.alias = this.alias;
        builder.verified = this.verified;
        builder.expires_at = this.expires_at;
        builder.version = this.version;
        builder.display_date = this.display_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAlias uiAlias = this.alias;
        if (uiAlias != null) {
            arrayList.add("alias=" + uiAlias);
        }
        Boolean bool = this.verified;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("verified=", bool, arrayList);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        Long l2 = this.version;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l2, arrayList);
        }
        Long l3 = this.display_date;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileAlias{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object alias;
        public Object display_date;
        public Serializable expires_at;
        public Object verified;
        public Object version;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 3:
                    this.version = EmptyList.INSTANCE;
                    break;
                case 4:
                    this.version = EmptyList.INSTANCE;
                    break;
                case 6:
                    this.version = EmptyList.INSTANCE;
                    break;
                case 25:
                    this.verified = EmptyList.INSTANCE;
                    break;
                default:
                    this.version = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ProfileAlias((UiAlias) this.alias, (Boolean) this.verified, (Long) this.expires_at, (Long) this.version, (Long) this.display_date, buildUnknownFields());
                case 1:
                    return new LinkBankAccountRequest((RequestContext) this.alias, (String) this.verified, (String) this.expires_at, (List) this.version, (String) this.display_date, buildUnknownFields());
                case 2:
                    return new RegisterDeviceRequest((String) this.alias, (BuildType) this.expires_at, (Boolean) this.verified, (OSLevelPushSettingState) this.version, (AppVersion) this.display_date, buildUnknownFields());
                case 3:
                    return new SetAddressRequest((RequestContext) this.alias, (GlobalAddress) this.expires_at, (List) this.version, (String) this.display_date, (Boolean) this.verified, buildUnknownFields());
                case 4:
                    return new SetRatePlanRequest((RequestContext) this.alias, (RatePlan) this.expires_at, (Boolean) this.verified, (List) this.version, (String) this.display_date, buildUnknownFields());
                case 5:
                    return new BalanceData.Button((BalanceData.Button.Action) this.alias, (ClientScenario) this.verified, (BalanceData.Dialog) this.expires_at, (String) this.version, (LocalizableString) this.display_date, buildUnknownFields());
                case 6:
                    return new ClientRoutingConfig.ClientRouteRule((String) this.alias, (Boolean) this.verified, (Boolean) this.expires_at, (List) this.version, (String) this.display_date, buildUnknownFields());
                case 7:
                    return new InvestingAutomationExecutionRenderData((List) this.alias, (String) this.verified, (InvestingAutomationFeature) this.expires_at, (Money) this.version, (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) this.display_date, buildUnknownFields());
                case 8:
                    return new InvestingAutomationTriggerRenderData((String) this.alias, (Money) this.expires_at, (InvestingAutomationTriggerRenderData.ExecutionFailureReason) this.version, (Boolean) this.verified, (InvestingAutomationFeature) this.display_date, buildUnknownFields());
                case 9:
                    return new LendingRenderData.BnplData((Integer) this.alias, (Integer) this.expires_at, (Money) this.version, (Money) this.display_date, (Boolean) this.verified, buildUnknownFields());
                case 10:
                    return new LinkingAction((LinkType) this.alias, (String) this.verified, (LocalizableString) this.expires_at, (String) this.version, (LocalizableString) this.display_date, buildUnknownFields());
                case 11:
                    return new MultiInstrumentLinkingOptions((String) this.alias, (LocalizableString) this.verified, (String) this.expires_at, (LocalizableString) this.version, (List) this.display_date, buildUnknownFields());
                case 12:
                    return new PaymentPlanEligibilityRenderData((PaymentPlanEligibilityRenderData.UiState) this.alias, (zzdx) this.version, (PaymentPlanEligibilityRenderData.Source) this.display_date, (Boolean) this.verified, (Long) this.expires_at, buildUnknownFields());
                case 13:
                    return new PaymentPlanEligibilityRenderData.ConvertedUiData((String) this.alias, (Money) this.verified, (Money) this.expires_at, (String) this.version, (String) this.display_date, buildUnknownFields());
                case 14:
                    return new ScheduledReloadData((ScheduledTransactionPreference) this.alias, (Long) this.expires_at, (String) this.version, (Boolean) this.verified, (Money) this.display_date, buildUnknownFields());
                case 15:
                    return new SettingsCategory.ProgressBar((String) this.alias, (LocalizableString) this.verified, (String) this.expires_at, (LocalizableString) this.version, (Double) this.display_date, buildUnknownFields());
                case 16:
                    return new StablecoinRenderData((String) this.alias, (StablecoinRejectReason) this.verified, (String) this.expires_at, (String) this.version, (Money) this.display_date, buildUnknownFields());
                case 17:
                    return new CashLocalOnboardingDeepLinkPayload((String) this.alias, (String) this.verified, (CashLocalOnboardingDeepLinkPayload.Source) this.version, (String) this.display_date, (Long) this.expires_at, buildUnknownFields());
                case 18:
                    return new OnboardingDeepLinkPayload((OnboardingDeepLinkType) this.alias, (LoyaltyOnboardingDeepLinkPayload) this.verified, (InvitationOnboardingDeepLinkPayload) this.expires_at, (CashLocalOnboardingDeepLinkPayload) this.version, (StaffInvitationOnboardingDeepLinkPayload) this.display_date, buildUnknownFields());
                case 19:
                    return new HandleThreeDomainSecureRedirectRequest((RequestContext) this.alias, (String) this.verified, (String) this.expires_at, (String) this.version, (String) this.display_date, buildUnknownFields());
                case 20:
                    return new HandleThreeDomainSecureV2ActionRequest((RequestContext) this.alias, (String) this.verified, (String) this.expires_at, (String) this.version, (zzed) this.display_date, buildUnknownFields());
                case 21:
                    return new ProfilePageUpsellComponent((ProfilePageUpsellComponent.Icon) this.alias, (String) this.verified, (String) this.expires_at, (String) this.version, (String) this.display_date, buildUnknownFields());
                case 22:
                    return new RewardSelection.UnlockInProgress((String) this.alias, (String) this.verified, (LocalizableString) this.expires_at, (LocalizableString) this.version, (RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar) this.display_date, buildUnknownFields());
                case 23:
                    return new UiControl.Dialog.Button((String) this.alias, (LocalizableString) this.verified, (UiControl.Dialog.Button.Action) this.expires_at, (Money) this.version, (String) this.display_date, buildUnknownFields());
                case 24:
                    return new GiftCard.GiftCardSender((String) this.alias, (String) this.verified, (LocalizableString) this.expires_at, (String) this.version, (LocalizableString) this.display_date, buildUnknownFields());
                case 25:
                    return new ProvisionKeysRequest((ClientPublicKey) this.alias, (List) this.verified, (String) this.expires_at, (AndroidKeystoreCompatibilityReport) this.version, (SignedSerializedMRIContext) this.display_date, buildUnknownFields());
                case 26:
                    return new Section.KeyStatsDetailsRow((String) this.alias, (String) this.verified, (String) this.expires_at, (ClientDriven) this.version, (String) this.display_date, buildUnknownFields());
                case 27:
                    return new BorrowAppletCreditLimitAndBorrowButtonTile.Data((Money) this.alias, (LocalizedString) this.expires_at, (LocalizedString) this.version, (Boolean) this.verified, (InitiateLoanData) this.display_date, buildUnknownFields());
                case 28:
                    return new BorrowAppletPaymentTimelineTile.Data((LocalizedString) this.alias, (Timeline) this.verified, (BorrowAppletPaymentTimelineTile.Data.Button) this.expires_at, (LoanRepaymentSelectionData) this.version, (String) this.display_date, buildUnknownFields());
                default:
                    return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic((Color) this.alias, (Color) this.verified, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon) this.expires_at, (Float) this.version, (LocalizedString) this.display_date, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
