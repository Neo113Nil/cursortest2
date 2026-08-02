package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/pools/AdminSyncAuthzRelationshipPoliciesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdminSyncAuthzRelationshipPoliciesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AdminSyncAuthzRelationshipPoliciesResponse> CREATOR;
    public final String error_message;
    public final Status status;

    public enum Status implements WireEnum {
        STATUS_UNSPECIFIED(0),
        STATUS_SUCCESS(1),
        STATUS_FAILURE(2);

        public static final AdminSyncAuthzRelationshipPoliciesResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Status status = STATUS_UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new AdminSyncAuthzRelationshipPoliciesResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return STATUS_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AdminSyncAuthzRelationshipPoliciesResponse$Companion$ADAPTER$1 adminSyncAuthzRelationshipPoliciesResponse$Companion$ADAPTER$1 = new AdminSyncAuthzRelationshipPoliciesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdminSyncAuthzRelationshipPoliciesResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.AdminSyncAuthzRelationshipPoliciesResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = adminSyncAuthzRelationshipPoliciesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(adminSyncAuthzRelationshipPoliciesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminSyncAuthzRelationshipPoliciesResponse(Status status, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.error_message = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdminSyncAuthzRelationshipPoliciesResponse)) {
            return false;
        }
        AdminSyncAuthzRelationshipPoliciesResponse adminSyncAuthzRelationshipPoliciesResponse = (AdminSyncAuthzRelationshipPoliciesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), adminSyncAuthzRelationshipPoliciesResponse.unknownFields()) && this.status == adminSyncAuthzRelationshipPoliciesResponse.status && Intrinsics.areEqual(this.error_message, adminSyncAuthzRelationshipPoliciesResponse.error_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.error_message;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(16);
        builder.f1329type = this.status;
        builder.use_case = this.error_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        String str = this.error_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error_message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdminSyncAuthzRelationshipPoliciesResponse{", "}", 0, null, null, 56);
    }
}
