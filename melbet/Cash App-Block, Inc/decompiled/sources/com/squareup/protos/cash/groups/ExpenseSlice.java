package com.squareup.protos.cash.groups;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.cashsuggest.api.ShopCategoryBrowseResponse;
import com.squareup.protos.cash.cashtes.app.v1beta1.ReturnStatus;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataResponse;
import com.squareup.protos.cash.cashvoice.verification.app.v1.GetPhoneVerificationAttemptResponse;
import com.squareup.protos.cash.cashvoice.verification.app.v1.PhoneVerificationAttemptState;
import com.squareup.protos.cash.compass.api.CellTowerContext;
import com.squareup.protos.cash.compass.api.GpsDataContext;
import com.squareup.protos.cash.compass.api.LocationAttributes;
import com.squareup.protos.cash.compass.api.WifiContext;
import com.squareup.protos.cash.compass.api.WriteGpsDataRequest;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.customersurveyor.app.SubmitSupportSurveyRequest;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.ProgressMeterElement;
import com.squareup.protos.cash.genericelements.ui.Size;
import com.squareup.protos.cash.genericelements.ui.TwoColumnRowComponent;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.Discount;
import com.squareup.protos.cash.grantly.api.Instrument;
import com.squareup.protos.cash.grantly.api.PreAuthorizationData;
import com.squareup.protos.cash.grantly.api.PreAuthorizePaymentResponse;
import com.squareup.protos.cash.janus.api.StartWebAuthnRegistrationResponse;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalMenuCategory;
import com.squareup.protos.cash.local.client.v1.LocalMenuHours;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage$VisualAsset$Video;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.pay.CashAppPayInstrumentRenderData;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.pay.CashAppPayPayoutRenderData;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateRequest;
import com.squareup.protos.cash.paymenttemplate.v1.CreationChannel;
import com.squareup.protos.cash.paymenttemplate.v1.TransactionCategory;
import com.squareup.protos.cash.portfolios.BalanceEventList;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue;
import com.squareup.protos.cash.postbank.api.GenerateDirectDepositFormRequest;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExpenseSlice extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExpenseSlice> CREATOR;
    public final PrimaryAction action;
    public final Money amount;
    public final GroupParticipant requester;
    public final GroupParticipant responder;
    public final String slice_token;
    public final SliceStatus status;

    static {
        ExpenseSlice$Companion$ADAPTER$1 expenseSlice$Companion$ADAPTER$1 = new ExpenseSlice$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExpenseSlice.class), "type.googleapis.com/squareup.cash.groups.ExpenseSlice", Syntax.PROTO_2, null, "squareup/cash/groups/expense.proto");
        ADAPTER = expenseSlice$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(expenseSlice$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpenseSlice(GroupParticipant groupParticipant, GroupParticipant groupParticipant2, Money money, SliceStatus sliceStatus, String str, PrimaryAction primaryAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.requester = groupParticipant;
        this.responder = groupParticipant2;
        this.amount = money;
        this.status = sliceStatus;
        this.slice_token = str;
        this.action = primaryAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExpenseSlice)) {
            return false;
        }
        ExpenseSlice expenseSlice = (ExpenseSlice) obj;
        return Intrinsics.areEqual(unknownFields(), expenseSlice.unknownFields()) && Intrinsics.areEqual(this.requester, expenseSlice.requester) && Intrinsics.areEqual(this.responder, expenseSlice.responder) && Intrinsics.areEqual(this.amount, expenseSlice.amount) && this.status == expenseSlice.status && Intrinsics.areEqual(this.slice_token, expenseSlice.slice_token) && Intrinsics.areEqual(this.action, expenseSlice.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GroupParticipant groupParticipant = this.requester;
        int hashCode2 = (hashCode + (groupParticipant != null ? groupParticipant.hashCode() : 0)) * 37;
        GroupParticipant groupParticipant2 = this.responder;
        int hashCode3 = (hashCode2 + (groupParticipant2 != null ? groupParticipant2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        SliceStatus sliceStatus = this.status;
        int hashCode5 = (hashCode4 + (sliceStatus != null ? sliceStatus.hashCode() : 0)) * 37;
        String str = this.slice_token;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        PrimaryAction primaryAction = this.action;
        int hashCode7 = hashCode6 + (primaryAction != null ? primaryAction.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.requester = this.requester;
        builder.responder = this.responder;
        builder.amount = this.amount;
        builder.status = this.status;
        builder.slice_token = this.slice_token;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GroupParticipant groupParticipant = this.requester;
        if (groupParticipant != null) {
            arrayList.add("requester=" + groupParticipant);
        }
        GroupParticipant groupParticipant2 = this.responder;
        if (groupParticipant2 != null) {
            arrayList.add("responder=" + groupParticipant2);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        SliceStatus sliceStatus = this.status;
        if (sliceStatus != null) {
            arrayList.add("status=" + sliceStatus);
        }
        String str = this.slice_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "slice_token=", arrayList);
        }
        PrimaryAction primaryAction = this.action;
        if (primaryAction != null) {
            arrayList.add("action=" + primaryAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExpenseSlice{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object action;
        public Object amount;
        public Object requester;
        public Object responder;
        public Serializable slice_token;
        public Object status;

        public Builder() {
            this.$r8$classId = 6;
            this.amount = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ExpenseSlice((GroupParticipant) this.requester, (GroupParticipant) this.responder, (Money) this.amount, (SliceStatus) this.status, (String) this.slice_token, (PrimaryAction) this.action, buildUnknownFields());
                case 1:
                    return new ShopCategoryBrowseResponse((List) this.requester, (List) this.responder, (Integer) this.amount, (String) this.slice_token, (String) this.status, (Button) this.action, buildUnknownFields());
                case 2:
                    return new UserDataResponse((Boolean) this.requester, (UserDataResponse.InteractionEvents) this.responder, (ReturnStatus) this.amount, (String) this.slice_token, (String) this.status, (Integer) this.action, buildUnknownFields());
                case 3:
                    return new GetPhoneVerificationAttemptResponse((PhoneVerificationAttemptState) this.requester, (String) this.slice_token, (String) this.responder, (String) this.amount, (String) this.status, (ResponseContext) this.action, buildUnknownFields());
                case 4:
                    return new WriteGpsDataRequest((Float) this.requester, (Float) this.responder, (GpsDataContext) this.amount, (LocationAttributes) this.status, (WifiContext) this.slice_token, (CellTowerContext) this.action, buildUnknownFields());
                case 5:
                    return new GetSupportSurveyResponse.Survey.RatingQuestion((String) this.slice_token, (GetSupportSurveyResponse.Survey.ReasonList) this.requester, (GetSupportSurveyResponse.Survey.ReasonList) this.responder, (GetSupportSurveyResponse.Survey.ReasonList) this.amount, (GetSupportSurveyResponse.Survey.ReasonList) this.status, (GetSupportSurveyResponse.Survey.ReasonList) this.action, buildUnknownFields());
                case 6:
                    return new SubmitSupportSurveyRequest((String) this.slice_token, (Boolean) this.requester, (Integer) this.responder, (List) this.amount, (String) this.status, (Integer) this.action, buildUnknownFields());
                case 7:
                    return new ProgressMeterElement((Image) this.requester, (Color) this.responder, (Long) this.amount, (Long) this.status, (Alignment) this.slice_token, (Size) this.action, buildUnknownFields());
                case 8:
                    return new TwoColumnRowComponent((List) this.requester, (List) this.responder, (Action) this.amount, (TwoColumnRowComponent.Spacing) this.status, (ColumnWidth) this.slice_token, (VerticalAlignment) this.action, buildUnknownFields());
                case 9:
                    return new Instrument((Instrument.InstrumentType) this.requester, (String) this.slice_token, (String) this.responder, (String) this.status, (Card) this.action, (Money) this.amount, buildUnknownFields());
                case 10:
                    return new PreAuthorizePaymentResponse((String) this.slice_token, (List) this.requester, (Discount) this.responder, (ResponseMetadata) this.amount, (PreAuthorizePaymentResponse.Result) this.status, (PreAuthorizationData) this.action, buildUnknownFields());
                case 11:
                    return new StartWebAuthnRegistrationResponse((String) this.slice_token, (String) this.requester, (String) this.responder, (ByteString) this.amount, (String) this.status, (ByteString) this.action, buildUnknownFields());
                case 12:
                    return new GetBuyerInfoResponse.BuyerInfo((BrandBanner) this.requester, (BrandBanner) this.responder, (Boolean) this.amount, (Boolean) this.status, (LocalLoyaltyAccount) this.slice_token, (LocalCart) this.action, buildUnknownFields());
                case 13:
                    return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding((String) this.slice_token, (String) this.requester, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) this.responder, (String) this.amount, (String) this.status, (String) this.action, buildUnknownFields());
                case 14:
                    return new LocalErrorResponse.Error((String) this.slice_token, (LocalErrorResponse.Error.Type) this.requester, (LocalErrorResponse.Error.Reason) this.responder, (String) this.amount, (LocalErrorResponse.Error.Level) this.status, (String) this.action, buildUnknownFields());
                case 15:
                    return new LocalMenuCategory((String) this.slice_token, (String) this.requester, (LocalImage) this.responder, (List) this.amount, (String) this.status, (LocalMenuHours) this.action, buildUnknownFields());
                case 16:
                    return new LocalTippingConfiguration.Suggestion((String) this.slice_token, (LocalMoney) this.requester, (Boolean) this.responder, (String) this.amount, (Boolean) this.status, (String) this.action, buildUnknownFields());
                case 17:
                    return new LocalUserIntent((String) this.slice_token, (String) this.requester, (Long) this.responder, (Long) this.amount, (zzja) this.status, (List) this.action, buildUnknownFields());
                case 18:
                    return new FullScreenMessage((FullScreenMessage$VisualAsset$Video) this.requester, (AppMessageAction) this.responder, (AppMessageAction) this.amount, (Color) this.status, (Color) this.slice_token, (FullScreenMessage.Placement) this.action, buildUnknownFields());
                case 19:
                    return new PopupMessage((PopupMessage.Placement) this.requester, (zzjv) this.responder, (String) this.slice_token, (String) this.amount, (AppMessageAction) this.status, (AppMessageAction) this.action, buildUnknownFields());
                case 20:
                    return new Avatar((Avatar.Initials) this.requester, (Image) this.responder, (Image) this.amount, (String) this.slice_token, (Boolean) this.status, (Color) this.action, buildUnknownFields());
                case 21:
                    return new CashAppPayOrderRenderData.RetroEligibility.EligibleData((String) this.slice_token, (Money) this.amount, (Boolean) this.requester, (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) this.responder, (Money) this.status, (Boolean) this.action, buildUnknownFields());
                case 22:
                    return new CashAppPayPayoutRenderData((String) this.slice_token, (CashAppPayMerchantRenderData) this.requester, (Money) this.amount, (Long) this.responder, (String) this.status, (CashAppPayInstrumentRenderData) this.action, buildUnknownFields());
                case 23:
                    return new CashAppPayRenderData.Dispute((String) this.slice_token, (CashAppPayRenderData.Dispute.State) this.requester, (Money) this.amount, (Money) this.responder, (Money) this.status, (Money) this.action, buildUnknownFields());
                case 24:
                    return new CreatePaymentTemplateRequest((Money) this.amount, (String) this.slice_token, (CreationChannel) this.requester, (TransactionCategory) this.responder, (String) this.status, (SigningData) this.action, buildUnknownFields());
                case 25:
                    return new BalanceTick((Long) this.requester, (BalanceEventList) this.responder, (Long) this.amount, (Long) this.status, (Long) this.action, (String) this.slice_token, buildUnknownFields());
                case 26:
                    return new GetPortfoliosHistoricalDataResponse((BalanceHistory) this.requester, (Long) this.responder, (List) this.amount, (PortfoliosHistoricalDataValue) this.status, (String) this.slice_token, (Long) this.action, buildUnknownFields());
                case 27:
                    String str = (String) this.slice_token;
                    String str2 = (String) this.requester;
                    String str3 = (String) this.responder;
                    String str4 = (String) this.status;
                    return new GenerateDirectDepositFormRequest((Money) this.amount, (Boolean) this.action, str, str2, str3, str4, buildUnknownFields());
                case 28:
                    return new CardModule.Button((CardModule.Button.Prominence) this.requester, (CardModule.CardElementAction) this.responder, (LocalizedString) this.amount, (LocalizedString) this.status, (Boolean) this.slice_token, (Icon) this.action, buildUnknownFields());
                default:
                    return new CardModule.DeliveryStatusElement((LocalizedString) this.requester, (LocalizedString) this.responder, (CardModule.Button) this.amount, (CardModule.DeliveryStatusElement.Prominence) this.status, (LocalizedString) this.slice_token, (CardModule.Button) this.action, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
