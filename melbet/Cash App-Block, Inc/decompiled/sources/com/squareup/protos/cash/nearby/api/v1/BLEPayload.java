package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zziu;
import com.google.android.gms.internal.mlkit_vision_common.zzjy;
import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import com.squareup.protos.cash.local.client.v1.LocalRemoteOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.PaginatedSheet;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.local.client.v1.TiledHeroImage;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.protos.cash.marketdata.GetInvestmentEntityNewsResponse;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.cash.messagingplatformcommon.app.AnimationFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.HeroImage;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Text;
import com.squareup.protos.cash.messagingplatformcommon.app.TextStyle;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.Variable;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageOrderedListItem;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageText;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest$Query$LatLongQuery;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.cash.pay.ManagedCustomerRequestFlowData;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.protos.cash.paychecks.api.v1.EarnerModeOperation;
import com.squareup.protos.cash.paychecks.api.v1.UpdateEarnerModeRequest;
import com.squareup.protos.cash.paymenttemplate.v1.GetPaymentTemplateResponse;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentOptions;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplate;
import com.squareup.protos.cash.piggybank.api.v2.InterestRate;
import com.squareup.protos.cash.piggybank.api.v2.InterestTiersApyRates;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.piggybank.appapi.FamiliesSavingsScreensResponse;
import com.squareup.protos.cash.piggybank.appapi.SavingsConfig;
import com.squareup.protos.cash.plasma.common.CallContext;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes7.dex */
public final class BLEPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BLEPayload> CREATOR;
    public final ByteString advertisement_data;
    public final Integer frequency;
    public final Integer transmission_level;

    static {
        BLEPayload$Companion$ADAPTER$1 bLEPayload$Companion$ADAPTER$1 = new BLEPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BLEPayload.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.BLEPayload", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/connection_data.proto");
        ADAPTER = bLEPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bLEPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLEPayload(ByteString byteString, Integer num, Integer num2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.advertisement_data = byteString;
        this.transmission_level = num;
        this.frequency = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLEPayload)) {
            return false;
        }
        BLEPayload bLEPayload = (BLEPayload) obj;
        return Intrinsics.areEqual(unknownFields(), bLEPayload.unknownFields()) && Intrinsics.areEqual(this.advertisement_data, bLEPayload.advertisement_data) && Intrinsics.areEqual(this.transmission_level, bLEPayload.transmission_level) && Intrinsics.areEqual(this.frequency, bLEPayload.frequency);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.advertisement_data;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Integer num = this.transmission_level;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.frequency;
        int hashCode4 = hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.advertisement_data = this.advertisement_data;
        builder.transmission_level = this.transmission_level;
        builder.frequency = this.frequency;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.advertisement_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("advertisement_data=", byteString, arrayList);
        }
        Integer num = this.transmission_level;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("transmission_level=", num, arrayList);
        }
        Integer num2 = this.frequency;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("frequency=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BLEPayload{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object advertisement_data;
        public Object frequency;
        public Object transmission_level;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 21:
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    this.frequency = emptyMap;
                    break;
                default:
                    this.advertisement_data = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BLEPayload((ByteString) this.advertisement_data, (Integer) this.transmission_level, (Integer) this.frequency, buildUnknownFields());
                case 1:
                    return new LocalMenuItemVariation.ReservationVariationData((Long) this.advertisement_data, (List) this.transmission_level, (zziu) this.frequency, buildUnknownFields());
                case 2:
                    return new LocalRemoteOrderingIntent((String) this.advertisement_data, (LocalFulfillment) this.transmission_level, (LocalShoppingCart) this.frequency, buildUnknownFields());
                case 3:
                    return new MapboxConfiguration.UsageOptions((MapboxConfiguration.UsageOptions.Context) this.advertisement_data, (String) this.transmission_level, (String) this.frequency, buildUnknownFields());
                case 4:
                    return new POSBrandOnboarding.LegalConsent((String) this.advertisement_data, (String) this.transmission_level, (ShortlinkAction) this.frequency, buildUnknownFields());
                case 5:
                    return new PaginatedSheet((List) this.advertisement_data, (EducationalSheetButton) this.transmission_level, (EducationalSheetButton) this.frequency, buildUnknownFields());
                case 6:
                    return new SchedulingTime((String) this.advertisement_data, (String) this.transmission_level, (LocalFulfillment) this.frequency, buildUnknownFields());
                case 7:
                    return new TiledHeroImage((LocalImage) this.advertisement_data, (LocalMiniCard) this.transmission_level, (String) this.frequency, buildUnknownFields());
                case 8:
                    return new LoyaltyPromotionAvailability((String) this.advertisement_data, (List) this.transmission_level, (LoyaltyPromotionAvailability.Alignment) this.frequency, buildUnknownFields());
                case 9:
                    return new GetInvestmentEntityNewsResponse((List) this.advertisement_data, (Integer) this.transmission_level, (Long) this.frequency, buildUnknownFields());
                case 10:
                    return new InvestmentFinancials((List) this.advertisement_data, (List) this.transmission_level, (Section.Row.MoreInfo) this.frequency, buildUnknownFields());
                case 11:
                    return new AnimationFixed((Image) this.advertisement_data, (Integer) this.transmission_level, (Integer) this.frequency, buildUnknownFields());
                case 12:
                    return new HeroImage((com.squareup.protos.cash.messagingplatformcommon.app.Image) this.advertisement_data, (Double) this.transmission_level, (Color) this.frequency, buildUnknownFields());
                case 13:
                    return new InAppNotificationMessage((Integer) this.transmission_level, (ActionEvent.Usr.Companion) this.advertisement_data, (AppMessageAction) this.frequency, buildUnknownFields());
                case 14:
                    return new Text((String) this.advertisement_data, (Color) this.transmission_level, (TextStyle) this.frequency, buildUnknownFields());
                case 15:
                    return new TooltipMessage((Placement) this.advertisement_data, (AppMessageAction) this.transmission_level, (TooltipMessage.ArrowPosition) this.frequency, buildUnknownFields());
                case 16:
                    return new Variable((String) this.advertisement_data, (Variable.Type) this.transmission_level, (zzjy) this.frequency, buildUnknownFields());
                case 17:
                    return new DetailsPageOrderedListItem((Integer) this.transmission_level, (DetailsPageText) this.advertisement_data, (DetailsPageText) this.frequency, buildUnknownFields());
                case 18:
                    return new SelectInstrumentRequest((RequestContext) this.transmission_level, (ByteString) this.advertisement_data, (zzka) this.frequency, buildUnknownFields());
                case 19:
                    return new GetRetailerLocationsRequest((List) this.advertisement_data, (Double) this.transmission_level, (GetRetailerLocationsRequest$Query$LatLongQuery) this.frequency, buildUnknownFields());
                case 20:
                    return new CashAppPayLoanSummaryRenderData.Adjustment((Money) this.advertisement_data, (CashAppPayLoanSummaryRenderData.Adjustment.Type) this.transmission_level, (CashAppPayLoanSummaryRenderData.Adjustment.Reason) this.frequency, buildUnknownFields());
                case 21:
                    return build();
                case 22:
                    return new SetPaycheckAllocationAmountInputs((SetPaycheckAllocationAmountInputs.SubmissionInteraction) this.advertisement_data, (AllocationDistribution) this.transmission_level, (AllocationDestination) this.frequency, buildUnknownFields());
                case 23:
                    return new UpdateEarnerModeRequest((EarnerModeOperation) this.advertisement_data, (Duration) this.transmission_level, (RequestContext) this.frequency, buildUnknownFields());
                case 24:
                    return new GetPaymentTemplateResponse((PaymentTemplate) this.advertisement_data, (GetPaymentTemplateResponse.ErrorCode) this.transmission_level, (PaymentOptions) this.frequency, buildUnknownFields());
                case 25:
                    return new InterestRate((Double) this.advertisement_data, (InterestYieldStatus) this.transmission_level, (InterestTiersApyRates) this.frequency, buildUnknownFields());
                case 26:
                    return new FamiliesSavingsScreensResponse((ResponseContext) this.advertisement_data, (SyncEntity) this.transmission_level, (SyncEntity) this.frequency, buildUnknownFields());
                case 27:
                    return new SavingsConfig((Integer) this.transmission_level, (SavingsConfig.SavingsCopy) this.advertisement_data, (Boolean) this.frequency, buildUnknownFields());
                case 28:
                    return new CallContext((String) this.advertisement_data, (ClientInfo) this.transmission_level, (RequestContext) this.frequency, buildUnknownFields());
                default:
                    return new DigitalWalletSelectionOption((DigitalWalletSelectionOption.Type) this.advertisement_data, (zzkh) this.transmission_level, (DigitalWalletSelectionOption.InstrumentLink) this.frequency, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public ManagedCustomerRequestFlowData build() {
            return new ManagedCustomerRequestFlowData((String) this.advertisement_data, (String) this.transmission_level, (Map) this.frequency, buildUnknownFields());
        }
    }
}
