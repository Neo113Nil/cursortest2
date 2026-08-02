package com.squareup.protos.timecards;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class EmployeeJobInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmployeeJobInfo> CREATOR;
    public final Money hourly_wage;
    public final Integer hours_worked_per_week;
    public final Boolean is_tip_eligible;
    public final String job_title;
    public final String job_token;

    static {
        EmployeeJobInfo$Companion$ADAPTER$1 employeeJobInfo$Companion$ADAPTER$1 = new EmployeeJobInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmployeeJobInfo.class), "type.googleapis.com/squareup.timecards.EmployeeJobInfo", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = employeeJobInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(employeeJobInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmployeeJobInfo(String str, String str2, Money money, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.job_token = str;
        this.job_title = str2;
        this.hourly_wage = money;
        this.is_tip_eligible = bool;
        this.hours_worked_per_week = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmployeeJobInfo)) {
            return false;
        }
        EmployeeJobInfo employeeJobInfo = (EmployeeJobInfo) obj;
        return Intrinsics.areEqual(unknownFields(), employeeJobInfo.unknownFields()) && Intrinsics.areEqual(this.job_token, employeeJobInfo.job_token) && Intrinsics.areEqual(this.job_title, employeeJobInfo.job_title) && Intrinsics.areEqual(this.hourly_wage, employeeJobInfo.hourly_wage) && Intrinsics.areEqual(this.is_tip_eligible, employeeJobInfo.is_tip_eligible) && Intrinsics.areEqual(this.hours_worked_per_week, employeeJobInfo.hours_worked_per_week);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.job_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.job_title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.hourly_wage;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Boolean bool = this.is_tip_eligible;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.hours_worked_per_week;
        int hashCode6 = hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(7);
        builder.key_path = this.job_token;
        builder.get_transform = this.job_title;
        builder.set_transform = this.hourly_wage;
        builder.validation = this.is_tip_eligible;
        builder.on_invalid = this.hours_worked_per_week;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.job_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "job_token=", arrayList);
        }
        if (this.job_title != null) {
            arrayList.add("job_title=██");
        }
        Money money = this.hourly_wage;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("hourly_wage=", money, arrayList);
        }
        Boolean bool = this.is_tip_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_tip_eligible=", bool, arrayList);
        }
        Integer num = this.hours_worked_per_week;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("hours_worked_per_week=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmployeeJobInfo{", "}", 0, null, null, 56);
    }
}
