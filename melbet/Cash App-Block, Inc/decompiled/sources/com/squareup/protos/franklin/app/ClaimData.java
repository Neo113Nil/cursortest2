package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.google.android.gms.internal.mlkit_vision_face.zzds;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.taply.app.v1.ProvisioningEligibility;
import com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.cash.ui.SplitButtons$Button$Action$Action$ClientRoute;
import com.squareup.protos.cash.usher.api.GetPreSignInDataRequest;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.franklin.PaymentPadTheme;
import com.squareup.protos.franklin.PaymentPadThemeIdentifier;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.ScientificNumber;
import com.squareup.protos.franklin.app.InAppBrowserConfig;
import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import com.squareup.protos.franklin.app.RegisterDeviceResponse;
import com.squareup.protos.franklin.app.ResetBadgeResponse;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.protos.franklin.common.CardModuleElement;
import com.squareup.protos.franklin.common.CashDrawerConfig;
import com.squareup.protos.franklin.common.IssuedCardElement;
import com.squareup.protos.franklin.common.LoyaltyActivityRenderData;
import com.squareup.protos.franklin.common.P2pPoolComment;
import com.squareup.protos.franklin.common.P2pPoolContributionRenderData;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.common.WebLoginConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes8.dex */
public final class ClaimData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClaimData> CREATOR;
    public final ClaimablePayment claimable_payment;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object claimable_payment;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ClaimData((ClaimablePayment) this.claimable_payment, buildUnknownFields());
                case 1:
                    return new SupportPhoneStatusResponse.Granted((zzlq) this.claimable_payment, buildUnknownFields());
                case 2:
                    return new SupportPhoneStatusResponse.Idle((SupportPhoneStatusResponse.ServiceAvailability) this.claimable_payment, buildUnknownFields());
                case 3:
                    return new ProvisioningEligibility((zzlr) this.claimable_payment, buildUnknownFields());
                case 4:
                    return new TransactionActivityConfig((TransactionActivityConfig.TransactionAuthConfig) this.claimable_payment, buildUnknownFields());
                case 5:
                    return new SplitButtons.Button.Action((SplitButtons$Button$Action$Action$ClientRoute) this.claimable_payment, buildUnknownFields());
                case 6:
                    return new GetPreSignInDataRequest((GetPreSignInDataRequest.ClientDeepLinkContext) this.claimable_payment, buildUnknownFields());
                case 7:
                    return new GetPreSignInDataResponse((DBUtil) this.claimable_payment, buildUnknownFields());
                case 8:
                    return new GetPreSignInDataResponse.InvitationIntroData((zzlt) this.claimable_payment, buildUnknownFields());
                case 9:
                    return new GetPreSignInDataResponse.StaffInvitationIntroData((FormBlocker) this.claimable_payment, buildUnknownFields());
                case 10:
                    PaymentPadThemeIdentifier paymentPadThemeIdentifier = (PaymentPadThemeIdentifier) this.claimable_payment;
                    if (paymentPadThemeIdentifier != null) {
                        return new PaymentPadTheme(paymentPadThemeIdentifier, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(paymentPadThemeIdentifier, "id");
                    throw null;
                case 11:
                    return new CustomizationInputs((CardCustomizationInputs) this.claimable_payment, buildUnknownFields());
                case 12:
                    return new GetHistoricalExchangeDataResponse((PriceHistory) this.claimable_payment, buildUnknownFields());
                case 13:
                    return new GetRewardStatusResponse((RewardStatus) this.claimable_payment, buildUnknownFields());
                case 14:
                    return new GetWebLoginConfigResponse((WebLoginConfig) this.claimable_payment, buildUnknownFields());
                case 15:
                    return new InAppBrowserConfig((InAppBrowserConfig.FillrConfig) this.claimable_payment, buildUnknownFields());
                case 16:
                    return new P2pInstrumentSelectionRequest.NewLinkOption((P2pInstrumentSelectionRequest.NewLinkOption.LinkType) this.claimable_payment, buildUnknownFields());
                case 17:
                    return new RegisterDeviceResponse((RegisterDeviceResponse.Status) this.claimable_payment, buildUnknownFields());
                case 18:
                    return new ResetBadgeResponse((ResetBadgeResponse.Status) this.claimable_payment, buildUnknownFields());
                case 19:
                    return new SetAmountRequest.PercentageResult((ScientificNumber) this.claimable_payment, buildUnknownFields());
                case 20:
                    return new SubmitBlockerResponse.BlockerResponseContext((SubmitBlockerResponse.BlockerResponseContext.Dialog) this.claimable_payment, buildUnknownFields());
                case 21:
                    return new SubmitFormRequest.ElementResult.EarnerCategoryResult((EarnerCategory) this.claimable_payment, buildUnknownFields());
                case 22:
                    return new VerifyPasscodeResponse.ProtectedData((VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo) this.claimable_payment, buildUnknownFields());
                case 23:
                    return new AfterPayRenderData((ResourceEvent.Companion) this.claimable_payment, buildUnknownFields());
                case 24:
                    return new CardModule((CardModule.Type) this.claimable_payment, buildUnknownFields());
                case 25:
                    return new CardModule.HeroIssuedCardModule((IssuedCardElement) this.claimable_payment, buildUnknownFields());
                case 26:
                    return new CardModuleElement((zzds) this.claimable_payment, buildUnknownFields());
                case 27:
                    return new CashDrawerConfig((CashDrawerConfig.GetCardAsset) this.claimable_payment, buildUnknownFields());
                case 28:
                    return new LoyaltyActivityRenderData((LoyaltyActivityRenderData.Type) this.claimable_payment, buildUnknownFields());
                default:
                    return new P2pPoolContributionRenderData((P2pPoolComment) this.claimable_payment, buildUnknownFields());
            }
        }
    }

    static {
        ClaimData$Companion$ADAPTER$1 claimData$Companion$ADAPTER$1 = new ClaimData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClaimData.class), "type.googleapis.com/squareup.franklin.app.ClaimData", Syntax.PROTO_2, null, "squareup/franklin/app/claim_data.proto");
        ADAPTER = claimData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(claimData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimData(ClaimablePayment claimablePayment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.claimable_payment = claimablePayment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClaimData)) {
            return false;
        }
        ClaimData claimData = (ClaimData) obj;
        return Intrinsics.areEqual(unknownFields(), claimData.unknownFields()) && Intrinsics.areEqual(this.claimable_payment, claimData.claimable_payment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClaimablePayment claimablePayment = this.claimable_payment;
        int hashCode2 = hashCode + (claimablePayment != null ? claimablePayment.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.claimable_payment = this.claimable_payment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClaimablePayment claimablePayment = this.claimable_payment;
        if (claimablePayment != null) {
            arrayList.add("claimable_payment=" + claimablePayment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClaimData{", "}", 0, null, null, 56);
    }
}
