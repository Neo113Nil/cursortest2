package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.protos.cash.pools.GetMoneyPoolResponse;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.portfolios.InvestmentBalanceEvent;
import com.squareup.protos.cash.postbank.DemandDepositAccount;
import com.squareup.protos.cash.postbank.DemandDepositAccountState;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.cash.postcard.app.CreateKnotSessionRequest;
import com.squareup.protos.cash.postcard.app.CreateKnotSessionResponse;
import com.squareup.protos.cash.postcard.app.KnotEntryPoint;
import com.squareup.protos.cash.postcard.app.KnotSdkConfig;
import com.squareup.protos.cash.postcard.app.KnotSessionType;
import com.squareup.protos.cash.referly.api.incentives.client.PromotionControls;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSdkWarning;
import com.squareup.protos.cash.semaphore.api.VendedFlagNode;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.shop.rendering.api.CollectionSection;
import com.squareup.protos.cash.shop.rendering.api.CollectionSection$Content$RowSection;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.PageHeader;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.SheetStyledDetails;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowEndResult;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientRequest;
import com.squareup.protos.cash.tax.TaxDeepLinkRequest;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes.dex */
public final class CardScheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardScheme> CREATOR;
    public final CardHomeActions card_home_actions;
    public final List modules;
    public final List overflow_modules;

    static {
        CardScheme$Companion$ADAPTER$1 cardScheme$Companion$ADAPTER$1 = new CardScheme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardScheme.class), "type.googleapis.com/squareup.cash.postcard.CardScheme", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
        ADAPTER = cardScheme$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardScheme$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScheme(List list, List list2, CardHomeActions cardHomeActions, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.card_home_actions = cardHomeActions;
        this.modules = TransactorKt.immutableCopyOf("modules", list);
        this.overflow_modules = TransactorKt.immutableCopyOf("overflow_modules", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardScheme)) {
            return false;
        }
        CardScheme cardScheme = (CardScheme) obj;
        return Intrinsics.areEqual(unknownFields(), cardScheme.unknownFields()) && Intrinsics.areEqual(this.modules, cardScheme.modules) && Intrinsics.areEqual(this.overflow_modules, cardScheme.overflow_modules) && Intrinsics.areEqual(this.card_home_actions, cardScheme.card_home_actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.modules), 37, this.overflow_modules);
        CardHomeActions cardHomeActions = this.card_home_actions;
        int hashCode = m + (cardHomeActions != null ? cardHomeActions.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.modules = this.modules;
        builder.overflow_modules = this.overflow_modules;
        builder.card_home_actions = this.card_home_actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.modules;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("modules=", arrayList, list);
        }
        List list2 = this.overflow_modules;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("overflow_modules=", arrayList, list2);
        }
        CardHomeActions cardHomeActions = this.card_home_actions;
        if (cardHomeActions != null) {
            arrayList.add("card_home_actions=" + cardHomeActions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardScheme{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object card_home_actions;
        public Object modules;
        public Object overflow_modules;

        public Builder() {
            this.$r8$classId = 0;
            EmptyList emptyList = EmptyList.INSTANCE;
            this.modules = emptyList;
            this.overflow_modules = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CardScheme((List) this.modules, (List) this.overflow_modules, (CardHomeActions) this.card_home_actions, buildUnknownFields());
                case 1:
                    return new DigitalWalletSelectionOption.InstrumentLink((String) this.modules, (CashInstrumentType) this.overflow_modules, (String) this.card_home_actions, buildUnknownFields());
                case 2:
                    return new AddCustomersToPoolResponse.AddCustomerResult((String) this.modules, (AddCustomersToPoolResponse.Status) this.overflow_modules, (AddCustomersToPoolResponse.FailureReason) this.card_home_actions, buildUnknownFields());
                case 3:
                    return new GetMoneyPoolResponse((GetMoneyPoolResponse.FailureReason) this.modules, (MoneyPool) this.overflow_modules, (Boolean) this.card_home_actions, buildUnknownFields());
                case 4:
                    return new RemoveCustomersFromPoolResponse.RemoveCustomerResult((String) this.modules, (RemoveCustomersFromPoolResponse.Status) this.overflow_modules, (RemoveCustomersFromPoolResponse.FailureReason) this.card_home_actions, buildUnknownFields());
                case 5:
                    return new InvestmentBalanceEvent((String) this.modules, (Long) this.overflow_modules, (InvestmentBalanceEvent.Type) this.card_home_actions, buildUnknownFields());
                case 6:
                    return new DemandDepositAccount((DemandDepositAccountState) this.modules, (String) this.overflow_modules, (Boolean) this.card_home_actions, buildUnknownFields());
                case 7:
                    return new CardHomeAction((ErrorEvent.Dd.Companion) this.modules, (Icon) this.overflow_modules, (Boolean) this.card_home_actions, buildUnknownFields());
                case 8:
                    return new CardModule.HeroIssuedCardModule((CardModule.IssuedCardElement) this.modules, (CardRenderingInfo) this.overflow_modules, (CardModule.CardElementAction) this.card_home_actions, buildUnknownFields());
                case 9:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent((LocalizedString) this.overflow_modules, (ListUnordered) this.card_home_actions, (List) this.modules, buildUnknownFields());
                case 10:
                    return new CardModule.StatusElement.Icon((Icon) this.modules, (CardModule.StatusElement.Icon.IconBackground) this.overflow_modules, (Image) this.card_home_actions, buildUnknownFields());
                case 11:
                    return new CardRenderingInfo((String) this.modules, (CardTheme) this.overflow_modules, (CardRenderingInfo.ExpirationState) this.card_home_actions, buildUnknownFields());
                case 12:
                    return new CreateKnotSessionRequest((KnotEntryPoint) this.modules, (Integer) this.overflow_modules, (KnotSessionType) this.card_home_actions, buildUnknownFields());
                case 13:
                    return new CreateKnotSessionResponse((String) this.modules, (KnotSdkConfig) this.overflow_modules, (String) this.card_home_actions, buildUnknownFields());
                case 14:
                    return new PromotionControls((String) this.modules, (Boolean) this.overflow_modules, (Boolean) this.card_home_actions, buildUnknownFields());
                case 15:
                    return new ThreeDsSdkWarning((String) this.modules, (String) this.overflow_modules, (ThreeDsSdkWarning.Severity) this.card_home_actions, buildUnknownFields());
                case 16:
                    return new VendedFlagNode((String) this.overflow_modules, (VendedFlagNode.VendedValue) this.card_home_actions, (List) this.modules, buildUnknownFields());
                case 17:
                    return new AnalyticsEvent((String) this.overflow_modules, (Map) this.card_home_actions, (List) this.modules, buildUnknownFields());
                case 18:
                    return new CategoryTileSection.CategoryTile.IconStyle((Icon) this.modules, (Image) this.overflow_modules, (Color) this.card_home_actions, buildUnknownFields());
                case 19:
                    return new CollectionSection((AnalyticsEvent) this.modules, (String) this.overflow_modules, (CollectionSection$Content$RowSection) this.card_home_actions, buildUnknownFields());
                case 20:
                    return new FormattedDetail.LoanInfoCheck((String) this.modules, (LocalizedString) this.overflow_modules, (StyledText) this.card_home_actions, buildUnknownFields());
                case 21:
                    return new PageHeader((UiAvatar) this.modules, (LocalizedString) this.overflow_modules, (LocalizedString) this.card_home_actions, buildUnknownFields());
                case 22:
                    return new RowSection.FilterRow.FilterTapAction((String) this.overflow_modules, (List) this.modules, (AnalyticsEvent) this.card_home_actions, buildUnknownFields());
                case 23:
                    return new SheetStyledDetails((StyledText) this.modules, (StyledText) this.overflow_modules, (Color) this.card_home_actions, buildUnknownFields());
                case 24:
                    return new SupCreateCardFlowEndResult((IssuedCard) this.modules, (Money) this.overflow_modules, (String) this.card_home_actions, buildUnknownFields());
                case 25:
                    return new ChatMessage.ActionBody((String) this.modules, (String) this.overflow_modules, (zzli) this.card_home_actions, buildUnknownFields());
                case 26:
                    return new OutgoingMessage((String) this.modules, (zzln) this.overflow_modules, (String) this.card_home_actions, buildUnknownFields());
                case 27:
                    return new SupportPhoneStatusResponse.ServiceAvailability((Boolean) this.modules, (Long) this.overflow_modules, (String) this.card_home_actions, buildUnknownFields());
                case 28:
                    return new SyncTopicEntitiesClientRequest((Integer) this.modules, (ByteString) this.overflow_modules, (Trigger) this.card_home_actions, buildUnknownFields());
                default:
                    return new TaxDeepLinkRequest((RequestContext) this.modules, (String) this.overflow_modules, (TaxEnvironment) this.card_home_actions, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }

    public CardScheme(EmptyList emptyList) {
        this(emptyList, EmptyList.INSTANCE, null, ByteString.EMPTY);
    }
}
