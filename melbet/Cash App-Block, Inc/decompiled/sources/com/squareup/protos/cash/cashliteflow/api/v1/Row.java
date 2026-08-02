package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.primitives.ModifierKt;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.redwood.treehouse.EventListener;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.TransactionEvent;
import com.squareup.protos.cash.cashbusinesspayments.plasma.v1beta1.EligibilityCheckFlowParameters;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrand;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagResponse;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.DisclosureAction;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.UpdateDisclosureAcceptanceRequest;
import com.squareup.protos.cash.cashface.api.GetP2pProfileDetailsResponse;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$ButtonElement$Style$Tertiary;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BitcoinAddressState;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BitcoinReceiveArtifact;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildUserOpResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.CreateLightningInvoiceResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.ExecuteUserOpResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.LightningReceiveArtifact;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OperationStatus;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsError;
import com.squareup.protos.cash.cashstorefronts.api.CashAppGenericBusinessMetadata;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Header$StandardHeader;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import com.squareup.protos.cash.cashsuggest.api.EmbeddedImageSection;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.cashsuggest.api.ItemMetadata;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchRequest;
import com.squareup.protos.cash.cashsuggest.api.OrderRow;
import com.squareup.protos.cash.clientsync.serverpush.SyncEntitiesNudge;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Row extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Row> CREATOR;
    public final RowAction action;
    public final String subtitle;
    public final String title;

    public enum RowAction implements WireEnum {
        ROW_ACTION_UNSPECIFIED(0),
        ROW_ACTION_NONE(1),
        ROW_ACTION_COPY(2);

        public static final Row$RowAction$Companion$ADAPTER$1 ADAPTER;
        public static final Channel.Companion Companion;
        public final int value;

        static {
            RowAction rowAction = ROW_ACTION_UNSPECIFIED;
            Companion = new Channel.Companion();
            ADAPTER = new Row$RowAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RowAction.class), Syntax.PROTO_2, rowAction);
        }

        RowAction(int i) {
            this.value = i;
        }

        public static final RowAction fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ROW_ACTION_UNSPECIFIED;
            }
            if (i == 1) {
                return ROW_ACTION_NONE;
            }
            if (i != 2) {
                return null;
            }
            return ROW_ACTION_COPY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Row$Companion$ADAPTER$1 row$Companion$ADAPTER$1 = new Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.Row", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/cash_in.proto");
        ADAPTER = row$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(row$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Row(String str, String str2, RowAction rowAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.action = rowAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.subtitle, row.subtitle) && this.action == row.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RowAction rowAction = this.action;
        int hashCode4 = hashCode3 + (rowAction != null ? rowAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        RowAction rowAction = this.action;
        if (rowAction != null) {
            arrayList.add("action=" + rowAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object action;
        public Object subtitle;
        public Object title;

        public Builder() {
            this.$r8$classId = 26;
            this.action = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Row((String) this.title, (String) this.subtitle, (RowAction) this.action, buildUnknownFields());
                case 1:
                    return new TransactionEvent((Instant) this.title, (Money) this.subtitle, (Boolean) this.action, buildUnknownFields());
                case 2:
                    return new EligibilityCheckFlowParameters((String) this.title, (Money) this.subtitle, (SignedSerializedMRIContext) this.action, buildUnknownFields());
                case 3:
                    return new LocalBrand((Long) this.title, (MenuHoursKt) this.subtitle, (Boolean) this.action, buildUnknownFields());
                case 4:
                    return new LookupCashtagResponse((String) this.title, (LookupCashtagResponse.MatchType) this.subtitle, (ModifierKt) this.action, buildUnknownFields());
                case 5:
                    return new UpdateDisclosureAcceptanceRequest((String) this.title, (String) this.subtitle, (DisclosureAction) this.action, buildUnknownFields());
                case 6:
                    return new GetP2pProfileDetailsResponse.HeaderData((String) this.title, (Image) this.subtitle, (Color) this.action, buildUnknownFields());
                case 7:
                    return new GenericProfileElement.ButtonElement((String) this.title, (GenericProfileElement$ButtonElement$Style$Tertiary) this.subtitle, (CartItemCounterViewModel.Mode) this.action, buildUnknownFields());
                case 8:
                    return new GenericProfileElement.LabeledContainerElement((String) this.title, (GenericProfileElement) this.subtitle, (List) this.action, buildUnknownFields());
                case 9:
                    return new GetCustomerLimitsResponse.FlatLimits.LimitUsage((Double) this.subtitle, (String) this.title, (MenuItemAvailability) this.action, buildUnknownFields());
                case 10:
                    return new GetInlineMessageResponse.LimitsHubInlineMessageButton((String) this.title, (GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction) this.action, (String) this.subtitle, buildUnknownFields());
                case 11:
                    return new CashLiteCashOutFlowParameters((String) this.title, (Money) this.subtitle, (CashOutType) this.action, buildUnknownFields());
                case 12:
                    return new InitiateBitcoinWithdrawalRequest((RequestContext) this.title, (InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination) this.subtitle, (CryptoAmount) this.action, buildUnknownFields());
                case 13:
                    return new PushProvisionGooglePayResponse((String) this.title, (ResponseContext) this.subtitle, (PushProvisionStatus) this.action, buildUnknownFields());
                case 14:
                    return new BitcoinReceiveArtifact((String) this.title, (String) this.subtitle, (BitcoinAddressState) this.action, buildUnknownFields());
                case 15:
                    return new BuildUserOpResponse((List) this.title, (Chain) this.subtitle, (Chain) this.action, buildUnknownFields());
                case 16:
                    return new CreateLightningInvoiceResponse((String) this.title, (String) this.subtitle, (LightningReceiveArtifact) this.action, buildUnknownFields());
                case 17:
                    return new ExecuteUserOpResponse((String) this.title, (String) this.subtitle, (OperationStatus) this.action, buildUnknownFields());
                case 18:
                    return new PersonalizedAdsError((PersonalizedAdsError.ErrorType) this.action, (String) this.title, (String) this.subtitle, buildUnknownFields());
                case 19:
                    return new CashAppGenericBusinessMetadata((List) this.subtitle, (ExternalAppLink) this.action, (String) this.title, buildUnknownFields());
                case 20:
                    return new AfterpayAppletEntrypoint.CreditBalance((LocalizedString) this.title, (LocalizedString) this.subtitle, (AfterpayAppletEntrypoint.CreditBalance.RingStyle) this.action, buildUnknownFields());
                case 21:
                    return new AfterpayAppletEntrypoint.CreditDetails.DetailLine((UiAvatar) this.title, (Money) this.subtitle, (LocalizedString) this.action, buildUnknownFields());
                case 22:
                    return new AppletCardSection((AppletCardSection$Header$StandardHeader) this.title, (zzuv) this.subtitle, (LocalToolbarKt) this.action, buildUnknownFields());
                case 23:
                    return new AvatarOverlayCardSection((List) this.title, (ImageLayout) this.subtitle, (List) this.action, buildUnknownFields());
                case 24:
                    return new EmbeddedImageSection((ItemMetadata) this.subtitle, (String) this.title, (EventListener) this.action, buildUnknownFields());
                case 25:
                    return new HeroBalanceSection.PaymentCalendar.Overdue((Money) this.title, (AnalyticsEvent) this.subtitle, (AnalyticsEvent) this.action, buildUnknownFields());
                case 26:
                    return new OffersSheetResponse((OfferSheet) this.title, (Long) this.subtitle, (List) this.action, buildUnknownFields());
                case 27:
                    return new OffersTabSearchRequest.RecentlyViewed((String) this.title, (Long) this.subtitle, (EngagedItemToken) this.action, buildUnknownFields());
                case 28:
                    return new OrderRow((ActivityRow) this.title, (AnalyticsEvent) this.subtitle, (AnalyticsEvent) this.action, buildUnknownFields());
                default:
                    return new SyncEntitiesNudge((String) this.title, (Long) this.subtitle, (Integer) this.action, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
