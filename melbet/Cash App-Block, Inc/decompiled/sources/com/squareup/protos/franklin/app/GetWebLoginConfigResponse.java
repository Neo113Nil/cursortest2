package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.common.WebLoginConfig;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetWebLoginConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/ClaimData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetWebLoginConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetWebLoginConfigResponse> CREATOR;
    public final WebLoginConfig web_login_config;

    static {
        GetWebLoginConfigResponse$Companion$ADAPTER$1 getWebLoginConfigResponse$Companion$ADAPTER$1 = new GetWebLoginConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetWebLoginConfigResponse.class), "type.googleapis.com/squareup.franklin.app.GetWebLoginConfigResponse", Syntax.PROTO_2, null, "squareup/franklin/app/web_login_config.proto");
        ADAPTER = getWebLoginConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getWebLoginConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWebLoginConfigResponse(WebLoginConfig webLoginConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.web_login_config = webLoginConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetWebLoginConfigResponse)) {
            return false;
        }
        GetWebLoginConfigResponse getWebLoginConfigResponse = (GetWebLoginConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getWebLoginConfigResponse.unknownFields()) && Intrinsics.areEqual(this.web_login_config, getWebLoginConfigResponse.web_login_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        WebLoginConfig webLoginConfig = this.web_login_config;
        int hashCode2 = hashCode + (webLoginConfig != null ? webLoginConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(14);
        builder.claimable_payment = this.web_login_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        WebLoginConfig webLoginConfig = this.web_login_config;
        if (webLoginConfig != null) {
            arrayList.add("web_login_config=" + webLoginConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetWebLoginConfigResponse{", "}", 0, null, null, 56);
    }
}
