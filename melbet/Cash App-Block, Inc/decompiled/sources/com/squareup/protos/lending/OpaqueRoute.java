package com.squareup.protos.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.plasma.flows.v1.LockPaymentTokenDeviceFlowParameters;
import com.squareup.protos.cash.tax.OpenTaxResponse;
import com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig;
import com.squareup.protos.cash.unicorn.dismiss_badge.DismissBadgeRequest;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.protos.franklin.app.CashLiteClientRoute;
import com.squareup.protos.franklin.app.CheckRewardCodeRequest;
import com.squareup.protos.franklin.app.FindCustomersRequest;
import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import com.squareup.protos.franklin.app.PresetDesign;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import com.squareup.protos.franklin.app.SetOnboardingContextResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.CashHouseScreen;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.protos.franklin.common.GroupActivityRenderData;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.protos.franklin.onboarding.LoyaltyOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.onboarding.StaffInvitationOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.support.CreateSupportCaseResponse;
import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.protos.payroll.service.GetEmployeeAccessDetailsRequest;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
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

/* loaded from: classes8.dex */
public final class OpaqueRoute extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpaqueRoute> CREATOR;
    public final String client_route;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String client_route;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new OpaqueRoute(this.client_route, buildUnknownFields());
                case 1:
                    return new LockPaymentTokenDeviceFlowParameters(this.client_route, buildUnknownFields());
                case 2:
                    return new OpenTaxResponse(this.client_route, buildUnknownFields());
                case 3:
                    return new TransactionActivityConfig.TransactionAuthConfig(this.client_route, buildUnknownFields());
                case 4:
                    return new DismissBadgeRequest(this.client_route, buildUnknownFields());
                case 5:
                    return new GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction(this.client_route, buildUnknownFields());
                case 6:
                    return new Action.ClientRouteAction(this.client_route, buildUnknownFields());
                case 7:
                    return new CashLiteClientRoute(this.client_route, buildUnknownFields());
                case 8:
                    return new CheckRewardCodeRequest(this.client_route, buildUnknownFields());
                case 9:
                    return new FindCustomersRequest(this.client_route, buildUnknownFields());
                case 10:
                    return new P2pInstrumentSelectionRequest.ExistingInstrumentOption(this.client_route, buildUnknownFields());
                case 11:
                    return new PresetDesign(this.client_route, buildUnknownFields());
                case 12:
                    return new SelectTransferOptionRequest.SelectOptionAction(this.client_route, buildUnknownFields());
                case 13:
                    return new SetOnboardingContextResponse(this.client_route, buildUnknownFields());
                case 14:
                    return new SubmitFormRequest.ElementResult.CashtagResult(this.client_route, buildUnknownFields());
                case 15:
                    return new SubmitFormRequest.ElementResult.EmojiPickerResult(this.client_route, buildUnknownFields());
                case 16:
                    return new SubmitFormRequest.ElementResult.OptionPickerResult(this.client_route, buildUnknownFields());
                case 17:
                    return new CashHouseScreen(this.client_route, buildUnknownFields());
                case 18:
                    return new DigitalWalletTokenProvisioningResponseData.GooglePayResponse(this.client_route, buildUnknownFields());
                case 19:
                    return new GiftCardRenderData.SenderData(this.client_route, buildUnknownFields());
                case 20:
                    return new GroupActivityRenderData.MemberAdded(this.client_route, buildUnknownFields());
                case 21:
                    return new SelectPaymentPlanBlockerSubmitRequest.ConfirmOption(this.client_route, buildUnknownFields());
                case 22:
                    return new SelectPaymentPlanBlockerSubmitRequest.UpdateOption(this.client_route, buildUnknownFields());
                case 23:
                    return new LoyaltyOnboardingDeepLinkPayload(this.client_route, buildUnknownFields());
                case 24:
                    return new StaffInvitationOnboardingDeepLinkPayload(this.client_route, buildUnknownFields());
                case 25:
                    return new CreateSupportCaseResponse(this.client_route, buildUnknownFields());
                case 26:
                    return new C4BIdentityHubState.ClientRouteAction(this.client_route, buildUnknownFields());
                case 27:
                    String str = this.client_route;
                    if (str != null) {
                        return new GetEmployeeAccessDetailsRequest(str, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "team_member_id");
                    throw null;
                case 28:
                    return new UiRewardProgramDetails.DetailRow.OpenUrl(this.client_route, buildUnknownFields());
                default:
                    return new UiRewardSelectionState.Locked(this.client_route, buildUnknownFields());
            }
        }
    }

    static {
        OpaqueRoute$Companion$ADAPTER$1 opaqueRoute$Companion$ADAPTER$1 = new OpaqueRoute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpaqueRoute.class), "type.googleapis.com/squareup.lending.OpaqueRoute", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
        ADAPTER = opaqueRoute$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(opaqueRoute$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpaqueRoute(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_route = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpaqueRoute)) {
            return false;
        }
        OpaqueRoute opaqueRoute = (OpaqueRoute) obj;
        return Intrinsics.areEqual(unknownFields(), opaqueRoute.unknownFields()) && Intrinsics.areEqual(this.client_route, opaqueRoute.client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.client_route;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.client_route = this.client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpaqueRoute{", "}", 0, null, null, 56);
    }
}
