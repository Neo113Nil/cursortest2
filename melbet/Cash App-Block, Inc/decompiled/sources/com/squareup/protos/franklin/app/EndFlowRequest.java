package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentRequest;
import com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentRequest;
import com.squareup.protos.cash.cashface.api.ReportProfileRequest;
import com.squareup.protos.cash.cashvoice.verification.app.v1.GetPhoneVerificationAttemptRequest;
import com.squareup.protos.cash.cashvoice.verification.app.v1.RejectPhoneVerificationAttemptRequest;
import com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Request;
import com.squareup.protos.cash.investcrypto.server.CancelOrderRequest;
import com.squareup.protos.cash.janus.api.DeregisterWebAuthnCredentialRequest;
import com.squareup.protos.cash.janus.api.GetLoginScenarioPlanRequest;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenRequest;
import com.squareup.protos.cash.piggybank.appapi.FamiliesSavingsScreensRequest;
import com.squareup.protos.cash.security.SetPasswordRequest;
import com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.UnlinkInstrumentRequest;
import com.squareup.protos.franklin.investing.CancelInvestmentOrderRequest;
import com.squareup.protos.franklin.lending.BulletinInteractionRequest;
import com.squareup.protos.franklin.lending.GetLoanHistoryRequest;
import com.squareup.protos.franklin.lending.LoanDetailsRequest;
import com.squareup.protos.franklin.lending.SkipLoanPaymentRequest;
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
public final class EndFlowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EndFlowRequest> CREATOR;
    public final String action_id;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String action_id;
        public RequestContext request_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EndFlowRequest(this.request_context, this.action_id, buildUnknownFields());
                case 1:
                    return new ConfirmBitcoinDepositIntentRequest(this.request_context, this.action_id, buildUnknownFields());
                case 2:
                    String str = this.action_id;
                    if (str != null) {
                        return new AcceptCryptoPaymentRequest(this.request_context, str, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "payment_token");
                    throw null;
                case 3:
                    String str2 = this.action_id;
                    if (str2 != null) {
                        return new ReportProfileRequest(this.request_context, str2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str2, "customer_token");
                    throw null;
                case 4:
                    return new GetPhoneVerificationAttemptRequest(this.request_context, this.action_id, buildUnknownFields());
                case 5:
                    return new RejectPhoneVerificationAttemptRequest(this.request_context, this.action_id, buildUnknownFields());
                case 6:
                    return new RefreshInvoice$Request(this.request_context, this.action_id, buildUnknownFields());
                case 7:
                    return new CancelOrderRequest(this.request_context, this.action_id, buildUnknownFields());
                case 8:
                    return new DeregisterWebAuthnCredentialRequest(this.request_context, this.action_id, buildUnknownFields());
                case 9:
                    return new GetLoginScenarioPlanRequest(this.request_context, this.action_id, buildUnknownFields());
                case 10:
                    return new RegisterProspectTokenRequest(this.request_context, this.action_id, buildUnknownFields());
                case 11:
                    return new FamiliesSavingsScreensRequest(this.request_context, this.action_id, buildUnknownFields());
                case 12:
                    return new SetPasswordRequest(this.request_context, this.action_id, buildUnknownFields());
                case 13:
                    return new ComputeBankingTabSyncValueRequest(this.request_context, this.action_id, buildUnknownFields());
                case 14:
                    return new ApplyRewardCodeRequest(this.request_context, this.action_id, buildUnknownFields());
                case 15:
                    return new CancelPaymentRequest(this.request_context, this.action_id, buildUnknownFields());
                case 16:
                    return new OverflowOptionPickerRequest(this.request_context, this.action_id, buildUnknownFields());
                case 17:
                    return new RefundPaymentRequest(this.request_context, this.action_id, buildUnknownFields());
                case 18:
                    return new SelectActivityRequest(this.request_context, this.action_id, buildUnknownFields());
                case 19:
                    return new SetCashtagRequest(this.request_context, this.action_id, buildUnknownFields());
                case 20:
                    return new SubmitBiometricsOptinRequest(this.request_context, this.action_id, buildUnknownFields());
                case 21:
                    return new UnlinkBusinessRequest(this.request_context, this.action_id, buildUnknownFields());
                case 22:
                    return new UnlinkInstrumentRequest(this.request_context, this.action_id, buildUnknownFields());
                case 23:
                    return new CancelInvestmentOrderRequest(this.request_context, this.action_id, buildUnknownFields());
                case 24:
                    return new BulletinInteractionRequest(this.request_context, this.action_id, buildUnknownFields());
                case 25:
                    return new GetLoanHistoryRequest(this.request_context, this.action_id, buildUnknownFields());
                case 26:
                    return new LoanDetailsRequest(this.request_context, this.action_id, buildUnknownFields());
                default:
                    return new SkipLoanPaymentRequest(this.request_context, this.action_id, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EndFlowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.EndFlowRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new EndFlowRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                EndFlowRequest endFlowRequest = (EndFlowRequest) obj;
                reverseProtoWriter.getClass();
                endFlowRequest.getClass();
                reverseProtoWriter.writeBytes(endFlowRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, endFlowRequest.action_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, endFlowRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                EndFlowRequest endFlowRequest = (EndFlowRequest) obj;
                endFlowRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, endFlowRequest.action_id) + RequestContext.ADAPTER.encodedSizeWithTag(1, endFlowRequest.request_context) + endFlowRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                EndFlowRequest endFlowRequest = (EndFlowRequest) obj;
                endFlowRequest.getClass();
                RequestContext requestContext = endFlowRequest.request_context;
                return EndFlowRequest.copy$default(endFlowRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                EndFlowRequest endFlowRequest = (EndFlowRequest) obj;
                endFlowRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, endFlowRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, endFlowRequest.action_id);
                protoWriter.writeBytes(endFlowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndFlowRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.action_id = str;
    }

    public static EndFlowRequest copy$default(EndFlowRequest endFlowRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = endFlowRequest.action_id;
        if ((i & 4) != 0) {
            byteString = endFlowRequest.unknownFields();
        }
        endFlowRequest.getClass();
        byteString.getClass();
        return new EndFlowRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EndFlowRequest)) {
            return false;
        }
        EndFlowRequest endFlowRequest = (EndFlowRequest) obj;
        return Intrinsics.areEqual(unknownFields(), endFlowRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, endFlowRequest.request_context) && Intrinsics.areEqual(this.action_id, endFlowRequest.action_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.action_id;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.action_id = this.action_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.action_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EndFlowRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ EndFlowRequest(RequestContext requestContext, String str, int i) {
        this(requestContext, (i & 2) != 0 ? null : str, ByteString.EMPTY);
    }
}
