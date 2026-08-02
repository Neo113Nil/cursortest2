package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.access.sync_values.OTPInfo;
import com.squareup.protos.cash.cashbusinessaccounts.BtcAppletRenderingState;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.cashidv.flows.PersonalInformationRefreshFlowParameters;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataResponse;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.compass.api.SetGpsConsentStatusResponse;
import com.squareup.protos.cash.deviceintegritly.api.SendMRIContextResponse;
import com.squareup.protos.cash.deviceintegritly.api.SendSignedMRIContextResponse;
import com.squareup.protos.cash.genericelements.ui.LineDividerComponent;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.DynamicGrantApprovalMetadata;
import com.squareup.protos.cash.local.client.v1.Feature;
import com.squareup.protos.cash.local.client.v1.LocalActionRedemption;
import com.squareup.protos.cash.lynx.api.v1_0.InitiateStripeLinkRequest;
import com.squareup.protos.cash.offerdex.sync.OfferCustomerPreference;
import com.squareup.protos.cash.security.mri.api.v1.AndroidSignals;
import com.squareup.protos.cash.shopping.CustomerShoppingPreference;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import com.squareup.protos.cash.supportal.app.ValidateEmailResponse;
import com.squareup.protos.cash.taply.app.v1.DeviceProvisioningStatus;
import com.squareup.protos.checkmate.sync.CheckDepositEligibility;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.protos.papermate.PaperCashDepositEligibility;
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
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.earnings.EarnerEnrollmentState;

/* loaded from: classes8.dex */
public final class UiAppLock extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiAppLock> CREATOR;
    public final Boolean activated;

    static {
        UiAppLock$Companion$ADAPTER$1 uiAppLock$Companion$ADAPTER$1 = new UiAppLock$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiAppLock.class), "type.googleapis.com/squareup.franklin.ui.UiAppLock", Syntax.PROTO_2, null, "squareup/franklin/ui/applock.proto");
        ADAPTER = uiAppLock$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiAppLock$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAppLock(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activated = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiAppLock)) {
            return false;
        }
        UiAppLock uiAppLock = (UiAppLock) obj;
        return Intrinsics.areEqual(unknownFields(), uiAppLock.unknownFields()) && Intrinsics.areEqual(this.activated, uiAppLock.activated);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.activated;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.activated = this.activated;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.activated;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("activated=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiAppLock{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean activated;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiAppLock(this.activated, buildUnknownFields());
                case 1:
                    return new OTPInfo(this.activated, buildUnknownFields());
                case 2:
                    return new BtcAppletRenderingState(this.activated, buildUnknownFields());
                case 3:
                    return new C4bEligibilityState(this.activated, buildUnknownFields());
                case 4:
                    return build();
                case 5:
                    return new UserDataResponse.InteractionEvents(this.activated, buildUnknownFields());
                case 6:
                    return new CommerceBrowserAutofillPreferences(this.activated, buildUnknownFields());
                case 7:
                    return new SetGpsConsentStatusResponse(this.activated, buildUnknownFields());
                case 8:
                    Boolean bool = this.activated;
                    if (bool != null) {
                        return new SendMRIContextResponse(bool.booleanValue(), buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(bool, "message_received");
                    throw null;
                case 9:
                    Boolean bool2 = this.activated;
                    if (bool2 != null) {
                        return new SendSignedMRIContextResponse(bool2.booleanValue(), buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(bool2, "message_received");
                    throw null;
                case 10:
                    return new LineDividerComponent(this.activated, buildUnknownFields());
                case 11:
                    return new Action.ScopeOptions(this.activated, buildUnknownFields());
                case 12:
                    return new DynamicGrantApprovalMetadata(this.activated, buildUnknownFields());
                case 13:
                    return new Feature(this.activated, buildUnknownFields());
                case 14:
                    return new LocalActionRedemption(this.activated, buildUnknownFields());
                case 15:
                    return new InitiateStripeLinkRequest(this.activated, buildUnknownFields());
                case 16:
                    return new OfferCustomerPreference(this.activated, buildUnknownFields());
                case 17:
                    return new AndroidSignals(this.activated, buildUnknownFields());
                case 18:
                    return new CustomerShoppingPreference(this.activated, buildUnknownFields());
                case 19:
                    return new SupportChatStatusResponse.Granted(this.activated, buildUnknownFields());
                case 20:
                    return new ValidateEmailResponse(this.activated, buildUnknownFields());
                case 21:
                    return new DeviceProvisioningStatus(this.activated, buildUnknownFields());
                case 22:
                    return new CheckDepositEligibility(this.activated, buildUnknownFields());
                case 23:
                    return new SubmitFormRequest.ElementResult.CheckBoxResult(this.activated, buildUnknownFields());
                case 24:
                    return new CustomerAdjustmentRenderData.BitcoinContext(this.activated, buildUnknownFields());
                case 25:
                    return new UiMarketing(this.activated, buildUnknownFields());
                case 26:
                    return new PaperCashDepositEligibility(this.activated, buildUnknownFields());
                case 27:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection(this.activated, buildUnknownFields());
                case 28:
                    return new GreenBenefitsV1.Benefit.PrioritySupportBenefit(this.activated, buildUnknownFields());
                default:
                    return new EarnerEnrollmentState(this.activated, buildUnknownFields());
            }
        }

        public void confirm_without_review() {
            this.activated = Boolean.TRUE;
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public PersonalInformationRefreshFlowParameters build() {
            return new PersonalInformationRefreshFlowParameters(this.activated, buildUnknownFields());
        }
    }
}
