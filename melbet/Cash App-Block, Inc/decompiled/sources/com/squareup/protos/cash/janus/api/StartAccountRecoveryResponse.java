package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/janus/api/StartAccountRecoveryResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/Group$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartAccountRecoveryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartAccountRecoveryResponse> CREATOR;
    public final String client_scenario;
    public final ResponseContext response_context;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final StartAccountRecoveryResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new Origin.Companion();
            ADAPTER = new StartAccountRecoveryResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        StartAccountRecoveryResponse$Companion$ADAPTER$1 startAccountRecoveryResponse$Companion$ADAPTER$1 = new StartAccountRecoveryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartAccountRecoveryResponse.class), "type.googleapis.com/squareup.cash.janus.api.StartAccountRecoveryResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/StartAccountRecoveryProto.proto");
        ADAPTER = startAccountRecoveryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startAccountRecoveryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartAccountRecoveryResponse(ResponseContext responseContext, Status status, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.client_scenario = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartAccountRecoveryResponse)) {
            return false;
        }
        StartAccountRecoveryResponse startAccountRecoveryResponse = (StartAccountRecoveryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), startAccountRecoveryResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, startAccountRecoveryResponse.response_context) && this.status == startAccountRecoveryResponse.status && Intrinsics.areEqual(this.client_scenario, startAccountRecoveryResponse.client_scenario);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.client_scenario;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(9);
        builder.group_image = this.response_context;
        builder.participants = this.status;
        builder.name = this.client_scenario;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        String str = this.client_scenario;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_scenario=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartAccountRecoveryResponse{", "}", 0, null, null, 56);
    }
}
