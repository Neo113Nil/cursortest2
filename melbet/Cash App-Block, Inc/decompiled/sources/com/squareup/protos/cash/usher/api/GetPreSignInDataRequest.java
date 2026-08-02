package com.squareup.protos.cash.usher.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
import com.squareup.protos.franklin.app.ClaimData;
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

/* loaded from: classes.dex */
public final class GetPreSignInDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPreSignInDataRequest> CREATOR;
    public final ClientDeepLinkContext client_deep_link_context;

    public final class ClientDeepLinkContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientDeepLinkContext> CREATOR;
        public final String deep_link;
        public final String payload;

        static {
            GetPreSignInDataRequest$ClientDeepLinkContext$Companion$ADAPTER$1 getPreSignInDataRequest$ClientDeepLinkContext$Companion$ADAPTER$1 = new GetPreSignInDataRequest$ClientDeepLinkContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientDeepLinkContext.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataRequest.ClientDeepLinkContext", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
            ADAPTER = getPreSignInDataRequest$ClientDeepLinkContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataRequest$ClientDeepLinkContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientDeepLinkContext(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.deep_link = str;
            this.payload = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientDeepLinkContext)) {
                return false;
            }
            ClientDeepLinkContext clientDeepLinkContext = (ClientDeepLinkContext) obj;
            return Intrinsics.areEqual(unknownFields(), clientDeepLinkContext.unknownFields()) && Intrinsics.areEqual(this.deep_link, clientDeepLinkContext.deep_link) && Intrinsics.areEqual(this.payload, clientDeepLinkContext.payload);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.deep_link;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.payload;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(18);
            builder.name = this.deep_link;
            builder.value = this.payload;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.deep_link;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "deep_link=", arrayList);
            }
            String str2 = this.payload;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payload=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientDeepLinkContext{", "}", 0, null, null, 56);
        }
    }

    static {
        GetPreSignInDataRequest$Companion$ADAPTER$1 getPreSignInDataRequest$Companion$ADAPTER$1 = new GetPreSignInDataRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPreSignInDataRequest.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataRequest", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
        ADAPTER = getPreSignInDataRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPreSignInDataRequest(ClientDeepLinkContext clientDeepLinkContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_deep_link_context = clientDeepLinkContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPreSignInDataRequest)) {
            return false;
        }
        GetPreSignInDataRequest getPreSignInDataRequest = (GetPreSignInDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPreSignInDataRequest.unknownFields()) && Intrinsics.areEqual(this.client_deep_link_context, getPreSignInDataRequest.client_deep_link_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientDeepLinkContext clientDeepLinkContext = this.client_deep_link_context;
        int hashCode2 = hashCode + (clientDeepLinkContext != null ? clientDeepLinkContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(6);
        builder.claimable_payment = this.client_deep_link_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientDeepLinkContext clientDeepLinkContext = this.client_deep_link_context;
        if (clientDeepLinkContext != null) {
            arrayList.add("client_deep_link_context=" + clientDeepLinkContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPreSignInDataRequest{", "}", 0, null, null, 56);
    }
}
