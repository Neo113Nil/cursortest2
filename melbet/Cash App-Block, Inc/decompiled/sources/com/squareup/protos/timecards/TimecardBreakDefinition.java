package com.squareup.protos.timecards;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.lending.Loan;
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

/* loaded from: classes8.dex */
public final class TimecardBreakDefinition extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimecardBreakDefinition> CREATOR;
    public final String break_name;
    public final BreakRule break_rule;
    public final ConfigurationType configuration_type;
    public final String created_at;
    public final Boolean enabled;
    public final Integer expected_duration_seconds;
    public final Boolean is_mandatory;
    public final Boolean is_paid;
    public final String merchant_token;
    public final String token;
    public final String unit_token;
    public final String updated_at;
    public final Long updated_at_timestamp_ms;
    public final Long updated_at_timestamp_seconds;

    static {
        TimecardBreakDefinition$Companion$ADAPTER$1 timecardBreakDefinition$Companion$ADAPTER$1 = new TimecardBreakDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimecardBreakDefinition.class), "type.googleapis.com/squareup.timecards.TimecardBreakDefinition", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = timecardBreakDefinition$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardBreakDefinition$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimecardBreakDefinition(String str, String str2, String str3, String str4, Integer num, Boolean bool, Boolean bool2, Long l, Long l2, String str5, String str6, ConfigurationType configurationType, Boolean bool3, BreakRule breakRule, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.merchant_token = str2;
        this.unit_token = str3;
        this.break_name = str4;
        this.expected_duration_seconds = num;
        this.is_paid = bool;
        this.enabled = bool2;
        this.updated_at_timestamp_ms = l;
        this.updated_at_timestamp_seconds = l2;
        this.created_at = str5;
        this.updated_at = str6;
        this.configuration_type = configurationType;
        this.is_mandatory = bool3;
        this.break_rule = breakRule;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimecardBreakDefinition)) {
            return false;
        }
        TimecardBreakDefinition timecardBreakDefinition = (TimecardBreakDefinition) obj;
        return Intrinsics.areEqual(unknownFields(), timecardBreakDefinition.unknownFields()) && Intrinsics.areEqual(this.token, timecardBreakDefinition.token) && Intrinsics.areEqual(this.merchant_token, timecardBreakDefinition.merchant_token) && Intrinsics.areEqual(this.unit_token, timecardBreakDefinition.unit_token) && Intrinsics.areEqual(this.break_name, timecardBreakDefinition.break_name) && Intrinsics.areEqual(this.expected_duration_seconds, timecardBreakDefinition.expected_duration_seconds) && Intrinsics.areEqual(this.is_paid, timecardBreakDefinition.is_paid) && Intrinsics.areEqual(this.enabled, timecardBreakDefinition.enabled) && Intrinsics.areEqual(this.updated_at_timestamp_ms, timecardBreakDefinition.updated_at_timestamp_ms) && Intrinsics.areEqual(this.updated_at_timestamp_seconds, timecardBreakDefinition.updated_at_timestamp_seconds) && Intrinsics.areEqual(this.created_at, timecardBreakDefinition.created_at) && Intrinsics.areEqual(this.updated_at, timecardBreakDefinition.updated_at) && this.configuration_type == timecardBreakDefinition.configuration_type && Intrinsics.areEqual(this.is_mandatory, timecardBreakDefinition.is_mandatory) && Intrinsics.areEqual(this.break_rule, timecardBreakDefinition.break_rule);
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
        String str3 = this.unit_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.break_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num = this.expected_duration_seconds;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.is_paid;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.enabled;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Long l = this.updated_at_timestamp_ms;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at_timestamp_seconds;
        int hashCode10 = (hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str5 = this.created_at;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.updated_at;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
        ConfigurationType configurationType = this.configuration_type;
        int hashCode13 = (hashCode12 + (configurationType != null ? configurationType.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_mandatory;
        int hashCode14 = (hashCode13 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        BreakRule breakRule = this.break_rule;
        int hashCode15 = hashCode14 + (breakRule != null ? breakRule.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(13);
        builder.token = this.token;
        builder.credit_line_token = this.merchant_token;
        builder.principal_amount = this.unit_token;
        builder.setup_fee_amount = this.break_name;
        builder.setup_fee_bps = this.expected_duration_seconds;
        builder.outstanding_amount = this.is_paid;
        builder.late_fee_amount = this.enabled;
        builder.borrowed_at = this.updated_at_timestamp_ms;
        builder.due_at = this.updated_at_timestamp_seconds;
        builder.interest_amount = this.created_at;
        builder.detail_rows = this.updated_at;
        builder.state = this.configuration_type;
        builder.lending_product = this.is_mandatory;
        builder.bnpl_data = this.break_rule;
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
        String str3 = this.unit_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "unit_token=", arrayList);
        }
        String str4 = this.break_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "break_name=", arrayList);
        }
        Integer num = this.expected_duration_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("expected_duration_seconds=", num, arrayList);
        }
        Boolean bool = this.is_paid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_paid=", bool, arrayList);
        }
        Boolean bool2 = this.enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool2, arrayList);
        }
        Long l = this.updated_at_timestamp_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at_timestamp_ms=", l, arrayList);
        }
        Long l2 = this.updated_at_timestamp_seconds;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at_timestamp_seconds=", l2, arrayList);
        }
        String str5 = this.created_at;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "created_at=", arrayList);
        }
        String str6 = this.updated_at;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "updated_at=", arrayList);
        }
        ConfigurationType configurationType = this.configuration_type;
        if (configurationType != null) {
            arrayList.add("configuration_type=" + configurationType);
        }
        Boolean bool3 = this.is_mandatory;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_mandatory=", bool3, arrayList);
        }
        BreakRule breakRule = this.break_rule;
        if (breakRule != null) {
            arrayList.add("break_rule=" + breakRule);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimecardBreakDefinition{", "}", 0, null, null, 56);
    }
}
