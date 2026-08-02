package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.paychecks.Deduction;

/* loaded from: classes8.dex */
public final class EmployeeRole extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmployeeRole> CREATOR;
    public final String employee_role_token;
    public final Boolean is_account_owner_role;
    public final Boolean is_owner_role;
    public final String name;

    static {
        EmployeeRole$Companion$ADAPTER$1 employeeRole$Companion$ADAPTER$1 = new EmployeeRole$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmployeeRole.class), "type.googleapis.com/squareup.timecards.EmployeeRole", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = employeeRole$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(employeeRole$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmployeeRole(String str, String str2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.employee_role_token = str;
        this.name = str2;
        this.is_account_owner_role = bool;
        this.is_owner_role = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmployeeRole)) {
            return false;
        }
        EmployeeRole employeeRole = (EmployeeRole) obj;
        return Intrinsics.areEqual(unknownFields(), employeeRole.unknownFields()) && Intrinsics.areEqual(this.employee_role_token, employeeRole.employee_role_token) && Intrinsics.areEqual(this.name, employeeRole.name) && Intrinsics.areEqual(this.is_account_owner_role, employeeRole.is_account_owner_role) && Intrinsics.areEqual(this.is_owner_role, employeeRole.is_owner_role);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.employee_role_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.is_account_owner_role;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_owner_role;
        int hashCode5 = hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(1);
        builder.amount = this.employee_role_token;
        builder.description = this.name;
        builder.note = this.is_account_owner_role;
        builder.tint_color = this.is_owner_role;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.employee_role_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "employee_role_token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        Boolean bool = this.is_account_owner_role;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_account_owner_role=", bool, arrayList);
        }
        Boolean bool2 = this.is_owner_role;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_owner_role=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmployeeRole{", "}", 0, null, null, 56);
    }
}
