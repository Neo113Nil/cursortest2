package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubRequest;
import com.squareup.cash.devicegrip.service.GetDevicesRequest;
import com.squareup.cash.devicegrip.service.UpdateDeviceDetailsResponse;
import com.squareup.cash.mosaic.personalization.api.v1.MarkViewedResponse;
import com.squareup.cash.mosaic.personalization.api.v2.SavePersonalizationResponse;
import com.squareup.cash.mosaic.resources.api.v2.GetAllResourcesRequest;
import com.squareup.cash.mosaic.resources.api.v2.GetFeaturedMusicRequest;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountsRequest;
import com.squareup.protos.cash.aegis.api.GetSafetyEducationHubRequest;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.cash.blockstable.api.v1.GetDepositAddressRequest;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AddBugReportAttachmentResponse;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.GetDisplayNameStatusClientRequest;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.UpdateDisclosureAcceptanceResponse;
import com.squareup.protos.cash.cashface.api.ActivityClassic;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Divider extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Divider> CREATOR;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Divider(buildUnknownFields());
                case 1:
                    return new GetBankingBenefitsHubRequest(buildUnknownFields());
                case 2:
                    return new GetDevicesRequest(buildUnknownFields());
                case 3:
                    return new UpdateDeviceDetailsResponse(buildUnknownFields());
                case 4:
                    return new MarkViewedResponse(buildUnknownFields());
                case 5:
                    return new com.squareup.cash.mosaic.personalization.api.v2.MarkViewedResponse(buildUnknownFields());
                case 6:
                    return new SavePersonalizationResponse(buildUnknownFields());
                case 7:
                    return new GetAllResourcesRequest(buildUnknownFields());
                case 8:
                    return new GetFeaturedMusicRequest(buildUnknownFields());
                case 9:
                    return new ToggleOverdraftRequest.Disable(buildUnknownFields());
                case 10:
                    return new ToggleOverdraftRequest.Enable(buildUnknownFields());
                case 11:
                    return new CashCreditScoreHomeData.Graphic.Card(buildUnknownFields());
                case 12:
                    return new PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss(buildUnknownFields());
                case 13:
                    return new PrepurchaseCashCardAppletData.UnknownContent(buildUnknownFields());
                case 14:
                    return new GetFamilyAccountSponsorRequest(buildUnknownFields());
                case 15:
                    return new GetFamilyAccountsRequest(buildUnknownFields());
                case 16:
                    return new GetSafetyEducationHubRequest(buildUnknownFields());
                case 17:
                    return new SetBalanceBasedAddCashPreferenceRequest.Disabled(buildUnknownFields());
                case 18:
                    return new SavingsTransferContext.GeneralFolder(buildUnknownFields());
                case 19:
                    return new SavingsTransferContext.Home(buildUnknownFields());
                case 20:
                    return new GetDepositAddressRequest(buildUnknownFields());
                case 21:
                    return new CardSpendingInsightsConfig.InsightsSection(buildUnknownFields());
                case 22:
                    return new CardSpendingInsightsConfig.OverviewSection(buildUnknownFields());
                case 23:
                    return new CardSpendingInsightsHome.ActivitySection(buildUnknownFields());
                case 24:
                    return new AddBugReportAttachmentResponse(buildUnknownFields());
                case 25:
                    return new GetDisplayNameStatusClientRequest(buildUnknownFields());
                case 26:
                    return new UpdateDisclosureAcceptanceResponse(buildUnknownFields());
                case 27:
                    return new ActivityClassic(buildUnknownFields());
                case 28:
                    return new ContextWrapper.Origin.ActivityTab(buildUnknownFields());
                default:
                    return new ContextWrapper.Origin.BillsAndSubscriptions(buildUnknownFields());
            }
        }
    }

    static {
        Divider$Companion$ADAPTER$1 divider$Companion$ADAPTER$1 = new Divider$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Divider.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.Divider", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = divider$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(divider$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Divider(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Divider) && Intrinsics.areEqual(unknownFields(), ((Divider) obj).unknownFields());
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
        return "Divider{}";
    }
}
