package com.squareup.protos.payroll.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.savings.GoalFolder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/payroll/service/GetEmployeePayrollOverviewResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/savings/GoalFolder$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetEmployeePayrollOverviewResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEmployeePayrollOverviewResponse> CREATOR;
    public final Money earnings_ytd;
    public final Money last_pay_amount;
    public final YearMonthDay last_pay_date;
    public final String last_stub_detail_url;
    public final YearMonthDay next_pay_date;
    public final String next_stub_detail_url;
    public final List rows;
    public final String stubs_list_url;

    static {
        GetEmployeePayrollOverviewResponse$Companion$ADAPTER$1 getEmployeePayrollOverviewResponse$Companion$ADAPTER$1 = new GetEmployeePayrollOverviewResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEmployeePayrollOverviewResponse.class), "type.googleapis.com/squareup.payroll.service.GetEmployeePayrollOverviewResponse", Syntax.PROTO_2, null, "squareup/payroll/service.proto");
        ADAPTER = getEmployeePayrollOverviewResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEmployeePayrollOverviewResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEmployeePayrollOverviewResponse(List list, Money money, Money money2, YearMonthDay yearMonthDay, YearMonthDay yearMonthDay2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.earnings_ytd = money;
        this.last_pay_amount = money2;
        this.last_pay_date = yearMonthDay;
        this.next_pay_date = yearMonthDay2;
        this.stubs_list_url = str;
        this.last_stub_detail_url = str2;
        this.next_stub_detail_url = str3;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEmployeePayrollOverviewResponse)) {
            return false;
        }
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getEmployeePayrollOverviewResponse.unknownFields()) && Intrinsics.areEqual(this.rows, getEmployeePayrollOverviewResponse.rows) && Intrinsics.areEqual(this.earnings_ytd, getEmployeePayrollOverviewResponse.earnings_ytd) && Intrinsics.areEqual(this.last_pay_amount, getEmployeePayrollOverviewResponse.last_pay_amount) && Intrinsics.areEqual(this.last_pay_date, getEmployeePayrollOverviewResponse.last_pay_date) && Intrinsics.areEqual(this.next_pay_date, getEmployeePayrollOverviewResponse.next_pay_date) && Intrinsics.areEqual(this.stubs_list_url, getEmployeePayrollOverviewResponse.stubs_list_url) && Intrinsics.areEqual(this.last_stub_detail_url, getEmployeePayrollOverviewResponse.last_stub_detail_url) && Intrinsics.areEqual(this.next_stub_detail_url, getEmployeePayrollOverviewResponse.next_stub_detail_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.rows);
        Money money = this.earnings_ytd;
        int hashCode = (m + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.last_pay_amount;
        int hashCode2 = (hashCode + (money2 != null ? money2.hashCode() : 0)) * 37;
        YearMonthDay yearMonthDay = this.last_pay_date;
        int hashCode3 = (hashCode2 + (yearMonthDay != null ? yearMonthDay.hashCode() : 0)) * 37;
        YearMonthDay yearMonthDay2 = this.next_pay_date;
        int hashCode4 = (hashCode3 + (yearMonthDay2 != null ? yearMonthDay2.hashCode() : 0)) * 37;
        String str = this.stubs_list_url;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_stub_detail_url;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.next_stub_detail_url;
        int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(9);
        builder.label = this.rows;
        builder.goal_amount = this.earnings_ytd;
        builder.goal_flow_parameters = this.last_pay_amount;
        builder.met_goal = this.last_pay_date;
        builder.goal_progress_percentage = this.next_pay_date;
        builder.token = this.stubs_list_url;
        builder.icon_unicode = this.last_stub_detail_url;
        builder.completion_token = this.next_stub_detail_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        Money money = this.earnings_ytd;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("earnings_ytd=", money, arrayList);
        }
        Money money2 = this.last_pay_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("last_pay_amount=", money2, arrayList);
        }
        YearMonthDay yearMonthDay = this.last_pay_date;
        if (yearMonthDay != null) {
            arrayList.add("last_pay_date=" + yearMonthDay);
        }
        YearMonthDay yearMonthDay2 = this.next_pay_date;
        if (yearMonthDay2 != null) {
            arrayList.add("next_pay_date=" + yearMonthDay2);
        }
        String str = this.stubs_list_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "stubs_list_url=", arrayList);
        }
        String str2 = this.last_stub_detail_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "last_stub_detail_url=", arrayList);
        }
        String str3 = this.next_stub_detail_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "next_stub_detail_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEmployeePayrollOverviewResponse{", "}", 0, null, null, 56);
    }

    public GetEmployeePayrollOverviewResponse() {
        this(EmptyList.INSTANCE, null, null, null, null, null, null, null, ByteString.EMPTY);
    }
}
