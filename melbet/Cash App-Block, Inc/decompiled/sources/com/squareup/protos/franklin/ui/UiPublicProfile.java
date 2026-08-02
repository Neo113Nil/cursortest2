package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zziz;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.protos.franklin.common.InvestmentEntityRenderData;
import com.squareup.protos.franklin.common.PendingReferralRenderData;
import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncInvestmentIncentive;
import com.squareup.protos.franklin.common.TTPPaymentRenderData;
import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.protos.hieroglyph.PublicKeyConfig;
import com.squareup.protos.lending.CustomAmountPickerData;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.lending.sync_values.SupOffersTabCreditLine;
import com.squareup.protos.multipass.service.DeviceDetails;
import com.squareup.protos.payroll.service.GetEmployeeAccessDetailsResponse;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.roster.business_hours.SpecialBusinessHoursPeriod;
import com.squareup.protos.timecards.ChangeProposal;
import com.squareup.protos.timecards.ChangeProposalAdvancement;
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
import squareup.cash.bankingbenefits.ui.GreenBookletV1;

/* loaded from: classes8.dex */
public final class UiPublicProfile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiPublicProfile> CREATOR;
    public final Boolean cashtag_url_enabled;
    public final FullCashtag full_cashtag;
    public final String full_name;
    public final Boolean is_verified_account;
    public final String photo_url;
    public final String synopsis;

    static {
        UiPublicProfile$Companion$ADAPTER$1 uiPublicProfile$Companion$ADAPTER$1 = new UiPublicProfile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiPublicProfile.class), "type.googleapis.com/squareup.franklin.ui.UiPublicProfile", Syntax.PROTO_2, null, "squareup/franklin/ui/public_profile.proto");
        ADAPTER = uiPublicProfile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiPublicProfile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiPublicProfile(String str, String str2, String str3, FullCashtag fullCashtag, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.full_name = str;
        this.photo_url = str2;
        this.synopsis = str3;
        this.full_cashtag = fullCashtag;
        this.cashtag_url_enabled = bool;
        this.is_verified_account = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiPublicProfile)) {
            return false;
        }
        UiPublicProfile uiPublicProfile = (UiPublicProfile) obj;
        return Intrinsics.areEqual(unknownFields(), uiPublicProfile.unknownFields()) && Intrinsics.areEqual(this.full_name, uiPublicProfile.full_name) && Intrinsics.areEqual(this.photo_url, uiPublicProfile.photo_url) && Intrinsics.areEqual(this.synopsis, uiPublicProfile.synopsis) && Intrinsics.areEqual(this.full_cashtag, uiPublicProfile.full_cashtag) && Intrinsics.areEqual(this.cashtag_url_enabled, uiPublicProfile.cashtag_url_enabled) && Intrinsics.areEqual(this.is_verified_account, uiPublicProfile.is_verified_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.full_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.photo_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.synopsis;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        FullCashtag fullCashtag = this.full_cashtag;
        int hashCode5 = (hashCode4 + (fullCashtag != null ? fullCashtag.hashCode() : 0)) * 37;
        Boolean bool = this.cashtag_url_enabled;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_verified_account;
        int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.full_name = this.full_name;
        builder.photo_url = this.photo_url;
        builder.synopsis = this.synopsis;
        builder.full_cashtag = this.full_cashtag;
        builder.cashtag_url_enabled = this.cashtag_url_enabled;
        builder.is_verified_account = this.is_verified_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.photo_url != null) {
            arrayList.add("photo_url=██");
        }
        if (this.synopsis != null) {
            arrayList.add("synopsis=██");
        }
        FullCashtag fullCashtag = this.full_cashtag;
        if (fullCashtag != null) {
            arrayList.add("full_cashtag=" + fullCashtag);
        }
        Boolean bool = this.cashtag_url_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cashtag_url_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.is_verified_account;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified_account=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiPublicProfile{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object cashtag_url_enabled;
        public Object full_cashtag;
        public Serializable full_name;
        public Object is_verified_account;
        public Serializable photo_url;
        public Object synopsis;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 14:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.synopsis = emptyList;
                    this.full_cashtag = emptyList;
                    this.cashtag_url_enabled = emptyList;
                    break;
                default:
                    this.is_verified_account = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiPublicProfile((String) this.full_name, (String) this.photo_url, (String) this.synopsis, (FullCashtag) this.full_cashtag, (Boolean) this.cashtag_url_enabled, (Boolean) this.is_verified_account, buildUnknownFields());
                case 1:
                    return new GenericNonPaymentRenderData.Avatar((Boolean) this.cashtag_url_enabled, (String) this.full_name, (String) this.photo_url, (String) this.synopsis, (String) this.full_cashtag, (String) this.is_verified_account, buildUnknownFields());
                case 2:
                    return new GenericNonPaymentRenderData.Header((String) this.full_name, (String) this.photo_url, (LocalizedString) this.synopsis, (LocalizedString) this.full_cashtag, (LocalizableString) this.cashtag_url_enabled, (LocalizableString) this.is_verified_account, buildUnknownFields());
                case 3:
                    return new InvestmentEntityRenderData((String) this.full_name, (String) this.photo_url, (String) this.synopsis, (String) this.full_cashtag, (String) this.cashtag_url_enabled, (InvestmentEntityRenderData.InvestmentType) this.is_verified_account, buildUnknownFields());
                case 4:
                    return new PendingReferralRenderData((PendingReferralRenderData.Role) this.synopsis, (PendingReferralRenderData.State) this.full_cashtag, (String) this.full_name, (String) this.photo_url, (Long) this.cashtag_url_enabled, (LocalizableString) this.is_verified_account, buildUnknownFields());
                case 5:
                    return new PlayIntegrityAttestation((String) this.full_name, (String) this.photo_url, (PlayIntegrityAttestation.Status) this.full_cashtag, (PlayIntegrityAttestation.IntegrityErrorCode) this.cashtag_url_enabled, (String) this.synopsis, (PlayIntegrityAttestation.AttestationType) this.is_verified_account, buildUnknownFields());
                case 6:
                    return new SavingsTransferRenderData.SavingsFolderMetadata((String) this.full_name, (String) this.photo_url, (String) this.synopsis, (LocalizableString) this.full_cashtag, (Image) this.cashtag_url_enabled, (String) this.is_verified_account, buildUnknownFields());
                case 7:
                    return new SponsoredAccountRenderData.Teen((SponsoredAccountRenderData.Teen.Type) this.full_cashtag, (String) this.full_name, (String) this.photo_url, (Boolean) this.cashtag_url_enabled, (Boolean) this.is_verified_account, (String) this.synopsis, buildUnknownFields());
                case 8:
                    return new SyncInvestmentFilterGroup.Subfilter((String) this.full_name, (SyncInvestmentFilterGroup.Subfilter.SubfilterType) this.full_cashtag, (String) this.photo_url, (Long) this.cashtag_url_enabled, (String) this.synopsis, (List) this.is_verified_account, buildUnknownFields());
                case 9:
                    return new SyncInvestmentIncentive((String) this.full_name, (Money) this.synopsis, (SyncInvestmentIncentive.IncentiveState) this.full_cashtag, (Image) this.cashtag_url_enabled, (String) this.photo_url, (Long) this.is_verified_account, buildUnknownFields());
                case 10:
                    return new TTPPaymentRenderData((TTPPaymentRenderData.Status) this.full_cashtag, (Money) this.cashtag_url_enabled, (Money) this.is_verified_account, (String) this.full_name, (String) this.photo_url, (String) this.synopsis, buildUnknownFields());
                case 11:
                    return new C4BIdentityHubState((Long) this.full_name, (Boolean) this.cashtag_url_enabled, (LocalizedString) this.photo_url, (LocalizedString) this.synopsis, (C4BIdentityHubState.C4BIdentityVerificationBadgeStyle) this.full_cashtag, (C4BIdentityHubState.AccountVerification) this.is_verified_account, buildUnknownFields());
                case 12:
                    return new PersonalInfoCTABanner((String) this.full_name, (String) this.photo_url, (String) this.synopsis, (LocalizableString) this.full_cashtag, (LocalizableString) this.cashtag_url_enabled, (LocalizableString) this.is_verified_account, buildUnknownFields());
                case 13:
                    return new UiControl.Dialog((String) this.full_name, (LocalizableString) this.synopsis, (UiControl.Dialog.Button) this.full_cashtag, (UiControl.Dialog.Button) this.cashtag_url_enabled, (String) this.photo_url, (LocalizableString) this.is_verified_account, buildUnknownFields());
                case 14:
                    return new AndroidKeystoreCompatibilityReport((String) this.full_name, (Long) this.photo_url, (List) this.synopsis, (List) this.full_cashtag, (List) this.cashtag_url_enabled, (PublicKeyConfig) this.is_verified_account, buildUnknownFields());
                case 15:
                    return new CustomAmountPickerData((LocalizedString) this.full_name, (LocalizedString) this.photo_url, (LocalizedString) this.synopsis, (Money) this.full_cashtag, (Money) this.cashtag_url_enabled, (Color) this.is_verified_account, buildUnknownFields());
                case 16:
                    return new LoanRepaymentSelectionData.Choice((LocalizedString) this.full_name, (LocalizedString) this.photo_url, (LoanRepaymentSelectionData.Choice.Icon) this.synopsis, (zziz) this.full_cashtag, (LocalizedString) this.cashtag_url_enabled, (Long) this.is_verified_account, buildUnknownFields());
                case 17:
                    return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData((LocalizedString) this.full_name, (LocalizedString) this.photo_url, (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) this.synopsis, (Boolean) this.cashtag_url_enabled, (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) this.full_cashtag, (Icon) this.is_verified_account, buildUnknownFields());
                case 18:
                    return new BorrowAppletBulletinsTile.Data.UpsellCard((LocalizedString) this.synopsis, (LocalizedString) this.full_cashtag, (Illustration) this.cashtag_url_enabled, (LocalizedString) this.is_verified_account, (String) this.full_name, (String) this.photo_url, buildUnknownFields());
                case 19:
                    return new BorrowAppletLoanHistoryTile.Data.Loan((LocalizedString) this.photo_url, (LocalizedString) this.synopsis, (LocalizedString) this.full_cashtag, (BorrowAppletLoanHistoryTile.Data.Loan.Details) this.cashtag_url_enabled, (String) this.full_name, (Color) this.is_verified_account, buildUnknownFields());
                case 20:
                    return new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row((LocalizedString) this.photo_url, (LocalizedString) this.synopsis, (String) this.full_name, (Color) this.full_cashtag, (Color) this.is_verified_account, (Boolean) this.cashtag_url_enabled, buildUnknownFields());
                case 21:
                    return new BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile((LocalizedString) this.full_name, (LocalizedString) this.photo_url, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) this.synopsis, (LocalizedString) this.full_cashtag, (LocalizedString) this.is_verified_account, (Boolean) this.cashtag_url_enabled, buildUnknownFields());
                case 22:
                    return new LendingInfo.FirstTimeBorrowData.ConfirmationScreen((String) this.full_name, (Animation) this.full_cashtag, (String) this.photo_url, (String) this.synopsis, (String) this.cashtag_url_enabled, (Long) this.is_verified_account, buildUnknownFields());
                case 23:
                    return new SupOffersTabCreditLine((String) this.full_name, (Money) this.photo_url, (Money) this.synopsis, (Money) this.full_cashtag, (Integer) this.cashtag_url_enabled, (Integer) this.is_verified_account, buildUnknownFields());
                case 24:
                    return new DeviceDetails((DeviceDetails.Type) this.full_cashtag, (String) this.full_name, (String) this.photo_url, (String) this.synopsis, (String) this.is_verified_account, (Boolean) this.cashtag_url_enabled, buildUnknownFields());
                case 25:
                    String str = (String) this.full_name;
                    if (str != null) {
                        return new GetEmployeeAccessDetailsResponse(str, (String) this.photo_url, (Boolean) this.cashtag_url_enabled, (Boolean) this.is_verified_account, (Boolean) this.synopsis, (Boolean) this.full_cashtag, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "team_member_id");
                    throw null;
                case 26:
                    return new UiRewardProgramDetails((String) this.full_name, (List) this.full_cashtag, (List) this.cashtag_url_enabled, (String) this.photo_url, (String) this.synopsis, (UiRewardProgramDetails.BottomUpsell) this.is_verified_account, buildUnknownFields());
                case 27:
                    return new SpecialBusinessHoursPeriod((String) this.full_name, (String) this.photo_url, (List) this.full_cashtag, (List) this.is_verified_account, (String) this.synopsis, (Boolean) this.cashtag_url_enabled, buildUnknownFields());
                case 28:
                    return new ChangeProposalAdvancement((String) this.full_name, (ChangeProposal.State) this.full_cashtag, (ChangeProposal.State) this.cashtag_url_enabled, (String) this.photo_url, (String) this.synopsis, (String) this.is_verified_account, buildUnknownFields());
                default:
                    return new GreenBookletV1((Image) this.full_name, (LocalizedString) this.photo_url, (LocalizedString) this.synopsis, (Money) this.full_cashtag, (List) this.cashtag_url_enabled, (GreenBookletV1.BookletFooterButton) this.is_verified_account, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
