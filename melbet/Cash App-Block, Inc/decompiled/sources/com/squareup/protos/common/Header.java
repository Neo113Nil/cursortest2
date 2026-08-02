package com.squareup.protos.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageImageAsset;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.protos.cash.moneymap.app.Button;
import com.squareup.protos.cash.orderly.plasma.OmsViewApPaymentPlanRequirementParameters;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceRequest;
import com.squareup.protos.cash.postbank.api.DdaAccountNumbers;
import com.squareup.protos.cash.postbank.api.GenerateDirectDepositFormResponse;
import com.squareup.protos.cash.postbank.api.UpdateDirectDepositFormResponse;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.registrar.api.GetStatementDescriptorResponse;
import com.squareup.protos.cash.shop.rendering.api.OfferMetadata;
import com.squareup.protos.cash.staff.plasma.v1.SquareStaffOnboardingFlowParameter;
import com.squareup.protos.cash.supportal.app.CancelOutboundPhoneResponse;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.protos.cash.taply.plasma.flows.v1.UnlockPaymentTokenDeviceFlowParameters;
import com.squareup.protos.cash.usher.api.GetPreSignInDataRequest;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.cash.whimsicard.syncentity.CardSkinAsset;
import com.squareup.protos.client.timecards.UpdateTimecardNotesRequest;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.app.CheckDepositConfig;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.app.RegisterAppMessageActionRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.AcceptedLanguageDisclosure;
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
public final class Header extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Header> CREATOR;
    public final String name;
    public final String value;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String name;
        public String value;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Header(this.name, this.value, buildUnknownFields());
                case 1:
                    return new DetailsPageImageAsset(this.name, this.value, buildUnknownFields());
                case 2:
                    return new SelectInstrumentRequest.GooglePayPayload(this.name, this.value, buildUnknownFields());
                case 3:
                    return new Button(this.name, this.value, buildUnknownFields());
                case 4:
                    return new OmsViewApPaymentPlanRequirementParameters(this.name, this.value, buildUnknownFields());
                case 5:
                    return new DigitalWalletSelectionOption.GooglePayPayload(this.name, this.value, buildUnknownFields());
                case 6:
                    return new WebViewCallbackInputs.QueryParam(this.name, this.value, buildUnknownFields());
                case 7:
                    return new GetPortfoliosPerformanceRequest(this.name, this.value, buildUnknownFields());
                case 8:
                    return new DdaAccountNumbers(this.name, this.value, buildUnknownFields());
                case 9:
                    return new GenerateDirectDepositFormResponse(this.name, this.value, buildUnknownFields());
                case 10:
                    return new UpdateDirectDepositFormResponse(this.name, this.value, buildUnknownFields());
                case 11:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card(this.name, this.value, buildUnknownFields());
                case 12:
                    return new GetStatementDescriptorResponse(this.name, this.value, buildUnknownFields());
                case 13:
                    return new OfferMetadata(this.name, this.value, buildUnknownFields());
                case 14:
                    return new SquareStaffOnboardingFlowParameter(this.name, this.value, buildUnknownFields());
                case 15:
                    return new CancelOutboundPhoneResponse(this.name, this.value, buildUnknownFields());
                case 16:
                    return new OutgoingMessage.FileBody(this.name, this.value, buildUnknownFields());
                case 17:
                    return new UnlockPaymentTokenDeviceFlowParameters(this.name, this.value, buildUnknownFields());
                case 18:
                    return new GetPreSignInDataRequest.ClientDeepLinkContext(this.name, this.value, buildUnknownFields());
                case 19:
                    return new GetPreSignInDataResponse.ContextualOnboardingIntroData(this.name, this.value, buildUnknownFields());
                case 20:
                    return new CardSkinAsset(this.name, this.value, buildUnknownFields());
                case 21:
                    return new UpdateTimecardNotesRequest(this.name, this.value, buildUnknownFields());
                case 22:
                    return new CalendarEvent.Recurrence(this.name, this.value, buildUnknownFields());
                case 23:
                    return new Phone(this.name, this.value, buildUnknownFields());
                case 24:
                    return new CheckDepositConfig.Image(this.name, this.value, buildUnknownFields());
                case 25:
                    return new GetBoostConfigResponse.BtcBoostUpsell.Button(this.name, this.value, buildUnknownFields());
                case 26:
                    return new RegisterAppMessageActionRequest(this.name, this.value, buildUnknownFields());
                case 27:
                    return new SubmitBlockerResponse.BlockerResponseContext.Dialog(this.name, this.value, buildUnknownFields());
                case 28:
                    return new Institution.BankbookMenuItem(this.name, this.value, buildUnknownFields());
                default:
                    return new AcceptedLanguageDisclosure(this.name, this.value, buildUnknownFields());
            }
        }
    }

    static {
        Header$Companion$ADAPTER$1 header$Companion$ADAPTER$1 = new Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.common.Header", Syntax.PROTO_2, null, "squareup/common/protocols.proto");
        ADAPTER = header$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(header$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.value, header.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.value;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.name = this.name;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        if (this.value != null) {
            arrayList.add("value=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
    }
}
