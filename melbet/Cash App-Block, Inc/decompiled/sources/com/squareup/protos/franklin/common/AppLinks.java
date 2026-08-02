package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdt;
import com.google.android.gms.internal.mlkit_vision_face.zzdy;
import com.google.android.gms.internal.mlkit_vision_face.zzec;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.app.VerifyQrCodeResponse;
import com.squareup.protos.franklin.common.BillPayRenderData;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.protos.franklin.common.DepositFeeData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.protos.franklin.common.RemittancePaymentRenderData;
import com.squareup.protos.franklin.common.SyncInvestmentEntityRanking;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.investing.CancelInvestmentOrderResponse;
import com.squareup.protos.franklin.investing.UpdateInvestmentHoldingResponse;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.lending.GetAddCashForPaymentPromptResponse;
import com.squareup.protos.franklin.lending.LoanDetailsResponse;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
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

/* loaded from: classes8.dex */
public final class AppLinks extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppLinks> CREATOR;

    /* renamed from: android, reason: collision with root package name */
    public final AppLinkAndroid f1371android;
    public final AppLinkIOS ios;

    static {
        AppLinks$Companion$ADAPTER$1 appLinks$Companion$ADAPTER$1 = new AppLinks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppLinks.class), "type.googleapis.com/squareup.franklin.common.AppLinks", Syntax.PROTO_2, null, "squareup/franklin/common/app_links.proto");
        ADAPTER = appLinks$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appLinks$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinks(AppLinkAndroid appLinkAndroid, AppLinkIOS appLinkIOS, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1371android = appLinkAndroid;
        this.ios = appLinkIOS;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLinks)) {
            return false;
        }
        AppLinks appLinks = (AppLinks) obj;
        return Intrinsics.areEqual(unknownFields(), appLinks.unknownFields()) && Intrinsics.areEqual(this.f1371android, appLinks.f1371android) && Intrinsics.areEqual(this.ios, appLinks.ios);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppLinkAndroid appLinkAndroid = this.f1371android;
        int hashCode2 = (hashCode + (appLinkAndroid != null ? appLinkAndroid.hashCode() : 0)) * 37;
        AppLinkIOS appLinkIOS = this.ios;
        int hashCode3 = hashCode2 + (appLinkIOS != null ? appLinkIOS.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1372android = this.f1371android;
        builder.ios = this.ios;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppLinkAndroid appLinkAndroid = this.f1371android;
        if (appLinkAndroid != null) {
            arrayList.add("android=" + appLinkAndroid);
        }
        AppLinkIOS appLinkIOS = this.ios;
        if (appLinkIOS != null) {
            arrayList.add("ios=" + appLinkIOS);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppLinks{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        /* renamed from: android, reason: collision with root package name */
        public Object f1372android;
        public Object ios;

        public Builder() {
            this.$r8$classId = 11;
            this.f1372android = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AppLinks((AppLinkAndroid) this.f1372android, (AppLinkIOS) this.ios, buildUnknownFields());
                case 1:
                    return new VerifyQrCodeResponse((ResponseContext) this.f1372android, (VerifyQrCodeResponse.Status) this.ios, buildUnknownFields());
                case 2:
                    return new BillPayRenderData((BillPayRenderData.BillCategory) this.f1372android, (BillPayRenderData.BillPayPaymentState) this.ios, buildUnknownFields());
                case 3:
                    return new BitcoinStatus((Long) this.f1372android, (BitcoinState) this.ios, buildUnknownFields());
                case 4:
                    return new CashDrawerData((CashDrawerData.CardControls) this.f1372android, (Boolean) this.ios, buildUnknownFields());
                case 5:
                    return new DepositFeeData((DepositFeeData.FeeType) this.f1372android, (Long) this.ios, buildUnknownFields());
                case 6:
                    return new DigitalWalletTokenProvisioningCompletionData((DigitalWalletToken$Issuer) this.f1372android, (DigitalWalletTokenProvisioningCompletionData.ProvisioningResult) this.ios, buildUnknownFields());
                case 7:
                    return new DigitalWalletTokenProvisioningRequestData((DigitalWalletToken$Issuer) this.f1372android, (zzdt) this.ios, buildUnknownFields());
                case 8:
                    return new GroupActivityRenderData((GroupActivityRenderData$Params$MemberAdded) this.f1372android, (String) this.ios, buildUnknownFields());
                case 9:
                    return new InitiatePasscodeResetResponse((ResponseContext) this.f1372android, (InitiatePasscodeResetResponse.Status) this.ios, buildUnknownFields());
                case 10:
                    return new InvestPaymentRenderData.SenderData((InvestPaymentRenderData.SenderData.Status) this.f1372android, (String) this.ios, buildUnknownFields());
                case 11:
                    return new LocalizationConfig((List) this.f1372android, (LocalizationConfig.LanguageDisclosure) this.ios, buildUnknownFields());
                case 12:
                    return new PaymentPlanEligibilityRenderData.EligibilityUiData((PaymentPlanEligibilityRenderData.LoanDuration) this.f1372android, (String) this.ios, buildUnknownFields());
                case 13:
                    return new PaymentPlanEligibilityRenderData.LoanDuration((PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit) this.f1372android, (Long) this.ios, buildUnknownFields());
                case 14:
                    return new RemittancePaymentRenderData.RecipientPaymentRenderData((String) this.f1372android, (GlobalAddress) this.ios, buildUnknownFields());
                case 15:
                    return new RoundUpsData((Automation.AutomationStatus) this.f1372android, (Automation.AutomationTarget) this.ios, buildUnknownFields());
                case 16:
                    return new SharingConfig((Boolean) this.f1372android, (SharingContent) this.ios, buildUnknownFields());
                case 17:
                    return new SponsoredAccountRenderData((zzdy) this.f1372android, (Boolean) this.ios, buildUnknownFields());
                case 18:
                    return new StaticLimitGroup((CurrencyCode) this.f1372android, (SettingsGroup) this.ios, buildUnknownFields());
                case 19:
                    return new SyncInvestmentEntityRanking((SyncInvestmentEntityRanking.RankingType) this.f1372android, (List) this.ios, buildUnknownFields());
                case 20:
                    return new SyncPayment((UiPayment) this.f1372android, (Boolean) this.ios, buildUnknownFields());
                case 21:
                    return new SyncValue((SyncValueType) this.f1372android, (SyncValue.Value) this.ios, buildUnknownFields());
                case 22:
                    return new SyncValueSchemaVersion((SyncValueType) this.f1372android, (Long) this.ios, buildUnknownFields());
                case 23:
                    return new CancelInvestmentOrderResponse((ResponseContext) this.f1372android, (CancelInvestmentOrderResponse.Status) this.ios, buildUnknownFields());
                case 24:
                    return new UpdateInvestmentHoldingResponse((ResponseContext) this.f1372android, (SyncInvestmentHolding) this.ios, buildUnknownFields());
                case 25:
                    return new CreditLine.UnlockBorrowData((String) this.f1372android, (ClientScenario) this.ios, buildUnknownFields());
                case 26:
                    return new GetAddCashForPaymentPromptResponse((ResponseContext) this.f1372android, (LocalizedString) this.ios, buildUnknownFields());
                case 27:
                    return new LoanDetailsResponse((ResponseContext) this.f1372android, (BorrowAppletLoanHistoryTile.Data.Loan.Details) this.ios, buildUnknownFields());
                case 28:
                    return new LoanTransaction.LoanPayment((LoanTransaction.LoanPayment.State) this.f1372android, (Money) this.ios, buildUnknownFields());
                default:
                    return new SelectPaymentPlanBlockerSubmitRequest((zzec) this.f1372android, (RequestContext) this.ios, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
