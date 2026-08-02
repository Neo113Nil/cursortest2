package com.squareup.protos.cash.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.primitives.CartEntryWithQuantityKt;
import app.cash.local.sharedui.LocalComposeUiKt;
import app.cash.local.viewmodels.OrderBuilderModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.aegis.core.SafetyEducationHubTile;
import com.squareup.protos.cash.agentcore.api.v1.AgentWalletRetrievePaymentResponse;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.cash.blockly.api.BlocklistDetails;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.api.ReportAbuseResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigResponse;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest;
import com.squareup.protos.cash.cashapproxy.api.Avatar;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensRequest;
import com.squareup.protos.cash.cashapproxy.api.RowItem;
import com.squareup.protos.cash.cashapproxy.api.SupTransactionSummary;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AddBugReportAttachmentRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.Attachment;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyRequest;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrandEntity;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.GetLocaleConsentAcceptanceResponse;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.LanguageDisclosure;
import com.squareup.protos.cash.cashface.api.CounterAbuseAction;
import com.squareup.protos.cash.cashface.api.ProfileAction;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashidv.common.Button;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.NavigationUrl;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.Platform;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.CardProcessorDetails;
import com.squareup.protos.cash.cashliteflow.api.v1.GetCardProcessorDetailsResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesError;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesErrorCode;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.policychecker.v1.EvaluationVerdict;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ResponseMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResponseMetadata> CREATOR;
    public final List errors;
    public final ResponseMetadata$Result$UpsertResult result;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object errors;
        public Object result;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ResponseMetadata((List) this.errors, (ResponseMetadata$Result$UpsertResult) this.result, buildUnknownFields());
                case 1:
                    return new SafetyEducationHubTile((String) this.errors, (BookletTile) this.result, buildUnknownFields());
                case 2:
                    return new AgentWalletRetrievePaymentResponse((String) this.errors, (AgentWalletRetrievePaymentResponse.Status) this.result, buildUnknownFields());
                case 3:
                    return new SetBalanceBasedAddCashPreferenceRequest((CartEntryWithQuantityKt) this.errors, (RequestContext) this.result, buildUnknownFields());
                case 4:
                    return new GetBlockedCustomersRequest((String) this.errors, (BlockingContext) this.result, buildUnknownFields());
                case 5:
                    return new GetBlockedCustomersResponse((List) this.errors, (BlocklistDetails) this.result, buildUnknownFields());
                case 6:
                    return new ReportAbuseResponse((ResponseContext) this.errors, (ReportAbuseResponse.Status) this.result, buildUnknownFields());
                case 7:
                    return new GetCardBlockedBusinessesUIConfigResponse((CardBlockedBusinessesUIConfig) this.errors, (ResponseContext) this.result, buildUnknownFields());
                case 8:
                    return new ThreeDsAuthenticationRequest((ThreeDsAuthenticationRequest.SdkInfo) this.errors, (RequestContext) this.result, buildUnknownFields());
                case 9:
                    return new Avatar((Image) this.errors, (Image) this.result, buildUnknownFields());
                case 10:
                    return new GetAfterpayCheckoutTokensRequest((String) this.errors, (GetAfterpayCheckoutTokensRequest.Source) this.result, buildUnknownFields());
                case 11:
                    return new RowItem((Text) this.errors, (Text) this.result, buildUnknownFields());
                case 12:
                    return new SupTransactionSummary((List) this.errors, (Instant) this.result, buildUnknownFields());
                case 13:
                    return new AddBugReportAttachmentRequest((String) this.errors, (Attachment) this.result, buildUnknownFields());
                case 14:
                    return new DowngradeBusinessAccountFlowParameters((DowngradeBusinessAccountFlowParameters.EntryPoint) this.errors, (String) this.result, buildUnknownFields());
                case 15:
                    return new ValidateTapToPayPolicyRequest((SignedSerializedMRIContext) this.errors, (String) this.result, buildUnknownFields());
                case 16:
                    return new ValidateTapToPayPolicyResponse.V1EvaluationResult((EvaluationVerdict) this.errors, (ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason) this.result, buildUnknownFields());
                case 17:
                    return new LocalBrandEntity((LocalBrand) this.errors, (String) this.result, buildUnknownFields());
                case 18:
                    return new GetLocaleConsentAcceptanceResponse((List) this.errors, (LanguageDisclosure) this.result, buildUnknownFields());
                case 19:
                    return new CounterAbuseAction((String) this.errors, (CounterAbuseAction.Action) this.result, buildUnknownFields());
                case 20:
                    return new ProfileAction((String) this.errors, (ProfileAction.State) this.result, buildUnknownFields());
                case 21:
                    return new ContextWrapper.Origin((ContextWrapper.Origin.OriginType) this.errors, (LocalComposeUiKt) this.result, buildUnknownFields());
                case 22:
                    return new GenericProfileElement.ActivityStatsElement((GenericProfileElement.ActivityStatsElement.ActivityStats) this.result, (List) this.errors, buildUnknownFields());
                case 23:
                    return new GenericProfileElement.ListElement((GenericProfileElement.ListElement.Direction) this.result, (List) this.errors, buildUnknownFields());
                case 24:
                    return new GenericProfileElement.TextElement((String) this.errors, (GenericProfileElement.TextElement.Style) this.result, buildUnknownFields());
                case 25:
                    return new Button((String) this.errors, (Button.Action) this.result, buildUnknownFields());
                case 26:
                    return new NavigationUrl((Platform) this.errors, (String) this.result, buildUnknownFields());
                case 27:
                    return new GetCustomerLimitsResponse((List) this.errors, (OrderBuilderModel.OrderType) this.result, buildUnknownFields());
                case 28:
                    return new GetCardProcessorDetailsResponse((CardProcessorDetails) this.errors, (ResponseContext) this.result, buildUnknownFields());
                default:
                    return new GetWalletAddressesError((GetWalletAddressesErrorCode) this.errors, (String) this.result, buildUnknownFields());
            }
        }
    }

    public enum UpsertResult implements WireEnum {
        UPSERT_CREATE(1),
        UPSERT_UPDATE(2);

        public final int value;
        public static final Edge.Companion Companion = new Edge.Companion(16);
        public static final ResponseMetadata$UpsertResult$Companion$ADAPTER$1 ADAPTER = new ResponseMetadata$UpsertResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UpsertResult.class), Syntax.PROTO_2, null);

        UpsertResult(int i) {
            this.value = i;
        }

        public static final UpsertResult fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return UPSERT_CREATE;
            }
            if (i != 2) {
                return null;
            }
            return UPSERT_UPDATE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ResponseMetadata$Companion$ADAPTER$1 responseMetadata$Companion$ADAPTER$1 = new ResponseMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResponseMetadata.class), "type.googleapis.com/squareup.cash.api.ResponseMetadata", Syntax.PROTO_2, null, "squareup/cash/api/contract.proto");
        ADAPTER = responseMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(responseMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseMetadata(List list, ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.result = responseMetadata$Result$UpsertResult;
        this.errors = TransactorKt.immutableCopyOf("errors", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseMetadata)) {
            return false;
        }
        ResponseMetadata responseMetadata = (ResponseMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), responseMetadata.unknownFields()) && Intrinsics.areEqual(this.errors, responseMetadata.errors) && Intrinsics.areEqual(this.result, responseMetadata.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.errors);
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = this.result;
        int hashCode = m + (responseMetadata$Result$UpsertResult != null ? responseMetadata$Result$UpsertResult.value.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.errors = this.errors;
        builder.result = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.errors;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("errors=", arrayList, list);
        }
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = this.result;
        if (responseMetadata$Result$UpsertResult != null) {
            arrayList.add("result=" + responseMetadata$Result$UpsertResult);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResponseMetadata{", "}", 0, null, null, 56);
    }
}
