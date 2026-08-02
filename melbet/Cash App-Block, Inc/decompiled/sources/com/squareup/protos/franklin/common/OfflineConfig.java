package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfflineConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfflineConfig> CREATOR;
    public final StatusResult attempted_add_cash_status_result;
    public final StatusResult attempted_bill_status_result;
    public final StatusResult attempted_cash_out_status_result;
    public final StatusResult attempted_payment_status_result;
    public final Boolean enabled;
    public final StatusResult error_add_cash_status_result;
    public final StatusResult error_cash_out_status_result;
    public final ScenarioPlan error_transfer_scenario_plan;
    public final String external_status_url;
    public final StatusResult offline_add_cash_status_result;
    public final ScenarioPlan offline_bill_scenario_plan;
    public final StatusResult offline_bill_status_result;
    public final StatusResult offline_cash_out_status_result;
    public final ScenarioPlan offline_payment_scenario_plan;
    public final StatusResult offline_payment_status_result;
    public final ScenarioPlan offline_transfer_scenario_plan;
    public final List retry_intervals;

    static {
        OfflineConfig$Companion$ADAPTER$1 offlineConfig$Companion$ADAPTER$1 = new OfflineConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfflineConfig.class), "type.googleapis.com/squareup.franklin.common.OfflineConfig", Syntax.PROTO_2, null, "squareup/franklin/common/offline_config.proto");
        ADAPTER = offlineConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offlineConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineConfig(Boolean bool, String str, List list, StatusResult statusResult, StatusResult statusResult2, StatusResult statusResult3, StatusResult statusResult4, StatusResult statusResult5, StatusResult statusResult6, StatusResult statusResult7, StatusResult statusResult8, ScenarioPlan scenarioPlan, ScenarioPlan scenarioPlan2, StatusResult statusResult9, StatusResult statusResult10, ScenarioPlan scenarioPlan3, ScenarioPlan scenarioPlan4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.enabled = bool;
        this.external_status_url = str;
        this.attempted_payment_status_result = statusResult;
        this.offline_payment_status_result = statusResult2;
        this.attempted_bill_status_result = statusResult3;
        this.offline_bill_status_result = statusResult4;
        this.attempted_cash_out_status_result = statusResult5;
        this.offline_cash_out_status_result = statusResult6;
        this.attempted_add_cash_status_result = statusResult7;
        this.offline_add_cash_status_result = statusResult8;
        this.offline_payment_scenario_plan = scenarioPlan;
        this.offline_bill_scenario_plan = scenarioPlan2;
        this.error_cash_out_status_result = statusResult9;
        this.error_add_cash_status_result = statusResult10;
        this.offline_transfer_scenario_plan = scenarioPlan3;
        this.error_transfer_scenario_plan = scenarioPlan4;
        this.retry_intervals = TransactorKt.immutableCopyOf("retry_intervals", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineConfig)) {
            return false;
        }
        OfflineConfig offlineConfig = (OfflineConfig) obj;
        return Intrinsics.areEqual(unknownFields(), offlineConfig.unknownFields()) && Intrinsics.areEqual(this.enabled, offlineConfig.enabled) && Intrinsics.areEqual(this.external_status_url, offlineConfig.external_status_url) && Intrinsics.areEqual(this.retry_intervals, offlineConfig.retry_intervals) && Intrinsics.areEqual(this.attempted_payment_status_result, offlineConfig.attempted_payment_status_result) && Intrinsics.areEqual(this.offline_payment_status_result, offlineConfig.offline_payment_status_result) && Intrinsics.areEqual(this.attempted_bill_status_result, offlineConfig.attempted_bill_status_result) && Intrinsics.areEqual(this.offline_bill_status_result, offlineConfig.offline_bill_status_result) && Intrinsics.areEqual(this.attempted_cash_out_status_result, offlineConfig.attempted_cash_out_status_result) && Intrinsics.areEqual(this.offline_cash_out_status_result, offlineConfig.offline_cash_out_status_result) && Intrinsics.areEqual(this.attempted_add_cash_status_result, offlineConfig.attempted_add_cash_status_result) && Intrinsics.areEqual(this.offline_add_cash_status_result, offlineConfig.offline_add_cash_status_result) && Intrinsics.areEqual(this.offline_payment_scenario_plan, offlineConfig.offline_payment_scenario_plan) && Intrinsics.areEqual(this.offline_bill_scenario_plan, offlineConfig.offline_bill_scenario_plan) && Intrinsics.areEqual(this.error_cash_out_status_result, offlineConfig.error_cash_out_status_result) && Intrinsics.areEqual(this.error_add_cash_status_result, offlineConfig.error_add_cash_status_result) && Intrinsics.areEqual(this.offline_transfer_scenario_plan, offlineConfig.offline_transfer_scenario_plan) && Intrinsics.areEqual(this.error_transfer_scenario_plan, offlineConfig.error_transfer_scenario_plan);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.external_status_url;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.retry_intervals);
        StatusResult statusResult = this.attempted_payment_status_result;
        int hashCode3 = (m + (statusResult != null ? statusResult.hashCode() : 0)) * 37;
        StatusResult statusResult2 = this.offline_payment_status_result;
        int hashCode4 = (hashCode3 + (statusResult2 != null ? statusResult2.hashCode() : 0)) * 37;
        StatusResult statusResult3 = this.attempted_bill_status_result;
        int hashCode5 = (hashCode4 + (statusResult3 != null ? statusResult3.hashCode() : 0)) * 37;
        StatusResult statusResult4 = this.offline_bill_status_result;
        int hashCode6 = (hashCode5 + (statusResult4 != null ? statusResult4.hashCode() : 0)) * 37;
        StatusResult statusResult5 = this.attempted_cash_out_status_result;
        int hashCode7 = (hashCode6 + (statusResult5 != null ? statusResult5.hashCode() : 0)) * 37;
        StatusResult statusResult6 = this.offline_cash_out_status_result;
        int hashCode8 = (hashCode7 + (statusResult6 != null ? statusResult6.hashCode() : 0)) * 37;
        StatusResult statusResult7 = this.attempted_add_cash_status_result;
        int hashCode9 = (hashCode8 + (statusResult7 != null ? statusResult7.hashCode() : 0)) * 37;
        StatusResult statusResult8 = this.offline_add_cash_status_result;
        int hashCode10 = (hashCode9 + (statusResult8 != null ? statusResult8.hashCode() : 0)) * 37;
        ScenarioPlan scenarioPlan = this.offline_payment_scenario_plan;
        int hashCode11 = (hashCode10 + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        ScenarioPlan scenarioPlan2 = this.offline_bill_scenario_plan;
        int hashCode12 = (hashCode11 + (scenarioPlan2 != null ? scenarioPlan2.hashCode() : 0)) * 37;
        StatusResult statusResult9 = this.error_cash_out_status_result;
        int hashCode13 = (hashCode12 + (statusResult9 != null ? statusResult9.hashCode() : 0)) * 37;
        StatusResult statusResult10 = this.error_add_cash_status_result;
        int hashCode14 = (hashCode13 + (statusResult10 != null ? statusResult10.hashCode() : 0)) * 37;
        ScenarioPlan scenarioPlan3 = this.offline_transfer_scenario_plan;
        int hashCode15 = (hashCode14 + (scenarioPlan3 != null ? scenarioPlan3.hashCode() : 0)) * 37;
        ScenarioPlan scenarioPlan4 = this.error_transfer_scenario_plan;
        int hashCode16 = hashCode15 + (scenarioPlan4 != null ? scenarioPlan4.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(7);
        builder.deleted = this.enabled;
        builder.token = this.external_status_url;
        builder.shift_id = this.retry_intervals;
        builder.merchant_token = this.attempted_payment_status_result;
        builder.employee_token = this.offline_payment_status_result;
        builder.clockin_unit_token = this.attempted_bill_status_result;
        builder.clockout_unit_token = this.offline_bill_status_result;
        builder.note = this.attempted_cash_out_status_result;
        builder.employee = this.offline_cash_out_status_result;
        builder.was_automatically_clocked_out = this.attempted_add_cash_status_result;
        builder.clockin_timestamp_ms = this.offline_add_cash_status_result;
        builder.clockout_timestamp_ms = this.offline_payment_scenario_plan;
        builder.created_at_timestamp_ms = this.offline_bill_scenario_plan;
        builder.updated_at_timestamp_ms = this.error_cash_out_status_result;
        builder.hourly_wage = this.error_add_cash_status_result;
        builder.declared_tip = this.offline_transfer_scenario_plan;
        builder.employee_job_info = this.error_transfer_scenario_plan;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        String str = this.external_status_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_status_url=", arrayList);
        }
        List list = this.retry_intervals;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("retry_intervals=", arrayList, list);
        }
        StatusResult statusResult = this.attempted_payment_status_result;
        if (statusResult != null) {
            arrayList.add("attempted_payment_status_result=" + statusResult);
        }
        StatusResult statusResult2 = this.offline_payment_status_result;
        if (statusResult2 != null) {
            arrayList.add("offline_payment_status_result=" + statusResult2);
        }
        StatusResult statusResult3 = this.attempted_bill_status_result;
        if (statusResult3 != null) {
            arrayList.add("attempted_bill_status_result=" + statusResult3);
        }
        StatusResult statusResult4 = this.offline_bill_status_result;
        if (statusResult4 != null) {
            arrayList.add("offline_bill_status_result=" + statusResult4);
        }
        StatusResult statusResult5 = this.attempted_cash_out_status_result;
        if (statusResult5 != null) {
            arrayList.add("attempted_cash_out_status_result=" + statusResult5);
        }
        StatusResult statusResult6 = this.offline_cash_out_status_result;
        if (statusResult6 != null) {
            arrayList.add("offline_cash_out_status_result=" + statusResult6);
        }
        StatusResult statusResult7 = this.attempted_add_cash_status_result;
        if (statusResult7 != null) {
            arrayList.add("attempted_add_cash_status_result=" + statusResult7);
        }
        StatusResult statusResult8 = this.offline_add_cash_status_result;
        if (statusResult8 != null) {
            arrayList.add("offline_add_cash_status_result=" + statusResult8);
        }
        ScenarioPlan scenarioPlan = this.offline_payment_scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("offline_payment_scenario_plan=" + scenarioPlan);
        }
        ScenarioPlan scenarioPlan2 = this.offline_bill_scenario_plan;
        if (scenarioPlan2 != null) {
            arrayList.add("offline_bill_scenario_plan=" + scenarioPlan2);
        }
        StatusResult statusResult9 = this.error_cash_out_status_result;
        if (statusResult9 != null) {
            arrayList.add("error_cash_out_status_result=" + statusResult9);
        }
        StatusResult statusResult10 = this.error_add_cash_status_result;
        if (statusResult10 != null) {
            arrayList.add("error_add_cash_status_result=" + statusResult10);
        }
        ScenarioPlan scenarioPlan3 = this.offline_transfer_scenario_plan;
        if (scenarioPlan3 != null) {
            arrayList.add("offline_transfer_scenario_plan=" + scenarioPlan3);
        }
        ScenarioPlan scenarioPlan4 = this.error_transfer_scenario_plan;
        if (scenarioPlan4 != null) {
            arrayList.add("error_transfer_scenario_plan=" + scenarioPlan4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfflineConfig{", "}", 0, null, null, 56);
    }
}
