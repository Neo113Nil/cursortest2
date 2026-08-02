package com.squareup.protos.payroll.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class GetEmployeeAccessDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEmployeeAccessDetailsRequest> CREATOR;
    public final String team_member_id;

    static {
        GetEmployeeAccessDetailsRequest$Companion$ADAPTER$1 getEmployeeAccessDetailsRequest$Companion$ADAPTER$1 = new GetEmployeeAccessDetailsRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEmployeeAccessDetailsRequest.class), "type.googleapis.com/squareup.payroll.service.GetEmployeeAccessDetailsRequest", Syntax.PROTO_2, null, "squareup/payroll/service.proto");
        ADAPTER = getEmployeeAccessDetailsRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEmployeeAccessDetailsRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEmployeeAccessDetailsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.team_member_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEmployeeAccessDetailsRequest)) {
            return false;
        }
        GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest = (GetEmployeeAccessDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEmployeeAccessDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.team_member_id, getEmployeeAccessDetailsRequest.team_member_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.team_member_id.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(27);
        builder.client_route = this.team_member_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.team_member_id, "team_member_id=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEmployeeAccessDetailsRequest{", "}", 0, null, null, 56);
    }
}
