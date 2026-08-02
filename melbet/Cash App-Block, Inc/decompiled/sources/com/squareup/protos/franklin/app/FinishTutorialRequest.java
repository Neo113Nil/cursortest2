package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetPhonePlanAppletRequest;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.overdraftly.api.v1_0.app.ComputeOverdraftSyncValuesRequest;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.DisableBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.cash.blockstable.api.v1.GetWalletAddressesRequest;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoRequest;
import com.squareup.protos.cash.cashliteflow.api.v1.GetCashInAccountRequest;
import com.squareup.protos.cash.cashsourceoffunds.api.v1.DismissLimitsPageletMessageRequest;
import com.squareup.protos.cash.local.client.app.v1.GetLocalCashDetailRequest;
import com.squareup.protos.cash.local.client.app.v1.GetMarketScreenDataRequest;
import com.squareup.protos.cash.paychecks.api.v1.RefreshPaychecksAppletRequest;
import com.squareup.protos.cash.paychecks.api.v1.RefreshPaychecksHomeRequest;
import com.squareup.protos.cash.paychecks.api.v1.SaveUserViewedDirectDepositUpsellRequest;
import com.squareup.protos.cash.piggybank.appapi.Get1099IntStatementsRequest;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsAppletRequest;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsScreensRequest;
import com.squareup.protos.cash.piggybank.appapi.RemoveActiveGoalRequest;
import com.squareup.protos.cash.postbank.api.GetCustomerPrimaryDdaDetailsRequest;
import com.squareup.protos.cash.postcard.app.RefreshCardTabSchemeRequest;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsEntryPointRequest;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsHomeRequest;
import com.squareup.protos.cash.unicorn.api.ComputeDisclosureSyncValueRequest;
import com.squareup.protos.franklin.common.InitiatePasscodeResetRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class FinishTutorialRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FinishTutorialRequest> CREATOR;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public RequestContext request_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new FinishTutorialRequest(this.request_context, buildUnknownFields());
                case 1:
                    return new GetMobilePlanHomeRequest(this.request_context, buildUnknownFields());
                case 2:
                    return new GetNewLineActivationStatusRequest(this.request_context, buildUnknownFields());
                case 3:
                    return new GetPhonePlanAppletRequest(this.request_context, buildUnknownFields());
                case 4:
                    return new ComputeOverdraftSyncValuesRequest(this.request_context, buildUnknownFields());
                case 5:
                    return new DisableBalanceBasedAddCashPreferenceRequest(this.request_context, buildUnknownFields());
                case 6:
                    return new GetWalletAddressesRequest(this.request_context, buildUnknownFields());
                case 7:
                    return new GetThreeDsEligibleInstrumentsInfoRequest(this.request_context, buildUnknownFields());
                case 8:
                    return new GetCashInAccountRequest(this.request_context, buildUnknownFields());
                case 9:
                    return new DismissLimitsPageletMessageRequest(this.request_context, buildUnknownFields());
                case 10:
                    return new GetLocalCashDetailRequest(this.request_context, buildUnknownFields());
                case 11:
                    return new GetMarketScreenDataRequest(this.request_context, buildUnknownFields());
                case 12:
                    return new RefreshPaychecksAppletRequest(this.request_context, buildUnknownFields());
                case 13:
                    return new RefreshPaychecksHomeRequest(this.request_context, buildUnknownFields());
                case 14:
                    return new SaveUserViewedDirectDepositUpsellRequest(this.request_context, buildUnknownFields());
                case 15:
                    return new Get1099IntStatementsRequest(this.request_context, buildUnknownFields());
                case 16:
                    return new RefreshSavingsAppletRequest(this.request_context, buildUnknownFields());
                case 17:
                    return new RefreshSavingsScreensRequest(this.request_context, buildUnknownFields());
                case 18:
                    return new RemoveActiveGoalRequest(this.request_context, buildUnknownFields());
                case 19:
                    return new GetCustomerPrimaryDdaDetailsRequest(this.request_context, buildUnknownFields());
                case 20:
                    return new RefreshCardTabSchemeRequest(this.request_context, buildUnknownFields());
                case 21:
                    return new RefreshCardSpendingInsightsEntryPointRequest(this.request_context, buildUnknownFields());
                case 22:
                    return new RefreshCardSpendingInsightsHomeRequest(this.request_context, buildUnknownFields());
                case 23:
                    return new ComputeDisclosureSyncValueRequest(this.request_context, buildUnknownFields());
                case 24:
                    return new ClearProfilePhotoRequest(this.request_context, buildUnknownFields());
                case 25:
                    return new ConfirmDisclosureRequest(this.request_context, buildUnknownFields());
                case 26:
                    return new CreditMultiStepLoadPollingRequest(this.request_context, buildUnknownFields());
                case 27:
                    return new GetScenarioPlanRequest(this.request_context, buildUnknownFields());
                case 28:
                    return new RequestPushNotificationsRequest(this.request_context, buildUnknownFields());
                default:
                    return new InitiatePasscodeResetRequest(this.request_context, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FinishTutorialRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.FinishTutorialRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new FinishTutorialRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FinishTutorialRequest finishTutorialRequest = (FinishTutorialRequest) obj;
                reverseProtoWriter.getClass();
                finishTutorialRequest.getClass();
                reverseProtoWriter.writeBytes(finishTutorialRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, finishTutorialRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FinishTutorialRequest finishTutorialRequest = (FinishTutorialRequest) obj;
                finishTutorialRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(1, finishTutorialRequest.request_context) + finishTutorialRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                FinishTutorialRequest finishTutorialRequest = (FinishTutorialRequest) obj;
                finishTutorialRequest.getClass();
                RequestContext requestContext = finishTutorialRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new FinishTutorialRequest(requestContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FinishTutorialRequest finishTutorialRequest = (FinishTutorialRequest) obj;
                finishTutorialRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, finishTutorialRequest.request_context);
                protoWriter.writeBytes(finishTutorialRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishTutorialRequest(RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinishTutorialRequest)) {
            return false;
        }
        FinishTutorialRequest finishTutorialRequest = (FinishTutorialRequest) obj;
        return Intrinsics.areEqual(unknownFields(), finishTutorialRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, finishTutorialRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = hashCode + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FinishTutorialRequest{", "}", 0, null, null, 56);
    }
}
