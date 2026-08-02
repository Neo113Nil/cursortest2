package squareup.cash.savings;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.common.CardScheme;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.common.RoundUpsData;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.protos.franklin.ui.InitialBlockerData;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessage;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessageButton;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiIssuedCard;
import com.squareup.protos.franklin.ui.UiP2pSettings;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewResponse;
import com.squareup.protos.timecards.StartTimecardRequest;
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
import squareup.cash.lynx.api.app.v1_0.GetEnrichedInstrumentLinksAppRequest;
import squareup.cash.overdraft.OverdraftStatus;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.KeyValueMap;

/* loaded from: classes10.dex */
public final class GoalFolder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GoalFolder> CREATOR;
    public final String completion_token;
    public final Money goal_amount;
    public final String goal_flow_parameters;
    public final Integer goal_progress_percentage;
    public final String icon_unicode;
    public final String label;
    public final Boolean met_goal;
    public final String token;

    static {
        GoalFolder$Companion$ADAPTER$1 goalFolder$Companion$ADAPTER$1 = new GoalFolder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GoalFolder.class), "type.googleapis.com/squareup.cash.savings.GoalFolder", Syntax.PROTO_2, null, "squareup/cash/savings/GoalFolder.proto");
        ADAPTER = goalFolder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(goalFolder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalFolder(String str, Boolean bool, Money money, String str2, String str3, String str4, Integer num, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.met_goal = bool;
        this.goal_amount = money;
        this.icon_unicode = str2;
        this.completion_token = str3;
        this.label = str4;
        this.goal_progress_percentage = num;
        this.goal_flow_parameters = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoalFolder)) {
            return false;
        }
        GoalFolder goalFolder = (GoalFolder) obj;
        return Intrinsics.areEqual(unknownFields(), goalFolder.unknownFields()) && Intrinsics.areEqual(this.token, goalFolder.token) && Intrinsics.areEqual(this.met_goal, goalFolder.met_goal) && Intrinsics.areEqual(this.goal_amount, goalFolder.goal_amount) && Intrinsics.areEqual(this.icon_unicode, goalFolder.icon_unicode) && Intrinsics.areEqual(this.completion_token, goalFolder.completion_token) && Intrinsics.areEqual(this.label, goalFolder.label) && Intrinsics.areEqual(this.goal_progress_percentage, goalFolder.goal_progress_percentage) && Intrinsics.areEqual(this.goal_flow_parameters, goalFolder.goal_flow_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.met_goal;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.goal_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.icon_unicode;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.completion_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.label;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num = this.goal_progress_percentage;
        int hashCode8 = (hashCode7 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str5 = this.goal_flow_parameters;
        int hashCode9 = hashCode8 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.met_goal = this.met_goal;
        builder.goal_amount = this.goal_amount;
        builder.icon_unicode = this.icon_unicode;
        builder.completion_token = this.completion_token;
        builder.label = this.label;
        builder.goal_progress_percentage = this.goal_progress_percentage;
        builder.goal_flow_parameters = this.goal_flow_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Boolean bool = this.met_goal;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("met_goal=", bool, arrayList);
        }
        Money money = this.goal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_amount=", money, arrayList);
        }
        String str2 = this.icon_unicode;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_unicode=", arrayList);
        }
        String str3 = this.completion_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "completion_token=", arrayList);
        }
        String str4 = this.label;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "label=", arrayList);
        }
        Integer num = this.goal_progress_percentage;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("goal_progress_percentage=", num, arrayList);
        }
        String str5 = this.goal_flow_parameters;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "goal_flow_parameters=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoalFolder{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object completion_token;
        public Object goal_amount;
        public Object goal_flow_parameters;
        public Serializable goal_progress_percentage;
        public Object icon_unicode;
        public Object label;
        public Object met_goal;
        public Serializable token;

        public Builder() {
            this.$r8$classId = 11;
            EmptyList emptyList = EmptyList.INSTANCE;
            this.icon_unicode = emptyList;
            this.completion_token = emptyList;
            this.label = emptyList;
            this.goal_flow_parameters = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GoalFolder((String) this.token, (Boolean) this.met_goal, (Money) this.goal_amount, (String) this.icon_unicode, (String) this.completion_token, (String) this.label, (Integer) this.goal_progress_percentage, (String) this.goal_flow_parameters, buildUnknownFields());
                case 1:
                    return new SyncInvestmentFilterGroup((String) this.token, (String) this.icon_unicode, (List) this.label, (List) this.goal_flow_parameters, (List) this.goal_amount, (Boolean) this.met_goal, (String) this.completion_token, (SyncInvestmentFilterGroup.JoinType) this.goal_progress_percentage, buildUnknownFields());
                case 2:
                    return new CreditLine.CreditLineLimitData((String) this.token, (String) this.icon_unicode, (String) this.completion_token, (List) this.goal_flow_parameters, (String) this.label, (LocalizableString) this.met_goal, (LocalizableString) this.goal_amount, (LocalizableString) this.goal_progress_percentage, buildUnknownFields());
                case 3:
                    return new FullCashtag((String) this.token, (String) this.icon_unicode, (CurrencyCode) this.met_goal, (String) this.completion_token, (String) this.label, (String) this.goal_flow_parameters, (String) this.goal_amount, (String) this.goal_progress_percentage, buildUnknownFields());
                case 4:
                    return new LimitsPageletInlineMessage((LimitsPageletInlineMessage.Icon) this.completion_token, (String) this.token, (LocalizableString) this.label, (String) this.icon_unicode, (LocalizableString) this.goal_flow_parameters, (LimitsPageletInlineMessageButton) this.met_goal, (LimitsPageletInlineMessageButton) this.goal_amount, (Long) this.goal_progress_percentage, buildUnknownFields());
                case 5:
                    return new UiIssuedCard((IssuedCard) this.token, (CashDrawerData) this.icon_unicode, (UiIssuedCard.Mode) this.completion_token, (CardScheme) this.label, (RoundUpsData) this.goal_flow_parameters, (InitialBlockerData) this.met_goal, (CardOrderData) this.goal_amount, (CustomerData) this.goal_progress_percentage, buildUnknownFields());
                case 6:
                    return new UiP2pSettings((Integer) this.goal_progress_percentage, (IncomingRequestPolicy) this.token, (NearbyVisibility) this.icon_unicode, (RatePlan) this.completion_token, (Boolean) this.met_goal, (DepositPreference) this.label, (DepositPreferenceData) this.goal_flow_parameters, (Boolean) this.goal_amount, buildUnknownFields());
                case 7:
                    return new PrepurchaseAfterpayAppletData((UiAvatar) this.icon_unicode, (LocalizedString) this.completion_token, (LocalizedString) this.label, (LocalizedString) this.goal_flow_parameters, (List) this.met_goal, (List) this.goal_amount, (ByteString) this.goal_progress_percentage, (String) this.token, buildUnknownFields());
                case 8:
                    return new LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent((String) this.token, (String) this.icon_unicode, (String) this.completion_token, (zzjm) this.label, (LocalizableString) this.goal_flow_parameters, (LocalizableString) this.met_goal, (LocalizableString) this.goal_amount, (Image) this.goal_progress_percentage, buildUnknownFields());
                case 9:
                    return new GetEmployeePayrollOverviewResponse((List) this.label, (Money) this.goal_amount, (Money) this.goal_flow_parameters, (YearMonthDay) this.met_goal, (YearMonthDay) this.goal_progress_percentage, (String) this.token, (String) this.icon_unicode, (String) this.completion_token, buildUnknownFields());
                case 10:
                    return new StartTimecardRequest((String) this.token, (String) this.icon_unicode, (String) this.completion_token, (Boolean) this.met_goal, (String) this.label, (String) this.goal_flow_parameters, (String) this.goal_amount, (String) this.goal_progress_percentage, buildUnknownFields());
                case 11:
                    return new GetEnrichedInstrumentLinksAppRequest((List) this.icon_unicode, (List) this.completion_token, (List) this.label, (Boolean) this.met_goal, (String) this.token, (Integer) this.goal_progress_percentage, (List) this.goal_flow_parameters, (Boolean) this.goal_amount, buildUnknownFields());
                case 12:
                    return new OverdraftStatus.PermanentlyDisabled((LocalizedString) this.token, (Money) this.goal_amount, (LocalizedString) this.icon_unicode, (OverdraftStatus.Button) this.completion_token, (LocalizedString) this.label, (Boolean) this.met_goal, (LocalizedString) this.goal_flow_parameters, (OverdraftStatus.PermanentlyDisabled.Reason) this.goal_progress_percentage, buildUnknownFields());
                default:
                    return build();
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public KeyValueMap.Entry build() {
            return new KeyValueMap.Entry((String) this.token, (String) this.icon_unicode, (Long) this.completion_token, (Double) this.label, (Boolean) this.met_goal, (ByteString) this.goal_flow_parameters, (KeyValueMap) this.goal_amount, (Collection) this.goal_progress_percentage, buildUnknownFields());
        }
    }
}
