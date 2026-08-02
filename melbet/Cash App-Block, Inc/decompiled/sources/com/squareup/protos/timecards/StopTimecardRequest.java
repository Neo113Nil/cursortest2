package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postbank.api.UpdateDirectDepositFormRequest;
import com.squareup.protos.common.Money;
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
public final class StopTimecardRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StopTimecardRequest> CREATOR;
    public final String clockout_unit_token;
    public final Money declared_tip;
    public final String fallback_time_zone;
    public final String initiating_employee_token;
    public final String merchant_token;
    public final Boolean should_also_end_breaks;
    public final String timecard_token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String clockout_unit_token;
        public Money declared_tip;
        public String fallback_time_zone;
        public String initiating_employee_token;
        public String merchant_token;
        public Boolean should_also_end_breaks;
        public String timecard_token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    String str = this.merchant_token;
                    String str2 = this.timecard_token;
                    return new StopTimecardRequest(this.declared_tip, this.should_also_end_breaks, str, str2, this.initiating_employee_token, this.clockout_unit_token, this.fallback_time_zone, buildUnknownFields());
                default:
                    String str3 = this.merchant_token;
                    String str4 = this.timecard_token;
                    String str5 = this.initiating_employee_token;
                    String str6 = this.clockout_unit_token;
                    String str7 = this.fallback_time_zone;
                    return new UpdateDirectDepositFormRequest(this.declared_tip, this.should_also_end_breaks, str3, str4, str5, str6, str7, buildUnknownFields());
            }
        }
    }

    static {
        StopTimecardRequest$Companion$ADAPTER$1 stopTimecardRequest$Companion$ADAPTER$1 = new StopTimecardRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StopTimecardRequest.class), "type.googleapis.com/squareup.timecards.StopTimecardRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = stopTimecardRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stopTimecardRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTimecardRequest(Money money, Boolean bool, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_token = str;
        this.timecard_token = str2;
        this.should_also_end_breaks = bool;
        this.initiating_employee_token = str3;
        this.clockout_unit_token = str4;
        this.fallback_time_zone = str5;
        this.declared_tip = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StopTimecardRequest)) {
            return false;
        }
        StopTimecardRequest stopTimecardRequest = (StopTimecardRequest) obj;
        return Intrinsics.areEqual(unknownFields(), stopTimecardRequest.unknownFields()) && Intrinsics.areEqual(this.merchant_token, stopTimecardRequest.merchant_token) && Intrinsics.areEqual(this.timecard_token, stopTimecardRequest.timecard_token) && Intrinsics.areEqual(this.should_also_end_breaks, stopTimecardRequest.should_also_end_breaks) && Intrinsics.areEqual(this.initiating_employee_token, stopTimecardRequest.initiating_employee_token) && Intrinsics.areEqual(this.clockout_unit_token, stopTimecardRequest.clockout_unit_token) && Intrinsics.areEqual(this.fallback_time_zone, stopTimecardRequest.fallback_time_zone) && Intrinsics.areEqual(this.declared_tip, stopTimecardRequest.declared_tip);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.timecard_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.should_also_end_breaks;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.initiating_employee_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.clockout_unit_token;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.fallback_time_zone;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money = this.declared_tip;
        int hashCode8 = hashCode7 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.merchant_token = this.merchant_token;
        builder.timecard_token = this.timecard_token;
        builder.should_also_end_breaks = this.should_also_end_breaks;
        builder.initiating_employee_token = this.initiating_employee_token;
        builder.clockout_unit_token = this.clockout_unit_token;
        builder.fallback_time_zone = this.fallback_time_zone;
        builder.declared_tip = this.declared_tip;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.timecard_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "timecard_token=", arrayList);
        }
        Boolean bool = this.should_also_end_breaks;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_also_end_breaks=", bool, arrayList);
        }
        String str3 = this.initiating_employee_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "initiating_employee_token=", arrayList);
        }
        String str4 = this.clockout_unit_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "clockout_unit_token=", arrayList);
        }
        String str5 = this.fallback_time_zone;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "fallback_time_zone=", arrayList);
        }
        Money money = this.declared_tip;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("declared_tip=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StopTimecardRequest{", "}", 0, null, null, 56);
    }
}
