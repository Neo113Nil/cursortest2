package com.squareup.protos.employeejobs;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.CardBankDetails;
import com.squareup.cash.lynx.api.v1_0.model.CardLinkRiskEvaluationResult;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLinkMetadata;
import com.squareup.cash.lynx.api.v1_0.model.UnlinkedBy;
import com.squareup.cash.lynx.api.v1_0.model.UnlinkedReason;
import com.squareup.cash.lynx.api.v1_0.model.VerifyResponse;
import com.squareup.cash.lynx.api.v1_0.model.link.LinkedReason;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletActivityHistoryResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletActivityResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletPurchaseHistoryResponse;
import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.disputron.core.ClaimResolutionStatus;
import com.squareup.protos.cash.disputron.core.ListClaimDSL3Data;
import com.squareup.protos.cash.disputron.core.TransactionType;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.marketdata.model.News;
import com.squareup.protos.cash.marketdata.model.NewsType;
import com.squareup.protos.cash.pay.CashAppPayDisputeRenderData;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.cash.taply.model.v1.PaymentTokenDevice;
import com.squareup.protos.cash.taply.model.v1.PaymentTokenDeviceStateReason;
import com.squareup.protos.cash.taply.model.v1.TokenProviderType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.AchRenderData;
import com.squareup.protos.franklin.common.BitcoinOnchainRenderData;
import com.squareup.protos.franklin.common.NetworkCongestionLevel;
import com.squareup.protos.franklin.common.OnchainTransactionType;
import com.squareup.protos.franklin.common.PaymentHistoryConfig;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.lending.sync_values.LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.protos.timecards.LaborCostTotal;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.scheduling.ColorScheme;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftCover;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.BusinessIds;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Job extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Job> CREATOR;
    public final Long created_at_timestamp_ms;
    public final ColorScheme default_color_scheme;
    public final Wage default_wage;
    public final Long deleted_at_timestamp_ms;
    public final String merchant_token;
    public final Long team_member_count;
    public final Boolean tip_eligible;
    public final String title;
    public final String token;
    public final Long updated_at_timestamp_ms;
    public final Long version;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object created_at_timestamp_ms;
        public Object default_color_scheme;
        public Object default_wage;
        public Object deleted_at_timestamp_ms;
        public Serializable merchant_token;
        public Object team_member_count;
        public Object tip_eligible;
        public Object title;
        public Serializable token;
        public Object updated_at_timestamp_ms;
        public Object version;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Job((String) this.token, (String) this.merchant_token, (String) this.title, (Wage) this.default_wage, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (Long) this.deleted_at_timestamp_ms, (Boolean) this.tip_eligible, (ColorScheme) this.default_color_scheme, (Long) this.team_member_count, (Long) this.version, buildUnknownFields());
                case 1:
                    return new InstrumentLinkMetadata((LinkResult) this.default_wage, (CardBankDetails) this.created_at_timestamp_ms, (String) this.token, (CardLinkRiskEvaluationResult) this.updated_at_timestamp_ms, (VerifyResponse) this.deleted_at_timestamp_ms, (UnlinkedBy) this.team_member_count, (UnlinkedReason) this.version, (String) this.merchant_token, (List) this.tip_eligible, (String) this.title, (LinkedReason) this.default_color_scheme, buildUnknownFields());
                case 2:
                    return new ComposePlatform.Modifier((ComposePlatform.Modifier.Size) this.token, (ComposePlatform.Modifier.Padding) this.merchant_token, (ComposePlatform.Modifier.ContentColor) this.title, (ComposePlatform.Modifier.Background) this.default_wage, (ComposePlatform.Modifier.TextStyle) this.created_at_timestamp_ms, (ComposePlatform.Modifier.Alpha) this.updated_at_timestamp_ms, (ComposePlatform.Modifier.Clip) this.deleted_at_timestamp_ms, (ComposePlatform.Modifier.Overlay) this.team_member_count, (ComposePlatform.Modifier.Border) this.version, (ComposePlatform.Modifier.WrapContentSize) this.tip_eligible, (ComposePlatform.Modifier.Tint) this.default_color_scheme, buildUnknownFields());
                case 3:
                    return new StoredValueBalance((String) this.token, (Money) this.default_wage, (Long) this.created_at_timestamp_ms, (String) this.merchant_token, (Boolean) this.tip_eligible, (String) this.title, (StoredValueBalance.Type) this.updated_at_timestamp_ms, (String) this.deleted_at_timestamp_ms, (String) this.team_member_count, (Boolean) this.version, (String) this.default_color_scheme, buildUnknownFields());
                case 4:
                    return new GetProfileDetailsResponse.CustomerData((String) this.token, (Image) this.default_wage, (Region) this.created_at_timestamp_ms, (String) this.merchant_token, (Boolean) this.tip_eligible, (Boolean) this.updated_at_timestamp_ms, (Integer) this.deleted_at_timestamp_ms, (BlockState) this.team_member_count, (Boolean) this.version, (Boolean) this.default_color_scheme, (String) this.title, buildUnknownFields());
                case 5:
                    return new GetProfileDetailsResponse.MerchantData((String) this.token, (String) this.merchant_token, (Image) this.default_wage, (Color) this.created_at_timestamp_ms, (Boolean) this.tip_eligible, (Boolean) this.updated_at_timestamp_ms, (String) this.title, (AnalyticsEvent) this.deleted_at_timestamp_ms, (Image) this.team_member_count, (GetProfileDetailsResponse.MerchantData.MerchantProfileImage) this.version, (Action) this.default_color_scheme, buildUnknownFields());
                case 6:
                    return new AfterpayAppletHome((LocalizedString) this.token, (TappableIcon) this.merchant_token, (List) this.title, (Footer) this.default_wage, (com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent) this.created_at_timestamp_ms, (RetroOrderSelectionResponse) this.updated_at_timestamp_ms, (AfterpayAppletPurchaseHistoryResponse) this.deleted_at_timestamp_ms, (AfterpayAppletHome.OnDisplayMessage) this.team_member_count, (Experiments) this.version, (AfterpayAppletActivityResponse) this.tip_eligible, (AfterpayAppletActivityHistoryResponse) this.default_color_scheme, buildUnknownFields());
                case 7:
                    return new ClaimResolutionStatus((String) this.token, (String) this.merchant_token, (Money) this.default_wage, (String) this.title, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (TransactionType) this.team_member_count, (String) this.version, (String) this.tip_eligible, (Long) this.deleted_at_timestamp_ms, (ListClaimDSL3Data) this.default_color_scheme, buildUnknownFields());
                case 8:
                    return new LocalCashActivity.Row((LocalImage) this.default_wage, (String) this.token, (String) this.merchant_token, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (LocalText) this.deleted_at_timestamp_ms, (LocalColor) this.team_member_count, (String) this.title, (String) this.version, (String) this.tip_eligible, (LocalCashActivity.Row.Source) this.default_color_scheme, buildUnknownFields());
                case 9:
                    return new LocalMenu((List) this.title, (Map) this.default_wage, (Map) this.updated_at_timestamp_ms, (List) this.deleted_at_timestamp_ms, (String) this.token, (Map) this.team_member_count, (List) this.version, (Long) this.created_at_timestamp_ms, (String) this.merchant_token, (Map) this.tip_eligible, (Map) this.default_color_scheme, buildUnknownFields());
                case 10:
                    return new News((Long) this.created_at_timestamp_ms, (String) this.token, (String) this.merchant_token, (Image) this.default_wage, (News.Action) this.version, (Long) this.updated_at_timestamp_ms, (String) this.title, (String) this.tip_eligible, (NewsType) this.default_color_scheme, (Long) this.deleted_at_timestamp_ms, (Long) this.team_member_count, buildUnknownFields());
                case 11:
                    return new CashAppPayDisputeRenderData((String) this.token, (CashAppPayDisputeRenderData.DisputeState) this.merchant_token, (Money) this.title, (Money) this.default_wage, (Money) this.team_member_count, (Money) this.version, (List) this.tip_eligible, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (Long) this.deleted_at_timestamp_ms, (CashAppPayDisputeRenderData.DisputeReason) this.default_color_scheme, buildUnknownFields());
                case 12:
                    return new PaymentTokenDevice((String) this.token, (Boolean) this.tip_eligible, (String) this.merchant_token, (TokenProviderType) this.default_wage, (PaymentTokenDevice.State) this.deleted_at_timestamp_ms, (PaymentTokenDeviceStateReason) this.team_member_count, (String) this.title, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (String) this.version, (Boolean) this.default_color_scheme, buildUnknownFields());
                case 13:
                    return new AchRenderData((AchRenderData.Type) this.default_wage, (Money) this.updated_at_timestamp_ms, (String) this.token, (String) this.merchant_token, (String) this.title, (String) this.deleted_at_timestamp_ms, (Image) this.team_member_count, (String) this.version, (String) this.default_color_scheme, (Boolean) this.tip_eligible, (Long) this.created_at_timestamp_ms, buildUnknownFields());
                case 14:
                    return new BitcoinOnchainRenderData((String) this.token, (Money) this.title, (Money) this.default_wage, (Money) this.deleted_at_timestamp_ms, (Money) this.team_member_count, (Long) this.created_at_timestamp_ms, (List) this.version, (NetworkCongestionLevel) this.tip_eligible, (String) this.merchant_token, (OnchainTransactionType) this.default_color_scheme, (Long) this.updated_at_timestamp_ms, buildUnknownFields());
                case 15:
                    return new PaymentHistoryConfig((String) this.token, (String) this.merchant_token, (List) this.title, (List) this.default_wage, (List) this.created_at_timestamp_ms, (List) this.updated_at_timestamp_ms, (List) this.deleted_at_timestamp_ms, (List) this.team_member_count, (List) this.version, (List) this.tip_eligible, (List) this.default_color_scheme, buildUnknownFields());
                case 16:
                    return new RoundUpsElement((RoundUpsElement.Icon) this.default_wage, (String) this.token, (LocalizableString) this.created_at_timestamp_ms, (String) this.merchant_token, (LocalizableString) this.updated_at_timestamp_ms, (Color) this.deleted_at_timestamp_ms, (Color) this.team_member_count, (String) this.title, (LocalizableString) this.version, (RoundUpsElement.Font) this.tip_eligible, (String) this.default_color_scheme, buildUnknownFields());
                case 17:
                    return new LendingInfo.AccessData((String) this.token, (String) this.merchant_token, (String) this.title, (List) this.default_wage, (String) this.created_at_timestamp_ms, (LendingInfo.AccessData.Button) this.updated_at_timestamp_ms, (String) this.deleted_at_timestamp_ms, (LocalizableString) this.team_member_count, (LocalizableString) this.version, (LocalizableString) this.tip_eligible, (LocalizableString) this.default_color_scheme, buildUnknownFields());
                case 18:
                    return new LendingInfo.FirstTimeBorrowData.HomeScreen((String) this.token, (String) this.merchant_token, (Image) this.default_wage, (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) this.created_at_timestamp_ms, (String) this.title, (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) this.updated_at_timestamp_ms, (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) this.deleted_at_timestamp_ms, (LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute) this.team_member_count, (LocalizableString) this.version, (LocalizableString) this.tip_eligible, (LocalizableString) this.default_color_scheme, buildUnknownFields());
                case 19:
                    return new OvertimeReportByTimecardForEmployeeResponse.ByTimecard((DateTimeInterval) this.token, (CalculationTotal) this.merchant_token, (Timecard) this.title, (LaborCostTotal) this.default_wage, (List) this.created_at_timestamp_ms, (List) this.updated_at_timestamp_ms, (Shift) this.deleted_at_timestamp_ms, (List) this.team_member_count, (Money) this.version, (Money) this.tip_eligible, (Money) this.default_color_scheme, buildUnknownFields());
                case 20:
                    return new ShiftCover((String) this.token, (String) this.merchant_token, (String) this.title, (ShiftCover.Status) this.default_wage, (List) this.created_at_timestamp_ms, (List) this.updated_at_timestamp_ms, (String) this.deleted_at_timestamp_ms, (String) this.team_member_count, (String) this.version, (String) this.tip_eligible, (String) this.default_color_scheme, buildUnknownFields());
                case 21:
                    return new ShiftSchedule.Version((String) this.token, (String) this.merchant_token, (String) this.title, (String) this.default_wage, (CalendarEvent) this.created_at_timestamp_ms, (String) this.updated_at_timestamp_ms, (Boolean) this.tip_eligible, (Boolean) this.deleted_at_timestamp_ms, (String) this.team_member_count, (String) this.version, (ShiftCover) this.default_color_scheme, buildUnknownFields());
                default:
                    return new BusinessIds((String) this.token, (String) this.merchant_token, (String) this.title, (String) this.default_wage, (String) this.created_at_timestamp_ms, (String) this.updated_at_timestamp_ms, (String) this.deleted_at_timestamp_ms, (String) this.team_member_count, (String) this.version, (String) this.tip_eligible, (String) this.default_color_scheme, buildUnknownFields());
            }
        }
    }

    static {
        KClasses$$Lambda$1 kClasses$$Lambda$1 = ColorScheme.Companion;
        Job$Companion$ADAPTER$1 job$Companion$ADAPTER$1 = new Job$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Job.class), "type.googleapis.com/squareup.employeejobs.Job", Syntax.PROTO_2, null, "squareup/employeejobs/data.proto");
        ADAPTER = job$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(job$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Job(String str, String str2, String str3, Wage wage, Long l, Long l2, Long l3, Boolean bool, ColorScheme colorScheme, Long l4, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.merchant_token = str2;
        this.title = str3;
        this.default_wage = wage;
        this.created_at_timestamp_ms = l;
        this.updated_at_timestamp_ms = l2;
        this.deleted_at_timestamp_ms = l3;
        this.tip_eligible = bool;
        this.default_color_scheme = colorScheme;
        this.team_member_count = l4;
        this.version = l5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Job)) {
            return false;
        }
        Job job = (Job) obj;
        return Intrinsics.areEqual(unknownFields(), job.unknownFields()) && Intrinsics.areEqual(this.token, job.token) && Intrinsics.areEqual(this.merchant_token, job.merchant_token) && Intrinsics.areEqual(this.title, job.title) && Intrinsics.areEqual(this.default_wage, job.default_wage) && Intrinsics.areEqual(this.created_at_timestamp_ms, job.created_at_timestamp_ms) && Intrinsics.areEqual(this.updated_at_timestamp_ms, job.updated_at_timestamp_ms) && Intrinsics.areEqual(this.deleted_at_timestamp_ms, job.deleted_at_timestamp_ms) && Intrinsics.areEqual(this.tip_eligible, job.tip_eligible) && this.default_color_scheme == job.default_color_scheme && Intrinsics.areEqual(this.team_member_count, job.team_member_count) && Intrinsics.areEqual(this.version, job.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchant_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Wage wage = this.default_wage;
        int hashCode5 = (hashCode4 + (wage != null ? wage.hashCode() : 0)) * 37;
        Long l = this.created_at_timestamp_ms;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at_timestamp_ms;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.deleted_at_timestamp_ms;
        int hashCode8 = (hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Boolean bool = this.tip_eligible;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ColorScheme colorScheme = this.default_color_scheme;
        int hashCode10 = (hashCode9 + (colorScheme != null ? colorScheme.hashCode() : 0)) * 37;
        Long l4 = this.team_member_count;
        int hashCode11 = (hashCode10 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.version;
        int hashCode12 = hashCode11 + (l5 != null ? Long.hashCode(l5.longValue()) : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.merchant_token = this.merchant_token;
        builder.title = this.title;
        builder.default_wage = this.default_wage;
        builder.created_at_timestamp_ms = this.created_at_timestamp_ms;
        builder.updated_at_timestamp_ms = this.updated_at_timestamp_ms;
        builder.deleted_at_timestamp_ms = this.deleted_at_timestamp_ms;
        builder.tip_eligible = this.tip_eligible;
        builder.default_color_scheme = this.default_color_scheme;
        builder.team_member_count = this.team_member_count;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.merchant_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_token=", arrayList);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        Wage wage = this.default_wage;
        if (wage != null) {
            arrayList.add("default_wage=" + wage);
        }
        Long l = this.created_at_timestamp_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_timestamp_ms=", l, arrayList);
        }
        Long l2 = this.updated_at_timestamp_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at_timestamp_ms=", l2, arrayList);
        }
        Long l3 = this.deleted_at_timestamp_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted_at_timestamp_ms=", l3, arrayList);
        }
        Boolean bool = this.tip_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tip_eligible=", bool, arrayList);
        }
        ColorScheme colorScheme = this.default_color_scheme;
        if (colorScheme != null) {
            arrayList.add("default_color_scheme=" + colorScheme);
        }
        Long l4 = this.team_member_count;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("team_member_count=", l4, arrayList);
        }
        Long l5 = this.version;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Job{", "}", 0, null, null, 56);
    }
}
