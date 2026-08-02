package com.squareup.protos.cash.giftly.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Response;
import com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Response;
import com.squareup.protos.cash.investautomator.api.external.GetAutomationResponse;
import com.squareup.protos.cash.investautomator.api.flows.InitiateChangeRoundUpDestinationFlowResponse;
import com.squareup.protos.cash.investautomator.api.flows.InitiateRoundUpOnboardingFlowResponse;
import com.squareup.protos.cash.investautomator.api.flows.SubmitAutomationForFlowResponse;
import com.squareup.protos.cash.investautomator.api.flows.UpdateAutomationForFlowResponse;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionResponse;
import com.squareup.protos.cash.janus.api.DeregisterWebAuthnCredentialResponse;
import com.squareup.protos.cash.janus.api.FinishWebAuthnRegistrationResponse;
import com.squareup.protos.cash.local.client.app.v1.AbandonPOSCheckInResponse;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsResponse;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsResponse;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsResponse;
import com.squareup.protos.cash.local.client.app.v1.CreatePOSLocalCashRedemptionResponse;
import com.squareup.protos.cash.local.client.app.v1.UpdateEarningCardResponse;
import com.squareup.protos.cash.p2pencoreedge.plasma.SetRecurringPaymentPreferencesResponse;
import com.squareup.protos.cash.paychecks.api.v1.AddOrEditAllocationDestinationResponse;
import com.squareup.protos.cash.paychecks.api.v1.DisablePaycheckAllocationResponse;
import com.squareup.protos.cash.paychecks.api.v1.RefreshPaychecksAppletResponse;
import com.squareup.protos.cash.paychecks.api.v1.RefreshPaychecksHomeResponse;
import com.squareup.protos.cash.paychecks.api.v1.SaveUserAcknowledgedRiskAlertResponse;
import com.squareup.protos.cash.paychecks.api.v1.SaveUserViewedDirectDepositUpsellResponse;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckAllocationAmountResponse;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationResponse;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsAppletResponse;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsHomeResponse;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsScreensResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/giftly/app/SetGiftCardActiveResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/giftly/app/SetGiftCardActiveResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetGiftCardActiveResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetGiftCardActiveResponse> CREATOR;
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
                    return new SetGiftCardActiveResponse(this.response_context, buildUnknownFields());
                case 1:
                    return new InitiateBitcoinWithdrawal$Response(this.response_context, buildUnknownFields());
                case 2:
                    return new RefreshInvoice$Response(this.response_context, buildUnknownFields());
                case 3:
                    return new ConvertGiftCardToCashResponse(this.response_context, buildUnknownFields());
                case 4:
                    return new GetAutomationResponse(this.response_context, buildUnknownFields());
                case 5:
                    return new InitiateChangeRoundUpDestinationFlowResponse(this.response_context, buildUnknownFields());
                case 6:
                    return new InitiateRoundUpOnboardingFlowResponse(this.response_context, buildUnknownFields());
                case 7:
                    return new SubmitAutomationForFlowResponse(this.response_context, buildUnknownFields());
                case 8:
                    return new UpdateAutomationForFlowResponse(this.response_context, buildUnknownFields());
                case 9:
                    return new SubmitInvestmentEntitySelectionResponse(this.response_context, buildUnknownFields());
                case 10:
                    return new DeregisterWebAuthnCredentialResponse(this.response_context, buildUnknownFields());
                case 11:
                    return new FinishWebAuthnRegistrationResponse(this.response_context, buildUnknownFields());
                case 12:
                    return new AbandonPOSCheckInResponse(this.response_context, buildUnknownFields());
                case 13:
                    return new BulkAddBrandsResponse(this.response_context, buildUnknownFields());
                case 14:
                    return new BulkRemoveBrandsResponse(this.response_context, buildUnknownFields());
                case 15:
                    return new BulkUpdateBrandsResponse(this.response_context, buildUnknownFields());
                case 16:
                    return new CreatePOSLocalCashRedemptionResponse(this.response_context, buildUnknownFields());
                case 17:
                    return new UpdateEarningCardResponse(this.response_context, buildUnknownFields());
                case 18:
                    return new SetRecurringPaymentPreferencesResponse(this.response_context, buildUnknownFields());
                case 19:
                    return new AddOrEditAllocationDestinationResponse(this.response_context, buildUnknownFields());
                case 20:
                    return new DisablePaycheckAllocationResponse(this.response_context, buildUnknownFields());
                case 21:
                    return new RefreshPaychecksAppletResponse(this.response_context, buildUnknownFields());
                case 22:
                    return new RefreshPaychecksHomeResponse(this.response_context, buildUnknownFields());
                case 23:
                    return new SaveUserAcknowledgedRiskAlertResponse(this.response_context, buildUnknownFields());
                case 24:
                    return new SaveUserViewedDirectDepositUpsellResponse(this.response_context, buildUnknownFields());
                case 25:
                    return new SubmitSetPaycheckAllocationAmountResponse(this.response_context, buildUnknownFields());
                case 26:
                    return new SubmitSetPaycheckMultiAllocationResponse(this.response_context, buildUnknownFields());
                case 27:
                    return new RefreshSavingsAppletResponse(this.response_context, buildUnknownFields());
                case 28:
                    return new RefreshSavingsHomeResponse(this.response_context, buildUnknownFields());
                default:
                    return new RefreshSavingsScreensResponse(this.response_context, buildUnknownFields());
            }
        }
    }

    static {
        SetGiftCardActiveResponse$Companion$ADAPTER$1 setGiftCardActiveResponse$Companion$ADAPTER$1 = new SetGiftCardActiveResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetGiftCardActiveResponse.class), "type.googleapis.com/squareup.cash.giftly.app.SetGiftCardActiveResponse", Syntax.PROTO_2, null, "squareup/cash/giftly/app/SetGiftCardActive.proto");
        ADAPTER = setGiftCardActiveResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setGiftCardActiveResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetGiftCardActiveResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetGiftCardActiveResponse)) {
            return false;
        }
        SetGiftCardActiveResponse setGiftCardActiveResponse = (SetGiftCardActiveResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setGiftCardActiveResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, setGiftCardActiveResponse.response_context);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetGiftCardActiveResponse{", "}", 0, null, null, 56);
    }
}
