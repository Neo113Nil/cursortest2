package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse$Builder;", "", "presigned_url", "Ljava/lang/String;", "", "expires_in_milliseconds", "Ljava/lang/Long;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPresignedUrlResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPresignedUrlResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long expires_in_milliseconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String presigned_url;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse;", "<init>", "()V", "presigned_url", "", "expires_in_milliseconds", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long expires_in_milliseconds;
        public String presigned_url;

        @Override // com.squareup.wire.Message.Builder
        public GetPresignedUrlResponse build() {
            return new GetPresignedUrlResponse(this.presigned_url, this.expires_in_milliseconds, buildUnknownFields());
        }

        public final Builder expires_in_milliseconds(Long expires_in_milliseconds) {
            this.expires_in_milliseconds = expires_in_milliseconds;
            return this;
        }

        public final Builder presigned_url(String presigned_url) {
            this.presigned_url = presigned_url;
            return this;
        }
    }

    static {
        GetPresignedUrlResponse$Companion$ADAPTER$1 getPresignedUrlResponse$Companion$ADAPTER$1 = new GetPresignedUrlResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPresignedUrlResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetPresignedUrlResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/utility_messages.proto");
        ADAPTER = getPresignedUrlResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPresignedUrlResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPresignedUrlResponse(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.presigned_url = str;
        this.expires_in_milliseconds = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPresignedUrlResponse)) {
            return false;
        }
        GetPresignedUrlResponse getPresignedUrlResponse = (GetPresignedUrlResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPresignedUrlResponse.unknownFields()) && Intrinsics.areEqual(this.presigned_url, getPresignedUrlResponse.presigned_url) && Intrinsics.areEqual(this.expires_in_milliseconds, getPresignedUrlResponse.expires_in_milliseconds);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.presigned_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.expires_in_milliseconds;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.presigned_url = this.presigned_url;
        builder.expires_in_milliseconds = this.expires_in_milliseconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.presigned_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "presigned_url=", arrayList);
        }
        Long l = this.expires_in_milliseconds;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_in_milliseconds=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPresignedUrlResponse{", "}", 0, null, null, 56);
    }
}
