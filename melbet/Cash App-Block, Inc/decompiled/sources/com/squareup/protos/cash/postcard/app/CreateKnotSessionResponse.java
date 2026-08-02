package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/postcard/app/CreateKnotSessionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardScheme$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateKnotSessionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateKnotSessionResponse> CREATOR;
    public final String client_id;
    public final KnotSdkConfig sdk_config;
    public final String session_id;

    static {
        CreateKnotSessionResponse$Companion$ADAPTER$1 createKnotSessionResponse$Companion$ADAPTER$1 = new CreateKnotSessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateKnotSessionResponse.class), "type.googleapis.com/squareup.cash.postcard.app.CreateKnotSessionResponse", Syntax.PROTO_2, null, "squareup/cash/postcard/app/KnotApi.proto");
        ADAPTER = createKnotSessionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createKnotSessionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateKnotSessionResponse(String str, KnotSdkConfig knotSdkConfig, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session_id = str;
        this.sdk_config = knotSdkConfig;
        this.client_id = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateKnotSessionResponse)) {
            return false;
        }
        CreateKnotSessionResponse createKnotSessionResponse = (CreateKnotSessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createKnotSessionResponse.unknownFields()) && Intrinsics.areEqual(this.session_id, createKnotSessionResponse.session_id) && Intrinsics.areEqual(this.sdk_config, createKnotSessionResponse.sdk_config) && Intrinsics.areEqual(this.client_id, createKnotSessionResponse.client_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        KnotSdkConfig knotSdkConfig = this.sdk_config;
        int hashCode3 = (hashCode2 + (knotSdkConfig != null ? knotSdkConfig.hashCode() : 0)) * 37;
        String str2 = this.client_id;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(13);
        builder.modules = this.session_id;
        builder.overflow_modules = this.sdk_config;
        builder.card_home_actions = this.client_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        KnotSdkConfig knotSdkConfig = this.sdk_config;
        if (knotSdkConfig != null) {
            arrayList.add("sdk_config=" + knotSdkConfig);
        }
        String str2 = this.client_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateKnotSessionResponse{", "}", 0, null, null, 56);
    }
}
