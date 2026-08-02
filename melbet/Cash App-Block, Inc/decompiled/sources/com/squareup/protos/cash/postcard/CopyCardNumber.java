package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.OptionPickerSpec;
import com.squareup.protos.cash.local.client.v1.SetOrderLiveActivityTokenResponse;
import com.squareup.protos.cash.local.client.v1.SetPushToStartLiveActivityTokenResponse;
import com.squareup.protos.cash.local.client.v1.TagDefinition;
import com.squareup.protos.cash.marketdata.GetCustomerNewsRequest;
import com.squareup.protos.cash.marketdata.GetDiscoveryRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.EmptyPrimaryContent;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesV2Request;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageActionResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageDeliveredResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageViewResponse;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.DismissInAppMessageResponse;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageHorizontalDivider;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeRequest;
import com.squareup.protos.cash.paychecks.api.v1.GetPayersForCustomerRequest;
import com.squareup.protos.cash.paychecks.api.v1.RecordPayerTaggingPromptDismissalResponse;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.protos.cash.paychecks.api.v1.UpdatePayersForCustomerResponse;
import com.squareup.protos.cash.paymenttemplate.v1.CashP2PFiatMethodDetail;
import com.squareup.protos.cash.paymenttemplate.v1.SquareWebPaymentMethodDetail;
import com.squareup.protos.cash.peddle.app.UpdateAdvertiseIdResponse;
import com.squareup.protos.cash.postbank.api.InitiateDirectDepositSetupFlowRequest;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionsHomeDataRequest;
import com.squareup.protos.cash.shop.rendering.api.ClearInputTapAction;
import com.squareup.protos.cash.shop.rendering.api.ClientHandledAction;
import com.squareup.protos.cash.shop.rendering.api.DismissTapAction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CopyCardNumber extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CopyCardNumber> CREATOR;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CopyCardNumber(buildUnknownFields());
                case 1:
                    return new OptionPickerSpec(buildUnknownFields());
                case 2:
                    return new SetOrderLiveActivityTokenResponse.Success(buildUnknownFields());
                case 3:
                    return new SetPushToStartLiveActivityTokenResponse.Success(buildUnknownFields());
                case 4:
                    return new TagDefinition.OpenNow(buildUnknownFields());
                case 5:
                    return new GetCustomerNewsRequest(buildUnknownFields());
                case 6:
                    return new GetDiscoveryRequest(buildUnknownFields());
                case 7:
                    return new EmptyPrimaryContent(buildUnknownFields());
                case 8:
                    return new GetAppMessagesRequest(buildUnknownFields());
                case 9:
                    return new GetAppMessagesV2Request(buildUnknownFields());
                case 10:
                    return new ReportAppMessageActionResponse(buildUnknownFields());
                case 11:
                    return new ReportAppMessageDeliveredResponse(buildUnknownFields());
                case 12:
                    return new ReportAppMessageViewResponse(buildUnknownFields());
                case 13:
                    return new DismissInAppMessageResponse(buildUnknownFields());
                case 14:
                    return new DetailsPageHorizontalDivider(buildUnknownFields());
                case 15:
                    return new GetPaperCashDepositBarcodeRequest(buildUnknownFields());
                case 16:
                    return new GetPayersForCustomerRequest(buildUnknownFields());
                case 17:
                    return new RecordPayerTaggingPromptDismissalResponse(buildUnknownFields());
                case 18:
                    return new SubmitSetPaycheckMultiAllocationRequest.Cancel(buildUnknownFields());
                case 19:
                    return new UpdatePayersForCustomerResponse(buildUnknownFields());
                case 20:
                    return new CashP2PFiatMethodDetail(buildUnknownFields());
                case 21:
                    return new SquareWebPaymentMethodDetail(buildUnknownFields());
                case 22:
                    return new UpdateAdvertiseIdResponse(buildUnknownFields());
                case 23:
                    return new InitiateDirectDepositSetupFlowRequest(buildUnknownFields());
                case 24:
                    return new CardModule.CardElementAction.CopyCardNumber(buildUnknownFields());
                case 25:
                    return new CardModule.DividerModule(buildUnknownFields());
                case 26:
                    return new GetPromotionsHomeDataRequest(buildUnknownFields());
                case 27:
                    return new ClearInputTapAction(buildUnknownFields());
                case 28:
                    return new ClientHandledAction(buildUnknownFields());
                default:
                    return new DismissTapAction(buildUnknownFields());
            }
        }
    }

    static {
        CopyCardNumber$Companion$ADAPTER$1 copyCardNumber$Companion$ADAPTER$1 = new CopyCardNumber$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CopyCardNumber.class), "type.googleapis.com/squareup.cash.postcard.CopyCardNumber", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
        ADAPTER = copyCardNumber$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(copyCardNumber$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyCardNumber(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CopyCardNumber) && Intrinsics.areEqual(unknownFields(), ((CopyCardNumber) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "CopyCardNumber{}";
    }
}
