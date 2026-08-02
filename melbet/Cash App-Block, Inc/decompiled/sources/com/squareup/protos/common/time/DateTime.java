package com.squareup.protos.common.time;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.core.model.ProcessingMode;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.piggybank.api.v2.SavingsCustomer;
import com.squareup.protos.cash.piggybank.api.v2.SavingsCustomerStatus;
import com.squareup.protos.cash.piggybank.api.v2.YieldEligibilityStatus;
import com.squareup.protos.cash.plasma.callcontext.AuthorizationContext;
import com.squareup.protos.cash.plasma.callcontext.ForwardedCallContext;
import com.squareup.protos.cash.plasma.common.ExistingLinkSelectionOption;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceResponse;
import com.squareup.protos.cash.portfolios.syncvalues.BalanceTick;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.cash.registrar.api.StatementTypeDetails;
import com.squareup.protos.cash.requirements.SetLinkCardRequirementData;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ReloadSchedule;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.IconTextSection;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet;
import com.squareup.protos.cash.shop.rendering.api.PageHeaderSection;
import com.squareup.protos.cash.shop.rendering.api.PillSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TintedIcon;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientResponse;
import com.squareup.protos.cash.trustedcontact.SyncTrustedContact;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.protos.cash.weaver.api.DismissRecommendationCandidateResponse;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceSummary;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.app.CheckDepositRequest;
import com.squareup.protos.franklin.app.FindCustomersResponse;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.app.GetIssuedCardResponse;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes8.dex */
public final class DateTime extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DateTime> CREATOR;
    public final Long instant_usec;
    public final Long ordinal;
    public final String posix_tz;
    public final Integer timezone_offset_min;
    public final List tz_name;

    static {
        DateTime$Companion$ADAPTER$1 dateTime$Companion$ADAPTER$1 = new DateTime$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DateTime.class), "type.googleapis.com/squareup.common.time.DateTime", Syntax.PROTO_2, null, "squareup/common/time.proto");
        ADAPTER = dateTime$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dateTime$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTime(Long l, Integer num, String str, List list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.instant_usec = l;
        this.timezone_offset_min = num;
        this.posix_tz = str;
        this.ordinal = l2;
        this.tz_name = TransactorKt.immutableCopyOf("tz_name", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        return Intrinsics.areEqual(unknownFields(), dateTime.unknownFields()) && Intrinsics.areEqual(this.instant_usec, dateTime.instant_usec) && Intrinsics.areEqual(this.timezone_offset_min, dateTime.timezone_offset_min) && Intrinsics.areEqual(this.posix_tz, dateTime.posix_tz) && Intrinsics.areEqual(this.tz_name, dateTime.tz_name) && Intrinsics.areEqual(this.ordinal, dateTime.ordinal);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.instant_usec;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Integer num = this.timezone_offset_min;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.posix_tz;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str != null ? str.hashCode() : 0)) * 37, 37, this.tz_name);
        Long l2 = this.ordinal;
        int hashCode4 = m + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.instant_usec = this.instant_usec;
        builder.timezone_offset_min = this.timezone_offset_min;
        builder.posix_tz = this.posix_tz;
        builder.tz_name = this.tz_name;
        builder.ordinal = this.ordinal;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.instant_usec;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("instant_usec=", l, arrayList);
        }
        Integer num = this.timezone_offset_min;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("timezone_offset_min=", num, arrayList);
        }
        String str = this.posix_tz;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "posix_tz=", arrayList);
        }
        List list = this.tz_name;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tz_name=", arrayList, list);
        }
        Long l2 = this.ordinal;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ordinal=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DateTime{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object instant_usec;
        public Serializable ordinal;
        public Serializable posix_tz;
        public Object timezone_offset_min;
        public Object tz_name;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 5:
                    this.tz_name = EmptyList.INSTANCE;
                    break;
                default:
                    this.tz_name = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DateTime((Long) this.instant_usec, (Integer) this.timezone_offset_min, (String) this.posix_tz, (List) this.tz_name, (Long) this.ordinal, buildUnknownFields());
                case 1:
                    return new SavingsCustomer((String) this.posix_tz, (Instant) this.instant_usec, (Boolean) this.ordinal, (SavingsCustomerStatus) this.timezone_offset_min, (YieldEligibilityStatus) this.tz_name, buildUnknownFields());
                case 2:
                    return new ForwardedCallContext((ClientInfo) this.instant_usec, (BrowserInteraction) this.ordinal, (String) this.posix_tz, (ScenarioInitiatorType) this.timezone_offset_min, (AuthorizationContext) this.tz_name, buildUnknownFields());
                case 3:
                    return new ExistingLinkSelectionOption((CashInstrumentType) this.instant_usec, (String) this.posix_tz, (List) this.tz_name, (ProcessingMode) this.ordinal, (Boolean) this.timezone_offset_min, buildUnknownFields());
                case 4:
                    return new BalanceHistory((Long) this.instant_usec, (Long) this.ordinal, (CurrencyCode) this.timezone_offset_min, (List) this.tz_name, (Long) this.posix_tz, buildUnknownFields());
                case 5:
                    return new GetPortfoliosPerformanceResponse((List) this.tz_name, (String) this.posix_tz, (PortfoliosPerformanceValue) this.ordinal, (String) this.timezone_offset_min, (Long) this.instant_usec, buildUnknownFields());
                case 6:
                    return new com.squareup.protos.cash.portfolios.syncvalues.BalanceHistory((Long) this.instant_usec, (Long) this.ordinal, (String) this.posix_tz, (List) this.tz_name, (Long) this.timezone_offset_min, buildUnknownFields());
                case 7:
                    return new BalanceTick((Long) this.instant_usec, (Long) this.ordinal, (Long) this.timezone_offset_min, (Long) this.tz_name, (String) this.posix_tz, buildUnknownFields());
                case 8:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX((CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) this.instant_usec, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) this.ordinal, (List) this.tz_name, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) this.timezone_offset_min, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) this.posix_tz, buildUnknownFields());
                case 9:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent((LocalizedString) this.instant_usec, (ListUnordered) this.ordinal, (List) this.tz_name, (LocalizedString) this.timezone_offset_min, (CardModule.Button) this.posix_tz, buildUnknownFields());
                case 10:
                    return new StatementTypeDetails((String) this.posix_tz, (StatementType) this.instant_usec, (Boolean) this.ordinal, (String) this.timezone_offset_min, (Boolean) this.tz_name, buildUnknownFields());
                case 11:
                    return new SetLinkCardRequirementData((List) this.tz_name, (Boolean) this.instant_usec, (Boolean) this.ordinal, (SetLinkCardRequirementData.EntryPoint) this.timezone_offset_min, (String) this.posix_tz, buildUnknownFields());
                case 12:
                    return new ReloadSchedule((ReloadSchedule.Frequency) this.instant_usec, (List) this.tz_name, (String) this.posix_tz, (Integer) this.timezone_offset_min, (Integer) this.ordinal, buildUnknownFields());
                case 13:
                    return new IconTextSection((Icon) this.instant_usec, (TintedIcon) this.ordinal, (LocalizedString) this.timezone_offset_min, (LocalizedString) this.posix_tz, (TapAction) this.tz_name, buildUnknownFields());
                case 14:
                    return new ImageTextSection((Image) this.instant_usec, (LocalizedString) this.ordinal, (LocalizedString) this.timezone_offset_min, (Button) this.posix_tz, (AnalyticsEvent) this.tz_name, buildUnknownFields());
                case 15:
                    return new OfferSheet((zzkw) this.instant_usec, (AnalyticsEvent) this.ordinal, (AnalyticsEvent) this.timezone_offset_min, (LocalizedString) this.posix_tz, (StyledText) this.tz_name, buildUnknownFields());
                case 16:
                    return new PageHeaderSection((ErrorEvent.Usr.Companion) this.instant_usec, (LocalizedString) this.ordinal, (LocalizedString) this.timezone_offset_min, (TapAction) this.posix_tz, (Button) this.tz_name, buildUnknownFields());
                case 17:
                    return new PillSection.Pill((AnalyticsEvent) this.instant_usec, (TapAction) this.ordinal, (LocalizedString) this.timezone_offset_min, (Color) this.tz_name, (String) this.posix_tz, buildUnknownFields());
                case 18:
                    return new SearchSection((AnalyticsEvent) this.instant_usec, (SectionHeader) this.ordinal, (String) this.posix_tz, (zzld) this.timezone_offset_min, (Boolean) this.tz_name, buildUnknownFields());
                case 19:
                    return new SyncTopicEntitiesClientResponse((Integer) this.timezone_offset_min, (List) this.tz_name, (ByteString) this.instant_usec, (Boolean) this.ordinal, (SyncEntitiesResponse.RefreshAllEntitiesType) this.posix_tz, buildUnknownFields());
                case 20:
                    return new SyncTrustedContact((GlobalAddress) this.tz_name, (String) this.posix_tz, (String) this.instant_usec, (String) this.ordinal, (String) this.timezone_offset_min, buildUnknownFields());
                case 21:
                    return new HorizontalBarGraph.BarItem((LocalizedString) this.ordinal, (Long) this.instant_usec, (LocalizedString) this.timezone_offset_min, (UiAvatar) this.tz_name, (String) this.posix_tz, buildUnknownFields());
                case 22:
                    return new DismissRecommendationCandidateResponse((String) this.posix_tz, (RecommendationType) this.ordinal, (String) this.timezone_offset_min, (String) this.tz_name, (Long) this.instant_usec, buildUnknownFields());
                case 23:
                    return new Timeline((Timeline.TimelineIcon) this.instant_usec, (LocalizedString) this.ordinal, (LocalizedString) this.timezone_offset_min, (List) this.tz_name, (Action) this.posix_tz, buildUnknownFields());
                case 24:
                    return new PerformanceSummary((Money) this.instant_usec, (Money) this.ordinal, (Money) this.timezone_offset_min, (Money) this.posix_tz, (Instant) this.tz_name, buildUnknownFields());
                case 25:
                    return new CalendarEvent((String) this.posix_tz, (String) this.instant_usec, (String) this.ordinal, (String) this.timezone_offset_min, (CalendarEvent.Recurrence) this.tz_name, buildUnknownFields());
                case 26:
                    return new CheckDepositRequest((ByteString) this.instant_usec, (ByteString) this.ordinal, (Money) this.timezone_offset_min, (RequestContext) this.tz_name, (String) this.posix_tz, buildUnknownFields());
                case 27:
                    FindCustomersResponse.Status status = (FindCustomersResponse.Status) this.instant_usec;
                    String str = (String) this.posix_tz;
                    List list = (List) this.tz_name;
                    UiCustomer uiCustomer = (UiCustomer) this.ordinal;
                    FindCustomersResponse.Sort sort = (FindCustomersResponse.Sort) this.timezone_offset_min;
                    if (sort != null) {
                        return new FindCustomersResponse(status, str, list, uiCustomer, sort, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(sort, "sort");
                    throw null;
                case 28:
                    return new GetBoostConfigResponse.BtcBoostUpsell((String) this.posix_tz, (String) this.instant_usec, (String) this.ordinal, (GetBoostConfigResponse.BtcBoostUpsell.Button) this.timezone_offset_min, (Image) this.tz_name, buildUnknownFields());
                default:
                    return new GetIssuedCardResponse((GetIssuedCardResponse.Status) this.instant_usec, (IssuedCard) this.ordinal, (String) this.posix_tz, (ScenarioPlan) this.timezone_offset_min, (Boolean) this.tz_name, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
