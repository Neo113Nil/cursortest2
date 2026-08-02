package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.protos.cash.cashapproxy.api.Avatar;
import com.squareup.protos.cash.cashapproxy.api.Button;
import com.squareup.protos.cash.cashapproxy.api.GetApOrderDetailsResponse;
import com.squareup.protos.cash.cashapproxy.api.InfoTile;
import com.squareup.protos.cash.cashapproxy.api.OrderPaymentMethod;
import com.squareup.protos.cash.cashapproxy.api.SingleUsePaymentSummary;
import com.squareup.protos.cash.cashapproxy.api.SupTransactions;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.PaymentActivity;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.cashface.api.Category;
import com.squareup.protos.cash.cashface.api.CommerceProfileData;
import com.squareup.protos.cash.cashface.api.Location;
import com.squareup.protos.cash.cashface.api.ProfileAction;
import com.squareup.protos.cash.cashface.api.SocialAccounts;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Operation;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OperationFailureReason;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OperationStatus;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OperationType;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolGoalState;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolState;
import com.squareup.protos.cash.pools.PoolSurcharge;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.OfflineConfig;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Timecard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Timecard> CREATOR;
    public final Long clockin_timestamp_ms;
    public final String clockin_unit_token;
    public final Long clockout_timestamp_ms;
    public final String clockout_unit_token;
    public final Long created_at_timestamp_ms;
    public final Money declared_tip;
    public final Boolean deleted;
    public final Employee employee;
    public final EmployeeJobInfo employee_job_info;
    public final String employee_token;
    public final Money hourly_wage;
    public final String merchant_token;
    public final String note;
    public final String shift_id;
    public final String token;
    public final Long updated_at_timestamp_ms;
    public final Boolean was_automatically_clocked_out;

    static {
        Timecard$Companion$ADAPTER$1 timecard$Companion$ADAPTER$1 = new Timecard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Timecard.class), "type.googleapis.com/squareup.timecards.Timecard", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = timecard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timecard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timecard(String str, String str2, String str3, String str4, Employee employee, String str5, String str6, Boolean bool, Long l, Long l2, Money money, EmployeeJobInfo employeeJobInfo, Long l3, Long l4, String str7, Money money2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.shift_id = str2;
        this.merchant_token = str3;
        this.employee_token = str4;
        this.employee = employee;
        this.clockin_unit_token = str5;
        this.clockout_unit_token = str6;
        this.deleted = bool;
        this.clockin_timestamp_ms = l;
        this.clockout_timestamp_ms = l2;
        this.hourly_wage = money;
        this.employee_job_info = employeeJobInfo;
        this.created_at_timestamp_ms = l3;
        this.updated_at_timestamp_ms = l4;
        this.note = str7;
        this.declared_tip = money2;
        this.was_automatically_clocked_out = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timecard)) {
            return false;
        }
        Timecard timecard = (Timecard) obj;
        return Intrinsics.areEqual(unknownFields(), timecard.unknownFields()) && Intrinsics.areEqual(this.token, timecard.token) && Intrinsics.areEqual(this.shift_id, timecard.shift_id) && Intrinsics.areEqual(this.merchant_token, timecard.merchant_token) && Intrinsics.areEqual(this.employee_token, timecard.employee_token) && Intrinsics.areEqual(this.employee, timecard.employee) && Intrinsics.areEqual(this.clockin_unit_token, timecard.clockin_unit_token) && Intrinsics.areEqual(this.clockout_unit_token, timecard.clockout_unit_token) && Intrinsics.areEqual(this.deleted, timecard.deleted) && Intrinsics.areEqual(this.clockin_timestamp_ms, timecard.clockin_timestamp_ms) && Intrinsics.areEqual(this.clockout_timestamp_ms, timecard.clockout_timestamp_ms) && Intrinsics.areEqual(this.hourly_wage, timecard.hourly_wage) && Intrinsics.areEqual(this.employee_job_info, timecard.employee_job_info) && Intrinsics.areEqual(this.created_at_timestamp_ms, timecard.created_at_timestamp_ms) && Intrinsics.areEqual(this.updated_at_timestamp_ms, timecard.updated_at_timestamp_ms) && Intrinsics.areEqual(this.note, timecard.note) && Intrinsics.areEqual(this.declared_tip, timecard.declared_tip) && Intrinsics.areEqual(this.was_automatically_clocked_out, timecard.was_automatically_clocked_out);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shift_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.merchant_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.employee_token;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Employee employee = this.employee;
        int hashCode6 = (hashCode5 + (employee != null ? employee.hashCode() : 0)) * 37;
        String str5 = this.clockin_unit_token;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.clockout_unit_token;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.deleted;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.clockin_timestamp_ms;
        int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.clockout_timestamp_ms;
        int hashCode11 = (hashCode10 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Money money = this.hourly_wage;
        int hashCode12 = (hashCode11 + (money != null ? money.hashCode() : 0)) * 37;
        EmployeeJobInfo employeeJobInfo = this.employee_job_info;
        int hashCode13 = (hashCode12 + (employeeJobInfo != null ? employeeJobInfo.hashCode() : 0)) * 37;
        Long l3 = this.created_at_timestamp_ms;
        int hashCode14 = (hashCode13 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.updated_at_timestamp_ms;
        int hashCode15 = (hashCode14 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        String str7 = this.note;
        int hashCode16 = (hashCode15 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Money money2 = this.declared_tip;
        int hashCode17 = (hashCode16 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Boolean bool2 = this.was_automatically_clocked_out;
        int hashCode18 = hashCode17 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode18;
        return hashCode18;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.shift_id = this.shift_id;
        builder.merchant_token = this.merchant_token;
        builder.employee_token = this.employee_token;
        builder.employee = this.employee;
        builder.clockin_unit_token = this.clockin_unit_token;
        builder.clockout_unit_token = this.clockout_unit_token;
        builder.deleted = this.deleted;
        builder.clockin_timestamp_ms = this.clockin_timestamp_ms;
        builder.clockout_timestamp_ms = this.clockout_timestamp_ms;
        builder.hourly_wage = this.hourly_wage;
        builder.employee_job_info = this.employee_job_info;
        builder.created_at_timestamp_ms = this.created_at_timestamp_ms;
        builder.updated_at_timestamp_ms = this.updated_at_timestamp_ms;
        builder.note = this.note;
        builder.declared_tip = this.declared_tip;
        builder.was_automatically_clocked_out = this.was_automatically_clocked_out;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.shift_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shift_id=", arrayList);
        }
        String str3 = this.merchant_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchant_token=", arrayList);
        }
        String str4 = this.employee_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "employee_token=", arrayList);
        }
        Employee employee = this.employee;
        if (employee != null) {
            arrayList.add("employee=" + employee);
        }
        String str5 = this.clockin_unit_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "clockin_unit_token=", arrayList);
        }
        String str6 = this.clockout_unit_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "clockout_unit_token=", arrayList);
        }
        Boolean bool = this.deleted;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted=", bool, arrayList);
        }
        Long l = this.clockin_timestamp_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("clockin_timestamp_ms=", l, arrayList);
        }
        Long l2 = this.clockout_timestamp_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("clockout_timestamp_ms=", l2, arrayList);
        }
        Money money = this.hourly_wage;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("hourly_wage=", money, arrayList);
        }
        EmployeeJobInfo employeeJobInfo = this.employee_job_info;
        if (employeeJobInfo != null) {
            arrayList.add("employee_job_info=" + employeeJobInfo);
        }
        Long l3 = this.created_at_timestamp_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_timestamp_ms=", l3, arrayList);
        }
        Long l4 = this.updated_at_timestamp_ms;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at_timestamp_ms=", l4, arrayList);
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        Money money2 = this.declared_tip;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("declared_tip=", money2, arrayList);
        }
        Boolean bool2 = this.was_automatically_clocked_out;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("was_automatically_clocked_out=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Timecard{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable clockin_timestamp_ms;
        public Object clockin_unit_token;
        public Serializable clockout_timestamp_ms;
        public Object clockout_unit_token;
        public Object created_at_timestamp_ms;
        public Serializable declared_tip;
        public Object deleted;
        public Object employee;
        public Object employee_job_info;
        public Serializable employee_token;
        public Serializable hourly_wage;
        public Serializable merchant_token;
        public Serializable note;
        public Object shift_id;
        public Serializable token;
        public Object updated_at_timestamp_ms;
        public Object was_automatically_clocked_out;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Timecard((String) this.token, (String) this.shift_id, (String) this.merchant_token, (String) this.employee_token, (Employee) this.employee, (String) this.clockin_unit_token, (String) this.clockout_unit_token, (Boolean) this.deleted, (Long) this.clockin_timestamp_ms, (Long) this.clockout_timestamp_ms, (Money) this.hourly_wage, (EmployeeJobInfo) this.employee_job_info, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (String) this.note, (Money) this.declared_tip, (Boolean) this.was_automatically_clocked_out, buildUnknownFields());
                case 1:
                    return new GetApOrderDetailsResponse((Avatar) this.token, (Text) this.shift_id, (Text) this.merchant_token, (OrderPaymentMethod) this.employee_token, (Text) this.clockin_unit_token, (List) this.clockout_unit_token, (Text) this.note, (Text) this.employee, (List) this.deleted, (List) this.was_automatically_clocked_out, (Button) this.clockin_timestamp_ms, (InfoTile) this.clockout_timestamp_ms, (SingleUsePaymentSummary) this.created_at_timestamp_ms, (Text) this.updated_at_timestamp_ms, (SupTransactions) this.hourly_wage, (Button) this.declared_tip, (List) this.employee_job_info, buildUnknownFields());
                case 2:
                    return new PaymentActivity((String) this.token, (String) this.shift_id, (String) this.merchant_token, (Instant) this.employee, (String) this.employee_token, (String) this.clockin_unit_token, (Money) this.hourly_wage, (Boolean) this.deleted, (String) this.clockout_unit_token, (PaymentActivity.State) this.was_automatically_clocked_out, (String) this.note, (String) this.clockin_timestamp_ms, (String) this.clockout_timestamp_ms, (String) this.created_at_timestamp_ms, (String) this.updated_at_timestamp_ms, (String) this.declared_tip, (List) this.employee_job_info, buildUnknownFields());
                case 3:
                    return new CommerceProfileData((com.squareup.protos.cash.cashface.api.Avatar) this.employee_token, (String) this.token, (String) this.shift_id, (String) this.merchant_token, (Location) this.clockin_unit_token, (SocialAccounts) this.clockout_unit_token, (Category) this.note, (TrustsData) this.employee, (Activity) this.deleted, (ProfileAction) this.was_automatically_clocked_out, (ProfileAction) this.clockin_timestamp_ms, (ProfileAction) this.clockout_timestamp_ms, (List) this.created_at_timestamp_ms, (List) this.updated_at_timestamp_ms, (Image) this.hourly_wage, (Banner) this.declared_tip, (Region) this.employee_job_info, buildUnknownFields());
                case 4:
                    return new Operation((String) this.token, (OperationType) this.employee, (OperationStatus) this.deleted, (Chain) this.was_automatically_clocked_out, (Chain) this.clockin_timestamp_ms, (String) this.shift_id, (String) this.merchant_token, (String) this.employee_token, (String) this.clockin_unit_token, (OperationFailureReason) this.clockout_timestamp_ms, (String) this.clockout_unit_token, (String) this.note, (String) this.created_at_timestamp_ms, (Integer) this.updated_at_timestamp_ms, (String) this.hourly_wage, (String) this.declared_tip, (String) this.employee_job_info, buildUnknownFields());
                case 5:
                    return new CashAppLocalOrderRenderData((String) this.token, (CashAppLocalOrderRenderData.OrderStatus) this.clockin_unit_token, (String) this.shift_id, (String) this.merchant_token, (String) this.employee_token, (List) this.clockout_unit_token, (CashAppLocalOrderRenderData.Actions) this.note, (Money) this.hourly_wage, (Money) this.declared_tip, (Money) this.employee, (Money) this.deleted, (Money) this.was_automatically_clocked_out, (CashAppLocalOrderRenderData.OrderPaymentData) this.clockin_timestamp_ms, (Money) this.clockout_timestamp_ms, (CashAppLocalOrderRenderData.LocalCashData) this.created_at_timestamp_ms, (CashAppLocalOrderRenderData.OrderActivityEntry) this.updated_at_timestamp_ms, (List) this.employee_job_info, buildUnknownFields());
                case 6:
                    return new MoneyPool((String) this.token, (String) this.shift_id, (Money) this.hourly_wage, (PoolOwner) this.employee_token, (List) this.clockin_unit_token, (Money) this.declared_tip, (PoolState) this.clockout_unit_token, (Long) this.clockin_timestamp_ms, (Long) this.clockout_timestamp_ms, (Long) this.created_at_timestamp_ms, (Long) this.updated_at_timestamp_ms, (PoolVisibility) this.note, (String) this.merchant_token, (PoolGoalState) this.employee, (Long) this.deleted, (Integer) this.was_automatically_clocked_out, (PoolSurcharge) this.employee_job_info, buildUnknownFields());
                case 7:
                    return new OfflineConfig((Boolean) this.deleted, (String) this.token, (List) this.shift_id, (StatusResult) this.merchant_token, (StatusResult) this.employee_token, (StatusResult) this.clockin_unit_token, (StatusResult) this.clockout_unit_token, (StatusResult) this.note, (StatusResult) this.employee, (StatusResult) this.was_automatically_clocked_out, (StatusResult) this.clockin_timestamp_ms, (ScenarioPlan) this.clockout_timestamp_ms, (ScenarioPlan) this.created_at_timestamp_ms, (StatusResult) this.updated_at_timestamp_ms, (StatusResult) this.hourly_wage, (ScenarioPlan) this.declared_tip, (ScenarioPlan) this.employee_job_info, buildUnknownFields());
                default:
                    return build();
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public SimpleTimeWorkedCalculationRequest build() {
            return new SimpleTimeWorkedCalculationRequest((DateRange) this.employee_token, (DateTimeInterval) this.clockin_unit_token, (MerchantEmployeeRequestFilter) this.clockout_unit_token, (Boolean) this.deleted, (String) this.token, (String) this.shift_id, (Boolean) this.was_automatically_clocked_out, (String) this.merchant_token, (Boolean) this.note, (FeatureContextKt) this.employee, (Boolean) this.clockin_timestamp_ms, (Boolean) this.clockout_timestamp_ms, (ShiftOptions) this.created_at_timestamp_ms, (Boolean) this.updated_at_timestamp_ms, (Boolean) this.hourly_wage, (Boolean) this.declared_tip, (Boolean) this.employee_job_info, buildUnknownFields());
        }
    }
}
