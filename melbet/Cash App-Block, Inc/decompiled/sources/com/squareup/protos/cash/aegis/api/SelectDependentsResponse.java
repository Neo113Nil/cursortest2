package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesResponse;
import com.squareup.cash.cashcommercebrowser.api.v1.UpdateCustomerPreferencesResponse;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentResponse;
import com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentResponse;
import com.squareup.cash.cashmeoutside.app.v1.RemittanceViewedResponse;
import com.squareup.cash.cashmeoutside.app.v1.SubscribeToCountryReleaseResponse;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetPhonePlanAppletResponse;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptonauts.api.SetUsdOverLNPaymentPreferenceResponse;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingResponse;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentResponse;
import com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionResponse;
import com.squareup.cash.overdraftly.api.v1_0.app.ComputeOverdraftSyncValuesResponse;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftResponse;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.DisableBalanceBasedAddCashPreferenceResponse;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceResponse;
import com.squareup.protos.cash.balancemover.api.v1.SavingsMoveCashResponse;
import com.squareup.protos.cash.blockstable.api.v1.InitiateWithdrawalResponse;
import com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentResponse;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.RemoveInstagramAccountResponse;
import com.squareup.protos.cash.cashface.api.ReportProfileResponse;
import com.squareup.protos.cash.cashfavorites.api.v1.RemoveFavoriteResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.InitiateBitcoinWithdrawalResponse;
import com.squareup.protos.cash.cashsuggest.api.UpdateCustomerShoppingPreferenceResponse;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/SelectDependentsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/api/SelectDependentsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectDependentsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectDependentsResponse> CREATOR;
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
                    return new SelectDependentsResponse(this.response_context, buildUnknownFields());
                case 1:
                    return new RefreshCashGreenSyncValuesResponse(this.response_context, buildUnknownFields());
                case 2:
                    return new UpdateCustomerPreferencesResponse(this.response_context, buildUnknownFields());
                case 3:
                    return new SelectInstrumentResponse(this.response_context, buildUnknownFields());
                case 4:
                    return new UpdateDefaultInstrumentResponse(this.response_context, buildUnknownFields());
                case 5:
                    return new RemittanceViewedResponse(this.response_context, buildUnknownFields());
                case 6:
                    return new SubscribeToCountryReleaseResponse(this.response_context, buildUnknownFields());
                case 7:
                    return new GetPhonePlanAppletResponse(this.response_context, buildUnknownFields());
                case 8:
                    return new SetUsdOverLNPaymentPreferenceResponse(this.response_context, buildUnknownFields());
                case 9:
                    ResponseContext responseContext = this.response_context;
                    if (responseContext != null) {
                        return new StartCryptoOnboardingResponse(responseContext, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(responseContext, "response_context");
                    throw null;
                case 10:
                    return new ConfirmBitcoinDepositIntentResponse(this.response_context, buildUnknownFields());
                case 11:
                    return new InitiateInstrumentSelectionResponse(this.response_context, buildUnknownFields());
                case 12:
                    return new com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionResponse(this.response_context, buildUnknownFields());
                case 13:
                    return new ComputeOverdraftSyncValuesResponse(this.response_context, buildUnknownFields());
                case 14:
                    return new ToggleOverdraftResponse(this.response_context, buildUnknownFields());
                case 15:
                    return new AddOrWithdrawMoneyForManagedAccountResponse(this.response_context, buildUnknownFields());
                case 16:
                    return new SelectAllowlistCustomersResponse(this.response_context, buildUnknownFields());
                case 17:
                    return new DisableBalanceBasedAddCashPreferenceResponse(this.response_context, buildUnknownFields());
                case 18:
                    return new SetBalanceBasedAddCashPreferenceResponse(this.response_context, buildUnknownFields());
                case 19:
                    return new SavingsMoveCashResponse(this.response_context, buildUnknownFields());
                case 20:
                    return new InitiateWithdrawalResponse(this.response_context, buildUnknownFields());
                case 21:
                    ResponseContext responseContext2 = this.response_context;
                    if (responseContext2 != null) {
                        return new AcceptCryptoPaymentResponse(responseContext2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(responseContext2, "response_context");
                    throw null;
                case 22:
                    return new ThreeDsAuthenticationResponse(this.response_context, buildUnknownFields());
                case 23:
                    return new RemoveInstagramAccountResponse(this.response_context, buildUnknownFields());
                case 24:
                    return new ReportProfileResponse(this.response_context, buildUnknownFields());
                case 25:
                    return new RemoveFavoriteResponse(this.response_context, buildUnknownFields());
                case 26:
                    return new InitiateBitcoinWithdrawalResponse(this.response_context, buildUnknownFields());
                case 27:
                    return new UpdateCustomerShoppingPreferenceResponse(this.response_context, buildUnknownFields());
                case 28:
                    return new ExchangeResponse(this.response_context, buildUnknownFields());
                default:
                    return new com.squareup.protos.cash.cryptoinvestflow.service.InitiateInstrumentSelectionResponse(this.response_context, buildUnknownFields());
            }
        }
    }

    static {
        SelectDependentsResponse$Companion$ADAPTER$1 selectDependentsResponse$Companion$ADAPTER$1 = new SelectDependentsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectDependentsResponse.class), "type.googleapis.com/squareup.cash.aegis.api.SelectDependentsResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/SelectDependentsResponse.proto");
        ADAPTER = selectDependentsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(selectDependentsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectDependentsResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectDependentsResponse)) {
            return false;
        }
        SelectDependentsResponse selectDependentsResponse = (SelectDependentsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), selectDependentsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, selectDependentsResponse.response_context);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectDependentsResponse{", "}", 0, null, null, 56);
    }
}
