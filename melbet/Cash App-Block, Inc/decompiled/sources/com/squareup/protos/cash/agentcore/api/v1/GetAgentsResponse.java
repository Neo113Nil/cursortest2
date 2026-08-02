package com.squareup.protos.cash.agentcore.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/agentcore/api/v1/GetAgentsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/appthemes/Gradient$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAgentsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAgentsResponse> CREATOR;
    public final List agents;

    static {
        GetAgentsResponse$Companion$ADAPTER$1 getAgentsResponse$Companion$ADAPTER$1 = new GetAgentsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAgentsResponse.class), "type.googleapis.com/squareup.cash.agentcore.api.v1beta1.GetAgentsResponse", Syntax.PROTO_2, null, "squareup/cash/agentcore/api/v1beta1/agents_messages.proto");
        ADAPTER = getAgentsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAgentsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAgentsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.agents = TransactorKt.immutableCopyOf("agents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAgentsResponse)) {
            return false;
        }
        GetAgentsResponse getAgentsResponse = (GetAgentsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAgentsResponse.unknownFields()) && Intrinsics.areEqual(this.agents, getAgentsResponse.agents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.agents.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(19, false);
        builder.colors = this.agents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.agents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("agents=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAgentsResponse{", "}", 0, null, null, 56);
    }
}
