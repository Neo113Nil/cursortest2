package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashmeoutside.app.v1.InitiateRemittanceResponse;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetFlowResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/GetFlowResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetFlowResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFlowResponse> CREATOR;
    public final ClientScenario client_scenario;
    public final ResponseContext response_context;
    public final String token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ClientScenario client_scenario;
        public ResponseContext response_context;
        public String token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetFlowResponse(this.client_scenario, this.response_context, this.token, buildUnknownFields());
                default:
                    return new InitiateRemittanceResponse(this.client_scenario, this.response_context, this.token, buildUnknownFields());
            }
        }
    }

    static {
        GetFlowResponse$Companion$ADAPTER$1 getFlowResponse$Companion$ADAPTER$1 = new GetFlowResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFlowResponse.class), "type.googleapis.com/squareup.franklin.app.GetFlowResponse", Syntax.PROTO_2, null, "squareup/franklin/app/flow.proto");
        ADAPTER = getFlowResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFlowResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFlowResponse(ClientScenario clientScenario, ResponseContext responseContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.client_scenario = clientScenario;
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFlowResponse)) {
            return false;
        }
        GetFlowResponse getFlowResponse = (GetFlowResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFlowResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getFlowResponse.response_context) && this.client_scenario == getFlowResponse.client_scenario && Intrinsics.areEqual(this.token, getFlowResponse.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode3 = (hashCode2 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        String str = this.token;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.response_context = this.response_context;
        builder.client_scenario = this.client_scenario;
        builder.token = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFlowResponse{", "}", 0, null, null, 56);
    }
}
