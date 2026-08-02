package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.primitives.MarketingMessageDataKt;
import app.cash.local.primitives.ScopedModifierTokensKt;
import app.cash.local.viewmodels.LocalTextsKt;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.redwood.layout.view.FlexboxHelpersKt;
import app.cash.redwood.treehouse.TreehouseAppContentKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.cashapproxy.api.OrderDetailRow;
import com.squareup.protos.cash.cashapproxy.api.OrderHubRow;
import com.squareup.protos.cash.cashapproxy.api.StackableElement;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.FeatureContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.MoneybotContext;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetPaymentReceiptDetailsResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ReceiptData;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult;
import com.squareup.protos.cash.cashface.api.ActivityStats;
import com.squareup.protos.cash.cashface.api.UtilityAction;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Address;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.CreateSwapQuoteResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.GetAddressResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.GetOperationResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.GetSwapEstimateResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Operation;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapEstimate;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapQuote;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateRequest;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleResponse;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.cashsuggest.api.MoneyBar;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.consentsys.service.CopyParameters;
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

/* loaded from: classes7.dex */
public final class Activity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Activity> CREATOR;
    public final ScopedModifierTokensKt activity;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object activity;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Activity((ScopedModifierTokensKt) this.activity, buildUnknownFields());
                case 1:
                    return new CardSpendingInsightsHome.OverviewSection((VerticalStackedBarGraph) this.activity, buildUnknownFields());
                case 2:
                    return new OrderDetailRow((LocalMoneyKt) this.activity, buildUnknownFields());
                case 3:
                    return new OrderHubRow((LocationMenuKt) this.activity, buildUnknownFields());
                case 4:
                    return new StackableElement((MarketingMessageDataKt) this.activity, buildUnknownFields());
                case 5:
                    return new FeatureContext((MoneybotContext) this.activity, buildUnknownFields());
                case 6:
                    return new GetPaymentReceiptDetailsResponse((ReceiptData) this.activity, buildUnknownFields());
                case 7:
                    return new ValidateTapToPayPolicyResponse((ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult) this.activity, buildUnknownFields());
                case 8:
                    return new ActivityStats((ActivityStats.Stats) this.activity, buildUnknownFields());
                case 9:
                    return new GetCommerceProfileResponse((CommerceProfileData) this.activity, buildUnknownFields());
                case 10:
                    return new UtilityAction((UtilityAction.Action) this.activity, buildUnknownFields());
                case 11:
                    return new GenericProfileElement((LocalTextsKt) this.activity, buildUnknownFields());
                case 12:
                    return new GenericProfileElement.ButtonElement.TertiaryStyle((GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle) this.activity, buildUnknownFields());
                case 13:
                    return new GenericProfileElement.ValueUnitElement((LocationStatus) this.activity, buildUnknownFields());
                case 14:
                    return new GetInlineMessageResponse((TransactorKt) this.activity, buildUnknownFields());
                case 15:
                    return new CreateSwapQuoteResponse((SwapQuote) this.activity, buildUnknownFields());
                case 16:
                    return new GetAddressResponse((Address) this.activity, buildUnknownFields());
                case 17:
                    return new GetOperationResponse((Operation) this.activity, buildUnknownFields());
                case 18:
                    return new GetSwapEstimateResponse((SwapEstimate) this.activity, buildUnknownFields());
                case 19:
                    return new GetPersonalizedAdsStateRequest((CopyParameters) this.activity, buildUnknownFields());
                case 20:
                    return new GetPersonalizedAdsStateResponse((EducationalButtonAction) this.activity, buildUnknownFields());
                case 21:
                    return new PersonalizedAdsToggleResponse((zzuj) this.activity, buildUnknownFields());
                case 22:
                    return new RewardAmount((zzuk) this.activity, buildUnknownFields());
                case 23:
                    return new AppletCardSection.CashCardRenderingConfiguration((AppletCardSection.CashCardRenderingConfiguration.DisplayStyle) this.activity, buildUnknownFields());
                case 24:
                    return new AvatarOverlayCardSection.OverlayCardItem((FlexboxHelpersKt) this.activity, buildUnknownFields());
                case 25:
                    return new Experiments((Experiments.BNPLAssistantExperiment) this.activity, buildUnknownFields());
                case 26:
                    return new HeroBalanceSection((TreehouseAppContentKt) this.activity, buildUnknownFields());
                case 27:
                    return new HeroBalanceSection.NoBalance((HeroBalanceSection.SectionCTA) this.activity, buildUnknownFields());
                case 28:
                    return new InAppBrowserMetadata.IABMetadataCAP((RewardAmount) this.activity, buildUnknownFields());
                default:
                    return new MoneyBar((CreditLineType) this.activity, buildUnknownFields());
            }
        }
    }

    static {
        Activity$Companion$ADAPTER$1 activity$Companion$ADAPTER$1 = new Activity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Activity.class), "type.googleapis.com/squareup.cash.cashface.api.Activity", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = activity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Activity(ScopedModifierTokensKt scopedModifierTokensKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity = scopedModifierTokensKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) obj;
        return Intrinsics.areEqual(unknownFields(), activity.unknownFields()) && Intrinsics.areEqual(this.activity, activity.activity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScopedModifierTokensKt scopedModifierTokensKt = this.activity;
        int hashCode2 = hashCode + (scopedModifierTokensKt != null ? scopedModifierTokensKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.activity = this.activity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.activity != null) {
            arrayList.add("activity=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Activity{", "}", 0, null, null, 56);
    }
}
