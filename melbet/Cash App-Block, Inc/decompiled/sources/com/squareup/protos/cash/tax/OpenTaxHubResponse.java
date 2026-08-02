package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.piggybank.appapi.RemoveActiveGoalResponse;
import com.squareup.protos.cash.pools.SendPoolContributionResponse;
import com.squareup.protos.cash.postcard.app.RefreshCardTabSchemeResponse;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsEntryPointResponse;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsHomeProxyResponse;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsHomeResponse;
import com.squareup.protos.cash.trustedcontacts.api.flows.InitiateSetTrustedContactFlowResponse;
import com.squareup.protos.cash.unicorn.api.ComputeDisclosureSyncValueResponse;
import com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueResponse;
import com.squareup.protos.franklin.app.ActivateDigitalWalletResponse;
import com.squareup.protos.franklin.app.AddOrUpdateRewardResponse;
import com.squareup.protos.franklin.app.AddReactionResponse;
import com.squareup.protos.franklin.app.ApproveCashAppPayResponse;
import com.squareup.protos.franklin.app.CheckDepositResponse;
import com.squareup.protos.franklin.app.ClabeEntryResponse;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningResponse;
import com.squareup.protos.franklin.app.ConfirmDisclosureResponse;
import com.squareup.protos.franklin.app.CreditFirstTimeBorrowResponse;
import com.squareup.protos.franklin.app.EndFlowResponse;
import com.squareup.protos.franklin.app.FinishCreditMultiStepLoadResponse;
import com.squareup.protos.franklin.app.FinishInstantPayDirectDepositSwitchResponse;
import com.squareup.protos.franklin.app.FinishTutorialResponse;
import com.squareup.protos.franklin.app.MultiCurrencyAmountEntryResponse;
import com.squareup.protos.franklin.app.MultiCurrencyPaymentReviewResponse;
import com.squareup.protos.franklin.app.OverflowOptionPickerResponse;
import com.squareup.protos.franklin.app.ReportAbuseResponse;
import com.squareup.protos.franklin.app.SelectActivityResponse;
import com.squareup.protos.franklin.app.SelectSponsorsResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/tax/OpenTaxHubResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/OpenTaxHubResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenTaxHubResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenTaxHubResponse> CREATOR;
    public final ResponseContext response_context;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ResponseContext response_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new OpenTaxHubResponse(this.response_context, buildUnknownFields());
                case 1:
                    return new RemoveActiveGoalResponse(this.response_context, buildUnknownFields());
                case 2:
                    return new SendPoolContributionResponse(this.response_context, buildUnknownFields());
                case 3:
                    return new RefreshCardTabSchemeResponse(this.response_context, buildUnknownFields());
                case 4:
                    return new RefreshCardSpendingInsightsEntryPointResponse(this.response_context, buildUnknownFields());
                case 5:
                    return new RefreshCardSpendingInsightsHomeProxyResponse(this.response_context, buildUnknownFields());
                case 6:
                    return new RefreshCardSpendingInsightsHomeResponse(this.response_context, buildUnknownFields());
                case 7:
                    return new TaxDeepLinkResponse(this.response_context, buildUnknownFields());
                case 8:
                    return new InitiateSetTrustedContactFlowResponse(this.response_context, buildUnknownFields());
                case 9:
                    return new ComputeDisclosureSyncValueResponse(this.response_context, buildUnknownFields());
                case 10:
                    return new ComputeBankingTabSyncValueResponse(this.response_context, buildUnknownFields());
                case 11:
                    return new ActivateDigitalWalletResponse(this.response_context, buildUnknownFields());
                case 12:
                    return new AddOrUpdateRewardResponse(this.response_context, buildUnknownFields());
                case 13:
                    return new AddReactionResponse(this.response_context, buildUnknownFields());
                case 14:
                    return new ApproveCashAppPayResponse(this.response_context, buildUnknownFields());
                case 15:
                    return new CheckDepositResponse(this.response_context, buildUnknownFields());
                case 16:
                    return new ClabeEntryResponse(this.response_context, buildUnknownFields());
                case 17:
                    return new CompleteDigitalWalletTokenProvisioningResponse(this.response_context, buildUnknownFields());
                case 18:
                    return new ConfirmDisclosureResponse(this.response_context, buildUnknownFields());
                case 19:
                    return new CreditFirstTimeBorrowResponse(this.response_context, buildUnknownFields());
                case 20:
                    return new EndFlowResponse(this.response_context, buildUnknownFields());
                case 21:
                    return new FinishCreditMultiStepLoadResponse(this.response_context, buildUnknownFields());
                case 22:
                    return new FinishInstantPayDirectDepositSwitchResponse(this.response_context, buildUnknownFields());
                case 23:
                    return new FinishTutorialResponse(this.response_context, buildUnknownFields());
                case 24:
                    return new MultiCurrencyAmountEntryResponse(this.response_context, buildUnknownFields());
                case 25:
                    return new MultiCurrencyPaymentReviewResponse(this.response_context, buildUnknownFields());
                case 26:
                    return new OverflowOptionPickerResponse(this.response_context, buildUnknownFields());
                case 27:
                    return new ReportAbuseResponse(this.response_context, buildUnknownFields());
                case 28:
                    return new SelectActivityResponse(this.response_context, buildUnknownFields());
                default:
                    return new SelectSponsorsResponse(this.response_context, buildUnknownFields());
            }
        }
    }

    static {
        OpenTaxHubResponse$Companion$ADAPTER$1 openTaxHubResponse$Companion$ADAPTER$1 = new OpenTaxHubResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenTaxHubResponse.class), "type.googleapis.com/squareup.cash.tax.OpenTaxHubResponse", Syntax.PROTO_2, null, "squareup/cash/tax/tax_front_door_api.proto");
        ADAPTER = openTaxHubResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(openTaxHubResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTaxHubResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenTaxHubResponse)) {
            return false;
        }
        OpenTaxHubResponse openTaxHubResponse = (OpenTaxHubResponse) obj;
        return Intrinsics.areEqual(unknownFields(), openTaxHubResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, openTaxHubResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = hashCode + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenTaxHubResponse{", "}", 0, null, null, 56);
    }
}
