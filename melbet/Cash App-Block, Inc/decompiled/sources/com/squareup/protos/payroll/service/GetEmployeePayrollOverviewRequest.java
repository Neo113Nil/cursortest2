package com.squareup.protos.payroll.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEmployeePayrollOverviewRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEmployeePayrollOverviewRequest> CREATOR;
    public final APIVersion api_version;
    public final String team_member_id;

    public enum APIVersion implements WireEnum {
        V1(1),
        V2(2);

        public final int value;
        public static final y0 Companion = new y0();
        public static final GetEmployeePayrollOverviewRequest$APIVersion$Companion$ADAPTER$1 ADAPTER = new GetEmployeePayrollOverviewRequest$APIVersion$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(APIVersion.class), Syntax.PROTO_2, null);

        APIVersion(int i) {
            this.value = i;
        }

        public static final APIVersion fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return V1;
            }
            if (i != 2) {
                return null;
            }
            return V2;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        y0 y0Var = APIVersion.Companion;
        GetEmployeePayrollOverviewRequest$Companion$ADAPTER$1 getEmployeePayrollOverviewRequest$Companion$ADAPTER$1 = new GetEmployeePayrollOverviewRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEmployeePayrollOverviewRequest.class), "type.googleapis.com/squareup.payroll.service.GetEmployeePayrollOverviewRequest", Syntax.PROTO_2, null, "squareup/payroll/service.proto");
        ADAPTER = getEmployeePayrollOverviewRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEmployeePayrollOverviewRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEmployeePayrollOverviewRequest(String str, APIVersion aPIVersion, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.team_member_id = str;
        this.api_version = aPIVersion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEmployeePayrollOverviewRequest)) {
            return false;
        }
        GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest = (GetEmployeePayrollOverviewRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEmployeePayrollOverviewRequest.unknownFields()) && Intrinsics.areEqual(this.team_member_id, getEmployeePayrollOverviewRequest.team_member_id) && this.api_version == getEmployeePayrollOverviewRequest.api_version;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.team_member_id);
        APIVersion aPIVersion = this.api_version;
        int hashCode = m + (aPIVersion != null ? aPIVersion.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(20);
        builder.f1411android = this.team_member_id;
        builder.ios = this.api_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.team_member_id, "team_member_id=", arrayList);
        APIVersion aPIVersion = this.api_version;
        if (aPIVersion != null) {
            arrayList.add("api_version=" + aPIVersion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEmployeePayrollOverviewRequest{", "}", 0, null, null, 56);
    }
}
