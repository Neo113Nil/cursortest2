package com.squareup.protos.cash.syncentitygateway.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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
public final class SyncTopicEntitiesClientError extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncTopicEntitiesClientError> CREATOR;
    public final Integer error_code;
    public final String error_message;
    public final SyncTopicEntitiesClientRequest request;
    public final Integer retry_after_secs;

    static {
        SyncTopicEntitiesClientError$Companion$ADAPTER$1 syncTopicEntitiesClientError$Companion$ADAPTER$1 = new SyncTopicEntitiesClientError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncTopicEntitiesClientError.class), "type.googleapis.com/squareup.cash.syncentitygateway.api.v1.SyncTopicEntitiesClientError", Syntax.PROTO_2, null, "squareup/cash/syncentitygateway/api/v1/app.proto");
        ADAPTER = syncTopicEntitiesClientError$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncTopicEntitiesClientError$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncTopicEntitiesClientError(SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest, Integer num, String str, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request = syncTopicEntitiesClientRequest;
        this.error_code = num;
        this.error_message = str;
        this.retry_after_secs = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncTopicEntitiesClientError)) {
            return false;
        }
        SyncTopicEntitiesClientError syncTopicEntitiesClientError = (SyncTopicEntitiesClientError) obj;
        return Intrinsics.areEqual(unknownFields(), syncTopicEntitiesClientError.unknownFields()) && Intrinsics.areEqual(this.request, syncTopicEntitiesClientError.request) && Intrinsics.areEqual(this.error_code, syncTopicEntitiesClientError.error_code) && Intrinsics.areEqual(this.error_message, syncTopicEntitiesClientError.error_message) && Intrinsics.areEqual(this.retry_after_secs, syncTopicEntitiesClientError.retry_after_secs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = this.request;
        int hashCode2 = (hashCode + (syncTopicEntitiesClientRequest != null ? syncTopicEntitiesClientRequest.hashCode() : 0)) * 37;
        Integer num = this.error_code;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.error_message;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num2 = this.retry_after_secs;
        int hashCode5 = hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(24);
        builder.card_encryption_data = this.request;
        builder.device_metadata = this.error_code;
        builder.customer_token_hash_email = this.error_message;
        builder.success_screen = this.retry_after_secs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = this.request;
        if (syncTopicEntitiesClientRequest != null) {
            arrayList.add("request=" + syncTopicEntitiesClientRequest);
        }
        Integer num = this.error_code;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("error_code=", num, arrayList);
        }
        String str = this.error_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error_message=", arrayList);
        }
        Integer num2 = this.retry_after_secs;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("retry_after_secs=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncTopicEntitiesClientError{", "}", 0, null, null, 56);
    }
}
