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
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class Employee extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Employee> CREATOR;
    public final String employee_number;
    public final EmployeeRole employee_role;
    public final String employee_token;
    public final String first_name;
    public final String last_name;

    static {
        Employee$Companion$ADAPTER$1 employee$Companion$ADAPTER$1 = new Employee$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Employee.class), "type.googleapis.com/squareup.timecards.Employee", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = employee$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(employee$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Employee(String str, String str2, String str3, EmployeeRole employeeRole, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.employee_token = str;
        this.first_name = str2;
        this.last_name = str3;
        this.employee_role = employeeRole;
        this.employee_number = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Intrinsics.areEqual(unknownFields(), employee.unknownFields()) && Intrinsics.areEqual(this.employee_token, employee.employee_token) && Intrinsics.areEqual(this.first_name, employee.first_name) && Intrinsics.areEqual(this.last_name, employee.last_name) && Intrinsics.areEqual(this.employee_role, employee.employee_role) && Intrinsics.areEqual(this.employee_number, employee.employee_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.employee_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.first_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.last_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EmployeeRole employeeRole = this.employee_role;
        int hashCode5 = (hashCode4 + (employeeRole != null ? employeeRole.hashCode() : 0)) * 37;
        String str4 = this.employee_number;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(6);
        builder.key_path = this.employee_token;
        builder.get_transform = this.first_name;
        builder.set_transform = this.last_name;
        builder.validation = this.employee_role;
        builder.on_invalid = this.employee_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.employee_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "employee_token=", arrayList);
        }
        if (this.first_name != null) {
            arrayList.add("first_name=██");
        }
        if (this.last_name != null) {
            arrayList.add("last_name=██");
        }
        EmployeeRole employeeRole = this.employee_role;
        if (employeeRole != null) {
            arrayList.add("employee_role=" + employeeRole);
        }
        String str2 = this.employee_number;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "employee_number=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Employee{", "}", 0, null, null, 56);
    }
}
