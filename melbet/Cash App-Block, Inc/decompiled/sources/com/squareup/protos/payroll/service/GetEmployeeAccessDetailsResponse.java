package com.squareup.protos.payroll.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/payroll/service/GetEmployeeAccessDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiPublicProfile$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetEmployeeAccessDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEmployeeAccessDetailsResponse> CREATOR;
    public final Boolean can_access_benefits;
    public final Boolean can_use_direct_deposit;
    public final Boolean can_use_on_demand_pay;
    public final String merchant_token;
    public final Boolean requires_onboarding;
    public final String team_member_id;

    static {
        GetEmployeeAccessDetailsResponse$Companion$ADAPTER$1 getEmployeeAccessDetailsResponse$Companion$ADAPTER$1 = new GetEmployeeAccessDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEmployeeAccessDetailsResponse.class), "type.googleapis.com/squareup.payroll.service.GetEmployeeAccessDetailsResponse", Syntax.PROTO_2, null, "squareup/payroll/service.proto");
        ADAPTER = getEmployeeAccessDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEmployeeAccessDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEmployeeAccessDetailsResponse(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.team_member_id = str;
        this.merchant_token = str2;
        this.can_access_benefits = bool;
        this.can_use_direct_deposit = bool2;
        this.can_use_on_demand_pay = bool3;
        this.requires_onboarding = bool4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEmployeeAccessDetailsResponse)) {
            return false;
        }
        GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse = (GetEmployeeAccessDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getEmployeeAccessDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.team_member_id, getEmployeeAccessDetailsResponse.team_member_id) && Intrinsics.areEqual(this.merchant_token, getEmployeeAccessDetailsResponse.merchant_token) && Intrinsics.areEqual(this.can_access_benefits, getEmployeeAccessDetailsResponse.can_access_benefits) && Intrinsics.areEqual(this.can_use_direct_deposit, getEmployeeAccessDetailsResponse.can_use_direct_deposit) && Intrinsics.areEqual(this.can_use_on_demand_pay, getEmployeeAccessDetailsResponse.can_use_on_demand_pay) && Intrinsics.areEqual(this.requires_onboarding, getEmployeeAccessDetailsResponse.requires_onboarding);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.team_member_id);
        String str = this.merchant_token;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.can_access_benefits;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.can_use_direct_deposit;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.can_use_on_demand_pay;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.requires_onboarding;
        int hashCode5 = hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(25, false);
        builder.full_name = this.team_member_id;
        builder.photo_url = this.merchant_token;
        builder.cashtag_url_enabled = this.can_access_benefits;
        builder.is_verified_account = this.can_use_direct_deposit;
        builder.synopsis = this.can_use_on_demand_pay;
        builder.full_cashtag = this.requires_onboarding;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.team_member_id, "team_member_id=", arrayList);
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        Boolean bool = this.can_access_benefits;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_access_benefits=", bool, arrayList);
        }
        Boolean bool2 = this.can_use_direct_deposit;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_use_direct_deposit=", bool2, arrayList);
        }
        Boolean bool3 = this.can_use_on_demand_pay;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_use_on_demand_pay=", bool3, arrayList);
        }
        Boolean bool4 = this.requires_onboarding;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_onboarding=", bool4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEmployeeAccessDetailsResponse{", "}", 0, null, null, 56);
    }
}
