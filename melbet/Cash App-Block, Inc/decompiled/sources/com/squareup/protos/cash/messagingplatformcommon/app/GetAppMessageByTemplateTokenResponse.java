package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessageByTemplateTokenResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAppMessageByTemplateTokenResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppMessageByTemplateTokenResponse> CREATOR;
    public final AppMessage message;

    static {
        GetAppMessageByTemplateTokenResponse$Companion$ADAPTER$1 getAppMessageByTemplateTokenResponse$Companion$ADAPTER$1 = new GetAppMessageByTemplateTokenResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAppMessageByTemplateTokenResponse.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.GetAppMessageByTemplateTokenResponse", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppServiceProto.proto");
        ADAPTER = getAppMessageByTemplateTokenResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAppMessageByTemplateTokenResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppMessageByTemplateTokenResponse(AppMessage appMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = appMessage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppMessageByTemplateTokenResponse)) {
            return false;
        }
        GetAppMessageByTemplateTokenResponse getAppMessageByTemplateTokenResponse = (GetAppMessageByTemplateTokenResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAppMessageByTemplateTokenResponse.unknownFields()) && Intrinsics.areEqual(this.message, getAppMessageByTemplateTokenResponse.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppMessage appMessage = this.message;
        int hashCode2 = hashCode + (appMessage != null ? appMessage.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(18);
        builder.local_buyer = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppMessage appMessage = this.message;
        if (appMessage != null) {
            arrayList.add("message=" + appMessage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppMessageByTemplateTokenResponse{", "}", 0, null, null, 56);
    }
}
